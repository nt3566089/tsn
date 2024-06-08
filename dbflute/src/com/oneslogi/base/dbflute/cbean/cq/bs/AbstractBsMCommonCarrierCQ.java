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
 * The abstract condition-query of M_COMMON_CARRIER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCommonCarrierCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCommonCarrierCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_COMMON_CARRIER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_Equal(Long commonCarrierId) {
        doSetCommonCarrierId_Equal(commonCarrierId);
    }

    protected void doSetCommonCarrierId_Equal(Long commonCarrierId) {
        regCommonCarrierId(CK_EQ, commonCarrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotEqual(Long commonCarrierId) {
        doSetCommonCarrierId_NotEqual(commonCarrierId);
    }

    protected void doSetCommonCarrierId_NotEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_NES, commonCarrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterThan(Long commonCarrierId) {
        regCommonCarrierId(CK_GT, commonCarrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessThan(Long commonCarrierId) {
        regCommonCarrierId(CK_LT, commonCarrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_GreaterEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_GE, commonCarrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierId The value of commonCarrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCommonCarrierId_LessEqual(Long commonCarrierId) {
        regCommonCarrierId(CK_LE, commonCarrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of commonCarrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCommonCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierIdList The collection of commonCarrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_InScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_InScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_INS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param commonCarrierIdList The collection of commonCarrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        doSetCommonCarrierId_NotInScope(commonCarrierIdList);
    }

    protected void doSetCommonCarrierId_NotInScope(Collection<Long> commonCarrierIdList) {
        regINS(CK_NINS, cTL(commonCarrierIdList), xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COMMON_CARRIER_ID from M_CARRIER where ...)} <br>
     * M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierList for 'exists'. (NotNull)
     */
    public void existsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommonCarrierId_ExistsReferrer_MCarrierList(cb.query());
        registerExistsReferrer(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierList");
    }
    public abstract String keepCommonCarrierId_ExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select COMMON_CARRIER_ID from M_CARRIER_ZIP where ...)} <br>
     * M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierZipList</span>(zipCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     zipCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierZipList for 'exists'. (NotNull)
     */
    public void existsMCarrierZipList(SubQuery<MCarrierZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommonCarrierId_ExistsReferrer_MCarrierZipList(cb.query());
        registerExistsReferrer(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierZipList");
    }
    public abstract String keepCommonCarrierId_ExistsReferrer_MCarrierZipList(MCarrierZipCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COMMON_CARRIER_ID from M_CARRIER where ...)} <br>
     * M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierList</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CommonCarrierId_NotExistsReferrer_MCarrierList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierList(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommonCarrierId_NotExistsReferrer_MCarrierList(cb.query());
        registerNotExistsReferrer(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierList");
    }
    public abstract String keepCommonCarrierId_NotExistsReferrer_MCarrierList(MCarrierCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select COMMON_CARRIER_ID from M_CARRIER_ZIP where ...)} <br>
     * M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierZipList</span>(zipCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     zipCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CommonCarrierId_NotExistsReferrer_MCarrierZipList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierZipList(SubQuery<MCarrierZipCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCommonCarrierId_NotExistsReferrer_MCarrierZipList(cb.query());
        registerNotExistsReferrer(cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierZipList");
    }
    public abstract String keepCommonCarrierId_NotExistsReferrer_MCarrierZipList(MCarrierZipCQ sq);

    public void xsderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierList", al, op);
    }
    public abstract String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierList(MCarrierCQ sq);

    public void xsderiveMCarrierZipList(String fn, SubQuery<MCarrierZipCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierZipList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", pp, "mCarrierZipList", al, op);
    }
    public abstract String keepCommonCarrierId_SpecifyDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER where ...)} <br>
     * M_CARRIER by COMMON_CARRIER_ID, named 'MCarrierAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierList()</span>.<span style="color: #CC4747">max</span>(carrierCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     carrierCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     carrierCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierCB> derivedMCarrierList() {
        return xcreateQDRFunctionMCarrierList();
    }
    protected HpQDRFunction<MCarrierCB> xcreateQDRFunctionMCarrierList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierList(String fn, SubQuery<MCarrierCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCommonCarrierId_QueryDerivedReferrer_MCarrierList(cb.query()); String prpp = keepCommonCarrierId_QueryDerivedReferrer_MCarrierListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", sqpp, "mCarrierList", rd, vl, prpp, op);
    }
    public abstract String keepCommonCarrierId_QueryDerivedReferrer_MCarrierList(MCarrierCQ sq);
    public abstract String keepCommonCarrierId_QueryDerivedReferrer_MCarrierListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CARRIER_ZIP where ...)} <br>
     * M_CARRIER_ZIP by COMMON_CARRIER_ID, named 'MCarrierZipAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierZipList()</span>.<span style="color: #CC4747">max</span>(zipCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     zipCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     zipCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierZipCB> derivedMCarrierZipList() {
        return xcreateQDRFunctionMCarrierZipList();
    }
    protected HpQDRFunction<MCarrierZipCB> xcreateQDRFunctionMCarrierZipList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierZipList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierZipList(String fn, SubQuery<MCarrierZipCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierZipCB cb = new MCarrierZipCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipList(cb.query()); String prpp = keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "COMMON_CARRIER_ID", "COMMON_CARRIER_ID", sqpp, "mCarrierZipList", rd, vl, prpp, op);
    }
    public abstract String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipList(MCarrierZipCQ sq);
    public abstract String keepCommonCarrierId_QueryDerivedReferrer_MCarrierZipListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCommonCarrierId_IsNull() { regCommonCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMMON_CARRIER_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCommonCarrierId_IsNotNull() { regCommonCarrierId(CK_ISNN, DOBJ); }

    protected void regCommonCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCommonCarrierId(), "COMMON_CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCommonCarrierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_Equal(String carrierCd) {
        doSetCarrierCd_Equal(fRES(carrierCd));
    }

    protected void doSetCarrierCd_Equal(String carrierCd) {
        regCarrierCd(CK_EQ, carrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotEqual(String carrierCd) {
        doSetCarrierCd_NotEqual(fRES(carrierCd));
    }

    protected void doSetCarrierCd_NotEqual(String carrierCd) {
        regCarrierCd(CK_NES, carrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCdList The collection of carrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_InScope(Collection<String> carrierCdList) {
        doSetCarrierCd_InScope(carrierCdList);
    }

    protected void doSetCarrierCd_InScope(Collection<String> carrierCdList) {
        regINS(CK_INS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCdList The collection of carrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotInScope(Collection<String> carrierCdList) {
        doSetCarrierCd_NotInScope(carrierCdList);
    }

    protected void doSetCarrierCd_NotInScope(Collection<String> carrierCdList) {
        regINS(CK_NINS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd The value of carrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd_LikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {IX, NotNull, varchar(30)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_Equal(String carrierNm) {
        doSetCarrierNm_Equal(fRES(carrierNm));
    }

    protected void doSetCarrierNm_Equal(String carrierNm) {
        regCarrierNm(CK_EQ, carrierNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotEqual(String carrierNm) {
        doSetCarrierNm_NotEqual(fRES(carrierNm));
    }

    protected void doSetCarrierNm_NotEqual(String carrierNm) {
        regCarrierNm(CK_NES, carrierNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterThan(String carrierNm) {
        regCarrierNm(CK_GT, fRES(carrierNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessThan(String carrierNm) {
        regCarrierNm(CK_LT, fRES(carrierNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterEqual(String carrierNm) {
        regCarrierNm(CK_GE, fRES(carrierNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessEqual(String carrierNm) {
        regCarrierNm(CK_LE, fRES(carrierNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNmList The collection of carrierNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_InScope(Collection<String> carrierNmList) {
        doSetCarrierNm_InScope(carrierNmList);
    }

    protected void doSetCarrierNm_InScope(Collection<String> carrierNmList) {
        regINS(CK_INS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNmList The collection of carrierNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotInScope(Collection<String> carrierNmList) {
        doSetCarrierNm_NotInScope(carrierNmList);
    }

    protected void doSetCarrierNm_NotInScope(Collection<String> carrierNmList) {
        regINS(CK_NINS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setCarrierNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierNm The value of carrierNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierNm_LikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNm_NotLikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {NotNull, varchar(60)}
     * @param carrierNm The value of carrierNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_PrefixSearch(String carrierNm) {
        setCarrierNm_LikeSearch(carrierNm, xcLSOPPre());
    }

    protected void regCarrierNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNm(), "CARRIER_NM"); }
    protected abstract ConditionValue xgetCValueCarrierNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_Equal(String carrierAbbr) {
        doSetCarrierAbbr_Equal(fRES(carrierAbbr));
    }

    protected void doSetCarrierAbbr_Equal(String carrierAbbr) {
        regCarrierAbbr(CK_EQ, carrierAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_NotEqual(String carrierAbbr) {
        doSetCarrierAbbr_NotEqual(fRES(carrierAbbr));
    }

    protected void doSetCarrierAbbr_NotEqual(String carrierAbbr) {
        regCarrierAbbr(CK_NES, carrierAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_GreaterThan(String carrierAbbr) {
        regCarrierAbbr(CK_GT, fRES(carrierAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_LessThan(String carrierAbbr) {
        regCarrierAbbr(CK_LT, fRES(carrierAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_GreaterEqual(String carrierAbbr) {
        regCarrierAbbr(CK_GE, fRES(carrierAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_LessEqual(String carrierAbbr) {
        regCarrierAbbr(CK_LE, fRES(carrierAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbrList The collection of carrierAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_InScope(Collection<String> carrierAbbrList) {
        doSetCarrierAbbr_InScope(carrierAbbrList);
    }

    protected void doSetCarrierAbbr_InScope(Collection<String> carrierAbbrList) {
        regINS(CK_INS, cTL(carrierAbbrList), xgetCValueCarrierAbbr(), "CARRIER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbrList The collection of carrierAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_NotInScope(Collection<String> carrierAbbrList) {
        doSetCarrierAbbr_NotInScope(carrierAbbrList);
    }

    protected void doSetCarrierAbbr_NotInScope(Collection<String> carrierAbbrList) {
        regINS(CK_NINS, cTL(carrierAbbrList), xgetCValueCarrierAbbr(), "CARRIER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {varchar(60)} <br>
     * <pre>e.g. setCarrierAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierAbbr The value of carrierAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierAbbr_LikeSearch(String carrierAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierAbbr), xgetCValueCarrierAbbr(), "CARRIER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierAbbr_NotLikeSearch(String carrierAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierAbbr), xgetCValueCarrierAbbr(), "CARRIER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     * @param carrierAbbr The value of carrierAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierAbbr_PrefixSearch(String carrierAbbr) {
        setCarrierAbbr_LikeSearch(carrierAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     */
    public void setCarrierAbbr_IsNull() { regCarrierAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     */
    public void setCarrierAbbr_IsNullOrEmpty() { regCarrierAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ABBR: {varchar(60)}
     */
    public void setCarrierAbbr_IsNotNull() { regCarrierAbbr(CK_ISNN, DOBJ); }

    protected void regCarrierAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierAbbr(), "CARRIER_ABBR"); }
    protected abstract ConditionValue xgetCValueCarrierAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_Equal(String arrivalStoreBarcode) {
        doSetArrivalStoreBarcode_Equal(fRES(arrivalStoreBarcode));
    }

    protected void doSetArrivalStoreBarcode_Equal(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_EQ, arrivalStoreBarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_NotEqual(String arrivalStoreBarcode) {
        doSetArrivalStoreBarcode_NotEqual(fRES(arrivalStoreBarcode));
    }

    protected void doSetArrivalStoreBarcode_NotEqual(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_NES, arrivalStoreBarcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_GreaterThan(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_GT, fRES(arrivalStoreBarcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_LessThan(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_LT, fRES(arrivalStoreBarcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_GreaterEqual(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_GE, fRES(arrivalStoreBarcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_LessEqual(String arrivalStoreBarcode) {
        regArrivalStoreBarcode(CK_LE, fRES(arrivalStoreBarcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcodeList The collection of arrivalStoreBarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_InScope(Collection<String> arrivalStoreBarcodeList) {
        doSetArrivalStoreBarcode_InScope(arrivalStoreBarcodeList);
    }

    protected void doSetArrivalStoreBarcode_InScope(Collection<String> arrivalStoreBarcodeList) {
        regINS(CK_INS, cTL(arrivalStoreBarcodeList), xgetCValueArrivalStoreBarcode(), "ARRIVAL_STORE_BARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcodeList The collection of arrivalStoreBarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_NotInScope(Collection<String> arrivalStoreBarcodeList) {
        doSetArrivalStoreBarcode_NotInScope(arrivalStoreBarcodeList);
    }

    protected void doSetArrivalStoreBarcode_NotInScope(Collection<String> arrivalStoreBarcodeList) {
        regINS(CK_NINS, cTL(arrivalStoreBarcodeList), xgetCValueArrivalStoreBarcode(), "ARRIVAL_STORE_BARCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)} <br>
     * <pre>e.g. setArrivalStoreBarcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalStoreBarcode_LikeSearch(String arrivalStoreBarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalStoreBarcode), xgetCValueArrivalStoreBarcode(), "ARRIVAL_STORE_BARCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalStoreBarcode_NotLikeSearch(String arrivalStoreBarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalStoreBarcode), xgetCValueArrivalStoreBarcode(), "ARRIVAL_STORE_BARCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     * @param arrivalStoreBarcode The value of arrivalStoreBarcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreBarcode_PrefixSearch(String arrivalStoreBarcode) {
        setArrivalStoreBarcode_LikeSearch(arrivalStoreBarcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     */
    public void setArrivalStoreBarcode_IsNull() { regArrivalStoreBarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     */
    public void setArrivalStoreBarcode_IsNullOrEmpty() { regArrivalStoreBarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_BARCODE: {varchar(30)}
     */
    public void setArrivalStoreBarcode_IsNotNull() { regArrivalStoreBarcode(CK_ISNN, DOBJ); }

    protected void regArrivalStoreBarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreBarcode(), "ARRIVAL_STORE_BARCODE"); }
    protected abstract ConditionValue xgetCValueArrivalStoreBarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_Equal(String arrivalStoreStartBit) {
        doSetArrivalStoreStartBit_Equal(fRES(arrivalStoreStartBit));
    }

    protected void doSetArrivalStoreStartBit_Equal(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_EQ, arrivalStoreStartBit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_NotEqual(String arrivalStoreStartBit) {
        doSetArrivalStoreStartBit_NotEqual(fRES(arrivalStoreStartBit));
    }

    protected void doSetArrivalStoreStartBit_NotEqual(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_NES, arrivalStoreStartBit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_GreaterThan(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_GT, fRES(arrivalStoreStartBit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_LessThan(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_LT, fRES(arrivalStoreStartBit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_GreaterEqual(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_GE, fRES(arrivalStoreStartBit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_LessEqual(String arrivalStoreStartBit) {
        regArrivalStoreStartBit(CK_LE, fRES(arrivalStoreStartBit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBitList The collection of arrivalStoreStartBit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_InScope(Collection<String> arrivalStoreStartBitList) {
        doSetArrivalStoreStartBit_InScope(arrivalStoreStartBitList);
    }

    protected void doSetArrivalStoreStartBit_InScope(Collection<String> arrivalStoreStartBitList) {
        regINS(CK_INS, cTL(arrivalStoreStartBitList), xgetCValueArrivalStoreStartBit(), "ARRIVAL_STORE_START_BIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBitList The collection of arrivalStoreStartBit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_NotInScope(Collection<String> arrivalStoreStartBitList) {
        doSetArrivalStoreStartBit_NotInScope(arrivalStoreStartBitList);
    }

    protected void doSetArrivalStoreStartBit_NotInScope(Collection<String> arrivalStoreStartBitList) {
        regINS(CK_NINS, cTL(arrivalStoreStartBitList), xgetCValueArrivalStoreStartBit(), "ARRIVAL_STORE_START_BIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)} <br>
     * <pre>e.g. setArrivalStoreStartBit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalStoreStartBit_LikeSearch(String arrivalStoreStartBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalStoreStartBit), xgetCValueArrivalStoreStartBit(), "ARRIVAL_STORE_START_BIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalStoreStartBit_NotLikeSearch(String arrivalStoreStartBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalStoreStartBit), xgetCValueArrivalStoreStartBit(), "ARRIVAL_STORE_START_BIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     * @param arrivalStoreStartBit The value of arrivalStoreStartBit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreStartBit_PrefixSearch(String arrivalStoreStartBit) {
        setArrivalStoreStartBit_LikeSearch(arrivalStoreStartBit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     */
    public void setArrivalStoreStartBit_IsNull() { regArrivalStoreStartBit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     */
    public void setArrivalStoreStartBit_IsNullOrEmpty() { regArrivalStoreStartBit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_START_BIT: {varchar(30)}
     */
    public void setArrivalStoreStartBit_IsNotNull() { regArrivalStoreStartBit(CK_ISNN, DOBJ); }

    protected void regArrivalStoreStartBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreStartBit(), "ARRIVAL_STORE_START_BIT"); }
    protected abstract ConditionValue xgetCValueArrivalStoreStartBit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_Equal(String arrivalStoreEndBit) {
        doSetArrivalStoreEndBit_Equal(fRES(arrivalStoreEndBit));
    }

    protected void doSetArrivalStoreEndBit_Equal(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_EQ, arrivalStoreEndBit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_NotEqual(String arrivalStoreEndBit) {
        doSetArrivalStoreEndBit_NotEqual(fRES(arrivalStoreEndBit));
    }

    protected void doSetArrivalStoreEndBit_NotEqual(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_NES, arrivalStoreEndBit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_GreaterThan(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_GT, fRES(arrivalStoreEndBit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_LessThan(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_LT, fRES(arrivalStoreEndBit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_GreaterEqual(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_GE, fRES(arrivalStoreEndBit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_LessEqual(String arrivalStoreEndBit) {
        regArrivalStoreEndBit(CK_LE, fRES(arrivalStoreEndBit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBitList The collection of arrivalStoreEndBit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_InScope(Collection<String> arrivalStoreEndBitList) {
        doSetArrivalStoreEndBit_InScope(arrivalStoreEndBitList);
    }

    protected void doSetArrivalStoreEndBit_InScope(Collection<String> arrivalStoreEndBitList) {
        regINS(CK_INS, cTL(arrivalStoreEndBitList), xgetCValueArrivalStoreEndBit(), "ARRIVAL_STORE_END_BIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBitList The collection of arrivalStoreEndBit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_NotInScope(Collection<String> arrivalStoreEndBitList) {
        doSetArrivalStoreEndBit_NotInScope(arrivalStoreEndBitList);
    }

    protected void doSetArrivalStoreEndBit_NotInScope(Collection<String> arrivalStoreEndBitList) {
        regINS(CK_NINS, cTL(arrivalStoreEndBitList), xgetCValueArrivalStoreEndBit(), "ARRIVAL_STORE_END_BIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)} <br>
     * <pre>e.g. setArrivalStoreEndBit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalStoreEndBit_LikeSearch(String arrivalStoreEndBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalStoreEndBit), xgetCValueArrivalStoreEndBit(), "ARRIVAL_STORE_END_BIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalStoreEndBit_NotLikeSearch(String arrivalStoreEndBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalStoreEndBit), xgetCValueArrivalStoreEndBit(), "ARRIVAL_STORE_END_BIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     * @param arrivalStoreEndBit The value of arrivalStoreEndBit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreEndBit_PrefixSearch(String arrivalStoreEndBit) {
        setArrivalStoreEndBit_LikeSearch(arrivalStoreEndBit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     */
    public void setArrivalStoreEndBit_IsNull() { regArrivalStoreEndBit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     */
    public void setArrivalStoreEndBit_IsNullOrEmpty() { regArrivalStoreEndBit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_END_BIT: {varchar(30)}
     */
    public void setArrivalStoreEndBit_IsNotNull() { regArrivalStoreEndBit(CK_ISNN, DOBJ); }

    protected void regArrivalStoreEndBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreEndBit(), "ARRIVAL_STORE_END_BIT"); }
    protected abstract ConditionValue xgetCValueArrivalStoreEndBit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @param arrivalStoreFormat The value of arrivalStoreFormat as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_Equal(String arrivalStoreFormat) {
        doSetArrivalStoreFormat_Equal(fRES(arrivalStoreFormat));
    }

    /**
     * Equal(=). As ArrivalStoreFormat. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_Equal_AsArrivalStoreFormat(CDef.ArrivalStoreFormat cdef) {
        doSetArrivalStoreFormat_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $YMTFMT (YMTFMT). And OnlyOnceRegistered. <br>
     * $YMTFMT: ヤマト用変換フォーマット
     */
    public void setArrivalStoreFormat_Equal_$YMTFMT() {
        setArrivalStoreFormat_Equal_AsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YMTFMT);
    }

    /**
     * Equal(=). As $YUPKFMT (YUPKFMT). And OnlyOnceRegistered. <br>
     * $YUPKFMT: ゆうパック用変換フォーマット
     */
    public void setArrivalStoreFormat_Equal_$YUPKFMT() {
        setArrivalStoreFormat_Equal_AsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YUPKFMT);
    }

    protected void doSetArrivalStoreFormat_Equal(String arrivalStoreFormat) {
        regArrivalStoreFormat(CK_EQ, arrivalStoreFormat);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @param arrivalStoreFormat The value of arrivalStoreFormat as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_NotEqual(String arrivalStoreFormat) {
        doSetArrivalStoreFormat_NotEqual(fRES(arrivalStoreFormat));
    }

    /**
     * NotEqual(&lt;&gt;). As ArrivalStoreFormat. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_NotEqual_AsArrivalStoreFormat(CDef.ArrivalStoreFormat cdef) {
        doSetArrivalStoreFormat_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $YMTFMT (YMTFMT). And OnlyOnceRegistered. <br>
     * $YMTFMT: ヤマト用変換フォーマット
     */
    public void setArrivalStoreFormat_NotEqual_$YMTFMT() {
        setArrivalStoreFormat_NotEqual_AsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YMTFMT);
    }

    /**
     * NotEqual(&lt;&gt;). As $YUPKFMT (YUPKFMT). And OnlyOnceRegistered. <br>
     * $YUPKFMT: ゆうパック用変換フォーマット
     */
    public void setArrivalStoreFormat_NotEqual_$YUPKFMT() {
        setArrivalStoreFormat_NotEqual_AsArrivalStoreFormat(CDef.ArrivalStoreFormat.$YUPKFMT);
    }

    protected void doSetArrivalStoreFormat_NotEqual(String arrivalStoreFormat) {
        regArrivalStoreFormat(CK_NES, arrivalStoreFormat);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @param arrivalStoreFormatList The collection of arrivalStoreFormat as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_InScope(Collection<String> arrivalStoreFormatList) {
        doSetArrivalStoreFormat_InScope(arrivalStoreFormatList);
    }

    /**
     * InScope {in ('a', 'b')}. As ArrivalStoreFormat. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_InScope_AsArrivalStoreFormat(Collection<CDef.ArrivalStoreFormat> cdefList) {
        doSetArrivalStoreFormat_InScope(cTStrL(cdefList));
    }

    protected void doSetArrivalStoreFormat_InScope(Collection<String> arrivalStoreFormatList) {
        regINS(CK_INS, cTL(arrivalStoreFormatList), xgetCValueArrivalStoreFormat(), "ARRIVAL_STORE_FORMAT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     * @param arrivalStoreFormatList The collection of arrivalStoreFormat as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_NotInScope(Collection<String> arrivalStoreFormatList) {
        doSetArrivalStoreFormat_NotInScope(arrivalStoreFormatList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ArrivalStoreFormat. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat} <br>
     * 着店CDフォーマット
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalStoreFormat_NotInScope_AsArrivalStoreFormat(Collection<CDef.ArrivalStoreFormat> cdefList) {
        doSetArrivalStoreFormat_NotInScope(cTStrL(cdefList));
    }

    protected void doSetArrivalStoreFormat_NotInScope(Collection<String> arrivalStoreFormatList) {
        regINS(CK_NINS, cTL(arrivalStoreFormatList), xgetCValueArrivalStoreFormat(), "ARRIVAL_STORE_FORMAT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     */
    public void setArrivalStoreFormat_IsNull() { regArrivalStoreFormat(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     */
    public void setArrivalStoreFormat_IsNullOrEmpty() { regArrivalStoreFormat(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVAL_STORE_FORMAT: {varchar(30), FK to B_CLASS_DTL, classification=ArrivalStoreFormat}
     */
    public void setArrivalStoreFormat_IsNotNull() { regArrivalStoreFormat(CK_ISNN, DOBJ); }

    protected void regArrivalStoreFormat(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalStoreFormat(), "ARRIVAL_STORE_FORMAT"); }
    protected abstract ConditionValue xgetCValueArrivalStoreFormat();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_Equal(String trackingBarcode) {
        doSetTrackingBarcode_Equal(fRES(trackingBarcode));
    }

    protected void doSetTrackingBarcode_Equal(String trackingBarcode) {
        regTrackingBarcode(CK_EQ, trackingBarcode);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_NotEqual(String trackingBarcode) {
        doSetTrackingBarcode_NotEqual(fRES(trackingBarcode));
    }

    protected void doSetTrackingBarcode_NotEqual(String trackingBarcode) {
        regTrackingBarcode(CK_NES, trackingBarcode);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_GreaterThan(String trackingBarcode) {
        regTrackingBarcode(CK_GT, fRES(trackingBarcode));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_LessThan(String trackingBarcode) {
        regTrackingBarcode(CK_LT, fRES(trackingBarcode));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_GreaterEqual(String trackingBarcode) {
        regTrackingBarcode(CK_GE, fRES(trackingBarcode));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_LessEqual(String trackingBarcode) {
        regTrackingBarcode(CK_LE, fRES(trackingBarcode));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcodeList The collection of trackingBarcode as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_InScope(Collection<String> trackingBarcodeList) {
        doSetTrackingBarcode_InScope(trackingBarcodeList);
    }

    protected void doSetTrackingBarcode_InScope(Collection<String> trackingBarcodeList) {
        regINS(CK_INS, cTL(trackingBarcodeList), xgetCValueTrackingBarcode(), "TRACKING_BARCODE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcodeList The collection of trackingBarcode as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_NotInScope(Collection<String> trackingBarcodeList) {
        doSetTrackingBarcode_NotInScope(trackingBarcodeList);
    }

    protected void doSetTrackingBarcode_NotInScope(Collection<String> trackingBarcodeList) {
        regINS(CK_NINS, cTL(trackingBarcodeList), xgetCValueTrackingBarcode(), "TRACKING_BARCODE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)} <br>
     * <pre>e.g. setTrackingBarcode_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trackingBarcode The value of trackingBarcode as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrackingBarcode_LikeSearch(String trackingBarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trackingBarcode), xgetCValueTrackingBarcode(), "TRACKING_BARCODE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrackingBarcode_NotLikeSearch(String trackingBarcode, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trackingBarcode), xgetCValueTrackingBarcode(), "TRACKING_BARCODE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     * @param trackingBarcode The value of trackingBarcode as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingBarcode_PrefixSearch(String trackingBarcode) {
        setTrackingBarcode_LikeSearch(trackingBarcode, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     */
    public void setTrackingBarcode_IsNull() { regTrackingBarcode(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     */
    public void setTrackingBarcode_IsNullOrEmpty() { regTrackingBarcode(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_BARCODE: {varchar(30)}
     */
    public void setTrackingBarcode_IsNotNull() { regTrackingBarcode(CK_ISNN, DOBJ); }

    protected void regTrackingBarcode(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingBarcode(), "TRACKING_BARCODE"); }
    protected abstract ConditionValue xgetCValueTrackingBarcode();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_Equal(String trackingStartBit) {
        doSetTrackingStartBit_Equal(fRES(trackingStartBit));
    }

    protected void doSetTrackingStartBit_Equal(String trackingStartBit) {
        regTrackingStartBit(CK_EQ, trackingStartBit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_NotEqual(String trackingStartBit) {
        doSetTrackingStartBit_NotEqual(fRES(trackingStartBit));
    }

    protected void doSetTrackingStartBit_NotEqual(String trackingStartBit) {
        regTrackingStartBit(CK_NES, trackingStartBit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_GreaterThan(String trackingStartBit) {
        regTrackingStartBit(CK_GT, fRES(trackingStartBit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_LessThan(String trackingStartBit) {
        regTrackingStartBit(CK_LT, fRES(trackingStartBit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_GreaterEqual(String trackingStartBit) {
        regTrackingStartBit(CK_GE, fRES(trackingStartBit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_LessEqual(String trackingStartBit) {
        regTrackingStartBit(CK_LE, fRES(trackingStartBit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBitList The collection of trackingStartBit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_InScope(Collection<String> trackingStartBitList) {
        doSetTrackingStartBit_InScope(trackingStartBitList);
    }

    protected void doSetTrackingStartBit_InScope(Collection<String> trackingStartBitList) {
        regINS(CK_INS, cTL(trackingStartBitList), xgetCValueTrackingStartBit(), "TRACKING_START_BIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBitList The collection of trackingStartBit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_NotInScope(Collection<String> trackingStartBitList) {
        doSetTrackingStartBit_NotInScope(trackingStartBitList);
    }

    protected void doSetTrackingStartBit_NotInScope(Collection<String> trackingStartBitList) {
        regINS(CK_NINS, cTL(trackingStartBitList), xgetCValueTrackingStartBit(), "TRACKING_START_BIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)} <br>
     * <pre>e.g. setTrackingStartBit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trackingStartBit The value of trackingStartBit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrackingStartBit_LikeSearch(String trackingStartBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trackingStartBit), xgetCValueTrackingStartBit(), "TRACKING_START_BIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrackingStartBit_NotLikeSearch(String trackingStartBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trackingStartBit), xgetCValueTrackingStartBit(), "TRACKING_START_BIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     * @param trackingStartBit The value of trackingStartBit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingStartBit_PrefixSearch(String trackingStartBit) {
        setTrackingStartBit_LikeSearch(trackingStartBit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     */
    public void setTrackingStartBit_IsNull() { regTrackingStartBit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     */
    public void setTrackingStartBit_IsNullOrEmpty() { regTrackingStartBit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_START_BIT: {varchar(30)}
     */
    public void setTrackingStartBit_IsNotNull() { regTrackingStartBit(CK_ISNN, DOBJ); }

    protected void regTrackingStartBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingStartBit(), "TRACKING_START_BIT"); }
    protected abstract ConditionValue xgetCValueTrackingStartBit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_Equal(String trackingEndBit) {
        doSetTrackingEndBit_Equal(fRES(trackingEndBit));
    }

    protected void doSetTrackingEndBit_Equal(String trackingEndBit) {
        regTrackingEndBit(CK_EQ, trackingEndBit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_NotEqual(String trackingEndBit) {
        doSetTrackingEndBit_NotEqual(fRES(trackingEndBit));
    }

    protected void doSetTrackingEndBit_NotEqual(String trackingEndBit) {
        regTrackingEndBit(CK_NES, trackingEndBit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_GreaterThan(String trackingEndBit) {
        regTrackingEndBit(CK_GT, fRES(trackingEndBit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_LessThan(String trackingEndBit) {
        regTrackingEndBit(CK_LT, fRES(trackingEndBit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_GreaterEqual(String trackingEndBit) {
        regTrackingEndBit(CK_GE, fRES(trackingEndBit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_LessEqual(String trackingEndBit) {
        regTrackingEndBit(CK_LE, fRES(trackingEndBit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBitList The collection of trackingEndBit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_InScope(Collection<String> trackingEndBitList) {
        doSetTrackingEndBit_InScope(trackingEndBitList);
    }

    protected void doSetTrackingEndBit_InScope(Collection<String> trackingEndBitList) {
        regINS(CK_INS, cTL(trackingEndBitList), xgetCValueTrackingEndBit(), "TRACKING_END_BIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBitList The collection of trackingEndBit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_NotInScope(Collection<String> trackingEndBitList) {
        doSetTrackingEndBit_NotInScope(trackingEndBitList);
    }

    protected void doSetTrackingEndBit_NotInScope(Collection<String> trackingEndBitList) {
        regINS(CK_NINS, cTL(trackingEndBitList), xgetCValueTrackingEndBit(), "TRACKING_END_BIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)} <br>
     * <pre>e.g. setTrackingEndBit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trackingEndBit The value of trackingEndBit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrackingEndBit_LikeSearch(String trackingEndBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trackingEndBit), xgetCValueTrackingEndBit(), "TRACKING_END_BIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrackingEndBit_NotLikeSearch(String trackingEndBit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trackingEndBit), xgetCValueTrackingEndBit(), "TRACKING_END_BIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     * @param trackingEndBit The value of trackingEndBit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingEndBit_PrefixSearch(String trackingEndBit) {
        setTrackingEndBit_LikeSearch(trackingEndBit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     */
    public void setTrackingEndBit_IsNull() { regTrackingEndBit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     */
    public void setTrackingEndBit_IsNullOrEmpty() { regTrackingEndBit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_END_BIT: {varchar(30)}
     */
    public void setTrackingEndBit_IsNotNull() { regTrackingEndBit(CK_ISNN, DOBJ); }

    protected void regTrackingEndBit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingEndBit(), "TRACKING_END_BIT"); }
    protected abstract ConditionValue xgetCValueTrackingEndBit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @param bolOutputTargetFlg The value of bolOutputTargetFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_Equal(String bolOutputTargetFlg) {
        doSetBolOutputTargetFlg_Equal(fRES(bolOutputTargetFlg));
    }

    /**
     * Equal(=). As BolOutputTargetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_Equal_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg cdef) {
        doSetBolOutputTargetFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setBolOutputTargetFlg_Equal_$0() {
        setBolOutputTargetFlg_Equal_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setBolOutputTargetFlg_Equal_$1() {
        setBolOutputTargetFlg_Equal_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$1);
    }

    protected void doSetBolOutputTargetFlg_Equal(String bolOutputTargetFlg) {
        regBolOutputTargetFlg(CK_EQ, bolOutputTargetFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @param bolOutputTargetFlg The value of bolOutputTargetFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_NotEqual(String bolOutputTargetFlg) {
        doSetBolOutputTargetFlg_NotEqual(fRES(bolOutputTargetFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As BolOutputTargetFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_NotEqual_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg cdef) {
        doSetBolOutputTargetFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 対象外
     */
    public void setBolOutputTargetFlg_NotEqual_$0() {
        setBolOutputTargetFlg_NotEqual_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 対象
     */
    public void setBolOutputTargetFlg_NotEqual_$1() {
        setBolOutputTargetFlg_NotEqual_AsBolOutputTargetFlg(CDef.BolOutputTargetFlg.$1);
    }

    protected void doSetBolOutputTargetFlg_NotEqual(String bolOutputTargetFlg) {
        regBolOutputTargetFlg(CK_NES, bolOutputTargetFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @param bolOutputTargetFlgList The collection of bolOutputTargetFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_InScope(Collection<String> bolOutputTargetFlgList) {
        doSetBolOutputTargetFlg_InScope(bolOutputTargetFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As BolOutputTargetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_InScope_AsBolOutputTargetFlg(Collection<CDef.BolOutputTargetFlg> cdefList) {
        doSetBolOutputTargetFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetBolOutputTargetFlg_InScope(Collection<String> bolOutputTargetFlgList) {
        regINS(CK_INS, cTL(bolOutputTargetFlgList), xgetCValueBolOutputTargetFlg(), "BOL_OUTPUT_TARGET_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     * @param bolOutputTargetFlgList The collection of bolOutputTargetFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_NotInScope(Collection<String> bolOutputTargetFlgList) {
        doSetBolOutputTargetFlg_NotInScope(bolOutputTargetFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As BolOutputTargetFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg} <br>
     * Bill of Lading出力対象フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutputTargetFlg_NotInScope_AsBolOutputTargetFlg(Collection<CDef.BolOutputTargetFlg> cdefList) {
        doSetBolOutputTargetFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBolOutputTargetFlg_NotInScope(Collection<String> bolOutputTargetFlgList) {
        regINS(CK_NINS, cTL(bolOutputTargetFlgList), xgetCValueBolOutputTargetFlg(), "BOL_OUTPUT_TARGET_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     */
    public void setBolOutputTargetFlg_IsNull() { regBolOutputTargetFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUTPUT_TARGET_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutputTargetFlg}
     */
    public void setBolOutputTargetFlg_IsNotNull() { regBolOutputTargetFlg(CK_ISNN, DOBJ); }

    protected void regBolOutputTargetFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutputTargetFlg(), "BOL_OUTPUT_TARGET_FLG"); }
    protected abstract ConditionValue xgetCValueBolOutputTargetFlg();

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
    public HpSLCFunction<MCommonCarrierCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCommonCarrierCB.class);
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
    public HpSLCFunction<MCommonCarrierCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCommonCarrierCB.class);
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
    public HpSLCFunction<MCommonCarrierCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCommonCarrierCB.class);
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
    public HpSLCFunction<MCommonCarrierCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCommonCarrierCB.class);
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
    public HpSLCFunction<MCommonCarrierCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCommonCarrierCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCommonCarrierCB&gt;() {
     *     public void query(MCommonCarrierCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCommonCarrierCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCommonCarrierCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCommonCarrierCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCommonCarrierCQ sq);

    protected MCommonCarrierCB xcreateScalarConditionCB() {
        MCommonCarrierCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCommonCarrierCB xcreateScalarConditionPartitionByCB() {
        MCommonCarrierCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCommonCarrierCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COMMON_CARRIER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCommonCarrierCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCommonCarrierCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCommonCarrierCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMMON_CARRIER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCommonCarrierCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCommonCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCommonCarrierCB cb = new MCommonCarrierCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCommonCarrierCQ sq);

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
    protected MCommonCarrierCB newMyCB() {
        return new MCommonCarrierCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCommonCarrierCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
