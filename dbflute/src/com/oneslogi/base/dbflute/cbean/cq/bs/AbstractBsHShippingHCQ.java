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
 * The abstract condition-query of H_SHIPPING_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHShippingHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHShippingHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_SHIPPING_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_H_ID from H_PACKING_H where ...)} <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HPackingHList for 'exists'. (NotNull)
     */
    public void existsHPackingHList(SubQuery<HPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_ExistsReferrer_HPackingHList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hPackingHList");
    }
    public abstract String keepShippingInstHId_ExistsReferrer_HPackingHList(HPackingHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_INST_H_ID from H_SHIPPING_B where ...)} <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHShippingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HShippingBList for 'exists'. (NotNull)
     */
    public void existsHShippingBList(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_ExistsReferrer_HShippingBList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hShippingBList");
    }
    public abstract String keepShippingInstHId_ExistsReferrer_HShippingBList(HShippingBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_H_ID from H_PACKING_H where ...)} <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHPackingHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstHId_NotExistsReferrer_HPackingHList for 'not exists'. (NotNull)
     */
    public void notExistsHPackingHList(SubQuery<HPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_NotExistsReferrer_HPackingHList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hPackingHList");
    }
    public abstract String keepShippingInstHId_NotExistsReferrer_HPackingHList(HPackingHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_INST_H_ID from H_SHIPPING_B where ...)} <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHShippingBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingInstHId_NotExistsReferrer_HShippingBList for 'not exists'. (NotNull)
     */
    public void notExistsHShippingBList(SubQuery<HShippingBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingInstHId_NotExistsReferrer_HShippingBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hShippingBList");
    }
    public abstract String keepShippingInstHId_NotExistsReferrer_HShippingBList(HShippingBCQ sq);

    public void xsderiveHPackingHList(String fn, SubQuery<HPackingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstHId_SpecifyDerivedReferrer_HPackingHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hPackingHList", al, op);
    }
    public abstract String keepShippingInstHId_SpecifyDerivedReferrer_HPackingHList(HPackingHCQ sq);

    public void xsderiveHShippingBList(String fn, SubQuery<HShippingBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingInstHId_SpecifyDerivedReferrer_HShippingBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", pp, "hShippingBList", al, op);
    }
    public abstract String keepShippingInstHId_SpecifyDerivedReferrer_HShippingBList(HShippingBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_PACKING_H where ...)} <br>
     * H_PACKING_H by SHIPPING_INST_H_ID, named 'HPackingHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHPackingHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HPackingHCB> derivedHPackingHList() {
        return xcreateQDRFunctionHPackingHList();
    }
    protected HpQDRFunction<HPackingHCB> xcreateQDRFunctionHPackingHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHPackingHList(fn, sq, rd, vl, op));
    }
    public void xqderiveHPackingHList(String fn, SubQuery<HPackingHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HPackingHCB cb = new HPackingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstHId_QueryDerivedReferrer_HPackingHList(cb.query()); String prpp = keepShippingInstHId_QueryDerivedReferrer_HPackingHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", sqpp, "hPackingHList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstHId_QueryDerivedReferrer_HPackingHList(HPackingHCQ sq);
    public abstract String keepShippingInstHId_QueryDerivedReferrer_HPackingHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_SHIPPING_B where ...)} <br>
     * H_SHIPPING_B by SHIPPING_INST_H_ID, named 'HShippingBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHShippingBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HShippingBCB> derivedHShippingBList() {
        return xcreateQDRFunctionHShippingBList();
    }
    protected HpQDRFunction<HShippingBCB> xcreateQDRFunctionHShippingBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHShippingBList(fn, sq, rd, vl, op));
    }
    public void xqderiveHShippingBList(String fn, SubQuery<HShippingBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingBCB cb = new HShippingBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingInstHId_QueryDerivedReferrer_HShippingBList(cb.query()); String prpp = keepShippingInstHId_QueryDerivedReferrer_HShippingBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_INST_H_ID", "SHIPPING_INST_H_ID", sqpp, "hShippingBList", rd, vl, prpp, op);
    }
    public abstract String keepShippingInstHId_QueryDerivedReferrer_HShippingBList(HShippingBCQ sq);
    public abstract String keepShippingInstHId_QueryDerivedReferrer_HShippingBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_Equal(String histDt) {
        doSetHistDt_Equal(fRES(histDt));
    }

    protected void doSetHistDt_Equal(String histDt) {
        regHistDt(CK_EQ, histDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_NotEqual(String histDt) {
        doSetHistDt_NotEqual(fRES(histDt));
    }

    protected void doSetHistDt_NotEqual(String histDt) {
        regHistDt(CK_NES, histDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterThan(String histDt) {
        regHistDt(CK_GT, fRES(histDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessThan(String histDt) {
        regHistDt(CK_LT, fRES(histDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterEqual(String histDt) {
        regHistDt(CK_GE, fRES(histDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessEqual(String histDt) {
        regHistDt(CK_LE, fRES(histDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDtList The collection of histDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_InScope(Collection<String> histDtList) {
        doSetHistDt_InScope(histDtList);
    }

    protected void doSetHistDt_InScope(Collection<String> histDtList) {
        regINS(CK_INS, cTL(histDtList), xgetCValueHistDt(), "HIST_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDtList The collection of histDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_NotInScope(Collection<String> histDtList) {
        doSetHistDt_NotInScope(histDtList);
    }

    protected void doSetHistDt_NotInScope(Collection<String> histDtList) {
        regINS(CK_NINS, cTL(histDtList), xgetCValueHistDt(), "HIST_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)} <br>
     * <pre>e.g. setHistDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param histDt The value of histDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHistDt_LikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistDt_NotLikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {NotNull, varchar(8)}
     * @param histDt The value of histDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_PrefixSearch(String histDt) {
        setHistDt_LikeSearch(histDt, xcLSOPPre());
    }

    protected void regHistDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHistDt(), "HIST_DT"); }
    protected abstract ConditionValue xgetCValueHistDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, bigint(19)}
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
     * CLIENT_ID: {NotNull, bigint(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_Equal(String clientCd) {
        doSetClientCd_Equal(fRES(clientCd));
    }

    protected void doSetClientCd_Equal(String clientCd) {
        regClientCd(CK_EQ, clientCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotEqual(String clientCd) {
        doSetClientCd_NotEqual(fRES(clientCd));
    }

    protected void doSetClientCd_NotEqual(String clientCd) {
        regClientCd(CK_NES, clientCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterThan(String clientCd) {
        regClientCd(CK_GT, fRES(clientCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessThan(String clientCd) {
        regClientCd(CK_LT, fRES(clientCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_GreaterEqual(String clientCd) {
        regClientCd(CK_GE, fRES(clientCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_LessEqual(String clientCd) {
        regClientCd(CK_LE, fRES(clientCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCdList The collection of clientCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_InScope(Collection<String> clientCdList) {
        doSetClientCd_InScope(clientCdList);
    }

    protected void doSetClientCd_InScope(Collection<String> clientCdList) {
        regINS(CK_INS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCdList The collection of clientCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_NotInScope(Collection<String> clientCdList) {
        doSetClientCd_NotInScope(clientCdList);
    }

    protected void doSetClientCd_NotInScope(Collection<String> clientCdList) {
        regINS(CK_NINS, cTL(clientCdList), xgetCValueClientCd(), "CLIENT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(30)} <br>
     * <pre>e.g. setClientCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientCd The value of clientCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientCd_LikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientCd_NotLikeSearch(String clientCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientCd), xgetCValueClientCd(), "CLIENT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     * @param clientCd The value of clientCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientCd_PrefixSearch(String clientCd) {
        setClientCd_LikeSearch(clientCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     */
    public void setClientCd_IsNull() { regClientCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     */
    public void setClientCd_IsNullOrEmpty() { regClientCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_CD: {varchar(30)}
     */
    public void setClientCd_IsNotNull() { regClientCd(CK_ISNN, DOBJ); }

    protected void regClientCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientCd(), "CLIENT_CD"); }
    protected abstract ConditionValue xgetCValueClientCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_Equal(String clientNm) {
        doSetClientNm_Equal(fRES(clientNm));
    }

    protected void doSetClientNm_Equal(String clientNm) {
        regClientNm(CK_EQ, clientNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_NotEqual(String clientNm) {
        doSetClientNm_NotEqual(fRES(clientNm));
    }

    protected void doSetClientNm_NotEqual(String clientNm) {
        regClientNm(CK_NES, clientNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_GreaterThan(String clientNm) {
        regClientNm(CK_GT, fRES(clientNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_LessThan(String clientNm) {
        regClientNm(CK_LT, fRES(clientNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_GreaterEqual(String clientNm) {
        regClientNm(CK_GE, fRES(clientNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_LessEqual(String clientNm) {
        regClientNm(CK_LE, fRES(clientNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNmList The collection of clientNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_InScope(Collection<String> clientNmList) {
        doSetClientNm_InScope(clientNmList);
    }

    protected void doSetClientNm_InScope(Collection<String> clientNmList) {
        regINS(CK_INS, cTL(clientNmList), xgetCValueClientNm(), "CLIENT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNmList The collection of clientNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_NotInScope(Collection<String> clientNmList) {
        doSetClientNm_NotInScope(clientNmList);
    }

    protected void doSetClientNm_NotInScope(Collection<String> clientNmList) {
        regINS(CK_NINS, cTL(clientNmList), xgetCValueClientNm(), "CLIENT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {varchar(60)} <br>
     * <pre>e.g. setClientNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientNm The value of clientNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientNm_LikeSearch(String clientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientNm), xgetCValueClientNm(), "CLIENT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientNm_NotLikeSearch(String clientNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientNm), xgetCValueClientNm(), "CLIENT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     * @param clientNm The value of clientNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientNm_PrefixSearch(String clientNm) {
        setClientNm_LikeSearch(clientNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     */
    public void setClientNm_IsNull() { regClientNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     */
    public void setClientNm_IsNullOrEmpty() { regClientNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_NM: {varchar(60)}
     */
    public void setClientNm_IsNotNull() { regClientNm(CK_ISNN, DOBJ); }

    protected void regClientNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientNm(), "CLIENT_NM"); }
    protected abstract ConditionValue xgetCValueClientNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_Equal(String centerCd) {
        doSetCenterCd_Equal(fRES(centerCd));
    }

    protected void doSetCenterCd_Equal(String centerCd) {
        regCenterCd(CK_EQ, centerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotEqual(String centerCd) {
        doSetCenterCd_NotEqual(fRES(centerCd));
    }

    protected void doSetCenterCd_NotEqual(String centerCd) {
        regCenterCd(CK_NES, centerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCdList The collection of centerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_InScope(Collection<String> centerCdList) {
        doSetCenterCd_InScope(centerCdList);
    }

    protected void doSetCenterCd_InScope(Collection<String> centerCdList) {
        regINS(CK_INS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCdList The collection of centerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_NotInScope(Collection<String> centerCdList) {
        doSetCenterCd_NotInScope(centerCdList);
    }

    protected void doSetCenterCd_NotInScope(Collection<String> centerCdList) {
        regINS(CK_NINS, cTL(centerCdList), xgetCValueCenterCd(), "CENTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)} <br>
     * <pre>e.g. setCenterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerCd The value of centerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterCd_LikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(30)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_Equal(String centerNm) {
        doSetCenterNm_Equal(fRES(centerNm));
    }

    protected void doSetCenterNm_Equal(String centerNm) {
        regCenterNm(CK_EQ, centerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotEqual(String centerNm) {
        doSetCenterNm_NotEqual(fRES(centerNm));
    }

    protected void doSetCenterNm_NotEqual(String centerNm) {
        regCenterNm(CK_NES, centerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterThan(String centerNm) {
        regCenterNm(CK_GT, fRES(centerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessThan(String centerNm) {
        regCenterNm(CK_LT, fRES(centerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_GreaterEqual(String centerNm) {
        regCenterNm(CK_GE, fRES(centerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_LessEqual(String centerNm) {
        regCenterNm(CK_LE, fRES(centerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNmList The collection of centerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_InScope(Collection<String> centerNmList) {
        doSetCenterNm_InScope(centerNmList);
    }

    protected void doSetCenterNm_InScope(Collection<String> centerNmList) {
        regINS(CK_INS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNmList The collection of centerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_NotInScope(Collection<String> centerNmList) {
        doSetCenterNm_NotInScope(centerNmList);
    }

    protected void doSetCenterNm_NotInScope(Collection<String> centerNmList) {
        regINS(CK_NINS, cTL(centerNmList), xgetCValueCenterNm(), "CENTER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {varchar(60)} <br>
     * <pre>e.g. setCenterNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param centerNm The value of centerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCenterNm_LikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterNm_NotLikeSearch(String centerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerNm), xgetCValueCenterNm(), "CENTER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_NM: {varchar(60)}
     * @param centerNm The value of centerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterNm_PrefixSearch(String centerNm) {
        setCenterNm_LikeSearch(centerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     */
    public void setCenterNm_IsNull() { regCenterNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     */
    public void setCenterNm_IsNullOrEmpty() { regCenterNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_NM: {varchar(60)}
     */
    public void setCenterNm_IsNotNull() { regCenterNm(CK_ISNN, DOBJ); }

    protected void regCenterNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterNm(), "CENTER_NM"); }
    protected abstract ConditionValue xgetCValueCenterNm();

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
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_Equal(String delivPlanDt) {
        doSetDelivPlanDt_Equal(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_Equal(String delivPlanDt) {
        regDelivPlanDt(CK_EQ, delivPlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotEqual(String delivPlanDt) {
        doSetDelivPlanDt_NotEqual(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_NotEqual(String delivPlanDt) {
        regDelivPlanDt(CK_NES, delivPlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterThan(String delivPlanDt) {
        regDelivPlanDt(CK_GT, fRES(delivPlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessThan(String delivPlanDt) {
        regDelivPlanDt(CK_LT, fRES(delivPlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterEqual(String delivPlanDt) {
        regDelivPlanDt(CK_GE, fRES(delivPlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessEqual(String delivPlanDt) {
        regDelivPlanDt(CK_LE, fRES(delivPlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDtList The collection of delivPlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_InScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        regINS(CK_INS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDtList The collection of delivPlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_NotInScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        regINS(CK_NINS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)} <br>
     * <pre>e.g. setDelivPlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivPlanDt The value of delivPlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivPlanDt_LikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivPlanDt_NotLikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     * @param delivPlanDt The value of delivPlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_PrefixSearch(String delivPlanDt) {
        setDelivPlanDt_LikeSearch(delivPlanDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     */
    public void setDelivPlanDt_IsNull() { regDelivPlanDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     */
    public void setDelivPlanDt_IsNullOrEmpty() { regDelivPlanDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {varchar(8)}
     */
    public void setDelivPlanDt_IsNotNull() { regDelivPlanDt(CK_ISNN, DOBJ); }

    protected void regDelivPlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivPlanDt(), "DELIV_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueDelivPlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(8)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {varchar(8)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {varchar(8)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    /**
     * Equal(=). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_Equal_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_Equal_$A() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * Equal(=). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_Equal_$B() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * Equal(=). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_Equal_$C() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * Equal(=). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_Equal_$D() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * Equal(=). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_Equal_$E() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * Equal(=). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_Equal_$F() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * Equal(=). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_Equal_$G() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * Equal(=). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_Equal_$H() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * Equal(=). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_Equal_$I() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * Equal(=). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_Equal_$J() {
        setDelivTz_Equal_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    /**
     * NotEqual(&lt;&gt;). As DelivTz. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz cdef) {
        doSetDelivTz_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $A (A). And OnlyOnceRegistered. <br>
     * $A: 午前中
     */
    public void setDelivTz_NotEqual_$A() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$A);
    }

    /**
     * NotEqual(&lt;&gt;). As $B (B). And OnlyOnceRegistered. <br>
     * $B: 12時～14時
     */
    public void setDelivTz_NotEqual_$B() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$B);
    }

    /**
     * NotEqual(&lt;&gt;). As $C (C). And OnlyOnceRegistered. <br>
     * $C: 14時～16時
     */
    public void setDelivTz_NotEqual_$C() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$C);
    }

    /**
     * NotEqual(&lt;&gt;). As $D (D). And OnlyOnceRegistered. <br>
     * $D: 16時～18時
     */
    public void setDelivTz_NotEqual_$D() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$D);
    }

    /**
     * NotEqual(&lt;&gt;). As $E (E). And OnlyOnceRegistered. <br>
     * $E: 18時～20時
     */
    public void setDelivTz_NotEqual_$E() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$E);
    }

    /**
     * NotEqual(&lt;&gt;). As $F (F). And OnlyOnceRegistered. <br>
     * $F: 18時～21時
     */
    public void setDelivTz_NotEqual_$F() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$F);
    }

    /**
     * NotEqual(&lt;&gt;). As $G (G). And OnlyOnceRegistered. <br>
     * $G: 19時～21時
     */
    public void setDelivTz_NotEqual_$G() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$G);
    }

    /**
     * NotEqual(&lt;&gt;). As $H (H). And OnlyOnceRegistered. <br>
     * $H: 20時～21時
     */
    public void setDelivTz_NotEqual_$H() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$H);
    }

    /**
     * NotEqual(&lt;&gt;). As $I (I). And OnlyOnceRegistered. <br>
     * $I: 午前10時まで
     */
    public void setDelivTz_NotEqual_$I() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$I);
    }

    /**
     * NotEqual(&lt;&gt;). As $J (J). And OnlyOnceRegistered. <br>
     * $J: 午後5時まで
     */
    public void setDelivTz_NotEqual_$J() {
        setDelivTz_NotEqual_AsDelivTz(CDef.DelivTz.$J);
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_InScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DelivTz. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz} <br>
     * 納品時間帯
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope_AsDelivTz(Collection<CDef.DelivTz> cdefList) {
        doSetDelivTz_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {varchar(30), FK to B_CLASS_DTL, classification=DelivTz}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_Equal(String shippingDt) {
        doSetShippingDt_Equal(fRES(shippingDt));
    }

    protected void doSetShippingDt_Equal(String shippingDt) {
        regShippingDt(CK_EQ, shippingDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotEqual(String shippingDt) {
        doSetShippingDt_NotEqual(fRES(shippingDt));
    }

    protected void doSetShippingDt_NotEqual(String shippingDt) {
        regShippingDt(CK_NES, shippingDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDtList The collection of shippingDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_InScope(Collection<String> shippingDtList) {
        doSetShippingDt_InScope(shippingDtList);
    }

    protected void doSetShippingDt_InScope(Collection<String> shippingDtList) {
        regINS(CK_INS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDtList The collection of shippingDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_NotInScope(Collection<String> shippingDtList) {
        doSetShippingDt_NotInScope(shippingDtList);
    }

    protected void doSetShippingDt_NotInScope(Collection<String> shippingDtList) {
        regINS(CK_NINS, cTL(shippingDtList), xgetCValueShippingDt(), "SHIPPING_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)} <br>
     * <pre>e.g. setShippingDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingDt The value of shippingDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingDt_LikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     */
    public void setShippingDt_IsNull() { regShippingDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     */
    public void setShippingDt_IsNullOrEmpty() { regShippingDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, varchar(8)}
     */
    public void setShippingDt_IsNotNull() { regShippingDt(CK_ISNN, DOBJ); }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, varchar(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, varchar(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_Equal(String clientShippingNo) {
        doSetClientShippingNo_Equal(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_Equal(String clientShippingNo) {
        regClientShippingNo(CK_EQ, clientShippingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotEqual(String clientShippingNo) {
        doSetClientShippingNo_NotEqual(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_NotEqual(String clientShippingNo) {
        regClientShippingNo(CK_NES, clientShippingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterThan(String clientShippingNo) {
        regClientShippingNo(CK_GT, fRES(clientShippingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessThan(String clientShippingNo) {
        regClientShippingNo(CK_LT, fRES(clientShippingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterEqual(String clientShippingNo) {
        regClientShippingNo(CK_GE, fRES(clientShippingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessEqual(String clientShippingNo) {
        regClientShippingNo(CK_LE, fRES(clientShippingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNoList The collection of clientShippingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_InScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        regINS(CK_INS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNoList The collection of clientShippingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_NotInScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        regINS(CK_NINS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)} <br>
     * <pre>e.g. setClientShippingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientShippingNo The value of clientShippingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientShippingNo_LikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientShippingNo_NotLikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     * @param clientShippingNo The value of clientShippingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_PrefixSearch(String clientShippingNo) {
        setClientShippingNo_LikeSearch(clientShippingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     */
    public void setClientShippingNo_IsNull() { regClientShippingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     */
    public void setClientShippingNo_IsNullOrEmpty() { regClientShippingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, varchar(30)}
     */
    public void setClientShippingNo_IsNotNull() { regClientShippingNo(CK_ISNN, DOBJ); }

    protected void regClientShippingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO"); }
    protected abstract ConditionValue xgetCValueClientShippingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_Equal(String shippingSlipNo) {
        doSetShippingSlipNo_Equal(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_Equal(String shippingSlipNo) {
        regShippingSlipNo(CK_EQ, shippingSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotEqual(String shippingSlipNo) {
        doSetShippingSlipNo_NotEqual(fRES(shippingSlipNo));
    }

    protected void doSetShippingSlipNo_NotEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_NES, shippingSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterThan(String shippingSlipNo) {
        regShippingSlipNo(CK_GT, fRES(shippingSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessThan(String shippingSlipNo) {
        regShippingSlipNo(CK_LT, fRES(shippingSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_GE, fRES(shippingSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_LE, fRES(shippingSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_InScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_InScope(Collection<String> shippingSlipNoList) {
        regINS(CK_INS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNoList The collection of shippingSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        doSetShippingSlipNo_NotInScope(shippingSlipNoList);
    }

    protected void doSetShippingSlipNo_NotInScope(Collection<String> shippingSlipNoList) {
        regINS(CK_NINS, cTL(shippingSlipNoList), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)} <br>
     * <pre>e.g. setShippingSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipNo The value of shippingSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipNo_LikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipNo_NotLikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     * @param shippingSlipNo The value of shippingSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        setShippingSlipNo_LikeSearch(shippingSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     */
    public void setShippingSlipNo_IsNull() { regShippingSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     */
    public void setShippingSlipNo_IsNullOrEmpty() { regShippingSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, varchar(30)}
     */
    public void setShippingSlipNo_IsNotNull() { regShippingSlipNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_Equal(Long supplyCustomerId) {
        doSetSupplyCustomerId_Equal(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_Equal(Long supplyCustomerId) {
        regSupplyCustomerId(CK_EQ, supplyCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        doSetSupplyCustomerId_NotEqual(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_NES, supplyCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GT, supplyCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LT, supplyCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GE, supplyCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerId The value of supplyCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LE, supplyCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param minNumber The min number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplyCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerIdList The collection of supplyCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_InScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_INS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     * @param supplyCustomerIdList The collection of supplyCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_NotInScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_NINS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     */
    public void setSupplyCustomerId_IsNull() { regSupplyCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {bigint(19)}
     */
    public void setSupplyCustomerId_IsNotNull() { regSupplyCustomerId(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_Equal(String supplyCustomerCd) {
        doSetSupplyCustomerCd_Equal(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_Equal(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_EQ, supplyCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        doSetSupplyCustomerCd_NotEqual(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_NES, supplyCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GT, fRES(supplyCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LT, fRES(supplyCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GE, fRES(supplyCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LE, fRES(supplyCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_InScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_INS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_NotInScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_NINS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)} <br>
     * <pre>e.g. setSupplyCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerCd The value of supplyCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerCd_LikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerCd_NotLikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_PrefixSearch(String supplyCustomerCd) {
        setSupplyCustomerCd_LikeSearch(supplyCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     */
    public void setSupplyCustomerCd_IsNull() { regSupplyCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     */
    public void setSupplyCustomerCd_IsNullOrEmpty() { regSupplyCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, varchar(30)}
     */
    public void setSupplyCustomerCd_IsNotNull() { regSupplyCustomerCd(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_Equal(String supplyCustomerNm) {
        doSetSupplyCustomerNm_Equal(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_Equal(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_EQ, supplyCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        doSetSupplyCustomerNm_NotEqual(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_NES, supplyCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GT, fRES(supplyCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LT, fRES(supplyCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GE, fRES(supplyCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LE, fRES(supplyCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_InScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_INS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_NotInScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_NINS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)} <br>
     * <pre>e.g. setSupplyCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerNm The value of supplyCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerNm_LikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerNm_NotLikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_PrefixSearch(String supplyCustomerNm) {
        setSupplyCustomerNm_LikeSearch(supplyCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     */
    public void setSupplyCustomerNm_IsNull() { regSupplyCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     */
    public void setSupplyCustomerNm_IsNullOrEmpty() { regSupplyCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {varchar(255)}
     */
    public void setSupplyCustomerNm_IsNotNull() { regSupplyCustomerNm(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_Equal(Long delivCustomerId) {
        doSetDelivCustomerId_Equal(delivCustomerId);
    }

    protected void doSetDelivCustomerId_Equal(Long delivCustomerId) {
        regDelivCustomerId(CK_EQ, delivCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotEqual(Long delivCustomerId) {
        doSetDelivCustomerId_NotEqual(delivCustomerId);
    }

    protected void doSetDelivCustomerId_NotEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_NES, delivCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerIdList The collection of delivCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_InScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_INS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {bigint(19)}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_Equal(String delivCustomerCd) {
        doSetDelivCustomerCd_Equal(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_Equal(String delivCustomerCd) {
        regDelivCustomerCd(CK_EQ, delivCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotEqual(String delivCustomerCd) {
        doSetDelivCustomerCd_NotEqual(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_NotEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_NES, delivCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_GT, fRES(delivCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_LT, fRES(delivCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_GE, fRES(delivCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_LE, fRES(delivCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_InScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        regINS(CK_INS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_NotInScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        regINS(CK_NINS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)} <br>
     * <pre>e.g. setDelivCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerCd The value of delivCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerCd_LikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerCd_NotLikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     * @param delivCustomerCd The value of delivCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_PrefixSearch(String delivCustomerCd) {
        setDelivCustomerCd_LikeSearch(delivCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     */
    public void setDelivCustomerCd_IsNull() { regDelivCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     */
    public void setDelivCustomerCd_IsNullOrEmpty() { regDelivCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {varchar(30)}
     */
    public void setDelivCustomerCd_IsNotNull() { regDelivCustomerCd(CK_ISNN, DOBJ); }

    protected void regDelivCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueDelivCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_Equal(String delivZipCd) {
        doSetDelivZipCd_Equal(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_Equal(String delivZipCd) {
        regDelivZipCd(CK_EQ, delivZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotEqual(String delivZipCd) {
        doSetDelivZipCd_NotEqual(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_NotEqual(String delivZipCd) {
        regDelivZipCd(CK_NES, delivZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterThan(String delivZipCd) {
        regDelivZipCd(CK_GT, fRES(delivZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessThan(String delivZipCd) {
        regDelivZipCd(CK_LT, fRES(delivZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterEqual(String delivZipCd) {
        regDelivZipCd(CK_GE, fRES(delivZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessEqual(String delivZipCd) {
        regDelivZipCd(CK_LE, fRES(delivZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCdList The collection of delivZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_InScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_InScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_InScope(Collection<String> delivZipCdList) {
        regINS(CK_INS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCdList The collection of delivZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_NotInScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        regINS(CK_NINS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)} <br>
     * <pre>e.g. setDelivZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd The value of delivZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd_LikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd_NotLikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     * @param delivZipCd The value of delivZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_PrefixSearch(String delivZipCd) {
        setDelivZipCd_LikeSearch(delivZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNull() { regDelivZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNullOrEmpty() { regDelivZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {varchar(30)}
     */
    public void setDelivZipCd_IsNotNull() { regDelivZipCd(CK_ISNN, DOBJ); }

    protected void regDelivZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd(), "DELIV_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDelivZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {varchar(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {varchar(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {varchar(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_Equal(String delivAddressSupply) {
        doSetDelivAddressSupply_Equal(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_Equal(String delivAddressSupply) {
        regDelivAddressSupply(CK_EQ, delivAddressSupply);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotEqual(String delivAddressSupply) {
        doSetDelivAddressSupply_NotEqual(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_NotEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_NES, delivAddressSupply);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_GT, fRES(delivAddressSupply));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_LT, fRES(delivAddressSupply));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_GE, fRES(delivAddressSupply));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_LE, fRES(delivAddressSupply));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_InScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_INS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_NotInScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_NINS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)} <br>
     * <pre>e.g. setDelivAddressSupply_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddressSupply The value of delivAddressSupply as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddressSupply_LikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddressSupply_NotLikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     * @param delivAddressSupply The value of delivAddressSupply as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_PrefixSearch(String delivAddressSupply) {
        setDelivAddressSupply_LikeSearch(delivAddressSupply, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     */
    public void setDelivAddressSupply_IsNull() { regDelivAddressSupply(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     */
    public void setDelivAddressSupply_IsNullOrEmpty() { regDelivAddressSupply(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {varchar(60)}
     */
    public void setDelivAddressSupply_IsNotNull() { regDelivAddressSupply(CK_ISNN, DOBJ); }

    protected void regDelivAddressSupply(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY"); }
    protected abstract ConditionValue xgetCValueDelivAddressSupply();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_Equal(String delivCustomerNm) {
        doSetDelivCustomerNm_Equal(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_Equal(String delivCustomerNm) {
        regDelivCustomerNm(CK_EQ, delivCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotEqual(String delivCustomerNm) {
        doSetDelivCustomerNm_NotEqual(fRES(delivCustomerNm));
    }

    protected void doSetDelivCustomerNm_NotEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_NES, delivCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_GT, fRES(delivCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessThan(String delivCustomerNm) {
        regDelivCustomerNm(CK_LT, fRES(delivCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_GreaterEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_GE, fRES(delivCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_LessEqual(String delivCustomerNm) {
        regDelivCustomerNm(CK_LE, fRES(delivCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_InScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_InScope(Collection<String> delivCustomerNmList) {
        regINS(CK_INS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNmList The collection of delivCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        doSetDelivCustomerNm_NotInScope(delivCustomerNmList);
    }

    protected void doSetDelivCustomerNm_NotInScope(Collection<String> delivCustomerNmList) {
        regINS(CK_NINS, cTL(delivCustomerNmList), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)} <br>
     * <pre>e.g. setDelivCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerNm The value of delivCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerNm_LikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerNm_NotLikeSearch(String delivCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerNm), xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     * @param delivCustomerNm The value of delivCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerNm_PrefixSearch(String delivCustomerNm) {
        setDelivCustomerNm_LikeSearch(delivCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNull() { regDelivCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNullOrEmpty() { regDelivCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_NM: {varchar(255)}
     */
    public void setDelivCustomerNm_IsNotNull() { regDelivCustomerNm(CK_ISNN, DOBJ); }

    protected void regDelivCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerNm(), "DELIV_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueDelivCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_Equal(String delivTelNo) {
        doSetDelivTelNo_Equal(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_Equal(String delivTelNo) {
        regDelivTelNo(CK_EQ, delivTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotEqual(String delivTelNo) {
        doSetDelivTelNo_NotEqual(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_NotEqual(String delivTelNo) {
        regDelivTelNo(CK_NES, delivTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterThan(String delivTelNo) {
        regDelivTelNo(CK_GT, fRES(delivTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessThan(String delivTelNo) {
        regDelivTelNo(CK_LT, fRES(delivTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterEqual(String delivTelNo) {
        regDelivTelNo(CK_GE, fRES(delivTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessEqual(String delivTelNo) {
        regDelivTelNo(CK_LE, fRES(delivTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNoList The collection of delivTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_InScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_InScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_InScope(Collection<String> delivTelNoList) {
        regINS(CK_INS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNoList The collection of delivTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_NotInScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        regINS(CK_NINS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)} <br>
     * <pre>e.g. setDelivTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo The value of delivTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo_LikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo_NotLikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     * @param delivTelNo The value of delivTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_PrefixSearch(String delivTelNo) {
        setDelivTelNo_LikeSearch(delivTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNull() { regDelivTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNullOrEmpty() { regDelivTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {varchar(255)}
     */
    public void setDelivTelNo_IsNotNull() { regDelivTelNo(CK_ISNN, DOBJ); }

    protected void regDelivTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo(), "DELIV_TEL_NO"); }
    protected abstract ConditionValue xgetCValueDelivTelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_Equal(Long deliveryCourseId) {
        doSetDeliveryCourseId_Equal(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_Equal(Long deliveryCourseId) {
        regDeliveryCourseId(CK_EQ, deliveryCourseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        doSetDeliveryCourseId_NotEqual(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_NES, deliveryCourseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseIdList The collection of deliveryCourseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_InScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_INS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {bigint(19)}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_Equal(String deliveryCourseCd) {
        doSetDeliveryCourseCd_Equal(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_Equal(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_EQ, deliveryCourseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        doSetDeliveryCourseCd_NotEqual(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_NES, deliveryCourseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GT, fRES(deliveryCourseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LT, fRES(deliveryCourseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GE, fRES(deliveryCourseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LE, fRES(deliveryCourseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_InScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_INS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_NotInScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_NINS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)} <br>
     * <pre>e.g. setDeliveryCourseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseCd The value of deliveryCourseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseCd_LikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseCd_NotLikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        setDeliveryCourseCd_LikeSearch(deliveryCourseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     */
    public void setDeliveryCourseCd_IsNull() { regDeliveryCourseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     */
    public void setDeliveryCourseCd_IsNullOrEmpty() { regDeliveryCourseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(30)}
     */
    public void setDeliveryCourseCd_IsNotNull() { regDeliveryCourseCd(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_Equal(String deliveryCourseNm) {
        doSetDeliveryCourseNm_Equal(fRES(deliveryCourseNm));
    }

    protected void doSetDeliveryCourseNm_Equal(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_EQ, deliveryCourseNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_NotEqual(String deliveryCourseNm) {
        doSetDeliveryCourseNm_NotEqual(fRES(deliveryCourseNm));
    }

    protected void doSetDeliveryCourseNm_NotEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_NES, deliveryCourseNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GT, fRES(deliveryCourseNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LT, fRES(deliveryCourseNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GE, fRES(deliveryCourseNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LE, fRES(deliveryCourseNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNmList The collection of deliveryCourseNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_InScope(Collection<String> deliveryCourseNmList) {
        doSetDeliveryCourseNm_InScope(deliveryCourseNmList);
    }

    protected void doSetDeliveryCourseNm_InScope(Collection<String> deliveryCourseNmList) {
        regINS(CK_INS, cTL(deliveryCourseNmList), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNmList The collection of deliveryCourseNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_NotInScope(Collection<String> deliveryCourseNmList) {
        doSetDeliveryCourseNm_NotInScope(deliveryCourseNmList);
    }

    protected void doSetDeliveryCourseNm_NotInScope(Collection<String> deliveryCourseNmList) {
        regINS(CK_NINS, cTL(deliveryCourseNmList), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)} <br>
     * <pre>e.g. setDeliveryCourseNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseNm The value of deliveryCourseNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseNm_LikeSearch(String deliveryCourseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseNm), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseNm_NotLikeSearch(String deliveryCourseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseNm), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_PrefixSearch(String deliveryCourseNm) {
        setDeliveryCourseNm_LikeSearch(deliveryCourseNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     */
    public void setDeliveryCourseNm_IsNull() { regDeliveryCourseNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     */
    public void setDeliveryCourseNm_IsNullOrEmpty() { regDeliveryCourseNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(60)}
     */
    public void setDeliveryCourseNm_IsNotNull() { regDeliveryCourseNm(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_Equal(Long carrierId) {
        doSetCarrierId_Equal(carrierId);
    }

    protected void doSetCarrierId_Equal(Long carrierId) {
        regCarrierId(CK_EQ, carrierId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_NotEqual(Long carrierId) {
        doSetCarrierId_NotEqual(carrierId);
    }

    protected void doSetCarrierId_NotEqual(Long carrierId) {
        regCarrierId(CK_NES, carrierId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(Long carrierId) {
        regCarrierId(CK_GT, carrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(Long carrierId) {
        regCarrierId(CK_LT, carrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(Long carrierId) {
        regCarrierId(CK_GE, carrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(Long carrierId) {
        regCarrierId(CK_LE, carrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param minNumber The min number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId(), "CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierIdList The collection of carrierId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_InScope(Collection<Long> carrierIdList) {
        doSetCarrierId_InScope(carrierIdList);
    }

    protected void doSetCarrierId_InScope(Collection<Long> carrierIdList) {
        regINS(CK_INS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<Long> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<Long> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     */
    public void setCarrierId_IsNull() { regCarrierId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_ID: {bigint(19)}
     */
    public void setCarrierId_IsNotNull() { regCarrierId(CK_ISNN, DOBJ); }

    protected void regCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId(), "CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCarrierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
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
     * CARRIER_CD: {varchar(30)}
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
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(30)}
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
     * CARRIER_CD: {varchar(30)}
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
     * CARRIER_CD: {varchar(30)} <br>
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
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     */
    public void setCarrierCd_IsNull() { regCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     */
    public void setCarrierCd_IsNullOrEmpty() { regCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(30)}
     */
    public void setCarrierCd_IsNotNull() { regCarrierCd(CK_ISNN, DOBJ); }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
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
     * CARRIER_NM: {varchar(60)}
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
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterThan(String carrierNm) {
        regCarrierNm(CK_GT, fRES(carrierNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessThan(String carrierNm) {
        regCarrierNm(CK_LT, fRES(carrierNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterEqual(String carrierNm) {
        regCarrierNm(CK_GE, fRES(carrierNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessEqual(String carrierNm) {
        regCarrierNm(CK_LE, fRES(carrierNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(60)}
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
     * CARRIER_NM: {varchar(60)}
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
     * CARRIER_NM: {varchar(60)} <br>
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
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNm_NotLikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     * @param carrierNm The value of carrierNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_PrefixSearch(String carrierNm) {
        setCarrierNm_LikeSearch(carrierNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     */
    public void setCarrierNm_IsNull() { regCarrierNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     */
    public void setCarrierNm_IsNullOrEmpty() { regCarrierNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(60)}
     */
    public void setCarrierNm_IsNotNull() { regCarrierNm(CK_ISNN, DOBJ); }

    protected void regCarrierNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNm(), "CARRIER_NM"); }
    protected abstract ConditionValue xgetCValueCarrierNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal(String emergencyFlg) {
        doSetEmergencyFlg_Equal(fRES(emergencyFlg));
    }

    /**
     * Equal(=). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_Equal_$0() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_Equal_$1() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_Equal(String emergencyFlg) {
        regEmergencyFlg(CK_EQ, emergencyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual(String emergencyFlg) {
        doSetEmergencyFlg_NotEqual(fRES(emergencyFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_NotEqual_$0() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_NotEqual_$1() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_NotEqual(String emergencyFlg) {
        regEmergencyFlg(CK_NES, emergencyFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_InScope(emergencyFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        regINS(CK_INS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_NotInScope(emergencyFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        regINS(CK_NINS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNull() { regEmergencyFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNotNull() { regEmergencyFlg(CK_ISNN, DOBJ); }

    protected void regEmergencyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmergencyFlg(), "EMERGENCY_FLG"); }
    protected abstract ConditionValue xgetCValueEmergencyFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_Equal(String pickingWorkMessage) {
        doSetPickingWorkMessage_Equal(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_Equal(String pickingWorkMessage) {
        regPickingWorkMessage(CK_EQ, pickingWorkMessage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        doSetPickingWorkMessage_NotEqual(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_NES, pickingWorkMessage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GT, fRES(pickingWorkMessage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LT, fRES(pickingWorkMessage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GE, fRES(pickingWorkMessage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LE, fRES(pickingWorkMessage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_InScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_INS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_NotInScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_NINS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)} <br>
     * <pre>e.g. setPickingWorkMessage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkMessage The value of pickingWorkMessage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkMessage_LikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkMessage_NotLikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_PrefixSearch(String pickingWorkMessage) {
        setPickingWorkMessage_LikeSearch(pickingWorkMessage, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     */
    public void setPickingWorkMessage_IsNull() { regPickingWorkMessage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     */
    public void setPickingWorkMessage_IsNullOrEmpty() { regPickingWorkMessage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {varchar(255)}
     */
    public void setPickingWorkMessage_IsNotNull() { regPickingWorkMessage(CK_ISNN, DOBJ); }

    protected void regPickingWorkMessage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE"); }
    protected abstract ConditionValue xgetCValuePickingWorkMessage();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_Equal(totalPrice);
    }

    protected void doSetTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_EQ, totalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_NotEqual(totalPrice);
    }

    protected void doSetTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_NES, totalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GT, totalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LT, totalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GE, totalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPrice The value of totalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LE, totalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param minNumber The min number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPrice(), "TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPriceList The collection of totalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_InScope(totalPriceList);
    }

    protected void doSetTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_INS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     * @param totalPriceList The collection of totalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_NotInScope(totalPriceList);
    }

    protected void doSetTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_NINS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     */
    public void setTotalPrice_IsNull() { regTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {decimal(16, 6)}
     */
    public void setTotalPrice_IsNotNull() { regTotalPrice(CK_ISNN, DOBJ); }

    protected void regTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPrice(), "TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueTotalPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_Equal(java.math.BigDecimal totalTax) {
        doSetTotalTax_Equal(totalTax);
    }

    protected void doSetTotalTax_Equal(java.math.BigDecimal totalTax) {
        regTotalTax(CK_EQ, totalTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        doSetTotalTax_NotEqual(totalTax);
    }

    protected void doSetTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_NES, totalTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GT, totalTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LT, totalTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GE, totalTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTax The value of totalTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LE, totalTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param minNumber The min number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalTax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalTax(), "TOTAL_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTaxList The collection of totalTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_InScope(totalTaxList);
    }

    protected void doSetTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_INS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     * @param totalTaxList The collection of totalTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_NotInScope(totalTaxList);
    }

    protected void doSetTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_NINS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     */
    public void setTotalTax_IsNull() { regTotalTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {decimal(16, 6)}
     */
    public void setTotalTax_IsNotNull() { regTotalTax(CK_ISNN, DOBJ); }

    protected void regTotalTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalTax(), "TOTAL_TAX"); }
    protected abstract ConditionValue xgetCValueTotalTax();

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
    public HpSLCFunction<HShippingHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HShippingHCB.class);
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
    public HpSLCFunction<HShippingHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HShippingHCB.class);
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
    public HpSLCFunction<HShippingHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HShippingHCB.class);
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
    public HpSLCFunction<HShippingHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HShippingHCB.class);
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
    public HpSLCFunction<HShippingHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HShippingHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HShippingHCB&gt;() {
     *     public void query(HShippingHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HShippingHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HShippingHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HShippingHCQ sq);

    protected HShippingHCB xcreateScalarConditionCB() {
        HShippingHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HShippingHCB xcreateScalarConditionPartitionByCB() {
        HShippingHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HShippingHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HShippingHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HShippingHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HShippingHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HShippingHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HShippingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HShippingHCB cb = new HShippingHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HShippingHCQ sq);

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
    protected HShippingHCB newMyCB() {
        return new HShippingHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HShippingHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
