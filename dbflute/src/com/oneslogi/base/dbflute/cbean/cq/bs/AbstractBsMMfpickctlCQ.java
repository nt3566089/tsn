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
 * The abstract condition-query of M_MFPICKCTL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMfpickctlCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMfpickctlCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MFPICKCTL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_Equal(Long mfpickctlId) {
        doSetMfpickctlId_Equal(mfpickctlId);
    }

    protected void doSetMfpickctlId_Equal(Long mfpickctlId) {
        regMfpickctlId(CK_EQ, mfpickctlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_NotEqual(Long mfpickctlId) {
        doSetMfpickctlId_NotEqual(mfpickctlId);
    }

    protected void doSetMfpickctlId_NotEqual(Long mfpickctlId) {
        regMfpickctlId(CK_NES, mfpickctlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_GreaterThan(Long mfpickctlId) {
        regMfpickctlId(CK_GT, mfpickctlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_LessThan(Long mfpickctlId) {
        regMfpickctlId(CK_LT, mfpickctlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_GreaterEqual(Long mfpickctlId) {
        regMfpickctlId(CK_GE, mfpickctlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlId The value of mfpickctlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfpickctlId_LessEqual(Long mfpickctlId) {
        regMfpickctlId(CK_LE, mfpickctlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mfpickctlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mfpickctlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMfpickctlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMfpickctlId(), "MFPICKCTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlIdList The collection of mfpickctlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfpickctlId_InScope(Collection<Long> mfpickctlIdList) {
        doSetMfpickctlId_InScope(mfpickctlIdList);
    }

    protected void doSetMfpickctlId_InScope(Collection<Long> mfpickctlIdList) {
        regINS(CK_INS, cTL(mfpickctlIdList), xgetCValueMfpickctlId(), "MFPICKCTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfpickctlIdList The collection of mfpickctlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfpickctlId_NotInScope(Collection<Long> mfpickctlIdList) {
        doSetMfpickctlId_NotInScope(mfpickctlIdList);
    }

    protected void doSetMfpickctlId_NotInScope(Collection<Long> mfpickctlIdList) {
        regINS(CK_NINS, cTL(mfpickctlIdList), xgetCValueMfpickctlId(), "MFPICKCTL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfpickctlId_IsNull() { regMfpickctlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MFPICKCTL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfpickctlId_IsNotNull() { regMfpickctlId(CK_ISNN, DOBJ); }

    protected void regMfpickctlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMfpickctlId(), "MFPICKCTL_ID"); }
    protected abstract ConditionValue xgetCValueMfpickctlId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_Equal(String pickfrdate) {
        doSetPickfrdate_Equal(fRES(pickfrdate));
    }

    protected void doSetPickfrdate_Equal(String pickfrdate) {
        regPickfrdate(CK_EQ, pickfrdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_NotEqual(String pickfrdate) {
        doSetPickfrdate_NotEqual(fRES(pickfrdate));
    }

    protected void doSetPickfrdate_NotEqual(String pickfrdate) {
        regPickfrdate(CK_NES, pickfrdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_GreaterThan(String pickfrdate) {
        regPickfrdate(CK_GT, fRES(pickfrdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_LessThan(String pickfrdate) {
        regPickfrdate(CK_LT, fRES(pickfrdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_GreaterEqual(String pickfrdate) {
        regPickfrdate(CK_GE, fRES(pickfrdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_LessEqual(String pickfrdate) {
        regPickfrdate(CK_LE, fRES(pickfrdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdateList The collection of pickfrdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_InScope(Collection<String> pickfrdateList) {
        doSetPickfrdate_InScope(pickfrdateList);
    }

    protected void doSetPickfrdate_InScope(Collection<String> pickfrdateList) {
        regINS(CK_INS, cTL(pickfrdateList), xgetCValuePickfrdate(), "PICKFRDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdateList The collection of pickfrdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_NotInScope(Collection<String> pickfrdateList) {
        doSetPickfrdate_NotInScope(pickfrdateList);
    }

    protected void doSetPickfrdate_NotInScope(Collection<String> pickfrdateList) {
        regINS(CK_NINS, cTL(pickfrdateList), xgetCValuePickfrdate(), "PICKFRDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setPickfrdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickfrdate The value of pickfrdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickfrdate_LikeSearch(String pickfrdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickfrdate), xgetCValuePickfrdate(), "PICKFRDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickfrdate_NotLikeSearch(String pickfrdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickfrdate), xgetCValuePickfrdate(), "PICKFRDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKFRDATE: {NotNull, varchar(8)}
     * @param pickfrdate The value of pickfrdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickfrdate_PrefixSearch(String pickfrdate) {
        setPickfrdate_LikeSearch(pickfrdate, xcLSOPPre());
    }

    protected void regPickfrdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickfrdate(), "PICKFRDATE"); }
    protected abstract ConditionValue xgetCValuePickfrdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_Equal(String picktodate) {
        doSetPicktodate_Equal(fRES(picktodate));
    }

    protected void doSetPicktodate_Equal(String picktodate) {
        regPicktodate(CK_EQ, picktodate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_NotEqual(String picktodate) {
        doSetPicktodate_NotEqual(fRES(picktodate));
    }

    protected void doSetPicktodate_NotEqual(String picktodate) {
        regPicktodate(CK_NES, picktodate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_GreaterThan(String picktodate) {
        regPicktodate(CK_GT, fRES(picktodate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_LessThan(String picktodate) {
        regPicktodate(CK_LT, fRES(picktodate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_GreaterEqual(String picktodate) {
        regPicktodate(CK_GE, fRES(picktodate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_LessEqual(String picktodate) {
        regPicktodate(CK_LE, fRES(picktodate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodateList The collection of picktodate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_InScope(Collection<String> picktodateList) {
        doSetPicktodate_InScope(picktodateList);
    }

    protected void doSetPicktodate_InScope(Collection<String> picktodateList) {
        regINS(CK_INS, cTL(picktodateList), xgetCValuePicktodate(), "PICKTODATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodateList The collection of picktodate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_NotInScope(Collection<String> picktodateList) {
        doSetPicktodate_NotInScope(picktodateList);
    }

    protected void doSetPicktodate_NotInScope(Collection<String> picktodateList) {
        regINS(CK_NINS, cTL(picktodateList), xgetCValuePicktodate(), "PICKTODATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setPicktodate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picktodate The value of picktodate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicktodate_LikeSearch(String picktodate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picktodate), xgetCValuePicktodate(), "PICKTODATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicktodate_NotLikeSearch(String picktodate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picktodate), xgetCValuePicktodate(), "PICKTODATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKTODATE: {NotNull, varchar(8)}
     * @param picktodate The value of picktodate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicktodate_PrefixSearch(String picktodate) {
        setPicktodate_LikeSearch(picktodate, xcLSOPPre());
    }

    protected void regPicktodate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicktodate(), "PICKTODATE"); }
    protected abstract ConditionValue xgetCValuePicktodate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_Equal(String pickrank1) {
        doSetPickrank1_Equal(fRES(pickrank1));
    }

    protected void doSetPickrank1_Equal(String pickrank1) {
        regPickrank1(CK_EQ, pickrank1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_NotEqual(String pickrank1) {
        doSetPickrank1_NotEqual(fRES(pickrank1));
    }

    protected void doSetPickrank1_NotEqual(String pickrank1) {
        regPickrank1(CK_NES, pickrank1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_GreaterThan(String pickrank1) {
        regPickrank1(CK_GT, fRES(pickrank1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_LessThan(String pickrank1) {
        regPickrank1(CK_LT, fRES(pickrank1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_GreaterEqual(String pickrank1) {
        regPickrank1(CK_GE, fRES(pickrank1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_LessEqual(String pickrank1) {
        regPickrank1(CK_LE, fRES(pickrank1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1List The collection of pickrank1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_InScope(Collection<String> pickrank1List) {
        doSetPickrank1_InScope(pickrank1List);
    }

    protected void doSetPickrank1_InScope(Collection<String> pickrank1List) {
        regINS(CK_INS, cTL(pickrank1List), xgetCValuePickrank1(), "PICKRANK1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1List The collection of pickrank1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_NotInScope(Collection<String> pickrank1List) {
        doSetPickrank1_NotInScope(pickrank1List);
    }

    protected void doSetPickrank1_NotInScope(Collection<String> pickrank1List) {
        regINS(CK_NINS, cTL(pickrank1List), xgetCValuePickrank1(), "PICKRANK1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPickrank1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickrank1 The value of pickrank1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickrank1_LikeSearch(String pickrank1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickrank1), xgetCValuePickrank1(), "PICKRANK1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickrank1_NotLikeSearch(String pickrank1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickrank1), xgetCValuePickrank1(), "PICKRANK1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK1: {NotNull, varchar(30)}
     * @param pickrank1 The value of pickrank1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank1_PrefixSearch(String pickrank1) {
        setPickrank1_LikeSearch(pickrank1, xcLSOPPre());
    }

    protected void regPickrank1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickrank1(), "PICKRANK1"); }
    protected abstract ConditionValue xgetCValuePickrank1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_Equal(String pickrank2) {
        doSetPickrank2_Equal(fRES(pickrank2));
    }

    protected void doSetPickrank2_Equal(String pickrank2) {
        regPickrank2(CK_EQ, pickrank2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_NotEqual(String pickrank2) {
        doSetPickrank2_NotEqual(fRES(pickrank2));
    }

    protected void doSetPickrank2_NotEqual(String pickrank2) {
        regPickrank2(CK_NES, pickrank2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_GreaterThan(String pickrank2) {
        regPickrank2(CK_GT, fRES(pickrank2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_LessThan(String pickrank2) {
        regPickrank2(CK_LT, fRES(pickrank2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_GreaterEqual(String pickrank2) {
        regPickrank2(CK_GE, fRES(pickrank2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_LessEqual(String pickrank2) {
        regPickrank2(CK_LE, fRES(pickrank2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2List The collection of pickrank2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_InScope(Collection<String> pickrank2List) {
        doSetPickrank2_InScope(pickrank2List);
    }

    protected void doSetPickrank2_InScope(Collection<String> pickrank2List) {
        regINS(CK_INS, cTL(pickrank2List), xgetCValuePickrank2(), "PICKRANK2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2List The collection of pickrank2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_NotInScope(Collection<String> pickrank2List) {
        doSetPickrank2_NotInScope(pickrank2List);
    }

    protected void doSetPickrank2_NotInScope(Collection<String> pickrank2List) {
        regINS(CK_NINS, cTL(pickrank2List), xgetCValuePickrank2(), "PICKRANK2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK2: {varchar(30)} <br>
     * <pre>e.g. setPickrank2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickrank2 The value of pickrank2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickrank2_LikeSearch(String pickrank2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickrank2), xgetCValuePickrank2(), "PICKRANK2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickrank2_NotLikeSearch(String pickrank2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickrank2), xgetCValuePickrank2(), "PICKRANK2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK2: {varchar(30)}
     * @param pickrank2 The value of pickrank2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank2_PrefixSearch(String pickrank2) {
        setPickrank2_LikeSearch(pickrank2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     */
    public void setPickrank2_IsNull() { regPickrank2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     */
    public void setPickrank2_IsNullOrEmpty() { regPickrank2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKRANK2: {varchar(30)}
     */
    public void setPickrank2_IsNotNull() { regPickrank2(CK_ISNN, DOBJ); }

    protected void regPickrank2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickrank2(), "PICKRANK2"); }
    protected abstract ConditionValue xgetCValuePickrank2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_Equal(String pickrank3) {
        doSetPickrank3_Equal(fRES(pickrank3));
    }

    protected void doSetPickrank3_Equal(String pickrank3) {
        regPickrank3(CK_EQ, pickrank3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_NotEqual(String pickrank3) {
        doSetPickrank3_NotEqual(fRES(pickrank3));
    }

    protected void doSetPickrank3_NotEqual(String pickrank3) {
        regPickrank3(CK_NES, pickrank3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_GreaterThan(String pickrank3) {
        regPickrank3(CK_GT, fRES(pickrank3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_LessThan(String pickrank3) {
        regPickrank3(CK_LT, fRES(pickrank3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_GreaterEqual(String pickrank3) {
        regPickrank3(CK_GE, fRES(pickrank3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_LessEqual(String pickrank3) {
        regPickrank3(CK_LE, fRES(pickrank3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3List The collection of pickrank3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_InScope(Collection<String> pickrank3List) {
        doSetPickrank3_InScope(pickrank3List);
    }

    protected void doSetPickrank3_InScope(Collection<String> pickrank3List) {
        regINS(CK_INS, cTL(pickrank3List), xgetCValuePickrank3(), "PICKRANK3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3List The collection of pickrank3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_NotInScope(Collection<String> pickrank3List) {
        doSetPickrank3_NotInScope(pickrank3List);
    }

    protected void doSetPickrank3_NotInScope(Collection<String> pickrank3List) {
        regINS(CK_NINS, cTL(pickrank3List), xgetCValuePickrank3(), "PICKRANK3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK3: {varchar(30)} <br>
     * <pre>e.g. setPickrank3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickrank3 The value of pickrank3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickrank3_LikeSearch(String pickrank3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickrank3), xgetCValuePickrank3(), "PICKRANK3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickrank3_NotLikeSearch(String pickrank3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickrank3), xgetCValuePickrank3(), "PICKRANK3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK3: {varchar(30)}
     * @param pickrank3 The value of pickrank3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank3_PrefixSearch(String pickrank3) {
        setPickrank3_LikeSearch(pickrank3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     */
    public void setPickrank3_IsNull() { regPickrank3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     */
    public void setPickrank3_IsNullOrEmpty() { regPickrank3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKRANK3: {varchar(30)}
     */
    public void setPickrank3_IsNotNull() { regPickrank3(CK_ISNN, DOBJ); }

    protected void regPickrank3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickrank3(), "PICKRANK3"); }
    protected abstract ConditionValue xgetCValuePickrank3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_Equal(String pickrank4) {
        doSetPickrank4_Equal(fRES(pickrank4));
    }

    protected void doSetPickrank4_Equal(String pickrank4) {
        regPickrank4(CK_EQ, pickrank4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_NotEqual(String pickrank4) {
        doSetPickrank4_NotEqual(fRES(pickrank4));
    }

    protected void doSetPickrank4_NotEqual(String pickrank4) {
        regPickrank4(CK_NES, pickrank4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_GreaterThan(String pickrank4) {
        regPickrank4(CK_GT, fRES(pickrank4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_LessThan(String pickrank4) {
        regPickrank4(CK_LT, fRES(pickrank4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_GreaterEqual(String pickrank4) {
        regPickrank4(CK_GE, fRES(pickrank4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_LessEqual(String pickrank4) {
        regPickrank4(CK_LE, fRES(pickrank4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4List The collection of pickrank4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_InScope(Collection<String> pickrank4List) {
        doSetPickrank4_InScope(pickrank4List);
    }

    protected void doSetPickrank4_InScope(Collection<String> pickrank4List) {
        regINS(CK_INS, cTL(pickrank4List), xgetCValuePickrank4(), "PICKRANK4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4List The collection of pickrank4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_NotInScope(Collection<String> pickrank4List) {
        doSetPickrank4_NotInScope(pickrank4List);
    }

    protected void doSetPickrank4_NotInScope(Collection<String> pickrank4List) {
        regINS(CK_NINS, cTL(pickrank4List), xgetCValuePickrank4(), "PICKRANK4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK4: {varchar(30)} <br>
     * <pre>e.g. setPickrank4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickrank4 The value of pickrank4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickrank4_LikeSearch(String pickrank4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickrank4), xgetCValuePickrank4(), "PICKRANK4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickrank4_NotLikeSearch(String pickrank4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickrank4), xgetCValuePickrank4(), "PICKRANK4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK4: {varchar(30)}
     * @param pickrank4 The value of pickrank4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank4_PrefixSearch(String pickrank4) {
        setPickrank4_LikeSearch(pickrank4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     */
    public void setPickrank4_IsNull() { regPickrank4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     */
    public void setPickrank4_IsNullOrEmpty() { regPickrank4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKRANK4: {varchar(30)}
     */
    public void setPickrank4_IsNotNull() { regPickrank4(CK_ISNN, DOBJ); }

    protected void regPickrank4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickrank4(), "PICKRANK4"); }
    protected abstract ConditionValue xgetCValuePickrank4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_Equal(String pickrank5) {
        doSetPickrank5_Equal(fRES(pickrank5));
    }

    protected void doSetPickrank5_Equal(String pickrank5) {
        regPickrank5(CK_EQ, pickrank5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_NotEqual(String pickrank5) {
        doSetPickrank5_NotEqual(fRES(pickrank5));
    }

    protected void doSetPickrank5_NotEqual(String pickrank5) {
        regPickrank5(CK_NES, pickrank5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_GreaterThan(String pickrank5) {
        regPickrank5(CK_GT, fRES(pickrank5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_LessThan(String pickrank5) {
        regPickrank5(CK_LT, fRES(pickrank5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_GreaterEqual(String pickrank5) {
        regPickrank5(CK_GE, fRES(pickrank5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_LessEqual(String pickrank5) {
        regPickrank5(CK_LE, fRES(pickrank5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5List The collection of pickrank5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_InScope(Collection<String> pickrank5List) {
        doSetPickrank5_InScope(pickrank5List);
    }

    protected void doSetPickrank5_InScope(Collection<String> pickrank5List) {
        regINS(CK_INS, cTL(pickrank5List), xgetCValuePickrank5(), "PICKRANK5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5List The collection of pickrank5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_NotInScope(Collection<String> pickrank5List) {
        doSetPickrank5_NotInScope(pickrank5List);
    }

    protected void doSetPickrank5_NotInScope(Collection<String> pickrank5List) {
        regINS(CK_NINS, cTL(pickrank5List), xgetCValuePickrank5(), "PICKRANK5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK5: {varchar(30)} <br>
     * <pre>e.g. setPickrank5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickrank5 The value of pickrank5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickrank5_LikeSearch(String pickrank5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickrank5), xgetCValuePickrank5(), "PICKRANK5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickrank5_NotLikeSearch(String pickrank5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickrank5), xgetCValuePickrank5(), "PICKRANK5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKRANK5: {varchar(30)}
     * @param pickrank5 The value of pickrank5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickrank5_PrefixSearch(String pickrank5) {
        setPickrank5_LikeSearch(pickrank5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     */
    public void setPickrank5_IsNull() { regPickrank5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     */
    public void setPickrank5_IsNullOrEmpty() { regPickrank5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKRANK5: {varchar(30)}
     */
    public void setPickrank5_IsNotNull() { regPickrank5(CK_ISNN, DOBJ); }

    protected void regPickrank5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickrank5(), "PICKRANK5"); }
    protected abstract ConditionValue xgetCValuePickrank5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_Equal(String validtype) {
        doSetValidtype_Equal(fRES(validtype));
    }

    protected void doSetValidtype_Equal(String validtype) {
        regValidtype(CK_EQ, validtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_NotEqual(String validtype) {
        doSetValidtype_NotEqual(fRES(validtype));
    }

    protected void doSetValidtype_NotEqual(String validtype) {
        regValidtype(CK_NES, validtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_GreaterThan(String validtype) {
        regValidtype(CK_GT, fRES(validtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_LessThan(String validtype) {
        regValidtype(CK_LT, fRES(validtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_GreaterEqual(String validtype) {
        regValidtype(CK_GE, fRES(validtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_LessEqual(String validtype) {
        regValidtype(CK_LE, fRES(validtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtypeList The collection of validtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_InScope(Collection<String> validtypeList) {
        doSetValidtype_InScope(validtypeList);
    }

    protected void doSetValidtype_InScope(Collection<String> validtypeList) {
        regINS(CK_INS, cTL(validtypeList), xgetCValueValidtype(), "VALIDTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtypeList The collection of validtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_NotInScope(Collection<String> validtypeList) {
        doSetValidtype_NotInScope(validtypeList);
    }

    protected void doSetValidtype_NotInScope(Collection<String> validtypeList) {
        regINS(CK_NINS, cTL(validtypeList), xgetCValueValidtype(), "VALIDTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setValidtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param validtype The value of validtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setValidtype_LikeSearch(String validtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(validtype), xgetCValueValidtype(), "VALIDTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setValidtype_NotLikeSearch(String validtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(validtype), xgetCValueValidtype(), "VALIDTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VALIDTYPE: {NotNull, varchar(30)}
     * @param validtype The value of validtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setValidtype_PrefixSearch(String validtype) {
        setValidtype_LikeSearch(validtype, xcLSOPPre());
    }

    protected void regValidtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueValidtype(), "VALIDTYPE"); }
    protected abstract ConditionValue xgetCValueValidtype();

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
    public HpSLCFunction<MMfpickctlCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMfpickctlCB.class);
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
    public HpSLCFunction<MMfpickctlCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMfpickctlCB.class);
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
    public HpSLCFunction<MMfpickctlCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMfpickctlCB.class);
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
    public HpSLCFunction<MMfpickctlCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMfpickctlCB.class);
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
    public HpSLCFunction<MMfpickctlCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMfpickctlCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMfpickctlCB&gt;() {
     *     public void query(MMfpickctlCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMfpickctlCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMfpickctlCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfpickctlCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMfpickctlCQ sq);

    protected MMfpickctlCB xcreateScalarConditionCB() {
        MMfpickctlCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMfpickctlCB xcreateScalarConditionPartitionByCB() {
        MMfpickctlCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMfpickctlCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MFPICKCTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMfpickctlCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMfpickctlCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMfpickctlCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MFPICKCTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMfpickctlCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMfpickctlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfpickctlCB cb = new MMfpickctlCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMfpickctlCQ sq);

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
    protected MMfpickctlCB newMyCB() {
        return new MMfpickctlCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMfpickctlCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
