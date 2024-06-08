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
 * The abstract condition-query of T_TRPICKDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpickdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpickdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPICKDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_Equal(Long trpickdetailId) {
        doSetTrpickdetailId_Equal(trpickdetailId);
    }

    protected void doSetTrpickdetailId_Equal(Long trpickdetailId) {
        regTrpickdetailId(CK_EQ, trpickdetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_NotEqual(Long trpickdetailId) {
        doSetTrpickdetailId_NotEqual(trpickdetailId);
    }

    protected void doSetTrpickdetailId_NotEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_NES, trpickdetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_GreaterThan(Long trpickdetailId) {
        regTrpickdetailId(CK_GT, trpickdetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_LessThan(Long trpickdetailId) {
        regTrpickdetailId(CK_LT, trpickdetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_GreaterEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_GE, trpickdetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailId The value of trpickdetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrpickdetailId_LessEqual(Long trpickdetailId) {
        regTrpickdetailId(CK_LE, trpickdetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trpickdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trpickdetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrpickdetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailIdList The collection of trpickdetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpickdetailId_InScope(Collection<Long> trpickdetailIdList) {
        doSetTrpickdetailId_InScope(trpickdetailIdList);
    }

    protected void doSetTrpickdetailId_InScope(Collection<Long> trpickdetailIdList) {
        regINS(CK_INS, cTL(trpickdetailIdList), xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trpickdetailIdList The collection of trpickdetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrpickdetailId_NotInScope(Collection<Long> trpickdetailIdList) {
        doSetTrpickdetailId_NotInScope(trpickdetailIdList);
    }

    protected void doSetTrpickdetailId_NotInScope(Collection<Long> trpickdetailIdList) {
        regINS(CK_NINS, cTL(trpickdetailIdList), xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select TRPICKDETAIL_ID from T_TR_PICKLIST where ...)} <br>
     * T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTTrPicklistList</span>(picklistCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     picklistCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TTrPicklistList for 'exists'. (NotNull)
     */
    public void existsTTrPicklistList(SubQuery<TTrPicklistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrpickdetailId_ExistsReferrer_TTrPicklistList(cb.query());
        registerExistsReferrer(cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", pp, "tTrPicklistList");
    }
    public abstract String keepTrpickdetailId_ExistsReferrer_TTrPicklistList(TTrPicklistCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select TRPICKDETAIL_ID from T_TR_PICKLIST where ...)} <br>
     * T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTTrPicklistList</span>(picklistCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     picklistCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TrpickdetailId_NotExistsReferrer_TTrPicklistList for 'not exists'. (NotNull)
     */
    public void notExistsTTrPicklistList(SubQuery<TTrPicklistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepTrpickdetailId_NotExistsReferrer_TTrPicklistList(cb.query());
        registerNotExistsReferrer(cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", pp, "tTrPicklistList");
    }
    public abstract String keepTrpickdetailId_NotExistsReferrer_TTrPicklistList(TTrPicklistCQ sq);

    public void xsderiveTTrPicklistList(String fn, SubQuery<TTrPicklistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepTrpickdetailId_SpecifyDerivedReferrer_TTrPicklistList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", pp, "tTrPicklistList", al, op);
    }
    public abstract String keepTrpickdetailId_SpecifyDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_TR_PICKLIST where ...)} <br>
     * T_TR_PICKLIST by TRPICKDETAIL_ID, named 'TTrPicklistAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTTrPicklistList()</span>.<span style="color: #CC4747">max</span>(picklistCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     picklistCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     picklistCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TTrPicklistCB> derivedTTrPicklistList() {
        return xcreateQDRFunctionTTrPicklistList();
    }
    protected HpQDRFunction<TTrPicklistCB> xcreateQDRFunctionTTrPicklistList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTTrPicklistList(fn, sq, rd, vl, op));
    }
    public void xqderiveTTrPicklistList(String fn, SubQuery<TTrPicklistCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrPicklistCB cb = new TTrPicklistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistList(cb.query()); String prpp = keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "TRPICKDETAIL_ID", "TRPICKDETAIL_ID", sqpp, "tTrPicklistList", rd, vl, prpp, op);
    }
    public abstract String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistList(TTrPicklistCQ sq);
    public abstract String keepTrpickdetailId_QueryDerivedReferrer_TTrPicklistListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpickdetailId_IsNull() { regTrpickdetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRPICKDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrpickdetailId_IsNotNull() { regTrpickdetailId(CK_ISNN, DOBJ); }

    protected void regTrpickdetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrpickdetailId(), "TRPICKDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrpickdetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_Equal(Long trsodetailId) {
        doSetTrsodetailId_Equal(trsodetailId);
    }

    protected void doSetTrsodetailId_Equal(Long trsodetailId) {
        regTrsodetailId(CK_EQ, trsodetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotEqual(Long trsodetailId) {
        doSetTrsodetailId_NotEqual(trsodetailId);
    }

    protected void doSetTrsodetailId_NotEqual(Long trsodetailId) {
        regTrsodetailId(CK_NES, trsodetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterThan(Long trsodetailId) {
        regTrsodetailId(CK_GT, trsodetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessThan(Long trsodetailId) {
        regTrsodetailId(CK_LT, trsodetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_GreaterEqual(Long trsodetailId) {
        regTrsodetailId(CK_GE, trsodetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailId The value of trsodetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsodetailId_LessEqual(Long trsodetailId) {
        regTrsodetailId(CK_LE, trsodetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param minNumber The min number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsodetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsodetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsodetailId(), "TRSODETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailIdList The collection of trsodetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_InScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_InScope(Collection<Long> trsodetailIdList) {
        regINS(CK_INS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSODETAIL_ID: {NotNull, bigint(19), FK to T_YTRSODETAIL}
     * @param trsodetailIdList The collection of trsodetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        doSetTrsodetailId_NotInScope(trsodetailIdList);
    }

    protected void doSetTrsodetailId_NotInScope(Collection<Long> trsodetailIdList) {
        regINS(CK_NINS, cTL(trsodetailIdList), xgetCValueTrsodetailId(), "TRSODETAIL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TRSODETAIL_ID from T_YTRSODETAIL where ...)} <br />
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param subCBLambda The callback for sub-query of TYtrsodetail for 'in-scope'. (NotNull)
     */
    public void inScopeTYtrsodetail(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsodetailId_InScopeRelation_TYtrsodetail(cb.query());
        registerInScopeRelation(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tYtrsodetail", false);
    }
    public abstract String keepTrsodetailId_InScopeRelation_TYtrsodetail(TYtrsodetailCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TRSODETAIL_ID from T_YTRSODETAIL where ...)} <br />
     * T_YTRSODETAIL by my TRSODETAIL_ID, named 'TYtrsodetail'.
     * @param subCBLambda The callback for sub-query of TYtrsodetail for 'not in-scope'. (NotNull)
     */
    public void notInScopeTYtrsodetail(SubQuery<TYtrsodetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TYtrsodetailCB cb = new TYtrsodetailCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTrsodetailId_NotInScopeRelation_TYtrsodetail(cb.query());
        registerInScopeRelation(cb.query(), "TRSODETAIL_ID", "TRSODETAIL_ID", pp, "tYtrsodetail", true);
    }
    public abstract String keepTrsodetailId_NotInScopeRelation_TYtrsodetail(TYtrsodetailCQ sq);

    protected void regTrsodetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsodetailId(), "TRSODETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrsodetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_Equal(Long moveInstHId) {
        doSetMoveInstHId_Equal(moveInstHId);
    }

    protected void doSetMoveInstHId_Equal(Long moveInstHId) {
        regMoveInstHId(CK_EQ, moveInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_NotEqual(Long moveInstHId) {
        doSetMoveInstHId_NotEqual(moveInstHId);
    }

    protected void doSetMoveInstHId_NotEqual(Long moveInstHId) {
        regMoveInstHId(CK_NES, moveInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterThan(Long moveInstHId) {
        regMoveInstHId(CK_GT, moveInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessThan(Long moveInstHId) {
        regMoveInstHId(CK_LT, moveInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_GreaterEqual(Long moveInstHId) {
        regMoveInstHId(CK_GE, moveInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHId The value of moveInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveInstHId_LessEqual(Long moveInstHId) {
        regMoveInstHId(CK_LE, moveInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveInstHId(), "MOVE_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHIdList The collection of moveInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstHId_InScope(Collection<Long> moveInstHIdList) {
        doSetMoveInstHId_InScope(moveInstHIdList);
    }

    protected void doSetMoveInstHId_InScope(Collection<Long> moveInstHIdList) {
        regINS(CK_INS, cTL(moveInstHIdList), xgetCValueMoveInstHId(), "MOVE_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVE_INST_H_ID: {NotNull, bigint(19)}
     * @param moveInstHIdList The collection of moveInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveInstHId_NotInScope(Collection<Long> moveInstHIdList) {
        doSetMoveInstHId_NotInScope(moveInstHIdList);
    }

    protected void doSetMoveInstHId_NotInScope(Collection<Long> moveInstHIdList) {
        regINS(CK_NINS, cTL(moveInstHIdList), xgetCValueMoveInstHId(), "MOVE_INST_H_ID");
    }

    protected void regMoveInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveInstHId(), "MOVE_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueMoveInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {NotNull, bigint(19), FK to T_STOCK}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from T_STOCK where ...)} <br />
     * T_STOCK by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, bigint(19), FK to M_LOCATION}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOCATION_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOCATION_ID from M_LOCATION where ...)} <br />
     * M_LOCATION by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_Equal(Long pickBatchKey) {
        doSetPickBatchKey_Equal(pickBatchKey);
    }

    protected void doSetPickBatchKey_Equal(Long pickBatchKey) {
        regPickBatchKey(CK_EQ, pickBatchKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotEqual(Long pickBatchKey) {
        doSetPickBatchKey_NotEqual(pickBatchKey);
    }

    protected void doSetPickBatchKey_NotEqual(Long pickBatchKey) {
        regPickBatchKey(CK_NES, pickBatchKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterThan(Long pickBatchKey) {
        regPickBatchKey(CK_GT, pickBatchKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessThan(Long pickBatchKey) {
        regPickBatchKey(CK_LT, pickBatchKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_GreaterEqual(Long pickBatchKey) {
        regPickBatchKey(CK_GE, pickBatchKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKey The value of pickBatchKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchKey_LessEqual(Long pickBatchKey) {
        regPickBatchKey(CK_LE, pickBatchKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param minNumber The min number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickBatchKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickBatchKey(), "PICK_BATCH_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_InScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_InScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_INS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     * @param pickBatchKeyList The collection of pickBatchKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        doSetPickBatchKey_NotInScope(pickBatchKeyList);
    }

    protected void doSetPickBatchKey_NotInScope(Collection<Long> pickBatchKeyList) {
        regINS(CK_NINS, cTL(pickBatchKeyList), xgetCValuePickBatchKey(), "PICK_BATCH_KEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPickBatchKey_IsNull() { regPickBatchKey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPickBatchKey_IsNotNull() { regPickBatchKey(CK_ISNN, DOBJ); }

    protected void regPickBatchKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickBatchKey(), "PICK_BATCH_KEY"); }
    protected abstract ConditionValue xgetCValuePickBatchKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_Equal(Long pickBatchLineNo) {
        doSetPickBatchLineNo_Equal(pickBatchLineNo);
    }

    protected void doSetPickBatchLineNo_Equal(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_EQ, pickBatchLineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_NotEqual(Long pickBatchLineNo) {
        doSetPickBatchLineNo_NotEqual(pickBatchLineNo);
    }

    protected void doSetPickBatchLineNo_NotEqual(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_NES, pickBatchLineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_GreaterThan(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_GT, pickBatchLineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_LessThan(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_LT, pickBatchLineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_GreaterEqual(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_GE, pickBatchLineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNo The value of pickBatchLineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_LessEqual(Long pickBatchLineNo) {
        regPickBatchLineNo(CK_LE, pickBatchLineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param minNumber The min number of pickBatchLineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickBatchLineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickBatchLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickBatchLineNo(), "PICK_BATCH_LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNoList The collection of pickBatchLineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_InScope(Collection<Long> pickBatchLineNoList) {
        doSetPickBatchLineNo_InScope(pickBatchLineNoList);
    }

    protected void doSetPickBatchLineNo_InScope(Collection<Long> pickBatchLineNoList) {
        regINS(CK_INS, cTL(pickBatchLineNoList), xgetCValuePickBatchLineNo(), "PICK_BATCH_LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     * @param pickBatchLineNoList The collection of pickBatchLineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickBatchLineNo_NotInScope(Collection<Long> pickBatchLineNoList) {
        doSetPickBatchLineNo_NotInScope(pickBatchLineNoList);
    }

    protected void doSetPickBatchLineNo_NotInScope(Collection<Long> pickBatchLineNoList) {
        regINS(CK_NINS, cTL(pickBatchLineNoList), xgetCValuePickBatchLineNo(), "PICK_BATCH_LINE_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     */
    public void setPickBatchLineNo_IsNull() { regPickBatchLineNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_BATCH_LINE_NO: {bigint(19)}
     */
    public void setPickBatchLineNo_IsNotNull() { regPickBatchLineNo(CK_ISNN, DOBJ); }

    protected void regPickBatchLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickBatchLineNo(), "PICK_BATCH_LINE_NO"); }
    protected abstract ConditionValue xgetCValuePickBatchLineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX, NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_Equal(String ifitemCd) {
        doSetIfitemCd_Equal(fRES(ifitemCd));
    }

    protected void doSetIfitemCd_Equal(String ifitemCd) {
        regIfitemCd(CK_EQ, ifitemCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_NotEqual(String ifitemCd) {
        doSetIfitemCd_NotEqual(fRES(ifitemCd));
    }

    protected void doSetIfitemCd_NotEqual(String ifitemCd) {
        regIfitemCd(CK_NES, ifitemCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_GreaterThan(String ifitemCd) {
        regIfitemCd(CK_GT, fRES(ifitemCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_LessThan(String ifitemCd) {
        regIfitemCd(CK_LT, fRES(ifitemCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_GreaterEqual(String ifitemCd) {
        regIfitemCd(CK_GE, fRES(ifitemCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_LessEqual(String ifitemCd) {
        regIfitemCd(CK_LE, fRES(ifitemCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCdList The collection of ifitemCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_InScope(Collection<String> ifitemCdList) {
        doSetIfitemCd_InScope(ifitemCdList);
    }

    protected void doSetIfitemCd_InScope(Collection<String> ifitemCdList) {
        regINS(CK_INS, cTL(ifitemCdList), xgetCValueIfitemCd(), "IFITEM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCdList The collection of ifitemCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_NotInScope(Collection<String> ifitemCdList) {
        doSetIfitemCd_NotInScope(ifitemCdList);
    }

    protected void doSetIfitemCd_NotInScope(Collection<String> ifitemCdList) {
        regINS(CK_NINS, cTL(ifitemCdList), xgetCValueIfitemCd(), "IFITEM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)} <br>
     * <pre>e.g. setIfitemCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ifitemCd The value of ifitemCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIfitemCd_LikeSearch(String ifitemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ifitemCd), xgetCValueIfitemCd(), "IFITEM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIfitemCd_NotLikeSearch(String ifitemCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ifitemCd), xgetCValueIfitemCd(), "IFITEM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     * @param ifitemCd The value of ifitemCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIfitemCd_PrefixSearch(String ifitemCd) {
        setIfitemCd_LikeSearch(ifitemCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNull() { regIfitemCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNullOrEmpty() { regIfitemCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IFITEM_CD: {varchar(30)}
     */
    public void setIfitemCd_IsNotNull() { regIfitemCd(CK_ISNN, DOBJ); }

    protected void regIfitemCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIfitemCd(), "IFITEM_CD"); }
    protected abstract ConditionValue xgetCValueIfitemCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {IX, NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {IX, NotNull, varchar(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_Equal(Long expectQty) {
        doSetExpectQty_Equal(expectQty);
    }

    protected void doSetExpectQty_Equal(Long expectQty) {
        regExpectQty(CK_EQ, expectQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_NotEqual(Long expectQty) {
        doSetExpectQty_NotEqual(expectQty);
    }

    protected void doSetExpectQty_NotEqual(Long expectQty) {
        regExpectQty(CK_NES, expectQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterThan(Long expectQty) {
        regExpectQty(CK_GT, expectQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessThan(Long expectQty) {
        regExpectQty(CK_LT, expectQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_GreaterEqual(Long expectQty) {
        regExpectQty(CK_GE, expectQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQty The value of expectQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectQty_LessEqual(Long expectQty) {
        regExpectQty(CK_LE, expectQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectQty(), "EXPECT_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQtyList The collection of expectQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_InScope(Collection<Long> expectQtyList) {
        doSetExpectQty_InScope(expectQtyList);
    }

    protected void doSetExpectQty_InScope(Collection<Long> expectQtyList) {
        regINS(CK_INS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECT_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param expectQtyList The collection of expectQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectQty_NotInScope(Collection<Long> expectQtyList) {
        doSetExpectQty_NotInScope(expectQtyList);
    }

    protected void doSetExpectQty_NotInScope(Collection<Long> expectQtyList) {
        regINS(CK_NINS, cTL(expectQtyList), xgetCValueExpectQty(), "EXPECT_QTY");
    }

    protected void regExpectQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectQty(), "EXPECT_QTY"); }
    protected abstract ConditionValue xgetCValueExpectQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_Equal(Long pickedQty) {
        doSetPickedQty_Equal(pickedQty);
    }

    protected void doSetPickedQty_Equal(Long pickedQty) {
        regPickedQty(CK_EQ, pickedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_NotEqual(Long pickedQty) {
        doSetPickedQty_NotEqual(pickedQty);
    }

    protected void doSetPickedQty_NotEqual(Long pickedQty) {
        regPickedQty(CK_NES, pickedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_GreaterThan(Long pickedQty) {
        regPickedQty(CK_GT, pickedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_LessThan(Long pickedQty) {
        regPickedQty(CK_LT, pickedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_GreaterEqual(Long pickedQty) {
        regPickedQty(CK_GE, pickedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQty The value of pickedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedQty_LessEqual(Long pickedQty) {
        regPickedQty(CK_LE, pickedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of pickedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedQty(), "PICKED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQtyList The collection of pickedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedQty_InScope(Collection<Long> pickedQtyList) {
        doSetPickedQty_InScope(pickedQtyList);
    }

    protected void doSetPickedQty_InScope(Collection<Long> pickedQtyList) {
        regINS(CK_INS, cTL(pickedQtyList), xgetCValuePickedQty(), "PICKED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param pickedQtyList The collection of pickedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedQty_NotInScope(Collection<Long> pickedQtyList) {
        doSetPickedQty_NotInScope(pickedQtyList);
    }

    protected void doSetPickedQty_NotInScope(Collection<Long> pickedQtyList) {
        regINS(CK_NINS, cTL(pickedQtyList), xgetCValuePickedQty(), "PICKED_QTY");
    }

    protected void regPickedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedQty(), "PICKED_QTY"); }
    protected abstract ConditionValue xgetCValuePickedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_Equal(Long sortedQty) {
        doSetSortedQty_Equal(sortedQty);
    }

    protected void doSetSortedQty_Equal(Long sortedQty) {
        regSortedQty(CK_EQ, sortedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_NotEqual(Long sortedQty) {
        doSetSortedQty_NotEqual(sortedQty);
    }

    protected void doSetSortedQty_NotEqual(Long sortedQty) {
        regSortedQty(CK_NES, sortedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterThan(Long sortedQty) {
        regSortedQty(CK_GT, sortedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessThan(Long sortedQty) {
        regSortedQty(CK_LT, sortedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_GreaterEqual(Long sortedQty) {
        regSortedQty(CK_GE, sortedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQty The value of sortedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedQty_LessEqual(Long sortedQty) {
        regSortedQty(CK_LE, sortedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedQty(), "SORTED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQtyList The collection of sortedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_InScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_InScope(sortedQtyList);
    }

    protected void doSetSortedQty_InScope(Collection<Long> sortedQtyList) {
        regINS(CK_INS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param sortedQtyList The collection of sortedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        doSetSortedQty_NotInScope(sortedQtyList);
    }

    protected void doSetSortedQty_NotInScope(Collection<Long> sortedQtyList) {
        regINS(CK_NINS, cTL(sortedQtyList), xgetCValueSortedQty(), "SORTED_QTY");
    }

    protected void regSortedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedQty(), "SORTED_QTY"); }
    protected abstract ConditionValue xgetCValueSortedQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_Equal(Long shippedQty) {
        doSetShippedQty_Equal(shippedQty);
    }

    protected void doSetShippedQty_Equal(Long shippedQty) {
        regShippedQty(CK_EQ, shippedQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_NotEqual(Long shippedQty) {
        doSetShippedQty_NotEqual(shippedQty);
    }

    protected void doSetShippedQty_NotEqual(Long shippedQty) {
        regShippedQty(CK_NES, shippedQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_GreaterThan(Long shippedQty) {
        regShippedQty(CK_GT, shippedQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_LessThan(Long shippedQty) {
        regShippedQty(CK_LT, shippedQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_GreaterEqual(Long shippedQty) {
        regShippedQty(CK_GE, shippedQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQty The value of shippedQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippedQty_LessEqual(Long shippedQty) {
        regShippedQty(CK_LE, shippedQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of shippedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippedQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippedQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippedQty(), "SHIPPED_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQtyList The collection of shippedQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedQty_InScope(Collection<Long> shippedQtyList) {
        doSetShippedQty_InScope(shippedQtyList);
    }

    protected void doSetShippedQty_InScope(Collection<Long> shippedQtyList) {
        regINS(CK_INS, cTL(shippedQtyList), xgetCValueShippedQty(), "SHIPPED_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPED_QTY: {NotNull, bigint(19), default=[(0)]}
     * @param shippedQtyList The collection of shippedQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippedQty_NotInScope(Collection<Long> shippedQtyList) {
        doSetShippedQty_NotInScope(shippedQtyList);
    }

    protected void doSetShippedQty_NotInScope(Collection<Long> shippedQtyList) {
        regINS(CK_NINS, cTL(shippedQtyList), xgetCValueShippedQty(), "SHIPPED_QTY");
    }

    protected void regShippedQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippedQty(), "SHIPPED_QTY"); }
    protected abstract ConditionValue xgetCValueShippedQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_Equal(String pickUserCd) {
        doSetPickUserCd_Equal(fRES(pickUserCd));
    }

    protected void doSetPickUserCd_Equal(String pickUserCd) {
        regPickUserCd(CK_EQ, pickUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_NotEqual(String pickUserCd) {
        doSetPickUserCd_NotEqual(fRES(pickUserCd));
    }

    protected void doSetPickUserCd_NotEqual(String pickUserCd) {
        regPickUserCd(CK_NES, pickUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_GreaterThan(String pickUserCd) {
        regPickUserCd(CK_GT, fRES(pickUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_LessThan(String pickUserCd) {
        regPickUserCd(CK_LT, fRES(pickUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_GreaterEqual(String pickUserCd) {
        regPickUserCd(CK_GE, fRES(pickUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_LessEqual(String pickUserCd) {
        regPickUserCd(CK_LE, fRES(pickUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCdList The collection of pickUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_InScope(Collection<String> pickUserCdList) {
        doSetPickUserCd_InScope(pickUserCdList);
    }

    protected void doSetPickUserCd_InScope(Collection<String> pickUserCdList) {
        regINS(CK_INS, cTL(pickUserCdList), xgetCValuePickUserCd(), "PICK_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCdList The collection of pickUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_NotInScope(Collection<String> pickUserCdList) {
        doSetPickUserCd_NotInScope(pickUserCdList);
    }

    protected void doSetPickUserCd_NotInScope(Collection<String> pickUserCdList) {
        regINS(CK_NINS, cTL(pickUserCdList), xgetCValuePickUserCd(), "PICK_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_USER_CD: {varchar(30)} <br>
     * <pre>e.g. setPickUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickUserCd The value of pickUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickUserCd_LikeSearch(String pickUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickUserCd), xgetCValuePickUserCd(), "PICK_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickUserCd_NotLikeSearch(String pickUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickUserCd), xgetCValuePickUserCd(), "PICK_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     * @param pickUserCd The value of pickUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickUserCd_PrefixSearch(String pickUserCd) {
        setPickUserCd_LikeSearch(pickUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     */
    public void setPickUserCd_IsNull() { regPickUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     */
    public void setPickUserCd_IsNullOrEmpty() { regPickUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICK_USER_CD: {varchar(30)}
     */
    public void setPickUserCd_IsNotNull() { regPickUserCd(CK_ISNN, DOBJ); }

    protected void regPickUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickUserCd(), "PICK_USER_CD"); }
    protected abstract ConditionValue xgetCValuePickUserCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_Equal(Long labelPrintedFlg) {
        doSetLabelPrintedFlg_Equal(labelPrintedFlg);
    }

    protected void doSetLabelPrintedFlg_Equal(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_EQ, labelPrintedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_NotEqual(Long labelPrintedFlg) {
        doSetLabelPrintedFlg_NotEqual(labelPrintedFlg);
    }

    protected void doSetLabelPrintedFlg_NotEqual(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_NES, labelPrintedFlg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_GreaterThan(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_GT, labelPrintedFlg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_LessThan(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_LT, labelPrintedFlg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_GreaterEqual(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_GE, labelPrintedFlg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlg The value of labelPrintedFlg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_LessEqual(Long labelPrintedFlg) {
        regLabelPrintedFlg(CK_LE, labelPrintedFlg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of labelPrintedFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of labelPrintedFlg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLabelPrintedFlg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLabelPrintedFlg(), "LABEL_PRINTED_FLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlgList The collection of labelPrintedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_InScope(Collection<Long> labelPrintedFlgList) {
        doSetLabelPrintedFlg_InScope(labelPrintedFlgList);
    }

    protected void doSetLabelPrintedFlg_InScope(Collection<Long> labelPrintedFlgList) {
        regINS(CK_INS, cTL(labelPrintedFlgList), xgetCValueLabelPrintedFlg(), "LABEL_PRINTED_FLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LABEL_PRINTED_FLG: {IX, NotNull, bigint(19), default=[(0)]}
     * @param labelPrintedFlgList The collection of labelPrintedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedFlg_NotInScope(Collection<Long> labelPrintedFlgList) {
        doSetLabelPrintedFlg_NotInScope(labelPrintedFlgList);
    }

    protected void doSetLabelPrintedFlg_NotInScope(Collection<Long> labelPrintedFlgList) {
        regINS(CK_NINS, cTL(labelPrintedFlgList), xgetCValueLabelPrintedFlg(), "LABEL_PRINTED_FLG");
    }

    protected void regLabelPrintedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLabelPrintedFlg(), "LABEL_PRINTED_FLG"); }
    protected abstract ConditionValue xgetCValueLabelPrintedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_Equal(String monthFlg) {
        doSetMonthFlg_Equal(fRES(monthFlg));
    }

    protected void doSetMonthFlg_Equal(String monthFlg) {
        regMonthFlg(CK_EQ, monthFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_NotEqual(String monthFlg) {
        doSetMonthFlg_NotEqual(fRES(monthFlg));
    }

    protected void doSetMonthFlg_NotEqual(String monthFlg) {
        regMonthFlg(CK_NES, monthFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_GreaterThan(String monthFlg) {
        regMonthFlg(CK_GT, fRES(monthFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_LessThan(String monthFlg) {
        regMonthFlg(CK_LT, fRES(monthFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_GreaterEqual(String monthFlg) {
        regMonthFlg(CK_GE, fRES(monthFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_LessEqual(String monthFlg) {
        regMonthFlg(CK_LE, fRES(monthFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlgList The collection of monthFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_InScope(Collection<String> monthFlgList) {
        doSetMonthFlg_InScope(monthFlgList);
    }

    protected void doSetMonthFlg_InScope(Collection<String> monthFlgList) {
        regINS(CK_INS, cTL(monthFlgList), xgetCValueMonthFlg(), "MONTH_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlgList The collection of monthFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_NotInScope(Collection<String> monthFlgList) {
        doSetMonthFlg_NotInScope(monthFlgList);
    }

    protected void doSetMonthFlg_NotInScope(Collection<String> monthFlgList) {
        regINS(CK_NINS, cTL(monthFlgList), xgetCValueMonthFlg(), "MONTH_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)} <br>
     * <pre>e.g. setMonthFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param monthFlg The value of monthFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMonthFlg_LikeSearch(String monthFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(monthFlg), xgetCValueMonthFlg(), "MONTH_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMonthFlg_NotLikeSearch(String monthFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(monthFlg), xgetCValueMonthFlg(), "MONTH_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     * @param monthFlg The value of monthFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMonthFlg_PrefixSearch(String monthFlg) {
        setMonthFlg_LikeSearch(monthFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNull() { regMonthFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNullOrEmpty() { regMonthFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MONTH_FLG: {varchar(30)}
     */
    public void setMonthFlg_IsNotNull() { regMonthFlg(CK_ISNN, DOBJ); }

    protected void regMonthFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMonthFlg(), "MONTH_FLG"); }
    protected abstract ConditionValue xgetCValueMonthFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_Equal(Long plBatchKey) {
        doSetPlBatchKey_Equal(plBatchKey);
    }

    protected void doSetPlBatchKey_Equal(Long plBatchKey) {
        regPlBatchKey(CK_EQ, plBatchKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_NotEqual(Long plBatchKey) {
        doSetPlBatchKey_NotEqual(plBatchKey);
    }

    protected void doSetPlBatchKey_NotEqual(Long plBatchKey) {
        regPlBatchKey(CK_NES, plBatchKey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_GreaterThan(Long plBatchKey) {
        regPlBatchKey(CK_GT, plBatchKey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_LessThan(Long plBatchKey) {
        regPlBatchKey(CK_LT, plBatchKey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_GreaterEqual(Long plBatchKey) {
        regPlBatchKey(CK_GE, plBatchKey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKey The value of plBatchKey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlBatchKey_LessEqual(Long plBatchKey) {
        regPlBatchKey(CK_LE, plBatchKey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param minNumber The min number of plBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of plBatchKey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlBatchKey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlBatchKey(), "PL_BATCH_KEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKeyList The collection of plBatchKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlBatchKey_InScope(Collection<Long> plBatchKeyList) {
        doSetPlBatchKey_InScope(plBatchKeyList);
    }

    protected void doSetPlBatchKey_InScope(Collection<Long> plBatchKeyList) {
        regINS(CK_INS, cTL(plBatchKeyList), xgetCValuePlBatchKey(), "PL_BATCH_KEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     * @param plBatchKeyList The collection of plBatchKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlBatchKey_NotInScope(Collection<Long> plBatchKeyList) {
        doSetPlBatchKey_NotInScope(plBatchKeyList);
    }

    protected void doSetPlBatchKey_NotInScope(Collection<Long> plBatchKeyList) {
        regINS(CK_NINS, cTL(plBatchKeyList), xgetCValuePlBatchKey(), "PL_BATCH_KEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPlBatchKey_IsNull() { regPlBatchKey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL_BATCH_KEY: {IX, bigint(19)}
     */
    public void setPlBatchKey_IsNotNull() { regPlBatchKey(CK_ISNN, DOBJ); }

    protected void regPlBatchKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlBatchKey(), "PL_BATCH_KEY"); }
    protected abstract ConditionValue xgetCValuePlBatchKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_Equal(String workallocatename) {
        doSetWorkallocatename_Equal(fRES(workallocatename));
    }

    protected void doSetWorkallocatename_Equal(String workallocatename) {
        regWorkallocatename(CK_EQ, workallocatename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_NotEqual(String workallocatename) {
        doSetWorkallocatename_NotEqual(fRES(workallocatename));
    }

    protected void doSetWorkallocatename_NotEqual(String workallocatename) {
        regWorkallocatename(CK_NES, workallocatename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_GreaterThan(String workallocatename) {
        regWorkallocatename(CK_GT, fRES(workallocatename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_LessThan(String workallocatename) {
        regWorkallocatename(CK_LT, fRES(workallocatename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_GreaterEqual(String workallocatename) {
        regWorkallocatename(CK_GE, fRES(workallocatename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_LessEqual(String workallocatename) {
        regWorkallocatename(CK_LE, fRES(workallocatename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatenameList The collection of workallocatename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_InScope(Collection<String> workallocatenameList) {
        doSetWorkallocatename_InScope(workallocatenameList);
    }

    protected void doSetWorkallocatename_InScope(Collection<String> workallocatenameList) {
        regINS(CK_INS, cTL(workallocatenameList), xgetCValueWorkallocatename(), "WORKALLOCATENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatenameList The collection of workallocatename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_NotInScope(Collection<String> workallocatenameList) {
        doSetWorkallocatename_NotInScope(workallocatenameList);
    }

    protected void doSetWorkallocatename_NotInScope(Collection<String> workallocatenameList) {
        regINS(CK_NINS, cTL(workallocatenameList), xgetCValueWorkallocatename(), "WORKALLOCATENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)} <br>
     * <pre>e.g. setWorkallocatename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workallocatename The value of workallocatename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkallocatename_LikeSearch(String workallocatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workallocatename), xgetCValueWorkallocatename(), "WORKALLOCATENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkallocatename_NotLikeSearch(String workallocatename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workallocatename), xgetCValueWorkallocatename(), "WORKALLOCATENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     * @param workallocatename The value of workallocatename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocatename_PrefixSearch(String workallocatename) {
        setWorkallocatename_LikeSearch(workallocatename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     */
    public void setWorkallocatename_IsNull() { regWorkallocatename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     */
    public void setWorkallocatename_IsNullOrEmpty() { regWorkallocatename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATENAME: {varchar(255)}
     */
    public void setWorkallocatename_IsNotNull() { regWorkallocatename(CK_ISNN, DOBJ); }

    protected void regWorkallocatename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocatename(), "WORKALLOCATENAME"); }
    protected abstract ConditionValue xgetCValueWorkallocatename();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_Equal(Long alertflg) {
        doSetAlertflg_Equal(alertflg);
    }

    protected void doSetAlertflg_Equal(Long alertflg) {
        regAlertflg(CK_EQ, alertflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_NotEqual(Long alertflg) {
        doSetAlertflg_NotEqual(alertflg);
    }

    protected void doSetAlertflg_NotEqual(Long alertflg) {
        regAlertflg(CK_NES, alertflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_GreaterThan(Long alertflg) {
        regAlertflg(CK_GT, alertflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_LessThan(Long alertflg) {
        regAlertflg(CK_LT, alertflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_GreaterEqual(Long alertflg) {
        regAlertflg(CK_GE, alertflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflg The value of alertflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAlertflg_LessEqual(Long alertflg) {
        regAlertflg(CK_LE, alertflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param minNumber The min number of alertflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of alertflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAlertflg_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAlertflg(), "ALERTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflgList The collection of alertflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertflg_InScope(Collection<Long> alertflgList) {
        doSetAlertflg_InScope(alertflgList);
    }

    protected void doSetAlertflg_InScope(Collection<Long> alertflgList) {
        regINS(CK_INS, cTL(alertflgList), xgetCValueAlertflg(), "ALERTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALERTFLG: {NotNull, bigint(19), default=[(0)]}
     * @param alertflgList The collection of alertflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAlertflg_NotInScope(Collection<Long> alertflgList) {
        doSetAlertflg_NotInScope(alertflgList);
    }

    protected void doSetAlertflg_NotInScope(Collection<Long> alertflgList) {
        regINS(CK_NINS, cTL(alertflgList), xgetCValueAlertflg(), "ALERTFLG");
    }

    protected void regAlertflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAlertflg(), "ALERTFLG"); }
    protected abstract ConditionValue xgetCValueAlertflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_Equal(String reverseFlg) {
        doSetReverseFlg_Equal(fRES(reverseFlg));
    }

    protected void doSetReverseFlg_Equal(String reverseFlg) {
        regReverseFlg(CK_EQ, reverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_NotEqual(String reverseFlg) {
        doSetReverseFlg_NotEqual(fRES(reverseFlg));
    }

    protected void doSetReverseFlg_NotEqual(String reverseFlg) {
        regReverseFlg(CK_NES, reverseFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_GreaterThan(String reverseFlg) {
        regReverseFlg(CK_GT, fRES(reverseFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_LessThan(String reverseFlg) {
        regReverseFlg(CK_LT, fRES(reverseFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_GreaterEqual(String reverseFlg) {
        regReverseFlg(CK_GE, fRES(reverseFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_LessEqual(String reverseFlg) {
        regReverseFlg(CK_LE, fRES(reverseFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlgList The collection of reverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_InScope(Collection<String> reverseFlgList) {
        doSetReverseFlg_InScope(reverseFlgList);
    }

    protected void doSetReverseFlg_InScope(Collection<String> reverseFlgList) {
        regINS(CK_INS, cTL(reverseFlgList), xgetCValueReverseFlg(), "REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlgList The collection of reverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_NotInScope(Collection<String> reverseFlgList) {
        doSetReverseFlg_NotInScope(reverseFlgList);
    }

    protected void doSetReverseFlg_NotInScope(Collection<String> reverseFlgList) {
        regINS(CK_NINS, cTL(reverseFlgList), xgetCValueReverseFlg(), "REVERSE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_FLG: {char(1)} <br>
     * <pre>e.g. setReverseFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reverseFlg The value of reverseFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReverseFlg_LikeSearch(String reverseFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reverseFlg), xgetCValueReverseFlg(), "REVERSE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReverseFlg_NotLikeSearch(String reverseFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reverseFlg), xgetCValueReverseFlg(), "REVERSE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_FLG: {char(1)}
     * @param reverseFlg The value of reverseFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseFlg_PrefixSearch(String reverseFlg) {
        setReverseFlg_LikeSearch(reverseFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     */
    public void setReverseFlg_IsNull() { regReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REVERSE_FLG: {char(1)}
     */
    public void setReverseFlg_IsNotNull() { regReverseFlg(CK_ISNN, DOBJ); }

    protected void regReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReverseFlg(), "REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_Equal(String reverseListOutputFlg) {
        doSetReverseListOutputFlg_Equal(fRES(reverseListOutputFlg));
    }

    protected void doSetReverseListOutputFlg_Equal(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_EQ, reverseListOutputFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_NotEqual(String reverseListOutputFlg) {
        doSetReverseListOutputFlg_NotEqual(fRES(reverseListOutputFlg));
    }

    protected void doSetReverseListOutputFlg_NotEqual(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_NES, reverseListOutputFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_GreaterThan(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_GT, fRES(reverseListOutputFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_LessThan(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_LT, fRES(reverseListOutputFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_GreaterEqual(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_GE, fRES(reverseListOutputFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_LessEqual(String reverseListOutputFlg) {
        regReverseListOutputFlg(CK_LE, fRES(reverseListOutputFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlgList The collection of reverseListOutputFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_InScope(Collection<String> reverseListOutputFlgList) {
        doSetReverseListOutputFlg_InScope(reverseListOutputFlgList);
    }

    protected void doSetReverseListOutputFlg_InScope(Collection<String> reverseListOutputFlgList) {
        regINS(CK_INS, cTL(reverseListOutputFlgList), xgetCValueReverseListOutputFlg(), "REVERSE_LIST_OUTPUT__FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlgList The collection of reverseListOutputFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_NotInScope(Collection<String> reverseListOutputFlgList) {
        doSetReverseListOutputFlg_NotInScope(reverseListOutputFlgList);
    }

    protected void doSetReverseListOutputFlg_NotInScope(Collection<String> reverseListOutputFlgList) {
        regINS(CK_NINS, cTL(reverseListOutputFlgList), xgetCValueReverseListOutputFlg(), "REVERSE_LIST_OUTPUT__FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)} <br>
     * <pre>e.g. setReverseListOutputFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reverseListOutputFlg The value of reverseListOutputFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReverseListOutputFlg_LikeSearch(String reverseListOutputFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reverseListOutputFlg), xgetCValueReverseListOutputFlg(), "REVERSE_LIST_OUTPUT__FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReverseListOutputFlg_NotLikeSearch(String reverseListOutputFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reverseListOutputFlg), xgetCValueReverseListOutputFlg(), "REVERSE_LIST_OUTPUT__FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     * @param reverseListOutputFlg The value of reverseListOutputFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReverseListOutputFlg_PrefixSearch(String reverseListOutputFlg) {
        setReverseListOutputFlg_LikeSearch(reverseListOutputFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     */
    public void setReverseListOutputFlg_IsNull() { regReverseListOutputFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REVERSE_LIST_OUTPUT__FLG: {char(1)}
     */
    public void setReverseListOutputFlg_IsNotNull() { regReverseListOutputFlg(CK_ISNN, DOBJ); }

    protected void regReverseListOutputFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReverseListOutputFlg(), "REVERSE_LIST_OUTPUT__FLG"); }
    protected abstract ConditionValue xgetCValueReverseListOutputFlg();

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
    public HpSLCFunction<TTrpickdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpickdetailCB.class);
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
    public HpSLCFunction<TTrpickdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpickdetailCB.class);
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
    public HpSLCFunction<TTrpickdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpickdetailCB.class);
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
    public HpSLCFunction<TTrpickdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpickdetailCB.class);
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
    public HpSLCFunction<TTrpickdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpickdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpickdetailCB&gt;() {
     *     public void query(TTrpickdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpickdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpickdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpickdetailCQ sq);

    protected TTrpickdetailCB xcreateScalarConditionCB() {
        TTrpickdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpickdetailCB xcreateScalarConditionPartitionByCB() {
        TTrpickdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpickdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRPICKDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpickdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpickdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpickdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRPICKDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpickdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpickdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickdetailCB cb = new TTrpickdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpickdetailCQ sq);

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
    protected TTrpickdetailCB newMyCB() {
        return new TTrpickdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpickdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
