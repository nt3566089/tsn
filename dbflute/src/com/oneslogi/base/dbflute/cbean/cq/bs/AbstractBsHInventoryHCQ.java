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
 * The abstract condition-query of H_INVENTORY_H.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsHInventoryHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsHInventoryHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "H_INVENTORY_H";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_Equal(Long inventoryHId) {
        doSetInventoryHId_Equal(inventoryHId);
    }

    protected void doSetInventoryHId_Equal(Long inventoryHId) {
        regInventoryHId(CK_EQ, inventoryHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_NotEqual(Long inventoryHId) {
        doSetInventoryHId_NotEqual(inventoryHId);
    }

    protected void doSetInventoryHId_NotEqual(Long inventoryHId) {
        regInventoryHId(CK_NES, inventoryHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterThan(Long inventoryHId) {
        regInventoryHId(CK_GT, inventoryHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessThan(Long inventoryHId) {
        regInventoryHId(CK_LT, inventoryHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterEqual(Long inventoryHId) {
        regInventoryHId(CK_GE, inventoryHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHId The value of inventoryHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessEqual(Long inventoryHId) {
        regInventoryHId(CK_LE, inventoryHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryHId(), "INVENTORY_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHIdList The collection of inventoryHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_InScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        regINS(CK_INS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param inventoryHIdList The collection of inventoryHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_NotInScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        regINS(CK_NINS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_H_ID from H_INVENTORY_B where ...)} <br>
     * H_INVENTORY_B by INVENTORY_H_ID, named 'HInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsHInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of HInventoryBList for 'exists'. (NotNull)
     */
    public void existsHInventoryBList(SubQuery<HInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_ExistsReferrer_HInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "hInventoryBList");
    }
    public abstract String keepInventoryHId_ExistsReferrer_HInventoryBList(HInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_H_ID from H_INVENTORY_B where ...)} <br>
     * H_INVENTORY_B by INVENTORY_H_ID, named 'HInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsHInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of InventoryHId_NotExistsReferrer_HInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsHInventoryBList(SubQuery<HInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_NotExistsReferrer_HInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "hInventoryBList");
    }
    public abstract String keepInventoryHId_NotExistsReferrer_HInventoryBList(HInventoryBCQ sq);

    public void xsderiveHInventoryBList(String fn, SubQuery<HInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepInventoryHId_SpecifyDerivedReferrer_HInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "hInventoryBList", al, op);
    }
    public abstract String keepInventoryHId_SpecifyDerivedReferrer_HInventoryBList(HInventoryBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from H_INVENTORY_B where ...)} <br>
     * H_INVENTORY_B by INVENTORY_H_ID, named 'HInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedHInventoryBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<HInventoryBCB> derivedHInventoryBList() {
        return xcreateQDRFunctionHInventoryBList();
    }
    protected HpQDRFunction<HInventoryBCB> xcreateQDRFunctionHInventoryBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveHInventoryBList(fn, sq, rd, vl, op));
    }
    public void xqderiveHInventoryBList(String fn, SubQuery<HInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HInventoryBCB cb = new HInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepInventoryHId_QueryDerivedReferrer_HInventoryBList(cb.query()); String prpp = keepInventoryHId_QueryDerivedReferrer_HInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", sqpp, "hInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepInventoryHId_QueryDerivedReferrer_HInventoryBList(HInventoryBCQ sq);
    public abstract String keepInventoryHId_QueryDerivedReferrer_HInventoryBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryHId_IsNull() { regInventoryHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setInventoryHId_IsNotNull() { regInventoryHId(CK_ISNN, DOBJ); }

    protected void regInventoryHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryHId(), "INVENTORY_H_ID"); }
    protected abstract ConditionValue xgetCValueInventoryHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
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
     * HIST_DT: {varchar(8)}
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
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterThan(String histDt) {
        regHistDt(CK_GT, fRES(histDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessThan(String histDt) {
        regHistDt(CK_LT, fRES(histDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_GreaterEqual(String histDt) {
        regHistDt(CK_GE, fRES(histDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_LessEqual(String histDt) {
        regHistDt(CK_LE, fRES(histDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HIST_DT: {varchar(8)}
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
     * HIST_DT: {varchar(8)}
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
     * HIST_DT: {varchar(8)} <br>
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
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHistDt_NotLikeSearch(String histDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(histDt), xgetCValueHistDt(), "HIST_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HIST_DT: {varchar(8)}
     * @param histDt The value of histDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHistDt_PrefixSearch(String histDt) {
        setHistDt_LikeSearch(histDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     */
    public void setHistDt_IsNull() { regHistDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     */
    public void setHistDt_IsNullOrEmpty() { regHistDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HIST_DT: {varchar(8)}
     */
    public void setHistDt_IsNotNull() { regHistDt(CK_ISNN, DOBJ); }

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_Equal(String inventoryDt) {
        doSetInventoryDt_Equal(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_Equal(String inventoryDt) {
        regInventoryDt(CK_EQ, inventoryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotEqual(String inventoryDt) {
        doSetInventoryDt_NotEqual(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_NotEqual(String inventoryDt) {
        regInventoryDt(CK_NES, inventoryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterThan(String inventoryDt) {
        regInventoryDt(CK_GT, fRES(inventoryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessThan(String inventoryDt) {
        regInventoryDt(CK_LT, fRES(inventoryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterEqual(String inventoryDt) {
        regInventoryDt(CK_GE, fRES(inventoryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessEqual(String inventoryDt) {
        regInventoryDt(CK_LE, fRES(inventoryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDtList The collection of inventoryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_InScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_InScope(inventoryDtList);
    }

    protected void doSetInventoryDt_InScope(Collection<String> inventoryDtList) {
        regINS(CK_INS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDtList The collection of inventoryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_NotInScope(inventoryDtList);
    }

    protected void doSetInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        regINS(CK_NINS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)} <br>
     * <pre>e.g. setInventoryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDt The value of inventoryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDt_LikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDt_NotLikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {IX, NotNull, varchar(8)}
     * @param inventoryDt The value of inventoryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_PrefixSearch(String inventoryDt) {
        setInventoryDt_LikeSearch(inventoryDt, xcLSOPPre());
    }

    protected void regInventoryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDt(), "INVENTORY_DT"); }
    protected abstract ConditionValue xgetCValueInventoryDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_Equal(Long batchNum) {
        doSetBatchNum_Equal(batchNum);
    }

    protected void doSetBatchNum_Equal(Long batchNum) {
        regBatchNum(CK_EQ, batchNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_NotEqual(Long batchNum) {
        doSetBatchNum_NotEqual(batchNum);
    }

    protected void doSetBatchNum_NotEqual(Long batchNum) {
        regBatchNum(CK_NES, batchNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_GreaterThan(Long batchNum) {
        regBatchNum(CK_GT, batchNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_LessThan(Long batchNum) {
        regBatchNum(CK_LT, batchNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_GreaterEqual(Long batchNum) {
        regBatchNum(CK_GE, batchNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNum The value of batchNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_LessEqual(Long batchNum) {
        regBatchNum(CK_LE, batchNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param minNumber The min number of batchNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of batchNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBatchNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBatchNum(), "BATCH_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNumList The collection of batchNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchNum_InScope(Collection<Long> batchNumList) {
        doSetBatchNum_InScope(batchNumList);
    }

    protected void doSetBatchNum_InScope(Collection<Long> batchNumList) {
        regINS(CK_INS, cTL(batchNumList), xgetCValueBatchNum(), "BATCH_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATCH_NUM: {NotNull, bigint(19)}
     * @param batchNumList The collection of batchNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchNum_NotInScope(Collection<Long> batchNumList) {
        doSetBatchNum_NotInScope(batchNumList);
    }

    protected void doSetBatchNum_NotInScope(Collection<Long> batchNumList) {
        regINS(CK_NINS, cTL(batchNumList), xgetCValueBatchNum(), "BATCH_NUM");
    }

    protected void regBatchNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatchNum(), "BATCH_NUM"); }
    protected abstract ConditionValue xgetCValueBatchNum();

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
    public HpSLCFunction<HInventoryHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, HInventoryHCB.class);
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
    public HpSLCFunction<HInventoryHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, HInventoryHCB.class);
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
    public HpSLCFunction<HInventoryHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, HInventoryHCB.class);
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
    public HpSLCFunction<HInventoryHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, HInventoryHCB.class);
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
    public HpSLCFunction<HInventoryHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, HInventoryHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;HInventoryHCB&gt;() {
     *     public void query(HInventoryHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<HInventoryHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, HInventoryHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        HInventoryHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(HInventoryHCQ sq);

    protected HInventoryHCB xcreateScalarConditionCB() {
        HInventoryHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected HInventoryHCB xcreateScalarConditionPartitionByCB() {
        HInventoryHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<HInventoryHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HInventoryHCB cb = new HInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(HInventoryHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<HInventoryHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(HInventoryHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        HInventoryHCB cb = new HInventoryHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(HInventoryHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<HInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        HInventoryHCB cb = new HInventoryHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(HInventoryHCQ sq);

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
    protected HInventoryHCB newMyCB() {
        return new HInventoryHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return HInventoryHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
