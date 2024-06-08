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
 * The abstract condition-query of M_MFRCVITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMfrcvitemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMfrcvitemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MFRCVITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_Equal(Long rcvitemId) {
        doSetRcvitemId_Equal(rcvitemId);
    }

    protected void doSetRcvitemId_Equal(Long rcvitemId) {
        regRcvitemId(CK_EQ, rcvitemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_NotEqual(Long rcvitemId) {
        doSetRcvitemId_NotEqual(rcvitemId);
    }

    protected void doSetRcvitemId_NotEqual(Long rcvitemId) {
        regRcvitemId(CK_NES, rcvitemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_GreaterThan(Long rcvitemId) {
        regRcvitemId(CK_GT, rcvitemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_LessThan(Long rcvitemId) {
        regRcvitemId(CK_LT, rcvitemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_GreaterEqual(Long rcvitemId) {
        regRcvitemId(CK_GE, rcvitemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemId The value of rcvitemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemId_LessEqual(Long rcvitemId) {
        regRcvitemId(CK_LE, rcvitemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of rcvitemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvitemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvitemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvitemId(), "RCVITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemIdList The collection of rcvitemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvitemId_InScope(Collection<Long> rcvitemIdList) {
        doSetRcvitemId_InScope(rcvitemIdList);
    }

    protected void doSetRcvitemId_InScope(Collection<Long> rcvitemIdList) {
        regINS(CK_INS, cTL(rcvitemIdList), xgetCValueRcvitemId(), "RCVITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param rcvitemIdList The collection of rcvitemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvitemId_NotInScope(Collection<Long> rcvitemIdList) {
        doSetRcvitemId_NotInScope(rcvitemIdList);
    }

    protected void doSetRcvitemId_NotInScope(Collection<Long> rcvitemIdList) {
        regINS(CK_NINS, cTL(rcvitemIdList), xgetCValueRcvitemId(), "RCVITEM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRcvitemId_IsNull() { regRcvitemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setRcvitemId_IsNotNull() { regRcvitemId(CK_ISNN, DOBJ); }

    protected void regRcvitemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvitemId(), "RCVITEM_ID"); }
    protected abstract ConditionValue xgetCValueRcvitemId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     */
    public void setClientId_IsNull() { regClientId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_ID: {bigint(19), FK to M_CLIENT}
     */
    public void setClientId_IsNotNull() { regClientId(CK_ISNN, DOBJ); }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_Equal(java.math.BigDecimal rcvitemkey) {
        doSetRcvitemkey_Equal(rcvitemkey);
    }

    protected void doSetRcvitemkey_Equal(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_EQ, rcvitemkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_NotEqual(java.math.BigDecimal rcvitemkey) {
        doSetRcvitemkey_NotEqual(rcvitemkey);
    }

    protected void doSetRcvitemkey_NotEqual(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_NES, rcvitemkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_GreaterThan(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_GT, rcvitemkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_LessThan(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_LT, rcvitemkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_GreaterEqual(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_GE, rcvitemkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkey The value of rcvitemkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvitemkey_LessEqual(java.math.BigDecimal rcvitemkey) {
        regRcvitemkey(CK_LE, rcvitemkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvitemkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvitemkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvitemkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvitemkey(), "RCVITEMKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkeyList The collection of rcvitemkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvitemkey_InScope(Collection<java.math.BigDecimal> rcvitemkeyList) {
        doSetRcvitemkey_InScope(rcvitemkeyList);
    }

    protected void doSetRcvitemkey_InScope(Collection<java.math.BigDecimal> rcvitemkeyList) {
        regINS(CK_INS, cTL(rcvitemkeyList), xgetCValueRcvitemkey(), "RCVITEMKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVITEMKEY: {NotNull, decimal(16, 6)}
     * @param rcvitemkeyList The collection of rcvitemkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvitemkey_NotInScope(Collection<java.math.BigDecimal> rcvitemkeyList) {
        doSetRcvitemkey_NotInScope(rcvitemkeyList);
    }

    protected void doSetRcvitemkey_NotInScope(Collection<java.math.BigDecimal> rcvitemkeyList) {
        regINS(CK_NINS, cTL(rcvitemkeyList), xgetCValueRcvitemkey(), "RCVITEMKEY");
    }

    protected void regRcvitemkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvitemkey(), "RCVITEMKEY"); }
    protected abstract ConditionValue xgetCValueRcvitemkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_Equal(String itemcdFrom) {
        doSetItemcdFrom_Equal(fRES(itemcdFrom));
    }

    protected void doSetItemcdFrom_Equal(String itemcdFrom) {
        regItemcdFrom(CK_EQ, itemcdFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_NotEqual(String itemcdFrom) {
        doSetItemcdFrom_NotEqual(fRES(itemcdFrom));
    }

    protected void doSetItemcdFrom_NotEqual(String itemcdFrom) {
        regItemcdFrom(CK_NES, itemcdFrom);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_GreaterThan(String itemcdFrom) {
        regItemcdFrom(CK_GT, fRES(itemcdFrom));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_LessThan(String itemcdFrom) {
        regItemcdFrom(CK_LT, fRES(itemcdFrom));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_GreaterEqual(String itemcdFrom) {
        regItemcdFrom(CK_GE, fRES(itemcdFrom));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_LessEqual(String itemcdFrom) {
        regItemcdFrom(CK_LE, fRES(itemcdFrom));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFromList The collection of itemcdFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_InScope(Collection<String> itemcdFromList) {
        doSetItemcdFrom_InScope(itemcdFromList);
    }

    protected void doSetItemcdFrom_InScope(Collection<String> itemcdFromList) {
        regINS(CK_INS, cTL(itemcdFromList), xgetCValueItemcdFrom(), "ITEMCD_FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFromList The collection of itemcdFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_NotInScope(Collection<String> itemcdFromList) {
        doSetItemcdFrom_NotInScope(itemcdFromList);
    }

    protected void doSetItemcdFrom_NotInScope(Collection<String> itemcdFromList) {
        regINS(CK_NINS, cTL(itemcdFromList), xgetCValueItemcdFrom(), "ITEMCD_FROM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemcdFrom_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdFrom The value of itemcdFrom as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdFrom_LikeSearch(String itemcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdFrom), xgetCValueItemcdFrom(), "ITEMCD_FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdFrom_NotLikeSearch(String itemcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdFrom), xgetCValueItemcdFrom(), "ITEMCD_FROM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_FROM: {NotNull, varchar(30)}
     * @param itemcdFrom The value of itemcdFrom as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdFrom_PrefixSearch(String itemcdFrom) {
        setItemcdFrom_LikeSearch(itemcdFrom, xcLSOPPre());
    }

    protected void regItemcdFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdFrom(), "ITEMCD_FROM"); }
    protected abstract ConditionValue xgetCValueItemcdFrom();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_Equal(String designcdFrom) {
        doSetDesigncdFrom_Equal(fRES(designcdFrom));
    }

    protected void doSetDesigncdFrom_Equal(String designcdFrom) {
        regDesigncdFrom(CK_EQ, designcdFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_NotEqual(String designcdFrom) {
        doSetDesigncdFrom_NotEqual(fRES(designcdFrom));
    }

    protected void doSetDesigncdFrom_NotEqual(String designcdFrom) {
        regDesigncdFrom(CK_NES, designcdFrom);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_GreaterThan(String designcdFrom) {
        regDesigncdFrom(CK_GT, fRES(designcdFrom));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_LessThan(String designcdFrom) {
        regDesigncdFrom(CK_LT, fRES(designcdFrom));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_GreaterEqual(String designcdFrom) {
        regDesigncdFrom(CK_GE, fRES(designcdFrom));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_LessEqual(String designcdFrom) {
        regDesigncdFrom(CK_LE, fRES(designcdFrom));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFromList The collection of designcdFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_InScope(Collection<String> designcdFromList) {
        doSetDesigncdFrom_InScope(designcdFromList);
    }

    protected void doSetDesigncdFrom_InScope(Collection<String> designcdFromList) {
        regINS(CK_INS, cTL(designcdFromList), xgetCValueDesigncdFrom(), "DESIGNCD_FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFromList The collection of designcdFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_NotInScope(Collection<String> designcdFromList) {
        doSetDesigncdFrom_NotInScope(designcdFromList);
    }

    protected void doSetDesigncdFrom_NotInScope(Collection<String> designcdFromList) {
        regINS(CK_NINS, cTL(designcdFromList), xgetCValueDesigncdFrom(), "DESIGNCD_FROM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)} <br>
     * <pre>e.g. setDesigncdFrom_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdFrom The value of designcdFrom as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdFrom_LikeSearch(String designcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdFrom), xgetCValueDesigncdFrom(), "DESIGNCD_FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdFrom_NotLikeSearch(String designcdFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdFrom), xgetCValueDesigncdFrom(), "DESIGNCD_FROM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     * @param designcdFrom The value of designcdFrom as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdFrom_PrefixSearch(String designcdFrom) {
        setDesigncdFrom_LikeSearch(designcdFrom, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     */
    public void setDesigncdFrom_IsNull() { regDesigncdFrom(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     */
    public void setDesigncdFrom_IsNullOrEmpty() { regDesigncdFrom(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_FROM: {varchar(30)}
     */
    public void setDesigncdFrom_IsNotNull() { regDesigncdFrom(CK_ISNN, DOBJ); }

    protected void regDesigncdFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdFrom(), "DESIGNCD_FROM"); }
    protected abstract ConditionValue xgetCValueDesigncdFrom();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_Equal(String itemcdTo) {
        doSetItemcdTo_Equal(fRES(itemcdTo));
    }

    protected void doSetItemcdTo_Equal(String itemcdTo) {
        regItemcdTo(CK_EQ, itemcdTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_NotEqual(String itemcdTo) {
        doSetItemcdTo_NotEqual(fRES(itemcdTo));
    }

    protected void doSetItemcdTo_NotEqual(String itemcdTo) {
        regItemcdTo(CK_NES, itemcdTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_GreaterThan(String itemcdTo) {
        regItemcdTo(CK_GT, fRES(itemcdTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_LessThan(String itemcdTo) {
        regItemcdTo(CK_LT, fRES(itemcdTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_GreaterEqual(String itemcdTo) {
        regItemcdTo(CK_GE, fRES(itemcdTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_LessEqual(String itemcdTo) {
        regItemcdTo(CK_LE, fRES(itemcdTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdToList The collection of itemcdTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_InScope(Collection<String> itemcdToList) {
        doSetItemcdTo_InScope(itemcdToList);
    }

    protected void doSetItemcdTo_InScope(Collection<String> itemcdToList) {
        regINS(CK_INS, cTL(itemcdToList), xgetCValueItemcdTo(), "ITEMCD_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdToList The collection of itemcdTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_NotInScope(Collection<String> itemcdToList) {
        doSetItemcdTo_NotInScope(itemcdToList);
    }

    protected void doSetItemcdTo_NotInScope(Collection<String> itemcdToList) {
        regINS(CK_NINS, cTL(itemcdToList), xgetCValueItemcdTo(), "ITEMCD_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)} <br>
     * <pre>e.g. setItemcdTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdTo The value of itemcdTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdTo_LikeSearch(String itemcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdTo), xgetCValueItemcdTo(), "ITEMCD_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdTo_NotLikeSearch(String itemcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdTo), xgetCValueItemcdTo(), "ITEMCD_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     * @param itemcdTo The value of itemcdTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdTo_PrefixSearch(String itemcdTo) {
        setItemcdTo_LikeSearch(itemcdTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNull() { regItemcdTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNullOrEmpty() { regItemcdTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD_TO: {varchar(30)}
     */
    public void setItemcdTo_IsNotNull() { regItemcdTo(CK_ISNN, DOBJ); }

    protected void regItemcdTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdTo(), "ITEMCD_TO"); }
    protected abstract ConditionValue xgetCValueItemcdTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_Equal(String designcdTo) {
        doSetDesigncdTo_Equal(fRES(designcdTo));
    }

    protected void doSetDesigncdTo_Equal(String designcdTo) {
        regDesigncdTo(CK_EQ, designcdTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_NotEqual(String designcdTo) {
        doSetDesigncdTo_NotEqual(fRES(designcdTo));
    }

    protected void doSetDesigncdTo_NotEqual(String designcdTo) {
        regDesigncdTo(CK_NES, designcdTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_GreaterThan(String designcdTo) {
        regDesigncdTo(CK_GT, fRES(designcdTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_LessThan(String designcdTo) {
        regDesigncdTo(CK_LT, fRES(designcdTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_GreaterEqual(String designcdTo) {
        regDesigncdTo(CK_GE, fRES(designcdTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_LessEqual(String designcdTo) {
        regDesigncdTo(CK_LE, fRES(designcdTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdToList The collection of designcdTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_InScope(Collection<String> designcdToList) {
        doSetDesigncdTo_InScope(designcdToList);
    }

    protected void doSetDesigncdTo_InScope(Collection<String> designcdToList) {
        regINS(CK_INS, cTL(designcdToList), xgetCValueDesigncdTo(), "DESIGNCD_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdToList The collection of designcdTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_NotInScope(Collection<String> designcdToList) {
        doSetDesigncdTo_NotInScope(designcdToList);
    }

    protected void doSetDesigncdTo_NotInScope(Collection<String> designcdToList) {
        regINS(CK_NINS, cTL(designcdToList), xgetCValueDesigncdTo(), "DESIGNCD_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_TO: {varchar(30)} <br>
     * <pre>e.g. setDesigncdTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdTo The value of designcdTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdTo_LikeSearch(String designcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdTo), xgetCValueDesigncdTo(), "DESIGNCD_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdTo_NotLikeSearch(String designcdTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdTo), xgetCValueDesigncdTo(), "DESIGNCD_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     * @param designcdTo The value of designcdTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdTo_PrefixSearch(String designcdTo) {
        setDesigncdTo_LikeSearch(designcdTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     */
    public void setDesigncdTo_IsNull() { regDesigncdTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     */
    public void setDesigncdTo_IsNullOrEmpty() { regDesigncdTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD_TO: {varchar(30)}
     */
    public void setDesigncdTo_IsNotNull() { regDesigncdTo(CK_ISNN, DOBJ); }

    protected void regDesigncdTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdTo(), "DESIGNCD_TO"); }
    protected abstract ConditionValue xgetCValueDesigncdTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_Equal(String vaExtdata1) {
        doSetVaExtdata1_Equal(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_Equal(String vaExtdata1) {
        regVaExtdata1(CK_EQ, vaExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotEqual(String vaExtdata1) {
        doSetVaExtdata1_NotEqual(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_NotEqual(String vaExtdata1) {
        regVaExtdata1(CK_NES, vaExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterThan(String vaExtdata1) {
        regVaExtdata1(CK_GT, fRES(vaExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessThan(String vaExtdata1) {
        regVaExtdata1(CK_LT, fRES(vaExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterEqual(String vaExtdata1) {
        regVaExtdata1(CK_GE, fRES(vaExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessEqual(String vaExtdata1) {
        regVaExtdata1(CK_LE, fRES(vaExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_InScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        regINS(CK_INS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_NotInScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        regINS(CK_NINS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata1 The value of vaExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata1_LikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata1_NotLikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_PrefixSearch(String vaExtdata1) {
        setVaExtdata1_LikeSearch(vaExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNull() { regVaExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNullOrEmpty() { regVaExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNotNull() { regVaExtdata1(CK_ISNN, DOBJ); }

    protected void regVaExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata1(), "VA_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueVaExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_Equal(String vaExtdata2) {
        doSetVaExtdata2_Equal(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_Equal(String vaExtdata2) {
        regVaExtdata2(CK_EQ, vaExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotEqual(String vaExtdata2) {
        doSetVaExtdata2_NotEqual(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_NotEqual(String vaExtdata2) {
        regVaExtdata2(CK_NES, vaExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterThan(String vaExtdata2) {
        regVaExtdata2(CK_GT, fRES(vaExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessThan(String vaExtdata2) {
        regVaExtdata2(CK_LT, fRES(vaExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterEqual(String vaExtdata2) {
        regVaExtdata2(CK_GE, fRES(vaExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessEqual(String vaExtdata2) {
        regVaExtdata2(CK_LE, fRES(vaExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_InScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        regINS(CK_INS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_NotInScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        regINS(CK_NINS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata2 The value of vaExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata2_LikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata2_NotLikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_PrefixSearch(String vaExtdata2) {
        setVaExtdata2_LikeSearch(vaExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNull() { regVaExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNullOrEmpty() { regVaExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNotNull() { regVaExtdata2(CK_ISNN, DOBJ); }

    protected void regVaExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata2(), "VA_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueVaExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_Equal(String vaExtdata3) {
        doSetVaExtdata3_Equal(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_Equal(String vaExtdata3) {
        regVaExtdata3(CK_EQ, vaExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotEqual(String vaExtdata3) {
        doSetVaExtdata3_NotEqual(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_NotEqual(String vaExtdata3) {
        regVaExtdata3(CK_NES, vaExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterThan(String vaExtdata3) {
        regVaExtdata3(CK_GT, fRES(vaExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessThan(String vaExtdata3) {
        regVaExtdata3(CK_LT, fRES(vaExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterEqual(String vaExtdata3) {
        regVaExtdata3(CK_GE, fRES(vaExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessEqual(String vaExtdata3) {
        regVaExtdata3(CK_LE, fRES(vaExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_InScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        regINS(CK_INS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_NotInScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        regINS(CK_NINS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata3 The value of vaExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata3_LikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata3_NotLikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_PrefixSearch(String vaExtdata3) {
        setVaExtdata3_LikeSearch(vaExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNull() { regVaExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNullOrEmpty() { regVaExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNotNull() { regVaExtdata3(CK_ISNN, DOBJ); }

    protected void regVaExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata3(), "VA_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueVaExtdata3();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_Equal(String nvExtdata2) {
        doSetNvExtdata2_Equal(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_Equal(String nvExtdata2) {
        regNvExtdata2(CK_EQ, nvExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotEqual(String nvExtdata2) {
        doSetNvExtdata2_NotEqual(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_NotEqual(String nvExtdata2) {
        regNvExtdata2(CK_NES, nvExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterThan(String nvExtdata2) {
        regNvExtdata2(CK_GT, fRES(nvExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessThan(String nvExtdata2) {
        regNvExtdata2(CK_LT, fRES(nvExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterEqual(String nvExtdata2) {
        regNvExtdata2(CK_GE, fRES(nvExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessEqual(String nvExtdata2) {
        regNvExtdata2(CK_LE, fRES(nvExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_InScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        regINS(CK_INS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_NotInScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        regINS(CK_NINS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata2 The value of nvExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata2_LikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata2_NotLikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_PrefixSearch(String nvExtdata2) {
        setNvExtdata2_LikeSearch(nvExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNull() { regNvExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNullOrEmpty() { regNvExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNotNull() { regNvExtdata2(CK_ISNN, DOBJ); }

    protected void regNvExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata2(), "NV_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNvExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_Equal(String nvExtdata3) {
        doSetNvExtdata3_Equal(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_Equal(String nvExtdata3) {
        regNvExtdata3(CK_EQ, nvExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotEqual(String nvExtdata3) {
        doSetNvExtdata3_NotEqual(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_NotEqual(String nvExtdata3) {
        regNvExtdata3(CK_NES, nvExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterThan(String nvExtdata3) {
        regNvExtdata3(CK_GT, fRES(nvExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessThan(String nvExtdata3) {
        regNvExtdata3(CK_LT, fRES(nvExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterEqual(String nvExtdata3) {
        regNvExtdata3(CK_GE, fRES(nvExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessEqual(String nvExtdata3) {
        regNvExtdata3(CK_LE, fRES(nvExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_InScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        regINS(CK_INS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_NotInScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        regINS(CK_NINS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata3 The value of nvExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata3_LikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata3_NotLikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_PrefixSearch(String nvExtdata3) {
        setNvExtdata3_LikeSearch(nvExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNull() { regNvExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNullOrEmpty() { regNvExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNotNull() { regNvExtdata3(CK_ISNN, DOBJ); }

    protected void regNvExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata3(), "NV_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNvExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_Equal(Long nmExtdata1) {
        doSetNmExtdata1_Equal(nmExtdata1);
    }

    protected void doSetNmExtdata1_Equal(Long nmExtdata1) {
        regNmExtdata1(CK_EQ, nmExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotEqual(Long nmExtdata1) {
        doSetNmExtdata1_NotEqual(nmExtdata1);
    }

    protected void doSetNmExtdata1_NotEqual(Long nmExtdata1) {
        regNmExtdata1(CK_NES, nmExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterThan(Long nmExtdata1) {
        regNmExtdata1(CK_GT, nmExtdata1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessThan(Long nmExtdata1) {
        regNmExtdata1(CK_LT, nmExtdata1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterEqual(Long nmExtdata1) {
        regNmExtdata1(CK_GE, nmExtdata1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessEqual(Long nmExtdata1) {
        regNmExtdata1(CK_LE, nmExtdata1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param minNumber The min number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata1(), "NM_EXTDATA1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_InScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        regINS(CK_INS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_NotInScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        regINS(CK_NINS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNull() { regNmExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNotNull() { regNmExtdata1(CK_ISNN, DOBJ); }

    protected void regNmExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata1(), "NM_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNmExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_Equal(Long nmExtdata2) {
        doSetNmExtdata2_Equal(nmExtdata2);
    }

    protected void doSetNmExtdata2_Equal(Long nmExtdata2) {
        regNmExtdata2(CK_EQ, nmExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotEqual(Long nmExtdata2) {
        doSetNmExtdata2_NotEqual(nmExtdata2);
    }

    protected void doSetNmExtdata2_NotEqual(Long nmExtdata2) {
        regNmExtdata2(CK_NES, nmExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterThan(Long nmExtdata2) {
        regNmExtdata2(CK_GT, nmExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessThan(Long nmExtdata2) {
        regNmExtdata2(CK_LT, nmExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterEqual(Long nmExtdata2) {
        regNmExtdata2(CK_GE, nmExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessEqual(Long nmExtdata2) {
        regNmExtdata2(CK_LE, nmExtdata2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param minNumber The min number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata2(), "NM_EXTDATA2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_InScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        regINS(CK_INS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_NotInScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        regINS(CK_NINS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNull() { regNmExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNotNull() { regNmExtdata2(CK_ISNN, DOBJ); }

    protected void regNmExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata2(), "NM_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNmExtdata2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_Equal(Long nmExtdata3) {
        doSetNmExtdata3_Equal(nmExtdata3);
    }

    protected void doSetNmExtdata3_Equal(Long nmExtdata3) {
        regNmExtdata3(CK_EQ, nmExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotEqual(Long nmExtdata3) {
        doSetNmExtdata3_NotEqual(nmExtdata3);
    }

    protected void doSetNmExtdata3_NotEqual(Long nmExtdata3) {
        regNmExtdata3(CK_NES, nmExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterThan(Long nmExtdata3) {
        regNmExtdata3(CK_GT, nmExtdata3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessThan(Long nmExtdata3) {
        regNmExtdata3(CK_LT, nmExtdata3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterEqual(Long nmExtdata3) {
        regNmExtdata3(CK_GE, nmExtdata3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessEqual(Long nmExtdata3) {
        regNmExtdata3(CK_LE, nmExtdata3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param minNumber The min number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata3(), "NM_EXTDATA3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_InScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        regINS(CK_INS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_NotInScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        regINS(CK_NINS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNull() { regNmExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNotNull() { regNmExtdata3(CK_ISNN, DOBJ); }

    protected void regNmExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata3(), "NM_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNmExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_Equal(String dtExtdata1) {
        doSetDtExtdata1_Equal(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_Equal(String dtExtdata1) {
        regDtExtdata1(CK_EQ, dtExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotEqual(String dtExtdata1) {
        doSetDtExtdata1_NotEqual(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_NotEqual(String dtExtdata1) {
        regDtExtdata1(CK_NES, dtExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterThan(String dtExtdata1) {
        regDtExtdata1(CK_GT, fRES(dtExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessThan(String dtExtdata1) {
        regDtExtdata1(CK_LT, fRES(dtExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterEqual(String dtExtdata1) {
        regDtExtdata1(CK_GE, fRES(dtExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessEqual(String dtExtdata1) {
        regDtExtdata1(CK_LE, fRES(dtExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_InScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        regINS(CK_INS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_NotInScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        regINS(CK_NINS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata1 The value of dtExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata1_LikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata1_NotLikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_PrefixSearch(String dtExtdata1) {
        setDtExtdata1_LikeSearch(dtExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNull() { regDtExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNullOrEmpty() { regDtExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNotNull() { regDtExtdata1(CK_ISNN, DOBJ); }

    protected void regDtExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata1(), "DT_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueDtExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_Equal(String dtExtdata3) {
        doSetDtExtdata3_Equal(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_Equal(String dtExtdata3) {
        regDtExtdata3(CK_EQ, dtExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotEqual(String dtExtdata3) {
        doSetDtExtdata3_NotEqual(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_NotEqual(String dtExtdata3) {
        regDtExtdata3(CK_NES, dtExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterThan(String dtExtdata3) {
        regDtExtdata3(CK_GT, fRES(dtExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessThan(String dtExtdata3) {
        regDtExtdata3(CK_LT, fRES(dtExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterEqual(String dtExtdata3) {
        regDtExtdata3(CK_GE, fRES(dtExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessEqual(String dtExtdata3) {
        regDtExtdata3(CK_LE, fRES(dtExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_InScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        regINS(CK_INS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_NotInScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        regINS(CK_NINS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata3 The value of dtExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata3_LikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata3_NotLikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_PrefixSearch(String dtExtdata3) {
        setDtExtdata3_LikeSearch(dtExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNull() { regDtExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNullOrEmpty() { regDtExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNotNull() { regDtExtdata3(CK_ISNN, DOBJ); }

    protected void regDtExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata3(), "DT_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueDtExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_Equal(String itemNmFrom) {
        doSetItemNmFrom_Equal(fRES(itemNmFrom));
    }

    protected void doSetItemNmFrom_Equal(String itemNmFrom) {
        regItemNmFrom(CK_EQ, itemNmFrom);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_NotEqual(String itemNmFrom) {
        doSetItemNmFrom_NotEqual(fRES(itemNmFrom));
    }

    protected void doSetItemNmFrom_NotEqual(String itemNmFrom) {
        regItemNmFrom(CK_NES, itemNmFrom);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_GreaterThan(String itemNmFrom) {
        regItemNmFrom(CK_GT, fRES(itemNmFrom));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_LessThan(String itemNmFrom) {
        regItemNmFrom(CK_LT, fRES(itemNmFrom));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_GreaterEqual(String itemNmFrom) {
        regItemNmFrom(CK_GE, fRES(itemNmFrom));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_LessEqual(String itemNmFrom) {
        regItemNmFrom(CK_LE, fRES(itemNmFrom));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFromList The collection of itemNmFrom as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_InScope(Collection<String> itemNmFromList) {
        doSetItemNmFrom_InScope(itemNmFromList);
    }

    protected void doSetItemNmFrom_InScope(Collection<String> itemNmFromList) {
        regINS(CK_INS, cTL(itemNmFromList), xgetCValueItemNmFrom(), "ITEM_NM_FROM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFromList The collection of itemNmFrom as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_NotInScope(Collection<String> itemNmFromList) {
        doSetItemNmFrom_NotInScope(itemNmFromList);
    }

    protected void doSetItemNmFrom_NotInScope(Collection<String> itemNmFromList) {
        regINS(CK_NINS, cTL(itemNmFromList), xgetCValueItemNmFrom(), "ITEM_NM_FROM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)} <br>
     * <pre>e.g. setItemNmFrom_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemNmFrom The value of itemNmFrom as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemNmFrom_LikeSearch(String itemNmFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemNmFrom), xgetCValueItemNmFrom(), "ITEM_NM_FROM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemNmFrom_NotLikeSearch(String itemNmFrom, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemNmFrom), xgetCValueItemNmFrom(), "ITEM_NM_FROM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     * @param itemNmFrom The value of itemNmFrom as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmFrom_PrefixSearch(String itemNmFrom) {
        setItemNmFrom_LikeSearch(itemNmFrom, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     */
    public void setItemNmFrom_IsNull() { regItemNmFrom(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     */
    public void setItemNmFrom_IsNullOrEmpty() { regItemNmFrom(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_NM_FROM: {varchar(100)}
     */
    public void setItemNmFrom_IsNotNull() { regItemNmFrom(CK_ISNN, DOBJ); }

    protected void regItemNmFrom(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemNmFrom(), "ITEM_NM_FROM"); }
    protected abstract ConditionValue xgetCValueItemNmFrom();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_Equal(String itemNmTo) {
        doSetItemNmTo_Equal(fRES(itemNmTo));
    }

    protected void doSetItemNmTo_Equal(String itemNmTo) {
        regItemNmTo(CK_EQ, itemNmTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_NotEqual(String itemNmTo) {
        doSetItemNmTo_NotEqual(fRES(itemNmTo));
    }

    protected void doSetItemNmTo_NotEqual(String itemNmTo) {
        regItemNmTo(CK_NES, itemNmTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_GreaterThan(String itemNmTo) {
        regItemNmTo(CK_GT, fRES(itemNmTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_LessThan(String itemNmTo) {
        regItemNmTo(CK_LT, fRES(itemNmTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_GreaterEqual(String itemNmTo) {
        regItemNmTo(CK_GE, fRES(itemNmTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_LessEqual(String itemNmTo) {
        regItemNmTo(CK_LE, fRES(itemNmTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmToList The collection of itemNmTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_InScope(Collection<String> itemNmToList) {
        doSetItemNmTo_InScope(itemNmToList);
    }

    protected void doSetItemNmTo_InScope(Collection<String> itemNmToList) {
        regINS(CK_INS, cTL(itemNmToList), xgetCValueItemNmTo(), "ITEM_NM_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmToList The collection of itemNmTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_NotInScope(Collection<String> itemNmToList) {
        doSetItemNmTo_NotInScope(itemNmToList);
    }

    protected void doSetItemNmTo_NotInScope(Collection<String> itemNmToList) {
        regINS(CK_NINS, cTL(itemNmToList), xgetCValueItemNmTo(), "ITEM_NM_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_TO: {varchar(100)} <br>
     * <pre>e.g. setItemNmTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemNmTo The value of itemNmTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemNmTo_LikeSearch(String itemNmTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemNmTo), xgetCValueItemNmTo(), "ITEM_NM_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemNmTo_NotLikeSearch(String itemNmTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemNmTo), xgetCValueItemNmTo(), "ITEM_NM_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     * @param itemNmTo The value of itemNmTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemNmTo_PrefixSearch(String itemNmTo) {
        setItemNmTo_LikeSearch(itemNmTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     */
    public void setItemNmTo_IsNull() { regItemNmTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     */
    public void setItemNmTo_IsNullOrEmpty() { regItemNmTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_NM_TO: {varchar(100)}
     */
    public void setItemNmTo_IsNotNull() { regItemNmTo(CK_ISNN, DOBJ); }

    protected void regItemNmTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemNmTo(), "ITEM_NM_TO"); }
    protected abstract ConditionValue xgetCValueItemNmTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_Equal(String fcflg) {
        doSetFcflg_Equal(fRES(fcflg));
    }

    protected void doSetFcflg_Equal(String fcflg) {
        regFcflg(CK_EQ, fcflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_NotEqual(String fcflg) {
        doSetFcflg_NotEqual(fRES(fcflg));
    }

    protected void doSetFcflg_NotEqual(String fcflg) {
        regFcflg(CK_NES, fcflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_GreaterThan(String fcflg) {
        regFcflg(CK_GT, fRES(fcflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_LessThan(String fcflg) {
        regFcflg(CK_LT, fRES(fcflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_GreaterEqual(String fcflg) {
        regFcflg(CK_GE, fRES(fcflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_LessEqual(String fcflg) {
        regFcflg(CK_LE, fRES(fcflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflgList The collection of fcflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_InScope(Collection<String> fcflgList) {
        doSetFcflg_InScope(fcflgList);
    }

    protected void doSetFcflg_InScope(Collection<String> fcflgList) {
        regINS(CK_INS, cTL(fcflgList), xgetCValueFcflg(), "FCFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflgList The collection of fcflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_NotInScope(Collection<String> fcflgList) {
        doSetFcflg_NotInScope(fcflgList);
    }

    protected void doSetFcflg_NotInScope(Collection<String> fcflgList) {
        regINS(CK_NINS, cTL(fcflgList), xgetCValueFcflg(), "FCFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)} <br>
     * <pre>e.g. setFcflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fcflg The value of fcflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFcflg_LikeSearch(String fcflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fcflg), xgetCValueFcflg(), "FCFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFcflg_NotLikeSearch(String fcflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fcflg), xgetCValueFcflg(), "FCFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FCFLG: {varchar(30)}
     * @param fcflg The value of fcflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFcflg_PrefixSearch(String fcflg) {
        setFcflg_LikeSearch(fcflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNull() { regFcflg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNullOrEmpty() { regFcflg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FCFLG: {varchar(30)}
     */
    public void setFcflg_IsNotNull() { regFcflg(CK_ISNN, DOBJ); }

    protected void regFcflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFcflg(), "FCFLG"); }
    protected abstract ConditionValue xgetCValueFcflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_Equal(String usernum3) {
        doSetUsernum3_Equal(fRES(usernum3));
    }

    protected void doSetUsernum3_Equal(String usernum3) {
        regUsernum3(CK_EQ, usernum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotEqual(String usernum3) {
        doSetUsernum3_NotEqual(fRES(usernum3));
    }

    protected void doSetUsernum3_NotEqual(String usernum3) {
        regUsernum3(CK_NES, usernum3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterThan(String usernum3) {
        regUsernum3(CK_GT, fRES(usernum3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_LessThan(String usernum3) {
        regUsernum3(CK_LT, fRES(usernum3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterEqual(String usernum3) {
        regUsernum3(CK_GE, fRES(usernum3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_LessEqual(String usernum3) {
        regUsernum3(CK_LE, fRES(usernum3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3List The collection of usernum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_InScope(Collection<String> usernum3List) {
        doSetUsernum3_InScope(usernum3List);
    }

    protected void doSetUsernum3_InScope(Collection<String> usernum3List) {
        regINS(CK_INS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3List The collection of usernum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotInScope(Collection<String> usernum3List) {
        doSetUsernum3_NotInScope(usernum3List);
    }

    protected void doSetUsernum3_NotInScope(Collection<String> usernum3List) {
        regINS(CK_NINS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30)} <br>
     * <pre>e.g. setUsernum3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usernum3 The value of usernum3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsernum3_LikeSearch(String usernum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usernum3), xgetCValueUsernum3(), "USERNUM3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsernum3_NotLikeSearch(String usernum3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usernum3), xgetCValueUsernum3(), "USERNUM3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERNUM3: {varchar(30)}
     * @param usernum3 The value of usernum3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_PrefixSearch(String usernum3) {
        setUsernum3_LikeSearch(usernum3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     */
    public void setUsernum3_IsNull() { regUsernum3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     */
    public void setUsernum3_IsNullOrEmpty() { regUsernum3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERNUM3: {varchar(30)}
     */
    public void setUsernum3_IsNotNull() { regUsernum3(CK_ISNN, DOBJ); }

    protected void regUsernum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum3(), "USERNUM3"); }
    protected abstract ConditionValue xgetCValueUsernum3();

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
    public HpSLCFunction<MMfrcvitemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMfrcvitemCB.class);
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
    public HpSLCFunction<MMfrcvitemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMfrcvitemCB.class);
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
    public HpSLCFunction<MMfrcvitemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMfrcvitemCB.class);
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
    public HpSLCFunction<MMfrcvitemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMfrcvitemCB.class);
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
    public HpSLCFunction<MMfrcvitemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMfrcvitemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMfrcvitemCB&gt;() {
     *     public void query(MMfrcvitemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMfrcvitemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMfrcvitemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvitemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMfrcvitemCQ sq);

    protected MMfrcvitemCB xcreateScalarConditionCB() {
        MMfrcvitemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMfrcvitemCB xcreateScalarConditionPartitionByCB() {
        MMfrcvitemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMfrcvitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RCVITEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMfrcvitemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMfrcvitemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMfrcvitemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RCVITEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMfrcvitemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMfrcvitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfrcvitemCB cb = new MMfrcvitemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMfrcvitemCQ sq);

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
    protected MMfrcvitemCB newMyCB() {
        return new MMfrcvitemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMfrcvitemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
