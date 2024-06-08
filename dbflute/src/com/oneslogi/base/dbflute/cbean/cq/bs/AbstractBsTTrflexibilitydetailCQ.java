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
 * The abstract condition-query of T_TRFLEXIBILITYDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrflexibilitydetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrflexibilitydetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRFLEXIBILITYDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_Equal(Long flexibleTransportDetailInfoId) {
        doSetFlexibleTransportDetailInfoId_Equal(flexibleTransportDetailInfoId);
    }

    protected void doSetFlexibleTransportDetailInfoId_Equal(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_EQ, flexibleTransportDetailInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_NotEqual(Long flexibleTransportDetailInfoId) {
        doSetFlexibleTransportDetailInfoId_NotEqual(flexibleTransportDetailInfoId);
    }

    protected void doSetFlexibleTransportDetailInfoId_NotEqual(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_NES, flexibleTransportDetailInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_GreaterThan(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_GT, flexibleTransportDetailInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_LessThan(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_LT, flexibleTransportDetailInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_GreaterEqual(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_GE, flexibleTransportDetailInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoId The value of flexibleTransportDetailInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_LessEqual(Long flexibleTransportDetailInfoId) {
        regFlexibleTransportDetailInfoId(CK_LE, flexibleTransportDetailInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of flexibleTransportDetailInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of flexibleTransportDetailInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFlexibleTransportDetailInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFlexibleTransportDetailInfoId(), "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoIdList The collection of flexibleTransportDetailInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_InScope(Collection<Long> flexibleTransportDetailInfoIdList) {
        doSetFlexibleTransportDetailInfoId_InScope(flexibleTransportDetailInfoIdList);
    }

    protected void doSetFlexibleTransportDetailInfoId_InScope(Collection<Long> flexibleTransportDetailInfoIdList) {
        regINS(CK_INS, cTL(flexibleTransportDetailInfoIdList), xgetCValueFlexibleTransportDetailInfoId(), "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param flexibleTransportDetailInfoIdList The collection of flexibleTransportDetailInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleTransportDetailInfoId_NotInScope(Collection<Long> flexibleTransportDetailInfoIdList) {
        doSetFlexibleTransportDetailInfoId_NotInScope(flexibleTransportDetailInfoIdList);
    }

    protected void doSetFlexibleTransportDetailInfoId_NotInScope(Collection<Long> flexibleTransportDetailInfoIdList) {
        regINS(CK_NINS, cTL(flexibleTransportDetailInfoIdList), xgetCValueFlexibleTransportDetailInfoId(), "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFlexibleTransportDetailInfoId_IsNull() { regFlexibleTransportDetailInfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_DETAIL_INFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setFlexibleTransportDetailInfoId_IsNotNull() { regFlexibleTransportDetailInfoId(CK_ISNN, DOBJ); }

    protected void regFlexibleTransportDetailInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexibleTransportDetailInfoId(), "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID"); }
    protected abstract ConditionValue xgetCValueFlexibleTransportDetailInfoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_Equal(Long flexibleTransportInfoId) {
        doSetFlexibleTransportInfoId_Equal(flexibleTransportInfoId);
    }

    protected void doSetFlexibleTransportInfoId_Equal(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_EQ, flexibleTransportInfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_NotEqual(Long flexibleTransportInfoId) {
        doSetFlexibleTransportInfoId_NotEqual(flexibleTransportInfoId);
    }

    protected void doSetFlexibleTransportInfoId_NotEqual(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_NES, flexibleTransportInfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_GreaterThan(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_GT, flexibleTransportInfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_LessThan(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_LT, flexibleTransportInfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_GreaterEqual(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_GE, flexibleTransportInfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoId The value of flexibleTransportInfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_LessEqual(Long flexibleTransportInfoId) {
        regFlexibleTransportInfoId(CK_LE, flexibleTransportInfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param minNumber The min number of flexibleTransportInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of flexibleTransportInfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFlexibleTransportInfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFlexibleTransportInfoId(), "FLEXIBLE_TRANSPORT_INFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoIdList The collection of flexibleTransportInfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_InScope(Collection<Long> flexibleTransportInfoIdList) {
        doSetFlexibleTransportInfoId_InScope(flexibleTransportInfoIdList);
    }

    protected void doSetFlexibleTransportInfoId_InScope(Collection<Long> flexibleTransportInfoIdList) {
        regINS(CK_INS, cTL(flexibleTransportInfoIdList), xgetCValueFlexibleTransportInfoId(), "FLEXIBLE_TRANSPORT_INFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBLE_TRANSPORT_INFO_ID: {NotNull, bigint(19), FK to T_TRFLEXIBILITY}
     * @param flexibleTransportInfoIdList The collection of flexibleTransportInfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibleTransportInfoId_NotInScope(Collection<Long> flexibleTransportInfoIdList) {
        doSetFlexibleTransportInfoId_NotInScope(flexibleTransportInfoIdList);
    }

    protected void doSetFlexibleTransportInfoId_NotInScope(Collection<Long> flexibleTransportInfoIdList) {
        regINS(CK_NINS, cTL(flexibleTransportInfoIdList), xgetCValueFlexibleTransportInfoId(), "FLEXIBLE_TRANSPORT_INFO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select FLEXIBLE_TRANSPORT_INFO_ID from T_TRFLEXIBILITY where ...)} <br />
     * T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     * @param subCBLambda The callback for sub-query of TTrflexibility for 'in-scope'. (NotNull)
     */
    public void inScopeTTrflexibility(SubQuery<TTrflexibilityCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrflexibilityCB cb = new TTrflexibilityCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFlexibleTransportInfoId_InScopeRelation_TTrflexibility(cb.query());
        registerInScopeRelation(cb.query(), "FLEXIBLE_TRANSPORT_INFO_ID", "FLEXIBLE_TRANSPORT_INFO_ID", pp, "tTrflexibility", false);
    }
    public abstract String keepFlexibleTransportInfoId_InScopeRelation_TTrflexibility(TTrflexibilityCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select FLEXIBLE_TRANSPORT_INFO_ID from T_TRFLEXIBILITY where ...)} <br />
     * T_TRFLEXIBILITY by my FLEXIBLE_TRANSPORT_INFO_ID, named 'TTrflexibility'.
     * @param subCBLambda The callback for sub-query of TTrflexibility for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrflexibility(SubQuery<TTrflexibilityCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrflexibilityCB cb = new TTrflexibilityCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility(cb.query());
        registerInScopeRelation(cb.query(), "FLEXIBLE_TRANSPORT_INFO_ID", "FLEXIBLE_TRANSPORT_INFO_ID", pp, "tTrflexibility", true);
    }
    public abstract String keepFlexibleTransportInfoId_NotInScopeRelation_TTrflexibility(TTrflexibilityCQ sq);

    protected void regFlexibleTransportInfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexibleTransportInfoId(), "FLEXIBLE_TRANSPORT_INFO_ID"); }
    protected abstract ConditionValue xgetCValueFlexibleTransportInfoId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_Equal(java.math.BigDecimal flexibitylineno) {
        doSetFlexibitylineno_Equal(flexibitylineno);
    }

    protected void doSetFlexibitylineno_Equal(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_EQ, flexibitylineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_NotEqual(java.math.BigDecimal flexibitylineno) {
        doSetFlexibitylineno_NotEqual(flexibitylineno);
    }

    protected void doSetFlexibitylineno_NotEqual(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_NES, flexibitylineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_GreaterThan(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_GT, flexibitylineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_LessThan(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_LT, flexibitylineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_GreaterEqual(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_GE, flexibitylineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylineno The value of flexibitylineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFlexibitylineno_LessEqual(java.math.BigDecimal flexibitylineno) {
        regFlexibitylineno(CK_LE, flexibitylineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of flexibitylineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of flexibitylineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFlexibitylineno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFlexibitylineno(), "FLEXIBITYLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylinenoList The collection of flexibitylineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibitylineno_InScope(Collection<java.math.BigDecimal> flexibitylinenoList) {
        doSetFlexibitylineno_InScope(flexibitylinenoList);
    }

    protected void doSetFlexibitylineno_InScope(Collection<java.math.BigDecimal> flexibitylinenoList) {
        regINS(CK_INS, cTL(flexibitylinenoList), xgetCValueFlexibitylineno(), "FLEXIBITYLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FLEXIBITYLINENO: {NotNull, decimal(16, 6)}
     * @param flexibitylinenoList The collection of flexibitylineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexibitylineno_NotInScope(Collection<java.math.BigDecimal> flexibitylinenoList) {
        doSetFlexibitylineno_NotInScope(flexibitylinenoList);
    }

    protected void doSetFlexibitylineno_NotInScope(Collection<java.math.BigDecimal> flexibitylinenoList) {
        regINS(CK_NINS, cTL(flexibitylinenoList), xgetCValueFlexibitylineno(), "FLEXIBITYLINENO");
    }

    protected void regFlexibitylineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexibitylineno(), "FLEXIBITYLINENO"); }
    protected abstract ConditionValue xgetCValueFlexibitylineno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX+, NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_Equal(java.math.BigDecimal stddifflg) {
        doSetStddifflg_Equal(stddifflg);
    }

    protected void doSetStddifflg_Equal(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_EQ, stddifflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_NotEqual(java.math.BigDecimal stddifflg) {
        doSetStddifflg_NotEqual(stddifflg);
    }

    protected void doSetStddifflg_NotEqual(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_NES, stddifflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_GreaterThan(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_GT, stddifflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_LessThan(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_LT, stddifflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_GreaterEqual(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_GE, stddifflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflg The value of stddifflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStddifflg_LessEqual(java.math.BigDecimal stddifflg) {
        regStddifflg(CK_LE, stddifflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of stddifflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stddifflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStddifflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStddifflg(), "STDDIFFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflgList The collection of stddifflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStddifflg_InScope(Collection<java.math.BigDecimal> stddifflgList) {
        doSetStddifflg_InScope(stddifflgList);
    }

    protected void doSetStddifflg_InScope(Collection<java.math.BigDecimal> stddifflgList) {
        regINS(CK_INS, cTL(stddifflgList), xgetCValueStddifflg(), "STDDIFFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STDDIFFLG: {NotNull, decimal(16, 6)}
     * @param stddifflgList The collection of stddifflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStddifflg_NotInScope(Collection<java.math.BigDecimal> stddifflgList) {
        doSetStddifflg_NotInScope(stddifflgList);
    }

    protected void doSetStddifflg_NotInScope(Collection<java.math.BigDecimal> stddifflgList) {
        regINS(CK_NINS, cTL(stddifflgList), xgetCValueStddifflg(), "STDDIFFLG");
    }

    protected void regStddifflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStddifflg(), "STDDIFFLG"); }
    protected abstract ConditionValue xgetCValueStddifflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_Equal(String flexpicklistno) {
        doSetFlexpicklistno_Equal(fRES(flexpicklistno));
    }

    protected void doSetFlexpicklistno_Equal(String flexpicklistno) {
        regFlexpicklistno(CK_EQ, flexpicklistno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_NotEqual(String flexpicklistno) {
        doSetFlexpicklistno_NotEqual(fRES(flexpicklistno));
    }

    protected void doSetFlexpicklistno_NotEqual(String flexpicklistno) {
        regFlexpicklistno(CK_NES, flexpicklistno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_GreaterThan(String flexpicklistno) {
        regFlexpicklistno(CK_GT, fRES(flexpicklistno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_LessThan(String flexpicklistno) {
        regFlexpicklistno(CK_LT, fRES(flexpicklistno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_GreaterEqual(String flexpicklistno) {
        regFlexpicklistno(CK_GE, fRES(flexpicklistno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_LessEqual(String flexpicklistno) {
        regFlexpicklistno(CK_LE, fRES(flexpicklistno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistnoList The collection of flexpicklistno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_InScope(Collection<String> flexpicklistnoList) {
        doSetFlexpicklistno_InScope(flexpicklistnoList);
    }

    protected void doSetFlexpicklistno_InScope(Collection<String> flexpicklistnoList) {
        regINS(CK_INS, cTL(flexpicklistnoList), xgetCValueFlexpicklistno(), "FLEXPICKLISTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistnoList The collection of flexpicklistno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_NotInScope(Collection<String> flexpicklistnoList) {
        doSetFlexpicklistno_NotInScope(flexpicklistnoList);
    }

    protected void doSetFlexpicklistno_NotInScope(Collection<String> flexpicklistnoList) {
        regINS(CK_NINS, cTL(flexpicklistnoList), xgetCValueFlexpicklistno(), "FLEXPICKLISTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setFlexpicklistno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flexpicklistno The value of flexpicklistno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlexpicklistno_LikeSearch(String flexpicklistno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flexpicklistno), xgetCValueFlexpicklistno(), "FLEXPICKLISTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlexpicklistno_NotLikeSearch(String flexpicklistno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flexpicklistno), xgetCValueFlexpicklistno(), "FLEXPICKLISTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLEXPICKLISTNO: {IX, NotNull, varchar(30)}
     * @param flexpicklistno The value of flexpicklistno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlexpicklistno_PrefixSearch(String flexpicklistno) {
        setFlexpicklistno_LikeSearch(flexpicklistno, xcLSOPPre());
    }

    protected void regFlexpicklistno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlexpicklistno(), "FLEXPICKLISTNO"); }
    protected abstract ConditionValue xgetCValueFlexpicklistno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_Equal(String printedflg) {
        doSetPrintedflg_Equal(fRES(printedflg));
    }

    protected void doSetPrintedflg_Equal(String printedflg) {
        regPrintedflg(CK_EQ, printedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotEqual(String printedflg) {
        doSetPrintedflg_NotEqual(fRES(printedflg));
    }

    protected void doSetPrintedflg_NotEqual(String printedflg) {
        regPrintedflg(CK_NES, printedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_InScope(Collection<String> printedflgList) {
        doSetPrintedflg_InScope(printedflgList);
    }

    protected void doSetPrintedflg_InScope(Collection<String> printedflgList) {
        regINS(CK_INS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotInScope(Collection<String> printedflgList) {
        doSetPrintedflg_NotInScope(printedflgList);
    }

    protected void doSetPrintedflg_NotInScope(Collection<String> printedflgList) {
        regINS(CK_NINS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printedflg The value of printedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintedflg_LikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_Equal(java.math.BigDecimal completeflg) {
        doSetCompleteflg_Equal(completeflg);
    }

    protected void doSetCompleteflg_Equal(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_EQ, completeflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_NotEqual(java.math.BigDecimal completeflg) {
        doSetCompleteflg_NotEqual(completeflg);
    }

    protected void doSetCompleteflg_NotEqual(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_NES, completeflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_GreaterThan(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_GT, completeflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_LessThan(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_LT, completeflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_GreaterEqual(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_GE, completeflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflg The value of completeflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompleteflg_LessEqual(java.math.BigDecimal completeflg) {
        regCompleteflg(CK_LE, completeflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param minNumber The min number of completeflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of completeflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCompleteflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCompleteflg(), "COMPLETEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflgList The collection of completeflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteflg_InScope(Collection<java.math.BigDecimal> completeflgList) {
        doSetCompleteflg_InScope(completeflgList);
    }

    protected void doSetCompleteflg_InScope(Collection<java.math.BigDecimal> completeflgList) {
        regINS(CK_INS, cTL(completeflgList), xgetCValueCompleteflg(), "COMPLETEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     * @param completeflgList The collection of completeflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompleteflg_NotInScope(Collection<java.math.BigDecimal> completeflgList) {
        doSetCompleteflg_NotInScope(completeflgList);
    }

    protected void doSetCompleteflg_NotInScope(Collection<java.math.BigDecimal> completeflgList) {
        regINS(CK_NINS, cTL(completeflgList), xgetCValueCompleteflg(), "COMPLETEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     */
    public void setCompleteflg_IsNull() { regCompleteflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPLETEFLG: {decimal(16, 6)}
     */
    public void setCompleteflg_IsNotNull() { regCompleteflg(CK_ISNN, DOBJ); }

    protected void regCompleteflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompleteflg(), "COMPLETEFLG"); }
    protected abstract ConditionValue xgetCValueCompleteflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_Equal(String manufacturedate) {
        doSetManufacturedate_Equal(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_Equal(String manufacturedate) {
        regManufacturedate(CK_EQ, manufacturedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotEqual(String manufacturedate) {
        doSetManufacturedate_NotEqual(fRES(manufacturedate));
    }

    protected void doSetManufacturedate_NotEqual(String manufacturedate) {
        regManufacturedate(CK_NES, manufacturedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterThan(String manufacturedate) {
        regManufacturedate(CK_GT, fRES(manufacturedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessThan(String manufacturedate) {
        regManufacturedate(CK_LT, fRES(manufacturedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_GreaterEqual(String manufacturedate) {
        regManufacturedate(CK_GE, fRES(manufacturedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_LessEqual(String manufacturedate) {
        regManufacturedate(CK_LE, fRES(manufacturedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_InScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_InScope(manufacturedateList);
    }

    protected void doSetManufacturedate_InScope(Collection<String> manufacturedateList) {
        regINS(CK_INS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedateList The collection of manufacturedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        doSetManufacturedate_NotInScope(manufacturedateList);
    }

    protected void doSetManufacturedate_NotInScope(Collection<String> manufacturedateList) {
        regINS(CK_NINS, cTL(manufacturedateList), xgetCValueManufacturedate(), "MANUFACTUREDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)} <br>
     * <pre>e.g. setManufacturedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturedate The value of manufacturedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturedate_LikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturedate_NotLikeSearch(String manufacturedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturedate), xgetCValueManufacturedate(), "MANUFACTUREDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     * @param manufacturedate The value of manufacturedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturedate_PrefixSearch(String manufacturedate) {
        setManufacturedate_LikeSearch(manufacturedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNull() { regManufacturedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNullOrEmpty() { regManufacturedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTUREDATE: {varchar(8)}
     */
    public void setManufacturedate_IsNotNull() { regManufacturedate(CK_ISNN, DOBJ); }

    protected void regManufacturedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturedate(), "MANUFACTUREDATE"); }
    protected abstract ConditionValue xgetCValueManufacturedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_Equal(java.math.BigDecimal qtycase) {
        doSetQtycase_Equal(qtycase);
    }

    protected void doSetQtycase_Equal(java.math.BigDecimal qtycase) {
        regQtycase(CK_EQ, qtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_NotEqual(java.math.BigDecimal qtycase) {
        doSetQtycase_NotEqual(qtycase);
    }

    protected void doSetQtycase_NotEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_NES, qtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_GT, qtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_LT, qtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_GE, qtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_LE, qtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtycase(), "QTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_InScope(qtycaseList);
    }

    protected void doSetQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_INS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_NotInScope(qtycaseList);
    }

    protected void doSetQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_NINS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    protected void regQtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtycase(), "QTYCASE"); }
    protected abstract ConditionValue xgetCValueQtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_Equal(java.math.BigDecimal qtybowl) {
        doSetQtybowl_Equal(qtybowl);
    }

    protected void doSetQtybowl_Equal(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_EQ, qtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        doSetQtybowl_NotEqual(qtybowl);
    }

    protected void doSetQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_NES, qtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GT, qtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LT, qtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GE, qtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LE, qtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtybowl(), "QTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_InScope(qtybowlList);
    }

    protected void doSetQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_INS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_NotInScope(qtybowlList);
    }

    protected void doSetQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_NINS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    protected void regQtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtybowl(), "QTYBOWL"); }
    protected abstract ConditionValue xgetCValueQtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_Equal(java.math.BigDecimal htqtycase) {
        doSetHtqtycase_Equal(htqtycase);
    }

    protected void doSetHtqtycase_Equal(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_EQ, htqtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_NotEqual(java.math.BigDecimal htqtycase) {
        doSetHtqtycase_NotEqual(htqtycase);
    }

    protected void doSetHtqtycase_NotEqual(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_NES, htqtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_GreaterThan(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_GT, htqtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_LessThan(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_LT, htqtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_GreaterEqual(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_GE, htqtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycase The value of htqtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtycase_LessEqual(java.math.BigDecimal htqtycase) {
        regHtqtycase(CK_LE, htqtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of htqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htqtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtqtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtqtycase(), "HTQTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycaseList The collection of htqtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtqtycase_InScope(Collection<java.math.BigDecimal> htqtycaseList) {
        doSetHtqtycase_InScope(htqtycaseList);
    }

    protected void doSetHtqtycase_InScope(Collection<java.math.BigDecimal> htqtycaseList) {
        regINS(CK_INS, cTL(htqtycaseList), xgetCValueHtqtycase(), "HTQTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HTQTYCASE: {NotNull, decimal(16, 6)}
     * @param htqtycaseList The collection of htqtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtqtycase_NotInScope(Collection<java.math.BigDecimal> htqtycaseList) {
        doSetHtqtycase_NotInScope(htqtycaseList);
    }

    protected void doSetHtqtycase_NotInScope(Collection<java.math.BigDecimal> htqtycaseList) {
        regINS(CK_NINS, cTL(htqtycaseList), xgetCValueHtqtycase(), "HTQTYCASE");
    }

    protected void regHtqtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtqtycase(), "HTQTYCASE"); }
    protected abstract ConditionValue xgetCValueHtqtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_Equal(java.math.BigDecimal htqtybowl) {
        doSetHtqtybowl_Equal(htqtybowl);
    }

    protected void doSetHtqtybowl_Equal(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_EQ, htqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_NotEqual(java.math.BigDecimal htqtybowl) {
        doSetHtqtybowl_NotEqual(htqtybowl);
    }

    protected void doSetHtqtybowl_NotEqual(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_NES, htqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_GreaterThan(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_GT, htqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_LessThan(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_LT, htqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_GreaterEqual(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_GE, htqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowl The value of htqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setHtqtybowl_LessEqual(java.math.BigDecimal htqtybowl) {
        regHtqtybowl(CK_LE, htqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of htqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of htqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setHtqtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueHtqtybowl(), "HTQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowlList The collection of htqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtqtybowl_InScope(Collection<java.math.BigDecimal> htqtybowlList) {
        doSetHtqtybowl_InScope(htqtybowlList);
    }

    protected void doSetHtqtybowl_InScope(Collection<java.math.BigDecimal> htqtybowlList) {
        regINS(CK_INS, cTL(htqtybowlList), xgetCValueHtqtybowl(), "HTQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * HTQTYBOWL: {NotNull, decimal(16, 6)}
     * @param htqtybowlList The collection of htqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHtqtybowl_NotInScope(Collection<java.math.BigDecimal> htqtybowlList) {
        doSetHtqtybowl_NotInScope(htqtybowlList);
    }

    protected void doSetHtqtybowl_NotInScope(Collection<java.math.BigDecimal> htqtybowlList) {
        regINS(CK_NINS, cTL(htqtybowlList), xgetCValueHtqtybowl(), "HTQTYBOWL");
    }

    protected void regHtqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHtqtybowl(), "HTQTYBOWL"); }
    protected abstract ConditionValue xgetCValueHtqtybowl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_Equal(String nvExtdata1) {
        doSetNvExtdata1_Equal(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_Equal(String nvExtdata1) {
        regNvExtdata1(CK_EQ, nvExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotEqual(String nvExtdata1) {
        doSetNvExtdata1_NotEqual(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_NotEqual(String nvExtdata1) {
        regNvExtdata1(CK_NES, nvExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterThan(String nvExtdata1) {
        regNvExtdata1(CK_GT, fRES(nvExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessThan(String nvExtdata1) {
        regNvExtdata1(CK_LT, fRES(nvExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterEqual(String nvExtdata1) {
        regNvExtdata1(CK_GE, fRES(nvExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessEqual(String nvExtdata1) {
        regNvExtdata1(CK_LE, fRES(nvExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_InScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        regINS(CK_INS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_NotInScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        regINS(CK_NINS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata1 The value of nvExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata1_LikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata1_NotLikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_PrefixSearch(String nvExtdata1) {
        setNvExtdata1_LikeSearch(nvExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNull() { regNvExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNullOrEmpty() { regNvExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNotNull() { regNvExtdata1(CK_ISNN, DOBJ); }

    protected void regNvExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata1(), "NV_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNvExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {bigint(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19)}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNull() { regSoid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNotNull() { regSoid(CK_ISNN, DOBJ); }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

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
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrflexibilitydetailCB.class);
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
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrflexibilitydetailCB.class);
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
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrflexibilitydetailCB.class);
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
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrflexibilitydetailCB.class);
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
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrflexibilitydetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrflexibilitydetailCB&gt;() {
     *     public void query(TTrflexibilitydetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrflexibilitydetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrflexibilitydetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitydetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrflexibilitydetailCQ sq);

    protected TTrflexibilitydetailCB xcreateScalarConditionCB() {
        TTrflexibilitydetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrflexibilitydetailCB xcreateScalarConditionPartitionByCB() {
        TTrflexibilitydetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrflexibilitydetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitydetailCB cb = new TTrflexibilitydetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrflexibilitydetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrflexibilitydetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrflexibilitydetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrflexibilitydetailCB cb = new TTrflexibilitydetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "FLEXIBLE_TRANSPORT_DETAIL_INFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrflexibilitydetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrflexibilitydetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrflexibilitydetailCB cb = new TTrflexibilitydetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrflexibilitydetailCQ sq);

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
    protected TTrflexibilitydetailCB newMyCB() {
        return new TTrflexibilitydetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrflexibilitydetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
