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
 * The abstract condition-query of T_PACKING_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPackingHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPackingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_PACKING_H";
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
     * {exists (select PACKING_H_ID from T_PACKING_B where ...)} <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingBList for 'exists'. (NotNull)
     */
    public void existsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_ExistsReferrer_TPackingBList(cb.query());
        registerExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingBList");
    }
    public abstract String keepPackingHId_ExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PACKING_H_ID from T_PACKING_R where ...)} <br>
     * T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPackingRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPackingRAsOne for 'exists'. (NotNull)
     */
    public void existsTPackingRAsOne(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_ExistsReferrer_TPackingRAsOne(cb.query());
        registerExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingRAsOne");
    }
    public abstract String keepPackingHId_ExistsReferrer_TPackingRAsOne(TPackingRCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PACKING_H_ID from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdCartList</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdCartList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdCartList(SubQuery<TPicMthdRcmdCartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_ExistsReferrer_TPicMthdRcmdCartList(cb.query());
        registerExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPicMthdRcmdCartList");
    }
    public abstract String keepPackingHId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_H_ID from T_PACKING_B where ...)} <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PackingHId_NotExistsReferrer_TPackingBList for 'not exists'. (NotNull)
     */
    public void notExistsTPackingBList(SubQuery<TPackingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_NotExistsReferrer_TPackingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingBList");
    }
    public abstract String keepPackingHId_NotExistsReferrer_TPackingBList(TPackingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_H_ID from T_PACKING_R where ...)} <br>
     * T_PACKING_R by PACKING_H_ID, named 'TPackingRAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPackingRAsOne</span>(rCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     rCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PackingHId_NotExistsReferrer_TPackingRAsOne for 'not exists'. (NotNull)
     */
    public void notExistsTPackingRAsOne(SubQuery<TPackingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingRCB cb = new TPackingRCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_NotExistsReferrer_TPackingRAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingRAsOne");
    }
    public abstract String keepPackingHId_NotExistsReferrer_TPackingRAsOne(TPackingRCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PACKING_H_ID from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdCartList</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PackingHId_NotExistsReferrer_TPicMthdRcmdCartList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdCartList(SubQuery<TPicMthdRcmdCartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPackingHId_NotExistsReferrer_TPicMthdRcmdCartList(cb.query());
        registerNotExistsReferrer(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPicMthdRcmdCartList");
    }
    public abstract String keepPackingHId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    public void xsderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPackingHId_SpecifyDerivedReferrer_TPackingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingBList", al, op);
    }
    public abstract String keepPackingHId_SpecifyDerivedReferrer_TPackingBList(TPackingBCQ sq);

    public void xsderiveTPicMthdRcmdCartList(String fn, SubQuery<TPicMthdRcmdCartCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPackingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPicMthdRcmdCartList", al, op);
    }
    public abstract String keepPackingHId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PACKING_B where ...)} <br>
     * T_PACKING_B by PACKING_H_ID, named 'TPackingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPackingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPackingBCB> derivedTPackingBList() {
        return xcreateQDRFunctionTPackingBList();
    }
    protected HpQDRFunction<TPackingBCB> xcreateQDRFunctionTPackingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPackingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPackingBList(String fn, SubQuery<TPackingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingBCB cb = new TPackingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPackingHId_QueryDerivedReferrer_TPackingBList(cb.query()); String prpp = keepPackingHId_QueryDerivedReferrer_TPackingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", sqpp, "tPackingBList", rd, vl, prpp, op);
    }
    public abstract String keepPackingHId_QueryDerivedReferrer_TPackingBList(TPackingBCQ sq);
    public abstract String keepPackingHId_QueryDerivedReferrer_TPackingBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PACKING_H_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdCartList()</span>.<span style="color: #CC4747">max</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cartCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCartCB> derivedTPicMthdRcmdCartList() {
        return xcreateQDRFunctionTPicMthdRcmdCartList();
    }
    protected HpQDRFunction<TPicMthdRcmdCartCB> xcreateQDRFunctionTPicMthdRcmdCartList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdCartList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdCartList(String fn, SubQuery<TPicMthdRcmdCartCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartList(cb.query()); String prpp = keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PACKING_H_ID", "PACKING_H_ID", sqpp, "tPicMthdRcmdCartList", rd, vl, prpp, op);
    }
    public abstract String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);
    public abstract String keepPackingHId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object vl);

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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {NotNull, bigint(19), FK to M_CLIENT}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from M_CLIENT where ...)} <br />
     * M_CLIENT by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {NotNull, bigint(19), FK to M_CENTER}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from M_CENTER where ...)} <br />
     * M_CENTER by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
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
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
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
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
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
     * PROCESS_TYPE_ID: {IX, NotNull, bigint(19), FK to M_PROCESS_TYPE}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'in-scope'. (NotNull)
     */
    public void inScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_InScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", false);
    }
    public abstract String keepProcessTypeId_InScopeRelation_MProcessType(MProcessTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PROCESS_TYPE_ID from M_PROCESS_TYPE where ...)} <br />
     * M_PROCESS_TYPE by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @param subCBLambda The callback for sub-query of MProcessType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProcessType(SubQuery<MProcessTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProcessTypeCB cb = new MProcessTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProcessTypeId_NotInScopeRelation_MProcessType(cb.query());
        registerInScopeRelation(cb.query(), "PROCESS_TYPE_ID", "PROCESS_TYPE_ID", pp, "mProcessType", true);
    }
    public abstract String keepProcessTypeId_NotInScopeRelation_MProcessType(MProcessTypeCQ sq);

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @param packingStatus The value of packingStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_Equal(String packingStatus) {
        doSetPackingStatus_Equal(fRES(packingStatus));
    }

    /**
     * Equal(=). As PackingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus cdef) {
        doSetPackingStatus_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setPackingStatus_Equal_$10() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$10);
    }

    /**
     * Equal(=). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setPackingStatus_Equal_$15() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$15);
    }

    /**
     * Equal(=). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setPackingStatus_Equal_$20() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$20);
    }

    /**
     * Equal(=). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setPackingStatus_Equal_$25() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$25);
    }

    /**
     * Equal(=). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setPackingStatus_Equal_$30() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$30);
    }

    /**
     * Equal(=). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setPackingStatus_Equal_$35() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$35);
    }

    /**
     * Equal(=). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setPackingStatus_Equal_$40() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$40);
    }

    /**
     * Equal(=). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setPackingStatus_Equal_$45() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$45);
    }

    /**
     * Equal(=). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setPackingStatus_Equal_$50() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$50);
    }

    /**
     * Equal(=). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setPackingStatus_Equal_$55() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$55);
    }

    /**
     * Equal(=). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setPackingStatus_Equal_$90() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$90);
    }

    /**
     * Equal(=). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setPackingStatus_Equal_$99() {
        setPackingStatus_Equal_AsPackingStatus(CDef.PackingStatus.$99);
    }

    protected void doSetPackingStatus_Equal(String packingStatus) {
        regPackingStatus(CK_EQ, packingStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @param packingStatus The value of packingStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_NotEqual(String packingStatus) {
        doSetPackingStatus_NotEqual(fRES(packingStatus));
    }

    /**
     * NotEqual(&lt;&gt;). As PackingStatus. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus cdef) {
        doSetPackingStatus_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $10 (10). And OnlyOnceRegistered. <br>
     * $10: 未出荷
     */
    public void setPackingStatus_NotEqual_$10() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$10);
    }

    /**
     * NotEqual(&lt;&gt;). As $15 (15). And OnlyOnceRegistered. <br>
     * $15: 出庫指示中
     */
    public void setPackingStatus_NotEqual_$15() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$15);
    }

    /**
     * NotEqual(&lt;&gt;). As $20 (20). And OnlyOnceRegistered. <br>
     * $20: 出庫指示解除中
     */
    public void setPackingStatus_NotEqual_$20() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$20);
    }

    /**
     * NotEqual(&lt;&gt;). As $25 (25). And OnlyOnceRegistered. <br>
     * $25: 出庫指示済
     */
    public void setPackingStatus_NotEqual_$25() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$25);
    }

    /**
     * NotEqual(&lt;&gt;). As $30 (30). And OnlyOnceRegistered. <br>
     * $30: ピッキング中
     */
    public void setPackingStatus_NotEqual_$30() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$30);
    }

    /**
     * NotEqual(&lt;&gt;). As $35 (35). And OnlyOnceRegistered. <br>
     * $35: ピッキング済
     */
    public void setPackingStatus_NotEqual_$35() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$35);
    }

    /**
     * NotEqual(&lt;&gt;). As $40 (40). And OnlyOnceRegistered. <br>
     * $40: 出荷検品中
     */
    public void setPackingStatus_NotEqual_$40() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$40);
    }

    /**
     * NotEqual(&lt;&gt;). As $45 (45). And OnlyOnceRegistered. <br>
     * $45: 出荷検品中断
     */
    public void setPackingStatus_NotEqual_$45() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$45);
    }

    /**
     * NotEqual(&lt;&gt;). As $50 (50). And OnlyOnceRegistered. <br>
     * $50: 出荷検品済
     */
    public void setPackingStatus_NotEqual_$50() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$50);
    }

    /**
     * NotEqual(&lt;&gt;). As $55 (55). And OnlyOnceRegistered. <br>
     * $55: 出荷確定済
     */
    public void setPackingStatus_NotEqual_$55() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$55);
    }

    /**
     * NotEqual(&lt;&gt;). As $90 (90). And OnlyOnceRegistered. <br>
     * $90: キャンセル
     */
    public void setPackingStatus_NotEqual_$90() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$90);
    }

    /**
     * NotEqual(&lt;&gt;). As $99 (99). And OnlyOnceRegistered. <br>
     * $99: エラー有
     */
    public void setPackingStatus_NotEqual_$99() {
        setPackingStatus_NotEqual_AsPackingStatus(CDef.PackingStatus.$99);
    }

    protected void doSetPackingStatus_NotEqual(String packingStatus) {
        regPackingStatus(CK_NES, packingStatus);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @param packingStatusList The collection of packingStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_InScope(Collection<String> packingStatusList) {
        doSetPackingStatus_InScope(packingStatusList);
    }

    /**
     * InScope {in ('a', 'b')}. As PackingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_InScope_AsPackingStatus(Collection<CDef.PackingStatus> cdefList) {
        doSetPackingStatus_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingStatus_InScope(Collection<String> packingStatusList) {
        regINS(CK_INS, cTL(packingStatusList), xgetCValuePackingStatus(), "PACKING_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     * @param packingStatusList The collection of packingStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_NotInScope(Collection<String> packingStatusList) {
        doSetPackingStatus_NotInScope(packingStatusList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PackingStatus. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus} <br>
     * 梱包ステータス
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingStatus_NotInScope_AsPackingStatus(Collection<CDef.PackingStatus> cdefList) {
        doSetPackingStatus_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingStatus_NotInScope(Collection<String> packingStatusList) {
        regINS(CK_NINS, cTL(packingStatusList), xgetCValuePackingStatus(), "PACKING_STATUS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     */
    public void setPackingStatus_IsNull() { regPackingStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     */
    public void setPackingStatus_IsNullOrEmpty() { regPackingStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_STATUS: {varchar(30), FK to B_CLASS_DTL, classification=PackingStatus}
     */
    public void setPackingStatus_IsNotNull() { regPackingStatus(CK_ISNN, DOBJ); }

    protected void regPackingStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingStatus(), "PACKING_STATUS"); }
    protected abstract ConditionValue xgetCValuePackingStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ALLOC_INST_H_ID from T_ALLOC_INST_H where ...)} <br />
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'in-scope'. (NotNull)
     */
    public void inScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_InScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", false);
    }
    public abstract String keepAllocInstHId_InScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ALLOC_INST_H_ID from T_ALLOC_INST_H where ...)} <br />
     * T_ALLOC_INST_H by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @param subCBLambda The callback for sub-query of TAllocInstH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTAllocInstH(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepAllocInstHId_NotInScopeRelation_TAllocInstH(cb.query());
        registerInScopeRelation(cb.query(), "ALLOC_INST_H_ID", "ALLOC_INST_H_ID", pp, "tAllocInstH", true);
    }
    public abstract String keepAllocInstHId_NotInScopeRelation_TAllocInstH(TAllocInstHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     */
    public void setAllocInstHId_IsNull() { regAllocInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, bigint(19), FK to T_ALLOC_INST_H}
     */
    public void setAllocInstHId_IsNotNull() { regAllocInstHId(CK_ISNN, DOBJ); }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_Equal(Long pickingHId) {
        doSetPickingHId_Equal(pickingHId);
    }

    protected void doSetPickingHId_Equal(Long pickingHId) {
        regPickingHId(CK_EQ, pickingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_NotEqual(Long pickingHId) {
        doSetPickingHId_NotEqual(pickingHId);
    }

    protected void doSetPickingHId_NotEqual(Long pickingHId) {
        regPickingHId(CK_NES, pickingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_InScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_InScope(pickingHIdList);
    }

    protected void doSetPickingHId_InScope(Collection<Long> pickingHIdList) {
        regINS(CK_INS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_InScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", false);
    }
    public abstract String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_NotInScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", true);
    }
    public abstract String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     */
    public void setPickingHId_IsNull() { regPickingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {IX, bigint(19), FK to T_PICKING_H}
     */
    public void setPickingHId_IsNotNull() { regPickingHId(CK_ISNN, DOBJ); }

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_Equal(String shippingPackingNo) {
        doSetShippingPackingNo_Equal(fRES(shippingPackingNo));
    }

    protected void doSetShippingPackingNo_Equal(String shippingPackingNo) {
        regShippingPackingNo(CK_EQ, shippingPackingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_NotEqual(String shippingPackingNo) {
        doSetShippingPackingNo_NotEqual(fRES(shippingPackingNo));
    }

    protected void doSetShippingPackingNo_NotEqual(String shippingPackingNo) {
        regShippingPackingNo(CK_NES, shippingPackingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_GreaterThan(String shippingPackingNo) {
        regShippingPackingNo(CK_GT, fRES(shippingPackingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_LessThan(String shippingPackingNo) {
        regShippingPackingNo(CK_LT, fRES(shippingPackingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_GreaterEqual(String shippingPackingNo) {
        regShippingPackingNo(CK_GE, fRES(shippingPackingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_LessEqual(String shippingPackingNo) {
        regShippingPackingNo(CK_LE, fRES(shippingPackingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNoList The collection of shippingPackingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_InScope(Collection<String> shippingPackingNoList) {
        doSetShippingPackingNo_InScope(shippingPackingNoList);
    }

    protected void doSetShippingPackingNo_InScope(Collection<String> shippingPackingNoList) {
        regINS(CK_INS, cTL(shippingPackingNoList), xgetCValueShippingPackingNo(), "SHIPPING_PACKING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNoList The collection of shippingPackingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_NotInScope(Collection<String> shippingPackingNoList) {
        doSetShippingPackingNo_NotInScope(shippingPackingNoList);
    }

    protected void doSetShippingPackingNo_NotInScope(Collection<String> shippingPackingNoList) {
        regINS(CK_NINS, cTL(shippingPackingNoList), xgetCValueShippingPackingNo(), "SHIPPING_PACKING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)} <br>
     * <pre>e.g. setShippingPackingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingPackingNo The value of shippingPackingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingPackingNo_LikeSearch(String shippingPackingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingPackingNo), xgetCValueShippingPackingNo(), "SHIPPING_PACKING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingPackingNo_NotLikeSearch(String shippingPackingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingPackingNo), xgetCValueShippingPackingNo(), "SHIPPING_PACKING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     * @param shippingPackingNo The value of shippingPackingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPackingNo_PrefixSearch(String shippingPackingNo) {
        setShippingPackingNo_LikeSearch(shippingPackingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     */
    public void setShippingPackingNo_IsNull() { regShippingPackingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     */
    public void setShippingPackingNo_IsNullOrEmpty() { regShippingPackingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PACKING_NO: {varchar(30)}
     */
    public void setShippingPackingNo_IsNotNull() { regShippingPackingNo(CK_ISNN, DOBJ); }

    protected void regShippingPackingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPackingNo(), "SHIPPING_PACKING_NO"); }
    protected abstract ConditionValue xgetCValueShippingPackingNo();

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
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
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
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
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
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
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
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOX_ID from M_BOX where ...)} <br />
     * M_BOX by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, bigint(19), FK to M_BOX}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

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
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @param mixedFlg The value of mixedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_Equal(String mixedFlg) {
        doSetMixedFlg_Equal(fRES(mixedFlg));
    }

    /**
     * Equal(=). As MixedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMixedFlg_Equal_AsMixedFlg(CDef.MixedFlg cdef) {
        doSetMixedFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単品
     */
    public void setMixedFlg_Equal_$0() {
        setMixedFlg_Equal_AsMixedFlg(CDef.MixedFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 混載
     */
    public void setMixedFlg_Equal_$1() {
        setMixedFlg_Equal_AsMixedFlg(CDef.MixedFlg.$1);
    }

    protected void doSetMixedFlg_Equal(String mixedFlg) {
        regMixedFlg(CK_EQ, mixedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @param mixedFlg The value of mixedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_NotEqual(String mixedFlg) {
        doSetMixedFlg_NotEqual(fRES(mixedFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As MixedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMixedFlg_NotEqual_AsMixedFlg(CDef.MixedFlg cdef) {
        doSetMixedFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 単品
     */
    public void setMixedFlg_NotEqual_$0() {
        setMixedFlg_NotEqual_AsMixedFlg(CDef.MixedFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 混載
     */
    public void setMixedFlg_NotEqual_$1() {
        setMixedFlg_NotEqual_AsMixedFlg(CDef.MixedFlg.$1);
    }

    protected void doSetMixedFlg_NotEqual(String mixedFlg) {
        regMixedFlg(CK_NES, mixedFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @param mixedFlgList The collection of mixedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_InScope(Collection<String> mixedFlgList) {
        doSetMixedFlg_InScope(mixedFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As MixedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_InScope_AsMixedFlg(Collection<CDef.MixedFlg> cdefList) {
        doSetMixedFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetMixedFlg_InScope(Collection<String> mixedFlgList) {
        regINS(CK_INS, cTL(mixedFlgList), xgetCValueMixedFlg(), "MIXED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg}
     * @param mixedFlgList The collection of mixedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_NotInScope(Collection<String> mixedFlgList) {
        doSetMixedFlg_NotInScope(mixedFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MixedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXED_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MixedFlg} <br>
     * 混載フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedFlg_NotInScope_AsMixedFlg(Collection<CDef.MixedFlg> cdefList) {
        doSetMixedFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMixedFlg_NotInScope(Collection<String> mixedFlgList) {
        regINS(CK_NINS, cTL(mixedFlgList), xgetCValueMixedFlg(), "MIXED_FLG");
    }

    protected void regMixedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedFlg(), "MIXED_FLG"); }
    protected abstract ConditionValue xgetCValueMixedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @param multiPicFlg The value of multiPicFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_Equal(String multiPicFlg) {
        doSetMultiPicFlg_Equal(fRES(multiPicFlg));
    }

    /**
     * Equal(=). As MultiPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMultiPicFlg_Equal_AsMultiPicFlg(CDef.MultiPicFlg cdef) {
        doSetMultiPicFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 計算無
     */
    public void setMultiPicFlg_Equal_$0() {
        setMultiPicFlg_Equal_AsMultiPicFlg(CDef.MultiPicFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 計算有
     */
    public void setMultiPicFlg_Equal_$1() {
        setMultiPicFlg_Equal_AsMultiPicFlg(CDef.MultiPicFlg.$1);
    }

    protected void doSetMultiPicFlg_Equal(String multiPicFlg) {
        regMultiPicFlg(CK_EQ, multiPicFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @param multiPicFlg The value of multiPicFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_NotEqual(String multiPicFlg) {
        doSetMultiPicFlg_NotEqual(fRES(multiPicFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As MultiPicFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMultiPicFlg_NotEqual_AsMultiPicFlg(CDef.MultiPicFlg cdef) {
        doSetMultiPicFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 計算無
     */
    public void setMultiPicFlg_NotEqual_$0() {
        setMultiPicFlg_NotEqual_AsMultiPicFlg(CDef.MultiPicFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 計算有
     */
    public void setMultiPicFlg_NotEqual_$1() {
        setMultiPicFlg_NotEqual_AsMultiPicFlg(CDef.MultiPicFlg.$1);
    }

    protected void doSetMultiPicFlg_NotEqual(String multiPicFlg) {
        regMultiPicFlg(CK_NES, multiPicFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @param multiPicFlgList The collection of multiPicFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_InScope(Collection<String> multiPicFlgList) {
        doSetMultiPicFlg_InScope(multiPicFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As MultiPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_InScope_AsMultiPicFlg(Collection<CDef.MultiPicFlg> cdefList) {
        doSetMultiPicFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetMultiPicFlg_InScope(Collection<String> multiPicFlgList) {
        regINS(CK_INS, cTL(multiPicFlgList), xgetCValueMultiPicFlg(), "MULTI_PIC_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg}
     * @param multiPicFlgList The collection of multiPicFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_NotInScope(Collection<String> multiPicFlgList) {
        doSetMultiPicFlg_NotInScope(multiPicFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MultiPicFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MULTI_PIC_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=MultiPicFlg} <br>
     * マルチピック計算フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMultiPicFlg_NotInScope_AsMultiPicFlg(Collection<CDef.MultiPicFlg> cdefList) {
        doSetMultiPicFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMultiPicFlg_NotInScope(Collection<String> multiPicFlgList) {
        regINS(CK_NINS, cTL(multiPicFlgList), xgetCValueMultiPicFlg(), "MULTI_PIC_FLG");
    }

    protected void regMultiPicFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMultiPicFlg(), "MULTI_PIC_FLG"); }
    protected abstract ConditionValue xgetCValueMultiPicFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_Equal(Long cartNo) {
        doSetCartNo_Equal(cartNo);
    }

    protected void doSetCartNo_Equal(Long cartNo) {
        regCartNo(CK_EQ, cartNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_NotEqual(Long cartNo) {
        doSetCartNo_NotEqual(cartNo);
    }

    protected void doSetCartNo_NotEqual(Long cartNo) {
        regCartNo(CK_NES, cartNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_GreaterThan(Long cartNo) {
        regCartNo(CK_GT, cartNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_LessThan(Long cartNo) {
        regCartNo(CK_LT, cartNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_GreaterEqual(Long cartNo) {
        regCartNo(CK_GE, cartNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_LessEqual(Long cartNo) {
        regCartNo(CK_LE, cartNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param minNumber The min number of cartNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cartNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCartNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCartNo(), "CART_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNoList The collection of cartNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartNo_InScope(Collection<Long> cartNoList) {
        doSetCartNo_InScope(cartNoList);
    }

    protected void doSetCartNo_InScope(Collection<Long> cartNoList) {
        regINS(CK_INS, cTL(cartNoList), xgetCValueCartNo(), "CART_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNoList The collection of cartNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartNo_NotInScope(Collection<Long> cartNoList) {
        doSetCartNo_NotInScope(cartNoList);
    }

    protected void doSetCartNo_NotInScope(Collection<Long> cartNoList) {
        regINS(CK_NINS, cTL(cartNoList), xgetCValueCartNo(), "CART_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     */
    public void setCartNo_IsNull() { regCartNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     */
    public void setCartNo_IsNotNull() { regCartNo(CK_ISNN, DOBJ); }

    protected void regCartNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCartNo(), "CART_NO"); }
    protected abstract ConditionValue xgetCValueCartNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_Equal(Long bucketColNo) {
        doSetBucketColNo_Equal(bucketColNo);
    }

    protected void doSetBucketColNo_Equal(Long bucketColNo) {
        regBucketColNo(CK_EQ, bucketColNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_NotEqual(Long bucketColNo) {
        doSetBucketColNo_NotEqual(bucketColNo);
    }

    protected void doSetBucketColNo_NotEqual(Long bucketColNo) {
        regBucketColNo(CK_NES, bucketColNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_GreaterThan(Long bucketColNo) {
        regBucketColNo(CK_GT, bucketColNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_LessThan(Long bucketColNo) {
        regBucketColNo(CK_LT, bucketColNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_GreaterEqual(Long bucketColNo) {
        regBucketColNo(CK_GE, bucketColNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNo The value of bucketColNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketColNo_LessEqual(Long bucketColNo) {
        regBucketColNo(CK_LE, bucketColNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param minNumber The min number of bucketColNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bucketColNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBucketColNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBucketColNo(), "BUCKET_COL_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNoList The collection of bucketColNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBucketColNo_InScope(Collection<Long> bucketColNoList) {
        doSetBucketColNo_InScope(bucketColNoList);
    }

    protected void doSetBucketColNo_InScope(Collection<Long> bucketColNoList) {
        regINS(CK_INS, cTL(bucketColNoList), xgetCValueBucketColNo(), "BUCKET_COL_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     * @param bucketColNoList The collection of bucketColNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBucketColNo_NotInScope(Collection<Long> bucketColNoList) {
        doSetBucketColNo_NotInScope(bucketColNoList);
    }

    protected void doSetBucketColNo_NotInScope(Collection<Long> bucketColNoList) {
        regINS(CK_NINS, cTL(bucketColNoList), xgetCValueBucketColNo(), "BUCKET_COL_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     */
    public void setBucketColNo_IsNull() { regBucketColNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUCKET_COL_NO: {bigint(19)}
     */
    public void setBucketColNo_IsNotNull() { regBucketColNo(CK_ISNN, DOBJ); }

    protected void regBucketColNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBucketColNo(), "BUCKET_COL_NO"); }
    protected abstract ConditionValue xgetCValueBucketColNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_Equal(Long bucketRowNo) {
        doSetBucketRowNo_Equal(bucketRowNo);
    }

    protected void doSetBucketRowNo_Equal(Long bucketRowNo) {
        regBucketRowNo(CK_EQ, bucketRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_NotEqual(Long bucketRowNo) {
        doSetBucketRowNo_NotEqual(bucketRowNo);
    }

    protected void doSetBucketRowNo_NotEqual(Long bucketRowNo) {
        regBucketRowNo(CK_NES, bucketRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_GreaterThan(Long bucketRowNo) {
        regBucketRowNo(CK_GT, bucketRowNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_LessThan(Long bucketRowNo) {
        regBucketRowNo(CK_LT, bucketRowNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_GreaterEqual(Long bucketRowNo) {
        regBucketRowNo(CK_GE, bucketRowNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNo The value of bucketRowNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBucketRowNo_LessEqual(Long bucketRowNo) {
        regBucketRowNo(CK_LE, bucketRowNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param minNumber The min number of bucketRowNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bucketRowNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBucketRowNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBucketRowNo(), "BUCKET_ROW_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNoList The collection of bucketRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBucketRowNo_InScope(Collection<Long> bucketRowNoList) {
        doSetBucketRowNo_InScope(bucketRowNoList);
    }

    protected void doSetBucketRowNo_InScope(Collection<Long> bucketRowNoList) {
        regINS(CK_INS, cTL(bucketRowNoList), xgetCValueBucketRowNo(), "BUCKET_ROW_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     * @param bucketRowNoList The collection of bucketRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBucketRowNo_NotInScope(Collection<Long> bucketRowNoList) {
        doSetBucketRowNo_NotInScope(bucketRowNoList);
    }

    protected void doSetBucketRowNo_NotInScope(Collection<Long> bucketRowNoList) {
        regINS(CK_NINS, cTL(bucketRowNoList), xgetCValueBucketRowNo(), "BUCKET_ROW_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     */
    public void setBucketRowNo_IsNull() { regBucketRowNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BUCKET_ROW_NO: {bigint(19)}
     */
    public void setBucketRowNo_IsNotNull() { regBucketRowNo(CK_ISNN, DOBJ); }

    protected void regBucketRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBucketRowNo(), "BUCKET_ROW_NO"); }
    protected abstract ConditionValue xgetCValueBucketRowNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_Equal(String seedingNo) {
        doSetSeedingNo_Equal(fRES(seedingNo));
    }

    protected void doSetSeedingNo_Equal(String seedingNo) {
        regSeedingNo(CK_EQ, seedingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_NotEqual(String seedingNo) {
        doSetSeedingNo_NotEqual(fRES(seedingNo));
    }

    protected void doSetSeedingNo_NotEqual(String seedingNo) {
        regSeedingNo(CK_NES, seedingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_GreaterThan(String seedingNo) {
        regSeedingNo(CK_GT, fRES(seedingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_LessThan(String seedingNo) {
        regSeedingNo(CK_LT, fRES(seedingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_GreaterEqual(String seedingNo) {
        regSeedingNo(CK_GE, fRES(seedingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_LessEqual(String seedingNo) {
        regSeedingNo(CK_LE, fRES(seedingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNoList The collection of seedingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_InScope(Collection<String> seedingNoList) {
        doSetSeedingNo_InScope(seedingNoList);
    }

    protected void doSetSeedingNo_InScope(Collection<String> seedingNoList) {
        regINS(CK_INS, cTL(seedingNoList), xgetCValueSeedingNo(), "SEEDING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNoList The collection of seedingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_NotInScope(Collection<String> seedingNoList) {
        doSetSeedingNo_NotInScope(seedingNoList);
    }

    protected void doSetSeedingNo_NotInScope(Collection<String> seedingNoList) {
        regINS(CK_NINS, cTL(seedingNoList), xgetCValueSeedingNo(), "SEEDING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEEDING_NO: {varchar(30)} <br>
     * <pre>e.g. setSeedingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param seedingNo The value of seedingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeedingNo_LikeSearch(String seedingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(seedingNo), xgetCValueSeedingNo(), "SEEDING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeedingNo_NotLikeSearch(String seedingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(seedingNo), xgetCValueSeedingNo(), "SEEDING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     * @param seedingNo The value of seedingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeedingNo_PrefixSearch(String seedingNo) {
        setSeedingNo_LikeSearch(seedingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     */
    public void setSeedingNo_IsNull() { regSeedingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     */
    public void setSeedingNo_IsNullOrEmpty() { regSeedingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEEDING_NO: {varchar(30)}
     */
    public void setSeedingNo_IsNotNull() { regSeedingNo(CK_ISNN, DOBJ); }

    protected void regSeedingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeedingNo(), "SEEDING_NO"); }
    protected abstract ConditionValue xgetCValueSeedingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @param loadingFlg The value of loadingFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_Equal(String loadingFlg) {
        doSetLoadingFlg_Equal(fRES(loadingFlg));
    }

    /**
     * Equal(=). As LoadingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingFlg_Equal_AsLoadingFlg(CDef.LoadingFlg cdef) {
        doSetLoadingFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setLoadingFlg_Equal_$0() {
        setLoadingFlg_Equal_AsLoadingFlg(CDef.LoadingFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setLoadingFlg_Equal_$1() {
        setLoadingFlg_Equal_AsLoadingFlg(CDef.LoadingFlg.$1);
    }

    protected void doSetLoadingFlg_Equal(String loadingFlg) {
        regLoadingFlg(CK_EQ, loadingFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @param loadingFlg The value of loadingFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_NotEqual(String loadingFlg) {
        doSetLoadingFlg_NotEqual(fRES(loadingFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LoadingFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLoadingFlg_NotEqual_AsLoadingFlg(CDef.LoadingFlg cdef) {
        doSetLoadingFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未検品
     */
    public void setLoadingFlg_NotEqual_$0() {
        setLoadingFlg_NotEqual_AsLoadingFlg(CDef.LoadingFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 検品済
     */
    public void setLoadingFlg_NotEqual_$1() {
        setLoadingFlg_NotEqual_AsLoadingFlg(CDef.LoadingFlg.$1);
    }

    protected void doSetLoadingFlg_NotEqual(String loadingFlg) {
        regLoadingFlg(CK_NES, loadingFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @param loadingFlgList The collection of loadingFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_InScope(Collection<String> loadingFlgList) {
        doSetLoadingFlg_InScope(loadingFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LoadingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_InScope_AsLoadingFlg(Collection<CDef.LoadingFlg> cdefList) {
        doSetLoadingFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLoadingFlg_InScope(Collection<String> loadingFlgList) {
        regINS(CK_INS, cTL(loadingFlgList), xgetCValueLoadingFlg(), "LOADING_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg}
     * @param loadingFlgList The collection of loadingFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_NotInScope(Collection<String> loadingFlgList) {
        doSetLoadingFlg_NotInScope(loadingFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LoadingFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOADING_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=LoadingFlg} <br>
     * 積込フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoadingFlg_NotInScope_AsLoadingFlg(Collection<CDef.LoadingFlg> cdefList) {
        doSetLoadingFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLoadingFlg_NotInScope(Collection<String> loadingFlgList) {
        regINS(CK_NINS, cTL(loadingFlgList), xgetCValueLoadingFlg(), "LOADING_FLG");
    }

    protected void regLoadingFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoadingFlg(), "LOADING_FLG"); }
    protected abstract ConditionValue xgetCValueLoadingFlg();

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
     * UPD_USER: {varchar(255), FK to B_USER}
     * @param updUser The value of updUser as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_Equal(String updUser) {
        doSetUpdUser_Equal(fRES(updUser));
    }

    protected void doSetUpdUser_Equal(String updUser) {
        regUpdUser(CK_EQ, updUser);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
     * @param updUserList The collection of updUser as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUpdUser_InScope(Collection<String> updUserList) {
        doSetUpdUser_InScope(updUserList);
    }

    protected void doSetUpdUser_InScope(Collection<String> updUserList) {
        regINS(CK_INS, cTL(updUserList), xgetCValueUpdUser(), "UPD_USER");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select UPD_USER from B_USER where ...)} <br />
     * B_USER by my UPD_USER, named 'BUserByUpdUser'.
     * @param subCBLambda The callback for sub-query of BUserByUpdUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByUpdUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUpdUser_InScopeRelation_BUserByUpdUser(cb.query());
        registerInScopeRelation(cb.query(), "UPD_USER", "USER_CD", pp, "bUserByUpdUser", false);
    }
    public abstract String keepUpdUser_InScopeRelation_BUserByUpdUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select UPD_USER from B_USER where ...)} <br />
     * B_USER by my UPD_USER, named 'BUserByUpdUser'.
     * @param subCBLambda The callback for sub-query of BUserByUpdUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByUpdUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepUpdUser_NotInScopeRelation_BUserByUpdUser(cb.query());
        registerInScopeRelation(cb.query(), "UPD_USER", "USER_CD", pp, "bUserByUpdUser", true);
    }
    public abstract String keepUpdUser_NotInScopeRelation_BUserByUpdUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
     */
    public void setUpdUser_IsNull() { regUpdUser(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
     */
    public void setUpdUser_IsNullOrEmpty() { regUpdUser(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPD_USER: {varchar(255), FK to B_USER}
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
    public HpSLCFunction<TPackingHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPackingHCB.class);
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
    public HpSLCFunction<TPackingHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPackingHCB.class);
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
    public HpSLCFunction<TPackingHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPackingHCB.class);
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
    public HpSLCFunction<TPackingHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPackingHCB.class);
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
    public HpSLCFunction<TPackingHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPackingHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPackingHCB&gt;() {
     *     public void query(TPackingHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPackingHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPackingHCQ sq);

    protected TPackingHCB xcreateScalarConditionCB() {
        TPackingHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPackingHCB xcreateScalarConditionPartitionByCB() {
        TPackingHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPackingHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPackingHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPackingHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPackingHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPackingHCQ sq);

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
    protected TPackingHCB newMyCB() {
        return new TPackingHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPackingHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
