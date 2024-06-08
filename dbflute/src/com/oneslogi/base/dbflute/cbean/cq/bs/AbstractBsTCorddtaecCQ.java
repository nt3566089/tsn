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
 * The abstract condition-query of T_CORDDTAEC.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCorddtaecCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCorddtaecCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CORDDTAEC";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_Equal(Long orderChangeId) {
        doSetOrderChangeId_Equal(orderChangeId);
    }

    protected void doSetOrderChangeId_Equal(Long orderChangeId) {
        regOrderChangeId(CK_EQ, orderChangeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_NotEqual(Long orderChangeId) {
        doSetOrderChangeId_NotEqual(orderChangeId);
    }

    protected void doSetOrderChangeId_NotEqual(Long orderChangeId) {
        regOrderChangeId(CK_NES, orderChangeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_GreaterThan(Long orderChangeId) {
        regOrderChangeId(CK_GT, orderChangeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_LessThan(Long orderChangeId) {
        regOrderChangeId(CK_LT, orderChangeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_GreaterEqual(Long orderChangeId) {
        regOrderChangeId(CK_GE, orderChangeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeId The value of orderChangeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderChangeId_LessEqual(Long orderChangeId) {
        regOrderChangeId(CK_LE, orderChangeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of orderChangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderChangeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderChangeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderChangeId(), "ORDER_CHANGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeIdList The collection of orderChangeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderChangeId_InScope(Collection<Long> orderChangeIdList) {
        doSetOrderChangeId_InScope(orderChangeIdList);
    }

    protected void doSetOrderChangeId_InScope(Collection<Long> orderChangeIdList) {
        regINS(CK_INS, cTL(orderChangeIdList), xgetCValueOrderChangeId(), "ORDER_CHANGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param orderChangeIdList The collection of orderChangeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderChangeId_NotInScope(Collection<Long> orderChangeIdList) {
        doSetOrderChangeId_NotInScope(orderChangeIdList);
    }

    protected void doSetOrderChangeId_NotInScope(Collection<Long> orderChangeIdList) {
        regINS(CK_NINS, cTL(orderChangeIdList), xgetCValueOrderChangeId(), "ORDER_CHANGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderChangeId_IsNull() { regOrderChangeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_CHANGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setOrderChangeId_IsNotNull() { regOrderChangeId(CK_ISNN, DOBJ); }

    protected void regOrderChangeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderChangeId(), "ORDER_CHANGE_ID"); }
    protected abstract ConditionValue xgetCValueOrderChangeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_Equal(Long orderHId) {
        doSetOrderHId_Equal(orderHId);
    }

    protected void doSetOrderHId_Equal(Long orderHId) {
        regOrderHId(CK_EQ, orderHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_NotEqual(Long orderHId) {
        doSetOrderHId_NotEqual(orderHId);
    }

    protected void doSetOrderHId_NotEqual(Long orderHId) {
        regOrderHId(CK_NES, orderHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_GreaterThan(Long orderHId) {
        regOrderHId(CK_GT, orderHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_LessThan(Long orderHId) {
        regOrderHId(CK_LT, orderHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_GreaterEqual(Long orderHId) {
        regOrderHId(CK_GE, orderHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHId The value of orderHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOrderHId_LessEqual(Long orderHId) {
        regOrderHId(CK_LE, orderHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param minNumber The min number of orderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of orderHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOrderHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOrderHId(), "ORDER_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHIdList The collection of orderHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderHId_InScope(Collection<Long> orderHIdList) {
        doSetOrderHId_InScope(orderHIdList);
    }

    protected void doSetOrderHId_InScope(Collection<Long> orderHIdList) {
        regINS(CK_INS, cTL(orderHIdList), xgetCValueOrderHId(), "ORDER_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ORDER_H_ID: {NotNull, bigint(19), FK to T_CORDHDR}
     * @param orderHIdList The collection of orderHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderHId_NotInScope(Collection<Long> orderHIdList) {
        doSetOrderHId_NotInScope(orderHIdList);
    }

    protected void doSetOrderHId_NotInScope(Collection<Long> orderHIdList) {
        regINS(CK_NINS, cTL(orderHIdList), xgetCValueOrderHId(), "ORDER_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select ORDER_H_ID from T_CORDHDR where ...)} <br />
     * T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'.
     * @param subCBLambda The callback for sub-query of TCordhdr for 'in-scope'. (NotNull)
     */
    public void inScopeTCordhdr(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepOrderHId_InScopeRelation_TCordhdr(cb.query());
        registerInScopeRelation(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCordhdr", false);
    }
    public abstract String keepOrderHId_InScopeRelation_TCordhdr(TCordhdrCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select ORDER_H_ID from T_CORDHDR where ...)} <br />
     * T_CORDHDR by my ORDER_H_ID, named 'TCordhdr'.
     * @param subCBLambda The callback for sub-query of TCordhdr for 'not in-scope'. (NotNull)
     */
    public void notInScopeTCordhdr(SubQuery<TCordhdrCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCordhdrCB cb = new TCordhdrCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepOrderHId_NotInScopeRelation_TCordhdr(cb.query());
        registerInScopeRelation(cb.query(), "ORDER_H_ID", "ORDER_H_ID", pp, "tCordhdr", true);
    }
    public abstract String keepOrderHId_NotInScopeRelation_TCordhdr(TCordhdrCQ sq);

    protected void regOrderHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderHId(), "ORDER_H_ID"); }
    protected abstract ConditionValue xgetCValueOrderHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_Equal(String srwhcd) {
        doSetSrwhcd_Equal(fRES(srwhcd));
    }

    protected void doSetSrwhcd_Equal(String srwhcd) {
        regSrwhcd(CK_EQ, srwhcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_NotEqual(String srwhcd) {
        doSetSrwhcd_NotEqual(fRES(srwhcd));
    }

    protected void doSetSrwhcd_NotEqual(String srwhcd) {
        regSrwhcd(CK_NES, srwhcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_GreaterThan(String srwhcd) {
        regSrwhcd(CK_GT, fRES(srwhcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_LessThan(String srwhcd) {
        regSrwhcd(CK_LT, fRES(srwhcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_GreaterEqual(String srwhcd) {
        regSrwhcd(CK_GE, fRES(srwhcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_LessEqual(String srwhcd) {
        regSrwhcd(CK_LE, fRES(srwhcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcdList The collection of srwhcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_InScope(Collection<String> srwhcdList) {
        doSetSrwhcd_InScope(srwhcdList);
    }

    protected void doSetSrwhcd_InScope(Collection<String> srwhcdList) {
        regINS(CK_INS, cTL(srwhcdList), xgetCValueSrwhcd(), "SRWHCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcdList The collection of srwhcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_NotInScope(Collection<String> srwhcdList) {
        doSetSrwhcd_NotInScope(srwhcdList);
    }

    protected void doSetSrwhcd_NotInScope(Collection<String> srwhcdList) {
        regINS(CK_NINS, cTL(srwhcdList), xgetCValueSrwhcd(), "SRWHCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSrwhcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srwhcd The value of srwhcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrwhcd_LikeSearch(String srwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srwhcd), xgetCValueSrwhcd(), "SRWHCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrwhcd_NotLikeSearch(String srwhcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srwhcd), xgetCValueSrwhcd(), "SRWHCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRWHCD: {NotNull, varchar(30)}
     * @param srwhcd The value of srwhcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrwhcd_PrefixSearch(String srwhcd) {
        setSrwhcd_LikeSearch(srwhcd, xcLSOPPre());
    }

    protected void regSrwhcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrwhcd(), "SRWHCD"); }
    protected abstract ConditionValue xgetCValueSrwhcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {NotNull, varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_Equal(String zzordymd) {
        doSetZzordymd_Equal(fRES(zzordymd));
    }

    protected void doSetZzordymd_Equal(String zzordymd) {
        regZzordymd(CK_EQ, zzordymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotEqual(String zzordymd) {
        doSetZzordymd_NotEqual(fRES(zzordymd));
    }

    protected void doSetZzordymd_NotEqual(String zzordymd) {
        regZzordymd(CK_NES, zzordymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterThan(String zzordymd) {
        regZzordymd(CK_GT, fRES(zzordymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessThan(String zzordymd) {
        regZzordymd(CK_LT, fRES(zzordymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_GreaterEqual(String zzordymd) {
        regZzordymd(CK_GE, fRES(zzordymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_LessEqual(String zzordymd) {
        regZzordymd(CK_LE, fRES(zzordymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymdList The collection of zzordymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_InScope(Collection<String> zzordymdList) {
        doSetZzordymd_InScope(zzordymdList);
    }

    protected void doSetZzordymd_InScope(Collection<String> zzordymdList) {
        regINS(CK_INS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymdList The collection of zzordymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_NotInScope(Collection<String> zzordymdList) {
        doSetZzordymd_NotInScope(zzordymdList);
    }

    protected void doSetZzordymd_NotInScope(Collection<String> zzordymdList) {
        regINS(CK_NINS, cTL(zzordymdList), xgetCValueZzordymd(), "ZZORDYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setZzordymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzordymd The value of zzordymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzordymd_LikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzordymd_NotLikeSearch(String zzordymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzordymd), xgetCValueZzordymd(), "ZZORDYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORDYMD: {NotNull, varchar(8)}
     * @param zzordymd The value of zzordymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzordymd_PrefixSearch(String zzordymd) {
        setZzordymd_LikeSearch(zzordymd, xcLSOPPre());
    }

    protected void regZzordymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzordymd(), "ZZORDYMD"); }
    protected abstract ConditionValue xgetCValueZzordymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_Equal(String ordgr) {
        doSetOrdgr_Equal(fRES(ordgr));
    }

    protected void doSetOrdgr_Equal(String ordgr) {
        regOrdgr(CK_EQ, ordgr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotEqual(String ordgr) {
        doSetOrdgr_NotEqual(fRES(ordgr));
    }

    protected void doSetOrdgr_NotEqual(String ordgr) {
        regOrdgr(CK_NES, ordgr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterThan(String ordgr) {
        regOrdgr(CK_GT, fRES(ordgr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessThan(String ordgr) {
        regOrdgr(CK_LT, fRES(ordgr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_GreaterEqual(String ordgr) {
        regOrdgr(CK_GE, fRES(ordgr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_LessEqual(String ordgr) {
        regOrdgr(CK_LE, fRES(ordgr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgrList The collection of ordgr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_InScope(Collection<String> ordgrList) {
        doSetOrdgr_InScope(ordgrList);
    }

    protected void doSetOrdgr_InScope(Collection<String> ordgrList) {
        regINS(CK_INS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgrList The collection of ordgr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_NotInScope(Collection<String> ordgrList) {
        doSetOrdgr_NotInScope(ordgrList);
    }

    protected void doSetOrdgr_NotInScope(Collection<String> ordgrList) {
        regINS(CK_NINS, cTL(ordgrList), xgetCValueOrdgr(), "ORDGR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOrdgr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordgr The value of ordgr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdgr_LikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdgr_NotLikeSearch(String ordgr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordgr), xgetCValueOrdgr(), "ORDGR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDGR: {NotNull, varchar(30)}
     * @param ordgr The value of ordgr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdgr_PrefixSearch(String ordgr) {
        setOrdgr_LikeSearch(ordgr, xcLSOPPre());
    }

    protected void regOrdgr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdgr(), "ORDGR"); }
    protected abstract ConditionValue xgetCValueOrdgr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_Equal(String dlvymd) {
        doSetDlvymd_Equal(fRES(dlvymd));
    }

    protected void doSetDlvymd_Equal(String dlvymd) {
        regDlvymd(CK_EQ, dlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotEqual(String dlvymd) {
        doSetDlvymd_NotEqual(fRES(dlvymd));
    }

    protected void doSetDlvymd_NotEqual(String dlvymd) {
        regDlvymd(CK_NES, dlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_InScope(Collection<String> dlvymdList) {
        doSetDlvymd_InScope(dlvymdList);
    }

    protected void doSetDlvymd_InScope(Collection<String> dlvymdList) {
        regINS(CK_INS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymdList The collection of dlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotInScope(Collection<String> dlvymdList) {
        doSetDlvymd_NotInScope(dlvymdList);
    }

    protected void doSetDlvymd_NotInScope(Collection<String> dlvymdList) {
        regINS(CK_NINS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setDlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvymd The value of dlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvymd_LikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {NotNull, varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {NotNull, varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {NotNull, varchar(30)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_Equal(String scddlvymd) {
        doSetScddlvymd_Equal(fRES(scddlvymd));
    }

    protected void doSetScddlvymd_Equal(String scddlvymd) {
        regScddlvymd(CK_EQ, scddlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_NotEqual(String scddlvymd) {
        doSetScddlvymd_NotEqual(fRES(scddlvymd));
    }

    protected void doSetScddlvymd_NotEqual(String scddlvymd) {
        regScddlvymd(CK_NES, scddlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_GreaterThan(String scddlvymd) {
        regScddlvymd(CK_GT, fRES(scddlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_LessThan(String scddlvymd) {
        regScddlvymd(CK_LT, fRES(scddlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_GreaterEqual(String scddlvymd) {
        regScddlvymd(CK_GE, fRES(scddlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_LessEqual(String scddlvymd) {
        regScddlvymd(CK_LE, fRES(scddlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymdList The collection of scddlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_InScope(Collection<String> scddlvymdList) {
        doSetScddlvymd_InScope(scddlvymdList);
    }

    protected void doSetScddlvymd_InScope(Collection<String> scddlvymdList) {
        regINS(CK_INS, cTL(scddlvymdList), xgetCValueScddlvymd(), "SCDDLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymdList The collection of scddlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_NotInScope(Collection<String> scddlvymdList) {
        doSetScddlvymd_NotInScope(scddlvymdList);
    }

    protected void doSetScddlvymd_NotInScope(Collection<String> scddlvymdList) {
        regINS(CK_NINS, cTL(scddlvymdList), xgetCValueScddlvymd(), "SCDDLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {varchar(8)} <br>
     * <pre>e.g. setScddlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scddlvymd The value of scddlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScddlvymd_LikeSearch(String scddlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scddlvymd), xgetCValueScddlvymd(), "SCDDLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScddlvymd_NotLikeSearch(String scddlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scddlvymd), xgetCValueScddlvymd(), "SCDDLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     * @param scddlvymd The value of scddlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScddlvymd_PrefixSearch(String scddlvymd) {
        setScddlvymd_LikeSearch(scddlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     */
    public void setScddlvymd_IsNull() { regScddlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     */
    public void setScddlvymd_IsNullOrEmpty() { regScddlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCDDLVYMD: {varchar(8)}
     */
    public void setScddlvymd_IsNotNull() { regScddlvymd(CK_ISNN, DOBJ); }

    protected void regScddlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScddlvymd(), "SCDDLVYMD"); }
    protected abstract ConditionValue xgetCValueScddlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_Equal(String scdded) {
        doSetScdded_Equal(fRES(scdded));
    }

    protected void doSetScdded_Equal(String scdded) {
        regScdded(CK_EQ, scdded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_NotEqual(String scdded) {
        doSetScdded_NotEqual(fRES(scdded));
    }

    protected void doSetScdded_NotEqual(String scdded) {
        regScdded(CK_NES, scdded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_GreaterThan(String scdded) {
        regScdded(CK_GT, fRES(scdded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_LessThan(String scdded) {
        regScdded(CK_LT, fRES(scdded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_GreaterEqual(String scdded) {
        regScdded(CK_GE, fRES(scdded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_LessEqual(String scdded) {
        regScdded(CK_LE, fRES(scdded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scddedList The collection of scdded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_InScope(Collection<String> scddedList) {
        doSetScdded_InScope(scddedList);
    }

    protected void doSetScdded_InScope(Collection<String> scddedList) {
        regINS(CK_INS, cTL(scddedList), xgetCValueScdded(), "SCDDED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scddedList The collection of scdded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_NotInScope(Collection<String> scddedList) {
        doSetScdded_NotInScope(scddedList);
    }

    protected void doSetScdded_NotInScope(Collection<String> scddedList) {
        regINS(CK_NINS, cTL(scddedList), xgetCValueScdded(), "SCDDED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)} <br>
     * <pre>e.g. setScdded_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scdded The value of scdded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScdded_LikeSearch(String scdded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scdded), xgetCValueScdded(), "SCDDED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScdded_NotLikeSearch(String scdded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scdded), xgetCValueScdded(), "SCDDED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDDED: {NotNull, varchar(30)}
     * @param scdded The value of scdded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdded_PrefixSearch(String scdded) {
        setScdded_LikeSearch(scdded, xcLSOPPre());
    }

    protected void regScdded(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScdded(), "SCDDED"); }
    protected abstract ConditionValue xgetCValueScdded();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_Equal(String scdpstnid) {
        doSetScdpstnid_Equal(fRES(scdpstnid));
    }

    protected void doSetScdpstnid_Equal(String scdpstnid) {
        regScdpstnid(CK_EQ, scdpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_NotEqual(String scdpstnid) {
        doSetScdpstnid_NotEqual(fRES(scdpstnid));
    }

    protected void doSetScdpstnid_NotEqual(String scdpstnid) {
        regScdpstnid(CK_NES, scdpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_GreaterThan(String scdpstnid) {
        regScdpstnid(CK_GT, fRES(scdpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_LessThan(String scdpstnid) {
        regScdpstnid(CK_LT, fRES(scdpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_GreaterEqual(String scdpstnid) {
        regScdpstnid(CK_GE, fRES(scdpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_LessEqual(String scdpstnid) {
        regScdpstnid(CK_LE, fRES(scdpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnidList The collection of scdpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_InScope(Collection<String> scdpstnidList) {
        doSetScdpstnid_InScope(scdpstnidList);
    }

    protected void doSetScdpstnid_InScope(Collection<String> scdpstnidList) {
        regINS(CK_INS, cTL(scdpstnidList), xgetCValueScdpstnid(), "SCDPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnidList The collection of scdpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_NotInScope(Collection<String> scdpstnidList) {
        doSetScdpstnid_NotInScope(scdpstnidList);
    }

    protected void doSetScdpstnid_NotInScope(Collection<String> scdpstnidList) {
        regINS(CK_NINS, cTL(scdpstnidList), xgetCValueScdpstnid(), "SCDPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {varchar(30)} <br>
     * <pre>e.g. setScdpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param scdpstnid The value of scdpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setScdpstnid_LikeSearch(String scdpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(scdpstnid), xgetCValueScdpstnid(), "SCDPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setScdpstnid_NotLikeSearch(String scdpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(scdpstnid), xgetCValueScdpstnid(), "SCDPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     * @param scdpstnid The value of scdpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setScdpstnid_PrefixSearch(String scdpstnid) {
        setScdpstnid_LikeSearch(scdpstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     */
    public void setScdpstnid_IsNull() { regScdpstnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     */
    public void setScdpstnid_IsNullOrEmpty() { regScdpstnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SCDPSTNID: {varchar(30)}
     */
    public void setScdpstnid_IsNotNull() { regScdpstnid(CK_ISNN, DOBJ); }

    protected void regScdpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueScdpstnid(), "SCDPSTNID"); }
    protected abstract ConditionValue xgetCValueScdpstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_Equal(String hpynid) {
        doSetHpynid_Equal(fRES(hpynid));
    }

    protected void doSetHpynid_Equal(String hpynid) {
        regHpynid(CK_EQ, hpynid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_NotEqual(String hpynid) {
        doSetHpynid_NotEqual(fRES(hpynid));
    }

    protected void doSetHpynid_NotEqual(String hpynid) {
        regHpynid(CK_NES, hpynid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_GreaterThan(String hpynid) {
        regHpynid(CK_GT, fRES(hpynid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_LessThan(String hpynid) {
        regHpynid(CK_LT, fRES(hpynid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_GreaterEqual(String hpynid) {
        regHpynid(CK_GE, fRES(hpynid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_LessEqual(String hpynid) {
        regHpynid(CK_LE, fRES(hpynid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynidList The collection of hpynid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_InScope(Collection<String> hpynidList) {
        doSetHpynid_InScope(hpynidList);
    }

    protected void doSetHpynid_InScope(Collection<String> hpynidList) {
        regINS(CK_INS, cTL(hpynidList), xgetCValueHpynid(), "HPYNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynidList The collection of hpynid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_NotInScope(Collection<String> hpynidList) {
        doSetHpynid_NotInScope(hpynidList);
    }

    protected void doSetHpynid_NotInScope(Collection<String> hpynidList) {
        regINS(CK_NINS, cTL(hpynidList), xgetCValueHpynid(), "HPYNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HPYNID: {char(1)} <br>
     * <pre>e.g. setHpynid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hpynid The value of hpynid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHpynid_LikeSearch(String hpynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hpynid), xgetCValueHpynid(), "HPYNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHpynid_NotLikeSearch(String hpynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hpynid), xgetCValueHpynid(), "HPYNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HPYNID: {char(1)}
     * @param hpynid The value of hpynid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHpynid_PrefixSearch(String hpynid) {
        setHpynid_LikeSearch(hpynid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     */
    public void setHpynid_IsNull() { regHpynid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HPYNID: {char(1)}
     */
    public void setHpynid_IsNotNull() { regHpynid(CK_ISNN, DOBJ); }

    protected void regHpynid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHpynid(), "HPYNID"); }
    protected abstract ConditionValue xgetCValueHpynid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_Equal(String ipynid) {
        doSetIpynid_Equal(fRES(ipynid));
    }

    protected void doSetIpynid_Equal(String ipynid) {
        regIpynid(CK_EQ, ipynid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_NotEqual(String ipynid) {
        doSetIpynid_NotEqual(fRES(ipynid));
    }

    protected void doSetIpynid_NotEqual(String ipynid) {
        regIpynid(CK_NES, ipynid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_GreaterThan(String ipynid) {
        regIpynid(CK_GT, fRES(ipynid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_LessThan(String ipynid) {
        regIpynid(CK_LT, fRES(ipynid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_GreaterEqual(String ipynid) {
        regIpynid(CK_GE, fRES(ipynid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_LessEqual(String ipynid) {
        regIpynid(CK_LE, fRES(ipynid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynidList The collection of ipynid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_InScope(Collection<String> ipynidList) {
        doSetIpynid_InScope(ipynidList);
    }

    protected void doSetIpynid_InScope(Collection<String> ipynidList) {
        regINS(CK_INS, cTL(ipynidList), xgetCValueIpynid(), "IPYNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynidList The collection of ipynid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_NotInScope(Collection<String> ipynidList) {
        doSetIpynid_NotInScope(ipynidList);
    }

    protected void doSetIpynid_NotInScope(Collection<String> ipynidList) {
        regINS(CK_NINS, cTL(ipynidList), xgetCValueIpynid(), "IPYNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IPYNID: {char(1)} <br>
     * <pre>e.g. setIpynid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ipynid The value of ipynid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIpynid_LikeSearch(String ipynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ipynid), xgetCValueIpynid(), "IPYNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIpynid_NotLikeSearch(String ipynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ipynid), xgetCValueIpynid(), "IPYNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IPYNID: {char(1)}
     * @param ipynid The value of ipynid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIpynid_PrefixSearch(String ipynid) {
        setIpynid_LikeSearch(ipynid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     */
    public void setIpynid_IsNull() { regIpynid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IPYNID: {char(1)}
     */
    public void setIpynid_IsNotNull() { regIpynid(CK_ISNN, DOBJ); }

    protected void regIpynid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIpynid(), "IPYNID"); }
    protected abstract ConditionValue xgetCValueIpynid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_Equal(String srded) {
        doSetSrded_Equal(fRES(srded));
    }

    protected void doSetSrded_Equal(String srded) {
        regSrded(CK_EQ, srded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_NotEqual(String srded) {
        doSetSrded_NotEqual(fRES(srded));
    }

    protected void doSetSrded_NotEqual(String srded) {
        regSrded(CK_NES, srded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_GreaterThan(String srded) {
        regSrded(CK_GT, fRES(srded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_LessThan(String srded) {
        regSrded(CK_LT, fRES(srded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_GreaterEqual(String srded) {
        regSrded(CK_GE, fRES(srded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_LessEqual(String srded) {
        regSrded(CK_LE, fRES(srded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srdedList The collection of srded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_InScope(Collection<String> srdedList) {
        doSetSrded_InScope(srdedList);
    }

    protected void doSetSrded_InScope(Collection<String> srdedList) {
        regINS(CK_INS, cTL(srdedList), xgetCValueSrded(), "SRDED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srdedList The collection of srded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_NotInScope(Collection<String> srdedList) {
        doSetSrded_NotInScope(srdedList);
    }

    protected void doSetSrded_NotInScope(Collection<String> srdedList) {
        regINS(CK_NINS, cTL(srdedList), xgetCValueSrded(), "SRDED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)} <br>
     * <pre>e.g. setSrded_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srded The value of srded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrded_LikeSearch(String srded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srded), xgetCValueSrded(), "SRDED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrded_NotLikeSearch(String srded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srded), xgetCValueSrded(), "SRDED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDED: {varchar(30)}
     * @param srded The value of srded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrded_PrefixSearch(String srded) {
        setSrded_LikeSearch(srded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNull() { regSrded(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNullOrEmpty() { regSrded(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDED: {varchar(30)}
     */
    public void setSrded_IsNotNull() { regSrded(CK_ISNN, DOBJ); }

    protected void regSrded(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrded(), "SRDED"); }
    protected abstract ConditionValue xgetCValueSrded();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_Equal(String srpstnid) {
        doSetSrpstnid_Equal(fRES(srpstnid));
    }

    protected void doSetSrpstnid_Equal(String srpstnid) {
        regSrpstnid(CK_EQ, srpstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_NotEqual(String srpstnid) {
        doSetSrpstnid_NotEqual(fRES(srpstnid));
    }

    protected void doSetSrpstnid_NotEqual(String srpstnid) {
        regSrpstnid(CK_NES, srpstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_GreaterThan(String srpstnid) {
        regSrpstnid(CK_GT, fRES(srpstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_LessThan(String srpstnid) {
        regSrpstnid(CK_LT, fRES(srpstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_GreaterEqual(String srpstnid) {
        regSrpstnid(CK_GE, fRES(srpstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_LessEqual(String srpstnid) {
        regSrpstnid(CK_LE, fRES(srpstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnidList The collection of srpstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_InScope(Collection<String> srpstnidList) {
        doSetSrpstnid_InScope(srpstnidList);
    }

    protected void doSetSrpstnid_InScope(Collection<String> srpstnidList) {
        regINS(CK_INS, cTL(srpstnidList), xgetCValueSrpstnid(), "SRPSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnidList The collection of srpstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_NotInScope(Collection<String> srpstnidList) {
        doSetSrpstnid_NotInScope(srpstnidList);
    }

    protected void doSetSrpstnid_NotInScope(Collection<String> srpstnidList) {
        regINS(CK_NINS, cTL(srpstnidList), xgetCValueSrpstnid(), "SRPSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {varchar(30)} <br>
     * <pre>e.g. setSrpstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srpstnid The value of srpstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrpstnid_LikeSearch(String srpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srpstnid), xgetCValueSrpstnid(), "SRPSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrpstnid_NotLikeSearch(String srpstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srpstnid), xgetCValueSrpstnid(), "SRPSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRPSTNID: {varchar(30)}
     * @param srpstnid The value of srpstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrpstnid_PrefixSearch(String srpstnid) {
        setSrpstnid_LikeSearch(srpstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     */
    public void setSrpstnid_IsNull() { regSrpstnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     */
    public void setSrpstnid_IsNullOrEmpty() { regSrpstnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRPSTNID: {varchar(30)}
     */
    public void setSrpstnid_IsNotNull() { regSrpstnid(CK_ISNN, DOBJ); }

    protected void regSrpstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrpstnid(), "SRPSTNID"); }
    protected abstract ConditionValue xgetCValueSrpstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_Equal(String srymd) {
        doSetSrymd_Equal(fRES(srymd));
    }

    protected void doSetSrymd_Equal(String srymd) {
        regSrymd(CK_EQ, srymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotEqual(String srymd) {
        doSetSrymd_NotEqual(fRES(srymd));
    }

    protected void doSetSrymd_NotEqual(String srymd) {
        regSrymd(CK_NES, srymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterThan(String srymd) {
        regSrymd(CK_GT, fRES(srymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessThan(String srymd) {
        regSrymd(CK_LT, fRES(srymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterEqual(String srymd) {
        regSrymd(CK_GE, fRES(srymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessEqual(String srymd) {
        regSrymd(CK_LE, fRES(srymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymdList The collection of srymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_InScope(Collection<String> srymdList) {
        doSetSrymd_InScope(srymdList);
    }

    protected void doSetSrymd_InScope(Collection<String> srymdList) {
        regINS(CK_INS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymdList The collection of srymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotInScope(Collection<String> srymdList) {
        doSetSrymd_NotInScope(srymdList);
    }

    protected void doSetSrymd_NotInScope(Collection<String> srymdList) {
        regINS(CK_NINS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSrymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srymd The value of srymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrymd_LikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrymd_NotLikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_PrefixSearch(String srymd) {
        setSrymd_LikeSearch(srymd, xcLSOPPre());
    }

    protected void regSrymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrymd(), "SRYMD"); }
    protected abstract ConditionValue xgetCValueSrymd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(Long sroprtcnt) {
        doSetSroprtcnt_Equal(sroprtcnt);
    }

    protected void doSetSroprtcnt_Equal(Long sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(Long sroprtcnt) {
        doSetSroprtcnt_NotEqual(sroprtcnt);
    }

    protected void doSetSroprtcnt_NotEqual(Long sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_Equal(String srlincd) {
        doSetSrlincd_Equal(fRES(srlincd));
    }

    protected void doSetSrlincd_Equal(String srlincd) {
        regSrlincd(CK_EQ, srlincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotEqual(String srlincd) {
        doSetSrlincd_NotEqual(fRES(srlincd));
    }

    protected void doSetSrlincd_NotEqual(String srlincd) {
        regSrlincd(CK_NES, srlincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterThan(String srlincd) {
        regSrlincd(CK_GT, fRES(srlincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessThan(String srlincd) {
        regSrlincd(CK_LT, fRES(srlincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterEqual(String srlincd) {
        regSrlincd(CK_GE, fRES(srlincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessEqual(String srlincd) {
        regSrlincd(CK_LE, fRES(srlincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_InScope(Collection<String> srlincdList) {
        doSetSrlincd_InScope(srlincdList);
    }

    protected void doSetSrlincd_InScope(Collection<String> srlincdList) {
        regINS(CK_INS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotInScope(Collection<String> srlincdList) {
        doSetSrlincd_NotInScope(srlincdList);
    }

    protected void doSetSrlincd_NotInScope(Collection<String> srlincdList) {
        regINS(CK_NINS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)} <br>
     * <pre>e.g. setSrlincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlincd The value of srlincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlincd_LikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlincd_NotLikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_PrefixSearch(String srlincd) {
        setSrlincd_LikeSearch(srlincd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNull() { regSrlincd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNullOrEmpty() { regSrlincd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNotNull() { regSrlincd(CK_ISNN, DOBJ); }

    protected void regSrlincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlincd(), "SRLINCD"); }
    protected abstract ConditionValue xgetCValueSrlincd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_Equal(Long srrnk) {
        doSetSrrnk_Equal(srrnk);
    }

    protected void doSetSrrnk_Equal(Long srrnk) {
        regSrrnk(CK_EQ, srrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_NotEqual(Long srrnk) {
        doSetSrrnk_NotEqual(srrnk);
    }

    protected void doSetSrrnk_NotEqual(Long srrnk) {
        regSrrnk(CK_NES, srrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(Long srrnk) {
        regSrrnk(CK_GT, srrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(Long srrnk) {
        regSrrnk(CK_LT, srrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(Long srrnk) {
        regSrrnk(CK_GE, srrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(Long srrnk) {
        regSrrnk(CK_LE, srrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param minNumber The min number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrrnk(), "SRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_InScope(Collection<Long> srrnkList) {
        doSetSrrnk_InScope(srrnkList);
    }

    protected void doSetSrrnk_InScope(Collection<Long> srrnkList) {
        regINS(CK_INS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<Long> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<Long> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNull() { regSrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNotNull() { regSrrnk(CK_ISNN, DOBJ); }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_Equal(Long dlvsnm) {
        doSetDlvsnm_Equal(dlvsnm);
    }

    protected void doSetDlvsnm_Equal(Long dlvsnm) {
        regDlvsnm(CK_EQ, dlvsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_NotEqual(Long dlvsnm) {
        doSetDlvsnm_NotEqual(dlvsnm);
    }

    protected void doSetDlvsnm_NotEqual(Long dlvsnm) {
        regDlvsnm(CK_NES, dlvsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterThan(Long dlvsnm) {
        regDlvsnm(CK_GT, dlvsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessThan(Long dlvsnm) {
        regDlvsnm(CK_LT, dlvsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_GreaterEqual(Long dlvsnm) {
        regDlvsnm(CK_GE, dlvsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnm The value of dlvsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvsnm_LessEqual(Long dlvsnm) {
        regDlvsnm(CK_LE, dlvsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param minNumber The min number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvsnm(), "DLVSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_InScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_InScope(dlvsnmList);
    }

    protected void doSetDlvsnm_InScope(Collection<Long> dlvsnmList) {
        regINS(CK_INS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVSNM: {bigint(19)}
     * @param dlvsnmList The collection of dlvsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        doSetDlvsnm_NotInScope(dlvsnmList);
    }

    protected void doSetDlvsnm_NotInScope(Collection<Long> dlvsnmList) {
        regINS(CK_NINS, cTL(dlvsnmList), xgetCValueDlvsnm(), "DLVSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNull() { regDlvsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVSNM: {bigint(19)}
     */
    public void setDlvsnm_IsNotNull() { regDlvsnm(CK_ISNN, DOBJ); }

    protected void regDlvsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvsnm(), "DLVSNM"); }
    protected abstract ConditionValue xgetCValueDlvsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_Equal(Long dlvdtlsnm) {
        doSetDlvdtlsnm_Equal(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_Equal(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_EQ, dlvdtlsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotEqual(Long dlvdtlsnm) {
        doSetDlvdtlsnm_NotEqual(dlvdtlsnm);
    }

    protected void doSetDlvdtlsnm_NotEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_NES, dlvdtlsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterThan(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_GT, dlvdtlsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessThan(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_LT, dlvdtlsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_GreaterEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_GE, dlvdtlsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnm The value of dlvdtlsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_LessEqual(Long dlvdtlsnm) {
        regDlvdtlsnm(CK_LE, dlvdtlsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param minNumber The min number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvdtlsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvdtlsnm(), "DLVDTLSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_InScope(Collection<Long> dlvdtlsnmList) {
        doSetDlvdtlsnm_InScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_InScope(Collection<Long> dlvdtlsnmList) {
        regINS(CK_INS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     * @param dlvdtlsnmList The collection of dlvdtlsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvdtlsnm_NotInScope(Collection<Long> dlvdtlsnmList) {
        doSetDlvdtlsnm_NotInScope(dlvdtlsnmList);
    }

    protected void doSetDlvdtlsnm_NotInScope(Collection<Long> dlvdtlsnmList) {
        regINS(CK_NINS, cTL(dlvdtlsnmList), xgetCValueDlvdtlsnm(), "DLVDTLSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     */
    public void setDlvdtlsnm_IsNull() { regDlvdtlsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVDTLSNM: {bigint(19)}
     */
    public void setDlvdtlsnm_IsNotNull() { regDlvdtlsnm(CK_ISNN, DOBJ); }

    protected void regDlvdtlsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvdtlsnm(), "DLVDTLSNM"); }
    protected abstract ConditionValue xgetCValueDlvdtlsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_Equal(String sscd) {
        doSetSscd_Equal(fRES(sscd));
    }

    protected void doSetSscd_Equal(String sscd) {
        regSscd(CK_EQ, sscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotEqual(String sscd) {
        doSetSscd_NotEqual(fRES(sscd));
    }

    protected void doSetSscd_NotEqual(String sscd) {
        regSscd(CK_NES, sscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterThan(String sscd) {
        regSscd(CK_GT, fRES(sscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessThan(String sscd) {
        regSscd(CK_LT, fRES(sscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_GreaterEqual(String sscd) {
        regSscd(CK_GE, fRES(sscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_LessEqual(String sscd) {
        regSscd(CK_LE, fRES(sscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscdList The collection of sscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_InScope(Collection<String> sscdList) {
        doSetSscd_InScope(sscdList);
    }

    protected void doSetSscd_InScope(Collection<String> sscdList) {
        regINS(CK_INS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscdList The collection of sscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_NotInScope(Collection<String> sscdList) {
        doSetSscd_NotInScope(sscdList);
    }

    protected void doSetSscd_NotInScope(Collection<String> sscdList) {
        regINS(CK_NINS, cTL(sscdList), xgetCValueSscd(), "SSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscd The value of sscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscd_LikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscd_NotLikeSearch(String sscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscd), xgetCValueSscd(), "SSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCD: {NotNull, varchar(30)}
     * @param sscd The value of sscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscd_PrefixSearch(String sscd) {
        setSscd_LikeSearch(sscd, xcLSOPPre());
    }

    protected void regSscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscd(), "SSCD"); }
    protected abstract ConditionValue xgetCValueSscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_Equal(String ssnm) {
        doSetSsnm_Equal(fRES(ssnm));
    }

    protected void doSetSsnm_Equal(String ssnm) {
        regSsnm(CK_EQ, ssnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_NotEqual(String ssnm) {
        doSetSsnm_NotEqual(fRES(ssnm));
    }

    protected void doSetSsnm_NotEqual(String ssnm) {
        regSsnm(CK_NES, ssnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_GreaterThan(String ssnm) {
        regSsnm(CK_GT, fRES(ssnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_LessThan(String ssnm) {
        regSsnm(CK_LT, fRES(ssnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_GreaterEqual(String ssnm) {
        regSsnm(CK_GE, fRES(ssnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_LessEqual(String ssnm) {
        regSsnm(CK_LE, fRES(ssnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnmList The collection of ssnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_InScope(Collection<String> ssnmList) {
        doSetSsnm_InScope(ssnmList);
    }

    protected void doSetSsnm_InScope(Collection<String> ssnmList) {
        regINS(CK_INS, cTL(ssnmList), xgetCValueSsnm(), "SSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnmList The collection of ssnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_NotInScope(Collection<String> ssnmList) {
        doSetSsnm_NotInScope(ssnmList);
    }

    protected void doSetSsnm_NotInScope(Collection<String> ssnmList) {
        regINS(CK_NINS, cTL(ssnmList), xgetCValueSsnm(), "SSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)} <br>
     * <pre>e.g. setSsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ssnm The value of ssnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSsnm_LikeSearch(String ssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ssnm), xgetCValueSsnm(), "SSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSsnm_NotLikeSearch(String ssnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ssnm), xgetCValueSsnm(), "SSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSNM: {varchar(60)}
     * @param ssnm The value of ssnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSsnm_PrefixSearch(String ssnm) {
        setSsnm_LikeSearch(ssnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNull() { regSsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNullOrEmpty() { regSsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSNM: {varchar(60)}
     */
    public void setSsnm_IsNotNull() { regSsnm(CK_ISNN, DOBJ); }

    protected void regSsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSsnm(), "SSNM"); }
    protected abstract ConditionValue xgetCValueSsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_Equal(String hdvid) {
        doSetHdvid_Equal(fRES(hdvid));
    }

    protected void doSetHdvid_Equal(String hdvid) {
        regHdvid(CK_EQ, hdvid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_NotEqual(String hdvid) {
        doSetHdvid_NotEqual(fRES(hdvid));
    }

    protected void doSetHdvid_NotEqual(String hdvid) {
        regHdvid(CK_NES, hdvid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_GreaterThan(String hdvid) {
        regHdvid(CK_GT, fRES(hdvid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_LessThan(String hdvid) {
        regHdvid(CK_LT, fRES(hdvid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_GreaterEqual(String hdvid) {
        regHdvid(CK_GE, fRES(hdvid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_LessEqual(String hdvid) {
        regHdvid(CK_LE, fRES(hdvid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvidList The collection of hdvid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_InScope(Collection<String> hdvidList) {
        doSetHdvid_InScope(hdvidList);
    }

    protected void doSetHdvid_InScope(Collection<String> hdvidList) {
        regINS(CK_INS, cTL(hdvidList), xgetCValueHdvid(), "HDVID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvidList The collection of hdvid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_NotInScope(Collection<String> hdvidList) {
        doSetHdvid_NotInScope(hdvidList);
    }

    protected void doSetHdvid_NotInScope(Collection<String> hdvidList) {
        regINS(CK_NINS, cTL(hdvidList), xgetCValueHdvid(), "HDVID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {char(1)} <br>
     * <pre>e.g. setHdvid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdvid The value of hdvid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdvid_LikeSearch(String hdvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdvid), xgetCValueHdvid(), "HDVID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdvid_NotLikeSearch(String hdvid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdvid), xgetCValueHdvid(), "HDVID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDVID: {char(1)}
     * @param hdvid The value of hdvid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdvid_PrefixSearch(String hdvid) {
        setHdvid_LikeSearch(hdvid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     */
    public void setHdvid_IsNull() { regHdvid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDVID: {char(1)}
     */
    public void setHdvid_IsNotNull() { regHdvid(CK_ISNN, DOBJ); }

    protected void regHdvid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdvid(), "HDVID"); }
    protected abstract ConditionValue xgetCValueHdvid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_Equal(String dtlsnm) {
        doSetDtlsnm_Equal(fRES(dtlsnm));
    }

    protected void doSetDtlsnm_Equal(String dtlsnm) {
        regDtlsnm(CK_EQ, dtlsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_NotEqual(String dtlsnm) {
        doSetDtlsnm_NotEqual(fRES(dtlsnm));
    }

    protected void doSetDtlsnm_NotEqual(String dtlsnm) {
        regDtlsnm(CK_NES, dtlsnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_GreaterThan(String dtlsnm) {
        regDtlsnm(CK_GT, fRES(dtlsnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_LessThan(String dtlsnm) {
        regDtlsnm(CK_LT, fRES(dtlsnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_GreaterEqual(String dtlsnm) {
        regDtlsnm(CK_GE, fRES(dtlsnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_LessEqual(String dtlsnm) {
        regDtlsnm(CK_LE, fRES(dtlsnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnmList The collection of dtlsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_InScope(Collection<String> dtlsnmList) {
        doSetDtlsnm_InScope(dtlsnmList);
    }

    protected void doSetDtlsnm_InScope(Collection<String> dtlsnmList) {
        regINS(CK_INS, cTL(dtlsnmList), xgetCValueDtlsnm(), "DTLSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnmList The collection of dtlsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_NotInScope(Collection<String> dtlsnmList) {
        doSetDtlsnm_NotInScope(dtlsnmList);
    }

    protected void doSetDtlsnm_NotInScope(Collection<String> dtlsnmList) {
        regINS(CK_NINS, cTL(dtlsnmList), xgetCValueDtlsnm(), "DTLSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLSNM: {varchar(30)} <br>
     * <pre>e.g. setDtlsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtlsnm The value of dtlsnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtlsnm_LikeSearch(String dtlsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtlsnm), xgetCValueDtlsnm(), "DTLSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtlsnm_NotLikeSearch(String dtlsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtlsnm), xgetCValueDtlsnm(), "DTLSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DTLSNM: {varchar(30)}
     * @param dtlsnm The value of dtlsnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtlsnm_PrefixSearch(String dtlsnm) {
        setDtlsnm_LikeSearch(dtlsnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     */
    public void setDtlsnm_IsNull() { regDtlsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     */
    public void setDtlsnm_IsNullOrEmpty() { regDtlsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DTLSNM: {varchar(30)}
     */
    public void setDtlsnm_IsNotNull() { regDtlsnm(CK_ISNN, DOBJ); }

    protected void regDtlsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtlsnm(), "DTLSNM"); }
    protected abstract ConditionValue xgetCValueDtlsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_Equal(String zzmatnr) {
        doSetZzmatnr_Equal(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_Equal(String zzmatnr) {
        regZzmatnr(CK_EQ, zzmatnr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotEqual(String zzmatnr) {
        doSetZzmatnr_NotEqual(fRES(zzmatnr));
    }

    protected void doSetZzmatnr_NotEqual(String zzmatnr) {
        regZzmatnr(CK_NES, zzmatnr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterThan(String zzmatnr) {
        regZzmatnr(CK_GT, fRES(zzmatnr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessThan(String zzmatnr) {
        regZzmatnr(CK_LT, fRES(zzmatnr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_GreaterEqual(String zzmatnr) {
        regZzmatnr(CK_GE, fRES(zzmatnr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_LessEqual(String zzmatnr) {
        regZzmatnr(CK_LE, fRES(zzmatnr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_InScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_InScope(zzmatnrList);
    }

    protected void doSetZzmatnr_InScope(Collection<String> zzmatnrList) {
        regINS(CK_INS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnrList The collection of zzmatnr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        doSetZzmatnr_NotInScope(zzmatnrList);
    }

    protected void doSetZzmatnr_NotInScope(Collection<String> zzmatnrList) {
        regINS(CK_NINS, cTL(zzmatnrList), xgetCValueZzmatnr(), "ZZMATNR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzmatnr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzmatnr The value of zzmatnr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzmatnr_LikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzmatnr_NotLikeSearch(String zzmatnr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzmatnr), xgetCValueZzmatnr(), "ZZMATNR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZMATNR: {NotNull, varchar(30)}
     * @param zzmatnr The value of zzmatnr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzmatnr_PrefixSearch(String zzmatnr) {
        setZzmatnr_LikeSearch(zzmatnr, xcLSOPPre());
    }

    protected void regZzmatnr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzmatnr(), "ZZMATNR"); }
    protected abstract ConditionValue xgetCValueZzmatnr();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_Equal(Long slqacb) {
        doSetSlqacb_Equal(slqacb);
    }

    protected void doSetSlqacb_Equal(Long slqacb) {
        regSlqacb(CK_EQ, slqacb);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_NotEqual(Long slqacb) {
        doSetSlqacb_NotEqual(slqacb);
    }

    protected void doSetSlqacb_NotEqual(Long slqacb) {
        regSlqacb(CK_NES, slqacb);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterThan(Long slqacb) {
        regSlqacb(CK_GT, slqacb);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_LessThan(Long slqacb) {
        regSlqacb(CK_LT, slqacb);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_GreaterEqual(Long slqacb) {
        regSlqacb(CK_GE, slqacb);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacb The value of slqacb as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqacb_LessEqual(Long slqacb) {
        regSlqacb(CK_LE, slqacb);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param minNumber The min number of slqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slqacb. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlqacb_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlqacb(), "SLQACB", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacbList The collection of slqacb as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_InScope(Collection<Long> slqacbList) {
        doSetSlqacb_InScope(slqacbList);
    }

    protected void doSetSlqacb_InScope(Collection<Long> slqacbList) {
        regINS(CK_INS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACB: {bigint(19)}
     * @param slqacbList The collection of slqacb as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqacb_NotInScope(Collection<Long> slqacbList) {
        doSetSlqacb_NotInScope(slqacbList);
    }

    protected void doSetSlqacb_NotInScope(Collection<Long> slqacbList) {
        regINS(CK_NINS, cTL(slqacbList), xgetCValueSlqacb(), "SLQACB");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     */
    public void setSlqacb_IsNull() { regSlqacb(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACB: {bigint(19)}
     */
    public void setSlqacb_IsNotNull() { regSlqacb(CK_ISNN, DOBJ); }

    protected void regSlqacb(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqacb(), "SLQACB"); }
    protected abstract ConditionValue xgetCValueSlqacb();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_Equal(Long slqact) {
        doSetSlqact_Equal(slqact);
    }

    protected void doSetSlqact_Equal(Long slqact) {
        regSlqact(CK_EQ, slqact);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_NotEqual(Long slqact) {
        doSetSlqact_NotEqual(slqact);
    }

    protected void doSetSlqact_NotEqual(Long slqact) {
        regSlqact(CK_NES, slqact);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_GreaterThan(Long slqact) {
        regSlqact(CK_GT, slqact);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_LessThan(Long slqact) {
        regSlqact(CK_LT, slqact);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_GreaterEqual(Long slqact) {
        regSlqact(CK_GE, slqact);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqact The value of slqact as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqact_LessEqual(Long slqact) {
        regSlqact(CK_LE, slqact);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param minNumber The min number of slqact. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slqact. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlqact_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlqact(), "SLQACT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqactList The collection of slqact as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_InScope(Collection<Long> slqactList) {
        doSetSlqact_InScope(slqactList);
    }

    protected void doSetSlqact_InScope(Collection<Long> slqactList) {
        regINS(CK_INS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQACT: {bigint(19)}
     * @param slqactList The collection of slqact as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqact_NotInScope(Collection<Long> slqactList) {
        doSetSlqact_NotInScope(slqactList);
    }

    protected void doSetSlqact_NotInScope(Collection<Long> slqactList) {
        regINS(CK_NINS, cTL(slqactList), xgetCValueSlqact(), "SLQACT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     */
    public void setSlqact_IsNull() { regSlqact(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQACT: {bigint(19)}
     */
    public void setSlqact_IsNotNull() { regSlqact(CK_ISNN, DOBJ); }

    protected void regSlqact(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqact(), "SLQACT"); }
    protected abstract ConditionValue xgetCValueSlqact();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_Equal(Long slqanum) {
        doSetSlqanum_Equal(slqanum);
    }

    protected void doSetSlqanum_Equal(Long slqanum) {
        regSlqanum(CK_EQ, slqanum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_NotEqual(Long slqanum) {
        doSetSlqanum_NotEqual(slqanum);
    }

    protected void doSetSlqanum_NotEqual(Long slqanum) {
        regSlqanum(CK_NES, slqanum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_GreaterThan(Long slqanum) {
        regSlqanum(CK_GT, slqanum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_LessThan(Long slqanum) {
        regSlqanum(CK_LT, slqanum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_GreaterEqual(Long slqanum) {
        regSlqanum(CK_GE, slqanum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanum The value of slqanum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlqanum_LessEqual(Long slqanum) {
        regSlqanum(CK_LE, slqanum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param minNumber The min number of slqanum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slqanum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlqanum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlqanum(), "SLQANUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanumList The collection of slqanum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqanum_InScope(Collection<Long> slqanumList) {
        doSetSlqanum_InScope(slqanumList);
    }

    protected void doSetSlqanum_InScope(Collection<Long> slqanumList) {
        regINS(CK_INS, cTL(slqanumList), xgetCValueSlqanum(), "SLQANUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLQANUM: {bigint(19)}
     * @param slqanumList The collection of slqanum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlqanum_NotInScope(Collection<Long> slqanumList) {
        doSetSlqanum_NotInScope(slqanumList);
    }

    protected void doSetSlqanum_NotInScope(Collection<Long> slqanumList) {
        regINS(CK_NINS, cTL(slqanumList), xgetCValueSlqanum(), "SLQANUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     */
    public void setSlqanum_IsNull() { regSlqanum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLQANUM: {bigint(19)}
     */
    public void setSlqanum_IsNotNull() { regSlqanum(CK_ISNN, DOBJ); }

    protected void regSlqanum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlqanum(), "SLQANUM"); }
    protected abstract ConditionValue xgetCValueSlqanum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_Equal(String linblk) {
        doSetLinblk_Equal(fRES(linblk));
    }

    protected void doSetLinblk_Equal(String linblk) {
        regLinblk(CK_EQ, linblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotEqual(String linblk) {
        doSetLinblk_NotEqual(fRES(linblk));
    }

    protected void doSetLinblk_NotEqual(String linblk) {
        regLinblk(CK_NES, linblk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblkList The collection of linblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_InScope(Collection<String> linblkList) {
        doSetLinblk_InScope(linblkList);
    }

    protected void doSetLinblk_InScope(Collection<String> linblkList) {
        regINS(CK_INS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblkList The collection of linblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotInScope(Collection<String> linblkList) {
        doSetLinblk_NotInScope(linblkList);
    }

    protected void doSetLinblk_NotInScope(Collection<String> linblkList) {
        regINS(CK_NINS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)} <br>
     * <pre>e.g. setLinblk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk The value of linblk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk_LikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNull() { regLinblk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNullOrEmpty() { regLinblk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNotNull() { regLinblk(CK_ISNN, DOBJ); }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_Equal(String locno) {
        doSetLocno_Equal(fRES(locno));
    }

    protected void doSetLocno_Equal(String locno) {
        regLocno(CK_EQ, locno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_NotEqual(String locno) {
        doSetLocno_NotEqual(fRES(locno));
    }

    protected void doSetLocno_NotEqual(String locno) {
        regLocno(CK_NES, locno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterThan(String locno) {
        regLocno(CK_GT, fRES(locno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessThan(String locno) {
        regLocno(CK_LT, fRES(locno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_GreaterEqual(String locno) {
        regLocno(CK_GE, fRES(locno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_LessEqual(String locno) {
        regLocno(CK_LE, fRES(locno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locnoList The collection of locno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_InScope(Collection<String> locnoList) {
        doSetLocno_InScope(locnoList);
    }

    protected void doSetLocno_InScope(Collection<String> locnoList) {
        regINS(CK_INS, cTL(locnoList), xgetCValueLocno(), "LOCNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locnoList The collection of locno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_NotInScope(Collection<String> locnoList) {
        doSetLocno_NotInScope(locnoList);
    }

    protected void doSetLocno_NotInScope(Collection<String> locnoList) {
        regINS(CK_NINS, cTL(locnoList), xgetCValueLocno(), "LOCNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)} <br>
     * <pre>e.g. setLocno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locno The value of locno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocno_LikeSearch(String locno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locno), xgetCValueLocno(), "LOCNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocno_NotLikeSearch(String locno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locno), xgetCValueLocno(), "LOCNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCNO: {varchar(255)}
     * @param locno The value of locno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocno_PrefixSearch(String locno) {
        setLocno_LikeSearch(locno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNull() { regLocno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNullOrEmpty() { regLocno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCNO: {varchar(255)}
     */
    public void setLocno_IsNotNull() { regLocno(CK_ISNN, DOBJ); }

    protected void regLocno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocno(), "LOCNO"); }
    protected abstract ConditionValue xgetCValueLocno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_Equal(String locid) {
        doSetLocid_Equal(fRES(locid));
    }

    protected void doSetLocid_Equal(String locid) {
        regLocid(CK_EQ, locid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_NotEqual(String locid) {
        doSetLocid_NotEqual(fRES(locid));
    }

    protected void doSetLocid_NotEqual(String locid) {
        regLocid(CK_NES, locid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_GreaterThan(String locid) {
        regLocid(CK_GT, fRES(locid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_LessThan(String locid) {
        regLocid(CK_LT, fRES(locid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_GreaterEqual(String locid) {
        regLocid(CK_GE, fRES(locid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_LessEqual(String locid) {
        regLocid(CK_LE, fRES(locid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locidList The collection of locid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_InScope(Collection<String> locidList) {
        doSetLocid_InScope(locidList);
    }

    protected void doSetLocid_InScope(Collection<String> locidList) {
        regINS(CK_INS, cTL(locidList), xgetCValueLocid(), "LOCID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locidList The collection of locid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_NotInScope(Collection<String> locidList) {
        doSetLocid_NotInScope(locidList);
    }

    protected void doSetLocid_NotInScope(Collection<String> locidList) {
        regINS(CK_NINS, cTL(locidList), xgetCValueLocid(), "LOCID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)} <br>
     * <pre>e.g. setLocid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locid The value of locid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocid_LikeSearch(String locid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locid), xgetCValueLocid(), "LOCID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocid_NotLikeSearch(String locid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locid), xgetCValueLocid(), "LOCID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCID: {char(1)}
     * @param locid The value of locid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocid_PrefixSearch(String locid) {
        setLocid_LikeSearch(locid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     */
    public void setLocid_IsNull() { regLocid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCID: {char(1)}
     */
    public void setLocid_IsNotNull() { regLocid(CK_ISNN, DOBJ); }

    protected void regLocid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocid(), "LOCID"); }
    protected abstract ConditionValue xgetCValueLocid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_Equal(Long dlvprtrnk) {
        doSetDlvprtrnk_Equal(dlvprtrnk);
    }

    protected void doSetDlvprtrnk_Equal(Long dlvprtrnk) {
        regDlvprtrnk(CK_EQ, dlvprtrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_NotEqual(Long dlvprtrnk) {
        doSetDlvprtrnk_NotEqual(dlvprtrnk);
    }

    protected void doSetDlvprtrnk_NotEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_NES, dlvprtrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_GreaterThan(Long dlvprtrnk) {
        regDlvprtrnk(CK_GT, dlvprtrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_LessThan(Long dlvprtrnk) {
        regDlvprtrnk(CK_LT, dlvprtrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_GreaterEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_GE, dlvprtrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnk The value of dlvprtrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDlvprtrnk_LessEqual(Long dlvprtrnk) {
        regDlvprtrnk(CK_LE, dlvprtrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param minNumber The min number of dlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDlvprtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDlvprtrnk(), "DLVPRTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnkList The collection of dlvprtrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvprtrnk_InScope(Collection<Long> dlvprtrnkList) {
        doSetDlvprtrnk_InScope(dlvprtrnkList);
    }

    protected void doSetDlvprtrnk_InScope(Collection<Long> dlvprtrnkList) {
        regINS(CK_INS, cTL(dlvprtrnkList), xgetCValueDlvprtrnk(), "DLVPRTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     * @param dlvprtrnkList The collection of dlvprtrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvprtrnk_NotInScope(Collection<Long> dlvprtrnkList) {
        doSetDlvprtrnk_NotInScope(dlvprtrnkList);
    }

    protected void doSetDlvprtrnk_NotInScope(Collection<Long> dlvprtrnkList) {
        regINS(CK_NINS, cTL(dlvprtrnkList), xgetCValueDlvprtrnk(), "DLVPRTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     */
    public void setDlvprtrnk_IsNull() { regDlvprtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVPRTRNK: {bigint(19)}
     */
    public void setDlvprtrnk_IsNotNull() { regDlvprtrnk(CK_ISNN, DOBJ); }

    protected void regDlvprtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvprtrnk(), "DLVPRTRNK"); }
    protected abstract ConditionValue xgetCValueDlvprtrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_Equal(String srdlvymd) {
        doSetSrdlvymd_Equal(fRES(srdlvymd));
    }

    protected void doSetSrdlvymd_Equal(String srdlvymd) {
        regSrdlvymd(CK_EQ, srdlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_NotEqual(String srdlvymd) {
        doSetSrdlvymd_NotEqual(fRES(srdlvymd));
    }

    protected void doSetSrdlvymd_NotEqual(String srdlvymd) {
        regSrdlvymd(CK_NES, srdlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_GreaterThan(String srdlvymd) {
        regSrdlvymd(CK_GT, fRES(srdlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_LessThan(String srdlvymd) {
        regSrdlvymd(CK_LT, fRES(srdlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_GreaterEqual(String srdlvymd) {
        regSrdlvymd(CK_GE, fRES(srdlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_LessEqual(String srdlvymd) {
        regSrdlvymd(CK_LE, fRES(srdlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymdList The collection of srdlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_InScope(Collection<String> srdlvymdList) {
        doSetSrdlvymd_InScope(srdlvymdList);
    }

    protected void doSetSrdlvymd_InScope(Collection<String> srdlvymdList) {
        regINS(CK_INS, cTL(srdlvymdList), xgetCValueSrdlvymd(), "SRDLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymdList The collection of srdlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_NotInScope(Collection<String> srdlvymdList) {
        doSetSrdlvymd_NotInScope(srdlvymdList);
    }

    protected void doSetSrdlvymd_NotInScope(Collection<String> srdlvymdList) {
        regINS(CK_NINS, cTL(srdlvymdList), xgetCValueSrdlvymd(), "SRDLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDLVYMD: {varchar(8)} <br>
     * <pre>e.g. setSrdlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srdlvymd The value of srdlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrdlvymd_LikeSearch(String srdlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srdlvymd), xgetCValueSrdlvymd(), "SRDLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrdlvymd_NotLikeSearch(String srdlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srdlvymd), xgetCValueSrdlvymd(), "SRDLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     * @param srdlvymd The value of srdlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvymd_PrefixSearch(String srdlvymd) {
        setSrdlvymd_LikeSearch(srdlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     */
    public void setSrdlvymd_IsNull() { regSrdlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     */
    public void setSrdlvymd_IsNullOrEmpty() { regSrdlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDLVYMD: {varchar(8)}
     */
    public void setSrdlvymd_IsNotNull() { regSrdlvymd(CK_ISNN, DOBJ); }

    protected void regSrdlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrdlvymd(), "SRDLVYMD"); }
    protected abstract ConditionValue xgetCValueSrdlvymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_Equal(String srhpynid) {
        doSetSrhpynid_Equal(fRES(srhpynid));
    }

    protected void doSetSrhpynid_Equal(String srhpynid) {
        regSrhpynid(CK_EQ, srhpynid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_NotEqual(String srhpynid) {
        doSetSrhpynid_NotEqual(fRES(srhpynid));
    }

    protected void doSetSrhpynid_NotEqual(String srhpynid) {
        regSrhpynid(CK_NES, srhpynid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_GreaterThan(String srhpynid) {
        regSrhpynid(CK_GT, fRES(srhpynid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_LessThan(String srhpynid) {
        regSrhpynid(CK_LT, fRES(srhpynid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_GreaterEqual(String srhpynid) {
        regSrhpynid(CK_GE, fRES(srhpynid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_LessEqual(String srhpynid) {
        regSrhpynid(CK_LE, fRES(srhpynid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynidList The collection of srhpynid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_InScope(Collection<String> srhpynidList) {
        doSetSrhpynid_InScope(srhpynidList);
    }

    protected void doSetSrhpynid_InScope(Collection<String> srhpynidList) {
        regINS(CK_INS, cTL(srhpynidList), xgetCValueSrhpynid(), "SRHPYNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynidList The collection of srhpynid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_NotInScope(Collection<String> srhpynidList) {
        doSetSrhpynid_NotInScope(srhpynidList);
    }

    protected void doSetSrhpynid_NotInScope(Collection<String> srhpynidList) {
        regINS(CK_NINS, cTL(srhpynidList), xgetCValueSrhpynid(), "SRHPYNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRHPYNID: {char(1)} <br>
     * <pre>e.g. setSrhpynid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srhpynid The value of srhpynid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrhpynid_LikeSearch(String srhpynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srhpynid), xgetCValueSrhpynid(), "SRHPYNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrhpynid_NotLikeSearch(String srhpynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srhpynid), xgetCValueSrhpynid(), "SRHPYNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRHPYNID: {char(1)}
     * @param srhpynid The value of srhpynid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrhpynid_PrefixSearch(String srhpynid) {
        setSrhpynid_LikeSearch(srhpynid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     */
    public void setSrhpynid_IsNull() { regSrhpynid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRHPYNID: {char(1)}
     */
    public void setSrhpynid_IsNotNull() { regSrhpynid(CK_ISNN, DOBJ); }

    protected void regSrhpynid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrhpynid(), "SRHPYNID"); }
    protected abstract ConditionValue xgetCValueSrhpynid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_Equal(String sripynid) {
        doSetSripynid_Equal(fRES(sripynid));
    }

    protected void doSetSripynid_Equal(String sripynid) {
        regSripynid(CK_EQ, sripynid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_NotEqual(String sripynid) {
        doSetSripynid_NotEqual(fRES(sripynid));
    }

    protected void doSetSripynid_NotEqual(String sripynid) {
        regSripynid(CK_NES, sripynid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_GreaterThan(String sripynid) {
        regSripynid(CK_GT, fRES(sripynid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_LessThan(String sripynid) {
        regSripynid(CK_LT, fRES(sripynid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_GreaterEqual(String sripynid) {
        regSripynid(CK_GE, fRES(sripynid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_LessEqual(String sripynid) {
        regSripynid(CK_LE, fRES(sripynid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynidList The collection of sripynid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_InScope(Collection<String> sripynidList) {
        doSetSripynid_InScope(sripynidList);
    }

    protected void doSetSripynid_InScope(Collection<String> sripynidList) {
        regINS(CK_INS, cTL(sripynidList), xgetCValueSripynid(), "SRIPYNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynidList The collection of sripynid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_NotInScope(Collection<String> sripynidList) {
        doSetSripynid_NotInScope(sripynidList);
    }

    protected void doSetSripynid_NotInScope(Collection<String> sripynidList) {
        regINS(CK_NINS, cTL(sripynidList), xgetCValueSripynid(), "SRIPYNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRIPYNID: {char(1)} <br>
     * <pre>e.g. setSripynid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sripynid The value of sripynid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSripynid_LikeSearch(String sripynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sripynid), xgetCValueSripynid(), "SRIPYNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSripynid_NotLikeSearch(String sripynid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sripynid), xgetCValueSripynid(), "SRIPYNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRIPYNID: {char(1)}
     * @param sripynid The value of sripynid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSripynid_PrefixSearch(String sripynid) {
        setSripynid_LikeSearch(sripynid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     */
    public void setSripynid_IsNull() { regSripynid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRIPYNID: {char(1)}
     */
    public void setSripynid_IsNotNull() { regSripynid(CK_ISNN, DOBJ); }

    protected void regSripynid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSripynid(), "SRIPYNID"); }
    protected abstract ConditionValue xgetCValueSripynid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_Equal(String srsrlincd) {
        doSetSrsrlincd_Equal(fRES(srsrlincd));
    }

    protected void doSetSrsrlincd_Equal(String srsrlincd) {
        regSrsrlincd(CK_EQ, srsrlincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_NotEqual(String srsrlincd) {
        doSetSrsrlincd_NotEqual(fRES(srsrlincd));
    }

    protected void doSetSrsrlincd_NotEqual(String srsrlincd) {
        regSrsrlincd(CK_NES, srsrlincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_GreaterThan(String srsrlincd) {
        regSrsrlincd(CK_GT, fRES(srsrlincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_LessThan(String srsrlincd) {
        regSrsrlincd(CK_LT, fRES(srsrlincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_GreaterEqual(String srsrlincd) {
        regSrsrlincd(CK_GE, fRES(srsrlincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_LessEqual(String srsrlincd) {
        regSrsrlincd(CK_LE, fRES(srsrlincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincdList The collection of srsrlincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_InScope(Collection<String> srsrlincdList) {
        doSetSrsrlincd_InScope(srsrlincdList);
    }

    protected void doSetSrsrlincd_InScope(Collection<String> srsrlincdList) {
        regINS(CK_INS, cTL(srsrlincdList), xgetCValueSrsrlincd(), "SRSRLINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincdList The collection of srsrlincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_NotInScope(Collection<String> srsrlincdList) {
        doSetSrsrlincd_NotInScope(srsrlincdList);
    }

    protected void doSetSrsrlincd_NotInScope(Collection<String> srsrlincdList) {
        regINS(CK_NINS, cTL(srsrlincdList), xgetCValueSrsrlincd(), "SRSRLINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRSRLINCD: {varchar(30)} <br>
     * <pre>e.g. setSrsrlincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srsrlincd The value of srsrlincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrsrlincd_LikeSearch(String srsrlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srsrlincd), xgetCValueSrsrlincd(), "SRSRLINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrsrlincd_NotLikeSearch(String srsrlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srsrlincd), xgetCValueSrsrlincd(), "SRSRLINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     * @param srsrlincd The value of srsrlincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrlincd_PrefixSearch(String srsrlincd) {
        setSrsrlincd_LikeSearch(srsrlincd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     */
    public void setSrsrlincd_IsNull() { regSrsrlincd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     */
    public void setSrsrlincd_IsNullOrEmpty() { regSrsrlincd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRSRLINCD: {varchar(30)}
     */
    public void setSrsrlincd_IsNotNull() { regSrsrlincd(CK_ISNN, DOBJ); }

    protected void regSrsrlincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrsrlincd(), "SRSRLINCD"); }
    protected abstract ConditionValue xgetCValueSrsrlincd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_Equal(Long srsrrnk) {
        doSetSrsrrnk_Equal(srsrrnk);
    }

    protected void doSetSrsrrnk_Equal(Long srsrrnk) {
        regSrsrrnk(CK_EQ, srsrrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_NotEqual(Long srsrrnk) {
        doSetSrsrrnk_NotEqual(srsrrnk);
    }

    protected void doSetSrsrrnk_NotEqual(Long srsrrnk) {
        regSrsrrnk(CK_NES, srsrrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_GreaterThan(Long srsrrnk) {
        regSrsrrnk(CK_GT, srsrrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_LessThan(Long srsrrnk) {
        regSrsrrnk(CK_LT, srsrrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_GreaterEqual(Long srsrrnk) {
        regSrsrrnk(CK_GE, srsrrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_LessEqual(Long srsrrnk) {
        regSrsrrnk(CK_LE, srsrrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param minNumber The min number of srsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrsrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrsrrnk(), "SRSRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnkList The collection of srsrrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrrnk_InScope(Collection<Long> srsrrnkList) {
        doSetSrsrrnk_InScope(srsrrnkList);
    }

    protected void doSetSrsrrnk_InScope(Collection<Long> srsrrnkList) {
        regINS(CK_INS, cTL(srsrrnkList), xgetCValueSrsrrnk(), "SRSRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnkList The collection of srsrrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrrnk_NotInScope(Collection<Long> srsrrnkList) {
        doSetSrsrrnk_NotInScope(srsrrnkList);
    }

    protected void doSetSrsrrnk_NotInScope(Collection<Long> srsrrnkList) {
        regINS(CK_NINS, cTL(srsrrnkList), xgetCValueSrsrrnk(), "SRSRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     */
    public void setSrsrrnk_IsNull() { regSrsrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     */
    public void setSrsrrnk_IsNotNull() { regSrsrrnk(CK_ISNN, DOBJ); }

    protected void regSrsrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrsrrnk(), "SRSRRNK"); }
    protected abstract ConditionValue xgetCValueSrsrrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_Equal(Long srdlvsnm) {
        doSetSrdlvsnm_Equal(srdlvsnm);
    }

    protected void doSetSrdlvsnm_Equal(Long srdlvsnm) {
        regSrdlvsnm(CK_EQ, srdlvsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_NotEqual(Long srdlvsnm) {
        doSetSrdlvsnm_NotEqual(srdlvsnm);
    }

    protected void doSetSrdlvsnm_NotEqual(Long srdlvsnm) {
        regSrdlvsnm(CK_NES, srdlvsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_GreaterThan(Long srdlvsnm) {
        regSrdlvsnm(CK_GT, srdlvsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_LessThan(Long srdlvsnm) {
        regSrdlvsnm(CK_LT, srdlvsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_GreaterEqual(Long srdlvsnm) {
        regSrdlvsnm(CK_GE, srdlvsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnm The value of srdlvsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvsnm_LessEqual(Long srdlvsnm) {
        regSrdlvsnm(CK_LE, srdlvsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param minNumber The min number of srdlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srdlvsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrdlvsnm_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrdlvsnm(), "SRDLVSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnmList The collection of srdlvsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvsnm_InScope(Collection<Long> srdlvsnmList) {
        doSetSrdlvsnm_InScope(srdlvsnmList);
    }

    protected void doSetSrdlvsnm_InScope(Collection<Long> srdlvsnmList) {
        regINS(CK_INS, cTL(srdlvsnmList), xgetCValueSrdlvsnm(), "SRDLVSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     * @param srdlvsnmList The collection of srdlvsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvsnm_NotInScope(Collection<Long> srdlvsnmList) {
        doSetSrdlvsnm_NotInScope(srdlvsnmList);
    }

    protected void doSetSrdlvsnm_NotInScope(Collection<Long> srdlvsnmList) {
        regINS(CK_NINS, cTL(srdlvsnmList), xgetCValueSrdlvsnm(), "SRDLVSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     */
    public void setSrdlvsnm_IsNull() { regSrdlvsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDLVSNM: {bigint(19)}
     */
    public void setSrdlvsnm_IsNotNull() { regSrdlvsnm(CK_ISNN, DOBJ); }

    protected void regSrdlvsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrdlvsnm(), "SRDLVSNM"); }
    protected abstract ConditionValue xgetCValueSrdlvsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_Equal(java.math.BigDecimal srdlvdtlsnm) {
        doSetSrdlvdtlsnm_Equal(srdlvdtlsnm);
    }

    protected void doSetSrdlvdtlsnm_Equal(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_EQ, srdlvdtlsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_NotEqual(java.math.BigDecimal srdlvdtlsnm) {
        doSetSrdlvdtlsnm_NotEqual(srdlvdtlsnm);
    }

    protected void doSetSrdlvdtlsnm_NotEqual(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_NES, srdlvdtlsnm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_GreaterThan(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_GT, srdlvdtlsnm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_LessThan(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_LT, srdlvdtlsnm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_GreaterEqual(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_GE, srdlvdtlsnm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnm The value of srdlvdtlsnm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_LessEqual(java.math.BigDecimal srdlvdtlsnm) {
        regSrdlvdtlsnm(CK_LE, srdlvdtlsnm);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param minNumber The min number of srdlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srdlvdtlsnm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrdlvdtlsnm_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrdlvdtlsnm(), "SRDLVDTLSNM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnmList The collection of srdlvdtlsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_InScope(Collection<java.math.BigDecimal> srdlvdtlsnmList) {
        doSetSrdlvdtlsnm_InScope(srdlvdtlsnmList);
    }

    protected void doSetSrdlvdtlsnm_InScope(Collection<java.math.BigDecimal> srdlvdtlsnmList) {
        regINS(CK_INS, cTL(srdlvdtlsnmList), xgetCValueSrdlvdtlsnm(), "SRDLVDTLSNM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     * @param srdlvdtlsnmList The collection of srdlvdtlsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvdtlsnm_NotInScope(Collection<java.math.BigDecimal> srdlvdtlsnmList) {
        doSetSrdlvdtlsnm_NotInScope(srdlvdtlsnmList);
    }

    protected void doSetSrdlvdtlsnm_NotInScope(Collection<java.math.BigDecimal> srdlvdtlsnmList) {
        regINS(CK_NINS, cTL(srdlvdtlsnmList), xgetCValueSrdlvdtlsnm(), "SRDLVDTLSNM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     */
    public void setSrdlvdtlsnm_IsNull() { regSrdlvdtlsnm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDLVDTLSNM: {decimal(16, 6)}
     */
    public void setSrdlvdtlsnm_IsNotNull() { regSrdlvdtlsnm(CK_ISNN, DOBJ); }

    protected void regSrdlvdtlsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrdlvdtlsnm(), "SRDLVDTLSNM"); }
    protected abstract ConditionValue xgetCValueSrdlvdtlsnm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_Equal(Long srdlvprtrnk) {
        doSetSrdlvprtrnk_Equal(srdlvprtrnk);
    }

    protected void doSetSrdlvprtrnk_Equal(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_EQ, srdlvprtrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_NotEqual(Long srdlvprtrnk) {
        doSetSrdlvprtrnk_NotEqual(srdlvprtrnk);
    }

    protected void doSetSrdlvprtrnk_NotEqual(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_NES, srdlvprtrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_GreaterThan(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_GT, srdlvprtrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_LessThan(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_LT, srdlvprtrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_GreaterEqual(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_GE, srdlvprtrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnk The value of srdlvprtrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_LessEqual(Long srdlvprtrnk) {
        regSrdlvprtrnk(CK_LE, srdlvprtrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param minNumber The min number of srdlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srdlvprtrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrdlvprtrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrdlvprtrnk(), "SRDLVPRTRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnkList The collection of srdlvprtrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_InScope(Collection<Long> srdlvprtrnkList) {
        doSetSrdlvprtrnk_InScope(srdlvprtrnkList);
    }

    protected void doSetSrdlvprtrnk_InScope(Collection<Long> srdlvprtrnkList) {
        regINS(CK_INS, cTL(srdlvprtrnkList), xgetCValueSrdlvprtrnk(), "SRDLVPRTRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     * @param srdlvprtrnkList The collection of srdlvprtrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrdlvprtrnk_NotInScope(Collection<Long> srdlvprtrnkList) {
        doSetSrdlvprtrnk_NotInScope(srdlvprtrnkList);
    }

    protected void doSetSrdlvprtrnk_NotInScope(Collection<Long> srdlvprtrnkList) {
        regINS(CK_NINS, cTL(srdlvprtrnkList), xgetCValueSrdlvprtrnk(), "SRDLVPRTRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     */
    public void setSrdlvprtrnk_IsNull() { regSrdlvprtrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRDLVPRTRNK: {bigint(19)}
     */
    public void setSrdlvprtrnk_IsNotNull() { regSrdlvprtrnk(CK_ISNN, DOBJ); }

    protected void regSrdlvprtrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrdlvprtrnk(), "SRDLVPRTRNK"); }
    protected abstract ConditionValue xgetCValueSrdlvprtrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_Equal(String brtyp) {
        doSetBrtyp_Equal(fRES(brtyp));
    }

    protected void doSetBrtyp_Equal(String brtyp) {
        regBrtyp(CK_EQ, brtyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_NotEqual(String brtyp) {
        doSetBrtyp_NotEqual(fRES(brtyp));
    }

    protected void doSetBrtyp_NotEqual(String brtyp) {
        regBrtyp(CK_NES, brtyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_GreaterThan(String brtyp) {
        regBrtyp(CK_GT, fRES(brtyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_LessThan(String brtyp) {
        regBrtyp(CK_LT, fRES(brtyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_GreaterEqual(String brtyp) {
        regBrtyp(CK_GE, fRES(brtyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_LessEqual(String brtyp) {
        regBrtyp(CK_LE, fRES(brtyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtypList The collection of brtyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_InScope(Collection<String> brtypList) {
        doSetBrtyp_InScope(brtypList);
    }

    protected void doSetBrtyp_InScope(Collection<String> brtypList) {
        regINS(CK_INS, cTL(brtypList), xgetCValueBrtyp(), "BRTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtypList The collection of brtyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_NotInScope(Collection<String> brtypList) {
        doSetBrtyp_NotInScope(brtypList);
    }

    protected void doSetBrtyp_NotInScope(Collection<String> brtypList) {
        regINS(CK_NINS, cTL(brtypList), xgetCValueBrtyp(), "BRTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {varchar(30)} <br>
     * <pre>e.g. setBrtyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brtyp The value of brtyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrtyp_LikeSearch(String brtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brtyp), xgetCValueBrtyp(), "BRTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrtyp_NotLikeSearch(String brtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brtyp), xgetCValueBrtyp(), "BRTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BRTYP: {varchar(30)}
     * @param brtyp The value of brtyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrtyp_PrefixSearch(String brtyp) {
        setBrtyp_LikeSearch(brtyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     */
    public void setBrtyp_IsNull() { regBrtyp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     */
    public void setBrtyp_IsNullOrEmpty() { regBrtyp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BRTYP: {varchar(30)}
     */
    public void setBrtyp_IsNotNull() { regBrtyp(CK_ISNN, DOBJ); }

    protected void regBrtyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrtyp(), "BRTYP"); }
    protected abstract ConditionValue xgetCValueBrtyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_Equal(String boxno) {
        doSetBoxno_Equal(fRES(boxno));
    }

    protected void doSetBoxno_Equal(String boxno) {
        regBoxno(CK_EQ, boxno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotEqual(String boxno) {
        doSetBoxno_NotEqual(fRES(boxno));
    }

    protected void doSetBoxno_NotEqual(String boxno) {
        regBoxno(CK_NES, boxno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterThan(String boxno) {
        regBoxno(CK_GT, fRES(boxno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessThan(String boxno) {
        regBoxno(CK_LT, fRES(boxno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_GreaterEqual(String boxno) {
        regBoxno(CK_GE, fRES(boxno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_LessEqual(String boxno) {
        regBoxno(CK_LE, fRES(boxno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxnoList The collection of boxno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_InScope(Collection<String> boxnoList) {
        doSetBoxno_InScope(boxnoList);
    }

    protected void doSetBoxno_InScope(Collection<String> boxnoList) {
        regINS(CK_INS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxnoList The collection of boxno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_NotInScope(Collection<String> boxnoList) {
        doSetBoxno_NotInScope(boxnoList);
    }

    protected void doSetBoxno_NotInScope(Collection<String> boxnoList) {
        regINS(CK_NINS, cTL(boxnoList), xgetCValueBoxno(), "BOXNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setBoxno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxno The value of boxno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxno_LikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxno_NotLikeSearch(String boxno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxno), xgetCValueBoxno(), "BOXNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNO: {NotNull, varchar(30)}
     * @param boxno The value of boxno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxno_PrefixSearch(String boxno) {
        setBoxno_LikeSearch(boxno, xcLSOPPre());
    }

    protected void regBoxno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxno(), "BOXNO"); }
    protected abstract ConditionValue xgetCValueBoxno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_Equal(String boxnocnsnm) {
        doSetBoxnocnsnm_Equal(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_Equal(String boxnocnsnm) {
        regBoxnocnsnm(CK_EQ, boxnocnsnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotEqual(String boxnocnsnm) {
        doSetBoxnocnsnm_NotEqual(fRES(boxnocnsnm));
    }

    protected void doSetBoxnocnsnm_NotEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_NES, boxnocnsnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_GT, fRES(boxnocnsnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessThan(String boxnocnsnm) {
        regBoxnocnsnm(CK_LT, fRES(boxnocnsnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_GreaterEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_GE, fRES(boxnocnsnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_LessEqual(String boxnocnsnm) {
        regBoxnocnsnm(CK_LE, fRES(boxnocnsnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_InScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_InScope(Collection<String> boxnocnsnmList) {
        regINS(CK_INS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnmList The collection of boxnocnsnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        doSetBoxnocnsnm_NotInScope(boxnocnsnmList);
    }

    protected void doSetBoxnocnsnm_NotInScope(Collection<String> boxnocnsnmList) {
        regINS(CK_NINS, cTL(boxnocnsnmList), xgetCValueBoxnocnsnm(), "BOXNOCNSNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)} <br>
     * <pre>e.g. setBoxnocnsnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxnocnsnm The value of boxnocnsnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxnocnsnm_LikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxnocnsnm_NotLikeSearch(String boxnocnsnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxnocnsnm), xgetCValueBoxnocnsnm(), "BOXNOCNSNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     * @param boxnocnsnm The value of boxnocnsnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxnocnsnm_PrefixSearch(String boxnocnsnm) {
        setBoxnocnsnm_LikeSearch(boxnocnsnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNull() { regBoxnocnsnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNullOrEmpty() { regBoxnocnsnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXNOCNSNM: {varchar(30)}
     */
    public void setBoxnocnsnm_IsNotNull() { regBoxnocnsnm(CK_ISNN, DOBJ); }

    protected void regBoxnocnsnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxnocnsnm(), "BOXNOCNSNM"); }
    protected abstract ConditionValue xgetCValueBoxnocnsnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_Equal(String boxtyp) {
        doSetBoxtyp_Equal(fRES(boxtyp));
    }

    protected void doSetBoxtyp_Equal(String boxtyp) {
        regBoxtyp(CK_EQ, boxtyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_NotEqual(String boxtyp) {
        doSetBoxtyp_NotEqual(fRES(boxtyp));
    }

    protected void doSetBoxtyp_NotEqual(String boxtyp) {
        regBoxtyp(CK_NES, boxtyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_GreaterThan(String boxtyp) {
        regBoxtyp(CK_GT, fRES(boxtyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_LessThan(String boxtyp) {
        regBoxtyp(CK_LT, fRES(boxtyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_GreaterEqual(String boxtyp) {
        regBoxtyp(CK_GE, fRES(boxtyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_LessEqual(String boxtyp) {
        regBoxtyp(CK_LE, fRES(boxtyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtypList The collection of boxtyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_InScope(Collection<String> boxtypList) {
        doSetBoxtyp_InScope(boxtypList);
    }

    protected void doSetBoxtyp_InScope(Collection<String> boxtypList) {
        regINS(CK_INS, cTL(boxtypList), xgetCValueBoxtyp(), "BOXTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtypList The collection of boxtyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_NotInScope(Collection<String> boxtypList) {
        doSetBoxtyp_NotInScope(boxtypList);
    }

    protected void doSetBoxtyp_NotInScope(Collection<String> boxtypList) {
        regINS(CK_NINS, cTL(boxtypList), xgetCValueBoxtyp(), "BOXTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {varchar(30)} <br>
     * <pre>e.g. setBoxtyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param boxtyp The value of boxtyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBoxtyp_LikeSearch(String boxtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(boxtyp), xgetCValueBoxtyp(), "BOXTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBoxtyp_NotLikeSearch(String boxtyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(boxtyp), xgetCValueBoxtyp(), "BOXTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BOXTYP: {varchar(30)}
     * @param boxtyp The value of boxtyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxtyp_PrefixSearch(String boxtyp) {
        setBoxtyp_LikeSearch(boxtyp, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     */
    public void setBoxtyp_IsNull() { regBoxtyp(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     */
    public void setBoxtyp_IsNullOrEmpty() { regBoxtyp(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXTYP: {varchar(30)}
     */
    public void setBoxtyp_IsNotNull() { regBoxtyp(CK_ISNN, DOBJ); }

    protected void regBoxtyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxtyp(), "BOXTYP"); }
    protected abstract ConditionValue xgetCValueBoxtyp();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_Equal(String mgboxdid) {
        doSetMgboxdid_Equal(fRES(mgboxdid));
    }

    protected void doSetMgboxdid_Equal(String mgboxdid) {
        regMgboxdid(CK_EQ, mgboxdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_NotEqual(String mgboxdid) {
        doSetMgboxdid_NotEqual(fRES(mgboxdid));
    }

    protected void doSetMgboxdid_NotEqual(String mgboxdid) {
        regMgboxdid(CK_NES, mgboxdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_GreaterThan(String mgboxdid) {
        regMgboxdid(CK_GT, fRES(mgboxdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_LessThan(String mgboxdid) {
        regMgboxdid(CK_LT, fRES(mgboxdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_GreaterEqual(String mgboxdid) {
        regMgboxdid(CK_GE, fRES(mgboxdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_LessEqual(String mgboxdid) {
        regMgboxdid(CK_LE, fRES(mgboxdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdidList The collection of mgboxdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_InScope(Collection<String> mgboxdidList) {
        doSetMgboxdid_InScope(mgboxdidList);
    }

    protected void doSetMgboxdid_InScope(Collection<String> mgboxdidList) {
        regINS(CK_INS, cTL(mgboxdidList), xgetCValueMgboxdid(), "MGBOXDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdidList The collection of mgboxdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_NotInScope(Collection<String> mgboxdidList) {
        doSetMgboxdid_NotInScope(mgboxdidList);
    }

    protected void doSetMgboxdid_NotInScope(Collection<String> mgboxdidList) {
        regINS(CK_NINS, cTL(mgboxdidList), xgetCValueMgboxdid(), "MGBOXDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)} <br>
     * <pre>e.g. setMgboxdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mgboxdid The value of mgboxdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMgboxdid_LikeSearch(String mgboxdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mgboxdid), xgetCValueMgboxdid(), "MGBOXDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMgboxdid_NotLikeSearch(String mgboxdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mgboxdid), xgetCValueMgboxdid(), "MGBOXDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MGBOXDID: {char(1)}
     * @param mgboxdid The value of mgboxdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMgboxdid_PrefixSearch(String mgboxdid) {
        setMgboxdid_LikeSearch(mgboxdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     */
    public void setMgboxdid_IsNull() { regMgboxdid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MGBOXDID: {char(1)}
     */
    public void setMgboxdid_IsNotNull() { regMgboxdid(CK_ISNN, DOBJ); }

    protected void regMgboxdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMgboxdid(), "MGBOXDID"); }
    protected abstract ConditionValue xgetCValueMgboxdid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_Equal(String dmdid) {
        doSetDmdid_Equal(fRES(dmdid));
    }

    protected void doSetDmdid_Equal(String dmdid) {
        regDmdid(CK_EQ, dmdid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_NotEqual(String dmdid) {
        doSetDmdid_NotEqual(fRES(dmdid));
    }

    protected void doSetDmdid_NotEqual(String dmdid) {
        regDmdid(CK_NES, dmdid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_GreaterThan(String dmdid) {
        regDmdid(CK_GT, fRES(dmdid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_LessThan(String dmdid) {
        regDmdid(CK_LT, fRES(dmdid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_GreaterEqual(String dmdid) {
        regDmdid(CK_GE, fRES(dmdid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_LessEqual(String dmdid) {
        regDmdid(CK_LE, fRES(dmdid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdidList The collection of dmdid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_InScope(Collection<String> dmdidList) {
        doSetDmdid_InScope(dmdidList);
    }

    protected void doSetDmdid_InScope(Collection<String> dmdidList) {
        regINS(CK_INS, cTL(dmdidList), xgetCValueDmdid(), "DMDID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdidList The collection of dmdid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_NotInScope(Collection<String> dmdidList) {
        doSetDmdid_NotInScope(dmdidList);
    }

    protected void doSetDmdid_NotInScope(Collection<String> dmdidList) {
        regINS(CK_NINS, cTL(dmdidList), xgetCValueDmdid(), "DMDID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)} <br>
     * <pre>e.g. setDmdid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dmdid The value of dmdid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDmdid_LikeSearch(String dmdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dmdid), xgetCValueDmdid(), "DMDID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDmdid_NotLikeSearch(String dmdid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dmdid), xgetCValueDmdid(), "DMDID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DMDID: {char(1)}
     * @param dmdid The value of dmdid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDmdid_PrefixSearch(String dmdid) {
        setDmdid_LikeSearch(dmdid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     */
    public void setDmdid_IsNull() { regDmdid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DMDID: {char(1)}
     */
    public void setDmdid_IsNotNull() { regDmdid(CK_ISNN, DOBJ); }

    protected void regDmdid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDmdid(), "DMDID"); }
    protected abstract ConditionValue xgetCValueDmdid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_Equal(Long ttboxqa) {
        doSetTtboxqa_Equal(ttboxqa);
    }

    protected void doSetTtboxqa_Equal(Long ttboxqa) {
        regTtboxqa(CK_EQ, ttboxqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_NotEqual(Long ttboxqa) {
        doSetTtboxqa_NotEqual(ttboxqa);
    }

    protected void doSetTtboxqa_NotEqual(Long ttboxqa) {
        regTtboxqa(CK_NES, ttboxqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_GreaterThan(Long ttboxqa) {
        regTtboxqa(CK_GT, ttboxqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_LessThan(Long ttboxqa) {
        regTtboxqa(CK_LT, ttboxqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_GreaterEqual(Long ttboxqa) {
        regTtboxqa(CK_GE, ttboxqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqa The value of ttboxqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtboxqa_LessEqual(Long ttboxqa) {
        regTtboxqa(CK_LE, ttboxqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param minNumber The min number of ttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTtboxqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTtboxqa(), "TTBOXQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqaList The collection of ttboxqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtboxqa_InScope(Collection<Long> ttboxqaList) {
        doSetTtboxqa_InScope(ttboxqaList);
    }

    protected void doSetTtboxqa_InScope(Collection<Long> ttboxqaList) {
        regINS(CK_INS, cTL(ttboxqaList), xgetCValueTtboxqa(), "TTBOXQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTBOXQA: {bigint(19)}
     * @param ttboxqaList The collection of ttboxqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtboxqa_NotInScope(Collection<Long> ttboxqaList) {
        doSetTtboxqa_NotInScope(ttboxqaList);
    }

    protected void doSetTtboxqa_NotInScope(Collection<Long> ttboxqaList) {
        regINS(CK_NINS, cTL(ttboxqaList), xgetCValueTtboxqa(), "TTBOXQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     */
    public void setTtboxqa_IsNull() { regTtboxqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTBOXQA: {bigint(19)}
     */
    public void setTtboxqa_IsNotNull() { regTtboxqa(CK_ISNN, DOBJ); }

    protected void regTtboxqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtboxqa(), "TTBOXQA"); }
    protected abstract ConditionValue xgetCValueTtboxqa();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_Equal(Long boxctqata) {
        doSetBoxctqata_Equal(boxctqata);
    }

    protected void doSetBoxctqata_Equal(Long boxctqata) {
        regBoxctqata(CK_EQ, boxctqata);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_NotEqual(Long boxctqata) {
        doSetBoxctqata_NotEqual(boxctqata);
    }

    protected void doSetBoxctqata_NotEqual(Long boxctqata) {
        regBoxctqata(CK_NES, boxctqata);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_GreaterThan(Long boxctqata) {
        regBoxctqata(CK_GT, boxctqata);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_LessThan(Long boxctqata) {
        regBoxctqata(CK_LT, boxctqata);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_GreaterEqual(Long boxctqata) {
        regBoxctqata(CK_GE, boxctqata);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqata The value of boxctqata as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqata_LessEqual(Long boxctqata) {
        regBoxctqata(CK_LE, boxctqata);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param minNumber The min number of boxctqata. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxctqata. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxctqata_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxctqata(), "BOXCTQATA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqataList The collection of boxctqata as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqata_InScope(Collection<Long> boxctqataList) {
        doSetBoxctqata_InScope(boxctqataList);
    }

    protected void doSetBoxctqata_InScope(Collection<Long> boxctqataList) {
        regINS(CK_INS, cTL(boxctqataList), xgetCValueBoxctqata(), "BOXCTQATA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     * @param boxctqataList The collection of boxctqata as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqata_NotInScope(Collection<Long> boxctqataList) {
        doSetBoxctqata_NotInScope(boxctqataList);
    }

    protected void doSetBoxctqata_NotInScope(Collection<Long> boxctqataList) {
        regINS(CK_NINS, cTL(boxctqataList), xgetCValueBoxctqata(), "BOXCTQATA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     */
    public void setBoxctqata_IsNull() { regBoxctqata(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXCTQATA: {bigint(19)}
     */
    public void setBoxctqata_IsNotNull() { regBoxctqata(CK_ISNN, DOBJ); }

    protected void regBoxctqata(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxctqata(), "BOXCTQATA"); }
    protected abstract ConditionValue xgetCValueBoxctqata();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_Equal(Long boxctqaapsrplc) {
        doSetBoxctqaapsrplc_Equal(boxctqaapsrplc);
    }

    protected void doSetBoxctqaapsrplc_Equal(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_EQ, boxctqaapsrplc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_NotEqual(Long boxctqaapsrplc) {
        doSetBoxctqaapsrplc_NotEqual(boxctqaapsrplc);
    }

    protected void doSetBoxctqaapsrplc_NotEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_NES, boxctqaapsrplc);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_GreaterThan(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_GT, boxctqaapsrplc);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_LessThan(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_LT, boxctqaapsrplc);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_GreaterEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_GE, boxctqaapsrplc);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplc The value of boxctqaapsrplc as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_LessEqual(Long boxctqaapsrplc) {
        regBoxctqaapsrplc(CK_LE, boxctqaapsrplc);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param minNumber The min number of boxctqaapsrplc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxctqaapsrplc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxctqaapsrplc_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplcList The collection of boxctqaapsrplc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_InScope(Collection<Long> boxctqaapsrplcList) {
        doSetBoxctqaapsrplc_InScope(boxctqaapsrplcList);
    }

    protected void doSetBoxctqaapsrplc_InScope(Collection<Long> boxctqaapsrplcList) {
        regINS(CK_INS, cTL(boxctqaapsrplcList), xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     * @param boxctqaapsrplcList The collection of boxctqaapsrplc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxctqaapsrplc_NotInScope(Collection<Long> boxctqaapsrplcList) {
        doSetBoxctqaapsrplc_NotInScope(boxctqaapsrplcList);
    }

    protected void doSetBoxctqaapsrplc_NotInScope(Collection<Long> boxctqaapsrplcList) {
        regINS(CK_NINS, cTL(boxctqaapsrplcList), xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     */
    public void setBoxctqaapsrplc_IsNull() { regBoxctqaapsrplc(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOXCTQAAPSRPLC: {bigint(19)}
     */
    public void setBoxctqaapsrplc_IsNotNull() { regBoxctqaapsrplc(CK_ISNN, DOBJ); }

    protected void regBoxctqaapsrplc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxctqaapsrplc(), "BOXCTQAAPSRPLC"); }
    protected abstract ConditionValue xgetCValueBoxctqaapsrplc();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_Equal(Long ttsroprtcnt) {
        doSetTtsroprtcnt_Equal(ttsroprtcnt);
    }

    protected void doSetTtsroprtcnt_Equal(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_EQ, ttsroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_NotEqual(Long ttsroprtcnt) {
        doSetTtsroprtcnt_NotEqual(ttsroprtcnt);
    }

    protected void doSetTtsroprtcnt_NotEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_NES, ttsroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_GreaterThan(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_GT, ttsroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_LessThan(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_LT, ttsroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_GreaterEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_GE, ttsroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcnt The value of ttsroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_LessEqual(Long ttsroprtcnt) {
        regTtsroprtcnt(CK_LE, ttsroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param minNumber The min number of ttsroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ttsroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTtsroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTtsroprtcnt(), "TTSROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcntList The collection of ttsroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_InScope(Collection<Long> ttsroprtcntList) {
        doSetTtsroprtcnt_InScope(ttsroprtcntList);
    }

    protected void doSetTtsroprtcnt_InScope(Collection<Long> ttsroprtcntList) {
        regINS(CK_INS, cTL(ttsroprtcntList), xgetCValueTtsroprtcnt(), "TTSROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     * @param ttsroprtcntList The collection of ttsroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTtsroprtcnt_NotInScope(Collection<Long> ttsroprtcntList) {
        doSetTtsroprtcnt_NotInScope(ttsroprtcntList);
    }

    protected void doSetTtsroprtcnt_NotInScope(Collection<Long> ttsroprtcntList) {
        regINS(CK_NINS, cTL(ttsroprtcntList), xgetCValueTtsroprtcnt(), "TTSROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     */
    public void setTtsroprtcnt_IsNull() { regTtsroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTSROPRTCNT: {bigint(19)}
     */
    public void setTtsroprtcnt_IsNotNull() { regTtsroprtcnt(CK_ISNN, DOBJ); }

    protected void regTtsroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTtsroprtcnt(), "TTSROPRTCNT"); }
    protected abstract ConditionValue xgetCValueTtsroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_Equal(String bxmtrid) {
        doSetBxmtrid_Equal(fRES(bxmtrid));
    }

    protected void doSetBxmtrid_Equal(String bxmtrid) {
        regBxmtrid(CK_EQ, bxmtrid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_NotEqual(String bxmtrid) {
        doSetBxmtrid_NotEqual(fRES(bxmtrid));
    }

    protected void doSetBxmtrid_NotEqual(String bxmtrid) {
        regBxmtrid(CK_NES, bxmtrid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_GreaterThan(String bxmtrid) {
        regBxmtrid(CK_GT, fRES(bxmtrid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_LessThan(String bxmtrid) {
        regBxmtrid(CK_LT, fRES(bxmtrid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_GreaterEqual(String bxmtrid) {
        regBxmtrid(CK_GE, fRES(bxmtrid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_LessEqual(String bxmtrid) {
        regBxmtrid(CK_LE, fRES(bxmtrid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtridList The collection of bxmtrid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_InScope(Collection<String> bxmtridList) {
        doSetBxmtrid_InScope(bxmtridList);
    }

    protected void doSetBxmtrid_InScope(Collection<String> bxmtridList) {
        regINS(CK_INS, cTL(bxmtridList), xgetCValueBxmtrid(), "BXMTRID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtridList The collection of bxmtrid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_NotInScope(Collection<String> bxmtridList) {
        doSetBxmtrid_NotInScope(bxmtridList);
    }

    protected void doSetBxmtrid_NotInScope(Collection<String> bxmtridList) {
        regINS(CK_NINS, cTL(bxmtridList), xgetCValueBxmtrid(), "BXMTRID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMTRID: {char(1)} <br>
     * <pre>e.g. setBxmtrid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bxmtrid The value of bxmtrid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBxmtrid_LikeSearch(String bxmtrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bxmtrid), xgetCValueBxmtrid(), "BXMTRID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBxmtrid_NotLikeSearch(String bxmtrid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bxmtrid), xgetCValueBxmtrid(), "BXMTRID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMTRID: {char(1)}
     * @param bxmtrid The value of bxmtrid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmtrid_PrefixSearch(String bxmtrid) {
        setBxmtrid_LikeSearch(bxmtrid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     */
    public void setBxmtrid_IsNull() { regBxmtrid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXMTRID: {char(1)}
     */
    public void setBxmtrid_IsNotNull() { regBxmtrid(CK_ISNN, DOBJ); }

    protected void regBxmtrid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxmtrid(), "BXMTRID"); }
    protected abstract ConditionValue xgetCValueBxmtrid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_Equal(String spplymd) {
        doSetSpplymd_Equal(fRES(spplymd));
    }

    protected void doSetSpplymd_Equal(String spplymd) {
        regSpplymd(CK_EQ, spplymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_NotEqual(String spplymd) {
        doSetSpplymd_NotEqual(fRES(spplymd));
    }

    protected void doSetSpplymd_NotEqual(String spplymd) {
        regSpplymd(CK_NES, spplymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_GreaterThan(String spplymd) {
        regSpplymd(CK_GT, fRES(spplymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_LessThan(String spplymd) {
        regSpplymd(CK_LT, fRES(spplymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_GreaterEqual(String spplymd) {
        regSpplymd(CK_GE, fRES(spplymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_LessEqual(String spplymd) {
        regSpplymd(CK_LE, fRES(spplymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymdList The collection of spplymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_InScope(Collection<String> spplymdList) {
        doSetSpplymd_InScope(spplymdList);
    }

    protected void doSetSpplymd_InScope(Collection<String> spplymdList) {
        regINS(CK_INS, cTL(spplymdList), xgetCValueSpplymd(), "SPPLYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymdList The collection of spplymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_NotInScope(Collection<String> spplymdList) {
        doSetSpplymd_NotInScope(spplymdList);
    }

    protected void doSetSpplymd_NotInScope(Collection<String> spplymdList) {
        regINS(CK_NINS, cTL(spplymdList), xgetCValueSpplymd(), "SPPLYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)} <br>
     * <pre>e.g. setSpplymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spplymd The value of spplymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpplymd_LikeSearch(String spplymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spplymd), xgetCValueSpplymd(), "SPPLYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpplymd_NotLikeSearch(String spplymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spplymd), xgetCValueSpplymd(), "SPPLYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPPLYMD: {varchar(8)}
     * @param spplymd The value of spplymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpplymd_PrefixSearch(String spplymd) {
        setSpplymd_LikeSearch(spplymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNull() { regSpplymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNullOrEmpty() { regSpplymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPPLYMD: {varchar(8)}
     */
    public void setSpplymd_IsNotNull() { regSpplymd(CK_ISNN, DOBJ); }

    protected void regSpplymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpplymd(), "SPPLYMD"); }
    protected abstract ConditionValue xgetCValueSpplymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_Equal(String slptyp) {
        doSetSlptyp_Equal(fRES(slptyp));
    }

    protected void doSetSlptyp_Equal(String slptyp) {
        regSlptyp(CK_EQ, slptyp);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotEqual(String slptyp) {
        doSetSlptyp_NotEqual(fRES(slptyp));
    }

    protected void doSetSlptyp_NotEqual(String slptyp) {
        regSlptyp(CK_NES, slptyp);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterThan(String slptyp) {
        regSlptyp(CK_GT, fRES(slptyp));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessThan(String slptyp) {
        regSlptyp(CK_LT, fRES(slptyp));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_GreaterEqual(String slptyp) {
        regSlptyp(CK_GE, fRES(slptyp));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_LessEqual(String slptyp) {
        regSlptyp(CK_LE, fRES(slptyp));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptypList The collection of slptyp as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_InScope(Collection<String> slptypList) {
        doSetSlptyp_InScope(slptypList);
    }

    protected void doSetSlptyp_InScope(Collection<String> slptypList) {
        regINS(CK_INS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptypList The collection of slptyp as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_NotInScope(Collection<String> slptypList) {
        doSetSlptyp_NotInScope(slptypList);
    }

    protected void doSetSlptyp_NotInScope(Collection<String> slptypList) {
        regINS(CK_NINS, cTL(slptypList), xgetCValueSlptyp(), "SLPTYP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSlptyp_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slptyp The value of slptyp as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlptyp_LikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlptyp_NotLikeSearch(String slptyp, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slptyp), xgetCValueSlptyp(), "SLPTYP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPTYP: {NotNull, varchar(30)}
     * @param slptyp The value of slptyp as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlptyp_PrefixSearch(String slptyp) {
        setSlptyp_LikeSearch(slptyp, xcLSOPPre());
    }

    protected void regSlptyp(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlptyp(), "SLPTYP"); }
    protected abstract ConditionValue xgetCValueSlptyp();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_Equal(Long seqno) {
        doSetSeqno_Equal(seqno);
    }

    protected void doSetSeqno_Equal(Long seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(Long seqno) {
        doSetSeqno_NotEqual(seqno);
    }

    protected void doSetSeqno_NotEqual(Long seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(Long seqno) {
        regSeqno(CK_GT, seqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(Long seqno) {
        regSeqno(CK_LT, seqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(Long seqno) {
        regSeqno(CK_GE, seqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(Long seqno) {
        regSeqno(CK_LE, seqno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param minNumber The min number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqno(), "SEQNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<Long> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<Long> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {bigint(19)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<Long> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<Long> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     */
    public void setSeqno_IsNull() { regSeqno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQNO: {bigint(19)}
     */
    public void setSeqno_IsNotNull() { regSeqno(CK_ISNN, DOBJ); }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_Equal(String otorgcd) {
        doSetOtorgcd_Equal(fRES(otorgcd));
    }

    protected void doSetOtorgcd_Equal(String otorgcd) {
        regOtorgcd(CK_EQ, otorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotEqual(String otorgcd) {
        doSetOtorgcd_NotEqual(fRES(otorgcd));
    }

    protected void doSetOtorgcd_NotEqual(String otorgcd) {
        regOtorgcd(CK_NES, otorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterThan(String otorgcd) {
        regOtorgcd(CK_GT, fRES(otorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessThan(String otorgcd) {
        regOtorgcd(CK_LT, fRES(otorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_GreaterEqual(String otorgcd) {
        regOtorgcd(CK_GE, fRES(otorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_LessEqual(String otorgcd) {
        regOtorgcd(CK_LE, fRES(otorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcdList The collection of otorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_InScope(Collection<String> otorgcdList) {
        doSetOtorgcd_InScope(otorgcdList);
    }

    protected void doSetOtorgcd_InScope(Collection<String> otorgcdList) {
        regINS(CK_INS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcdList The collection of otorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_NotInScope(Collection<String> otorgcdList) {
        doSetOtorgcd_NotInScope(otorgcdList);
    }

    protected void doSetOtorgcd_NotInScope(Collection<String> otorgcdList) {
        regINS(CK_NINS, cTL(otorgcdList), xgetCValueOtorgcd(), "OTORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(30)} <br>
     * <pre>e.g. setOtorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otorgcd The value of otorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtorgcd_LikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtorgcd_NotLikeSearch(String otorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otorgcd), xgetCValueOtorgcd(), "OTORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTORGCD: {varchar(30)}
     * @param otorgcd The value of otorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtorgcd_PrefixSearch(String otorgcd) {
        setOtorgcd_LikeSearch(otorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     */
    public void setOtorgcd_IsNull() { regOtorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     */
    public void setOtorgcd_IsNullOrEmpty() { regOtorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTORGCD: {varchar(30)}
     */
    public void setOtorgcd_IsNotNull() { regOtorgcd(CK_ISNN, DOBJ); }

    protected void regOtorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtorgcd(), "OTORGCD"); }
    protected abstract ConditionValue xgetCValueOtorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_Equal(String ordorgcd) {
        doSetOrdorgcd_Equal(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_Equal(String ordorgcd) {
        regOrdorgcd(CK_EQ, ordorgcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotEqual(String ordorgcd) {
        doSetOrdorgcd_NotEqual(fRES(ordorgcd));
    }

    protected void doSetOrdorgcd_NotEqual(String ordorgcd) {
        regOrdorgcd(CK_NES, ordorgcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterThan(String ordorgcd) {
        regOrdorgcd(CK_GT, fRES(ordorgcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessThan(String ordorgcd) {
        regOrdorgcd(CK_LT, fRES(ordorgcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_GreaterEqual(String ordorgcd) {
        regOrdorgcd(CK_GE, fRES(ordorgcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_LessEqual(String ordorgcd) {
        regOrdorgcd(CK_LE, fRES(ordorgcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcdList The collection of ordorgcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_InScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_InScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_InScope(Collection<String> ordorgcdList) {
        regINS(CK_INS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcdList The collection of ordorgcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        doSetOrdorgcd_NotInScope(ordorgcdList);
    }

    protected void doSetOrdorgcd_NotInScope(Collection<String> ordorgcdList) {
        regINS(CK_NINS, cTL(ordorgcdList), xgetCValueOrdorgcd(), "ORDORGCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(30)} <br>
     * <pre>e.g. setOrdorgcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ordorgcd The value of ordorgcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrdorgcd_LikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrdorgcd_NotLikeSearch(String ordorgcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ordorgcd), xgetCValueOrdorgcd(), "ORDORGCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDORGCD: {varchar(30)}
     * @param ordorgcd The value of ordorgcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrdorgcd_PrefixSearch(String ordorgcd) {
        setOrdorgcd_LikeSearch(ordorgcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     */
    public void setOrdorgcd_IsNull() { regOrdorgcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     */
    public void setOrdorgcd_IsNullOrEmpty() { regOrdorgcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDORGCD: {varchar(30)}
     */
    public void setOrdorgcd_IsNotNull() { regOrdorgcd(CK_ISNN, DOBJ); }

    protected void regOrdorgcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrdorgcd(), "ORDORGCD"); }
    protected abstract ConditionValue xgetCValueOrdorgcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_Equal(String rlybscd) {
        doSetRlybscd_Equal(fRES(rlybscd));
    }

    protected void doSetRlybscd_Equal(String rlybscd) {
        regRlybscd(CK_EQ, rlybscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotEqual(String rlybscd) {
        doSetRlybscd_NotEqual(fRES(rlybscd));
    }

    protected void doSetRlybscd_NotEqual(String rlybscd) {
        regRlybscd(CK_NES, rlybscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterThan(String rlybscd) {
        regRlybscd(CK_GT, fRES(rlybscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessThan(String rlybscd) {
        regRlybscd(CK_LT, fRES(rlybscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_GreaterEqual(String rlybscd) {
        regRlybscd(CK_GE, fRES(rlybscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_LessEqual(String rlybscd) {
        regRlybscd(CK_LE, fRES(rlybscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscdList The collection of rlybscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_InScope(Collection<String> rlybscdList) {
        doSetRlybscd_InScope(rlybscdList);
    }

    protected void doSetRlybscd_InScope(Collection<String> rlybscdList) {
        regINS(CK_INS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscdList The collection of rlybscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_NotInScope(Collection<String> rlybscdList) {
        doSetRlybscd_NotInScope(rlybscdList);
    }

    protected void doSetRlybscd_NotInScope(Collection<String> rlybscdList) {
        regINS(CK_NINS, cTL(rlybscdList), xgetCValueRlybscd(), "RLYBSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)} <br>
     * <pre>e.g. setRlybscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rlybscd The value of rlybscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRlybscd_LikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRlybscd_NotLikeSearch(String rlybscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rlybscd), xgetCValueRlybscd(), "RLYBSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RLYBSCD: {varchar(30)}
     * @param rlybscd The value of rlybscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRlybscd_PrefixSearch(String rlybscd) {
        setRlybscd_LikeSearch(rlybscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNull() { regRlybscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNullOrEmpty() { regRlybscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RLYBSCD: {varchar(30)}
     */
    public void setRlybscd_IsNotNull() { regRlybscd(CK_ISNN, DOBJ); }

    protected void regRlybscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRlybscd(), "RLYBSCD"); }
    protected abstract ConditionValue xgetCValueRlybscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_Equal(String dlvrnk) {
        doSetDlvrnk_Equal(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_Equal(String dlvrnk) {
        regDlvrnk(CK_EQ, dlvrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotEqual(String dlvrnk) {
        doSetDlvrnk_NotEqual(fRES(dlvrnk));
    }

    protected void doSetDlvrnk_NotEqual(String dlvrnk) {
        regDlvrnk(CK_NES, dlvrnk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterThan(String dlvrnk) {
        regDlvrnk(CK_GT, fRES(dlvrnk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessThan(String dlvrnk) {
        regDlvrnk(CK_LT, fRES(dlvrnk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_GreaterEqual(String dlvrnk) {
        regDlvrnk(CK_GE, fRES(dlvrnk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_LessEqual(String dlvrnk) {
        regDlvrnk(CK_LE, fRES(dlvrnk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnkList The collection of dlvrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_InScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_InScope(dlvrnkList);
    }

    protected void doSetDlvrnk_InScope(Collection<String> dlvrnkList) {
        regINS(CK_INS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnkList The collection of dlvrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        doSetDlvrnk_NotInScope(dlvrnkList);
    }

    protected void doSetDlvrnk_NotInScope(Collection<String> dlvrnkList) {
        regINS(CK_NINS, cTL(dlvrnkList), xgetCValueDlvrnk(), "DLVRNK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)} <br>
     * <pre>e.g. setDlvrnk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvrnk The value of dlvrnk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvrnk_LikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvrnk_NotLikeSearch(String dlvrnk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvrnk), xgetCValueDlvrnk(), "DLVRNK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVRNK: {varchar(30)}
     * @param dlvrnk The value of dlvrnk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvrnk_PrefixSearch(String dlvrnk) {
        setDlvrnk_LikeSearch(dlvrnk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNull() { regDlvrnk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNullOrEmpty() { regDlvrnk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVRNK: {varchar(30)}
     */
    public void setDlvrnk_IsNotNull() { regDlvrnk(CK_ISNN, DOBJ); }

    protected void regDlvrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvrnk(), "DLVRNK"); }
    protected abstract ConditionValue xgetCValueDlvrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_Equal(String lmpdlvno) {
        doSetLmpdlvno_Equal(fRES(lmpdlvno));
    }

    protected void doSetLmpdlvno_Equal(String lmpdlvno) {
        regLmpdlvno(CK_EQ, lmpdlvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_NotEqual(String lmpdlvno) {
        doSetLmpdlvno_NotEqual(fRES(lmpdlvno));
    }

    protected void doSetLmpdlvno_NotEqual(String lmpdlvno) {
        regLmpdlvno(CK_NES, lmpdlvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_GreaterThan(String lmpdlvno) {
        regLmpdlvno(CK_GT, fRES(lmpdlvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_LessThan(String lmpdlvno) {
        regLmpdlvno(CK_LT, fRES(lmpdlvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_GreaterEqual(String lmpdlvno) {
        regLmpdlvno(CK_GE, fRES(lmpdlvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_LessEqual(String lmpdlvno) {
        regLmpdlvno(CK_LE, fRES(lmpdlvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvnoList The collection of lmpdlvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_InScope(Collection<String> lmpdlvnoList) {
        doSetLmpdlvno_InScope(lmpdlvnoList);
    }

    protected void doSetLmpdlvno_InScope(Collection<String> lmpdlvnoList) {
        regINS(CK_INS, cTL(lmpdlvnoList), xgetCValueLmpdlvno(), "LMPDLVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvnoList The collection of lmpdlvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_NotInScope(Collection<String> lmpdlvnoList) {
        doSetLmpdlvno_NotInScope(lmpdlvnoList);
    }

    protected void doSetLmpdlvno_NotInScope(Collection<String> lmpdlvnoList) {
        regINS(CK_NINS, cTL(lmpdlvnoList), xgetCValueLmpdlvno(), "LMPDLVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(30)} <br>
     * <pre>e.g. setLmpdlvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lmpdlvno The value of lmpdlvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLmpdlvno_LikeSearch(String lmpdlvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lmpdlvno), xgetCValueLmpdlvno(), "LMPDLVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLmpdlvno_NotLikeSearch(String lmpdlvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lmpdlvno), xgetCValueLmpdlvno(), "LMPDLVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     * @param lmpdlvno The value of lmpdlvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLmpdlvno_PrefixSearch(String lmpdlvno) {
        setLmpdlvno_LikeSearch(lmpdlvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     */
    public void setLmpdlvno_IsNull() { regLmpdlvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     */
    public void setLmpdlvno_IsNullOrEmpty() { regLmpdlvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LMPDLVNO: {varchar(30)}
     */
    public void setLmpdlvno_IsNotNull() { regLmpdlvno(CK_ISNN, DOBJ); }

    protected void regLmpdlvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLmpdlvno(), "LMPDLVNO"); }
    protected abstract ConditionValue xgetCValueLmpdlvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_Equal(String divmtd) {
        doSetDivmtd_Equal(fRES(divmtd));
    }

    protected void doSetDivmtd_Equal(String divmtd) {
        regDivmtd(CK_EQ, divmtd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotEqual(String divmtd) {
        doSetDivmtd_NotEqual(fRES(divmtd));
    }

    protected void doSetDivmtd_NotEqual(String divmtd) {
        regDivmtd(CK_NES, divmtd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterThan(String divmtd) {
        regDivmtd(CK_GT, fRES(divmtd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessThan(String divmtd) {
        regDivmtd(CK_LT, fRES(divmtd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_GreaterEqual(String divmtd) {
        regDivmtd(CK_GE, fRES(divmtd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_LessEqual(String divmtd) {
        regDivmtd(CK_LE, fRES(divmtd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtdList The collection of divmtd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_InScope(Collection<String> divmtdList) {
        doSetDivmtd_InScope(divmtdList);
    }

    protected void doSetDivmtd_InScope(Collection<String> divmtdList) {
        regINS(CK_INS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtdList The collection of divmtd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_NotInScope(Collection<String> divmtdList) {
        doSetDivmtd_NotInScope(divmtdList);
    }

    protected void doSetDivmtd_NotInScope(Collection<String> divmtdList) {
        regINS(CK_NINS, cTL(divmtdList), xgetCValueDivmtd(), "DIVMTD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {char(1)} <br>
     * <pre>e.g. setDivmtd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param divmtd The value of divmtd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDivmtd_LikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDivmtd_NotLikeSearch(String divmtd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(divmtd), xgetCValueDivmtd(), "DIVMTD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIVMTD: {char(1)}
     * @param divmtd The value of divmtd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDivmtd_PrefixSearch(String divmtd) {
        setDivmtd_LikeSearch(divmtd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     */
    public void setDivmtd_IsNull() { regDivmtd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIVMTD: {char(1)}
     */
    public void setDivmtd_IsNotNull() { regDivmtd(CK_ISNN, DOBJ); }

    protected void regDivmtd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDivmtd(), "DIVMTD"); }
    protected abstract ConditionValue xgetCValueDivmtd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_Equal(String slediv) {
        doSetSlediv_Equal(fRES(slediv));
    }

    protected void doSetSlediv_Equal(String slediv) {
        regSlediv(CK_EQ, slediv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotEqual(String slediv) {
        doSetSlediv_NotEqual(fRES(slediv));
    }

    protected void doSetSlediv_NotEqual(String slediv) {
        regSlediv(CK_NES, slediv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterThan(String slediv) {
        regSlediv(CK_GT, fRES(slediv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessThan(String slediv) {
        regSlediv(CK_LT, fRES(slediv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_GreaterEqual(String slediv) {
        regSlediv(CK_GE, fRES(slediv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_LessEqual(String slediv) {
        regSlediv(CK_LE, fRES(slediv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param sledivList The collection of slediv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_InScope(Collection<String> sledivList) {
        doSetSlediv_InScope(sledivList);
    }

    protected void doSetSlediv_InScope(Collection<String> sledivList) {
        regINS(CK_INS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param sledivList The collection of slediv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_NotInScope(Collection<String> sledivList) {
        doSetSlediv_NotInScope(sledivList);
    }

    protected void doSetSlediv_NotInScope(Collection<String> sledivList) {
        regINS(CK_NINS, cTL(sledivList), xgetCValueSlediv(), "SLEDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)} <br>
     * <pre>e.g. setSlediv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slediv The value of slediv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlediv_LikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlediv_NotLikeSearch(String slediv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slediv), xgetCValueSlediv(), "SLEDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLEDIV: {varchar(30)}
     * @param slediv The value of slediv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlediv_PrefixSearch(String slediv) {
        setSlediv_LikeSearch(slediv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNull() { regSlediv(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNullOrEmpty() { regSlediv(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLEDIV: {varchar(30)}
     */
    public void setSlediv_IsNotNull() { regSlediv(CK_ISNN, DOBJ); }

    protected void regSlediv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlediv(), "SLEDIV"); }
    protected abstract ConditionValue xgetCValueSlediv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_Equal(String hvrtrsn) {
        doSetHvrtrsn_Equal(fRES(hvrtrsn));
    }

    protected void doSetHvrtrsn_Equal(String hvrtrsn) {
        regHvrtrsn(CK_EQ, hvrtrsn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_NotEqual(String hvrtrsn) {
        doSetHvrtrsn_NotEqual(fRES(hvrtrsn));
    }

    protected void doSetHvrtrsn_NotEqual(String hvrtrsn) {
        regHvrtrsn(CK_NES, hvrtrsn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_GreaterThan(String hvrtrsn) {
        regHvrtrsn(CK_GT, fRES(hvrtrsn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_LessThan(String hvrtrsn) {
        regHvrtrsn(CK_LT, fRES(hvrtrsn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_GreaterEqual(String hvrtrsn) {
        regHvrtrsn(CK_GE, fRES(hvrtrsn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_LessEqual(String hvrtrsn) {
        regHvrtrsn(CK_LE, fRES(hvrtrsn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsnList The collection of hvrtrsn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_InScope(Collection<String> hvrtrsnList) {
        doSetHvrtrsn_InScope(hvrtrsnList);
    }

    protected void doSetHvrtrsn_InScope(Collection<String> hvrtrsnList) {
        regINS(CK_INS, cTL(hvrtrsnList), xgetCValueHvrtrsn(), "HVRTRSN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsnList The collection of hvrtrsn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_NotInScope(Collection<String> hvrtrsnList) {
        doSetHvrtrsn_NotInScope(hvrtrsnList);
    }

    protected void doSetHvrtrsn_NotInScope(Collection<String> hvrtrsnList) {
        regINS(CK_NINS, cTL(hvrtrsnList), xgetCValueHvrtrsn(), "HVRTRSN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(30)} <br>
     * <pre>e.g. setHvrtrsn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hvrtrsn The value of hvrtrsn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHvrtrsn_LikeSearch(String hvrtrsn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hvrtrsn), xgetCValueHvrtrsn(), "HVRTRSN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHvrtrsn_NotLikeSearch(String hvrtrsn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hvrtrsn), xgetCValueHvrtrsn(), "HVRTRSN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTRSN: {varchar(30)}
     * @param hvrtrsn The value of hvrtrsn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtrsn_PrefixSearch(String hvrtrsn) {
        setHvrtrsn_LikeSearch(hvrtrsn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     */
    public void setHvrtrsn_IsNull() { regHvrtrsn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     */
    public void setHvrtrsn_IsNullOrEmpty() { regHvrtrsn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HVRTRSN: {varchar(30)}
     */
    public void setHvrtrsn_IsNotNull() { regHvrtrsn(CK_ISNN, DOBJ); }

    protected void regHvrtrsn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHvrtrsn(), "HVRTRSN"); }
    protected abstract ConditionValue xgetCValueHvrtrsn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_Equal(String hvrtinotymd) {
        doSetHvrtinotymd_Equal(fRES(hvrtinotymd));
    }

    protected void doSetHvrtinotymd_Equal(String hvrtinotymd) {
        regHvrtinotymd(CK_EQ, hvrtinotymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_NotEqual(String hvrtinotymd) {
        doSetHvrtinotymd_NotEqual(fRES(hvrtinotymd));
    }

    protected void doSetHvrtinotymd_NotEqual(String hvrtinotymd) {
        regHvrtinotymd(CK_NES, hvrtinotymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_GreaterThan(String hvrtinotymd) {
        regHvrtinotymd(CK_GT, fRES(hvrtinotymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_LessThan(String hvrtinotymd) {
        regHvrtinotymd(CK_LT, fRES(hvrtinotymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_GreaterEqual(String hvrtinotymd) {
        regHvrtinotymd(CK_GE, fRES(hvrtinotymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_LessEqual(String hvrtinotymd) {
        regHvrtinotymd(CK_LE, fRES(hvrtinotymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymdList The collection of hvrtinotymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_InScope(Collection<String> hvrtinotymdList) {
        doSetHvrtinotymd_InScope(hvrtinotymdList);
    }

    protected void doSetHvrtinotymd_InScope(Collection<String> hvrtinotymdList) {
        regINS(CK_INS, cTL(hvrtinotymdList), xgetCValueHvrtinotymd(), "HVRTINOTYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymdList The collection of hvrtinotymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_NotInScope(Collection<String> hvrtinotymdList) {
        doSetHvrtinotymd_NotInScope(hvrtinotymdList);
    }

    protected void doSetHvrtinotymd_NotInScope(Collection<String> hvrtinotymdList) {
        regINS(CK_NINS, cTL(hvrtinotymdList), xgetCValueHvrtinotymd(), "HVRTINOTYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTINOTYMD: {varchar(30)} <br>
     * <pre>e.g. setHvrtinotymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hvrtinotymd The value of hvrtinotymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHvrtinotymd_LikeSearch(String hvrtinotymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hvrtinotymd), xgetCValueHvrtinotymd(), "HVRTINOTYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHvrtinotymd_NotLikeSearch(String hvrtinotymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hvrtinotymd), xgetCValueHvrtinotymd(), "HVRTINOTYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     * @param hvrtinotymd The value of hvrtinotymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHvrtinotymd_PrefixSearch(String hvrtinotymd) {
        setHvrtinotymd_LikeSearch(hvrtinotymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     */
    public void setHvrtinotymd_IsNull() { regHvrtinotymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     */
    public void setHvrtinotymd_IsNullOrEmpty() { regHvrtinotymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HVRTINOTYMD: {varchar(30)}
     */
    public void setHvrtinotymd_IsNotNull() { regHvrtinotymd(CK_ISNN, DOBJ); }

    protected void regHvrtinotymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHvrtinotymd(), "HVRTINOTYMD"); }
    protected abstract ConditionValue xgetCValueHvrtinotymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_Equal(String cngprtslpno) {
        doSetCngprtslpno_Equal(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_Equal(String cngprtslpno) {
        regCngprtslpno(CK_EQ, cngprtslpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotEqual(String cngprtslpno) {
        doSetCngprtslpno_NotEqual(fRES(cngprtslpno));
    }

    protected void doSetCngprtslpno_NotEqual(String cngprtslpno) {
        regCngprtslpno(CK_NES, cngprtslpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterThan(String cngprtslpno) {
        regCngprtslpno(CK_GT, fRES(cngprtslpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessThan(String cngprtslpno) {
        regCngprtslpno(CK_LT, fRES(cngprtslpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_GreaterEqual(String cngprtslpno) {
        regCngprtslpno(CK_GE, fRES(cngprtslpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_LessEqual(String cngprtslpno) {
        regCngprtslpno(CK_LE, fRES(cngprtslpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpnoList The collection of cngprtslpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_InScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_InScope(Collection<String> cngprtslpnoList) {
        regINS(CK_INS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpnoList The collection of cngprtslpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        doSetCngprtslpno_NotInScope(cngprtslpnoList);
    }

    protected void doSetCngprtslpno_NotInScope(Collection<String> cngprtslpnoList) {
        regINS(CK_NINS, cTL(cngprtslpnoList), xgetCValueCngprtslpno(), "CNGPRTSLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)} <br>
     * <pre>e.g. setCngprtslpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cngprtslpno The value of cngprtslpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCngprtslpno_LikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCngprtslpno_NotLikeSearch(String cngprtslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cngprtslpno), xgetCValueCngprtslpno(), "CNGPRTSLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     * @param cngprtslpno The value of cngprtslpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCngprtslpno_PrefixSearch(String cngprtslpno) {
        setCngprtslpno_LikeSearch(cngprtslpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNull() { regCngprtslpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNullOrEmpty() { regCngprtslpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CNGPRTSLPNO: {varchar(30)}
     */
    public void setCngprtslpno_IsNotNull() { regCngprtslpno(CK_ISNN, DOBJ); }

    protected void regCngprtslpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCngprtslpno(), "CNGPRTSLPNO"); }
    protected abstract ConditionValue xgetCValueCngprtslpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_Equal(String trnsctndiv) {
        doSetTrnsctndiv_Equal(fRES(trnsctndiv));
    }

    protected void doSetTrnsctndiv_Equal(String trnsctndiv) {
        regTrnsctndiv(CK_EQ, trnsctndiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_NotEqual(String trnsctndiv) {
        doSetTrnsctndiv_NotEqual(fRES(trnsctndiv));
    }

    protected void doSetTrnsctndiv_NotEqual(String trnsctndiv) {
        regTrnsctndiv(CK_NES, trnsctndiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_GreaterThan(String trnsctndiv) {
        regTrnsctndiv(CK_GT, fRES(trnsctndiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_LessThan(String trnsctndiv) {
        regTrnsctndiv(CK_LT, fRES(trnsctndiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_GreaterEqual(String trnsctndiv) {
        regTrnsctndiv(CK_GE, fRES(trnsctndiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_LessEqual(String trnsctndiv) {
        regTrnsctndiv(CK_LE, fRES(trnsctndiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndivList The collection of trnsctndiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_InScope(Collection<String> trnsctndivList) {
        doSetTrnsctndiv_InScope(trnsctndivList);
    }

    protected void doSetTrnsctndiv_InScope(Collection<String> trnsctndivList) {
        regINS(CK_INS, cTL(trnsctndivList), xgetCValueTrnsctndiv(), "TRNSCTNDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndivList The collection of trnsctndiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_NotInScope(Collection<String> trnsctndivList) {
        doSetTrnsctndiv_NotInScope(trnsctndivList);
    }

    protected void doSetTrnsctndiv_NotInScope(Collection<String> trnsctndivList) {
        regINS(CK_NINS, cTL(trnsctndivList), xgetCValueTrnsctndiv(), "TRNSCTNDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {char(1)} <br>
     * <pre>e.g. setTrnsctndiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trnsctndiv The value of trnsctndiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrnsctndiv_LikeSearch(String trnsctndiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trnsctndiv), xgetCValueTrnsctndiv(), "TRNSCTNDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrnsctndiv_NotLikeSearch(String trnsctndiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trnsctndiv), xgetCValueTrnsctndiv(), "TRNSCTNDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     * @param trnsctndiv The value of trnsctndiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrnsctndiv_PrefixSearch(String trnsctndiv) {
        setTrnsctndiv_LikeSearch(trnsctndiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     */
    public void setTrnsctndiv_IsNull() { regTrnsctndiv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRNSCTNDIV: {char(1)}
     */
    public void setTrnsctndiv_IsNotNull() { regTrnsctndiv(CK_ISNN, DOBJ); }

    protected void regTrnsctndiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrnsctndiv(), "TRNSCTNDIV"); }
    protected abstract ConditionValue xgetCValueTrnsctndiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_Equal(String eosordaftflg) {
        doSetEosordaftflg_Equal(fRES(eosordaftflg));
    }

    protected void doSetEosordaftflg_Equal(String eosordaftflg) {
        regEosordaftflg(CK_EQ, eosordaftflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_NotEqual(String eosordaftflg) {
        doSetEosordaftflg_NotEqual(fRES(eosordaftflg));
    }

    protected void doSetEosordaftflg_NotEqual(String eosordaftflg) {
        regEosordaftflg(CK_NES, eosordaftflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_GreaterThan(String eosordaftflg) {
        regEosordaftflg(CK_GT, fRES(eosordaftflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_LessThan(String eosordaftflg) {
        regEosordaftflg(CK_LT, fRES(eosordaftflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_GreaterEqual(String eosordaftflg) {
        regEosordaftflg(CK_GE, fRES(eosordaftflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_LessEqual(String eosordaftflg) {
        regEosordaftflg(CK_LE, fRES(eosordaftflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflgList The collection of eosordaftflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_InScope(Collection<String> eosordaftflgList) {
        doSetEosordaftflg_InScope(eosordaftflgList);
    }

    protected void doSetEosordaftflg_InScope(Collection<String> eosordaftflgList) {
        regINS(CK_INS, cTL(eosordaftflgList), xgetCValueEosordaftflg(), "EOSORDAFTFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflgList The collection of eosordaftflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_NotInScope(Collection<String> eosordaftflgList) {
        doSetEosordaftflg_NotInScope(eosordaftflgList);
    }

    protected void doSetEosordaftflg_NotInScope(Collection<String> eosordaftflgList) {
        regINS(CK_NINS, cTL(eosordaftflgList), xgetCValueEosordaftflg(), "EOSORDAFTFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {char(1)} <br>
     * <pre>e.g. setEosordaftflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosordaftflg The value of eosordaftflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosordaftflg_LikeSearch(String eosordaftflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosordaftflg), xgetCValueEosordaftflg(), "EOSORDAFTFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosordaftflg_NotLikeSearch(String eosordaftflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosordaftflg), xgetCValueEosordaftflg(), "EOSORDAFTFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     * @param eosordaftflg The value of eosordaftflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosordaftflg_PrefixSearch(String eosordaftflg) {
        setEosordaftflg_LikeSearch(eosordaftflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     */
    public void setEosordaftflg_IsNull() { regEosordaftflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOSORDAFTFLG: {char(1)}
     */
    public void setEosordaftflg_IsNotNull() { regEosordaftflg(CK_ISNN, DOBJ); }

    protected void regEosordaftflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosordaftflg(), "EOSORDAFTFLG"); }
    protected abstract ConditionValue xgetCValueEosordaftflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_Equal(String eosslpno) {
        doSetEosslpno_Equal(fRES(eosslpno));
    }

    protected void doSetEosslpno_Equal(String eosslpno) {
        regEosslpno(CK_EQ, eosslpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_NotEqual(String eosslpno) {
        doSetEosslpno_NotEqual(fRES(eosslpno));
    }

    protected void doSetEosslpno_NotEqual(String eosslpno) {
        regEosslpno(CK_NES, eosslpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_GreaterThan(String eosslpno) {
        regEosslpno(CK_GT, fRES(eosslpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_LessThan(String eosslpno) {
        regEosslpno(CK_LT, fRES(eosslpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_GreaterEqual(String eosslpno) {
        regEosslpno(CK_GE, fRES(eosslpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_LessEqual(String eosslpno) {
        regEosslpno(CK_LE, fRES(eosslpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpnoList The collection of eosslpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_InScope(Collection<String> eosslpnoList) {
        doSetEosslpno_InScope(eosslpnoList);
    }

    protected void doSetEosslpno_InScope(Collection<String> eosslpnoList) {
        regINS(CK_INS, cTL(eosslpnoList), xgetCValueEosslpno(), "EOSSLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpnoList The collection of eosslpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_NotInScope(Collection<String> eosslpnoList) {
        doSetEosslpno_NotInScope(eosslpnoList);
    }

    protected void doSetEosslpno_NotInScope(Collection<String> eosslpnoList) {
        regINS(CK_NINS, cTL(eosslpnoList), xgetCValueEosslpno(), "EOSSLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(30)} <br>
     * <pre>e.g. setEosslpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param eosslpno The value of eosslpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEosslpno_LikeSearch(String eosslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(eosslpno), xgetCValueEosslpno(), "EOSSLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEosslpno_NotLikeSearch(String eosslpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(eosslpno), xgetCValueEosslpno(), "EOSSLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     * @param eosslpno The value of eosslpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEosslpno_PrefixSearch(String eosslpno) {
        setEosslpno_LikeSearch(eosslpno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     */
    public void setEosslpno_IsNull() { regEosslpno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     */
    public void setEosslpno_IsNullOrEmpty() { regEosslpno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EOSSLPNO: {varchar(30)}
     */
    public void setEosslpno_IsNotNull() { regEosslpno(CK_ISNN, DOBJ); }

    protected void regEosslpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEosslpno(), "EOSSLPNO"); }
    protected abstract ConditionValue xgetCValueEosslpno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_Equal(String hdrdbxdiv) {
        doSetHdrdbxdiv_Equal(fRES(hdrdbxdiv));
    }

    protected void doSetHdrdbxdiv_Equal(String hdrdbxdiv) {
        regHdrdbxdiv(CK_EQ, hdrdbxdiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_NotEqual(String hdrdbxdiv) {
        doSetHdrdbxdiv_NotEqual(fRES(hdrdbxdiv));
    }

    protected void doSetHdrdbxdiv_NotEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_NES, hdrdbxdiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_GreaterThan(String hdrdbxdiv) {
        regHdrdbxdiv(CK_GT, fRES(hdrdbxdiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_LessThan(String hdrdbxdiv) {
        regHdrdbxdiv(CK_LT, fRES(hdrdbxdiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_GreaterEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_GE, fRES(hdrdbxdiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_LessEqual(String hdrdbxdiv) {
        regHdrdbxdiv(CK_LE, fRES(hdrdbxdiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdivList The collection of hdrdbxdiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_InScope(Collection<String> hdrdbxdivList) {
        doSetHdrdbxdiv_InScope(hdrdbxdivList);
    }

    protected void doSetHdrdbxdiv_InScope(Collection<String> hdrdbxdivList) {
        regINS(CK_INS, cTL(hdrdbxdivList), xgetCValueHdrdbxdiv(), "HDRDBXDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdivList The collection of hdrdbxdiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_NotInScope(Collection<String> hdrdbxdivList) {
        doSetHdrdbxdiv_NotInScope(hdrdbxdivList);
    }

    protected void doSetHdrdbxdiv_NotInScope(Collection<String> hdrdbxdivList) {
        regINS(CK_NINS, cTL(hdrdbxdivList), xgetCValueHdrdbxdiv(), "HDRDBXDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {char(1)} <br>
     * <pre>e.g. setHdrdbxdiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdbxdiv The value of hdrdbxdiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdbxdiv_LikeSearch(String hdrdbxdiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdbxdiv), xgetCValueHdrdbxdiv(), "HDRDBXDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdbxdiv_NotLikeSearch(String hdrdbxdiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdbxdiv), xgetCValueHdrdbxdiv(), "HDRDBXDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBXDIV: {char(1)}
     * @param hdrdbxdiv The value of hdrdbxdiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdbxdiv_PrefixSearch(String hdrdbxdiv) {
        setHdrdbxdiv_LikeSearch(hdrdbxdiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     */
    public void setHdrdbxdiv_IsNull() { regHdrdbxdiv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRDBXDIV: {char(1)}
     */
    public void setHdrdbxdiv_IsNotNull() { regHdrdbxdiv(CK_ISNN, DOBJ); }

    protected void regHdrdbxdiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdbxdiv(), "HDRDBXDIV"); }
    protected abstract ConditionValue xgetCValueHdrdbxdiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_Equal(String inotrfsldiv) {
        doSetInotrfsldiv_Equal(fRES(inotrfsldiv));
    }

    protected void doSetInotrfsldiv_Equal(String inotrfsldiv) {
        regInotrfsldiv(CK_EQ, inotrfsldiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_NotEqual(String inotrfsldiv) {
        doSetInotrfsldiv_NotEqual(fRES(inotrfsldiv));
    }

    protected void doSetInotrfsldiv_NotEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_NES, inotrfsldiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_GreaterThan(String inotrfsldiv) {
        regInotrfsldiv(CK_GT, fRES(inotrfsldiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_LessThan(String inotrfsldiv) {
        regInotrfsldiv(CK_LT, fRES(inotrfsldiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_GreaterEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_GE, fRES(inotrfsldiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_LessEqual(String inotrfsldiv) {
        regInotrfsldiv(CK_LE, fRES(inotrfsldiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldivList The collection of inotrfsldiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_InScope(Collection<String> inotrfsldivList) {
        doSetInotrfsldiv_InScope(inotrfsldivList);
    }

    protected void doSetInotrfsldiv_InScope(Collection<String> inotrfsldivList) {
        regINS(CK_INS, cTL(inotrfsldivList), xgetCValueInotrfsldiv(), "INOTRFSLDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldivList The collection of inotrfsldiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_NotInScope(Collection<String> inotrfsldivList) {
        doSetInotrfsldiv_NotInScope(inotrfsldivList);
    }

    protected void doSetInotrfsldiv_NotInScope(Collection<String> inotrfsldivList) {
        regINS(CK_NINS, cTL(inotrfsldivList), xgetCValueInotrfsldiv(), "INOTRFSLDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {char(1)} <br>
     * <pre>e.g. setInotrfsldiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inotrfsldiv The value of inotrfsldiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInotrfsldiv_LikeSearch(String inotrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inotrfsldiv), xgetCValueInotrfsldiv(), "INOTRFSLDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInotrfsldiv_NotLikeSearch(String inotrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inotrfsldiv), xgetCValueInotrfsldiv(), "INOTRFSLDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     * @param inotrfsldiv The value of inotrfsldiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInotrfsldiv_PrefixSearch(String inotrfsldiv) {
        setInotrfsldiv_LikeSearch(inotrfsldiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     */
    public void setInotrfsldiv_IsNull() { regInotrfsldiv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INOTRFSLDIV: {char(1)}
     */
    public void setInotrfsldiv_IsNotNull() { regInotrfsldiv(CK_ISNN, DOBJ); }

    protected void regInotrfsldiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInotrfsldiv(), "INOTRFSLDIV"); }
    protected abstract ConditionValue xgetCValueInotrfsldiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_Equal(String bxmntrfsldiv) {
        doSetBxmntrfsldiv_Equal(fRES(bxmntrfsldiv));
    }

    protected void doSetBxmntrfsldiv_Equal(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_EQ, bxmntrfsldiv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_NotEqual(String bxmntrfsldiv) {
        doSetBxmntrfsldiv_NotEqual(fRES(bxmntrfsldiv));
    }

    protected void doSetBxmntrfsldiv_NotEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_NES, bxmntrfsldiv);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_GreaterThan(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_GT, fRES(bxmntrfsldiv));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_LessThan(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_LT, fRES(bxmntrfsldiv));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_GreaterEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_GE, fRES(bxmntrfsldiv));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_LessEqual(String bxmntrfsldiv) {
        regBxmntrfsldiv(CK_LE, fRES(bxmntrfsldiv));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldivList The collection of bxmntrfsldiv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_InScope(Collection<String> bxmntrfsldivList) {
        doSetBxmntrfsldiv_InScope(bxmntrfsldivList);
    }

    protected void doSetBxmntrfsldiv_InScope(Collection<String> bxmntrfsldivList) {
        regINS(CK_INS, cTL(bxmntrfsldivList), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldivList The collection of bxmntrfsldiv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_NotInScope(Collection<String> bxmntrfsldivList) {
        doSetBxmntrfsldiv_NotInScope(bxmntrfsldivList);
    }

    protected void doSetBxmntrfsldiv_NotInScope(Collection<String> bxmntrfsldivList) {
        regINS(CK_NINS, cTL(bxmntrfsldivList), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {char(1)} <br>
     * <pre>e.g. setBxmntrfsldiv_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bxmntrfsldiv The value of bxmntrfsldiv as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBxmntrfsldiv_LikeSearch(String bxmntrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bxmntrfsldiv), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBxmntrfsldiv_NotLikeSearch(String bxmntrfsldiv, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bxmntrfsldiv), xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     * @param bxmntrfsldiv The value of bxmntrfsldiv as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBxmntrfsldiv_PrefixSearch(String bxmntrfsldiv) {
        setBxmntrfsldiv_LikeSearch(bxmntrfsldiv, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     */
    public void setBxmntrfsldiv_IsNull() { regBxmntrfsldiv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BXMNTRFSLDIV: {char(1)}
     */
    public void setBxmntrfsldiv_IsNotNull() { regBxmntrfsldiv(CK_ISNN, DOBJ); }

    protected void regBxmntrfsldiv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBxmntrfsldiv(), "BXMNTRFSLDIV"); }
    protected abstract ConditionValue xgetCValueBxmntrfsldiv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_Equal(String slpmrgtmg) {
        doSetSlpmrgtmg_Equal(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_Equal(String slpmrgtmg) {
        regSlpmrgtmg(CK_EQ, slpmrgtmg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotEqual(String slpmrgtmg) {
        doSetSlpmrgtmg_NotEqual(fRES(slpmrgtmg));
    }

    protected void doSetSlpmrgtmg_NotEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_NES, slpmrgtmg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_GT, fRES(slpmrgtmg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessThan(String slpmrgtmg) {
        regSlpmrgtmg(CK_LT, fRES(slpmrgtmg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_GreaterEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_GE, fRES(slpmrgtmg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_LessEqual(String slpmrgtmg) {
        regSlpmrgtmg(CK_LE, fRES(slpmrgtmg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmgList The collection of slpmrgtmg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_InScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_InScope(Collection<String> slpmrgtmgList) {
        regINS(CK_INS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmgList The collection of slpmrgtmg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        doSetSlpmrgtmg_NotInScope(slpmrgtmgList);
    }

    protected void doSetSlpmrgtmg_NotInScope(Collection<String> slpmrgtmgList) {
        regINS(CK_NINS, cTL(slpmrgtmgList), xgetCValueSlpmrgtmg(), "SLPMRGTMG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)} <br>
     * <pre>e.g. setSlpmrgtmg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpmrgtmg The value of slpmrgtmg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpmrgtmg_LikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpmrgtmg_NotLikeSearch(String slpmrgtmg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpmrgtmg), xgetCValueSlpmrgtmg(), "SLPMRGTMG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     * @param slpmrgtmg The value of slpmrgtmg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpmrgtmg_PrefixSearch(String slpmrgtmg) {
        setSlpmrgtmg_LikeSearch(slpmrgtmg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNull() { regSlpmrgtmg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNullOrEmpty() { regSlpmrgtmg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPMRGTMG: {varchar(30)}
     */
    public void setSlpmrgtmg_IsNotNull() { regSlpmrgtmg(CK_ISNN, DOBJ); }

    protected void regSlpmrgtmg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpmrgtmg(), "SLPMRGTMG"); }
    protected abstract ConditionValue xgetCValueSlpmrgtmg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_Equal(String slpotymd) {
        doSetSlpotymd_Equal(fRES(slpotymd));
    }

    protected void doSetSlpotymd_Equal(String slpotymd) {
        regSlpotymd(CK_EQ, slpotymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_NotEqual(String slpotymd) {
        doSetSlpotymd_NotEqual(fRES(slpotymd));
    }

    protected void doSetSlpotymd_NotEqual(String slpotymd) {
        regSlpotymd(CK_NES, slpotymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_GreaterThan(String slpotymd) {
        regSlpotymd(CK_GT, fRES(slpotymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_LessThan(String slpotymd) {
        regSlpotymd(CK_LT, fRES(slpotymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_GreaterEqual(String slpotymd) {
        regSlpotymd(CK_GE, fRES(slpotymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_LessEqual(String slpotymd) {
        regSlpotymd(CK_LE, fRES(slpotymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymdList The collection of slpotymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_InScope(Collection<String> slpotymdList) {
        doSetSlpotymd_InScope(slpotymdList);
    }

    protected void doSetSlpotymd_InScope(Collection<String> slpotymdList) {
        regINS(CK_INS, cTL(slpotymdList), xgetCValueSlpotymd(), "SLPOTYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymdList The collection of slpotymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_NotInScope(Collection<String> slpotymdList) {
        doSetSlpotymd_NotInScope(slpotymdList);
    }

    protected void doSetSlpotymd_NotInScope(Collection<String> slpotymdList) {
        regINS(CK_NINS, cTL(slpotymdList), xgetCValueSlpotymd(), "SLPOTYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPOTYMD: {varchar(8)} <br>
     * <pre>e.g. setSlpotymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpotymd The value of slpotymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpotymd_LikeSearch(String slpotymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpotymd), xgetCValueSlpotymd(), "SLPOTYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpotymd_NotLikeSearch(String slpotymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpotymd), xgetCValueSlpotymd(), "SLPOTYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     * @param slpotymd The value of slpotymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpotymd_PrefixSearch(String slpotymd) {
        setSlpotymd_LikeSearch(slpotymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     */
    public void setSlpotymd_IsNull() { regSlpotymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     */
    public void setSlpotymd_IsNullOrEmpty() { regSlpotymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLPOTYMD: {varchar(8)}
     */
    public void setSlpotymd_IsNotNull() { regSlpotymd(CK_ISNN, DOBJ); }

    protected void regSlpotymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpotymd(), "SLPOTYMD"); }
    protected abstract ConditionValue xgetCValueSlpotymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_Equal(String cmpcd) {
        doSetCmpcd_Equal(fRES(cmpcd));
    }

    protected void doSetCmpcd_Equal(String cmpcd) {
        regCmpcd(CK_EQ, cmpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_NotEqual(String cmpcd) {
        doSetCmpcd_NotEqual(fRES(cmpcd));
    }

    protected void doSetCmpcd_NotEqual(String cmpcd) {
        regCmpcd(CK_NES, cmpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_GreaterThan(String cmpcd) {
        regCmpcd(CK_GT, fRES(cmpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_LessThan(String cmpcd) {
        regCmpcd(CK_LT, fRES(cmpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_GreaterEqual(String cmpcd) {
        regCmpcd(CK_GE, fRES(cmpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_LessEqual(String cmpcd) {
        regCmpcd(CK_LE, fRES(cmpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcdList The collection of cmpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_InScope(Collection<String> cmpcdList) {
        doSetCmpcd_InScope(cmpcdList);
    }

    protected void doSetCmpcd_InScope(Collection<String> cmpcdList) {
        regINS(CK_INS, cTL(cmpcdList), xgetCValueCmpcd(), "CMPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcdList The collection of cmpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_NotInScope(Collection<String> cmpcdList) {
        doSetCmpcd_NotInScope(cmpcdList);
    }

    protected void doSetCmpcd_NotInScope(Collection<String> cmpcdList) {
        regINS(CK_NINS, cTL(cmpcdList), xgetCValueCmpcd(), "CMPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)} <br>
     * <pre>e.g. setCmpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param cmpcd The value of cmpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCmpcd_LikeSearch(String cmpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(cmpcd), xgetCValueCmpcd(), "CMPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCmpcd_NotLikeSearch(String cmpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(cmpcd), xgetCValueCmpcd(), "CMPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CMPCD: {varchar(30)}
     * @param cmpcd The value of cmpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCmpcd_PrefixSearch(String cmpcd) {
        setCmpcd_LikeSearch(cmpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNull() { regCmpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNullOrEmpty() { regCmpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CMPCD: {varchar(30)}
     */
    public void setCmpcd_IsNotNull() { regCmpcd(CK_ISNN, DOBJ); }

    protected void regCmpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCmpcd(), "CMPCD"); }
    protected abstract ConditionValue xgetCValueCmpcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_Equal(String stscd) {
        doSetStscd_Equal(fRES(stscd));
    }

    protected void doSetStscd_Equal(String stscd) {
        regStscd(CK_EQ, stscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_NotEqual(String stscd) {
        doSetStscd_NotEqual(fRES(stscd));
    }

    protected void doSetStscd_NotEqual(String stscd) {
        regStscd(CK_NES, stscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_GreaterThan(String stscd) {
        regStscd(CK_GT, fRES(stscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_LessThan(String stscd) {
        regStscd(CK_LT, fRES(stscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_GreaterEqual(String stscd) {
        regStscd(CK_GE, fRES(stscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_LessEqual(String stscd) {
        regStscd(CK_LE, fRES(stscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscdList The collection of stscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_InScope(Collection<String> stscdList) {
        doSetStscd_InScope(stscdList);
    }

    protected void doSetStscd_InScope(Collection<String> stscdList) {
        regINS(CK_INS, cTL(stscdList), xgetCValueStscd(), "STSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscdList The collection of stscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_NotInScope(Collection<String> stscdList) {
        doSetStscd_NotInScope(stscdList);
    }

    protected void doSetStscd_NotInScope(Collection<String> stscdList) {
        regINS(CK_NINS, cTL(stscdList), xgetCValueStscd(), "STSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STSCD: {varchar(30)} <br>
     * <pre>e.g. setStscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stscd The value of stscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStscd_LikeSearch(String stscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stscd), xgetCValueStscd(), "STSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStscd_NotLikeSearch(String stscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stscd), xgetCValueStscd(), "STSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STSCD: {varchar(30)}
     * @param stscd The value of stscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStscd_PrefixSearch(String stscd) {
        setStscd_LikeSearch(stscd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     */
    public void setStscd_IsNull() { regStscd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     */
    public void setStscd_IsNullOrEmpty() { regStscd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STSCD: {varchar(30)}
     */
    public void setStscd_IsNotNull() { regStscd(CK_ISNN, DOBJ); }

    protected void regStscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStscd(), "STSCD"); }
    protected abstract ConditionValue xgetCValueStscd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_Equal(Long stgval) {
        doSetStgval_Equal(stgval);
    }

    protected void doSetStgval_Equal(Long stgval) {
        regStgval(CK_EQ, stgval);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_NotEqual(Long stgval) {
        doSetStgval_NotEqual(stgval);
    }

    protected void doSetStgval_NotEqual(Long stgval) {
        regStgval(CK_NES, stgval);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_GreaterThan(Long stgval) {
        regStgval(CK_GT, stgval);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_LessThan(Long stgval) {
        regStgval(CK_LT, stgval);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_GreaterEqual(Long stgval) {
        regStgval(CK_GE, stgval);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgval The value of stgval as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStgval_LessEqual(Long stgval) {
        regStgval(CK_LE, stgval);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param minNumber The min number of stgval. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stgval. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStgval_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStgval(), "STGVAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgvalList The collection of stgval as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgval_InScope(Collection<Long> stgvalList) {
        doSetStgval_InScope(stgvalList);
    }

    protected void doSetStgval_InScope(Collection<Long> stgvalList) {
        regINS(CK_INS, cTL(stgvalList), xgetCValueStgval(), "STGVAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STGVAL: {bigint(19)}
     * @param stgvalList The collection of stgval as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStgval_NotInScope(Collection<Long> stgvalList) {
        doSetStgval_NotInScope(stgvalList);
    }

    protected void doSetStgval_NotInScope(Collection<Long> stgvalList) {
        regINS(CK_NINS, cTL(stgvalList), xgetCValueStgval(), "STGVAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     */
    public void setStgval_IsNull() { regStgval(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STGVAL: {bigint(19)}
     */
    public void setStgval_IsNotNull() { regStgval(CK_ISNN, DOBJ); }

    protected void regStgval(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStgval(), "STGVAL"); }
    protected abstract ConditionValue xgetCValueStgval();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_Equal(String slpno) {
        doSetSlpno_Equal(fRES(slpno));
    }

    protected void doSetSlpno_Equal(String slpno) {
        regSlpno(CK_EQ, slpno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotEqual(String slpno) {
        doSetSlpno_NotEqual(fRES(slpno));
    }

    protected void doSetSlpno_NotEqual(String slpno) {
        regSlpno(CK_NES, slpno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterThan(String slpno) {
        regSlpno(CK_GT, fRES(slpno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessThan(String slpno) {
        regSlpno(CK_LT, fRES(slpno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_GreaterEqual(String slpno) {
        regSlpno(CK_GE, fRES(slpno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_LessEqual(String slpno) {
        regSlpno(CK_LE, fRES(slpno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpnoList The collection of slpno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_InScope(Collection<String> slpnoList) {
        doSetSlpno_InScope(slpnoList);
    }

    protected void doSetSlpno_InScope(Collection<String> slpnoList) {
        regINS(CK_INS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpnoList The collection of slpno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_NotInScope(Collection<String> slpnoList) {
        doSetSlpno_NotInScope(slpnoList);
    }

    protected void doSetSlpno_NotInScope(Collection<String> slpnoList) {
        regINS(CK_NINS, cTL(slpnoList), xgetCValueSlpno(), "SLPNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSlpno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slpno The value of slpno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlpno_LikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlpno_NotLikeSearch(String slpno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slpno), xgetCValueSlpno(), "SLPNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLPNO: {NotNull, varchar(30)}
     * @param slpno The value of slpno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlpno_PrefixSearch(String slpno) {
        setSlpno_LikeSearch(slpno, xcLSOPPre());
    }

    protected void regSlpno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlpno(), "SLPNO"); }
    protected abstract ConditionValue xgetCValueSlpno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_Equal(Long tttopdedrnk) {
        doSetTttopdedrnk_Equal(tttopdedrnk);
    }

    protected void doSetTttopdedrnk_Equal(Long tttopdedrnk) {
        regTttopdedrnk(CK_EQ, tttopdedrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotEqual(Long tttopdedrnk) {
        doSetTttopdedrnk_NotEqual(tttopdedrnk);
    }

    protected void doSetTttopdedrnk_NotEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_NES, tttopdedrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterThan(Long tttopdedrnk) {
        regTttopdedrnk(CK_GT, tttopdedrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessThan(Long tttopdedrnk) {
        regTttopdedrnk(CK_LT, tttopdedrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_GreaterEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_GE, tttopdedrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnk The value of tttopdedrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTttopdedrnk_LessEqual(Long tttopdedrnk) {
        regTttopdedrnk(CK_LE, tttopdedrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param minNumber The min number of tttopdedrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tttopdedrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTttopdedrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTttopdedrnk(), "TTTOPDEDRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnkList The collection of tttopdedrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_InScope(Collection<Long> tttopdedrnkList) {
        doSetTttopdedrnk_InScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_InScope(Collection<Long> tttopdedrnkList) {
        regINS(CK_INS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     * @param tttopdedrnkList The collection of tttopdedrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTttopdedrnk_NotInScope(Collection<Long> tttopdedrnkList) {
        doSetTttopdedrnk_NotInScope(tttopdedrnkList);
    }

    protected void doSetTttopdedrnk_NotInScope(Collection<Long> tttopdedrnkList) {
        regINS(CK_NINS, cTL(tttopdedrnkList), xgetCValueTttopdedrnk(), "TTTOPDEDRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     */
    public void setTttopdedrnk_IsNull() { regTttopdedrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TTTOPDEDRNK: {bigint(19)}
     */
    public void setTttopdedrnk_IsNotNull() { regTttopdedrnk(CK_ISNN, DOBJ); }

    protected void regTttopdedrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTttopdedrnk(), "TTTOPDEDRNK"); }
    protected abstract ConditionValue xgetCValueTttopdedrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_Equal(Long cordrcvcnt) {
        doSetCordrcvcnt_Equal(cordrcvcnt);
    }

    protected void doSetCordrcvcnt_Equal(Long cordrcvcnt) {
        regCordrcvcnt(CK_EQ, cordrcvcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_NotEqual(Long cordrcvcnt) {
        doSetCordrcvcnt_NotEqual(cordrcvcnt);
    }

    protected void doSetCordrcvcnt_NotEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_NES, cordrcvcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_GT, cordrcvcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessThan(Long cordrcvcnt) {
        regCordrcvcnt(CK_LT, cordrcvcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_GreaterEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_GE, cordrcvcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcnt The value of cordrcvcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCordrcvcnt_LessEqual(Long cordrcvcnt) {
        regCordrcvcnt(CK_LE, cordrcvcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param minNumber The min number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cordrcvcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCordrcvcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCordrcvcnt(), "CORDRCVCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcntList The collection of cordrcvcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCordrcvcnt_InScope(Collection<Long> cordrcvcntList) {
        doSetCordrcvcnt_InScope(cordrcvcntList);
    }

    protected void doSetCordrcvcnt_InScope(Collection<Long> cordrcvcntList) {
        regINS(CK_INS, cTL(cordrcvcntList), xgetCValueCordrcvcnt(), "CORDRCVCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     * @param cordrcvcntList The collection of cordrcvcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        doSetCordrcvcnt_NotInScope(cordrcvcntList);
    }

    protected void doSetCordrcvcnt_NotInScope(Collection<Long> cordrcvcntList) {
        regINS(CK_NINS, cTL(cordrcvcntList), xgetCValueCordrcvcnt(), "CORDRCVCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     */
    public void setCordrcvcnt_IsNull() { regCordrcvcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CORDRCVCNT: {bigint(19)}
     */
    public void setCordrcvcnt_IsNotNull() { regCordrcvcnt(CK_ISNN, DOBJ); }

    protected void regCordrcvcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCordrcvcnt(), "CORDRCVCNT"); }
    protected abstract ConditionValue xgetCValueCordrcvcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_Equal(String orddvfg) {
        doSetOrddvfg_Equal(fRES(orddvfg));
    }

    protected void doSetOrddvfg_Equal(String orddvfg) {
        regOrddvfg(CK_EQ, orddvfg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_NotEqual(String orddvfg) {
        doSetOrddvfg_NotEqual(fRES(orddvfg));
    }

    protected void doSetOrddvfg_NotEqual(String orddvfg) {
        regOrddvfg(CK_NES, orddvfg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_GreaterThan(String orddvfg) {
        regOrddvfg(CK_GT, fRES(orddvfg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_LessThan(String orddvfg) {
        regOrddvfg(CK_LT, fRES(orddvfg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_GreaterEqual(String orddvfg) {
        regOrddvfg(CK_GE, fRES(orddvfg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_LessEqual(String orddvfg) {
        regOrddvfg(CK_LE, fRES(orddvfg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfgList The collection of orddvfg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_InScope(Collection<String> orddvfgList) {
        doSetOrddvfg_InScope(orddvfgList);
    }

    protected void doSetOrddvfg_InScope(Collection<String> orddvfgList) {
        regINS(CK_INS, cTL(orddvfgList), xgetCValueOrddvfg(), "ORDDVFG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfgList The collection of orddvfg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_NotInScope(Collection<String> orddvfgList) {
        doSetOrddvfg_NotInScope(orddvfgList);
    }

    protected void doSetOrddvfg_NotInScope(Collection<String> orddvfgList) {
        regINS(CK_NINS, cTL(orddvfgList), xgetCValueOrddvfg(), "ORDDVFG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDDVFG: {char(1)} <br>
     * <pre>e.g. setOrddvfg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orddvfg The value of orddvfg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrddvfg_LikeSearch(String orddvfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orddvfg), xgetCValueOrddvfg(), "ORDDVFG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrddvfg_NotLikeSearch(String orddvfg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orddvfg), xgetCValueOrddvfg(), "ORDDVFG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDDVFG: {char(1)}
     * @param orddvfg The value of orddvfg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrddvfg_PrefixSearch(String orddvfg) {
        setOrddvfg_LikeSearch(orddvfg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     */
    public void setOrddvfg_IsNull() { regOrddvfg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDDVFG: {char(1)}
     */
    public void setOrddvfg_IsNotNull() { regOrddvfg(CK_ISNN, DOBJ); }

    protected void regOrddvfg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrddvfg(), "ORDDVFG"); }
    protected abstract ConditionValue xgetCValueOrddvfg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_Equal(Long lbcbqa) {
        doSetLbcbqa_Equal(lbcbqa);
    }

    protected void doSetLbcbqa_Equal(Long lbcbqa) {
        regLbcbqa(CK_EQ, lbcbqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_NotEqual(Long lbcbqa) {
        doSetLbcbqa_NotEqual(lbcbqa);
    }

    protected void doSetLbcbqa_NotEqual(Long lbcbqa) {
        regLbcbqa(CK_NES, lbcbqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_GreaterThan(Long lbcbqa) {
        regLbcbqa(CK_GT, lbcbqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_LessThan(Long lbcbqa) {
        regLbcbqa(CK_LT, lbcbqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_GreaterEqual(Long lbcbqa) {
        regLbcbqa(CK_GE, lbcbqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqa The value of lbcbqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbcbqa_LessEqual(Long lbcbqa) {
        regLbcbqa(CK_LE, lbcbqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param minNumber The min number of lbcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbcbqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbcbqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbcbqa(), "LBCBQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqaList The collection of lbcbqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbcbqa_InScope(Collection<Long> lbcbqaList) {
        doSetLbcbqa_InScope(lbcbqaList);
    }

    protected void doSetLbcbqa_InScope(Collection<Long> lbcbqaList) {
        regINS(CK_INS, cTL(lbcbqaList), xgetCValueLbcbqa(), "LBCBQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     * @param lbcbqaList The collection of lbcbqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbcbqa_NotInScope(Collection<Long> lbcbqaList) {
        doSetLbcbqa_NotInScope(lbcbqaList);
    }

    protected void doSetLbcbqa_NotInScope(Collection<Long> lbcbqaList) {
        regINS(CK_NINS, cTL(lbcbqaList), xgetCValueLbcbqa(), "LBCBQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     */
    public void setLbcbqa_IsNull() { regLbcbqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBCBQA: {bigint(19), default=[0]}
     */
    public void setLbcbqa_IsNotNull() { regLbcbqa(CK_ISNN, DOBJ); }

    protected void regLbcbqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbcbqa(), "LBCBQA"); }
    protected abstract ConditionValue xgetCValueLbcbqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_Equal(String drclstlbcbid) {
        doSetDrclstlbcbid_Equal(fRES(drclstlbcbid));
    }

    protected void doSetDrclstlbcbid_Equal(String drclstlbcbid) {
        regDrclstlbcbid(CK_EQ, drclstlbcbid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_NotEqual(String drclstlbcbid) {
        doSetDrclstlbcbid_NotEqual(fRES(drclstlbcbid));
    }

    protected void doSetDrclstlbcbid_NotEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_NES, drclstlbcbid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_GreaterThan(String drclstlbcbid) {
        regDrclstlbcbid(CK_GT, fRES(drclstlbcbid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_LessThan(String drclstlbcbid) {
        regDrclstlbcbid(CK_LT, fRES(drclstlbcbid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_GreaterEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_GE, fRES(drclstlbcbid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_LessEqual(String drclstlbcbid) {
        regDrclstlbcbid(CK_LE, fRES(drclstlbcbid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbidList The collection of drclstlbcbid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_InScope(Collection<String> drclstlbcbidList) {
        doSetDrclstlbcbid_InScope(drclstlbcbidList);
    }

    protected void doSetDrclstlbcbid_InScope(Collection<String> drclstlbcbidList) {
        regINS(CK_INS, cTL(drclstlbcbidList), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbidList The collection of drclstlbcbid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_NotInScope(Collection<String> drclstlbcbidList) {
        doSetDrclstlbcbid_NotInScope(drclstlbcbidList);
    }

    protected void doSetDrclstlbcbid_NotInScope(Collection<String> drclstlbcbidList) {
        regINS(CK_NINS, cTL(drclstlbcbidList), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)} <br>
     * <pre>e.g. setDrclstlbcbid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param drclstlbcbid The value of drclstlbcbid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDrclstlbcbid_LikeSearch(String drclstlbcbid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(drclstlbcbid), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDrclstlbcbid_NotLikeSearch(String drclstlbcbid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(drclstlbcbid), xgetCValueDrclstlbcbid(), "DRCLSTLBCBID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     * @param drclstlbcbid The value of drclstlbcbid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDrclstlbcbid_PrefixSearch(String drclstlbcbid) {
        setDrclstlbcbid_LikeSearch(drclstlbcbid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     */
    public void setDrclstlbcbid_IsNull() { regDrclstlbcbid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DRCLSTLBCBID: {char(1)}
     */
    public void setDrclstlbcbid_IsNotNull() { regDrclstlbcbid(CK_ISNN, DOBJ); }

    protected void regDrclstlbcbid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDrclstlbcbid(), "DRCLSTLBCBID"); }
    protected abstract ConditionValue xgetCValueDrclstlbcbid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_Equal(Long lbboxno) {
        doSetLbboxno_Equal(lbboxno);
    }

    protected void doSetLbboxno_Equal(Long lbboxno) {
        regLbboxno(CK_EQ, lbboxno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_NotEqual(Long lbboxno) {
        doSetLbboxno_NotEqual(lbboxno);
    }

    protected void doSetLbboxno_NotEqual(Long lbboxno) {
        regLbboxno(CK_NES, lbboxno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_GreaterThan(Long lbboxno) {
        regLbboxno(CK_GT, lbboxno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_LessThan(Long lbboxno) {
        regLbboxno(CK_LT, lbboxno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_GreaterEqual(Long lbboxno) {
        regLbboxno(CK_GE, lbboxno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxno The value of lbboxno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbboxno_LessEqual(Long lbboxno) {
        regLbboxno(CK_LE, lbboxno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param minNumber The min number of lbboxno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbboxno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbboxno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbboxno(), "LBBOXNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxnoList The collection of lbboxno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbboxno_InScope(Collection<Long> lbboxnoList) {
        doSetLbboxno_InScope(lbboxnoList);
    }

    protected void doSetLbboxno_InScope(Collection<Long> lbboxnoList) {
        regINS(CK_INS, cTL(lbboxnoList), xgetCValueLbboxno(), "LBBOXNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     * @param lbboxnoList The collection of lbboxno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbboxno_NotInScope(Collection<Long> lbboxnoList) {
        doSetLbboxno_NotInScope(lbboxnoList);
    }

    protected void doSetLbboxno_NotInScope(Collection<Long> lbboxnoList) {
        regINS(CK_NINS, cTL(lbboxnoList), xgetCValueLbboxno(), "LBBOXNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     */
    public void setLbboxno_IsNull() { regLbboxno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBBOXNO: {bigint(19), default=[(0)]}
     */
    public void setLbboxno_IsNotNull() { regLbboxno(CK_ISNN, DOBJ); }

    protected void regLbboxno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbboxno(), "LBBOXNO"); }
    protected abstract ConditionValue xgetCValueLbboxno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_Equal(Long lbttboxqa) {
        doSetLbttboxqa_Equal(lbttboxqa);
    }

    protected void doSetLbttboxqa_Equal(Long lbttboxqa) {
        regLbttboxqa(CK_EQ, lbttboxqa);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_NotEqual(Long lbttboxqa) {
        doSetLbttboxqa_NotEqual(lbttboxqa);
    }

    protected void doSetLbttboxqa_NotEqual(Long lbttboxqa) {
        regLbttboxqa(CK_NES, lbttboxqa);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_GreaterThan(Long lbttboxqa) {
        regLbttboxqa(CK_GT, lbttboxqa);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_LessThan(Long lbttboxqa) {
        regLbttboxqa(CK_LT, lbttboxqa);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_GreaterEqual(Long lbttboxqa) {
        regLbttboxqa(CK_GE, lbttboxqa);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqa The value of lbttboxqa as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLbttboxqa_LessEqual(Long lbttboxqa) {
        regLbttboxqa(CK_LE, lbttboxqa);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param minNumber The min number of lbttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lbttboxqa. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLbttboxqa_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLbttboxqa(), "LBTTBOXQA", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqaList The collection of lbttboxqa as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbttboxqa_InScope(Collection<Long> lbttboxqaList) {
        doSetLbttboxqa_InScope(lbttboxqaList);
    }

    protected void doSetLbttboxqa_InScope(Collection<Long> lbttboxqaList) {
        regINS(CK_INS, cTL(lbttboxqaList), xgetCValueLbttboxqa(), "LBTTBOXQA");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     * @param lbttboxqaList The collection of lbttboxqa as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLbttboxqa_NotInScope(Collection<Long> lbttboxqaList) {
        doSetLbttboxqa_NotInScope(lbttboxqaList);
    }

    protected void doSetLbttboxqa_NotInScope(Collection<Long> lbttboxqaList) {
        regINS(CK_NINS, cTL(lbttboxqaList), xgetCValueLbttboxqa(), "LBTTBOXQA");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     */
    public void setLbttboxqa_IsNull() { regLbttboxqa(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LBTTBOXQA: {bigint(19), default=[(0)]}
     */
    public void setLbttboxqa_IsNotNull() { regLbttboxqa(CK_ISNN, DOBJ); }

    protected void regLbttboxqa(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLbttboxqa(), "LBTTBOXQA"); }
    protected abstract ConditionValue xgetCValueLbttboxqa();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_Equal(String ikeiincldflg) {
        doSetIkeiincldflg_Equal(fRES(ikeiincldflg));
    }

    protected void doSetIkeiincldflg_Equal(String ikeiincldflg) {
        regIkeiincldflg(CK_EQ, ikeiincldflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_NotEqual(String ikeiincldflg) {
        doSetIkeiincldflg_NotEqual(fRES(ikeiincldflg));
    }

    protected void doSetIkeiincldflg_NotEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_NES, ikeiincldflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_GreaterThan(String ikeiincldflg) {
        regIkeiincldflg(CK_GT, fRES(ikeiincldflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_LessThan(String ikeiincldflg) {
        regIkeiincldflg(CK_LT, fRES(ikeiincldflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_GreaterEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_GE, fRES(ikeiincldflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_LessEqual(String ikeiincldflg) {
        regIkeiincldflg(CK_LE, fRES(ikeiincldflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflgList The collection of ikeiincldflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_InScope(Collection<String> ikeiincldflgList) {
        doSetIkeiincldflg_InScope(ikeiincldflgList);
    }

    protected void doSetIkeiincldflg_InScope(Collection<String> ikeiincldflgList) {
        regINS(CK_INS, cTL(ikeiincldflgList), xgetCValueIkeiincldflg(), "IKEIINCLDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflgList The collection of ikeiincldflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_NotInScope(Collection<String> ikeiincldflgList) {
        doSetIkeiincldflg_NotInScope(ikeiincldflgList);
    }

    protected void doSetIkeiincldflg_NotInScope(Collection<String> ikeiincldflgList) {
        regINS(CK_NINS, cTL(ikeiincldflgList), xgetCValueIkeiincldflg(), "IKEIINCLDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]} <br>
     * <pre>e.g. setIkeiincldflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ikeiincldflg The value of ikeiincldflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIkeiincldflg_LikeSearch(String ikeiincldflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ikeiincldflg), xgetCValueIkeiincldflg(), "IKEIINCLDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIkeiincldflg_NotLikeSearch(String ikeiincldflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ikeiincldflg), xgetCValueIkeiincldflg(), "IKEIINCLDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     * @param ikeiincldflg The value of ikeiincldflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIkeiincldflg_PrefixSearch(String ikeiincldflg) {
        setIkeiincldflg_LikeSearch(ikeiincldflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     */
    public void setIkeiincldflg_IsNull() { regIkeiincldflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IKEIINCLDFLG: {char(1), default=[0]}
     */
    public void setIkeiincldflg_IsNotNull() { regIkeiincldflg(CK_ISNN, DOBJ); }

    protected void regIkeiincldflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIkeiincldflg(), "IKEIINCLDFLG"); }
    protected abstract ConditionValue xgetCValueIkeiincldflg();

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
    public HpSLCFunction<TCorddtaecCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCorddtaecCB.class);
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
    public HpSLCFunction<TCorddtaecCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCorddtaecCB.class);
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
    public HpSLCFunction<TCorddtaecCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCorddtaecCB.class);
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
    public HpSLCFunction<TCorddtaecCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCorddtaecCB.class);
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
    public HpSLCFunction<TCorddtaecCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCorddtaecCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCorddtaecCB&gt;() {
     *     public void query(TCorddtaecCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCorddtaecCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCorddtaecCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtaecCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCorddtaecCQ sq);

    protected TCorddtaecCB xcreateScalarConditionCB() {
        TCorddtaecCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCorddtaecCB xcreateScalarConditionPartitionByCB() {
        TCorddtaecCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCorddtaecCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "ORDER_CHANGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCorddtaecCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCorddtaecCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCorddtaecCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "ORDER_CHANGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCorddtaecCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCorddtaecCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCorddtaecCB cb = new TCorddtaecCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCorddtaecCQ sq);

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
    protected TCorddtaecCB newMyCB() {
        return new TCorddtaecCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCorddtaecCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
