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
 * The abstract condition-query of H_SHIPPING_SPARE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHShippingSpareCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHShippingSpareCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_SHIPPING_SPARE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_Equal(Long shippingInstBId) {
        doSetShippingInstBId_Equal(shippingInstBId);
    }

    protected void doSetShippingInstBId_Equal(Long shippingInstBId) {
        regShippingInstBId(CK_EQ, shippingInstBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotEqual(Long shippingInstBId) {
        doSetShippingInstBId_NotEqual(shippingInstBId);
    }

    protected void doSetShippingInstBId_NotEqual(Long shippingInstBId) {
        regShippingInstBId(CK_NES, shippingInstBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterThan(Long shippingInstBId) {
        regShippingInstBId(CK_GT, shippingInstBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessThan(Long shippingInstBId) {
        regShippingInstBId(CK_LT, shippingInstBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_GreaterEqual(Long shippingInstBId) {
        regShippingInstBId(CK_GE, shippingInstBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBId The value of shippingInstBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstBId_LessEqual(Long shippingInstBId) {
        regShippingInstBId(CK_LE, shippingInstBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param minNumber The min number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBIdList The collection of shippingInstBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_InScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_InScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_INS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     * @param shippingInstBIdList The collection of shippingInstBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        doSetShippingInstBId_NotInScope(shippingInstBIdList);
    }

    protected void doSetShippingInstBId_NotInScope(Collection<Long> shippingInstBIdList) {
        regINS(CK_NINS, cTL(shippingInstBIdList), xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_B_ID from H_SHIPPING_B where ...)} <br />
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @param subCBLambda The callback for sub-query of HShippingB for 'in-scope'. (NotNull)
     */
    public void inScopeHShippingB(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_InScopeRelation_HShippingB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "hShippingB", false);
    }
    public abstract String keepShippingInstBId_InScopeRelation_HShippingB(HShippingBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_B_ID from H_SHIPPING_B where ...)} <br />
     * H_SHIPPING_B by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @param subCBLambda The callback for sub-query of HShippingB for 'not in-scope'. (NotNull)
     */
    public void notInScopeHShippingB(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstBId_NotInScopeRelation_HShippingB(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_B_ID", "SHIPPING_INST_B_ID", pp, "hShippingB", true);
    }
    public abstract String keepShippingInstBId_NotInScopeRelation_HShippingB(HShippingBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     */
    public void setShippingInstBId_IsNull() { regShippingInstBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_B_ID: {PK, ID, NotNull, bigint identity(19), FK to H_SHIPPING_B}
     */
    public void setShippingInstBId_IsNotNull() { regShippingInstBId(CK_ISNN, DOBJ); }

    protected void regShippingInstBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstBId(), "SHIPPING_INST_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_Equal(String spareStr1) {
        doSetSpareStr1_Equal(fRES(spareStr1));
    }

    protected void doSetSpareStr1_Equal(String spareStr1) {
        regSpareStr1(CK_EQ, spareStr1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_NotEqual(String spareStr1) {
        doSetSpareStr1_NotEqual(fRES(spareStr1));
    }

    protected void doSetSpareStr1_NotEqual(String spareStr1) {
        regSpareStr1(CK_NES, spareStr1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_GreaterThan(String spareStr1) {
        regSpareStr1(CK_GT, fRES(spareStr1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_LessThan(String spareStr1) {
        regSpareStr1(CK_LT, fRES(spareStr1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_GreaterEqual(String spareStr1) {
        regSpareStr1(CK_GE, fRES(spareStr1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_LessEqual(String spareStr1) {
        regSpareStr1(CK_LE, fRES(spareStr1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1List The collection of spareStr1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_InScope(Collection<String> spareStr1List) {
        doSetSpareStr1_InScope(spareStr1List);
    }

    protected void doSetSpareStr1_InScope(Collection<String> spareStr1List) {
        regINS(CK_INS, cTL(spareStr1List), xgetCValueSpareStr1(), "SPARE_STR_1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1List The collection of spareStr1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_NotInScope(Collection<String> spareStr1List) {
        doSetSpareStr1_NotInScope(spareStr1List);
    }

    protected void doSetSpareStr1_NotInScope(Collection<String> spareStr1List) {
        regINS(CK_NINS, cTL(spareStr1List), xgetCValueSpareStr1(), "SPARE_STR_1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)} <br>
     * <pre>e.g. setSpareStr1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr1 The value of spareStr1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr1_LikeSearch(String spareStr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr1), xgetCValueSpareStr1(), "SPARE_STR_1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr1_NotLikeSearch(String spareStr1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr1), xgetCValueSpareStr1(), "SPARE_STR_1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     * @param spareStr1 The value of spareStr1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr1_PrefixSearch(String spareStr1) {
        setSpareStr1_LikeSearch(spareStr1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNull() { regSpareStr1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNullOrEmpty() { regSpareStr1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_1: {varchar(255)}
     */
    public void setSpareStr1_IsNotNull() { regSpareStr1(CK_ISNN, DOBJ); }

    protected void regSpareStr1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr1(), "SPARE_STR_1"); }
    protected abstract ConditionValue xgetCValueSpareStr1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_Equal(String spareStr2) {
        doSetSpareStr2_Equal(fRES(spareStr2));
    }

    protected void doSetSpareStr2_Equal(String spareStr2) {
        regSpareStr2(CK_EQ, spareStr2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_NotEqual(String spareStr2) {
        doSetSpareStr2_NotEqual(fRES(spareStr2));
    }

    protected void doSetSpareStr2_NotEqual(String spareStr2) {
        regSpareStr2(CK_NES, spareStr2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_GreaterThan(String spareStr2) {
        regSpareStr2(CK_GT, fRES(spareStr2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_LessThan(String spareStr2) {
        regSpareStr2(CK_LT, fRES(spareStr2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_GreaterEqual(String spareStr2) {
        regSpareStr2(CK_GE, fRES(spareStr2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_LessEqual(String spareStr2) {
        regSpareStr2(CK_LE, fRES(spareStr2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2List The collection of spareStr2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_InScope(Collection<String> spareStr2List) {
        doSetSpareStr2_InScope(spareStr2List);
    }

    protected void doSetSpareStr2_InScope(Collection<String> spareStr2List) {
        regINS(CK_INS, cTL(spareStr2List), xgetCValueSpareStr2(), "SPARE_STR_2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2List The collection of spareStr2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_NotInScope(Collection<String> spareStr2List) {
        doSetSpareStr2_NotInScope(spareStr2List);
    }

    protected void doSetSpareStr2_NotInScope(Collection<String> spareStr2List) {
        regINS(CK_NINS, cTL(spareStr2List), xgetCValueSpareStr2(), "SPARE_STR_2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)} <br>
     * <pre>e.g. setSpareStr2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr2 The value of spareStr2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr2_LikeSearch(String spareStr2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr2), xgetCValueSpareStr2(), "SPARE_STR_2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr2_NotLikeSearch(String spareStr2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr2), xgetCValueSpareStr2(), "SPARE_STR_2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     * @param spareStr2 The value of spareStr2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr2_PrefixSearch(String spareStr2) {
        setSpareStr2_LikeSearch(spareStr2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNull() { regSpareStr2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNullOrEmpty() { regSpareStr2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_2: {varchar(255)}
     */
    public void setSpareStr2_IsNotNull() { regSpareStr2(CK_ISNN, DOBJ); }

    protected void regSpareStr2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr2(), "SPARE_STR_2"); }
    protected abstract ConditionValue xgetCValueSpareStr2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_Equal(String spareStr3) {
        doSetSpareStr3_Equal(fRES(spareStr3));
    }

    protected void doSetSpareStr3_Equal(String spareStr3) {
        regSpareStr3(CK_EQ, spareStr3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_NotEqual(String spareStr3) {
        doSetSpareStr3_NotEqual(fRES(spareStr3));
    }

    protected void doSetSpareStr3_NotEqual(String spareStr3) {
        regSpareStr3(CK_NES, spareStr3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_GreaterThan(String spareStr3) {
        regSpareStr3(CK_GT, fRES(spareStr3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_LessThan(String spareStr3) {
        regSpareStr3(CK_LT, fRES(spareStr3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_GreaterEqual(String spareStr3) {
        regSpareStr3(CK_GE, fRES(spareStr3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_LessEqual(String spareStr3) {
        regSpareStr3(CK_LE, fRES(spareStr3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3List The collection of spareStr3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_InScope(Collection<String> spareStr3List) {
        doSetSpareStr3_InScope(spareStr3List);
    }

    protected void doSetSpareStr3_InScope(Collection<String> spareStr3List) {
        regINS(CK_INS, cTL(spareStr3List), xgetCValueSpareStr3(), "SPARE_STR_3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3List The collection of spareStr3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_NotInScope(Collection<String> spareStr3List) {
        doSetSpareStr3_NotInScope(spareStr3List);
    }

    protected void doSetSpareStr3_NotInScope(Collection<String> spareStr3List) {
        regINS(CK_NINS, cTL(spareStr3List), xgetCValueSpareStr3(), "SPARE_STR_3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)} <br>
     * <pre>e.g. setSpareStr3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr3 The value of spareStr3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr3_LikeSearch(String spareStr3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr3), xgetCValueSpareStr3(), "SPARE_STR_3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr3_NotLikeSearch(String spareStr3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr3), xgetCValueSpareStr3(), "SPARE_STR_3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     * @param spareStr3 The value of spareStr3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr3_PrefixSearch(String spareStr3) {
        setSpareStr3_LikeSearch(spareStr3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNull() { regSpareStr3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNullOrEmpty() { regSpareStr3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR_3: {varchar(255)}
     */
    public void setSpareStr3_IsNotNull() { regSpareStr3(CK_ISNN, DOBJ); }

    protected void regSpareStr3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr3(), "SPARE_STR_3"); }
    protected abstract ConditionValue xgetCValueSpareStr3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_Equal(java.math.BigDecimal spareNum1) {
        doSetSpareNum1_Equal(spareNum1);
    }

    protected void doSetSpareNum1_Equal(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_EQ, spareNum1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_NotEqual(java.math.BigDecimal spareNum1) {
        doSetSpareNum1_NotEqual(spareNum1);
    }

    protected void doSetSpareNum1_NotEqual(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_NES, spareNum1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_GreaterThan(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_GT, spareNum1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_LessThan(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_LT, spareNum1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_GreaterEqual(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_GE, spareNum1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1 The value of spareNum1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum1_LessEqual(java.math.BigDecimal spareNum1) {
        regSpareNum1(CK_LE, spareNum1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param minNumber The min number of spareNum1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spareNum1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpareNum1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpareNum1(), "SPARE_NUM_1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1List The collection of spareNum1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_InScope(Collection<java.math.BigDecimal> spareNum1List) {
        doSetSpareNum1_InScope(spareNum1List);
    }

    protected void doSetSpareNum1_InScope(Collection<java.math.BigDecimal> spareNum1List) {
        regINS(CK_INS, cTL(spareNum1List), xgetCValueSpareNum1(), "SPARE_NUM_1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     * @param spareNum1List The collection of spareNum1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum1_NotInScope(Collection<java.math.BigDecimal> spareNum1List) {
        doSetSpareNum1_NotInScope(spareNum1List);
    }

    protected void doSetSpareNum1_NotInScope(Collection<java.math.BigDecimal> spareNum1List) {
        regINS(CK_NINS, cTL(spareNum1List), xgetCValueSpareNum1(), "SPARE_NUM_1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     */
    public void setSpareNum1_IsNull() { regSpareNum1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_1: {decimal(16, 6)}
     */
    public void setSpareNum1_IsNotNull() { regSpareNum1(CK_ISNN, DOBJ); }

    protected void regSpareNum1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum1(), "SPARE_NUM_1"); }
    protected abstract ConditionValue xgetCValueSpareNum1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_Equal(java.math.BigDecimal spareNum2) {
        doSetSpareNum2_Equal(spareNum2);
    }

    protected void doSetSpareNum2_Equal(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_EQ, spareNum2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_NotEqual(java.math.BigDecimal spareNum2) {
        doSetSpareNum2_NotEqual(spareNum2);
    }

    protected void doSetSpareNum2_NotEqual(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_NES, spareNum2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_GreaterThan(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_GT, spareNum2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_LessThan(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_LT, spareNum2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_GreaterEqual(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_GE, spareNum2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2 The value of spareNum2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum2_LessEqual(java.math.BigDecimal spareNum2) {
        regSpareNum2(CK_LE, spareNum2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param minNumber The min number of spareNum2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spareNum2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpareNum2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpareNum2(), "SPARE_NUM_2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2List The collection of spareNum2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_InScope(Collection<java.math.BigDecimal> spareNum2List) {
        doSetSpareNum2_InScope(spareNum2List);
    }

    protected void doSetSpareNum2_InScope(Collection<java.math.BigDecimal> spareNum2List) {
        regINS(CK_INS, cTL(spareNum2List), xgetCValueSpareNum2(), "SPARE_NUM_2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     * @param spareNum2List The collection of spareNum2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum2_NotInScope(Collection<java.math.BigDecimal> spareNum2List) {
        doSetSpareNum2_NotInScope(spareNum2List);
    }

    protected void doSetSpareNum2_NotInScope(Collection<java.math.BigDecimal> spareNum2List) {
        regINS(CK_NINS, cTL(spareNum2List), xgetCValueSpareNum2(), "SPARE_NUM_2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     */
    public void setSpareNum2_IsNull() { regSpareNum2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_2: {decimal(16, 6)}
     */
    public void setSpareNum2_IsNotNull() { regSpareNum2(CK_ISNN, DOBJ); }

    protected void regSpareNum2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum2(), "SPARE_NUM_2"); }
    protected abstract ConditionValue xgetCValueSpareNum2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_Equal(java.math.BigDecimal spareNum3) {
        doSetSpareNum3_Equal(spareNum3);
    }

    protected void doSetSpareNum3_Equal(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_EQ, spareNum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_NotEqual(java.math.BigDecimal spareNum3) {
        doSetSpareNum3_NotEqual(spareNum3);
    }

    protected void doSetSpareNum3_NotEqual(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_NES, spareNum3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_GreaterThan(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_GT, spareNum3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_LessThan(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_LT, spareNum3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_GreaterEqual(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_GE, spareNum3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3 The value of spareNum3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpareNum3_LessEqual(java.math.BigDecimal spareNum3) {
        regSpareNum3(CK_LE, spareNum3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param minNumber The min number of spareNum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spareNum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpareNum3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpareNum3(), "SPARE_NUM_3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3List The collection of spareNum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_InScope(Collection<java.math.BigDecimal> spareNum3List) {
        doSetSpareNum3_InScope(spareNum3List);
    }

    protected void doSetSpareNum3_InScope(Collection<java.math.BigDecimal> spareNum3List) {
        regINS(CK_INS, cTL(spareNum3List), xgetCValueSpareNum3(), "SPARE_NUM_3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     * @param spareNum3List The collection of spareNum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareNum3_NotInScope(Collection<java.math.BigDecimal> spareNum3List) {
        doSetSpareNum3_NotInScope(spareNum3List);
    }

    protected void doSetSpareNum3_NotInScope(Collection<java.math.BigDecimal> spareNum3List) {
        regINS(CK_NINS, cTL(spareNum3List), xgetCValueSpareNum3(), "SPARE_NUM_3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     */
    public void setSpareNum3_IsNull() { regSpareNum3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_NUM_3: {decimal(16, 6)}
     */
    public void setSpareNum3_IsNotNull() { regSpareNum3(CK_ISNN, DOBJ); }

    protected void regSpareNum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareNum3(), "SPARE_NUM_3"); }
    protected abstract ConditionValue xgetCValueSpareNum3();

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
    public HpSLCFunction<HShippingSpareCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HShippingSpareCB.class);
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
    public HpSLCFunction<HShippingSpareCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HShippingSpareCB.class);
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
    public HpSLCFunction<HShippingSpareCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HShippingSpareCB.class);
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
    public HpSLCFunction<HShippingSpareCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HShippingSpareCB.class);
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
    public HpSLCFunction<HShippingSpareCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HShippingSpareCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HShippingSpareCB&gt;() {
     *     public void query(HShippingSpareCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HShippingSpareCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HShippingSpareCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingSpareCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HShippingSpareCQ sq);

    protected HShippingSpareCB xcreateScalarConditionCB() {
        HShippingSpareCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HShippingSpareCB xcreateScalarConditionPartitionByCB() {
        HShippingSpareCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HShippingSpareCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingSpareCB cb = new HShippingSpareCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HShippingSpareCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HShippingSpareCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HShippingSpareCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingSpareCB cb = new HShippingSpareCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HShippingSpareCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HShippingSpareCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingSpareCB cb = new HShippingSpareCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HShippingSpareCQ sq);

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
    protected HShippingSpareCB newMyCB() {
        return new HShippingSpareCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HShippingSpareCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
