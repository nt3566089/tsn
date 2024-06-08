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
 * The abstract condition-query of B_CULTURE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBCultureCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBCultureCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_CULTURE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select LANG_CULTURE_ID from B_CULTURE where ...)} <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBCultureSelfList</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BCultureSelfList for 'exists'. (NotNull)
     */
    public void existsBCultureSelfList(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BCultureSelfList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "LANG_CULTURE_ID", pp, "bCultureSelfList");
    }
    public abstract String keepCultureId_ExistsReferrer_BCultureSelfList(BCultureCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from B_CULTURE_ATTRIBUTE where ...)} <br>
     * B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBCultureAttributeAsOne</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BCultureAttributeAsOne for 'exists'. (NotNull)
     */
    public void existsBCultureAttributeAsOne(SubQuery<BCultureAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureAttributeCB cb = new BCultureAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BCultureAttributeAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCultureAttributeAsOne");
    }
    public abstract String keepCultureId_ExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBDictCultureList</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BDictCultureList for 'exists'. (NotNull)
     */
    public void existsBDictCultureList(SubQuery<BDictCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BDictCultureList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bDictCultureList");
    }
    public abstract String keepCultureId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from B_INFO where ...)} <br>
     * B_INFO by CULTURE_ID, named 'BInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BInfoList for 'exists'. (NotNull)
     */
    public void existsBInfoList(SubQuery<BInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BInfoCB cb = new BInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BInfoList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bInfoList");
    }
    public abstract String keepCultureId_ExistsReferrer_BInfoList(BInfoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from B_MESSAGE where ...)} <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBMessageList</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BMessageList for 'exists'. (NotNull)
     */
    public void existsBMessageList(SubQuery<BMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMessageCB cb = new BMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BMessageList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bMessageList");
    }
    public abstract String keepCultureId_ExistsReferrer_BMessageList(BMessageCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from B_USER where ...)} <br>
     * B_USER by CULTURE_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BUserList for 'exists'. (NotNull)
     */
    public void existsBUserList(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_BUserList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bUserList");
    }
    public abstract String keepCultureId_ExistsReferrer_BUserList(BUserCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CULTURE_ID from M_CENTER where ...)} <br>
     * M_CENTER by CULTURE_ID, named 'MCenterAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_ExistsReferrer_MCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "mCenterList");
    }
    public abstract String keepCultureId_ExistsReferrer_MCenterList(MCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select LANG_CULTURE_ID from B_CULTURE where ...)} <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBCultureSelfList</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BCultureSelfList for 'not exists'. (NotNull)
     */
    public void notExistsBCultureSelfList(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BCultureSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "LANG_CULTURE_ID", pp, "bCultureSelfList");
    }
    public abstract String keepCultureId_NotExistsReferrer_BCultureSelfList(BCultureCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from B_CULTURE_ATTRIBUTE where ...)} <br>
     * B_CULTURE_ATTRIBUTE by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBCultureAttributeAsOne</span>(attributeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     attributeCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BCultureAttributeAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBCultureAttributeAsOne(SubQuery<BCultureAttributeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureAttributeCB cb = new BCultureAttributeCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BCultureAttributeAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCultureAttributeAsOne");
    }
    public abstract String keepCultureId_NotExistsReferrer_BCultureAttributeAsOne(BCultureAttributeCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBDictCultureList</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BDictCultureList for 'not exists'. (NotNull)
     */
    public void notExistsBDictCultureList(SubQuery<BDictCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BDictCultureList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bDictCultureList");
    }
    public abstract String keepCultureId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from B_INFO where ...)} <br>
     * B_INFO by CULTURE_ID, named 'BInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBInfoList</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BInfoList for 'not exists'. (NotNull)
     */
    public void notExistsBInfoList(SubQuery<BInfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BInfoCB cb = new BInfoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BInfoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bInfoList");
    }
    public abstract String keepCultureId_NotExistsReferrer_BInfoList(BInfoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from B_MESSAGE where ...)} <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBMessageList</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BMessageList for 'not exists'. (NotNull)
     */
    public void notExistsBMessageList(SubQuery<BMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMessageCB cb = new BMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BMessageList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bMessageList");
    }
    public abstract String keepCultureId_NotExistsReferrer_BMessageList(BMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from B_USER where ...)} <br>
     * B_USER by CULTURE_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBUserList</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_BUserList for 'not exists'. (NotNull)
     */
    public void notExistsBUserList(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_BUserList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bUserList");
    }
    public abstract String keepCultureId_NotExistsReferrer_BUserList(BUserCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CULTURE_ID from M_CENTER where ...)} <br>
     * M_CENTER by CULTURE_ID, named 'MCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CultureId_NotExistsReferrer_MCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterList(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCultureId_NotExistsReferrer_MCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "mCenterList");
    }
    public abstract String keepCultureId_NotExistsReferrer_MCenterList(MCenterCQ sq);

    public void xsderiveBCultureSelfList(String fn, SubQuery<BCultureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureCB cb = new BCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_BCultureSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "LANG_CULTURE_ID", pp, "bCultureSelfList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_BCultureSelfList(BCultureCQ sq);

    public void xsderiveBDictCultureList(String fn, SubQuery<BDictCultureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_BDictCultureList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bDictCultureList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq);

    public void xsderiveBInfoList(String fn, SubQuery<BInfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BInfoCB cb = new BInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_BInfoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bInfoList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_BInfoList(BInfoCQ sq);

    public void xsderiveBMessageList(String fn, SubQuery<BMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMessageCB cb = new BMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_BMessageList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bMessageList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_BMessageList(BMessageCQ sq);

    public void xsderiveBUserList(String fn, SubQuery<BUserCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_BUserList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bUserList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_BUserList(BUserCQ sq);

    public void xsderiveMCenterList(String fn, SubQuery<MCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCB cb = new MCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCultureId_SpecifyDerivedReferrer_MCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "mCenterList", al, op);
    }
    public abstract String keepCultureId_SpecifyDerivedReferrer_MCenterList(MCenterCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_CULTURE where ...)} <br>
     * B_CULTURE by LANG_CULTURE_ID, named 'BCultureSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBCultureSelfList()</span>.<span style="color: #CC4747">max</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cultureCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BCultureCB> derivedBCultureSelfList() {
        return xcreateQDRFunctionBCultureSelfList();
    }
    protected HpQDRFunction<BCultureCB> xcreateQDRFunctionBCultureSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBCultureSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveBCultureSelfList(String fn, SubQuery<BCultureCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureCB cb = new BCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_BCultureSelfList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_BCultureSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "LANG_CULTURE_ID", sqpp, "bCultureSelfList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_BCultureSelfList(BCultureCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_BCultureSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by CULTURE_ID, named 'BDictCultureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBDictCultureList()</span>.<span style="color: #CC4747">max</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cultureCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BDictCultureCB> derivedBDictCultureList() {
        return xcreateQDRFunctionBDictCultureList();
    }
    protected HpQDRFunction<BDictCultureCB> xcreateQDRFunctionBDictCultureList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBDictCultureList(fn, sq, rd, vl, op));
    }
    public void xqderiveBDictCultureList(String fn, SubQuery<BDictCultureCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_BDictCultureList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_BDictCultureListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", sqpp, "bDictCultureList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_BDictCultureListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_INFO where ...)} <br>
     * B_INFO by CULTURE_ID, named 'BInfoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBInfoList()</span>.<span style="color: #CC4747">max</span>(infoCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     infoCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     infoCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BInfoCB> derivedBInfoList() {
        return xcreateQDRFunctionBInfoList();
    }
    protected HpQDRFunction<BInfoCB> xcreateQDRFunctionBInfoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBInfoList(fn, sq, rd, vl, op));
    }
    public void xqderiveBInfoList(String fn, SubQuery<BInfoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BInfoCB cb = new BInfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_BInfoList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_BInfoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", sqpp, "bInfoList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_BInfoList(BInfoCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_BInfoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_MESSAGE where ...)} <br>
     * B_MESSAGE by CULTURE_ID, named 'BMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBMessageList()</span>.<span style="color: #CC4747">max</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     messageCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BMessageCB> derivedBMessageList() {
        return xcreateQDRFunctionBMessageList();
    }
    protected HpQDRFunction<BMessageCB> xcreateQDRFunctionBMessageList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBMessageList(fn, sq, rd, vl, op));
    }
    public void xqderiveBMessageList(String fn, SubQuery<BMessageCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMessageCB cb = new BMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_BMessageList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_BMessageListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", sqpp, "bMessageList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_BMessageList(BMessageCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_BMessageListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_USER where ...)} <br>
     * B_USER by CULTURE_ID, named 'BUserAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBUserList()</span>.<span style="color: #CC4747">max</span>(userCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     userCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     userCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BUserCB> derivedBUserList() {
        return xcreateQDRFunctionBUserList();
    }
    protected HpQDRFunction<BUserCB> xcreateQDRFunctionBUserList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBUserList(fn, sq, rd, vl, op));
    }
    public void xqderiveBUserList(String fn, SubQuery<BUserCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BUserCB cb = new BUserCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_BUserList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_BUserListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", sqpp, "bUserList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_BUserList(BUserCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_BUserListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER where ...)} <br>
     * M_CENTER by CULTURE_ID, named 'MCenterAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCultureId_QueryDerivedReferrer_MCenterList(cb.query()); String prpp = keepCultureId_QueryDerivedReferrer_MCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CULTURE_ID", "CULTURE_ID", sqpp, "mCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCultureId_QueryDerivedReferrer_MCenterList(MCenterCQ sq);
    public abstract String keepCultureId_QueryDerivedReferrer_MCenterListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCultureId_IsNull() { regCultureId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CULTURE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCultureId_IsNotNull() { regCultureId(CK_ISNN, DOBJ); }

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_Equal(String cultureCd) {
        doSetCultureCd_Equal(fRES(cultureCd));
    }

    protected void doSetCultureCd_Equal(String cultureCd) {
        regCultureCd(CK_EQ, cultureCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_NotEqual(String cultureCd) {
        doSetCultureCd_NotEqual(fRES(cultureCd));
    }

    protected void doSetCultureCd_NotEqual(String cultureCd) {
        regCultureCd(CK_NES, cultureCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_GreaterThan(String cultureCd) {
        regCultureCd(CK_GT, fRES(cultureCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_LessThan(String cultureCd) {
        regCultureCd(CK_LT, fRES(cultureCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_GreaterEqual(String cultureCd) {
        regCultureCd(CK_GE, fRES(cultureCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_LessEqual(String cultureCd) {
        regCultureCd(CK_LE, fRES(cultureCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCdList The collection of cultureCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_InScope(Collection<String> cultureCdList) {
        doSetCultureCd_InScope(cultureCdList);
    }

    protected void doSetCultureCd_InScope(Collection<String> cultureCdList) {
        regINS(CK_INS, cTL(cultureCdList), xgetCValueCultureCd(), "CULTURE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCdList The collection of cultureCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_NotInScope(Collection<String> cultureCdList) {
        doSetCultureCd_NotInScope(cultureCdList);
    }

    protected void doSetCultureCd_NotInScope(Collection<String> cultureCdList) {
        regINS(CK_NINS, cTL(cultureCdList), xgetCValueCultureCd(), "CULTURE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)} <br>
     * <pre>e.g. setCultureCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cultureCd The value of cultureCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCultureCd_LikeSearch(String cultureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cultureCd), xgetCValueCultureCd(), "CULTURE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCultureCd_NotLikeSearch(String cultureCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cultureCd), xgetCValueCultureCd(), "CULTURE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CULTURE_CD: {UQ, NotNull, varchar(30)}
     * @param cultureCd The value of cultureCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureCd_PrefixSearch(String cultureCd) {
        setCultureCd_LikeSearch(cultureCd, xcLSOPPre());
    }

    protected void regCultureCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureCd(), "CULTURE_CD"); }
    protected abstract ConditionValue xgetCValueCultureCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {IX, bigint(19), FK to B_DICT}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_Equal(Long langCultureId) {
        doSetLangCultureId_Equal(langCultureId);
    }

    protected void doSetLangCultureId_Equal(Long langCultureId) {
        regLangCultureId(CK_EQ, langCultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_NotEqual(Long langCultureId) {
        doSetLangCultureId_NotEqual(langCultureId);
    }

    protected void doSetLangCultureId_NotEqual(Long langCultureId) {
        regLangCultureId(CK_NES, langCultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_GreaterThan(Long langCultureId) {
        regLangCultureId(CK_GT, langCultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_LessThan(Long langCultureId) {
        regLangCultureId(CK_LT, langCultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_GreaterEqual(Long langCultureId) {
        regLangCultureId(CK_GE, langCultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureId The value of langCultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLangCultureId_LessEqual(Long langCultureId) {
        regLangCultureId(CK_LE, langCultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param minNumber The min number of langCultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of langCultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLangCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLangCultureId(), "LANG_CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureIdList The collection of langCultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangCultureId_InScope(Collection<Long> langCultureIdList) {
        doSetLangCultureId_InScope(langCultureIdList);
    }

    protected void doSetLangCultureId_InScope(Collection<Long> langCultureIdList) {
        regINS(CK_INS, cTL(langCultureIdList), xgetCValueLangCultureId(), "LANG_CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     * @param langCultureIdList The collection of langCultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLangCultureId_NotInScope(Collection<Long> langCultureIdList) {
        doSetLangCultureId_NotInScope(langCultureIdList);
    }

    protected void doSetLangCultureId_NotInScope(Collection<Long> langCultureIdList) {
        regINS(CK_NINS, cTL(langCultureIdList), xgetCValueLangCultureId(), "LANG_CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LANG_CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @param subCBLambda The callback for sub-query of BCultureSelf for 'in-scope'. (NotNull)
     */
    public void inScopeBCultureSelf(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLangCultureId_InScopeRelation_BCultureSelf(cb.query());
        registerInScopeRelation(cb.query(), "LANG_CULTURE_ID", "CULTURE_ID", pp, "bCultureSelf", false);
    }
    public abstract String keepLangCultureId_InScopeRelation_BCultureSelf(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LANG_CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @param subCBLambda The callback for sub-query of BCultureSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCultureSelf(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLangCultureId_NotInScopeRelation_BCultureSelf(cb.query());
        registerInScopeRelation(cb.query(), "LANG_CULTURE_ID", "CULTURE_ID", pp, "bCultureSelf", true);
    }
    public abstract String keepLangCultureId_NotInScopeRelation_BCultureSelf(BCultureCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     */
    public void setLangCultureId_IsNull() { regLangCultureId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LANG_CULTURE_ID: {bigint(19), FK to B_CULTURE}
     */
    public void setLangCultureId_IsNotNull() { regLangCultureId(CK_ISNN, DOBJ); }

    protected void regLangCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLangCultureId(), "LANG_CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueLangCultureId();

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
    public HpSLCFunction<BCultureCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BCultureCB.class);
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
    public HpSLCFunction<BCultureCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BCultureCB.class);
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
    public HpSLCFunction<BCultureCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BCultureCB.class);
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
    public HpSLCFunction<BCultureCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BCultureCB.class);
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
    public HpSLCFunction<BCultureCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BCultureCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BCultureCB&gt;() {
     *     public void query(BCultureCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BCultureCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BCultureCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BCultureCQ sq);

    protected BCultureCB xcreateScalarConditionCB() {
        BCultureCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BCultureCB xcreateScalarConditionPartitionByCB() {
        BCultureCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BCultureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureCB cb = new BCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CULTURE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BCultureCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BCultureCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BCultureCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BCultureCB cb = new BCultureCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CULTURE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BCultureCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BCultureCQ sq);

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
    protected BCultureCB newMyCB() {
        return new BCultureCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BCultureCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
