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
 * The abstract condition-query of H_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHPackingHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHPackingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_PACKING_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_Equal(Long packingHId) {
        doSetPackingHId_Equal(packingHId);
    }

    protected void doSetPackingHId_Equal(Long packingHId) {
        regPackingHId(CK_EQ, packingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_NotEqual(Long packingHId) {
        doSetPackingHId_NotEqual(packingHId);
    }

    protected void doSetPackingHId_NotEqual(Long packingHId) {
        regPackingHId(CK_NES, packingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterThan(Long packingHId) {
        regPackingHId(CK_GT, packingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessThan(Long packingHId) {
        regPackingHId(CK_LT, packingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterEqual(Long packingHId) {
        regPackingHId(CK_GE, packingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHId The value of packingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessEqual(Long packingHId) {
        regPackingHId(CK_LE, packingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingHId(), "PACKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHIdList The collection of packingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_InScope(Collection<Long> packingHIdList) {
        doSetPackingHId_InScope(packingHIdList);
    }

    protected void doSetPackingHId_InScope(Collection<Long> packingHIdList) {
        regINS(CK_INS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param packingHIdList The collection of packingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_NotInScope(Collection<Long> packingHIdList) {
        doSetPackingHId_NotInScope(packingHIdList);
    }

    protected void doSetPackingHId_NotInScope(Collection<Long> packingHIdList) {
        regINS(CK_NINS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PACKING_H_ID from H_PACKING_B where ...)} <br>
     * H_PACKING_B by PACKING_H_ID, named 'HPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HPackingBList for 'exists'. (NotNull)
     */
    public void existsHPackingBList(SubQuery<HPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_ExistsReferrer_HPackingBList(cb.query());
        registerExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "hPackingBList");
    }
    public abstract String keepPackingHId_ExistsReferrer_HPackingBList(HPackingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_H_ID from H_PACKING_B where ...)} <br>
     * H_PACKING_B by PACKING_H_ID, named 'HPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PackingHId_NotExistsReferrer_HPackingBList for 'not exists'. (NotNull)
     */
    public void notExistsHPackingBList(SubQuery<HPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_NotExistsReferrer_HPackingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "hPackingBList");
    }
    public abstract String keepPackingHId_NotExistsReferrer_HPackingBList(HPackingBCQ sq);

    public void xsderiveHPackingBList(String fn, SubQuery<HPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPackingHId_SpecifyDerivedReferrer_HPackingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "hPackingBList", al, op);
    }
    public abstract String keepPackingHId_SpecifyDerivedReferrer_HPackingBList(HPackingBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_PACKING_B where ...)} <br>
     * H_PACKING_B by PACKING_H_ID, named 'HPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHPackingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HPackingBCB> derivedHPackingBList() {
        return xcreateQDRFunctionHPackingBList();
    }
    protected HpQDRFunction<HPackingBCB> xcreateQDRFunctionHPackingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHPackingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveHPackingBList(String fn, SubQuery<HPackingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingBCB cb = new HPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPackingHId_QueryDerivedReferrer_HPackingBList(cb.query()); String prpp = keepPackingHId_QueryDerivedReferrer_HPackingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", sqpp, "hPackingBList", rd, vl, prpp, op);
    }
    public abstract String keepPackingHId_QueryDerivedReferrer_HPackingBList(HPackingBCQ sq);
    public abstract String keepPackingHId_QueryDerivedReferrer_HPackingBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingHId_IsNull() { regPackingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPackingHId_IsNotNull() { regPackingHId(CK_ISNN, DOBJ); }

    protected void regPackingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingHId(), "PACKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePackingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_Equal(Long shippingInstHId) {
        doSetShippingInstHId_Equal(shippingInstHId);
    }

    protected void doSetShippingInstHId_Equal(Long shippingInstHId) {
        regShippingInstHId(CK_EQ, shippingInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotEqual(Long shippingInstHId) {
        doSetShippingInstHId_NotEqual(shippingInstHId);
    }

    protected void doSetShippingInstHId_NotEqual(Long shippingInstHId) {
        regShippingInstHId(CK_NES, shippingInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHIdList The collection of shippingInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_InScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_INS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {IX, NotNull, bigint(19), FK to H_SHIPPING_H}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_INST_H_ID from H_SHIPPING_H where ...)} <br />
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @param subCBLambda The callback for sub-query of HShippingH for 'in-scope'. (NotNull)
     */
    public void inScopeHShippingH(SubQuery<HShippingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_InScopeRelation_HShippingH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hShippingH", false);
    }
    public abstract String keepShippingInstHId_InScopeRelation_HShippingH(HShippingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_INST_H_ID from H_SHIPPING_H where ...)} <br />
     * H_SHIPPING_H by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @param subCBLambda The callback for sub-query of HShippingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeHShippingH(SubQuery<HShippingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingInstHId_NotInScopeRelation_HShippingH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hShippingH", true);
    }
    public abstract String keepShippingInstHId_NotInScopeRelation_HShippingH(HShippingHCQ sq);

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {NotNull, bigint(19)}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_Equal(String carrierTraceNum) {
        doSetCarrierTraceNum_Equal(fRES(carrierTraceNum));
    }

    protected void doSetCarrierTraceNum_Equal(String carrierTraceNum) {
        regCarrierTraceNum(CK_EQ, carrierTraceNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_NotEqual(String carrierTraceNum) {
        doSetCarrierTraceNum_NotEqual(fRES(carrierTraceNum));
    }

    protected void doSetCarrierTraceNum_NotEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_NES, carrierTraceNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_GreaterThan(String carrierTraceNum) {
        regCarrierTraceNum(CK_GT, fRES(carrierTraceNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_LessThan(String carrierTraceNum) {
        regCarrierTraceNum(CK_LT, fRES(carrierTraceNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_GreaterEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_GE, fRES(carrierTraceNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_LessEqual(String carrierTraceNum) {
        regCarrierTraceNum(CK_LE, fRES(carrierTraceNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNumList The collection of carrierTraceNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_InScope(Collection<String> carrierTraceNumList) {
        doSetCarrierTraceNum_InScope(carrierTraceNumList);
    }

    protected void doSetCarrierTraceNum_InScope(Collection<String> carrierTraceNumList) {
        regINS(CK_INS, cTL(carrierTraceNumList), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNumList The collection of carrierTraceNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_NotInScope(Collection<String> carrierTraceNumList) {
        doSetCarrierTraceNum_NotInScope(carrierTraceNumList);
    }

    protected void doSetCarrierTraceNum_NotInScope(Collection<String> carrierTraceNumList) {
        regINS(CK_NINS, cTL(carrierTraceNumList), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)} <br>
     * <pre>e.g. setCarrierTraceNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierTraceNum The value of carrierTraceNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierTraceNum_LikeSearch(String carrierTraceNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierTraceNum), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierTraceNum_NotLikeSearch(String carrierTraceNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierTraceNum), xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     * @param carrierTraceNum The value of carrierTraceNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTraceNum_PrefixSearch(String carrierTraceNum) {
        setCarrierTraceNum_LikeSearch(carrierTraceNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNull() { regCarrierTraceNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNullOrEmpty() { regCarrierTraceNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_TRACE_NUM: {varchar(30)}
     */
    public void setCarrierTraceNum_IsNotNull() { regCarrierTraceNum(CK_ISNN, DOBJ); }

    protected void regCarrierTraceNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierTraceNum(), "CARRIER_TRACE_NUM"); }
    protected abstract ConditionValue xgetCValueCarrierTraceNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_Equal(Long boxId) {
        doSetBoxId_Equal(boxId);
    }

    protected void doSetBoxId_Equal(Long boxId) {
        regBoxId(CK_EQ, boxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_NotEqual(Long boxId) {
        doSetBoxId_NotEqual(boxId);
    }

    protected void doSetBoxId_NotEqual(Long boxId) {
        regBoxId(CK_NES, boxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxIdList The collection of boxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_InScope(Collection<Long> boxIdList) {
        doSetBoxId_InScope(boxIdList);
    }

    protected void doSetBoxId_InScope(Collection<Long> boxIdList) {
        regINS(CK_INS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {bigint(19)}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {bigint(19)}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_Equal(String boxCd) {
        doSetBoxCd_Equal(fRES(boxCd));
    }

    protected void doSetBoxCd_Equal(String boxCd) {
        regBoxCd(CK_EQ, boxCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_NotEqual(String boxCd) {
        doSetBoxCd_NotEqual(fRES(boxCd));
    }

    protected void doSetBoxCd_NotEqual(String boxCd) {
        regBoxCd(CK_NES, boxCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_GreaterThan(String boxCd) {
        regBoxCd(CK_GT, fRES(boxCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_LessThan(String boxCd) {
        regBoxCd(CK_LT, fRES(boxCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_GreaterEqual(String boxCd) {
        regBoxCd(CK_GE, fRES(boxCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_LessEqual(String boxCd) {
        regBoxCd(CK_LE, fRES(boxCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCdList The collection of boxCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_InScope(Collection<String> boxCdList) {
        doSetBoxCd_InScope(boxCdList);
    }

    protected void doSetBoxCd_InScope(Collection<String> boxCdList) {
        regINS(CK_INS, cTL(boxCdList), xgetCValueBoxCd(), "BOX_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCdList The collection of boxCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_NotInScope(Collection<String> boxCdList) {
        doSetBoxCd_NotInScope(boxCdList);
    }

    protected void doSetBoxCd_NotInScope(Collection<String> boxCdList) {
        regINS(CK_NINS, cTL(boxCdList), xgetCValueBoxCd(), "BOX_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {varchar(30)} <br>
     * <pre>e.g. setBoxCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxCd The value of boxCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxCd_LikeSearch(String boxCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxCd), xgetCValueBoxCd(), "BOX_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxCd_NotLikeSearch(String boxCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxCd), xgetCValueBoxCd(), "BOX_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_CD: {varchar(30)}
     * @param boxCd The value of boxCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxCd_PrefixSearch(String boxCd) {
        setBoxCd_LikeSearch(boxCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     */
    public void setBoxCd_IsNull() { regBoxCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     */
    public void setBoxCd_IsNullOrEmpty() { regBoxCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_CD: {varchar(30)}
     */
    public void setBoxCd_IsNotNull() { regBoxCd(CK_ISNN, DOBJ); }

    protected void regBoxCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxCd(), "BOX_CD"); }
    protected abstract ConditionValue xgetCValueBoxCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_Equal(String boxNm) {
        doSetBoxNm_Equal(fRES(boxNm));
    }

    protected void doSetBoxNm_Equal(String boxNm) {
        regBoxNm(CK_EQ, boxNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_NotEqual(String boxNm) {
        doSetBoxNm_NotEqual(fRES(boxNm));
    }

    protected void doSetBoxNm_NotEqual(String boxNm) {
        regBoxNm(CK_NES, boxNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_GreaterThan(String boxNm) {
        regBoxNm(CK_GT, fRES(boxNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_LessThan(String boxNm) {
        regBoxNm(CK_LT, fRES(boxNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_GreaterEqual(String boxNm) {
        regBoxNm(CK_GE, fRES(boxNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_LessEqual(String boxNm) {
        regBoxNm(CK_LE, fRES(boxNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNmList The collection of boxNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_InScope(Collection<String> boxNmList) {
        doSetBoxNm_InScope(boxNmList);
    }

    protected void doSetBoxNm_InScope(Collection<String> boxNmList) {
        regINS(CK_INS, cTL(boxNmList), xgetCValueBoxNm(), "BOX_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNmList The collection of boxNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_NotInScope(Collection<String> boxNmList) {
        doSetBoxNm_NotInScope(boxNmList);
    }

    protected void doSetBoxNm_NotInScope(Collection<String> boxNmList) {
        regINS(CK_NINS, cTL(boxNmList), xgetCValueBoxNm(), "BOX_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {varchar(60)} <br>
     * <pre>e.g. setBoxNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxNm The value of boxNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxNm_LikeSearch(String boxNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxNm), xgetCValueBoxNm(), "BOX_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxNm_NotLikeSearch(String boxNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxNm), xgetCValueBoxNm(), "BOX_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOX_NM: {varchar(60)}
     * @param boxNm The value of boxNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxNm_PrefixSearch(String boxNm) {
        setBoxNm_LikeSearch(boxNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     */
    public void setBoxNm_IsNull() { regBoxNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     */
    public void setBoxNm_IsNullOrEmpty() { regBoxNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_NM: {varchar(60)}
     */
    public void setBoxNm_IsNotNull() { regBoxNm(CK_ISNN, DOBJ); }

    protected void regBoxNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxNm(), "BOX_NM"); }
    protected abstract ConditionValue xgetCValueBoxNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_Equal(java.math.BigDecimal grossWeight) {
        doSetGrossWeight_Equal(grossWeight);
    }

    protected void doSetGrossWeight_Equal(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_EQ, grossWeight);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_NotEqual(java.math.BigDecimal grossWeight) {
        doSetGrossWeight_NotEqual(grossWeight);
    }

    protected void doSetGrossWeight_NotEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_NES, grossWeight);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterThan(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_GT, grossWeight);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_LessThan(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_LT, grossWeight);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_GreaterEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_GE, grossWeight);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeight The value of grossWeight as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setGrossWeight_LessEqual(java.math.BigDecimal grossWeight) {
        regGrossWeight(CK_LE, grossWeight);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param minNumber The min number of grossWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of grossWeight. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setGrossWeight_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueGrossWeight(), "GROSS_WEIGHT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeightList The collection of grossWeight as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_InScope(Collection<java.math.BigDecimal> grossWeightList) {
        doSetGrossWeight_InScope(grossWeightList);
    }

    protected void doSetGrossWeight_InScope(Collection<java.math.BigDecimal> grossWeightList) {
        regINS(CK_INS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     * @param grossWeightList The collection of grossWeight as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGrossWeight_NotInScope(Collection<java.math.BigDecimal> grossWeightList) {
        doSetGrossWeight_NotInScope(grossWeightList);
    }

    protected void doSetGrossWeight_NotInScope(Collection<java.math.BigDecimal> grossWeightList) {
        regINS(CK_NINS, cTL(grossWeightList), xgetCValueGrossWeight(), "GROSS_WEIGHT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     */
    public void setGrossWeight_IsNull() { regGrossWeight(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GROSS_WEIGHT: {decimal(16, 6)}
     */
    public void setGrossWeight_IsNotNull() { regGrossWeight(CK_ISNN, DOBJ); }

    protected void regGrossWeight(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGrossWeight(), "GROSS_WEIGHT"); }
    protected abstract ConditionValue xgetCValueGrossWeight();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_Equal(java.math.BigDecimal totalVolume) {
        doSetTotalVolume_Equal(totalVolume);
    }

    protected void doSetTotalVolume_Equal(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_EQ, totalVolume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_NotEqual(java.math.BigDecimal totalVolume) {
        doSetTotalVolume_NotEqual(totalVolume);
    }

    protected void doSetTotalVolume_NotEqual(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_NES, totalVolume);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_GreaterThan(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_GT, totalVolume);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_LessThan(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_LT, totalVolume);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_GreaterEqual(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_GE, totalVolume);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolume The value of totalVolume as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalVolume_LessEqual(java.math.BigDecimal totalVolume) {
        regTotalVolume(CK_LE, totalVolume);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param minNumber The min number of totalVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalVolume_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalVolume(), "TOTAL_VOLUME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolumeList The collection of totalVolume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalVolume_InScope(Collection<java.math.BigDecimal> totalVolumeList) {
        doSetTotalVolume_InScope(totalVolumeList);
    }

    protected void doSetTotalVolume_InScope(Collection<java.math.BigDecimal> totalVolumeList) {
        regINS(CK_INS, cTL(totalVolumeList), xgetCValueTotalVolume(), "TOTAL_VOLUME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     * @param totalVolumeList The collection of totalVolume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalVolume_NotInScope(Collection<java.math.BigDecimal> totalVolumeList) {
        doSetTotalVolume_NotInScope(totalVolumeList);
    }

    protected void doSetTotalVolume_NotInScope(Collection<java.math.BigDecimal> totalVolumeList) {
        regINS(CK_NINS, cTL(totalVolumeList), xgetCValueTotalVolume(), "TOTAL_VOLUME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     */
    public void setTotalVolume_IsNull() { regTotalVolume(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_VOLUME: {decimal(16, 6)}
     */
    public void setTotalVolume_IsNotNull() { regTotalVolume(CK_ISNN, DOBJ); }

    protected void regTotalVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalVolume(), "TOTAL_VOLUME"); }
    protected abstract ConditionValue xgetCValueTotalVolume();

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
    public HpSLCFunction<HPackingHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HPackingHCB.class);
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
    public HpSLCFunction<HPackingHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HPackingHCB.class);
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
    public HpSLCFunction<HPackingHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HPackingHCB.class);
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
    public HpSLCFunction<HPackingHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HPackingHCB.class);
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
    public HpSLCFunction<HPackingHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HPackingHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HPackingHCB&gt;() {
     *     public void query(HPackingHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HPackingHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HPackingHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HPackingHCQ sq);

    protected HPackingHCB xcreateScalarConditionCB() {
        HPackingHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HPackingHCB xcreateScalarConditionPartitionByCB() {
        HPackingHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HPackingHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HPackingHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HPackingHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HPackingHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HPackingHCQ sq);

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
    protected HPackingHCB newMyCB() {
        return new HPackingHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HPackingHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
