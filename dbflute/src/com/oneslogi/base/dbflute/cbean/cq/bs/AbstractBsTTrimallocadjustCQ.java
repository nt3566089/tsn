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
 * The abstract condition-query of T_TRIMALLOCADJUST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrimallocadjustCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrimallocadjustCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRIMALLOCADJUST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_Equal(Long trimallocadjustId) {
        doSetTrimallocadjustId_Equal(trimallocadjustId);
    }

    protected void doSetTrimallocadjustId_Equal(Long trimallocadjustId) {
        regTrimallocadjustId(CK_EQ, trimallocadjustId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_NotEqual(Long trimallocadjustId) {
        doSetTrimallocadjustId_NotEqual(trimallocadjustId);
    }

    protected void doSetTrimallocadjustId_NotEqual(Long trimallocadjustId) {
        regTrimallocadjustId(CK_NES, trimallocadjustId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_GreaterThan(Long trimallocadjustId) {
        regTrimallocadjustId(CK_GT, trimallocadjustId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_LessThan(Long trimallocadjustId) {
        regTrimallocadjustId(CK_LT, trimallocadjustId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_GreaterEqual(Long trimallocadjustId) {
        regTrimallocadjustId(CK_GE, trimallocadjustId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustId The value of trimallocadjustId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_LessEqual(Long trimallocadjustId) {
        regTrimallocadjustId(CK_LE, trimallocadjustId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trimallocadjustId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocadjustId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocadjustId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocadjustId(), "TRIMALLOCADJUST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustIdList The collection of trimallocadjustId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_InScope(Collection<Long> trimallocadjustIdList) {
        doSetTrimallocadjustId_InScope(trimallocadjustIdList);
    }

    protected void doSetTrimallocadjustId_InScope(Collection<Long> trimallocadjustIdList) {
        regINS(CK_INS, cTL(trimallocadjustIdList), xgetCValueTrimallocadjustId(), "TRIMALLOCADJUST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trimallocadjustIdList The collection of trimallocadjustId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocadjustId_NotInScope(Collection<Long> trimallocadjustIdList) {
        doSetTrimallocadjustId_NotInScope(trimallocadjustIdList);
    }

    protected void doSetTrimallocadjustId_NotInScope(Collection<Long> trimallocadjustIdList) {
        regINS(CK_NINS, cTL(trimallocadjustIdList), xgetCValueTrimallocadjustId(), "TRIMALLOCADJUST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocadjustId_IsNull() { regTrimallocadjustId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRIMALLOCADJUST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrimallocadjustId_IsNotNull() { regTrimallocadjustId(CK_ISNN, DOBJ); }

    protected void regTrimallocadjustId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocadjustId(), "TRIMALLOCADJUST_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocadjustId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_Equal(Long trimallocstockId) {
        doSetTrimallocstockId_Equal(trimallocstockId);
    }

    protected void doSetTrimallocstockId_Equal(Long trimallocstockId) {
        regTrimallocstockId(CK_EQ, trimallocstockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_NotEqual(Long trimallocstockId) {
        doSetTrimallocstockId_NotEqual(trimallocstockId);
    }

    protected void doSetTrimallocstockId_NotEqual(Long trimallocstockId) {
        regTrimallocstockId(CK_NES, trimallocstockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_GreaterThan(Long trimallocstockId) {
        regTrimallocstockId(CK_GT, trimallocstockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_LessThan(Long trimallocstockId) {
        regTrimallocstockId(CK_LT, trimallocstockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_GreaterEqual(Long trimallocstockId) {
        regTrimallocstockId(CK_GE, trimallocstockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockId The value of trimallocstockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocstockId_LessEqual(Long trimallocstockId) {
        regTrimallocstockId(CK_LE, trimallocstockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param minNumber The min number of trimallocstockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocstockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocstockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocstockId(), "TRIMALLOCSTOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockIdList The collection of trimallocstockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocstockId_InScope(Collection<Long> trimallocstockIdList) {
        doSetTrimallocstockId_InScope(trimallocstockIdList);
    }

    protected void doSetTrimallocstockId_InScope(Collection<Long> trimallocstockIdList) {
        regINS(CK_INS, cTL(trimallocstockIdList), xgetCValueTrimallocstockId(), "TRIMALLOCSTOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSTOCK_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSTOCK}
     * @param trimallocstockIdList The collection of trimallocstockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocstockId_NotInScope(Collection<Long> trimallocstockIdList) {
        doSetTrimallocstockId_NotInScope(trimallocstockIdList);
    }

    protected void doSetTrimallocstockId_NotInScope(Collection<Long> trimallocstockIdList) {
        regINS(CK_NINS, cTL(trimallocstockIdList), xgetCValueTrimallocstockId(), "TRIMALLOCSTOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRIMALLOCSTOCK_ID from T_TRIMALLOCSTOCK where ...)} <br />
     * T_TRIMALLOCSTOCK by my TRIMALLOCSTOCK_ID, named 'TTrimallocstock'.
     * @param subCBLambda The callback for sub-query of TTrimallocstock for 'in-scope'. (NotNull)
     */
    public void inScopeTTrimallocstock(SubQuery<TTrimallocstockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocstockId_InScopeRelation_TTrimallocstock(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOCSTOCK_ID", "TRIMALLOCSTOCK_ID", pp, "tTrimallocstock", false);
    }
    public abstract String keepTrimallocstockId_InScopeRelation_TTrimallocstock(TTrimallocstockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRIMALLOCSTOCK_ID from T_TRIMALLOCSTOCK where ...)} <br />
     * T_TRIMALLOCSTOCK by my TRIMALLOCSTOCK_ID, named 'TTrimallocstock'.
     * @param subCBLambda The callback for sub-query of TTrimallocstock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrimallocstock(SubQuery<TTrimallocstockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocstockCB cb = new TTrimallocstockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocstockId_NotInScopeRelation_TTrimallocstock(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOCSTOCK_ID", "TRIMALLOCSTOCK_ID", pp, "tTrimallocstock", true);
    }
    public abstract String keepTrimallocstockId_NotInScopeRelation_TTrimallocstock(TTrimallocstockCQ sq);

    protected void regTrimallocstockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocstockId(), "TRIMALLOCSTOCK_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocstockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_Equal(Long trimallocschId) {
        doSetTrimallocschId_Equal(trimallocschId);
    }

    protected void doSetTrimallocschId_Equal(Long trimallocschId) {
        regTrimallocschId(CK_EQ, trimallocschId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_NotEqual(Long trimallocschId) {
        doSetTrimallocschId_NotEqual(trimallocschId);
    }

    protected void doSetTrimallocschId_NotEqual(Long trimallocschId) {
        regTrimallocschId(CK_NES, trimallocschId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_GreaterThan(Long trimallocschId) {
        regTrimallocschId(CK_GT, trimallocschId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_LessThan(Long trimallocschId) {
        regTrimallocschId(CK_LT, trimallocschId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_GreaterEqual(Long trimallocschId) {
        regTrimallocschId(CK_GE, trimallocschId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschId The value of trimallocschId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrimallocschId_LessEqual(Long trimallocschId) {
        regTrimallocschId(CK_LE, trimallocschId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param minNumber The min number of trimallocschId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trimallocschId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrimallocschId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschIdList The collection of trimallocschId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocschId_InScope(Collection<Long> trimallocschIdList) {
        doSetTrimallocschId_InScope(trimallocschIdList);
    }

    protected void doSetTrimallocschId_InScope(Collection<Long> trimallocschIdList) {
        regINS(CK_INS, cTL(trimallocschIdList), xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRIMALLOCSCH_ID: {NotNull, bigint(19), FK to T_TRIMALLOCSCHKRI}
     * @param trimallocschIdList The collection of trimallocschId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrimallocschId_NotInScope(Collection<Long> trimallocschIdList) {
        doSetTrimallocschId_NotInScope(trimallocschIdList);
    }

    protected void doSetTrimallocschId_NotInScope(Collection<Long> trimallocschIdList) {
        regINS(CK_NINS, cTL(trimallocschIdList), xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRIMALLOCSCH_ID from T_TRIMALLOCSCHKRI where ...)} <br />
     * T_TRIMALLOCSCHKRI by my TRIMALLOCSCH_ID, named 'TTrimallocschkri'.
     * @param subCBLambda The callback for sub-query of TTrimallocschkri for 'in-scope'. (NotNull)
     */
    public void inScopeTTrimallocschkri(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocschId_InScopeRelation_TTrimallocschkri(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", pp, "tTrimallocschkri", false);
    }
    public abstract String keepTrimallocschId_InScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRIMALLOCSCH_ID from T_TRIMALLOCSCHKRI where ...)} <br />
     * T_TRIMALLOCSCHKRI by my TRIMALLOCSCH_ID, named 'TTrimallocschkri'.
     * @param subCBLambda The callback for sub-query of TTrimallocschkri for 'not in-scope'. (NotNull)
     */
    public void notInScopeTTrimallocschkri(SubQuery<TTrimallocschkriCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocschkriCB cb = new TTrimallocschkriCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrimallocschId_NotInScopeRelation_TTrimallocschkri(cb.query());
        registerInScopeRelation(cb.query(), "TRIMALLOCSCH_ID", "TRIMALLOCSCH_ID", pp, "tTrimallocschkri", true);
    }
    public abstract String keepTrimallocschId_NotInScopeRelation_TTrimallocschkri(TTrimallocschkriCQ sq);

    protected void regTrimallocschId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrimallocschId(), "TRIMALLOCSCH_ID"); }
    protected abstract ConditionValue xgetCValueTrimallocschId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_Equal(Long allocImpKey) {
        doSetAllocImpKey_Equal(allocImpKey);
    }

    protected void doSetAllocImpKey_Equal(Long allocImpKey) {
        regAllocImpKey(CK_EQ, allocImpKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotEqual(Long allocImpKey) {
        doSetAllocImpKey_NotEqual(allocImpKey);
    }

    protected void doSetAllocImpKey_NotEqual(Long allocImpKey) {
        regAllocImpKey(CK_NES, allocImpKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterThan(Long allocImpKey) {
        regAllocImpKey(CK_GT, allocImpKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessThan(Long allocImpKey) {
        regAllocImpKey(CK_LT, allocImpKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_GreaterEqual(Long allocImpKey) {
        regAllocImpKey(CK_GE, allocImpKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKey The value of allocImpKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocImpKey_LessEqual(Long allocImpKey) {
        regAllocImpKey(CK_LE, allocImpKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param minNumber The min number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocImpKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocImpKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_InScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_InScope(Collection<Long> allocImpKeyList) {
        regINS(CK_INS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_IMP_KEY: {NotNull, bigint(19)}
     * @param allocImpKeyList The collection of allocImpKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        doSetAllocImpKey_NotInScope(allocImpKeyList);
    }

    protected void doSetAllocImpKey_NotInScope(Collection<Long> allocImpKeyList) {
        regINS(CK_NINS, cTL(allocImpKeyList), xgetCValueAllocImpKey(), "ALLOC_IMP_KEY");
    }

    protected void regAllocImpKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocImpKey(), "ALLOC_IMP_KEY"); }
    protected abstract ConditionValue xgetCValueAllocImpKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_Equal(Long alcImpResgNo) {
        doSetAlcImpResgNo_Equal(alcImpResgNo);
    }

    protected void doSetAlcImpResgNo_Equal(Long alcImpResgNo) {
        regAlcImpResgNo(CK_EQ, alcImpResgNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_NotEqual(Long alcImpResgNo) {
        doSetAlcImpResgNo_NotEqual(alcImpResgNo);
    }

    protected void doSetAlcImpResgNo_NotEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_NES, alcImpResgNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_GreaterThan(Long alcImpResgNo) {
        regAlcImpResgNo(CK_GT, alcImpResgNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_LessThan(Long alcImpResgNo) {
        regAlcImpResgNo(CK_LT, alcImpResgNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_GreaterEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_GE, alcImpResgNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNo The value of alcImpResgNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_LessEqual(Long alcImpResgNo) {
        regAlcImpResgNo(CK_LE, alcImpResgNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of alcImpResgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alcImpResgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlcImpResgNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNoList The collection of alcImpResgNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_InScope(Collection<Long> alcImpResgNoList) {
        doSetAlcImpResgNo_InScope(alcImpResgNoList);
    }

    protected void doSetAlcImpResgNo_InScope(Collection<Long> alcImpResgNoList) {
        regINS(CK_INS, cTL(alcImpResgNoList), xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_RESG_NO: {NotNull, bigint(19)}
     * @param alcImpResgNoList The collection of alcImpResgNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpResgNo_NotInScope(Collection<Long> alcImpResgNoList) {
        doSetAlcImpResgNo_NotInScope(alcImpResgNoList);
    }

    protected void doSetAlcImpResgNo_NotInScope(Collection<Long> alcImpResgNoList) {
        regINS(CK_NINS, cTL(alcImpResgNoList), xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_NO");
    }

    protected void regAlcImpResgNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlcImpResgNo(), "ALC_IMP_RESG_NO"); }
    protected abstract ConditionValue xgetCValueAlcImpResgNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_Equal(Long alcImpStkgNo) {
        doSetAlcImpStkgNo_Equal(alcImpStkgNo);
    }

    protected void doSetAlcImpStkgNo_Equal(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_EQ, alcImpStkgNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_NotEqual(Long alcImpStkgNo) {
        doSetAlcImpStkgNo_NotEqual(alcImpStkgNo);
    }

    protected void doSetAlcImpStkgNo_NotEqual(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_NES, alcImpStkgNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_GreaterThan(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_GT, alcImpStkgNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_LessThan(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_LT, alcImpStkgNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_GreaterEqual(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_GE, alcImpStkgNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNo The value of alcImpStkgNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_LessEqual(Long alcImpStkgNo) {
        regAlcImpStkgNo(CK_LE, alcImpStkgNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of alcImpStkgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alcImpStkgNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlcImpStkgNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlcImpStkgNo(), "ALC_IMP_STKG_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNoList The collection of alcImpStkgNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_InScope(Collection<Long> alcImpStkgNoList) {
        doSetAlcImpStkgNo_InScope(alcImpStkgNoList);
    }

    protected void doSetAlcImpStkgNo_InScope(Collection<Long> alcImpStkgNoList) {
        regINS(CK_INS, cTL(alcImpStkgNoList), xgetCValueAlcImpStkgNo(), "ALC_IMP_STKG_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALC_IMP_STKG_NO: {NotNull, bigint(19)}
     * @param alcImpStkgNoList The collection of alcImpStkgNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlcImpStkgNo_NotInScope(Collection<Long> alcImpStkgNoList) {
        doSetAlcImpStkgNo_NotInScope(alcImpStkgNoList);
    }

    protected void doSetAlcImpStkgNo_NotInScope(Collection<Long> alcImpStkgNoList) {
        regINS(CK_NINS, cTL(alcImpStkgNoList), xgetCValueAlcImpStkgNo(), "ALC_IMP_STKG_NO");
    }

    protected void regAlcImpStkgNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlcImpStkgNo(), "ALC_IMP_STKG_NO"); }
    protected abstract ConditionValue xgetCValueAlcImpStkgNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_Equal(Long adjustedQty) {
        doSetAdjustedQty_Equal(adjustedQty);
    }

    protected void doSetAdjustedQty_Equal(Long adjustedQty) {
        regAdjustedQty(CK_EQ, adjustedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_NotEqual(Long adjustedQty) {
        doSetAdjustedQty_NotEqual(adjustedQty);
    }

    protected void doSetAdjustedQty_NotEqual(Long adjustedQty) {
        regAdjustedQty(CK_NES, adjustedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_GreaterThan(Long adjustedQty) {
        regAdjustedQty(CK_GT, adjustedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_LessThan(Long adjustedQty) {
        regAdjustedQty(CK_LT, adjustedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_GreaterEqual(Long adjustedQty) {
        regAdjustedQty(CK_GE, adjustedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQty The value of adjustedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdjustedQty_LessEqual(Long adjustedQty) {
        regAdjustedQty(CK_LE, adjustedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of adjustedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adjustedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdjustedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdjustedQty(), "ADJUSTED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQtyList The collection of adjustedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedQty_InScope(Collection<Long> adjustedQtyList) {
        doSetAdjustedQty_InScope(adjustedQtyList);
    }

    protected void doSetAdjustedQty_InScope(Collection<Long> adjustedQtyList) {
        regINS(CK_INS, cTL(adjustedQtyList), xgetCValueAdjustedQty(), "ADJUSTED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADJUSTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param adjustedQtyList The collection of adjustedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdjustedQty_NotInScope(Collection<Long> adjustedQtyList) {
        doSetAdjustedQty_NotInScope(adjustedQtyList);
    }

    protected void doSetAdjustedQty_NotInScope(Collection<Long> adjustedQtyList) {
        regINS(CK_NINS, cTL(adjustedQtyList), xgetCValueAdjustedQty(), "ADJUSTED_QTY");
    }

    protected void regAdjustedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdjustedQty(), "ADJUSTED_QTY"); }
    protected abstract ConditionValue xgetCValueAdjustedQty();

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
    public HpSLCFunction<TTrimallocadjustCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrimallocadjustCB.class);
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
    public HpSLCFunction<TTrimallocadjustCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrimallocadjustCB.class);
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
    public HpSLCFunction<TTrimallocadjustCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrimallocadjustCB.class);
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
    public HpSLCFunction<TTrimallocadjustCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrimallocadjustCB.class);
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
    public HpSLCFunction<TTrimallocadjustCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrimallocadjustCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrimallocadjustCB&gt;() {
     *     public void query(TTrimallocadjustCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrimallocadjustCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrimallocadjustCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocadjustCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrimallocadjustCQ sq);

    protected TTrimallocadjustCB xcreateScalarConditionCB() {
        TTrimallocadjustCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrimallocadjustCB xcreateScalarConditionPartitionByCB() {
        TTrimallocadjustCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrimallocadjustCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRIMALLOCADJUST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrimallocadjustCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrimallocadjustCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrimallocadjustCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRIMALLOCADJUST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrimallocadjustCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrimallocadjustCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrimallocadjustCB cb = new TTrimallocadjustCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrimallocadjustCQ sq);

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
    protected TTrimallocadjustCB newMyCB() {
        return new TTrimallocadjustCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrimallocadjustCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
