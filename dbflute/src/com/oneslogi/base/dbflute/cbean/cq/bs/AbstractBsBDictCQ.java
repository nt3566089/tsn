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
 * The abstract condition-query of B_DICT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBDictCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBDictCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_DICT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dictId The value of dictId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterThan(Long dictId) {
        regDictId(CK_GT, dictId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dictId The value of dictId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessThan(Long dictId) {
        regDictId(CK_LT, dictId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dictId The value of dictId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_GreaterEqual(Long dictId) {
        regDictId(CK_GE, dictId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dictId The value of dictId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDictId_LessEqual(Long dictId) {
        regDictId(CK_LE, dictId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dictId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDictId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDictId(), "DICT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dictIdList The collection of dictId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictId_NotInScope(Collection<Long> dictIdList) {
        doSetDictId_NotInScope(dictIdList);
    }

    protected void doSetDictId_NotInScope(Collection<Long> dictIdList) {
        regINS(CK_NINS, cTL(dictIdList), xgetCValueDictId(), "DICT_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_ARG where ...)} <br>
     * B_ARG by DICT_ID, named 'BArgAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BArgList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bArgList");
    }
    public abstract String keepDictId_ExistsReferrer_BArgList(BArgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_COL where ...)} <br>
     * B_COL by DICT_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BColList for 'exists'. (NotNull)
     */
    public void existsBColList(SubQuery<BColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColCB cb = new BColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BColList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bColList");
    }
    public abstract String keepDictId_ExistsReferrer_BColList(BColCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BDictCultureList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bDictCultureList");
    }
    public abstract String keepDictId_ExistsReferrer_BDictCultureList(BDictCultureCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_DICT_VALID where ...)} <br>
     * B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBDictValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BDictValidAsOne for 'exists'. (NotNull)
     */
    public void existsBDictValidAsOne(SubQuery<BDictValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictValidCB cb = new BDictValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BDictValidAsOne(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bDictValidAsOne");
    }
    public abstract String keepDictId_ExistsReferrer_BDictValidAsOne(BDictValidCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_ITEM where ...)} <br>
     * B_ITEM by DICT_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BItemList for 'exists'. (NotNull)
     */
    public void existsBItemList(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BItemList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bItemList");
    }
    public abstract String keepDictId_ExistsReferrer_BItemList(BItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBMenuGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BMenuGrpList for 'exists'. (NotNull)
     */
    public void existsBMenuGrpList(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BMenuGrpList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bMenuGrpList");
    }
    public abstract String keepDictId_ExistsReferrer_BMenuGrpList(BMenuGrpCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from B_SCREEN where ...)} <br>
     * B_SCREEN by DICT_ID, named 'BScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsBScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of BScreenList for 'exists'. (NotNull)
     */
    public void existsBScreenList(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_BScreenList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bScreenList");
    }
    public abstract String keepDictId_ExistsReferrer_BScreenList(BScreenCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from M_HT_DICT where ...)} <br>
     * M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMHtDictAsOne</span>(dictCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MHtDictAsOne for 'exists'. (NotNull)
     */
    public void existsMHtDictAsOne(SubQuery<MHtDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MHtDictCB cb = new MHtDictCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_MHtDictAsOne(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "mHtDictAsOne");
    }
    public abstract String keepDictId_ExistsReferrer_MHtDictAsOne(MHtDictCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPReportLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PReportLayoutItemList for 'exists'. (NotNull)
     */
    public void existsPReportLayoutItemList(SubQuery<PReportLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_PReportLayoutItemList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "pReportLayoutItemList");
    }
    public abstract String keepDictId_ExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DICT_ID from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsPSubrepLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PSubrepLayoutItemList for 'exists'. (NotNull)
     */
    public void existsPSubrepLayoutItemList(SubQuery<PSubrepLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_ExistsReferrer_PSubrepLayoutItemList(cb.query());
        registerExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "pSubrepLayoutItemList");
    }
    public abstract String keepDictId_ExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_ARG where ...)} <br>
     * B_ARG by DICT_ID, named 'BArgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBArgList</span>(argCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     argCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BArgList for 'not exists'. (NotNull)
     */
    public void notExistsBArgList(SubQuery<BArgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BArgCB cb = new BArgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BArgList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bArgList");
    }
    public abstract String keepDictId_NotExistsReferrer_BArgList(BArgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_COL where ...)} <br>
     * B_COL by DICT_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBColList</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BColList for 'not exists'. (NotNull)
     */
    public void notExistsBColList(SubQuery<BColCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BColCB cb = new BColCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BColList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bColList");
    }
    public abstract String keepDictId_NotExistsReferrer_BColList(BColCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBDictCultureList</span>(cultureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cultureCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BDictCultureList for 'not exists'. (NotNull)
     */
    public void notExistsBDictCultureList(SubQuery<BDictCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BDictCultureList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bDictCultureList");
    }
    public abstract String keepDictId_NotExistsReferrer_BDictCultureList(BDictCultureCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_DICT_VALID where ...)} <br>
     * B_DICT_VALID by DICT_ID, named 'BDictValidAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBDictValidAsOne</span>(validCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     validCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BDictValidAsOne for 'not exists'. (NotNull)
     */
    public void notExistsBDictValidAsOne(SubQuery<BDictValidCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictValidCB cb = new BDictValidCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BDictValidAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bDictValidAsOne");
    }
    public abstract String keepDictId_NotExistsReferrer_BDictValidAsOne(BDictValidCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_ITEM where ...)} <br>
     * B_ITEM by DICT_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BItemList for 'not exists'. (NotNull)
     */
    public void notExistsBItemList(SubQuery<BItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BItemCB cb = new BItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bItemList");
    }
    public abstract String keepDictId_NotExistsReferrer_BItemList(BItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBMenuGrpList</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BMenuGrpList for 'not exists'. (NotNull)
     */
    public void notExistsBMenuGrpList(SubQuery<BMenuGrpCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BMenuGrpList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bMenuGrpList");
    }
    public abstract String keepDictId_NotExistsReferrer_BMenuGrpList(BMenuGrpCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from B_SCREEN where ...)} <br>
     * B_SCREEN by DICT_ID, named 'BScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsBScreenList</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_BScreenList for 'not exists'. (NotNull)
     */
    public void notExistsBScreenList(SubQuery<BScreenCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BScreenCB cb = new BScreenCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_BScreenList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "bScreenList");
    }
    public abstract String keepDictId_NotExistsReferrer_BScreenList(BScreenCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from M_HT_DICT where ...)} <br>
     * M_HT_DICT by DICT_ID, named 'MHtDictAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMHtDictAsOne</span>(dictCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dictCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_MHtDictAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMHtDictAsOne(SubQuery<MHtDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MHtDictCB cb = new MHtDictCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_MHtDictAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "mHtDictAsOne");
    }
    public abstract String keepDictId_NotExistsReferrer_MHtDictAsOne(MHtDictCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPReportLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_PReportLayoutItemList for 'not exists'. (NotNull)
     */
    public void notExistsPReportLayoutItemList(SubQuery<PReportLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_PReportLayoutItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "pReportLayoutItemList");
    }
    public abstract String keepDictId_NotExistsReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DICT_ID from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsPSubrepLayoutItemList</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DictId_NotExistsReferrer_PSubrepLayoutItemList for 'not exists'. (NotNull)
     */
    public void notExistsPSubrepLayoutItemList(SubQuery<PSubrepLayoutItemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDictId_NotExistsReferrer_PSubrepLayoutItemList(cb.query());
        registerNotExistsReferrer(cb.query(), "DICT_ID", "DICT_ID", pp, "pSubrepLayoutItemList");
    }
    public abstract String keepDictId_NotExistsReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    public void xsderiveBArgList(String fn, SubQuery<BArgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BArgCB cb = new BArgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BArgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bArgList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BArgList(BArgCQ sq);

    public void xsderiveBColList(String fn, SubQuery<BColCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BColList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bColList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BColList(BColCQ sq);

    public void xsderiveBDictCultureList(String fn, SubQuery<BDictCultureCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCultureCB cb = new BDictCultureCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BDictCultureList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bDictCultureList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BDictCultureList(BDictCultureCQ sq);

    public void xsderiveBItemList(String fn, SubQuery<BItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bItemList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BItemList(BItemCQ sq);

    public void xsderiveBMenuGrpList(String fn, SubQuery<BMenuGrpCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BMenuGrpList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bMenuGrpList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq);

    public void xsderiveBScreenList(String fn, SubQuery<BScreenCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenCB cb = new BScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_BScreenList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "bScreenList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_BScreenList(BScreenCQ sq);

    public void xsderivePReportLayoutItemList(String fn, SubQuery<PReportLayoutItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_PReportLayoutItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "pReportLayoutItemList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);

    public void xsderivePSubrepLayoutItemList(String fn, SubQuery<PSubrepLayoutItemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDictId_SpecifyDerivedReferrer_PSubrepLayoutItemList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", pp, "pSubrepLayoutItemList", al, op);
    }
    public abstract String keepDictId_SpecifyDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ARG where ...)} <br>
     * B_ARG by DICT_ID, named 'BArgAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BArgList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BArgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bArgList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BArgList(BArgCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BArgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_COL where ...)} <br>
     * B_COL by DICT_ID, named 'BColAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBColList()</span>.<span style="color: #CC4747">max</span>(colCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     colCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     colCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BColCB> derivedBColList() {
        return xcreateQDRFunctionBColList();
    }
    protected HpQDRFunction<BColCB> xcreateQDRFunctionBColList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBColList(fn, sq, rd, vl, op));
    }
    public void xqderiveBColList(String fn, SubQuery<BColCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BColCB cb = new BColCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BColList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BColListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bColList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BColList(BColCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BColListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_DICT_CULTURE where ...)} <br>
     * B_DICT_CULTURE by DICT_ID, named 'BDictCultureAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BDictCultureList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BDictCultureListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bDictCultureList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BDictCultureList(BDictCultureCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BDictCultureListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_ITEM where ...)} <br>
     * B_ITEM by DICT_ID, named 'BItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BItemCB> derivedBItemList() {
        return xcreateQDRFunctionBItemList();
    }
    protected HpQDRFunction<BItemCB> xcreateQDRFunctionBItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBItemList(fn, sq, rd, vl, op));
    }
    public void xqderiveBItemList(String fn, SubQuery<BItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BItemCB cb = new BItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BItemList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bItemList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BItemList(BItemCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_MENU_GRP where ...)} <br>
     * B_MENU_GRP by DICT_ID, named 'BMenuGrpAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBMenuGrpList()</span>.<span style="color: #CC4747">max</span>(grpCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     grpCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     grpCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BMenuGrpCB> derivedBMenuGrpList() {
        return xcreateQDRFunctionBMenuGrpList();
    }
    protected HpQDRFunction<BMenuGrpCB> xcreateQDRFunctionBMenuGrpList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBMenuGrpList(fn, sq, rd, vl, op));
    }
    public void xqderiveBMenuGrpList(String fn, SubQuery<BMenuGrpCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMenuGrpCB cb = new BMenuGrpCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BMenuGrpList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BMenuGrpListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bMenuGrpList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BMenuGrpList(BMenuGrpCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BMenuGrpListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from B_SCREEN where ...)} <br>
     * B_SCREEN by DICT_ID, named 'BScreenAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedBScreenList()</span>.<span style="color: #CC4747">max</span>(screenCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     screenCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     screenCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<BScreenCB> derivedBScreenList() {
        return xcreateQDRFunctionBScreenList();
    }
    protected HpQDRFunction<BScreenCB> xcreateQDRFunctionBScreenList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveBScreenList(fn, sq, rd, vl, op));
    }
    public void xqderiveBScreenList(String fn, SubQuery<BScreenCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BScreenCB cb = new BScreenCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_BScreenList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_BScreenListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "bScreenList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_BScreenList(BScreenCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_BScreenListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_REPORT_LAYOUT_ITEM where ...)} <br>
     * P_REPORT_LAYOUT_ITEM by DICT_ID, named 'PReportLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPReportLayoutItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PReportLayoutItemCB> derivedPReportLayoutItemList() {
        return xcreateQDRFunctionPReportLayoutItemList();
    }
    protected HpQDRFunction<PReportLayoutItemCB> xcreateQDRFunctionPReportLayoutItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePReportLayoutItemList(fn, sq, rd, vl, op));
    }
    public void xqderivePReportLayoutItemList(String fn, SubQuery<PReportLayoutItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PReportLayoutItemCB cb = new PReportLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_PReportLayoutItemList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_PReportLayoutItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "pReportLayoutItemList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_PReportLayoutItemList(PReportLayoutItemCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_PReportLayoutItemListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from P_SUBREP_LAYOUT_ITEM where ...)} <br>
     * P_SUBREP_LAYOUT_ITEM by DICT_ID, named 'PSubrepLayoutItemAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedPSubrepLayoutItemList()</span>.<span style="color: #CC4747">max</span>(itemCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     itemCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     itemCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<PSubrepLayoutItemCB> derivedPSubrepLayoutItemList() {
        return xcreateQDRFunctionPSubrepLayoutItemList();
    }
    protected HpQDRFunction<PSubrepLayoutItemCB> xcreateQDRFunctionPSubrepLayoutItemList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderivePSubrepLayoutItemList(fn, sq, rd, vl, op));
    }
    public void xqderivePSubrepLayoutItemList(String fn, SubQuery<PSubrepLayoutItemCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        PSubrepLayoutItemCB cb = new PSubrepLayoutItemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDictId_QueryDerivedReferrer_PSubrepLayoutItemList(cb.query()); String prpp = keepDictId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DICT_ID", "DICT_ID", sqpp, "pSubrepLayoutItemList", rd, vl, prpp, op);
    }
    public abstract String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemList(PSubrepLayoutItemCQ sq);
    public abstract String keepDictId_QueryDerivedReferrer_PSubrepLayoutItemListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDictId_IsNull() { regDictId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DICT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDictId_IsNotNull() { regDictId(CK_ISNN, DOBJ); }

    protected void regDictId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictId(), "DICT_ID"); }
    protected abstract ConditionValue xgetCValueDictId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_Equal(String dictNm) {
        doSetDictNm_Equal(fRES(dictNm));
    }

    protected void doSetDictNm_Equal(String dictNm) {
        regDictNm(CK_EQ, dictNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_NotEqual(String dictNm) {
        doSetDictNm_NotEqual(fRES(dictNm));
    }

    protected void doSetDictNm_NotEqual(String dictNm) {
        regDictNm(CK_NES, dictNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_GreaterThan(String dictNm) {
        regDictNm(CK_GT, fRES(dictNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_LessThan(String dictNm) {
        regDictNm(CK_LT, fRES(dictNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_GreaterEqual(String dictNm) {
        regDictNm(CK_GE, fRES(dictNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_LessEqual(String dictNm) {
        regDictNm(CK_LE, fRES(dictNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNmList The collection of dictNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_InScope(Collection<String> dictNmList) {
        doSetDictNm_InScope(dictNmList);
    }

    protected void doSetDictNm_InScope(Collection<String> dictNmList) {
        regINS(CK_INS, cTL(dictNmList), xgetCValueDictNm(), "DICT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNmList The collection of dictNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_NotInScope(Collection<String> dictNmList) {
        doSetDictNm_NotInScope(dictNmList);
    }

    protected void doSetDictNm_NotInScope(Collection<String> dictNmList) {
        regINS(CK_NINS, cTL(dictNmList), xgetCValueDictNm(), "DICT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)} <br>
     * <pre>e.g. setDictNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dictNm The value of dictNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDictNm_LikeSearch(String dictNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dictNm), xgetCValueDictNm(), "DICT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDictNm_NotLikeSearch(String dictNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dictNm), xgetCValueDictNm(), "DICT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DICT_NM: {UQ, NotNull, varchar(100)}
     * @param dictNm The value of dictNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDictNm_PrefixSearch(String dictNm) {
        setDictNm_LikeSearch(dictNm, xcLSOPPre());
    }

    protected void regDictNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDictNm(), "DICT_NM"); }
    protected abstract ConditionValue xgetCValueDictNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @param dataType The value of dataType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_Equal(String dataType) {
        doSetDataType_Equal(fRES(dataType));
    }

    /**
     * Equal(=). As DataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDataType_Equal_AsDataType(CDef.DataType cdef) {
        doSetDataType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setDataType_Equal_$date() {
        setDataType_Equal_AsDataType(CDef.DataType.$date);
    }

    /**
     * Equal(=). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setDataType_Equal_$datetime() {
        setDataType_Equal_AsDataType(CDef.DataType.$datetime);
    }

    /**
     * Equal(=). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setDataType_Equal_$number() {
        setDataType_Equal_AsDataType(CDef.DataType.$number);
    }

    /**
     * Equal(=). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setDataType_Equal_$text() {
        setDataType_Equal_AsDataType(CDef.DataType.$text);
    }

    /**
     * Equal(=). As $time (time). And OnlyOnceRegistered. <br>
     * $time: 時刻
     */
    public void setDataType_Equal_$time() {
        setDataType_Equal_AsDataType(CDef.DataType.$time);
    }

    protected void doSetDataType_Equal(String dataType) {
        regDataType(CK_EQ, dataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @param dataType The value of dataType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_NotEqual(String dataType) {
        doSetDataType_NotEqual(fRES(dataType));
    }

    /**
     * NotEqual(&lt;&gt;). As DataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDataType_NotEqual_AsDataType(CDef.DataType cdef) {
        doSetDataType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $date (date). And OnlyOnceRegistered. <br>
     * $date: 日付
     */
    public void setDataType_NotEqual_$date() {
        setDataType_NotEqual_AsDataType(CDef.DataType.$date);
    }

    /**
     * NotEqual(&lt;&gt;). As $datetime (datetime). And OnlyOnceRegistered. <br>
     * $datetime: 日時
     */
    public void setDataType_NotEqual_$datetime() {
        setDataType_NotEqual_AsDataType(CDef.DataType.$datetime);
    }

    /**
     * NotEqual(&lt;&gt;). As $number (number). And OnlyOnceRegistered. <br>
     * $number: 数値
     */
    public void setDataType_NotEqual_$number() {
        setDataType_NotEqual_AsDataType(CDef.DataType.$number);
    }

    /**
     * NotEqual(&lt;&gt;). As $text (text). And OnlyOnceRegistered. <br>
     * $text: テキスト
     */
    public void setDataType_NotEqual_$text() {
        setDataType_NotEqual_AsDataType(CDef.DataType.$text);
    }

    /**
     * NotEqual(&lt;&gt;). As $time (time). And OnlyOnceRegistered. <br>
     * $time: 時刻
     */
    public void setDataType_NotEqual_$time() {
        setDataType_NotEqual_AsDataType(CDef.DataType.$time);
    }

    protected void doSetDataType_NotEqual(String dataType) {
        regDataType(CK_NES, dataType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @param dataTypeList The collection of dataType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_InScope(Collection<String> dataTypeList) {
        doSetDataType_InScope(dataTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As DataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_InScope_AsDataType(Collection<CDef.DataType> cdefList) {
        doSetDataType_InScope(cTStrL(cdefList));
    }

    protected void doSetDataType_InScope(Collection<String> dataTypeList) {
        regINS(CK_INS, cTL(dataTypeList), xgetCValueDataType(), "DATA_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     * @param dataTypeList The collection of dataType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_NotInScope(Collection<String> dataTypeList) {
        doSetDataType_NotInScope(dataTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType} <br>
     * データ型
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataType_NotInScope_AsDataType(Collection<CDef.DataType> cdefList) {
        doSetDataType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDataType_NotInScope(Collection<String> dataTypeList) {
        regINS(CK_NINS, cTL(dataTypeList), xgetCValueDataType(), "DATA_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     */
    public void setDataType_IsNull() { regDataType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     */
    public void setDataType_IsNullOrEmpty() { regDataType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=DataType}
     */
    public void setDataType_IsNotNull() { regDataType(CK_ISNN, DOBJ); }

    protected void regDataType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataType(), "DATA_TYPE"); }
    protected abstract ConditionValue xgetCValueDataType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_Equal(String systemType) {
        doSetSystemType_Equal(fRES(systemType));
    }

    protected void doSetSystemType_Equal(String systemType) {
        regSystemType(CK_EQ, systemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual(String systemType) {
        doSetSystemType_NotEqual(fRES(systemType));
    }

    protected void doSetSystemType_NotEqual(String systemType) {
        regSystemType(CK_NES, systemType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterThan(String systemType) {
        regSystemType(CK_GT, fRES(systemType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessThan(String systemType) {
        regSystemType(CK_LT, fRES(systemType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_GreaterEqual(String systemType) {
        regSystemType(CK_GE, fRES(systemType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_LessEqual(String systemType) {
        regSystemType(CK_LE, fRES(systemType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemTypeList The collection of systemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope(Collection<String> systemTypeList) {
        doSetSystemType_InScope(systemTypeList);
    }

    protected void doSetSystemType_InScope(Collection<String> systemTypeList) {
        regINS(CK_INS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemTypeList The collection of systemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope(Collection<String> systemTypeList) {
        doSetSystemType_NotInScope(systemTypeList);
    }

    protected void doSetSystemType_NotInScope(Collection<String> systemTypeList) {
        regINS(CK_NINS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)} <br>
     * <pre>e.g. setSystemType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param systemType The value of systemType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSystemType_LikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSystemType_NotLikeSearch(String systemType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(systemType), xgetCValueSystemType(), "SYSTEM_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     * @param systemType The value of systemType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_PrefixSearch(String systemType) {
        setSystemType_LikeSearch(systemType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     */
    public void setSystemType_IsNull() { regSystemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
     */
    public void setSystemType_IsNullOrEmpty() { regSystemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30)}
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
    public HpSLCFunction<BDictCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BDictCB.class);
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
    public HpSLCFunction<BDictCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BDictCB.class);
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
    public HpSLCFunction<BDictCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BDictCB.class);
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
    public HpSLCFunction<BDictCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BDictCB.class);
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
    public HpSLCFunction<BDictCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BDictCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BDictCB&gt;() {
     *     public void query(BDictCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BDictCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BDictCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BDictCQ sq);

    protected BDictCB xcreateScalarConditionCB() {
        BDictCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BDictCB xcreateScalarConditionPartitionByCB() {
        BDictCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BDictCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCB cb = new BDictCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DICT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BDictCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BDictCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BDictCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BDictCB cb = new BDictCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DICT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BDictCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BDictCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BDictCB cb = new BDictCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BDictCQ sq);

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
    protected BDictCB newMyCB() {
        return new BDictCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BDictCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
