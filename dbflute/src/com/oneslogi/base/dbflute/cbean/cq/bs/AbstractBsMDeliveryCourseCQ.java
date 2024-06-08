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
 * The abstract condition-query of M_DELIVERY_COURSE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMDeliveryCourseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMDeliveryCourseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_DELIVERY_COURSE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIVERY_COURSE_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterCustomerList for 'exists'. (NotNull)
     */
    public void existsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_ExistsReferrer_MCenterCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepDeliveryCourseId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIVERY_COURSE_ID from M_PARAM where ...)} <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MParamList for 'exists'. (NotNull)
     */
    public void existsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_ExistsReferrer_MParamList(cb.query());
        registerExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mParamList");
    }
    public abstract String keepDeliveryCourseId_ExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIVERY_COURSE_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_ExistsReferrer_TAllocInstHList(cb.query());
        registerExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tAllocInstHList");
    }
    public abstract String keepDeliveryCourseId_ExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIVERY_COURSE_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_ExistsReferrer_TShippingInstHList(cb.query());
        registerExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tShippingInstHList");
    }
    public abstract String keepDeliveryCourseId_ExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIVERY_COURSE_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtLoadingList for 'exists'. (NotNull)
     */
    public void existsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_ExistsReferrer_WHtLoadingList(cb.query());
        registerExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "wHtLoadingList");
    }
    public abstract String keepDeliveryCourseId_ExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIVERY_COURSE_ID from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeliveryCourseId_NotExistsReferrer_MCenterCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_NotExistsReferrer_MCenterCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepDeliveryCourseId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIVERY_COURSE_ID from M_PARAM where ...)} <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMParamList</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeliveryCourseId_NotExistsReferrer_MParamList for 'not exists'. (NotNull)
     */
    public void notExistsMParamList(SubQuery<MParamCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MParamCB cb = new MParamCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_NotExistsReferrer_MParamList(cb.query());
        registerNotExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mParamList");
    }
    public abstract String keepDeliveryCourseId_NotExistsReferrer_MParamList(MParamCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIVERY_COURSE_ID from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeliveryCourseId_NotExistsReferrer_TAllocInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_NotExistsReferrer_TAllocInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tAllocInstHList");
    }
    public abstract String keepDeliveryCourseId_NotExistsReferrer_TAllocInstHList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIVERY_COURSE_ID from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeliveryCourseId_NotExistsReferrer_TShippingInstHList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_NotExistsReferrer_TShippingInstHList(cb.query());
        registerNotExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tShippingInstHList");
    }
    public abstract String keepDeliveryCourseId_NotExistsReferrer_TShippingInstHList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIVERY_COURSE_ID from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtLoadingList</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DeliveryCourseId_NotExistsReferrer_WHtLoadingList for 'not exists'. (NotNull)
     */
    public void notExistsWHtLoadingList(SubQuery<WHtLoadingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDeliveryCourseId_NotExistsReferrer_WHtLoadingList(cb.query());
        registerNotExistsReferrer(cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "wHtLoadingList");
    }
    public abstract String keepDeliveryCourseId_NotExistsReferrer_WHtLoadingList(WHtLoadingCQ sq);

    public void xsderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mCenterCustomerList", al, op);
    }
    public abstract String keepDeliveryCourseId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    public void xsderiveMParamList(String fn, SubQuery<MParamCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeliveryCourseId_SpecifyDerivedReferrer_MParamList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "mParamList", al, op);
    }
    public abstract String keepDeliveryCourseId_SpecifyDerivedReferrer_MParamList(MParamCQ sq);

    public void xsderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tAllocInstHList", al, op);
    }
    public abstract String keepDeliveryCourseId_SpecifyDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);

    public void xsderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "tShippingInstHList", al, op);
    }
    public abstract String keepDeliveryCourseId_SpecifyDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);

    public void xsderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDeliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", pp, "wHtLoadingList", al, op);
    }
    public abstract String keepDeliveryCourseId_SpecifyDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_CENTER_CUSTOMER where ...)} <br>
     * M_CENTER_CUSTOMER by DELIVERY_COURSE_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCustomerCB> derivedMCenterCustomerList() {
        return xcreateQDRFunctionMCenterCustomerList();
    }
    protected HpQDRFunction<MCenterCustomerCB> xcreateQDRFunctionMCenterCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerList(cb.query()); String prpp = keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", sqpp, "mCenterCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_PARAM where ...)} <br>
     * M_PARAM by DELIVERY_COURSE_ID, named 'MParamAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMParamList()</span>.<span style="color: #CC4747">max</span>(paramCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     paramCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     paramCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MParamCB> derivedMParamList() {
        return xcreateQDRFunctionMParamList();
    }
    protected HpQDRFunction<MParamCB> xcreateQDRFunctionMParamList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMParamList(fn, sq, rd, vl, op));
    }
    public void xqderiveMParamList(String fn, SubQuery<MParamCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MParamCB cb = new MParamCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeliveryCourseId_QueryDerivedReferrer_MParamList(cb.query()); String prpp = keepDeliveryCourseId_QueryDerivedReferrer_MParamListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", sqpp, "mParamList", rd, vl, prpp, op);
    }
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_MParamList(MParamCQ sq);
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_MParamListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_ALLOC_INST_H where ...)} <br>
     * T_ALLOC_INST_H by DELIVERY_COURSE_ID, named 'TAllocInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHList() {
        return xcreateQDRFunctionTAllocInstHList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHList(cb.query()); String prpp = keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", sqpp, "tAllocInstHList", rd, vl, prpp, op);
    }
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHList(TAllocInstHCQ sq);
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_TAllocInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_SHIPPING_INST_H where ...)} <br>
     * T_SHIPPING_INST_H by DELIVERY_COURSE_ID, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHList() {
        return xcreateQDRFunctionTShippingInstHList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHList(cb.query()); String prpp = keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", sqpp, "tShippingInstHList", rd, vl, prpp, op);
    }
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHList(TShippingInstHCQ sq);
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_TShippingInstHListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from W_HT_LOADING where ...)} <br>
     * W_HT_LOADING by DELIVERY_COURSE_ID, named 'WHtLoadingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtLoadingList()</span>.<span style="color: #CC4747">max</span>(loadingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     loadingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     loadingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtLoadingCB> derivedWHtLoadingList() {
        return xcreateQDRFunctionWHtLoadingList();
    }
    protected HpQDRFunction<WHtLoadingCB> xcreateQDRFunctionWHtLoadingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtLoadingList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtLoadingList(String fn, SubQuery<WHtLoadingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtLoadingCB cb = new WHtLoadingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingList(cb.query()); String prpp = keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DELIVERY_COURSE_ID", "DELIVERY_COURSE_ID", sqpp, "wHtLoadingList", rd, vl, prpp, op);
    }
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingList(WHtLoadingCQ sq);
    public abstract String keepDeliveryCourseId_QueryDerivedReferrer_WHtLoadingListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * CENTER_ID: {UQ+, NotNull, bigint(19), FK to M_CENTER}
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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
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
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
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
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GT, fRES(deliveryCourseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LT, fRES(deliveryCourseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GE, fRES(deliveryCourseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LE, fRES(deliveryCourseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
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
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
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
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)} <br>
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
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseCd_NotLikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {+UQ, IX, NotNull, varchar(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        setDeliveryCourseCd_LikeSearch(deliveryCourseCd, xcLSOPPre());
    }

    protected void regDeliveryCourseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
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
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
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
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GT, fRES(deliveryCourseNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LT, fRES(deliveryCourseNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GE, fRES(deliveryCourseNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LE, fRES(deliveryCourseNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
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
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
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
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)} <br>
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
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseNm_NotLikeSearch(String deliveryCourseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseNm), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {NotNull, varchar(60)}
     * @param deliveryCourseNm The value of deliveryCourseNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_PrefixSearch(String deliveryCourseNm) {
        setDeliveryCourseNm_LikeSearch(deliveryCourseNm, xcLSOPPre());
    }

    protected void regDeliveryCourseNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
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
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
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
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterThan(Long carrierId) {
        regCarrierId(CK_GT, carrierId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessThan(Long carrierId) {
        regCarrierId(CK_LT, carrierId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_GreaterEqual(Long carrierId) {
        regCarrierId(CK_GE, carrierId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierId The value of carrierId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierId_LessEqual(Long carrierId) {
        regCarrierId(CK_LE, carrierId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param minNumber The min number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierId(), "CARRIER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
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
     * CARRIER_ID: {IX, NotNull, bigint(19), FK to M_CARRIER}
     * @param carrierIdList The collection of carrierId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierId_NotInScope(Collection<Long> carrierIdList) {
        doSetCarrierId_NotInScope(carrierIdList);
    }

    protected void doSetCarrierId_NotInScope(Collection<Long> carrierIdList) {
        regINS(CK_NINS, cTL(carrierIdList), xgetCValueCarrierId(), "CARRIER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_ID from M_CARRIER where ...)} <br />
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @param subCBLambda The callback for sub-query of MCarrier for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrier(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_InScopeRelation_MCarrier(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrier", false);
    }
    public abstract String keepCarrierId_InScopeRelation_MCarrier(MCarrierCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_ID from M_CARRIER where ...)} <br />
     * M_CARRIER by my CARRIER_ID, named 'MCarrier'.
     * @param subCBLambda The callback for sub-query of MCarrier for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrier(SubQuery<MCarrierCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierCB cb = new MCarrierCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierId_NotInScopeRelation_MCarrier(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_ID", "CARRIER_ID", pp, "mCarrier", true);
    }
    public abstract String keepCarrierId_NotInScopeRelation_MCarrier(MCarrierCQ sq);

    protected void regCarrierId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierId(), "CARRIER_ID"); }
    protected abstract ConditionValue xgetCValueCarrierId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_Equal(String pickingTime) {
        doSetPickingTime_Equal(fRES(pickingTime));
    }

    protected void doSetPickingTime_Equal(String pickingTime) {
        regPickingTime(CK_EQ, pickingTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_NotEqual(String pickingTime) {
        doSetPickingTime_NotEqual(fRES(pickingTime));
    }

    protected void doSetPickingTime_NotEqual(String pickingTime) {
        regPickingTime(CK_NES, pickingTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_GreaterThan(String pickingTime) {
        regPickingTime(CK_GT, fRES(pickingTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_LessThan(String pickingTime) {
        regPickingTime(CK_LT, fRES(pickingTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_GreaterEqual(String pickingTime) {
        regPickingTime(CK_GE, fRES(pickingTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_LessEqual(String pickingTime) {
        regPickingTime(CK_LE, fRES(pickingTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTimeList The collection of pickingTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_InScope(Collection<String> pickingTimeList) {
        doSetPickingTime_InScope(pickingTimeList);
    }

    protected void doSetPickingTime_InScope(Collection<String> pickingTimeList) {
        regINS(CK_INS, cTL(pickingTimeList), xgetCValuePickingTime(), "PICKING_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTimeList The collection of pickingTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_NotInScope(Collection<String> pickingTimeList) {
        doSetPickingTime_NotInScope(pickingTimeList);
    }

    protected void doSetPickingTime_NotInScope(Collection<String> pickingTimeList) {
        regINS(CK_NINS, cTL(pickingTimeList), xgetCValuePickingTime(), "PICKING_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_TIME: {varchar(60)} <br>
     * <pre>e.g. setPickingTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingTime The value of pickingTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingTime_LikeSearch(String pickingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingTime), xgetCValuePickingTime(), "PICKING_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingTime_NotLikeSearch(String pickingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingTime), xgetCValuePickingTime(), "PICKING_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     * @param pickingTime The value of pickingTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingTime_PrefixSearch(String pickingTime) {
        setPickingTime_LikeSearch(pickingTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     */
    public void setPickingTime_IsNull() { regPickingTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     */
    public void setPickingTime_IsNullOrEmpty() { regPickingTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_TIME: {varchar(60)}
     */
    public void setPickingTime_IsNotNull() { regPickingTime(CK_ISNN, DOBJ); }

    protected void regPickingTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingTime(), "PICKING_TIME"); }
    protected abstract ConditionValue xgetCValuePickingTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_Equal(String stowageTime) {
        doSetStowageTime_Equal(fRES(stowageTime));
    }

    protected void doSetStowageTime_Equal(String stowageTime) {
        regStowageTime(CK_EQ, stowageTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_NotEqual(String stowageTime) {
        doSetStowageTime_NotEqual(fRES(stowageTime));
    }

    protected void doSetStowageTime_NotEqual(String stowageTime) {
        regStowageTime(CK_NES, stowageTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_GreaterThan(String stowageTime) {
        regStowageTime(CK_GT, fRES(stowageTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_LessThan(String stowageTime) {
        regStowageTime(CK_LT, fRES(stowageTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_GreaterEqual(String stowageTime) {
        regStowageTime(CK_GE, fRES(stowageTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_LessEqual(String stowageTime) {
        regStowageTime(CK_LE, fRES(stowageTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTimeList The collection of stowageTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_InScope(Collection<String> stowageTimeList) {
        doSetStowageTime_InScope(stowageTimeList);
    }

    protected void doSetStowageTime_InScope(Collection<String> stowageTimeList) {
        regINS(CK_INS, cTL(stowageTimeList), xgetCValueStowageTime(), "STOWAGE_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTimeList The collection of stowageTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_NotInScope(Collection<String> stowageTimeList) {
        doSetStowageTime_NotInScope(stowageTimeList);
    }

    protected void doSetStowageTime_NotInScope(Collection<String> stowageTimeList) {
        regINS(CK_NINS, cTL(stowageTimeList), xgetCValueStowageTime(), "STOWAGE_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOWAGE_TIME: {varchar(60)} <br>
     * <pre>e.g. setStowageTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stowageTime The value of stowageTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStowageTime_LikeSearch(String stowageTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stowageTime), xgetCValueStowageTime(), "STOWAGE_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStowageTime_NotLikeSearch(String stowageTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stowageTime), xgetCValueStowageTime(), "STOWAGE_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     * @param stowageTime The value of stowageTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStowageTime_PrefixSearch(String stowageTime) {
        setStowageTime_LikeSearch(stowageTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     */
    public void setStowageTime_IsNull() { regStowageTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     */
    public void setStowageTime_IsNullOrEmpty() { regStowageTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOWAGE_TIME: {varchar(60)}
     */
    public void setStowageTime_IsNotNull() { regStowageTime(CK_ISNN, DOBJ); }

    protected void regStowageTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStowageTime(), "STOWAGE_TIME"); }
    protected abstract ConditionValue xgetCValueStowageTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_Equal(String shippingTime) {
        doSetShippingTime_Equal(fRES(shippingTime));
    }

    protected void doSetShippingTime_Equal(String shippingTime) {
        regShippingTime(CK_EQ, shippingTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_NotEqual(String shippingTime) {
        doSetShippingTime_NotEqual(fRES(shippingTime));
    }

    protected void doSetShippingTime_NotEqual(String shippingTime) {
        regShippingTime(CK_NES, shippingTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_GreaterThan(String shippingTime) {
        regShippingTime(CK_GT, fRES(shippingTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_LessThan(String shippingTime) {
        regShippingTime(CK_LT, fRES(shippingTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_GreaterEqual(String shippingTime) {
        regShippingTime(CK_GE, fRES(shippingTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_LessEqual(String shippingTime) {
        regShippingTime(CK_LE, fRES(shippingTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTimeList The collection of shippingTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_InScope(Collection<String> shippingTimeList) {
        doSetShippingTime_InScope(shippingTimeList);
    }

    protected void doSetShippingTime_InScope(Collection<String> shippingTimeList) {
        regINS(CK_INS, cTL(shippingTimeList), xgetCValueShippingTime(), "SHIPPING_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTimeList The collection of shippingTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_NotInScope(Collection<String> shippingTimeList) {
        doSetShippingTime_NotInScope(shippingTimeList);
    }

    protected void doSetShippingTime_NotInScope(Collection<String> shippingTimeList) {
        regINS(CK_NINS, cTL(shippingTimeList), xgetCValueShippingTime(), "SHIPPING_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TIME: {varchar(60)} <br>
     * <pre>e.g. setShippingTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingTime The value of shippingTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingTime_LikeSearch(String shippingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingTime), xgetCValueShippingTime(), "SHIPPING_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingTime_NotLikeSearch(String shippingTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingTime), xgetCValueShippingTime(), "SHIPPING_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     * @param shippingTime The value of shippingTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTime_PrefixSearch(String shippingTime) {
        setShippingTime_LikeSearch(shippingTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     */
    public void setShippingTime_IsNull() { regShippingTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     */
    public void setShippingTime_IsNullOrEmpty() { regShippingTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TIME: {varchar(60)}
     */
    public void setShippingTime_IsNotNull() { regShippingTime(CK_ISNN, DOBJ); }

    protected void regShippingTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTime(), "SHIPPING_TIME"); }
    protected abstract ConditionValue xgetCValueShippingTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_Equal(Long carrierSlipYmtId) {
        doSetCarrierSlipYmtId_Equal(carrierSlipYmtId);
    }

    protected void doSetCarrierSlipYmtId_Equal(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_EQ, carrierSlipYmtId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_NotEqual(Long carrierSlipYmtId) {
        doSetCarrierSlipYmtId_NotEqual(carrierSlipYmtId);
    }

    protected void doSetCarrierSlipYmtId_NotEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_NES, carrierSlipYmtId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_GreaterThan(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_GT, carrierSlipYmtId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_LessThan(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_LT, carrierSlipYmtId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_GreaterEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_GE, carrierSlipYmtId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtId The value of carrierSlipYmtId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_LessEqual(Long carrierSlipYmtId) {
        regCarrierSlipYmtId(CK_LE, carrierSlipYmtId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param minNumber The min number of carrierSlipYmtId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipYmtId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipYmtId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtIdList The collection of carrierSlipYmtId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_InScope(Collection<Long> carrierSlipYmtIdList) {
        doSetCarrierSlipYmtId_InScope(carrierSlipYmtIdList);
    }

    protected void doSetCarrierSlipYmtId_InScope(Collection<Long> carrierSlipYmtIdList) {
        regINS(CK_INS, cTL(carrierSlipYmtIdList), xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     * @param carrierSlipYmtIdList The collection of carrierSlipYmtId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYmtId_NotInScope(Collection<Long> carrierSlipYmtIdList) {
        doSetCarrierSlipYmtId_NotInScope(carrierSlipYmtIdList);
    }

    protected void doSetCarrierSlipYmtId_NotInScope(Collection<Long> carrierSlipYmtIdList) {
        regINS(CK_NINS, cTL(carrierSlipYmtIdList), xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_SLIP_YMT_ID from M_CARRIER_SLIP_YMT where ...)} <br />
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipYmt for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierSlipYmt(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", pp, "mCarrierSlipYmt", false);
    }
    public abstract String keepCarrierSlipYmtId_InScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_SLIP_YMT_ID from M_CARRIER_SLIP_YMT where ...)} <br />
     * M_CARRIER_SLIP_YMT by my CARRIER_SLIP_YMT_ID, named 'MCarrierSlipYmt'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipYmt for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierSlipYmt(SubQuery<MCarrierSlipYmtCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYmtCB cb = new MCarrierSlipYmtCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_YMT_ID", "CARRIER_SLIP_YMT_ID", pp, "mCarrierSlipYmt", true);
    }
    public abstract String keepCarrierSlipYmtId_NotInScopeRelation_MCarrierSlipYmt(MCarrierSlipYmtCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     */
    public void setCarrierSlipYmtId_IsNull() { regCarrierSlipYmtId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YMT_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YMT}
     */
    public void setCarrierSlipYmtId_IsNotNull() { regCarrierSlipYmtId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipYmtId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipYmtId(), "CARRIER_SLIP_YMT_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipYmtId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_Equal(Long carrierSlipSgwId) {
        doSetCarrierSlipSgwId_Equal(carrierSlipSgwId);
    }

    protected void doSetCarrierSlipSgwId_Equal(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_EQ, carrierSlipSgwId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_NotEqual(Long carrierSlipSgwId) {
        doSetCarrierSlipSgwId_NotEqual(carrierSlipSgwId);
    }

    protected void doSetCarrierSlipSgwId_NotEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_NES, carrierSlipSgwId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_GreaterThan(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_GT, carrierSlipSgwId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_LessThan(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_LT, carrierSlipSgwId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_GreaterEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_GE, carrierSlipSgwId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwId The value of carrierSlipSgwId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_LessEqual(Long carrierSlipSgwId) {
        regCarrierSlipSgwId(CK_LE, carrierSlipSgwId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param minNumber The min number of carrierSlipSgwId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipSgwId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipSgwId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwIdList The collection of carrierSlipSgwId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_InScope(Collection<Long> carrierSlipSgwIdList) {
        doSetCarrierSlipSgwId_InScope(carrierSlipSgwIdList);
    }

    protected void doSetCarrierSlipSgwId_InScope(Collection<Long> carrierSlipSgwIdList) {
        regINS(CK_INS, cTL(carrierSlipSgwIdList), xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     * @param carrierSlipSgwIdList The collection of carrierSlipSgwId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipSgwId_NotInScope(Collection<Long> carrierSlipSgwIdList) {
        doSetCarrierSlipSgwId_NotInScope(carrierSlipSgwIdList);
    }

    protected void doSetCarrierSlipSgwId_NotInScope(Collection<Long> carrierSlipSgwIdList) {
        regINS(CK_NINS, cTL(carrierSlipSgwIdList), xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_SLIP_SGW_ID from M_CARRIER_SLIP_SGW where ...)} <br />
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipSgw for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierSlipSgw(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", pp, "mCarrierSlipSgw", false);
    }
    public abstract String keepCarrierSlipSgwId_InScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_SLIP_SGW_ID from M_CARRIER_SLIP_SGW where ...)} <br />
     * M_CARRIER_SLIP_SGW by my CARRIER_SLIP_SGW_ID, named 'MCarrierSlipSgw'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipSgw for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierSlipSgw(SubQuery<MCarrierSlipSgwCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipSgwCB cb = new MCarrierSlipSgwCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_SGW_ID", "CARRIER_SLIP_SGW_ID", pp, "mCarrierSlipSgw", true);
    }
    public abstract String keepCarrierSlipSgwId_NotInScopeRelation_MCarrierSlipSgw(MCarrierSlipSgwCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     */
    public void setCarrierSlipSgwId_IsNull() { regCarrierSlipSgwId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_SGW_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_SGW}
     */
    public void setCarrierSlipSgwId_IsNotNull() { regCarrierSlipSgwId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipSgwId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipSgwId(), "CARRIER_SLIP_SGW_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipSgwId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_Equal(Long carrierSlipYupkId) {
        doSetCarrierSlipYupkId_Equal(carrierSlipYupkId);
    }

    protected void doSetCarrierSlipYupkId_Equal(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_EQ, carrierSlipYupkId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_NotEqual(Long carrierSlipYupkId) {
        doSetCarrierSlipYupkId_NotEqual(carrierSlipYupkId);
    }

    protected void doSetCarrierSlipYupkId_NotEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_NES, carrierSlipYupkId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_GreaterThan(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_GT, carrierSlipYupkId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_LessThan(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_LT, carrierSlipYupkId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_GreaterEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_GE, carrierSlipYupkId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkId The value of carrierSlipYupkId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_LessEqual(Long carrierSlipYupkId) {
        regCarrierSlipYupkId(CK_LE, carrierSlipYupkId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param minNumber The min number of carrierSlipYupkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of carrierSlipYupkId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCarrierSlipYupkId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkIdList The collection of carrierSlipYupkId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_InScope(Collection<Long> carrierSlipYupkIdList) {
        doSetCarrierSlipYupkId_InScope(carrierSlipYupkIdList);
    }

    protected void doSetCarrierSlipYupkId_InScope(Collection<Long> carrierSlipYupkIdList) {
        regINS(CK_INS, cTL(carrierSlipYupkIdList), xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     * @param carrierSlipYupkIdList The collection of carrierSlipYupkId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipYupkId_NotInScope(Collection<Long> carrierSlipYupkIdList) {
        doSetCarrierSlipYupkId_NotInScope(carrierSlipYupkIdList);
    }

    protected void doSetCarrierSlipYupkId_NotInScope(Collection<Long> carrierSlipYupkIdList) {
        regINS(CK_NINS, cTL(carrierSlipYupkIdList), xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CARRIER_SLIP_YUPK_ID from M_CARRIER_SLIP_YUPK where ...)} <br />
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipYupk for 'in-scope'. (NotNull)
     */
    public void inScopeMCarrierSlipYupk(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", pp, "mCarrierSlipYupk", false);
    }
    public abstract String keepCarrierSlipYupkId_InScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CARRIER_SLIP_YUPK_ID from M_CARRIER_SLIP_YUPK where ...)} <br />
     * M_CARRIER_SLIP_YUPK by my CARRIER_SLIP_YUPK_ID, named 'MCarrierSlipYupk'.
     * @param subCBLambda The callback for sub-query of MCarrierSlipYupk for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCarrierSlipYupk(SubQuery<MCarrierSlipYupkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipYupkCB cb = new MCarrierSlipYupkCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk(cb.query());
        registerInScopeRelation(cb.query(), "CARRIER_SLIP_YUPK_ID", "CARRIER_SLIP_YUPK_ID", pp, "mCarrierSlipYupk", true);
    }
    public abstract String keepCarrierSlipYupkId_NotInScopeRelation_MCarrierSlipYupk(MCarrierSlipYupkCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     */
    public void setCarrierSlipYupkId_IsNull() { regCarrierSlipYupkId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_YUPK_ID: {IX, bigint(19), FK to M_CARRIER_SLIP_YUPK}
     */
    public void setCarrierSlipYupkId_IsNotNull() { regCarrierSlipYupkId(CK_ISNN, DOBJ); }

    protected void regCarrierSlipYupkId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipYupkId(), "CARRIER_SLIP_YUPK_ID"); }
    protected abstract ConditionValue xgetCValueCarrierSlipYupkId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_Equal(String trackingNumberingKey) {
        doSetTrackingNumberingKey_Equal(fRES(trackingNumberingKey));
    }

    protected void doSetTrackingNumberingKey_Equal(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_EQ, trackingNumberingKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_NotEqual(String trackingNumberingKey) {
        doSetTrackingNumberingKey_NotEqual(fRES(trackingNumberingKey));
    }

    protected void doSetTrackingNumberingKey_NotEqual(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_NES, trackingNumberingKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_GreaterThan(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_GT, fRES(trackingNumberingKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_LessThan(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_LT, fRES(trackingNumberingKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_GreaterEqual(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_GE, fRES(trackingNumberingKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_LessEqual(String trackingNumberingKey) {
        regTrackingNumberingKey(CK_LE, fRES(trackingNumberingKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKeyList The collection of trackingNumberingKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_InScope(Collection<String> trackingNumberingKeyList) {
        doSetTrackingNumberingKey_InScope(trackingNumberingKeyList);
    }

    protected void doSetTrackingNumberingKey_InScope(Collection<String> trackingNumberingKeyList) {
        regINS(CK_INS, cTL(trackingNumberingKeyList), xgetCValueTrackingNumberingKey(), "TRACKING_NUMBERING_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKeyList The collection of trackingNumberingKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_NotInScope(Collection<String> trackingNumberingKeyList) {
        doSetTrackingNumberingKey_NotInScope(trackingNumberingKeyList);
    }

    protected void doSetTrackingNumberingKey_NotInScope(Collection<String> trackingNumberingKeyList) {
        regINS(CK_NINS, cTL(trackingNumberingKeyList), xgetCValueTrackingNumberingKey(), "TRACKING_NUMBERING_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)} <br>
     * <pre>e.g. setTrackingNumberingKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trackingNumberingKey The value of trackingNumberingKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrackingNumberingKey_LikeSearch(String trackingNumberingKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trackingNumberingKey), xgetCValueTrackingNumberingKey(), "TRACKING_NUMBERING_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrackingNumberingKey_NotLikeSearch(String trackingNumberingKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trackingNumberingKey), xgetCValueTrackingNumberingKey(), "TRACKING_NUMBERING_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     * @param trackingNumberingKey The value of trackingNumberingKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingKey_PrefixSearch(String trackingNumberingKey) {
        setTrackingNumberingKey_LikeSearch(trackingNumberingKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     */
    public void setTrackingNumberingKey_IsNull() { regTrackingNumberingKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     */
    public void setTrackingNumberingKey_IsNullOrEmpty() { regTrackingNumberingKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_KEY: {varchar(30)}
     */
    public void setTrackingNumberingKey_IsNotNull() { regTrackingNumberingKey(CK_ISNN, DOBJ); }

    protected void regTrackingNumberingKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingNumberingKey(), "TRACKING_NUMBERING_KEY"); }
    protected abstract ConditionValue xgetCValueTrackingNumberingKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_Equal(String trackingNumberingAfterKey) {
        doSetTrackingNumberingAfterKey_Equal(fRES(trackingNumberingAfterKey));
    }

    protected void doSetTrackingNumberingAfterKey_Equal(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_EQ, trackingNumberingAfterKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_NotEqual(String trackingNumberingAfterKey) {
        doSetTrackingNumberingAfterKey_NotEqual(fRES(trackingNumberingAfterKey));
    }

    protected void doSetTrackingNumberingAfterKey_NotEqual(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_NES, trackingNumberingAfterKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_GreaterThan(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_GT, fRES(trackingNumberingAfterKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_LessThan(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_LT, fRES(trackingNumberingAfterKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_GreaterEqual(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_GE, fRES(trackingNumberingAfterKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_LessEqual(String trackingNumberingAfterKey) {
        regTrackingNumberingAfterKey(CK_LE, fRES(trackingNumberingAfterKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKeyList The collection of trackingNumberingAfterKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_InScope(Collection<String> trackingNumberingAfterKeyList) {
        doSetTrackingNumberingAfterKey_InScope(trackingNumberingAfterKeyList);
    }

    protected void doSetTrackingNumberingAfterKey_InScope(Collection<String> trackingNumberingAfterKeyList) {
        regINS(CK_INS, cTL(trackingNumberingAfterKeyList), xgetCValueTrackingNumberingAfterKey(), "TRACKING_NUMBERING_AFTER_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKeyList The collection of trackingNumberingAfterKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_NotInScope(Collection<String> trackingNumberingAfterKeyList) {
        doSetTrackingNumberingAfterKey_NotInScope(trackingNumberingAfterKeyList);
    }

    protected void doSetTrackingNumberingAfterKey_NotInScope(Collection<String> trackingNumberingAfterKeyList) {
        regINS(CK_NINS, cTL(trackingNumberingAfterKeyList), xgetCValueTrackingNumberingAfterKey(), "TRACKING_NUMBERING_AFTER_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)} <br>
     * <pre>e.g. setTrackingNumberingAfterKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrackingNumberingAfterKey_LikeSearch(String trackingNumberingAfterKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trackingNumberingAfterKey), xgetCValueTrackingNumberingAfterKey(), "TRACKING_NUMBERING_AFTER_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrackingNumberingAfterKey_NotLikeSearch(String trackingNumberingAfterKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trackingNumberingAfterKey), xgetCValueTrackingNumberingAfterKey(), "TRACKING_NUMBERING_AFTER_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     * @param trackingNumberingAfterKey The value of trackingNumberingAfterKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingAfterKey_PrefixSearch(String trackingNumberingAfterKey) {
        setTrackingNumberingAfterKey_LikeSearch(trackingNumberingAfterKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     */
    public void setTrackingNumberingAfterKey_IsNull() { regTrackingNumberingAfterKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     */
    public void setTrackingNumberingAfterKey_IsNullOrEmpty() { regTrackingNumberingAfterKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_AFTER_KEY: {varchar(30)}
     */
    public void setTrackingNumberingAfterKey_IsNotNull() { regTrackingNumberingAfterKey(CK_ISNN, DOBJ); }

    protected void regTrackingNumberingAfterKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingNumberingAfterKey(), "TRACKING_NUMBERING_AFTER_KEY"); }
    protected abstract ConditionValue xgetCValueTrackingNumberingAfterKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @param trackingNumberingUnit The value of trackingNumberingUnit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_Equal(String trackingNumberingUnit) {
        doSetTrackingNumberingUnit_Equal(fRES(trackingNumberingUnit));
    }

    /**
     * Equal(=). As TrackingNumberingUnit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_Equal_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit cdef) {
        doSetTrackingNumberingUnit_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫作業No単位
     */
    public void setTrackingNumberingUnit_Equal_$1() {
        setTrackingNumberingUnit_Equal_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 梱包単位
     */
    public void setTrackingNumberingUnit_Equal_$2() {
        setTrackingNumberingUnit_Equal_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$2);
    }

    protected void doSetTrackingNumberingUnit_Equal(String trackingNumberingUnit) {
        regTrackingNumberingUnit(CK_EQ, trackingNumberingUnit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @param trackingNumberingUnit The value of trackingNumberingUnit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_NotEqual(String trackingNumberingUnit) {
        doSetTrackingNumberingUnit_NotEqual(fRES(trackingNumberingUnit));
    }

    /**
     * NotEqual(&lt;&gt;). As TrackingNumberingUnit. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_NotEqual_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit cdef) {
        doSetTrackingNumberingUnit_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出庫作業No単位
     */
    public void setTrackingNumberingUnit_NotEqual_$1() {
        setTrackingNumberingUnit_NotEqual_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: 梱包単位
     */
    public void setTrackingNumberingUnit_NotEqual_$2() {
        setTrackingNumberingUnit_NotEqual_AsTrackingNumberingUnit(CDef.TrackingNumberingUnit.$2);
    }

    protected void doSetTrackingNumberingUnit_NotEqual(String trackingNumberingUnit) {
        regTrackingNumberingUnit(CK_NES, trackingNumberingUnit);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @param trackingNumberingUnitList The collection of trackingNumberingUnit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_InScope(Collection<String> trackingNumberingUnitList) {
        doSetTrackingNumberingUnit_InScope(trackingNumberingUnitList);
    }

    /**
     * InScope {in ('a', 'b')}. As TrackingNumberingUnit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_InScope_AsTrackingNumberingUnit(Collection<CDef.TrackingNumberingUnit> cdefList) {
        doSetTrackingNumberingUnit_InScope(cTStrL(cdefList));
    }

    protected void doSetTrackingNumberingUnit_InScope(Collection<String> trackingNumberingUnitList) {
        regINS(CK_INS, cTL(trackingNumberingUnitList), xgetCValueTrackingNumberingUnit(), "TRACKING_NUMBERING_UNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     * @param trackingNumberingUnitList The collection of trackingNumberingUnit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_NotInScope(Collection<String> trackingNumberingUnitList) {
        doSetTrackingNumberingUnit_NotInScope(trackingNumberingUnitList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As TrackingNumberingUnit. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit} <br>
     * 追跡番号採番単位
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingNumberingUnit_NotInScope_AsTrackingNumberingUnit(Collection<CDef.TrackingNumberingUnit> cdefList) {
        doSetTrackingNumberingUnit_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTrackingNumberingUnit_NotInScope(Collection<String> trackingNumberingUnitList) {
        regINS(CK_NINS, cTL(trackingNumberingUnitList), xgetCValueTrackingNumberingUnit(), "TRACKING_NUMBERING_UNIT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     */
    public void setTrackingNumberingUnit_IsNull() { regTrackingNumberingUnit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     */
    public void setTrackingNumberingUnit_IsNullOrEmpty() { regTrackingNumberingUnit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_NUMBERING_UNIT: {varchar(30), FK to B_CLASS_DTL, classification=TrackingNumberingUnit}
     */
    public void setTrackingNumberingUnit_IsNotNull() { regTrackingNumberingUnit(CK_ISNN, DOBJ); }

    protected void regTrackingNumberingUnit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingNumberingUnit(), "TRACKING_NUMBERING_UNIT"); }
    protected abstract ConditionValue xgetCValueTrackingNumberingUnit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @param tagType The value of tagType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_Equal(String tagType) {
        doSetTagType_Equal(fRES(tagType));
    }

    /**
     * Equal(=). As CenterTagType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagType_Equal_AsCenterTagType(CDef.CenterTagType cdef) {
        doSetTagType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 汎用荷札
     */
    public void setTagType_Equal_$1() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagType_Equal_$2() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagType_Equal_$3() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagType_Equal_$4() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパック荷札
     */
    public void setTagType_Equal_$5() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ゆうパケット荷札
     */
    public void setTagType_Equal_$6() {
        setTagType_Equal_AsCenterTagType(CDef.CenterTagType.$6);
    }

    protected void doSetTagType_Equal(String tagType) {
        regTagType(CK_EQ, tagType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @param tagType The value of tagType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotEqual(String tagType) {
        doSetTagType_NotEqual(fRES(tagType));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTagType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType cdef) {
        doSetTagType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 汎用荷札
     */
    public void setTagType_NotEqual_$1() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagType_NotEqual_$2() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagType_NotEqual_$3() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagType_NotEqual_$4() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパック荷札
     */
    public void setTagType_NotEqual_$5() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ゆうパケット荷札
     */
    public void setTagType_NotEqual_$6() {
        setTagType_NotEqual_AsCenterTagType(CDef.CenterTagType.$6);
    }

    protected void doSetTagType_NotEqual(String tagType) {
        regTagType(CK_NES, tagType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @param tagTypeList The collection of tagType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_InScope(Collection<String> tagTypeList) {
        doSetTagType_InScope(tagTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTagType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_InScope_AsCenterTagType(Collection<CDef.CenterTagType> cdefList) {
        doSetTagType_InScope(cTStrL(cdefList));
    }

    protected void doSetTagType_InScope(Collection<String> tagTypeList) {
        regINS(CK_INS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     * @param tagTypeList The collection of tagType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotInScope(Collection<String> tagTypeList) {
        doSetTagType_NotInScope(tagTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTagType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType} <br>
     * 送り状種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotInScope_AsCenterTagType(Collection<CDef.CenterTagType> cdefList) {
        doSetTagType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTagType_NotInScope(Collection<String> tagTypeList) {
        regINS(CK_NINS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     */
    public void setTagType_IsNull() { regTagType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     */
    public void setTagType_IsNullOrEmpty() { regTagType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagType}
     */
    public void setTagType_IsNotNull() { regTagType(CK_ISNN, DOBJ); }

    protected void regTagType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagType(), "TAG_TYPE"); }
    protected abstract ConditionValue xgetCValueTagType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @param tagTypeAfter The value of tagTypeAfter as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_Equal(String tagTypeAfter) {
        doSetTagTypeAfter_Equal(fRES(tagTypeAfter));
    }

    /**
     * Equal(=). As CenterTagTypeAfter. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter cdef) {
        doSetTagTypeAfter_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 汎用荷札
     */
    public void setTagTypeAfter_Equal_$1() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagTypeAfter_Equal_$2() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagTypeAfter_Equal_$3() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagTypeAfter_Equal_$4() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパック荷札
     */
    public void setTagTypeAfter_Equal_$5() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ゆうパケット荷札
     */
    public void setTagTypeAfter_Equal_$6() {
        setTagTypeAfter_Equal_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$6);
    }

    protected void doSetTagTypeAfter_Equal(String tagTypeAfter) {
        regTagTypeAfter(CK_EQ, tagTypeAfter);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @param tagTypeAfter The value of tagTypeAfter as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_NotEqual(String tagTypeAfter) {
        doSetTagTypeAfter_NotEqual(fRES(tagTypeAfter));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTagTypeAfter. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter cdef) {
        doSetTagTypeAfter_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 汎用荷札
     */
    public void setTagTypeAfter_NotEqual_$1() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: ヤマト宅急便(発払)荷札
     */
    public void setTagTypeAfter_NotEqual_$2() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: ヤマト宅急便(コレクト)荷札
     */
    public void setTagTypeAfter_NotEqual_$3() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: 佐川荷札(WebAPI)
     */
    public void setTagTypeAfter_NotEqual_$4() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパック荷札
     */
    public void setTagTypeAfter_NotEqual_$5() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ゆうパケット荷札
     */
    public void setTagTypeAfter_NotEqual_$6() {
        setTagTypeAfter_NotEqual_AsCenterTagTypeAfter(CDef.CenterTagTypeAfter.$6);
    }

    protected void doSetTagTypeAfter_NotEqual(String tagTypeAfter) {
        regTagTypeAfter(CK_NES, tagTypeAfter);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @param tagTypeAfterList The collection of tagTypeAfter as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_InScope(Collection<String> tagTypeAfterList) {
        doSetTagTypeAfter_InScope(tagTypeAfterList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTagTypeAfter. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_InScope_AsCenterTagTypeAfter(Collection<CDef.CenterTagTypeAfter> cdefList) {
        doSetTagTypeAfter_InScope(cTStrL(cdefList));
    }

    protected void doSetTagTypeAfter_InScope(Collection<String> tagTypeAfterList) {
        regINS(CK_INS, cTL(tagTypeAfterList), xgetCValueTagTypeAfter(), "TAG_TYPE_AFTER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     * @param tagTypeAfterList The collection of tagTypeAfter as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_NotInScope(Collection<String> tagTypeAfterList) {
        doSetTagTypeAfter_NotInScope(tagTypeAfterList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTagTypeAfter. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter} <br>
     * 送り状種別(代引時、2枚目以降)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagTypeAfter_NotInScope_AsCenterTagTypeAfter(Collection<CDef.CenterTagTypeAfter> cdefList) {
        doSetTagTypeAfter_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTagTypeAfter_NotInScope(Collection<String> tagTypeAfterList) {
        regINS(CK_NINS, cTL(tagTypeAfterList), xgetCValueTagTypeAfter(), "TAG_TYPE_AFTER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     */
    public void setTagTypeAfter_IsNull() { regTagTypeAfter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     */
    public void setTagTypeAfter_IsNullOrEmpty() { regTagTypeAfter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_TYPE_AFTER: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagTypeAfter}
     */
    public void setTagTypeAfter_IsNotNull() { regTagTypeAfter(CK_ISNN, DOBJ); }

    protected void regTagTypeAfter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagTypeAfter(), "TAG_TYPE_AFTER"); }
    protected abstract ConditionValue xgetCValueTagTypeAfter();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @param tagDataType The value of tagDataType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_Equal(String tagDataType) {
        doSetTagDataType_Equal(fRES(tagDataType));
    }

    /**
     * Equal(=). As CenterTagDataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType cdef) {
        doSetTagDataType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: B2
     */
    public void setTagDataType_Equal_$1() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: E飛伝2
     */
    public void setTagDataType_Equal_$2() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: E飛伝Pro
     */
    public void setTagDataType_Equal_$3() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: ゆうパックプリントR(発送予定)
     */
    public void setTagDataType_Equal_$4() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパックプリントR(発送履歴)
     */
    public void setTagDataType_Equal_$5() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: 発送確定データフォーマット
     */
    public void setTagDataType_Equal_$6() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$6);
    }

    /**
     * Equal(=). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 大口FDデータフォーマット
     */
    public void setTagDataType_Equal_$7() {
        setTagDataType_Equal_AsCenterTagDataType(CDef.CenterTagDataType.$7);
    }

    protected void doSetTagDataType_Equal(String tagDataType) {
        regTagDataType(CK_EQ, tagDataType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @param tagDataType The value of tagDataType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_NotEqual(String tagDataType) {
        doSetTagDataType_NotEqual(fRES(tagDataType));
    }

    /**
     * NotEqual(&lt;&gt;). As CenterTagDataType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType cdef) {
        doSetTagDataType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: B2
     */
    public void setTagDataType_NotEqual_$1() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: E飛伝2
     */
    public void setTagDataType_NotEqual_$2() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: E飛伝Pro
     */
    public void setTagDataType_NotEqual_$3() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: ゆうパックプリントR(発送予定)
     */
    public void setTagDataType_NotEqual_$4() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: ゆうパックプリントR(発送履歴)
     */
    public void setTagDataType_NotEqual_$5() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: 発送確定データフォーマット
     */
    public void setTagDataType_NotEqual_$6() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$6);
    }

    /**
     * NotEqual(&lt;&gt;). As $7 (7). And OnlyOnceRegistered. <br>
     * $7: 大口FDデータフォーマット
     */
    public void setTagDataType_NotEqual_$7() {
        setTagDataType_NotEqual_AsCenterTagDataType(CDef.CenterTagDataType.$7);
    }

    protected void doSetTagDataType_NotEqual(String tagDataType) {
        regTagDataType(CK_NES, tagDataType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @param tagDataTypeList The collection of tagDataType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_InScope(Collection<String> tagDataTypeList) {
        doSetTagDataType_InScope(tagDataTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As CenterTagDataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_InScope_AsCenterTagDataType(Collection<CDef.CenterTagDataType> cdefList) {
        doSetTagDataType_InScope(cTStrL(cdefList));
    }

    protected void doSetTagDataType_InScope(Collection<String> tagDataTypeList) {
        regINS(CK_INS, cTL(tagDataTypeList), xgetCValueTagDataType(), "TAG_DATA_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     * @param tagDataTypeList The collection of tagDataType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_NotInScope(Collection<String> tagDataTypeList) {
        doSetTagDataType_NotInScope(tagDataTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CenterTagDataType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType} <br>
     * 送り状データ種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagDataType_NotInScope_AsCenterTagDataType(Collection<CDef.CenterTagDataType> cdefList) {
        doSetTagDataType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTagDataType_NotInScope(Collection<String> tagDataTypeList) {
        regINS(CK_NINS, cTL(tagDataTypeList), xgetCValueTagDataType(), "TAG_DATA_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     */
    public void setTagDataType_IsNull() { regTagDataType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     */
    public void setTagDataType_IsNullOrEmpty() { regTagDataType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAG_DATA_TYPE: {varchar(30), FK to M_CENTER_CLASS_DTL, classification=CenterTagDataType}
     */
    public void setTagDataType_IsNotNull() { regTagDataType(CK_ISNN, DOBJ); }

    protected void regTagDataType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagDataType(), "TAG_DATA_TYPE"); }
    protected abstract ConditionValue xgetCValueTagDataType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @param paymentTerm The value of paymentTerm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_Equal(String paymentTerm) {
        doSetPaymentTerm_Equal(fRES(paymentTerm));
    }

    /**
     * Equal(=). As PaymentTerm. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm cdef) {
        doSetPaymentTerm_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $3PL (3PL). And OnlyOnceRegistered. <br>
     * $3PL: 3rd Party
     */
    public void setPaymentTerm_Equal_$3PL() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$3PL);
    }

    /**
     * Equal(=). As $CO1 (CO1). And OnlyOnceRegistered. <br>
     * $CO1: COD Bill FRT
     */
    public void setPaymentTerm_Equal_$CO1() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$CO1);
    }

    /**
     * Equal(=). As $CO2 (CO2). And OnlyOnceRegistered. <br>
     * $CO2: COD NOT Bill FRT
     */
    public void setPaymentTerm_Equal_$CO2() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$CO2);
    }

    /**
     * Equal(=). As $COL (COL). And OnlyOnceRegistered. <br>
     * $COL: Collect
     */
    public void setPaymentTerm_Equal_$COL() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$COL);
    }

    /**
     * Equal(=). As $PPB (PPB). And OnlyOnceRegistered. <br>
     * $PPB: PrePaid &amp; Bill
     */
    public void setPaymentTerm_Equal_$PPB() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$PPB);
    }

    /**
     * Equal(=). As $PPD (PPD). And OnlyOnceRegistered. <br>
     * $PPD: PrePaid
     */
    public void setPaymentTerm_Equal_$PPD() {
        setPaymentTerm_Equal_AsPaymentTerm(CDef.PaymentTerm.$PPD);
    }

    protected void doSetPaymentTerm_Equal(String paymentTerm) {
        regPaymentTerm(CK_EQ, paymentTerm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @param paymentTerm The value of paymentTerm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_NotEqual(String paymentTerm) {
        doSetPaymentTerm_NotEqual(fRES(paymentTerm));
    }

    /**
     * NotEqual(&lt;&gt;). As PaymentTerm. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm cdef) {
        doSetPaymentTerm_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $3PL (3PL). And OnlyOnceRegistered. <br>
     * $3PL: 3rd Party
     */
    public void setPaymentTerm_NotEqual_$3PL() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$3PL);
    }

    /**
     * NotEqual(&lt;&gt;). As $CO1 (CO1). And OnlyOnceRegistered. <br>
     * $CO1: COD Bill FRT
     */
    public void setPaymentTerm_NotEqual_$CO1() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$CO1);
    }

    /**
     * NotEqual(&lt;&gt;). As $CO2 (CO2). And OnlyOnceRegistered. <br>
     * $CO2: COD NOT Bill FRT
     */
    public void setPaymentTerm_NotEqual_$CO2() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$CO2);
    }

    /**
     * NotEqual(&lt;&gt;). As $COL (COL). And OnlyOnceRegistered. <br>
     * $COL: Collect
     */
    public void setPaymentTerm_NotEqual_$COL() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$COL);
    }

    /**
     * NotEqual(&lt;&gt;). As $PPB (PPB). And OnlyOnceRegistered. <br>
     * $PPB: PrePaid &amp; Bill
     */
    public void setPaymentTerm_NotEqual_$PPB() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$PPB);
    }

    /**
     * NotEqual(&lt;&gt;). As $PPD (PPD). And OnlyOnceRegistered. <br>
     * $PPD: PrePaid
     */
    public void setPaymentTerm_NotEqual_$PPD() {
        setPaymentTerm_NotEqual_AsPaymentTerm(CDef.PaymentTerm.$PPD);
    }

    protected void doSetPaymentTerm_NotEqual(String paymentTerm) {
        regPaymentTerm(CK_NES, paymentTerm);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @param paymentTermList The collection of paymentTerm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_InScope(Collection<String> paymentTermList) {
        doSetPaymentTerm_InScope(paymentTermList);
    }

    /**
     * InScope {in ('a', 'b')}. As PaymentTerm. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_InScope_AsPaymentTerm(Collection<CDef.PaymentTerm> cdefList) {
        doSetPaymentTerm_InScope(cTStrL(cdefList));
    }

    protected void doSetPaymentTerm_InScope(Collection<String> paymentTermList) {
        regINS(CK_INS, cTL(paymentTermList), xgetCValuePaymentTerm(), "PAYMENT_TERM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     * @param paymentTermList The collection of paymentTerm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_NotInScope(Collection<String> paymentTermList) {
        doSetPaymentTerm_NotInScope(paymentTermList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PaymentTerm. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm} <br>
     * Payment Term
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTerm_NotInScope_AsPaymentTerm(Collection<CDef.PaymentTerm> cdefList) {
        doSetPaymentTerm_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPaymentTerm_NotInScope(Collection<String> paymentTermList) {
        regINS(CK_NINS, cTL(paymentTermList), xgetCValuePaymentTerm(), "PAYMENT_TERM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     */
    public void setPaymentTerm_IsNull() { regPaymentTerm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     */
    public void setPaymentTerm_IsNullOrEmpty() { regPaymentTerm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM: {varchar(30), FK to B_CLASS_DTL, classification=PaymentTerm}
     */
    public void setPaymentTerm_IsNotNull() { regPaymentTerm(CK_ISNN, DOBJ); }

    protected void regPaymentTerm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentTerm(), "PAYMENT_TERM"); }
    protected abstract ConditionValue xgetCValuePaymentTerm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, char(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MDeliveryCourseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MDeliveryCourseCB.class);
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
    public HpSLCFunction<MDeliveryCourseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MDeliveryCourseCB.class);
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
    public HpSLCFunction<MDeliveryCourseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MDeliveryCourseCB.class);
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
    public HpSLCFunction<MDeliveryCourseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MDeliveryCourseCB.class);
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
    public HpSLCFunction<MDeliveryCourseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MDeliveryCourseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MDeliveryCourseCB&gt;() {
     *     public void query(MDeliveryCourseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MDeliveryCourseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MDeliveryCourseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MDeliveryCourseCQ sq);

    protected MDeliveryCourseCB xcreateScalarConditionCB() {
        MDeliveryCourseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MDeliveryCourseCB xcreateScalarConditionPartitionByCB() {
        MDeliveryCourseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MDeliveryCourseCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DELIVERY_COURSE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MDeliveryCourseCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MDeliveryCourseCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MDeliveryCourseCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DELIVERY_COURSE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MDeliveryCourseCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MDeliveryCourseCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDeliveryCourseCB cb = new MDeliveryCourseCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MDeliveryCourseCQ sq);

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
    protected MDeliveryCourseCB newMyCB() {
        return new MDeliveryCourseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MDeliveryCourseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
