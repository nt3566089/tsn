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
 * The abstract condition-query of M_MFWHxITEM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMfwhxitemCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMfwhxitemCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MFWHxITEM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_Equal(Long mfwhItemId) {
        doSetMfwhItemId_Equal(mfwhItemId);
    }

    protected void doSetMfwhItemId_Equal(Long mfwhItemId) {
        regMfwhItemId(CK_EQ, mfwhItemId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_NotEqual(Long mfwhItemId) {
        doSetMfwhItemId_NotEqual(mfwhItemId);
    }

    protected void doSetMfwhItemId_NotEqual(Long mfwhItemId) {
        regMfwhItemId(CK_NES, mfwhItemId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_GreaterThan(Long mfwhItemId) {
        regMfwhItemId(CK_GT, mfwhItemId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_LessThan(Long mfwhItemId) {
        regMfwhItemId(CK_LT, mfwhItemId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_GreaterEqual(Long mfwhItemId) {
        regMfwhItemId(CK_GE, mfwhItemId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemId The value of mfwhItemId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMfwhItemId_LessEqual(Long mfwhItemId) {
        regMfwhItemId(CK_LE, mfwhItemId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of mfwhItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of mfwhItemId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMfwhItemId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMfwhItemId(), "MFWH_ITEM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemIdList The collection of mfwhItemId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfwhItemId_InScope(Collection<Long> mfwhItemIdList) {
        doSetMfwhItemId_InScope(mfwhItemIdList);
    }

    protected void doSetMfwhItemId_InScope(Collection<Long> mfwhItemIdList) {
        regINS(CK_INS, cTL(mfwhItemIdList), xgetCValueMfwhItemId(), "MFWH_ITEM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param mfwhItemIdList The collection of mfwhItemId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMfwhItemId_NotInScope(Collection<Long> mfwhItemIdList) {
        doSetMfwhItemId_NotInScope(mfwhItemIdList);
    }

    protected void doSetMfwhItemId_NotInScope(Collection<Long> mfwhItemIdList) {
        regINS(CK_NINS, cTL(mfwhItemIdList), xgetCValueMfwhItemId(), "MFWH_ITEM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfwhItemId_IsNull() { regMfwhItemId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MFWH_ITEM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMfwhItemId_IsNotNull() { regMfwhItemId(CK_ISNN, DOBJ); }

    protected void regMfwhItemId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMfwhItemId(), "MFWH_ITEM_ID"); }
    protected abstract ConditionValue xgetCValueMfwhItemId();

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
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_Equal(String slotlocname) {
        doSetSlotlocname_Equal(fRES(slotlocname));
    }

    protected void doSetSlotlocname_Equal(String slotlocname) {
        regSlotlocname(CK_EQ, slotlocname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_NotEqual(String slotlocname) {
        doSetSlotlocname_NotEqual(fRES(slotlocname));
    }

    protected void doSetSlotlocname_NotEqual(String slotlocname) {
        regSlotlocname(CK_NES, slotlocname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_GreaterThan(String slotlocname) {
        regSlotlocname(CK_GT, fRES(slotlocname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_LessThan(String slotlocname) {
        regSlotlocname(CK_LT, fRES(slotlocname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_GreaterEqual(String slotlocname) {
        regSlotlocname(CK_GE, fRES(slotlocname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_LessEqual(String slotlocname) {
        regSlotlocname(CK_LE, fRES(slotlocname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocnameList The collection of slotlocname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_InScope(Collection<String> slotlocnameList) {
        doSetSlotlocname_InScope(slotlocnameList);
    }

    protected void doSetSlotlocname_InScope(Collection<String> slotlocnameList) {
        regINS(CK_INS, cTL(slotlocnameList), xgetCValueSlotlocname(), "SLOTLOCNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocnameList The collection of slotlocname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_NotInScope(Collection<String> slotlocnameList) {
        doSetSlotlocname_NotInScope(slotlocnameList);
    }

    protected void doSetSlotlocname_NotInScope(Collection<String> slotlocnameList) {
        regINS(CK_NINS, cTL(slotlocnameList), xgetCValueSlotlocname(), "SLOTLOCNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)} <br>
     * <pre>e.g. setSlotlocname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slotlocname The value of slotlocname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlotlocname_LikeSearch(String slotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slotlocname), xgetCValueSlotlocname(), "SLOTLOCNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlotlocname_NotLikeSearch(String slotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slotlocname), xgetCValueSlotlocname(), "SLOTLOCNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     * @param slotlocname The value of slotlocname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotlocname_PrefixSearch(String slotlocname) {
        setSlotlocname_LikeSearch(slotlocname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNull() { regSlotlocname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNullOrEmpty() { regSlotlocname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTLOCNAME: {varchar(255)}
     */
    public void setSlotlocname_IsNotNull() { regSlotlocname(CK_ISNN, DOBJ); }

    protected void regSlotlocname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlotlocname(), "SLOTLOCNAME"); }
    protected abstract ConditionValue xgetCValueSlotlocname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_Equal(String picklocname) {
        doSetPicklocname_Equal(fRES(picklocname));
    }

    protected void doSetPicklocname_Equal(String picklocname) {
        regPicklocname(CK_EQ, picklocname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_NotEqual(String picklocname) {
        doSetPicklocname_NotEqual(fRES(picklocname));
    }

    protected void doSetPicklocname_NotEqual(String picklocname) {
        regPicklocname(CK_NES, picklocname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_GreaterThan(String picklocname) {
        regPicklocname(CK_GT, fRES(picklocname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_LessThan(String picklocname) {
        regPicklocname(CK_LT, fRES(picklocname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_GreaterEqual(String picklocname) {
        regPicklocname(CK_GE, fRES(picklocname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_LessEqual(String picklocname) {
        regPicklocname(CK_LE, fRES(picklocname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocnameList The collection of picklocname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_InScope(Collection<String> picklocnameList) {
        doSetPicklocname_InScope(picklocnameList);
    }

    protected void doSetPicklocname_InScope(Collection<String> picklocnameList) {
        regINS(CK_INS, cTL(picklocnameList), xgetCValuePicklocname(), "PICKLOCNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocnameList The collection of picklocname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_NotInScope(Collection<String> picklocnameList) {
        doSetPicklocname_NotInScope(picklocnameList);
    }

    protected void doSetPicklocname_NotInScope(Collection<String> picklocnameList) {
        regINS(CK_NINS, cTL(picklocnameList), xgetCValuePicklocname(), "PICKLOCNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLOCNAME: {varchar(255)} <br>
     * <pre>e.g. setPicklocname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param picklocname The value of picklocname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPicklocname_LikeSearch(String picklocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(picklocname), xgetCValuePicklocname(), "PICKLOCNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPicklocname_NotLikeSearch(String picklocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(picklocname), xgetCValuePicklocname(), "PICKLOCNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     * @param picklocname The value of picklocname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklocname_PrefixSearch(String picklocname) {
        setPicklocname_LikeSearch(picklocname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     */
    public void setPicklocname_IsNull() { regPicklocname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     */
    public void setPicklocname_IsNullOrEmpty() { regPicklocname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLOCNAME: {varchar(255)}
     */
    public void setPicklocname_IsNotNull() { regPicklocname(CK_ISNN, DOBJ); }

    protected void regPicklocname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklocname(), "PICKLOCNAME"); }
    protected abstract ConditionValue xgetCValuePicklocname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_Equal(String physicaltype) {
        doSetPhysicaltype_Equal(fRES(physicaltype));
    }

    protected void doSetPhysicaltype_Equal(String physicaltype) {
        regPhysicaltype(CK_EQ, physicaltype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_NotEqual(String physicaltype) {
        doSetPhysicaltype_NotEqual(fRES(physicaltype));
    }

    protected void doSetPhysicaltype_NotEqual(String physicaltype) {
        regPhysicaltype(CK_NES, physicaltype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_GreaterThan(String physicaltype) {
        regPhysicaltype(CK_GT, fRES(physicaltype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_LessThan(String physicaltype) {
        regPhysicaltype(CK_LT, fRES(physicaltype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_GreaterEqual(String physicaltype) {
        regPhysicaltype(CK_GE, fRES(physicaltype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_LessEqual(String physicaltype) {
        regPhysicaltype(CK_LE, fRES(physicaltype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltypeList The collection of physicaltype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_InScope(Collection<String> physicaltypeList) {
        doSetPhysicaltype_InScope(physicaltypeList);
    }

    protected void doSetPhysicaltype_InScope(Collection<String> physicaltypeList) {
        regINS(CK_INS, cTL(physicaltypeList), xgetCValuePhysicaltype(), "PHYSICALTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltypeList The collection of physicaltype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_NotInScope(Collection<String> physicaltypeList) {
        doSetPhysicaltype_NotInScope(physicaltypeList);
    }

    protected void doSetPhysicaltype_NotInScope(Collection<String> physicaltypeList) {
        regINS(CK_NINS, cTL(physicaltypeList), xgetCValuePhysicaltype(), "PHYSICALTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPhysicaltype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param physicaltype The value of physicaltype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhysicaltype_LikeSearch(String physicaltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(physicaltype), xgetCValuePhysicaltype(), "PHYSICALTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhysicaltype_NotLikeSearch(String physicaltype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(physicaltype), xgetCValuePhysicaltype(), "PHYSICALTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALTYPE: {NotNull, varchar(30)}
     * @param physicaltype The value of physicaltype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaltype_PrefixSearch(String physicaltype) {
        setPhysicaltype_LikeSearch(physicaltype, xcLSOPPre());
    }

    protected void regPhysicaltype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhysicaltype(), "PHYSICALTYPE"); }
    protected abstract ConditionValue xgetCValuePhysicaltype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_Equal(java.math.BigDecimal physicalcycle) {
        doSetPhysicalcycle_Equal(physicalcycle);
    }

    protected void doSetPhysicalcycle_Equal(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_EQ, physicalcycle);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_NotEqual(java.math.BigDecimal physicalcycle) {
        doSetPhysicalcycle_NotEqual(physicalcycle);
    }

    protected void doSetPhysicalcycle_NotEqual(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_NES, physicalcycle);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_GreaterThan(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_GT, physicalcycle);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_LessThan(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_LT, physicalcycle);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_GreaterEqual(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_GE, physicalcycle);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycle The value of physicalcycle as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPhysicalcycle_LessEqual(java.math.BigDecimal physicalcycle) {
        regPhysicalcycle(CK_LE, physicalcycle);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of physicalcycle. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of physicalcycle. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPhysicalcycle_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePhysicalcycle(), "PHYSICALCYCLE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycleList The collection of physicalcycle as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalcycle_InScope(Collection<java.math.BigDecimal> physicalcycleList) {
        doSetPhysicalcycle_InScope(physicalcycleList);
    }

    protected void doSetPhysicalcycle_InScope(Collection<java.math.BigDecimal> physicalcycleList) {
        regINS(CK_INS, cTL(physicalcycleList), xgetCValuePhysicalcycle(), "PHYSICALCYCLE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     * @param physicalcycleList The collection of physicalcycle as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalcycle_NotInScope(Collection<java.math.BigDecimal> physicalcycleList) {
        doSetPhysicalcycle_NotInScope(physicalcycleList);
    }

    protected void doSetPhysicalcycle_NotInScope(Collection<java.math.BigDecimal> physicalcycleList) {
        regINS(CK_NINS, cTL(physicalcycleList), xgetCValuePhysicalcycle(), "PHYSICALCYCLE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     */
    public void setPhysicalcycle_IsNull() { regPhysicalcycle(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHYSICALCYCLE: {decimal(16, 6), default=[(0)]}
     */
    public void setPhysicalcycle_IsNotNull() { regPhysicalcycle(CK_ISNN, DOBJ); }

    protected void regPhysicalcycle(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhysicalcycle(), "PHYSICALCYCLE"); }
    protected abstract ConditionValue xgetCValuePhysicalcycle();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_Equal(String physicalgroup) {
        doSetPhysicalgroup_Equal(fRES(physicalgroup));
    }

    protected void doSetPhysicalgroup_Equal(String physicalgroup) {
        regPhysicalgroup(CK_EQ, physicalgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_NotEqual(String physicalgroup) {
        doSetPhysicalgroup_NotEqual(fRES(physicalgroup));
    }

    protected void doSetPhysicalgroup_NotEqual(String physicalgroup) {
        regPhysicalgroup(CK_NES, physicalgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_GreaterThan(String physicalgroup) {
        regPhysicalgroup(CK_GT, fRES(physicalgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_LessThan(String physicalgroup) {
        regPhysicalgroup(CK_LT, fRES(physicalgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_GreaterEqual(String physicalgroup) {
        regPhysicalgroup(CK_GE, fRES(physicalgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_LessEqual(String physicalgroup) {
        regPhysicalgroup(CK_LE, fRES(physicalgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroupList The collection of physicalgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_InScope(Collection<String> physicalgroupList) {
        doSetPhysicalgroup_InScope(physicalgroupList);
    }

    protected void doSetPhysicalgroup_InScope(Collection<String> physicalgroupList) {
        regINS(CK_INS, cTL(physicalgroupList), xgetCValuePhysicalgroup(), "PHYSICALGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroupList The collection of physicalgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_NotInScope(Collection<String> physicalgroupList) {
        doSetPhysicalgroup_NotInScope(physicalgroupList);
    }

    protected void doSetPhysicalgroup_NotInScope(Collection<String> physicalgroupList) {
        regINS(CK_NINS, cTL(physicalgroupList), xgetCValuePhysicalgroup(), "PHYSICALGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALGROUP: {varchar(60)} <br>
     * <pre>e.g. setPhysicalgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param physicalgroup The value of physicalgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhysicalgroup_LikeSearch(String physicalgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(physicalgroup), xgetCValuePhysicalgroup(), "PHYSICALGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhysicalgroup_NotLikeSearch(String physicalgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(physicalgroup), xgetCValuePhysicalgroup(), "PHYSICALGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     * @param physicalgroup The value of physicalgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicalgroup_PrefixSearch(String physicalgroup) {
        setPhysicalgroup_LikeSearch(physicalgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     */
    public void setPhysicalgroup_IsNull() { regPhysicalgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     */
    public void setPhysicalgroup_IsNullOrEmpty() { regPhysicalgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHYSICALGROUP: {varchar(60)}
     */
    public void setPhysicalgroup_IsNotNull() { regPhysicalgroup(CK_ISNN, DOBJ); }

    protected void regPhysicalgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhysicalgroup(), "PHYSICALGROUP"); }
    protected abstract ConditionValue xgetCValuePhysicalgroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_Equal(String physicaldate) {
        doSetPhysicaldate_Equal(fRES(physicaldate));
    }

    protected void doSetPhysicaldate_Equal(String physicaldate) {
        regPhysicaldate(CK_EQ, physicaldate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_NotEqual(String physicaldate) {
        doSetPhysicaldate_NotEqual(fRES(physicaldate));
    }

    protected void doSetPhysicaldate_NotEqual(String physicaldate) {
        regPhysicaldate(CK_NES, physicaldate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_GreaterThan(String physicaldate) {
        regPhysicaldate(CK_GT, fRES(physicaldate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_LessThan(String physicaldate) {
        regPhysicaldate(CK_LT, fRES(physicaldate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_GreaterEqual(String physicaldate) {
        regPhysicaldate(CK_GE, fRES(physicaldate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_LessEqual(String physicaldate) {
        regPhysicaldate(CK_LE, fRES(physicaldate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldateList The collection of physicaldate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_InScope(Collection<String> physicaldateList) {
        doSetPhysicaldate_InScope(physicaldateList);
    }

    protected void doSetPhysicaldate_InScope(Collection<String> physicaldateList) {
        regINS(CK_INS, cTL(physicaldateList), xgetCValuePhysicaldate(), "PHYSICALDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldateList The collection of physicaldate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_NotInScope(Collection<String> physicaldateList) {
        doSetPhysicaldate_NotInScope(physicaldateList);
    }

    protected void doSetPhysicaldate_NotInScope(Collection<String> physicaldateList) {
        regINS(CK_NINS, cTL(physicaldateList), xgetCValuePhysicaldate(), "PHYSICALDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALDATE: {varchar(8)} <br>
     * <pre>e.g. setPhysicaldate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param physicaldate The value of physicaldate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhysicaldate_LikeSearch(String physicaldate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(physicaldate), xgetCValuePhysicaldate(), "PHYSICALDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhysicaldate_NotLikeSearch(String physicaldate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(physicaldate), xgetCValuePhysicaldate(), "PHYSICALDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     * @param physicaldate The value of physicaldate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhysicaldate_PrefixSearch(String physicaldate) {
        setPhysicaldate_LikeSearch(physicaldate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     */
    public void setPhysicaldate_IsNull() { regPhysicaldate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     */
    public void setPhysicaldate_IsNullOrEmpty() { regPhysicaldate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHYSICALDATE: {varchar(8)}
     */
    public void setPhysicaldate_IsNotNull() { regPhysicaldate(CK_ISNN, DOBJ); }

    protected void regPhysicaldate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhysicaldate(), "PHYSICALDATE"); }
    protected abstract ConditionValue xgetCValuePhysicaldate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_Equal(String reordertype) {
        doSetReordertype_Equal(fRES(reordertype));
    }

    protected void doSetReordertype_Equal(String reordertype) {
        regReordertype(CK_EQ, reordertype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_NotEqual(String reordertype) {
        doSetReordertype_NotEqual(fRES(reordertype));
    }

    protected void doSetReordertype_NotEqual(String reordertype) {
        regReordertype(CK_NES, reordertype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_GreaterThan(String reordertype) {
        regReordertype(CK_GT, fRES(reordertype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_LessThan(String reordertype) {
        regReordertype(CK_LT, fRES(reordertype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_GreaterEqual(String reordertype) {
        regReordertype(CK_GE, fRES(reordertype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_LessEqual(String reordertype) {
        regReordertype(CK_LE, fRES(reordertype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertypeList The collection of reordertype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_InScope(Collection<String> reordertypeList) {
        doSetReordertype_InScope(reordertypeList);
    }

    protected void doSetReordertype_InScope(Collection<String> reordertypeList) {
        regINS(CK_INS, cTL(reordertypeList), xgetCValueReordertype(), "REORDERTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertypeList The collection of reordertype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_NotInScope(Collection<String> reordertypeList) {
        doSetReordertype_NotInScope(reordertypeList);
    }

    protected void doSetReordertype_NotInScope(Collection<String> reordertypeList) {
        regINS(CK_NINS, cTL(reordertypeList), xgetCValueReordertype(), "REORDERTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setReordertype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reordertype The value of reordertype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReordertype_LikeSearch(String reordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reordertype), xgetCValueReordertype(), "REORDERTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReordertype_NotLikeSearch(String reordertype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reordertype), xgetCValueReordertype(), "REORDERTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERTYPE: {NotNull, varchar(30)}
     * @param reordertype The value of reordertype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReordertype_PrefixSearch(String reordertype) {
        setReordertype_LikeSearch(reordertype, xcLSOPPre());
    }

    protected void regReordertype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReordertype(), "REORDERTYPE"); }
    protected abstract ConditionValue xgetCValueReordertype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_Equal(java.math.BigDecimal reorderinterval) {
        doSetReorderinterval_Equal(reorderinterval);
    }

    protected void doSetReorderinterval_Equal(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_EQ, reorderinterval);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_NotEqual(java.math.BigDecimal reorderinterval) {
        doSetReorderinterval_NotEqual(reorderinterval);
    }

    protected void doSetReorderinterval_NotEqual(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_NES, reorderinterval);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_GreaterThan(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_GT, reorderinterval);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_LessThan(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_LT, reorderinterval);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_GreaterEqual(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_GE, reorderinterval);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderinterval The value of reorderinterval as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderinterval_LessEqual(java.math.BigDecimal reorderinterval) {
        regReorderinterval(CK_LE, reorderinterval);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of reorderinterval. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reorderinterval. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReorderinterval_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReorderinterval(), "REORDERINTERVAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderintervalList The collection of reorderinterval as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderinterval_InScope(Collection<java.math.BigDecimal> reorderintervalList) {
        doSetReorderinterval_InScope(reorderintervalList);
    }

    protected void doSetReorderinterval_InScope(Collection<java.math.BigDecimal> reorderintervalList) {
        regINS(CK_INS, cTL(reorderintervalList), xgetCValueReorderinterval(), "REORDERINTERVAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     * @param reorderintervalList The collection of reorderinterval as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderinterval_NotInScope(Collection<java.math.BigDecimal> reorderintervalList) {
        doSetReorderinterval_NotInScope(reorderintervalList);
    }

    protected void doSetReorderinterval_NotInScope(Collection<java.math.BigDecimal> reorderintervalList) {
        regINS(CK_NINS, cTL(reorderintervalList), xgetCValueReorderinterval(), "REORDERINTERVAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderinterval_IsNull() { regReorderinterval(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REORDERINTERVAL: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderinterval_IsNotNull() { regReorderinterval(CK_ISNN, DOBJ); }

    protected void regReorderinterval(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReorderinterval(), "REORDERINTERVAL"); }
    protected abstract ConditionValue xgetCValueReorderinterval();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_Equal(java.math.BigDecimal reorderpoint) {
        doSetReorderpoint_Equal(reorderpoint);
    }

    protected void doSetReorderpoint_Equal(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_EQ, reorderpoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_NotEqual(java.math.BigDecimal reorderpoint) {
        doSetReorderpoint_NotEqual(reorderpoint);
    }

    protected void doSetReorderpoint_NotEqual(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_NES, reorderpoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_GreaterThan(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_GT, reorderpoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_LessThan(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_LT, reorderpoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_GreaterEqual(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_GE, reorderpoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpoint The value of reorderpoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderpoint_LessEqual(java.math.BigDecimal reorderpoint) {
        regReorderpoint(CK_LE, reorderpoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of reorderpoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reorderpoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReorderpoint_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReorderpoint(), "REORDERPOINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpointList The collection of reorderpoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderpoint_InScope(Collection<java.math.BigDecimal> reorderpointList) {
        doSetReorderpoint_InScope(reorderpointList);
    }

    protected void doSetReorderpoint_InScope(Collection<java.math.BigDecimal> reorderpointList) {
        regINS(CK_INS, cTL(reorderpointList), xgetCValueReorderpoint(), "REORDERPOINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     * @param reorderpointList The collection of reorderpoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderpoint_NotInScope(Collection<java.math.BigDecimal> reorderpointList) {
        doSetReorderpoint_NotInScope(reorderpointList);
    }

    protected void doSetReorderpoint_NotInScope(Collection<java.math.BigDecimal> reorderpointList) {
        regINS(CK_NINS, cTL(reorderpointList), xgetCValueReorderpoint(), "REORDERPOINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderpoint_IsNull() { regReorderpoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REORDERPOINT: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderpoint_IsNotNull() { regReorderpoint(CK_ISNN, DOBJ); }

    protected void regReorderpoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReorderpoint(), "REORDERPOINT"); }
    protected abstract ConditionValue xgetCValueReorderpoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_Equal(java.math.BigDecimal reorderqty) {
        doSetReorderqty_Equal(reorderqty);
    }

    protected void doSetReorderqty_Equal(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_EQ, reorderqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_NotEqual(java.math.BigDecimal reorderqty) {
        doSetReorderqty_NotEqual(reorderqty);
    }

    protected void doSetReorderqty_NotEqual(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_NES, reorderqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_GreaterThan(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_GT, reorderqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_LessThan(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_LT, reorderqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_GreaterEqual(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_GE, reorderqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqty The value of reorderqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderqty_LessEqual(java.math.BigDecimal reorderqty) {
        regReorderqty(CK_LE, reorderqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of reorderqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reorderqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReorderqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReorderqty(), "REORDERQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqtyList The collection of reorderqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderqty_InScope(Collection<java.math.BigDecimal> reorderqtyList) {
        doSetReorderqty_InScope(reorderqtyList);
    }

    protected void doSetReorderqty_InScope(Collection<java.math.BigDecimal> reorderqtyList) {
        regINS(CK_INS, cTL(reorderqtyList), xgetCValueReorderqty(), "REORDERQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     * @param reorderqtyList The collection of reorderqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderqty_NotInScope(Collection<java.math.BigDecimal> reorderqtyList) {
        doSetReorderqty_NotInScope(reorderqtyList);
    }

    protected void doSetReorderqty_NotInScope(Collection<java.math.BigDecimal> reorderqtyList) {
        regINS(CK_NINS, cTL(reorderqtyList), xgetCValueReorderqty(), "REORDERQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderqty_IsNull() { regReorderqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REORDERQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderqty_IsNotNull() { regReorderqty(CK_ISNN, DOBJ); }

    protected void regReorderqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReorderqty(), "REORDERQTY"); }
    protected abstract ConditionValue xgetCValueReorderqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_Equal(java.math.BigDecimal reorderleadtime) {
        doSetReorderleadtime_Equal(reorderleadtime);
    }

    protected void doSetReorderleadtime_Equal(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_EQ, reorderleadtime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_NotEqual(java.math.BigDecimal reorderleadtime) {
        doSetReorderleadtime_NotEqual(reorderleadtime);
    }

    protected void doSetReorderleadtime_NotEqual(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_NES, reorderleadtime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_GreaterThan(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_GT, reorderleadtime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_LessThan(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_LT, reorderleadtime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_GreaterEqual(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_GE, reorderleadtime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtime The value of reorderleadtime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReorderleadtime_LessEqual(java.math.BigDecimal reorderleadtime) {
        regReorderleadtime(CK_LE, reorderleadtime);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of reorderleadtime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reorderleadtime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReorderleadtime_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReorderleadtime(), "REORDERLEADTIME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtimeList The collection of reorderleadtime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderleadtime_InScope(Collection<java.math.BigDecimal> reorderleadtimeList) {
        doSetReorderleadtime_InScope(reorderleadtimeList);
    }

    protected void doSetReorderleadtime_InScope(Collection<java.math.BigDecimal> reorderleadtimeList) {
        regINS(CK_INS, cTL(reorderleadtimeList), xgetCValueReorderleadtime(), "REORDERLEADTIME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     * @param reorderleadtimeList The collection of reorderleadtime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderleadtime_NotInScope(Collection<java.math.BigDecimal> reorderleadtimeList) {
        doSetReorderleadtime_NotInScope(reorderleadtimeList);
    }

    protected void doSetReorderleadtime_NotInScope(Collection<java.math.BigDecimal> reorderleadtimeList) {
        regINS(CK_NINS, cTL(reorderleadtimeList), xgetCValueReorderleadtime(), "REORDERLEADTIME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderleadtime_IsNull() { regReorderleadtime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REORDERLEADTIME: {decimal(16, 6), default=[(0)]}
     */
    public void setReorderleadtime_IsNotNull() { regReorderleadtime(CK_ISNN, DOBJ); }

    protected void regReorderleadtime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReorderleadtime(), "REORDERLEADTIME"); }
    protected abstract ConditionValue xgetCValueReorderleadtime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_Equal(String reorderlastday) {
        doSetReorderlastday_Equal(fRES(reorderlastday));
    }

    protected void doSetReorderlastday_Equal(String reorderlastday) {
        regReorderlastday(CK_EQ, reorderlastday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_NotEqual(String reorderlastday) {
        doSetReorderlastday_NotEqual(fRES(reorderlastday));
    }

    protected void doSetReorderlastday_NotEqual(String reorderlastday) {
        regReorderlastday(CK_NES, reorderlastday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_GreaterThan(String reorderlastday) {
        regReorderlastday(CK_GT, fRES(reorderlastday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_LessThan(String reorderlastday) {
        regReorderlastday(CK_LT, fRES(reorderlastday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_GreaterEqual(String reorderlastday) {
        regReorderlastday(CK_GE, fRES(reorderlastday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_LessEqual(String reorderlastday) {
        regReorderlastday(CK_LE, fRES(reorderlastday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastdayList The collection of reorderlastday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_InScope(Collection<String> reorderlastdayList) {
        doSetReorderlastday_InScope(reorderlastdayList);
    }

    protected void doSetReorderlastday_InScope(Collection<String> reorderlastdayList) {
        regINS(CK_INS, cTL(reorderlastdayList), xgetCValueReorderlastday(), "REORDERLASTDAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastdayList The collection of reorderlastday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_NotInScope(Collection<String> reorderlastdayList) {
        doSetReorderlastday_NotInScope(reorderlastdayList);
    }

    protected void doSetReorderlastday_NotInScope(Collection<String> reorderlastdayList) {
        regINS(CK_NINS, cTL(reorderlastdayList), xgetCValueReorderlastday(), "REORDERLASTDAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERLASTDAY: {varchar(8)} <br>
     * <pre>e.g. setReorderlastday_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reorderlastday The value of reorderlastday as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReorderlastday_LikeSearch(String reorderlastday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reorderlastday), xgetCValueReorderlastday(), "REORDERLASTDAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReorderlastday_NotLikeSearch(String reorderlastday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reorderlastday), xgetCValueReorderlastday(), "REORDERLASTDAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     * @param reorderlastday The value of reorderlastday as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReorderlastday_PrefixSearch(String reorderlastday) {
        setReorderlastday_LikeSearch(reorderlastday, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     */
    public void setReorderlastday_IsNull() { regReorderlastday(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     */
    public void setReorderlastday_IsNullOrEmpty() { regReorderlastday(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REORDERLASTDAY: {varchar(8)}
     */
    public void setReorderlastday_IsNotNull() { regReorderlastday(CK_ISNN, DOBJ); }

    protected void regReorderlastday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReorderlastday(), "REORDERLASTDAY"); }
    protected abstract ConditionValue xgetCValueReorderlastday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNull() { regSuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNullOrEmpty() { regSuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERCD: {varchar(30)}
     */
    public void setSuppliercd_IsNotNull() { regSuppliercd(CK_ISNN, DOBJ); }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_Equal(java.math.BigDecimal replenishpoint) {
        doSetReplenishpoint_Equal(replenishpoint);
    }

    protected void doSetReplenishpoint_Equal(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_EQ, replenishpoint);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_NotEqual(java.math.BigDecimal replenishpoint) {
        doSetReplenishpoint_NotEqual(replenishpoint);
    }

    protected void doSetReplenishpoint_NotEqual(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_NES, replenishpoint);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_GreaterThan(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_GT, replenishpoint);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_LessThan(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_LT, replenishpoint);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_GreaterEqual(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_GE, replenishpoint);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpoint The value of replenishpoint as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishpoint_LessEqual(java.math.BigDecimal replenishpoint) {
        regReplenishpoint(CK_LE, replenishpoint);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of replenishpoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishpoint. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishpoint_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishpoint(), "REPLENISHPOINT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpointList The collection of replenishpoint as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishpoint_InScope(Collection<java.math.BigDecimal> replenishpointList) {
        doSetReplenishpoint_InScope(replenishpointList);
    }

    protected void doSetReplenishpoint_InScope(Collection<java.math.BigDecimal> replenishpointList) {
        regINS(CK_INS, cTL(replenishpointList), xgetCValueReplenishpoint(), "REPLENISHPOINT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     * @param replenishpointList The collection of replenishpoint as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishpoint_NotInScope(Collection<java.math.BigDecimal> replenishpointList) {
        doSetReplenishpoint_NotInScope(replenishpointList);
    }

    protected void doSetReplenishpoint_NotInScope(Collection<java.math.BigDecimal> replenishpointList) {
        regINS(CK_NINS, cTL(replenishpointList), xgetCValueReplenishpoint(), "REPLENISHPOINT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     */
    public void setReplenishpoint_IsNull() { regReplenishpoint(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISHPOINT: {decimal(16, 6), default=[(0)]}
     */
    public void setReplenishpoint_IsNotNull() { regReplenishpoint(CK_ISNN, DOBJ); }

    protected void regReplenishpoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishpoint(), "REPLENISHPOINT"); }
    protected abstract ConditionValue xgetCValueReplenishpoint();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_Equal(java.math.BigDecimal maxqty) {
        doSetMaxqty_Equal(maxqty);
    }

    protected void doSetMaxqty_Equal(java.math.BigDecimal maxqty) {
        regMaxqty(CK_EQ, maxqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_NotEqual(java.math.BigDecimal maxqty) {
        doSetMaxqty_NotEqual(maxqty);
    }

    protected void doSetMaxqty_NotEqual(java.math.BigDecimal maxqty) {
        regMaxqty(CK_NES, maxqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_GreaterThan(java.math.BigDecimal maxqty) {
        regMaxqty(CK_GT, maxqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_LessThan(java.math.BigDecimal maxqty) {
        regMaxqty(CK_LT, maxqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_GreaterEqual(java.math.BigDecimal maxqty) {
        regMaxqty(CK_GE, maxqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqty The value of maxqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxqty_LessEqual(java.math.BigDecimal maxqty) {
        regMaxqty(CK_LE, maxqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of maxqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxqty(), "MAXQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqtyList The collection of maxqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxqty_InScope(Collection<java.math.BigDecimal> maxqtyList) {
        doSetMaxqty_InScope(maxqtyList);
    }

    protected void doSetMaxqty_InScope(Collection<java.math.BigDecimal> maxqtyList) {
        regINS(CK_INS, cTL(maxqtyList), xgetCValueMaxqty(), "MAXQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     * @param maxqtyList The collection of maxqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxqty_NotInScope(Collection<java.math.BigDecimal> maxqtyList) {
        doSetMaxqty_NotInScope(maxqtyList);
    }

    protected void doSetMaxqty_NotInScope(Collection<java.math.BigDecimal> maxqtyList) {
        regINS(CK_NINS, cTL(maxqtyList), xgetCValueMaxqty(), "MAXQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setMaxqty_IsNull() { regMaxqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAXQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setMaxqty_IsNotNull() { regMaxqty(CK_ISNN, DOBJ); }

    protected void regMaxqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxqty(), "MAXQTY"); }
    protected abstract ConditionValue xgetCValueMaxqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_Equal(String causeloc) {
        doSetCauseloc_Equal(fRES(causeloc));
    }

    protected void doSetCauseloc_Equal(String causeloc) {
        regCauseloc(CK_EQ, causeloc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_NotEqual(String causeloc) {
        doSetCauseloc_NotEqual(fRES(causeloc));
    }

    protected void doSetCauseloc_NotEqual(String causeloc) {
        regCauseloc(CK_NES, causeloc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_GreaterThan(String causeloc) {
        regCauseloc(CK_GT, fRES(causeloc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_LessThan(String causeloc) {
        regCauseloc(CK_LT, fRES(causeloc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_GreaterEqual(String causeloc) {
        regCauseloc(CK_GE, fRES(causeloc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_LessEqual(String causeloc) {
        regCauseloc(CK_LE, fRES(causeloc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causelocList The collection of causeloc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_InScope(Collection<String> causelocList) {
        doSetCauseloc_InScope(causelocList);
    }

    protected void doSetCauseloc_InScope(Collection<String> causelocList) {
        regINS(CK_INS, cTL(causelocList), xgetCValueCauseloc(), "CAUSELOC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causelocList The collection of causeloc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_NotInScope(Collection<String> causelocList) {
        doSetCauseloc_NotInScope(causelocList);
    }

    protected void doSetCauseloc_NotInScope(Collection<String> causelocList) {
        regINS(CK_NINS, cTL(causelocList), xgetCValueCauseloc(), "CAUSELOC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAUSELOC: {varchar(255)} <br>
     * <pre>e.g. setCauseloc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param causeloc The value of causeloc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCauseloc_LikeSearch(String causeloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(causeloc), xgetCValueCauseloc(), "CAUSELOC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCauseloc_NotLikeSearch(String causeloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(causeloc), xgetCValueCauseloc(), "CAUSELOC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAUSELOC: {varchar(255)}
     * @param causeloc The value of causeloc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCauseloc_PrefixSearch(String causeloc) {
        setCauseloc_LikeSearch(causeloc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     */
    public void setCauseloc_IsNull() { regCauseloc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     */
    public void setCauseloc_IsNullOrEmpty() { regCauseloc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CAUSELOC: {varchar(255)}
     */
    public void setCauseloc_IsNotNull() { regCauseloc(CK_ISNN, DOBJ); }

    protected void regCauseloc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCauseloc(), "CAUSELOC"); }
    protected abstract ConditionValue xgetCValueCauseloc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_Equal(String shippingtype) {
        doSetShippingtype_Equal(fRES(shippingtype));
    }

    protected void doSetShippingtype_Equal(String shippingtype) {
        regShippingtype(CK_EQ, shippingtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_NotEqual(String shippingtype) {
        doSetShippingtype_NotEqual(fRES(shippingtype));
    }

    protected void doSetShippingtype_NotEqual(String shippingtype) {
        regShippingtype(CK_NES, shippingtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_GreaterThan(String shippingtype) {
        regShippingtype(CK_GT, fRES(shippingtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_LessThan(String shippingtype) {
        regShippingtype(CK_LT, fRES(shippingtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_GreaterEqual(String shippingtype) {
        regShippingtype(CK_GE, fRES(shippingtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_LessEqual(String shippingtype) {
        regShippingtype(CK_LE, fRES(shippingtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtypeList The collection of shippingtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_InScope(Collection<String> shippingtypeList) {
        doSetShippingtype_InScope(shippingtypeList);
    }

    protected void doSetShippingtype_InScope(Collection<String> shippingtypeList) {
        regINS(CK_INS, cTL(shippingtypeList), xgetCValueShippingtype(), "SHIPPINGTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtypeList The collection of shippingtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_NotInScope(Collection<String> shippingtypeList) {
        doSetShippingtype_NotInScope(shippingtypeList);
    }

    protected void doSetShippingtype_NotInScope(Collection<String> shippingtypeList) {
        regINS(CK_NINS, cTL(shippingtypeList), xgetCValueShippingtype(), "SHIPPINGTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)} <br>
     * <pre>e.g. setShippingtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingtype The value of shippingtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingtype_LikeSearch(String shippingtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingtype), xgetCValueShippingtype(), "SHIPPINGTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingtype_NotLikeSearch(String shippingtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingtype), xgetCValueShippingtype(), "SHIPPINGTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     * @param shippingtype The value of shippingtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingtype_PrefixSearch(String shippingtype) {
        setShippingtype_LikeSearch(shippingtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     */
    public void setShippingtype_IsNull() { regShippingtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     */
    public void setShippingtype_IsNullOrEmpty() { regShippingtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPINGTYPE: {varchar(30)}
     */
    public void setShippingtype_IsNotNull() { regShippingtype(CK_ISNN, DOBJ); }

    protected void regShippingtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingtype(), "SHIPPINGTYPE"); }
    protected abstract ConditionValue xgetCValueShippingtype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_Equal(java.math.BigDecimal slotpolicykey) {
        doSetSlotpolicykey_Equal(slotpolicykey);
    }

    protected void doSetSlotpolicykey_Equal(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_EQ, slotpolicykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_NotEqual(java.math.BigDecimal slotpolicykey) {
        doSetSlotpolicykey_NotEqual(slotpolicykey);
    }

    protected void doSetSlotpolicykey_NotEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_NES, slotpolicykey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_GreaterThan(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_GT, slotpolicykey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_LessThan(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_LT, slotpolicykey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_GreaterEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_GE, slotpolicykey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykey The value of slotpolicykey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlotpolicykey_LessEqual(java.math.BigDecimal slotpolicykey) {
        regSlotpolicykey(CK_LE, slotpolicykey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param minNumber The min number of slotpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slotpolicykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlotpolicykey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlotpolicykey(), "SLOTPOLICYKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykeyList The collection of slotpolicykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotpolicykey_InScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        doSetSlotpolicykey_InScope(slotpolicykeyList);
    }

    protected void doSetSlotpolicykey_InScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        regINS(CK_INS, cTL(slotpolicykeyList), xgetCValueSlotpolicykey(), "SLOTPOLICYKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     * @param slotpolicykeyList The collection of slotpolicykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlotpolicykey_NotInScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        doSetSlotpolicykey_NotInScope(slotpolicykeyList);
    }

    protected void doSetSlotpolicykey_NotInScope(Collection<java.math.BigDecimal> slotpolicykeyList) {
        regINS(CK_NINS, cTL(slotpolicykeyList), xgetCValueSlotpolicykey(), "SLOTPOLICYKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     */
    public void setSlotpolicykey_IsNull() { regSlotpolicykey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLOTPOLICYKEY: {decimal(16, 6)}
     */
    public void setSlotpolicykey_IsNotNull() { regSlotpolicykey(CK_ISNN, DOBJ); }

    protected void regSlotpolicykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlotpolicykey(), "SLOTPOLICYKEY"); }
    protected abstract ConditionValue xgetCValueSlotpolicykey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_Equal(java.math.BigDecimal inworkingkey) {
        doSetInworkingkey_Equal(inworkingkey);
    }

    protected void doSetInworkingkey_Equal(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_EQ, inworkingkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_NotEqual(java.math.BigDecimal inworkingkey) {
        doSetInworkingkey_NotEqual(inworkingkey);
    }

    protected void doSetInworkingkey_NotEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_NES, inworkingkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_GreaterThan(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_GT, inworkingkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_LessThan(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_LT, inworkingkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_GreaterEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_GE, inworkingkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkey The value of inworkingkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInworkingkey_LessEqual(java.math.BigDecimal inworkingkey) {
        regInworkingkey(CK_LE, inworkingkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param minNumber The min number of inworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInworkingkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInworkingkey(), "INWORKINGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkeyList The collection of inworkingkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInworkingkey_InScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        doSetInworkingkey_InScope(inworkingkeyList);
    }

    protected void doSetInworkingkey_InScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        regINS(CK_INS, cTL(inworkingkeyList), xgetCValueInworkingkey(), "INWORKINGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     * @param inworkingkeyList The collection of inworkingkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInworkingkey_NotInScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        doSetInworkingkey_NotInScope(inworkingkeyList);
    }

    protected void doSetInworkingkey_NotInScope(Collection<java.math.BigDecimal> inworkingkeyList) {
        regINS(CK_NINS, cTL(inworkingkeyList), xgetCValueInworkingkey(), "INWORKINGKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     */
    public void setInworkingkey_IsNull() { regInworkingkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INWORKINGKEY: {decimal(16, 6)}
     */
    public void setInworkingkey_IsNotNull() { regInworkingkey(CK_ISNN, DOBJ); }

    protected void regInworkingkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInworkingkey(), "INWORKINGKEY"); }
    protected abstract ConditionValue xgetCValueInworkingkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_Equal(java.math.BigDecimal outworkingkey) {
        doSetOutworkingkey_Equal(outworkingkey);
    }

    protected void doSetOutworkingkey_Equal(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_EQ, outworkingkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_NotEqual(java.math.BigDecimal outworkingkey) {
        doSetOutworkingkey_NotEqual(outworkingkey);
    }

    protected void doSetOutworkingkey_NotEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_NES, outworkingkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_GreaterThan(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_GT, outworkingkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_LessThan(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_LT, outworkingkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_GreaterEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_GE, outworkingkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkey The value of outworkingkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOutworkingkey_LessEqual(java.math.BigDecimal outworkingkey) {
        regOutworkingkey(CK_LE, outworkingkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param minNumber The min number of outworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of outworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOutworkingkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOutworkingkey(), "OUTWORKINGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkeyList The collection of outworkingkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutworkingkey_InScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        doSetOutworkingkey_InScope(outworkingkeyList);
    }

    protected void doSetOutworkingkey_InScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        regINS(CK_INS, cTL(outworkingkeyList), xgetCValueOutworkingkey(), "OUTWORKINGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     * @param outworkingkeyList The collection of outworkingkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOutworkingkey_NotInScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        doSetOutworkingkey_NotInScope(outworkingkeyList);
    }

    protected void doSetOutworkingkey_NotInScope(Collection<java.math.BigDecimal> outworkingkeyList) {
        regINS(CK_NINS, cTL(outworkingkeyList), xgetCValueOutworkingkey(), "OUTWORKINGKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     */
    public void setOutworkingkey_IsNull() { regOutworkingkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OUTWORKINGKEY: {decimal(16, 6)}
     */
    public void setOutworkingkey_IsNotNull() { regOutworkingkey(CK_ISNN, DOBJ); }

    protected void regOutworkingkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOutworkingkey(), "OUTWORKINGKEY"); }
    protected abstract ConditionValue xgetCValueOutworkingkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_Equal(java.math.BigDecimal processworkingkey) {
        doSetProcessworkingkey_Equal(processworkingkey);
    }

    protected void doSetProcessworkingkey_Equal(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_EQ, processworkingkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_NotEqual(java.math.BigDecimal processworkingkey) {
        doSetProcessworkingkey_NotEqual(processworkingkey);
    }

    protected void doSetProcessworkingkey_NotEqual(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_NES, processworkingkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_GreaterThan(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_GT, processworkingkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_LessThan(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_LT, processworkingkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_GreaterEqual(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_GE, processworkingkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkey The value of processworkingkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessworkingkey_LessEqual(java.math.BigDecimal processworkingkey) {
        regProcessworkingkey(CK_LE, processworkingkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param minNumber The min number of processworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processworkingkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessworkingkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessworkingkey(), "PROCESSWORKINGKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkeyList The collection of processworkingkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessworkingkey_InScope(Collection<java.math.BigDecimal> processworkingkeyList) {
        doSetProcessworkingkey_InScope(processworkingkeyList);
    }

    protected void doSetProcessworkingkey_InScope(Collection<java.math.BigDecimal> processworkingkeyList) {
        regINS(CK_INS, cTL(processworkingkeyList), xgetCValueProcessworkingkey(), "PROCESSWORKINGKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     * @param processworkingkeyList The collection of processworkingkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessworkingkey_NotInScope(Collection<java.math.BigDecimal> processworkingkeyList) {
        doSetProcessworkingkey_NotInScope(processworkingkeyList);
    }

    protected void doSetProcessworkingkey_NotInScope(Collection<java.math.BigDecimal> processworkingkeyList) {
        regINS(CK_NINS, cTL(processworkingkeyList), xgetCValueProcessworkingkey(), "PROCESSWORKINGKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     */
    public void setProcessworkingkey_IsNull() { regProcessworkingkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROCESSWORKINGKEY: {decimal(16, 6)}
     */
    public void setProcessworkingkey_IsNotNull() { regProcessworkingkey(CK_ISNN, DOBJ); }

    protected void regProcessworkingkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessworkingkey(), "PROCESSWORKINGKEY"); }
    protected abstract ConditionValue xgetCValueProcessworkingkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_Equal(String useruse1) {
        doSetUseruse1_Equal(fRES(useruse1));
    }

    protected void doSetUseruse1_Equal(String useruse1) {
        regUseruse1(CK_EQ, useruse1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotEqual(String useruse1) {
        doSetUseruse1_NotEqual(fRES(useruse1));
    }

    protected void doSetUseruse1_NotEqual(String useruse1) {
        regUseruse1(CK_NES, useruse1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterThan(String useruse1) {
        regUseruse1(CK_GT, fRES(useruse1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessThan(String useruse1) {
        regUseruse1(CK_LT, fRES(useruse1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_GreaterEqual(String useruse1) {
        regUseruse1(CK_GE, fRES(useruse1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_LessEqual(String useruse1) {
        regUseruse1(CK_LE, fRES(useruse1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_InScope(Collection<String> useruse1List) {
        doSetUseruse1_InScope(useruse1List);
    }

    protected void doSetUseruse1_InScope(Collection<String> useruse1List) {
        regINS(CK_INS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1List The collection of useruse1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_NotInScope(Collection<String> useruse1List) {
        doSetUseruse1_NotInScope(useruse1List);
    }

    protected void doSetUseruse1_NotInScope(Collection<String> useruse1List) {
        regINS(CK_NINS, cTL(useruse1List), xgetCValueUseruse1(), "USERUSE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)} <br>
     * <pre>e.g. setUseruse1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse1 The value of useruse1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse1_LikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse1_NotLikeSearch(String useruse1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse1), xgetCValueUseruse1(), "USERUSE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE1: {varchar(60)}
     * @param useruse1 The value of useruse1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse1_PrefixSearch(String useruse1) {
        setUseruse1_LikeSearch(useruse1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNull() { regUseruse1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNullOrEmpty() { regUseruse1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE1: {varchar(60)}
     */
    public void setUseruse1_IsNotNull() { regUseruse1(CK_ISNN, DOBJ); }

    protected void regUseruse1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse1(), "USERUSE1"); }
    protected abstract ConditionValue xgetCValueUseruse1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_Equal(String useruse2) {
        doSetUseruse2_Equal(fRES(useruse2));
    }

    protected void doSetUseruse2_Equal(String useruse2) {
        regUseruse2(CK_EQ, useruse2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotEqual(String useruse2) {
        doSetUseruse2_NotEqual(fRES(useruse2));
    }

    protected void doSetUseruse2_NotEqual(String useruse2) {
        regUseruse2(CK_NES, useruse2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterThan(String useruse2) {
        regUseruse2(CK_GT, fRES(useruse2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessThan(String useruse2) {
        regUseruse2(CK_LT, fRES(useruse2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_GreaterEqual(String useruse2) {
        regUseruse2(CK_GE, fRES(useruse2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_LessEqual(String useruse2) {
        regUseruse2(CK_LE, fRES(useruse2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_InScope(Collection<String> useruse2List) {
        doSetUseruse2_InScope(useruse2List);
    }

    protected void doSetUseruse2_InScope(Collection<String> useruse2List) {
        regINS(CK_INS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2List The collection of useruse2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_NotInScope(Collection<String> useruse2List) {
        doSetUseruse2_NotInScope(useruse2List);
    }

    protected void doSetUseruse2_NotInScope(Collection<String> useruse2List) {
        regINS(CK_NINS, cTL(useruse2List), xgetCValueUseruse2(), "USERUSE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)} <br>
     * <pre>e.g. setUseruse2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse2 The value of useruse2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse2_LikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse2_NotLikeSearch(String useruse2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse2), xgetCValueUseruse2(), "USERUSE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE2: {varchar(60)}
     * @param useruse2 The value of useruse2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse2_PrefixSearch(String useruse2) {
        setUseruse2_LikeSearch(useruse2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNull() { regUseruse2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNullOrEmpty() { regUseruse2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE2: {varchar(60)}
     */
    public void setUseruse2_IsNotNull() { regUseruse2(CK_ISNN, DOBJ); }

    protected void regUseruse2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse2(), "USERUSE2"); }
    protected abstract ConditionValue xgetCValueUseruse2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_Equal(String useruse3) {
        doSetUseruse3_Equal(fRES(useruse3));
    }

    protected void doSetUseruse3_Equal(String useruse3) {
        regUseruse3(CK_EQ, useruse3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotEqual(String useruse3) {
        doSetUseruse3_NotEqual(fRES(useruse3));
    }

    protected void doSetUseruse3_NotEqual(String useruse3) {
        regUseruse3(CK_NES, useruse3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterThan(String useruse3) {
        regUseruse3(CK_GT, fRES(useruse3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessThan(String useruse3) {
        regUseruse3(CK_LT, fRES(useruse3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_GreaterEqual(String useruse3) {
        regUseruse3(CK_GE, fRES(useruse3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_LessEqual(String useruse3) {
        regUseruse3(CK_LE, fRES(useruse3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_InScope(Collection<String> useruse3List) {
        doSetUseruse3_InScope(useruse3List);
    }

    protected void doSetUseruse3_InScope(Collection<String> useruse3List) {
        regINS(CK_INS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3List The collection of useruse3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_NotInScope(Collection<String> useruse3List) {
        doSetUseruse3_NotInScope(useruse3List);
    }

    protected void doSetUseruse3_NotInScope(Collection<String> useruse3List) {
        regINS(CK_NINS, cTL(useruse3List), xgetCValueUseruse3(), "USERUSE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)} <br>
     * <pre>e.g. setUseruse3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse3 The value of useruse3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse3_LikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse3_NotLikeSearch(String useruse3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse3), xgetCValueUseruse3(), "USERUSE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE3: {varchar(60)}
     * @param useruse3 The value of useruse3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse3_PrefixSearch(String useruse3) {
        setUseruse3_LikeSearch(useruse3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNull() { regUseruse3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNullOrEmpty() { regUseruse3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE3: {varchar(60)}
     */
    public void setUseruse3_IsNotNull() { regUseruse3(CK_ISNN, DOBJ); }

    protected void regUseruse3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse3(), "USERUSE3"); }
    protected abstract ConditionValue xgetCValueUseruse3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_Equal(String useruse4) {
        doSetUseruse4_Equal(fRES(useruse4));
    }

    protected void doSetUseruse4_Equal(String useruse4) {
        regUseruse4(CK_EQ, useruse4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotEqual(String useruse4) {
        doSetUseruse4_NotEqual(fRES(useruse4));
    }

    protected void doSetUseruse4_NotEqual(String useruse4) {
        regUseruse4(CK_NES, useruse4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterThan(String useruse4) {
        regUseruse4(CK_GT, fRES(useruse4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessThan(String useruse4) {
        regUseruse4(CK_LT, fRES(useruse4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_GreaterEqual(String useruse4) {
        regUseruse4(CK_GE, fRES(useruse4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_LessEqual(String useruse4) {
        regUseruse4(CK_LE, fRES(useruse4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_InScope(Collection<String> useruse4List) {
        doSetUseruse4_InScope(useruse4List);
    }

    protected void doSetUseruse4_InScope(Collection<String> useruse4List) {
        regINS(CK_INS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4List The collection of useruse4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_NotInScope(Collection<String> useruse4List) {
        doSetUseruse4_NotInScope(useruse4List);
    }

    protected void doSetUseruse4_NotInScope(Collection<String> useruse4List) {
        regINS(CK_NINS, cTL(useruse4List), xgetCValueUseruse4(), "USERUSE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)} <br>
     * <pre>e.g. setUseruse4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse4 The value of useruse4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse4_LikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse4_NotLikeSearch(String useruse4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse4), xgetCValueUseruse4(), "USERUSE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE4: {varchar(60)}
     * @param useruse4 The value of useruse4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse4_PrefixSearch(String useruse4) {
        setUseruse4_LikeSearch(useruse4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNull() { regUseruse4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNullOrEmpty() { regUseruse4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE4: {varchar(60)}
     */
    public void setUseruse4_IsNotNull() { regUseruse4(CK_ISNN, DOBJ); }

    protected void regUseruse4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse4(), "USERUSE4"); }
    protected abstract ConditionValue xgetCValueUseruse4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_Equal(String useruse5) {
        doSetUseruse5_Equal(fRES(useruse5));
    }

    protected void doSetUseruse5_Equal(String useruse5) {
        regUseruse5(CK_EQ, useruse5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotEqual(String useruse5) {
        doSetUseruse5_NotEqual(fRES(useruse5));
    }

    protected void doSetUseruse5_NotEqual(String useruse5) {
        regUseruse5(CK_NES, useruse5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterThan(String useruse5) {
        regUseruse5(CK_GT, fRES(useruse5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessThan(String useruse5) {
        regUseruse5(CK_LT, fRES(useruse5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_GreaterEqual(String useruse5) {
        regUseruse5(CK_GE, fRES(useruse5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_LessEqual(String useruse5) {
        regUseruse5(CK_LE, fRES(useruse5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_InScope(Collection<String> useruse5List) {
        doSetUseruse5_InScope(useruse5List);
    }

    protected void doSetUseruse5_InScope(Collection<String> useruse5List) {
        regINS(CK_INS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5List The collection of useruse5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_NotInScope(Collection<String> useruse5List) {
        doSetUseruse5_NotInScope(useruse5List);
    }

    protected void doSetUseruse5_NotInScope(Collection<String> useruse5List) {
        regINS(CK_NINS, cTL(useruse5List), xgetCValueUseruse5(), "USERUSE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)} <br>
     * <pre>e.g. setUseruse5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param useruse5 The value of useruse5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUseruse5_LikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUseruse5_NotLikeSearch(String useruse5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(useruse5), xgetCValueUseruse5(), "USERUSE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERUSE5: {varchar(60)}
     * @param useruse5 The value of useruse5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUseruse5_PrefixSearch(String useruse5) {
        setUseruse5_LikeSearch(useruse5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNull() { regUseruse5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNullOrEmpty() { regUseruse5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USERUSE5: {varchar(60)}
     */
    public void setUseruse5_IsNotNull() { regUseruse5(CK_ISNN, DOBJ); }

    protected void regUseruse5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUseruse5(), "USERUSE5"); }
    protected abstract ConditionValue xgetCValueUseruse5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_Equal(java.math.BigDecimal serialflg) {
        doSetSerialflg_Equal(serialflg);
    }

    protected void doSetSerialflg_Equal(java.math.BigDecimal serialflg) {
        regSerialflg(CK_EQ, serialflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_NotEqual(java.math.BigDecimal serialflg) {
        doSetSerialflg_NotEqual(serialflg);
    }

    protected void doSetSerialflg_NotEqual(java.math.BigDecimal serialflg) {
        regSerialflg(CK_NES, serialflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_GreaterThan(java.math.BigDecimal serialflg) {
        regSerialflg(CK_GT, serialflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_LessThan(java.math.BigDecimal serialflg) {
        regSerialflg(CK_LT, serialflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_GreaterEqual(java.math.BigDecimal serialflg) {
        regSerialflg(CK_GE, serialflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflg The value of serialflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSerialflg_LessEqual(java.math.BigDecimal serialflg) {
        regSerialflg(CK_LE, serialflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of serialflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of serialflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSerialflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSerialflg(), "SERIALFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflgList The collection of serialflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialflg_InScope(Collection<java.math.BigDecimal> serialflgList) {
        doSetSerialflg_InScope(serialflgList);
    }

    protected void doSetSerialflg_InScope(Collection<java.math.BigDecimal> serialflgList) {
        regINS(CK_INS, cTL(serialflgList), xgetCValueSerialflg(), "SERIALFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SERIALFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param serialflgList The collection of serialflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSerialflg_NotInScope(Collection<java.math.BigDecimal> serialflgList) {
        doSetSerialflg_NotInScope(serialflgList);
    }

    protected void doSetSerialflg_NotInScope(Collection<java.math.BigDecimal> serialflgList) {
        regINS(CK_NINS, cTL(serialflgList), xgetCValueSerialflg(), "SERIALFLG");
    }

    protected void regSerialflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSerialflg(), "SERIALFLG"); }
    protected abstract ConditionValue xgetCValueSerialflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_Equal(java.math.BigDecimal fullpalletflg) {
        doSetFullpalletflg_Equal(fullpalletflg);
    }

    protected void doSetFullpalletflg_Equal(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_EQ, fullpalletflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_NotEqual(java.math.BigDecimal fullpalletflg) {
        doSetFullpalletflg_NotEqual(fullpalletflg);
    }

    protected void doSetFullpalletflg_NotEqual(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_NES, fullpalletflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_GreaterThan(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_GT, fullpalletflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_LessThan(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_LT, fullpalletflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_GreaterEqual(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_GE, fullpalletflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflg The value of fullpalletflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFullpalletflg_LessEqual(java.math.BigDecimal fullpalletflg) {
        regFullpalletflg(CK_LE, fullpalletflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of fullpalletflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fullpalletflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFullpalletflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFullpalletflg(), "FULLPALLETFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflgList The collection of fullpalletflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_InScope(Collection<java.math.BigDecimal> fullpalletflgList) {
        doSetFullpalletflg_InScope(fullpalletflgList);
    }

    protected void doSetFullpalletflg_InScope(Collection<java.math.BigDecimal> fullpalletflgList) {
        regINS(CK_INS, cTL(fullpalletflgList), xgetCValueFullpalletflg(), "FULLPALLETFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FULLPALLETFLG: {NotNull, decimal(16, 6), default=[(0)]}
     * @param fullpalletflgList The collection of fullpalletflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFullpalletflg_NotInScope(Collection<java.math.BigDecimal> fullpalletflgList) {
        doSetFullpalletflg_NotInScope(fullpalletflgList);
    }

    protected void doSetFullpalletflg_NotInScope(Collection<java.math.BigDecimal> fullpalletflgList) {
        regINS(CK_NINS, cTL(fullpalletflgList), xgetCValueFullpalletflg(), "FULLPALLETFLG");
    }

    protected void regFullpalletflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFullpalletflg(), "FULLPALLETFLG"); }
    protected abstract ConditionValue xgetCValueFullpalletflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_Equal(String plslotlocname) {
        doSetPlslotlocname_Equal(fRES(plslotlocname));
    }

    protected void doSetPlslotlocname_Equal(String plslotlocname) {
        regPlslotlocname(CK_EQ, plslotlocname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_NotEqual(String plslotlocname) {
        doSetPlslotlocname_NotEqual(fRES(plslotlocname));
    }

    protected void doSetPlslotlocname_NotEqual(String plslotlocname) {
        regPlslotlocname(CK_NES, plslotlocname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_GreaterThan(String plslotlocname) {
        regPlslotlocname(CK_GT, fRES(plslotlocname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_LessThan(String plslotlocname) {
        regPlslotlocname(CK_LT, fRES(plslotlocname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_GreaterEqual(String plslotlocname) {
        regPlslotlocname(CK_GE, fRES(plslotlocname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_LessEqual(String plslotlocname) {
        regPlslotlocname(CK_LE, fRES(plslotlocname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocnameList The collection of plslotlocname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_InScope(Collection<String> plslotlocnameList) {
        doSetPlslotlocname_InScope(plslotlocnameList);
    }

    protected void doSetPlslotlocname_InScope(Collection<String> plslotlocnameList) {
        regINS(CK_INS, cTL(plslotlocnameList), xgetCValuePlslotlocname(), "PLSLOTLOCNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocnameList The collection of plslotlocname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_NotInScope(Collection<String> plslotlocnameList) {
        doSetPlslotlocname_NotInScope(plslotlocnameList);
    }

    protected void doSetPlslotlocname_NotInScope(Collection<String> plslotlocnameList) {
        regINS(CK_NINS, cTL(plslotlocnameList), xgetCValuePlslotlocname(), "PLSLOTLOCNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)} <br>
     * <pre>e.g. setPlslotlocname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plslotlocname The value of plslotlocname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlslotlocname_LikeSearch(String plslotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plslotlocname), xgetCValuePlslotlocname(), "PLSLOTLOCNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlslotlocname_NotLikeSearch(String plslotlocname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plslotlocname), xgetCValuePlslotlocname(), "PLSLOTLOCNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     * @param plslotlocname The value of plslotlocname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlslotlocname_PrefixSearch(String plslotlocname) {
        setPlslotlocname_LikeSearch(plslotlocname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     */
    public void setPlslotlocname_IsNull() { regPlslotlocname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     */
    public void setPlslotlocname_IsNullOrEmpty() { regPlslotlocname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLSLOTLOCNAME: {varchar(255)}
     */
    public void setPlslotlocname_IsNotNull() { regPlslotlocname(CK_ISNN, DOBJ); }

    protected void regPlslotlocname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlslotlocname(), "PLSLOTLOCNAME"); }
    protected abstract ConditionValue xgetCValuePlslotlocname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19), FK to M_PRODUCT}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

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
    public HpSLCFunction<MMfwhxitemCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMfwhxitemCB.class);
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
    public HpSLCFunction<MMfwhxitemCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMfwhxitemCB.class);
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
    public HpSLCFunction<MMfwhxitemCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMfwhxitemCB.class);
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
    public HpSLCFunction<MMfwhxitemCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMfwhxitemCB.class);
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
    public HpSLCFunction<MMfwhxitemCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMfwhxitemCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMfwhxitemCB&gt;() {
     *     public void query(MMfwhxitemCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMfwhxitemCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMfwhxitemCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMfwhxitemCQ sq);

    protected MMfwhxitemCB xcreateScalarConditionCB() {
        MMfwhxitemCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMfwhxitemCB xcreateScalarConditionPartitionByCB() {
        MMfwhxitemCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMfwhxitemCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MFWH_ITEM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMfwhxitemCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMfwhxitemCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMfwhxitemCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MFWH_ITEM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMfwhxitemCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMfwhxitemCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfwhxitemCB cb = new MMfwhxitemCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMfwhxitemCQ sq);

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
    protected MMfwhxitemCB newMyCB() {
        return new MMfwhxitemCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMfwhxitemCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
