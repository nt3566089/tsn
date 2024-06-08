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
 * The abstract condition-query of M_CARRIER_SLIP_CES.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCarrierSlipCesCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCarrierSlipCesCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CARRIER_SLIP_CES";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepCustomerId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CUSTOMER_ID from M_CUSTOMER where ...)} <br />
     * M_CUSTOMER by my CUSTOMER_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCustomerId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepCustomerId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, bigint identity(19), FK to M_CUSTOMER}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_Equal(String collectAccountNoBillTo) {
        doSetCollectAccountNoBillTo_Equal(fRES(collectAccountNoBillTo));
    }

    protected void doSetCollectAccountNoBillTo_Equal(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_EQ, collectAccountNoBillTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_NotEqual(String collectAccountNoBillTo) {
        doSetCollectAccountNoBillTo_NotEqual(fRES(collectAccountNoBillTo));
    }

    protected void doSetCollectAccountNoBillTo_NotEqual(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_NES, collectAccountNoBillTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_GreaterThan(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_GT, fRES(collectAccountNoBillTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_LessThan(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_LT, fRES(collectAccountNoBillTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_GreaterEqual(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_GE, fRES(collectAccountNoBillTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_LessEqual(String collectAccountNoBillTo) {
        regCollectAccountNoBillTo(CK_LE, fRES(collectAccountNoBillTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillToList The collection of collectAccountNoBillTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_InScope(Collection<String> collectAccountNoBillToList) {
        doSetCollectAccountNoBillTo_InScope(collectAccountNoBillToList);
    }

    protected void doSetCollectAccountNoBillTo_InScope(Collection<String> collectAccountNoBillToList) {
        regINS(CK_INS, cTL(collectAccountNoBillToList), xgetCValueCollectAccountNoBillTo(), "COLLECT_ACCOUNT_NO_BILL_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillToList The collection of collectAccountNoBillTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_NotInScope(Collection<String> collectAccountNoBillToList) {
        doSetCollectAccountNoBillTo_NotInScope(collectAccountNoBillToList);
    }

    protected void doSetCollectAccountNoBillTo_NotInScope(Collection<String> collectAccountNoBillToList) {
        regINS(CK_NINS, cTL(collectAccountNoBillToList), xgetCValueCollectAccountNoBillTo(), "COLLECT_ACCOUNT_NO_BILL_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectAccountNoBillTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectAccountNoBillTo_LikeSearch(String collectAccountNoBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectAccountNoBillTo), xgetCValueCollectAccountNoBillTo(), "COLLECT_ACCOUNT_NO_BILL_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectAccountNoBillTo_NotLikeSearch(String collectAccountNoBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectAccountNoBillTo), xgetCValueCollectAccountNoBillTo(), "COLLECT_ACCOUNT_NO_BILL_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     * @param collectAccountNoBillTo The value of collectAccountNoBillTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoBillTo_PrefixSearch(String collectAccountNoBillTo) {
        setCollectAccountNoBillTo_LikeSearch(collectAccountNoBillTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     */
    public void setCollectAccountNoBillTo_IsNull() { regCollectAccountNoBillTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     */
    public void setCollectAccountNoBillTo_IsNullOrEmpty() { regCollectAccountNoBillTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_BILL_TO: {varchar(30)}
     */
    public void setCollectAccountNoBillTo_IsNotNull() { regCollectAccountNoBillTo(CK_ISNN, DOBJ); }

    protected void regCollectAccountNoBillTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectAccountNoBillTo(), "COLLECT_ACCOUNT_NO_BILL_TO"); }
    protected abstract ConditionValue xgetCValueCollectAccountNoBillTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_Equal(String collectZipCdBillTo) {
        doSetCollectZipCdBillTo_Equal(fRES(collectZipCdBillTo));
    }

    protected void doSetCollectZipCdBillTo_Equal(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_EQ, collectZipCdBillTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_NotEqual(String collectZipCdBillTo) {
        doSetCollectZipCdBillTo_NotEqual(fRES(collectZipCdBillTo));
    }

    protected void doSetCollectZipCdBillTo_NotEqual(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_NES, collectZipCdBillTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_GreaterThan(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_GT, fRES(collectZipCdBillTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_LessThan(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_LT, fRES(collectZipCdBillTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_GreaterEqual(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_GE, fRES(collectZipCdBillTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_LessEqual(String collectZipCdBillTo) {
        regCollectZipCdBillTo(CK_LE, fRES(collectZipCdBillTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillToList The collection of collectZipCdBillTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_InScope(Collection<String> collectZipCdBillToList) {
        doSetCollectZipCdBillTo_InScope(collectZipCdBillToList);
    }

    protected void doSetCollectZipCdBillTo_InScope(Collection<String> collectZipCdBillToList) {
        regINS(CK_INS, cTL(collectZipCdBillToList), xgetCValueCollectZipCdBillTo(), "COLLECT_ZIP_CD_BILL_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillToList The collection of collectZipCdBillTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_NotInScope(Collection<String> collectZipCdBillToList) {
        doSetCollectZipCdBillTo_NotInScope(collectZipCdBillToList);
    }

    protected void doSetCollectZipCdBillTo_NotInScope(Collection<String> collectZipCdBillToList) {
        regINS(CK_NINS, cTL(collectZipCdBillToList), xgetCValueCollectZipCdBillTo(), "COLLECT_ZIP_CD_BILL_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectZipCdBillTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectZipCdBillTo The value of collectZipCdBillTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectZipCdBillTo_LikeSearch(String collectZipCdBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectZipCdBillTo), xgetCValueCollectZipCdBillTo(), "COLLECT_ZIP_CD_BILL_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectZipCdBillTo_NotLikeSearch(String collectZipCdBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectZipCdBillTo), xgetCValueCollectZipCdBillTo(), "COLLECT_ZIP_CD_BILL_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     * @param collectZipCdBillTo The value of collectZipCdBillTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdBillTo_PrefixSearch(String collectZipCdBillTo) {
        setCollectZipCdBillTo_LikeSearch(collectZipCdBillTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectZipCdBillTo_IsNull() { regCollectZipCdBillTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectZipCdBillTo_IsNullOrEmpty() { regCollectZipCdBillTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectZipCdBillTo_IsNotNull() { regCollectZipCdBillTo(CK_ISNN, DOBJ); }

    protected void regCollectZipCdBillTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectZipCdBillTo(), "COLLECT_ZIP_CD_BILL_TO"); }
    protected abstract ConditionValue xgetCValueCollectZipCdBillTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_Equal(String collectCountryCdBillTo) {
        doSetCollectCountryCdBillTo_Equal(fRES(collectCountryCdBillTo));
    }

    protected void doSetCollectCountryCdBillTo_Equal(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_EQ, collectCountryCdBillTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_NotEqual(String collectCountryCdBillTo) {
        doSetCollectCountryCdBillTo_NotEqual(fRES(collectCountryCdBillTo));
    }

    protected void doSetCollectCountryCdBillTo_NotEqual(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_NES, collectCountryCdBillTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_GreaterThan(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_GT, fRES(collectCountryCdBillTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_LessThan(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_LT, fRES(collectCountryCdBillTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_GreaterEqual(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_GE, fRES(collectCountryCdBillTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_LessEqual(String collectCountryCdBillTo) {
        regCollectCountryCdBillTo(CK_LE, fRES(collectCountryCdBillTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillToList The collection of collectCountryCdBillTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_InScope(Collection<String> collectCountryCdBillToList) {
        doSetCollectCountryCdBillTo_InScope(collectCountryCdBillToList);
    }

    protected void doSetCollectCountryCdBillTo_InScope(Collection<String> collectCountryCdBillToList) {
        regINS(CK_INS, cTL(collectCountryCdBillToList), xgetCValueCollectCountryCdBillTo(), "COLLECT_COUNTRY_CD_BILL_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillToList The collection of collectCountryCdBillTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_NotInScope(Collection<String> collectCountryCdBillToList) {
        doSetCollectCountryCdBillTo_NotInScope(collectCountryCdBillToList);
    }

    protected void doSetCollectCountryCdBillTo_NotInScope(Collection<String> collectCountryCdBillToList) {
        regINS(CK_NINS, cTL(collectCountryCdBillToList), xgetCValueCollectCountryCdBillTo(), "COLLECT_COUNTRY_CD_BILL_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectCountryCdBillTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectCountryCdBillTo_LikeSearch(String collectCountryCdBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectCountryCdBillTo), xgetCValueCollectCountryCdBillTo(), "COLLECT_COUNTRY_CD_BILL_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectCountryCdBillTo_NotLikeSearch(String collectCountryCdBillTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectCountryCdBillTo), xgetCValueCollectCountryCdBillTo(), "COLLECT_COUNTRY_CD_BILL_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     * @param collectCountryCdBillTo The value of collectCountryCdBillTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdBillTo_PrefixSearch(String collectCountryCdBillTo) {
        setCollectCountryCdBillTo_LikeSearch(collectCountryCdBillTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectCountryCdBillTo_IsNull() { regCollectCountryCdBillTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectCountryCdBillTo_IsNullOrEmpty() { regCollectCountryCdBillTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_BILL_TO: {varchar(30)}
     */
    public void setCollectCountryCdBillTo_IsNotNull() { regCollectCountryCdBillTo(CK_ISNN, DOBJ); }

    protected void regCollectCountryCdBillTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectCountryCdBillTo(), "COLLECT_COUNTRY_CD_BILL_TO"); }
    protected abstract ConditionValue xgetCValueCollectCountryCdBillTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_Equal(String paymentTermCdTaxesTo) {
        doSetPaymentTermCdTaxesTo_Equal(fRES(paymentTermCdTaxesTo));
    }

    protected void doSetPaymentTermCdTaxesTo_Equal(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_EQ, paymentTermCdTaxesTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_NotEqual(String paymentTermCdTaxesTo) {
        doSetPaymentTermCdTaxesTo_NotEqual(fRES(paymentTermCdTaxesTo));
    }

    protected void doSetPaymentTermCdTaxesTo_NotEqual(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_NES, paymentTermCdTaxesTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_GreaterThan(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_GT, fRES(paymentTermCdTaxesTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_LessThan(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_LT, fRES(paymentTermCdTaxesTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_GreaterEqual(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_GE, fRES(paymentTermCdTaxesTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_LessEqual(String paymentTermCdTaxesTo) {
        regPaymentTermCdTaxesTo(CK_LE, fRES(paymentTermCdTaxesTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesToList The collection of paymentTermCdTaxesTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_InScope(Collection<String> paymentTermCdTaxesToList) {
        doSetPaymentTermCdTaxesTo_InScope(paymentTermCdTaxesToList);
    }

    protected void doSetPaymentTermCdTaxesTo_InScope(Collection<String> paymentTermCdTaxesToList) {
        regINS(CK_INS, cTL(paymentTermCdTaxesToList), xgetCValuePaymentTermCdTaxesTo(), "PAYMENT_TERM_CD_TAXES_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesToList The collection of paymentTermCdTaxesTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_NotInScope(Collection<String> paymentTermCdTaxesToList) {
        doSetPaymentTermCdTaxesTo_NotInScope(paymentTermCdTaxesToList);
    }

    protected void doSetPaymentTermCdTaxesTo_NotInScope(Collection<String> paymentTermCdTaxesToList) {
        regINS(CK_NINS, cTL(paymentTermCdTaxesToList), xgetCValuePaymentTermCdTaxesTo(), "PAYMENT_TERM_CD_TAXES_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)} <br>
     * <pre>e.g. setPaymentTermCdTaxesTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentTermCdTaxesTo_LikeSearch(String paymentTermCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentTermCdTaxesTo), xgetCValuePaymentTermCdTaxesTo(), "PAYMENT_TERM_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentTermCdTaxesTo_NotLikeSearch(String paymentTermCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentTermCdTaxesTo), xgetCValuePaymentTermCdTaxesTo(), "PAYMENT_TERM_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     * @param paymentTermCdTaxesTo The value of paymentTermCdTaxesTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTermCdTaxesTo_PrefixSearch(String paymentTermCdTaxesTo) {
        setPaymentTermCdTaxesTo_LikeSearch(paymentTermCdTaxesTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     */
    public void setPaymentTermCdTaxesTo_IsNull() { regPaymentTermCdTaxesTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     */
    public void setPaymentTermCdTaxesTo_IsNullOrEmpty() { regPaymentTermCdTaxesTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TERM_CD_TAXES_TO: {varchar(30)}
     */
    public void setPaymentTermCdTaxesTo_IsNotNull() { regPaymentTermCdTaxesTo(CK_ISNN, DOBJ); }

    protected void regPaymentTermCdTaxesTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentTermCdTaxesTo(), "PAYMENT_TERM_CD_TAXES_TO"); }
    protected abstract ConditionValue xgetCValuePaymentTermCdTaxesTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_Equal(String collectAccountNoTaxesTo) {
        doSetCollectAccountNoTaxesTo_Equal(fRES(collectAccountNoTaxesTo));
    }

    protected void doSetCollectAccountNoTaxesTo_Equal(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_EQ, collectAccountNoTaxesTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_NotEqual(String collectAccountNoTaxesTo) {
        doSetCollectAccountNoTaxesTo_NotEqual(fRES(collectAccountNoTaxesTo));
    }

    protected void doSetCollectAccountNoTaxesTo_NotEqual(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_NES, collectAccountNoTaxesTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_GreaterThan(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_GT, fRES(collectAccountNoTaxesTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_LessThan(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_LT, fRES(collectAccountNoTaxesTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_GreaterEqual(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_GE, fRES(collectAccountNoTaxesTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_LessEqual(String collectAccountNoTaxesTo) {
        regCollectAccountNoTaxesTo(CK_LE, fRES(collectAccountNoTaxesTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesToList The collection of collectAccountNoTaxesTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_InScope(Collection<String> collectAccountNoTaxesToList) {
        doSetCollectAccountNoTaxesTo_InScope(collectAccountNoTaxesToList);
    }

    protected void doSetCollectAccountNoTaxesTo_InScope(Collection<String> collectAccountNoTaxesToList) {
        regINS(CK_INS, cTL(collectAccountNoTaxesToList), xgetCValueCollectAccountNoTaxesTo(), "COLLECT_ACCOUNT_NO_TAXES_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesToList The collection of collectAccountNoTaxesTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_NotInScope(Collection<String> collectAccountNoTaxesToList) {
        doSetCollectAccountNoTaxesTo_NotInScope(collectAccountNoTaxesToList);
    }

    protected void doSetCollectAccountNoTaxesTo_NotInScope(Collection<String> collectAccountNoTaxesToList) {
        regINS(CK_NINS, cTL(collectAccountNoTaxesToList), xgetCValueCollectAccountNoTaxesTo(), "COLLECT_ACCOUNT_NO_TAXES_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectAccountNoTaxesTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectAccountNoTaxesTo_LikeSearch(String collectAccountNoTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectAccountNoTaxesTo), xgetCValueCollectAccountNoTaxesTo(), "COLLECT_ACCOUNT_NO_TAXES_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectAccountNoTaxesTo_NotLikeSearch(String collectAccountNoTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectAccountNoTaxesTo), xgetCValueCollectAccountNoTaxesTo(), "COLLECT_ACCOUNT_NO_TAXES_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     * @param collectAccountNoTaxesTo The value of collectAccountNoTaxesTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectAccountNoTaxesTo_PrefixSearch(String collectAccountNoTaxesTo) {
        setCollectAccountNoTaxesTo_LikeSearch(collectAccountNoTaxesTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     */
    public void setCollectAccountNoTaxesTo_IsNull() { regCollectAccountNoTaxesTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     */
    public void setCollectAccountNoTaxesTo_IsNullOrEmpty() { regCollectAccountNoTaxesTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_ACCOUNT_NO_TAXES_TO: {varchar(30)}
     */
    public void setCollectAccountNoTaxesTo_IsNotNull() { regCollectAccountNoTaxesTo(CK_ISNN, DOBJ); }

    protected void regCollectAccountNoTaxesTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectAccountNoTaxesTo(), "COLLECT_ACCOUNT_NO_TAXES_TO"); }
    protected abstract ConditionValue xgetCValueCollectAccountNoTaxesTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_Equal(String collectZipCdTaxesTo) {
        doSetCollectZipCdTaxesTo_Equal(fRES(collectZipCdTaxesTo));
    }

    protected void doSetCollectZipCdTaxesTo_Equal(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_EQ, collectZipCdTaxesTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_NotEqual(String collectZipCdTaxesTo) {
        doSetCollectZipCdTaxesTo_NotEqual(fRES(collectZipCdTaxesTo));
    }

    protected void doSetCollectZipCdTaxesTo_NotEqual(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_NES, collectZipCdTaxesTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_GreaterThan(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_GT, fRES(collectZipCdTaxesTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_LessThan(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_LT, fRES(collectZipCdTaxesTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_GreaterEqual(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_GE, fRES(collectZipCdTaxesTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_LessEqual(String collectZipCdTaxesTo) {
        regCollectZipCdTaxesTo(CK_LE, fRES(collectZipCdTaxesTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesToList The collection of collectZipCdTaxesTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_InScope(Collection<String> collectZipCdTaxesToList) {
        doSetCollectZipCdTaxesTo_InScope(collectZipCdTaxesToList);
    }

    protected void doSetCollectZipCdTaxesTo_InScope(Collection<String> collectZipCdTaxesToList) {
        regINS(CK_INS, cTL(collectZipCdTaxesToList), xgetCValueCollectZipCdTaxesTo(), "COLLECT_ZIP_CD_TAXES_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesToList The collection of collectZipCdTaxesTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_NotInScope(Collection<String> collectZipCdTaxesToList) {
        doSetCollectZipCdTaxesTo_NotInScope(collectZipCdTaxesToList);
    }

    protected void doSetCollectZipCdTaxesTo_NotInScope(Collection<String> collectZipCdTaxesToList) {
        regINS(CK_NINS, cTL(collectZipCdTaxesToList), xgetCValueCollectZipCdTaxesTo(), "COLLECT_ZIP_CD_TAXES_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectZipCdTaxesTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectZipCdTaxesTo_LikeSearch(String collectZipCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectZipCdTaxesTo), xgetCValueCollectZipCdTaxesTo(), "COLLECT_ZIP_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectZipCdTaxesTo_NotLikeSearch(String collectZipCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectZipCdTaxesTo), xgetCValueCollectZipCdTaxesTo(), "COLLECT_ZIP_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     * @param collectZipCdTaxesTo The value of collectZipCdTaxesTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectZipCdTaxesTo_PrefixSearch(String collectZipCdTaxesTo) {
        setCollectZipCdTaxesTo_LikeSearch(collectZipCdTaxesTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectZipCdTaxesTo_IsNull() { regCollectZipCdTaxesTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectZipCdTaxesTo_IsNullOrEmpty() { regCollectZipCdTaxesTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_ZIP_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectZipCdTaxesTo_IsNotNull() { regCollectZipCdTaxesTo(CK_ISNN, DOBJ); }

    protected void regCollectZipCdTaxesTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectZipCdTaxesTo(), "COLLECT_ZIP_CD_TAXES_TO"); }
    protected abstract ConditionValue xgetCValueCollectZipCdTaxesTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_Equal(String collectCountryCdTaxesTo) {
        doSetCollectCountryCdTaxesTo_Equal(fRES(collectCountryCdTaxesTo));
    }

    protected void doSetCollectCountryCdTaxesTo_Equal(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_EQ, collectCountryCdTaxesTo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_NotEqual(String collectCountryCdTaxesTo) {
        doSetCollectCountryCdTaxesTo_NotEqual(fRES(collectCountryCdTaxesTo));
    }

    protected void doSetCollectCountryCdTaxesTo_NotEqual(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_NES, collectCountryCdTaxesTo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_GreaterThan(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_GT, fRES(collectCountryCdTaxesTo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_LessThan(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_LT, fRES(collectCountryCdTaxesTo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_GreaterEqual(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_GE, fRES(collectCountryCdTaxesTo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_LessEqual(String collectCountryCdTaxesTo) {
        regCollectCountryCdTaxesTo(CK_LE, fRES(collectCountryCdTaxesTo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesToList The collection of collectCountryCdTaxesTo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_InScope(Collection<String> collectCountryCdTaxesToList) {
        doSetCollectCountryCdTaxesTo_InScope(collectCountryCdTaxesToList);
    }

    protected void doSetCollectCountryCdTaxesTo_InScope(Collection<String> collectCountryCdTaxesToList) {
        regINS(CK_INS, cTL(collectCountryCdTaxesToList), xgetCValueCollectCountryCdTaxesTo(), "COLLECT_COUNTRY_CD_TAXES_TO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesToList The collection of collectCountryCdTaxesTo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_NotInScope(Collection<String> collectCountryCdTaxesToList) {
        doSetCollectCountryCdTaxesTo_NotInScope(collectCountryCdTaxesToList);
    }

    protected void doSetCollectCountryCdTaxesTo_NotInScope(Collection<String> collectCountryCdTaxesToList) {
        regINS(CK_NINS, cTL(collectCountryCdTaxesToList), xgetCValueCollectCountryCdTaxesTo(), "COLLECT_COUNTRY_CD_TAXES_TO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)} <br>
     * <pre>e.g. setCollectCountryCdTaxesTo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCollectCountryCdTaxesTo_LikeSearch(String collectCountryCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(collectCountryCdTaxesTo), xgetCValueCollectCountryCdTaxesTo(), "COLLECT_COUNTRY_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCollectCountryCdTaxesTo_NotLikeSearch(String collectCountryCdTaxesTo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(collectCountryCdTaxesTo), xgetCValueCollectCountryCdTaxesTo(), "COLLECT_COUNTRY_CD_TAXES_TO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     * @param collectCountryCdTaxesTo The value of collectCountryCdTaxesTo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCollectCountryCdTaxesTo_PrefixSearch(String collectCountryCdTaxesTo) {
        setCollectCountryCdTaxesTo_LikeSearch(collectCountryCdTaxesTo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectCountryCdTaxesTo_IsNull() { regCollectCountryCdTaxesTo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectCountryCdTaxesTo_IsNullOrEmpty() { regCollectCountryCdTaxesTo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COLLECT_COUNTRY_CD_TAXES_TO: {varchar(30)}
     */
    public void setCollectCountryCdTaxesTo_IsNotNull() { regCollectCountryCdTaxesTo(CK_ISNN, DOBJ); }

    protected void regCollectCountryCdTaxesTo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCollectCountryCdTaxesTo(), "COLLECT_COUNTRY_CD_TAXES_TO"); }
    protected abstract ConditionValue xgetCValueCollectCountryCdTaxesTo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_Equal(String codPaymentTermCd) {
        doSetCodPaymentTermCd_Equal(fRES(codPaymentTermCd));
    }

    protected void doSetCodPaymentTermCd_Equal(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_EQ, codPaymentTermCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_NotEqual(String codPaymentTermCd) {
        doSetCodPaymentTermCd_NotEqual(fRES(codPaymentTermCd));
    }

    protected void doSetCodPaymentTermCd_NotEqual(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_NES, codPaymentTermCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_GreaterThan(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_GT, fRES(codPaymentTermCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_LessThan(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_LT, fRES(codPaymentTermCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_GreaterEqual(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_GE, fRES(codPaymentTermCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_LessEqual(String codPaymentTermCd) {
        regCodPaymentTermCd(CK_LE, fRES(codPaymentTermCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCdList The collection of codPaymentTermCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_InScope(Collection<String> codPaymentTermCdList) {
        doSetCodPaymentTermCd_InScope(codPaymentTermCdList);
    }

    protected void doSetCodPaymentTermCd_InScope(Collection<String> codPaymentTermCdList) {
        regINS(CK_INS, cTL(codPaymentTermCdList), xgetCValueCodPaymentTermCd(), "COD_PAYMENT_TERM_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCdList The collection of codPaymentTermCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_NotInScope(Collection<String> codPaymentTermCdList) {
        doSetCodPaymentTermCd_NotInScope(codPaymentTermCdList);
    }

    protected void doSetCodPaymentTermCd_NotInScope(Collection<String> codPaymentTermCdList) {
        regINS(CK_NINS, cTL(codPaymentTermCdList), xgetCValueCodPaymentTermCd(), "COD_PAYMENT_TERM_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)} <br>
     * <pre>e.g. setCodPaymentTermCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param codPaymentTermCd The value of codPaymentTermCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCodPaymentTermCd_LikeSearch(String codPaymentTermCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(codPaymentTermCd), xgetCValueCodPaymentTermCd(), "COD_PAYMENT_TERM_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCodPaymentTermCd_NotLikeSearch(String codPaymentTermCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(codPaymentTermCd), xgetCValueCodPaymentTermCd(), "COD_PAYMENT_TERM_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     * @param codPaymentTermCd The value of codPaymentTermCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodPaymentTermCd_PrefixSearch(String codPaymentTermCd) {
        setCodPaymentTermCd_LikeSearch(codPaymentTermCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     */
    public void setCodPaymentTermCd_IsNull() { regCodPaymentTermCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     */
    public void setCodPaymentTermCd_IsNullOrEmpty() { regCodPaymentTermCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_PAYMENT_TERM_CD: {varchar(30)}
     */
    public void setCodPaymentTermCd_IsNotNull() { regCodPaymentTermCd(CK_ISNN, DOBJ); }

    protected void regCodPaymentTermCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodPaymentTermCd(), "COD_PAYMENT_TERM_CD"); }
    protected abstract ConditionValue xgetCValueCodPaymentTermCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_Equal(java.math.BigDecimal codAmount) {
        doSetCodAmount_Equal(codAmount);
    }

    protected void doSetCodAmount_Equal(java.math.BigDecimal codAmount) {
        regCodAmount(CK_EQ, codAmount);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_NotEqual(java.math.BigDecimal codAmount) {
        doSetCodAmount_NotEqual(codAmount);
    }

    protected void doSetCodAmount_NotEqual(java.math.BigDecimal codAmount) {
        regCodAmount(CK_NES, codAmount);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_GreaterThan(java.math.BigDecimal codAmount) {
        regCodAmount(CK_GT, codAmount);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_LessThan(java.math.BigDecimal codAmount) {
        regCodAmount(CK_LT, codAmount);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_GreaterEqual(java.math.BigDecimal codAmount) {
        regCodAmount(CK_GE, codAmount);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmount The value of codAmount as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodAmount_LessEqual(java.math.BigDecimal codAmount) {
        regCodAmount(CK_LE, codAmount);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param minNumber The min number of codAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codAmount. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCodAmount_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodAmount(), "COD_AMOUNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmountList The collection of codAmount as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodAmount_InScope(Collection<java.math.BigDecimal> codAmountList) {
        doSetCodAmount_InScope(codAmountList);
    }

    protected void doSetCodAmount_InScope(Collection<java.math.BigDecimal> codAmountList) {
        regINS(CK_INS, cTL(codAmountList), xgetCValueCodAmount(), "COD_AMOUNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     * @param codAmountList The collection of codAmount as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodAmount_NotInScope(Collection<java.math.BigDecimal> codAmountList) {
        doSetCodAmount_NotInScope(codAmountList);
    }

    protected void doSetCodAmount_NotInScope(Collection<java.math.BigDecimal> codAmountList) {
        regINS(CK_NINS, cTL(codAmountList), xgetCValueCodAmount(), "COD_AMOUNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     */
    public void setCodAmount_IsNull() { regCodAmount(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_AMOUNT: {decimal(16, 6)}
     */
    public void setCodAmount_IsNotNull() { regCodAmount(CK_ISNN, DOBJ); }

    protected void regCodAmount(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodAmount(), "COD_AMOUNT"); }
    protected abstract ConditionValue xgetCValueCodAmount();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_Equal(String codFeePayer) {
        doSetCodFeePayer_Equal(fRES(codFeePayer));
    }

    protected void doSetCodFeePayer_Equal(String codFeePayer) {
        regCodFeePayer(CK_EQ, codFeePayer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_NotEqual(String codFeePayer) {
        doSetCodFeePayer_NotEqual(fRES(codFeePayer));
    }

    protected void doSetCodFeePayer_NotEqual(String codFeePayer) {
        regCodFeePayer(CK_NES, codFeePayer);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_GreaterThan(String codFeePayer) {
        regCodFeePayer(CK_GT, fRES(codFeePayer));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_LessThan(String codFeePayer) {
        regCodFeePayer(CK_LT, fRES(codFeePayer));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_GreaterEqual(String codFeePayer) {
        regCodFeePayer(CK_GE, fRES(codFeePayer));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_LessEqual(String codFeePayer) {
        regCodFeePayer(CK_LE, fRES(codFeePayer));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayerList The collection of codFeePayer as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_InScope(Collection<String> codFeePayerList) {
        doSetCodFeePayer_InScope(codFeePayerList);
    }

    protected void doSetCodFeePayer_InScope(Collection<String> codFeePayerList) {
        regINS(CK_INS, cTL(codFeePayerList), xgetCValueCodFeePayer(), "COD_FEE_PAYER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayerList The collection of codFeePayer as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_NotInScope(Collection<String> codFeePayerList) {
        doSetCodFeePayer_NotInScope(codFeePayerList);
    }

    protected void doSetCodFeePayer_NotInScope(Collection<String> codFeePayerList) {
        regINS(CK_NINS, cTL(codFeePayerList), xgetCValueCodFeePayer(), "COD_FEE_PAYER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)} <br>
     * <pre>e.g. setCodFeePayer_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param codFeePayer The value of codFeePayer as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCodFeePayer_LikeSearch(String codFeePayer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(codFeePayer), xgetCValueCodFeePayer(), "COD_FEE_PAYER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCodFeePayer_NotLikeSearch(String codFeePayer, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(codFeePayer), xgetCValueCodFeePayer(), "COD_FEE_PAYER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     * @param codFeePayer The value of codFeePayer as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFeePayer_PrefixSearch(String codFeePayer) {
        setCodFeePayer_LikeSearch(codFeePayer, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     */
    public void setCodFeePayer_IsNull() { regCodFeePayer(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     */
    public void setCodFeePayer_IsNullOrEmpty() { regCodFeePayer(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_FEE_PAYER: {varchar(30)}
     */
    public void setCodFeePayer_IsNotNull() { regCodFeePayer(CK_ISNN, DOBJ); }

    protected void regCodFeePayer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodFeePayer(), "COD_FEE_PAYER"); }
    protected abstract ConditionValue xgetCValueCodFeePayer();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_Equal(String termsOfSales) {
        doSetTermsOfSales_Equal(fRES(termsOfSales));
    }

    protected void doSetTermsOfSales_Equal(String termsOfSales) {
        regTermsOfSales(CK_EQ, termsOfSales);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_NotEqual(String termsOfSales) {
        doSetTermsOfSales_NotEqual(fRES(termsOfSales));
    }

    protected void doSetTermsOfSales_NotEqual(String termsOfSales) {
        regTermsOfSales(CK_NES, termsOfSales);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_GreaterThan(String termsOfSales) {
        regTermsOfSales(CK_GT, fRES(termsOfSales));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_LessThan(String termsOfSales) {
        regTermsOfSales(CK_LT, fRES(termsOfSales));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_GreaterEqual(String termsOfSales) {
        regTermsOfSales(CK_GE, fRES(termsOfSales));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_LessEqual(String termsOfSales) {
        regTermsOfSales(CK_LE, fRES(termsOfSales));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSalesList The collection of termsOfSales as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_InScope(Collection<String> termsOfSalesList) {
        doSetTermsOfSales_InScope(termsOfSalesList);
    }

    protected void doSetTermsOfSales_InScope(Collection<String> termsOfSalesList) {
        regINS(CK_INS, cTL(termsOfSalesList), xgetCValueTermsOfSales(), "TERMS_OF_SALES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSalesList The collection of termsOfSales as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_NotInScope(Collection<String> termsOfSalesList) {
        doSetTermsOfSales_NotInScope(termsOfSalesList);
    }

    protected void doSetTermsOfSales_NotInScope(Collection<String> termsOfSalesList) {
        regINS(CK_NINS, cTL(termsOfSalesList), xgetCValueTermsOfSales(), "TERMS_OF_SALES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)} <br>
     * <pre>e.g. setTermsOfSales_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param termsOfSales The value of termsOfSales as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTermsOfSales_LikeSearch(String termsOfSales, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(termsOfSales), xgetCValueTermsOfSales(), "TERMS_OF_SALES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTermsOfSales_NotLikeSearch(String termsOfSales, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(termsOfSales), xgetCValueTermsOfSales(), "TERMS_OF_SALES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     * @param termsOfSales The value of termsOfSales as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTermsOfSales_PrefixSearch(String termsOfSales) {
        setTermsOfSales_LikeSearch(termsOfSales, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     */
    public void setTermsOfSales_IsNull() { regTermsOfSales(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     */
    public void setTermsOfSales_IsNullOrEmpty() { regTermsOfSales(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TERMS_OF_SALES: {varchar(30)}
     */
    public void setTermsOfSales_IsNotNull() { regTermsOfSales(CK_ISNN, DOBJ); }

    protected void regTermsOfSales(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTermsOfSales(), "TERMS_OF_SALES"); }
    protected abstract ConditionValue xgetCValueTermsOfSales();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_Equal(String brokerName) {
        doSetBrokerName_Equal(fRES(brokerName));
    }

    protected void doSetBrokerName_Equal(String brokerName) {
        regBrokerName(CK_EQ, brokerName);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_NotEqual(String brokerName) {
        doSetBrokerName_NotEqual(fRES(brokerName));
    }

    protected void doSetBrokerName_NotEqual(String brokerName) {
        regBrokerName(CK_NES, brokerName);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_GreaterThan(String brokerName) {
        regBrokerName(CK_GT, fRES(brokerName));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_LessThan(String brokerName) {
        regBrokerName(CK_LT, fRES(brokerName));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_GreaterEqual(String brokerName) {
        regBrokerName(CK_GE, fRES(brokerName));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_LessEqual(String brokerName) {
        regBrokerName(CK_LE, fRES(brokerName));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerNameList The collection of brokerName as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_InScope(Collection<String> brokerNameList) {
        doSetBrokerName_InScope(brokerNameList);
    }

    protected void doSetBrokerName_InScope(Collection<String> brokerNameList) {
        regINS(CK_INS, cTL(brokerNameList), xgetCValueBrokerName(), "BROKER_NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerNameList The collection of brokerName as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_NotInScope(Collection<String> brokerNameList) {
        doSetBrokerName_NotInScope(brokerNameList);
    }

    protected void doSetBrokerName_NotInScope(Collection<String> brokerNameList) {
        regINS(CK_NINS, cTL(brokerNameList), xgetCValueBrokerName(), "BROKER_NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_NAME: {varchar(255)} <br>
     * <pre>e.g. setBrokerName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brokerName The value of brokerName as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrokerName_LikeSearch(String brokerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brokerName), xgetCValueBrokerName(), "BROKER_NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrokerName_NotLikeSearch(String brokerName, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brokerName), xgetCValueBrokerName(), "BROKER_NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     * @param brokerName The value of brokerName as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerName_PrefixSearch(String brokerName) {
        setBrokerName_LikeSearch(brokerName, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     */
    public void setBrokerName_IsNull() { regBrokerName(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     */
    public void setBrokerName_IsNullOrEmpty() { regBrokerName(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BROKER_NAME: {varchar(255)}
     */
    public void setBrokerName_IsNotNull() { regBrokerName(CK_ISNN, DOBJ); }

    protected void regBrokerName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrokerName(), "BROKER_NAME"); }
    protected abstract ConditionValue xgetCValueBrokerName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_Equal(String brokerPhoneNo) {
        doSetBrokerPhoneNo_Equal(fRES(brokerPhoneNo));
    }

    protected void doSetBrokerPhoneNo_Equal(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_EQ, brokerPhoneNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_NotEqual(String brokerPhoneNo) {
        doSetBrokerPhoneNo_NotEqual(fRES(brokerPhoneNo));
    }

    protected void doSetBrokerPhoneNo_NotEqual(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_NES, brokerPhoneNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_GreaterThan(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_GT, fRES(brokerPhoneNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_LessThan(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_LT, fRES(brokerPhoneNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_GreaterEqual(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_GE, fRES(brokerPhoneNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_LessEqual(String brokerPhoneNo) {
        regBrokerPhoneNo(CK_LE, fRES(brokerPhoneNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNoList The collection of brokerPhoneNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_InScope(Collection<String> brokerPhoneNoList) {
        doSetBrokerPhoneNo_InScope(brokerPhoneNoList);
    }

    protected void doSetBrokerPhoneNo_InScope(Collection<String> brokerPhoneNoList) {
        regINS(CK_INS, cTL(brokerPhoneNoList), xgetCValueBrokerPhoneNo(), "BROKER_PHONE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNoList The collection of brokerPhoneNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_NotInScope(Collection<String> brokerPhoneNoList) {
        doSetBrokerPhoneNo_NotInScope(brokerPhoneNoList);
    }

    protected void doSetBrokerPhoneNo_NotInScope(Collection<String> brokerPhoneNoList) {
        regINS(CK_NINS, cTL(brokerPhoneNoList), xgetCValueBrokerPhoneNo(), "BROKER_PHONE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)} <br>
     * <pre>e.g. setBrokerPhoneNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brokerPhoneNo The value of brokerPhoneNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrokerPhoneNo_LikeSearch(String brokerPhoneNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brokerPhoneNo), xgetCValueBrokerPhoneNo(), "BROKER_PHONE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrokerPhoneNo_NotLikeSearch(String brokerPhoneNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brokerPhoneNo), xgetCValueBrokerPhoneNo(), "BROKER_PHONE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     * @param brokerPhoneNo The value of brokerPhoneNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerPhoneNo_PrefixSearch(String brokerPhoneNo) {
        setBrokerPhoneNo_LikeSearch(brokerPhoneNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     */
    public void setBrokerPhoneNo_IsNull() { regBrokerPhoneNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     */
    public void setBrokerPhoneNo_IsNullOrEmpty() { regBrokerPhoneNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BROKER_PHONE_NO: {varchar(30)}
     */
    public void setBrokerPhoneNo_IsNotNull() { regBrokerPhoneNo(CK_ISNN, DOBJ); }

    protected void regBrokerPhoneNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrokerPhoneNo(), "BROKER_PHONE_NO"); }
    protected abstract ConditionValue xgetCValueBrokerPhoneNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_Equal(String brokerFaxNo) {
        doSetBrokerFaxNo_Equal(fRES(brokerFaxNo));
    }

    protected void doSetBrokerFaxNo_Equal(String brokerFaxNo) {
        regBrokerFaxNo(CK_EQ, brokerFaxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_NotEqual(String brokerFaxNo) {
        doSetBrokerFaxNo_NotEqual(fRES(brokerFaxNo));
    }

    protected void doSetBrokerFaxNo_NotEqual(String brokerFaxNo) {
        regBrokerFaxNo(CK_NES, brokerFaxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_GreaterThan(String brokerFaxNo) {
        regBrokerFaxNo(CK_GT, fRES(brokerFaxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_LessThan(String brokerFaxNo) {
        regBrokerFaxNo(CK_LT, fRES(brokerFaxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_GreaterEqual(String brokerFaxNo) {
        regBrokerFaxNo(CK_GE, fRES(brokerFaxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_LessEqual(String brokerFaxNo) {
        regBrokerFaxNo(CK_LE, fRES(brokerFaxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNoList The collection of brokerFaxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_InScope(Collection<String> brokerFaxNoList) {
        doSetBrokerFaxNo_InScope(brokerFaxNoList);
    }

    protected void doSetBrokerFaxNo_InScope(Collection<String> brokerFaxNoList) {
        regINS(CK_INS, cTL(brokerFaxNoList), xgetCValueBrokerFaxNo(), "BROKER_FAX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNoList The collection of brokerFaxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_NotInScope(Collection<String> brokerFaxNoList) {
        doSetBrokerFaxNo_NotInScope(brokerFaxNoList);
    }

    protected void doSetBrokerFaxNo_NotInScope(Collection<String> brokerFaxNoList) {
        regINS(CK_NINS, cTL(brokerFaxNoList), xgetCValueBrokerFaxNo(), "BROKER_FAX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)} <br>
     * <pre>e.g. setBrokerFaxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param brokerFaxNo The value of brokerFaxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBrokerFaxNo_LikeSearch(String brokerFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(brokerFaxNo), xgetCValueBrokerFaxNo(), "BROKER_FAX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBrokerFaxNo_NotLikeSearch(String brokerFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(brokerFaxNo), xgetCValueBrokerFaxNo(), "BROKER_FAX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     * @param brokerFaxNo The value of brokerFaxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBrokerFaxNo_PrefixSearch(String brokerFaxNo) {
        setBrokerFaxNo_LikeSearch(brokerFaxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     */
    public void setBrokerFaxNo_IsNull() { regBrokerFaxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     */
    public void setBrokerFaxNo_IsNullOrEmpty() { regBrokerFaxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BROKER_FAX_NO: {varchar(30)}
     */
    public void setBrokerFaxNo_IsNotNull() { regBrokerFaxNo(CK_ISNN, DOBJ); }

    protected void regBrokerFaxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBrokerFaxNo(), "BROKER_FAX_NO"); }
    protected abstract ConditionValue xgetCValueBrokerFaxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @param satDeliveryFlg The value of satDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_Equal(String satDeliveryFlg) {
        doSetSatDeliveryFlg_Equal(fRES(satDeliveryFlg));
    }

    /**
     * Equal(=). As SatDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_Equal_AsSatDeliveryFlg(CDef.SatDeliveryFlg cdef) {
        doSetSatDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSatDeliveryFlg_Equal_$0() {
        setSatDeliveryFlg_Equal_AsSatDeliveryFlg(CDef.SatDeliveryFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSatDeliveryFlg_Equal_$1() {
        setSatDeliveryFlg_Equal_AsSatDeliveryFlg(CDef.SatDeliveryFlg.$1);
    }

    protected void doSetSatDeliveryFlg_Equal(String satDeliveryFlg) {
        regSatDeliveryFlg(CK_EQ, satDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @param satDeliveryFlg The value of satDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_NotEqual(String satDeliveryFlg) {
        doSetSatDeliveryFlg_NotEqual(fRES(satDeliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SatDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_NotEqual_AsSatDeliveryFlg(CDef.SatDeliveryFlg cdef) {
        doSetSatDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSatDeliveryFlg_NotEqual_$0() {
        setSatDeliveryFlg_NotEqual_AsSatDeliveryFlg(CDef.SatDeliveryFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSatDeliveryFlg_NotEqual_$1() {
        setSatDeliveryFlg_NotEqual_AsSatDeliveryFlg(CDef.SatDeliveryFlg.$1);
    }

    protected void doSetSatDeliveryFlg_NotEqual(String satDeliveryFlg) {
        regSatDeliveryFlg(CK_NES, satDeliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @param satDeliveryFlgList The collection of satDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_InScope(Collection<String> satDeliveryFlgList) {
        doSetSatDeliveryFlg_InScope(satDeliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SatDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_InScope_AsSatDeliveryFlg(Collection<CDef.SatDeliveryFlg> cdefList) {
        doSetSatDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSatDeliveryFlg_InScope(Collection<String> satDeliveryFlgList) {
        regINS(CK_INS, cTL(satDeliveryFlgList), xgetCValueSatDeliveryFlg(), "SAT_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     * @param satDeliveryFlgList The collection of satDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_NotInScope(Collection<String> satDeliveryFlgList) {
        doSetSatDeliveryFlg_NotInScope(satDeliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SatDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg} <br>
     * Saturday Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSatDeliveryFlg_NotInScope_AsSatDeliveryFlg(Collection<CDef.SatDeliveryFlg> cdefList) {
        doSetSatDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSatDeliveryFlg_NotInScope(Collection<String> satDeliveryFlgList) {
        regINS(CK_NINS, cTL(satDeliveryFlgList), xgetCValueSatDeliveryFlg(), "SAT_DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     */
    public void setSatDeliveryFlg_IsNull() { regSatDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAT_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=SatDeliveryFlg}
     */
    public void setSatDeliveryFlg_IsNotNull() { regSatDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regSatDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSatDeliveryFlg(), "SAT_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueSatDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @param residentialDeliveryFlg The value of residentialDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_Equal(String residentialDeliveryFlg) {
        doSetResidentialDeliveryFlg_Equal(fRES(residentialDeliveryFlg));
    }

    /**
     * Equal(=). As ResidentialDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_Equal_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg cdef) {
        doSetResidentialDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setResidentialDeliveryFlg_Equal_$0() {
        setResidentialDeliveryFlg_Equal_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setResidentialDeliveryFlg_Equal_$1() {
        setResidentialDeliveryFlg_Equal_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$1);
    }

    protected void doSetResidentialDeliveryFlg_Equal(String residentialDeliveryFlg) {
        regResidentialDeliveryFlg(CK_EQ, residentialDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @param residentialDeliveryFlg The value of residentialDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_NotEqual(String residentialDeliveryFlg) {
        doSetResidentialDeliveryFlg_NotEqual(fRES(residentialDeliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ResidentialDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_NotEqual_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg cdef) {
        doSetResidentialDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setResidentialDeliveryFlg_NotEqual_$0() {
        setResidentialDeliveryFlg_NotEqual_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setResidentialDeliveryFlg_NotEqual_$1() {
        setResidentialDeliveryFlg_NotEqual_AsResidentialDeliveryFlg(CDef.ResidentialDeliveryFlg.$1);
    }

    protected void doSetResidentialDeliveryFlg_NotEqual(String residentialDeliveryFlg) {
        regResidentialDeliveryFlg(CK_NES, residentialDeliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @param residentialDeliveryFlgList The collection of residentialDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_InScope(Collection<String> residentialDeliveryFlgList) {
        doSetResidentialDeliveryFlg_InScope(residentialDeliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ResidentialDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_InScope_AsResidentialDeliveryFlg(Collection<CDef.ResidentialDeliveryFlg> cdefList) {
        doSetResidentialDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetResidentialDeliveryFlg_InScope(Collection<String> residentialDeliveryFlgList) {
        regINS(CK_INS, cTL(residentialDeliveryFlgList), xgetCValueResidentialDeliveryFlg(), "RESIDENTIAL_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     * @param residentialDeliveryFlgList The collection of residentialDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_NotInScope(Collection<String> residentialDeliveryFlgList) {
        doSetResidentialDeliveryFlg_NotInScope(residentialDeliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ResidentialDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg} <br>
     * Residential Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialDeliveryFlg_NotInScope_AsResidentialDeliveryFlg(Collection<CDef.ResidentialDeliveryFlg> cdefList) {
        doSetResidentialDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetResidentialDeliveryFlg_NotInScope(Collection<String> residentialDeliveryFlgList) {
        regINS(CK_NINS, cTL(residentialDeliveryFlgList), xgetCValueResidentialDeliveryFlg(), "RESIDENTIAL_DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     */
    public void setResidentialDeliveryFlg_IsNull() { regResidentialDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESIDENTIAL_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialDeliveryFlg}
     */
    public void setResidentialDeliveryFlg_IsNotNull() { regResidentialDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regResidentialDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResidentialDeliveryFlg(), "RESIDENTIAL_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueResidentialDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @param codFlg The value of codFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_Equal(String codFlg) {
        doSetCodFlg_Equal(fRES(codFlg));
    }

    /**
     * Equal(=). As CodFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFlg_Equal_AsCodFlg(CDef.CodFlg cdef) {
        doSetCodFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setCodFlg_Equal_$0() {
        setCodFlg_Equal_AsCodFlg(CDef.CodFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setCodFlg_Equal_$1() {
        setCodFlg_Equal_AsCodFlg(CDef.CodFlg.$1);
    }

    protected void doSetCodFlg_Equal(String codFlg) {
        regCodFlg(CK_EQ, codFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @param codFlg The value of codFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_NotEqual(String codFlg) {
        doSetCodFlg_NotEqual(fRES(codFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CodFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCodFlg_NotEqual_AsCodFlg(CDef.CodFlg cdef) {
        doSetCodFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setCodFlg_NotEqual_$0() {
        setCodFlg_NotEqual_AsCodFlg(CDef.CodFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setCodFlg_NotEqual_$1() {
        setCodFlg_NotEqual_AsCodFlg(CDef.CodFlg.$1);
    }

    protected void doSetCodFlg_NotEqual(String codFlg) {
        regCodFlg(CK_NES, codFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @param codFlgList The collection of codFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_InScope(Collection<String> codFlgList) {
        doSetCodFlg_InScope(codFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CodFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_InScope_AsCodFlg(Collection<CDef.CodFlg> cdefList) {
        doSetCodFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCodFlg_InScope(Collection<String> codFlgList) {
        regINS(CK_INS, cTL(codFlgList), xgetCValueCodFlg(), "COD_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     * @param codFlgList The collection of codFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_NotInScope(Collection<String> codFlgList) {
        doSetCodFlg_NotInScope(codFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CodFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg} <br>
     * Collect On Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFlg_NotInScope_AsCodFlg(Collection<CDef.CodFlg> cdefList) {
        doSetCodFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCodFlg_NotInScope(Collection<String> codFlgList) {
        regINS(CK_NINS, cTL(codFlgList), xgetCValueCodFlg(), "COD_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     */
    public void setCodFlg_IsNull() { regCodFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_FLG: {char(1), FK to B_CLASS_DTL, classification=CodFlg}
     */
    public void setCodFlg_IsNotNull() { regCodFlg(CK_ISNN, DOBJ); }

    protected void regCodFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodFlg(), "COD_FLG"); }
    protected abstract ConditionValue xgetCValueCodFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @param signatureRequiredFlg The value of signatureRequiredFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_Equal(String signatureRequiredFlg) {
        doSetSignatureRequiredFlg_Equal(fRES(signatureRequiredFlg));
    }

    /**
     * Equal(=). As SignatureRequiredFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_Equal_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg cdef) {
        doSetSignatureRequiredFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSignatureRequiredFlg_Equal_$0() {
        setSignatureRequiredFlg_Equal_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSignatureRequiredFlg_Equal_$1() {
        setSignatureRequiredFlg_Equal_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$1);
    }

    protected void doSetSignatureRequiredFlg_Equal(String signatureRequiredFlg) {
        regSignatureRequiredFlg(CK_EQ, signatureRequiredFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @param signatureRequiredFlg The value of signatureRequiredFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_NotEqual(String signatureRequiredFlg) {
        doSetSignatureRequiredFlg_NotEqual(fRES(signatureRequiredFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SignatureRequiredFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_NotEqual_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg cdef) {
        doSetSignatureRequiredFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSignatureRequiredFlg_NotEqual_$0() {
        setSignatureRequiredFlg_NotEqual_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSignatureRequiredFlg_NotEqual_$1() {
        setSignatureRequiredFlg_NotEqual_AsSignatureRequiredFlg(CDef.SignatureRequiredFlg.$1);
    }

    protected void doSetSignatureRequiredFlg_NotEqual(String signatureRequiredFlg) {
        regSignatureRequiredFlg(CK_NES, signatureRequiredFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @param signatureRequiredFlgList The collection of signatureRequiredFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_InScope(Collection<String> signatureRequiredFlgList) {
        doSetSignatureRequiredFlg_InScope(signatureRequiredFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SignatureRequiredFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_InScope_AsSignatureRequiredFlg(Collection<CDef.SignatureRequiredFlg> cdefList) {
        doSetSignatureRequiredFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSignatureRequiredFlg_InScope(Collection<String> signatureRequiredFlgList) {
        regINS(CK_INS, cTL(signatureRequiredFlgList), xgetCValueSignatureRequiredFlg(), "SIGNATURE_REQUIRED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     * @param signatureRequiredFlgList The collection of signatureRequiredFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_NotInScope(Collection<String> signatureRequiredFlgList) {
        doSetSignatureRequiredFlg_NotInScope(signatureRequiredFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SignatureRequiredFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg} <br>
     * Signature Required フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureRequiredFlg_NotInScope_AsSignatureRequiredFlg(Collection<CDef.SignatureRequiredFlg> cdefList) {
        doSetSignatureRequiredFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSignatureRequiredFlg_NotInScope(Collection<String> signatureRequiredFlgList) {
        regINS(CK_NINS, cTL(signatureRequiredFlgList), xgetCValueSignatureRequiredFlg(), "SIGNATURE_REQUIRED_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     */
    public void setSignatureRequiredFlg_IsNull() { regSignatureRequiredFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SIGNATURE_REQUIRED_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureRequiredFlg}
     */
    public void setSignatureRequiredFlg_IsNotNull() { regSignatureRequiredFlg(CK_ISNN, DOBJ); }

    protected void regSignatureRequiredFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSignatureRequiredFlg(), "SIGNATURE_REQUIRED_FLG"); }
    protected abstract ConditionValue xgetCValueSignatureRequiredFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @param signatureReleaseFlg The value of signatureReleaseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_Equal(String signatureReleaseFlg) {
        doSetSignatureReleaseFlg_Equal(fRES(signatureReleaseFlg));
    }

    /**
     * Equal(=). As SignatureReleaseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_Equal_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg cdef) {
        doSetSignatureReleaseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSignatureReleaseFlg_Equal_$0() {
        setSignatureReleaseFlg_Equal_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSignatureReleaseFlg_Equal_$1() {
        setSignatureReleaseFlg_Equal_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$1);
    }

    protected void doSetSignatureReleaseFlg_Equal(String signatureReleaseFlg) {
        regSignatureReleaseFlg(CK_EQ, signatureReleaseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @param signatureReleaseFlg The value of signatureReleaseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_NotEqual(String signatureReleaseFlg) {
        doSetSignatureReleaseFlg_NotEqual(fRES(signatureReleaseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As SignatureReleaseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_NotEqual_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg cdef) {
        doSetSignatureReleaseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setSignatureReleaseFlg_NotEqual_$0() {
        setSignatureReleaseFlg_NotEqual_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setSignatureReleaseFlg_NotEqual_$1() {
        setSignatureReleaseFlg_NotEqual_AsSignatureReleaseFlg(CDef.SignatureReleaseFlg.$1);
    }

    protected void doSetSignatureReleaseFlg_NotEqual(String signatureReleaseFlg) {
        regSignatureReleaseFlg(CK_NES, signatureReleaseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @param signatureReleaseFlgList The collection of signatureReleaseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_InScope(Collection<String> signatureReleaseFlgList) {
        doSetSignatureReleaseFlg_InScope(signatureReleaseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As SignatureReleaseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_InScope_AsSignatureReleaseFlg(Collection<CDef.SignatureReleaseFlg> cdefList) {
        doSetSignatureReleaseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSignatureReleaseFlg_InScope(Collection<String> signatureReleaseFlgList) {
        regINS(CK_INS, cTL(signatureReleaseFlgList), xgetCValueSignatureReleaseFlg(), "SIGNATURE_RELEASE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     * @param signatureReleaseFlgList The collection of signatureReleaseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_NotInScope(Collection<String> signatureReleaseFlgList) {
        doSetSignatureReleaseFlg_NotInScope(signatureReleaseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SignatureReleaseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg} <br>
     * Signature ReleaseフラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSignatureReleaseFlg_NotInScope_AsSignatureReleaseFlg(Collection<CDef.SignatureReleaseFlg> cdefList) {
        doSetSignatureReleaseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSignatureReleaseFlg_NotInScope(Collection<String> signatureReleaseFlgList) {
        regINS(CK_NINS, cTL(signatureReleaseFlgList), xgetCValueSignatureReleaseFlg(), "SIGNATURE_RELEASE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     */
    public void setSignatureReleaseFlg_IsNull() { regSignatureReleaseFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SIGNATURE_RELEASE_FLG: {char(1), FK to B_CLASS_DTL, classification=SignatureReleaseFlg}
     */
    public void setSignatureReleaseFlg_IsNotNull() { regSignatureReleaseFlg(CK_ISNN, DOBJ); }

    protected void regSignatureReleaseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSignatureReleaseFlg(), "SIGNATURE_RELEASE_FLG"); }
    protected abstract ConditionValue xgetCValueSignatureReleaseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @param callBeforeDeliveryFlg The value of callBeforeDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_Equal(String callBeforeDeliveryFlg) {
        doSetCallBeforeDeliveryFlg_Equal(fRES(callBeforeDeliveryFlg));
    }

    /**
     * Equal(=). As CallBeforeDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_Equal_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg cdef) {
        doSetCallBeforeDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setCallBeforeDeliveryFlg_Equal_$0() {
        setCallBeforeDeliveryFlg_Equal_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setCallBeforeDeliveryFlg_Equal_$1() {
        setCallBeforeDeliveryFlg_Equal_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$1);
    }

    protected void doSetCallBeforeDeliveryFlg_Equal(String callBeforeDeliveryFlg) {
        regCallBeforeDeliveryFlg(CK_EQ, callBeforeDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @param callBeforeDeliveryFlg The value of callBeforeDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_NotEqual(String callBeforeDeliveryFlg) {
        doSetCallBeforeDeliveryFlg_NotEqual(fRES(callBeforeDeliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As CallBeforeDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_NotEqual_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg cdef) {
        doSetCallBeforeDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setCallBeforeDeliveryFlg_NotEqual_$0() {
        setCallBeforeDeliveryFlg_NotEqual_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setCallBeforeDeliveryFlg_NotEqual_$1() {
        setCallBeforeDeliveryFlg_NotEqual_AsCallBeforeDeliveryFlg(CDef.CallBeforeDeliveryFlg.$1);
    }

    protected void doSetCallBeforeDeliveryFlg_NotEqual(String callBeforeDeliveryFlg) {
        regCallBeforeDeliveryFlg(CK_NES, callBeforeDeliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @param callBeforeDeliveryFlgList The collection of callBeforeDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_InScope(Collection<String> callBeforeDeliveryFlgList) {
        doSetCallBeforeDeliveryFlg_InScope(callBeforeDeliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As CallBeforeDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_InScope_AsCallBeforeDeliveryFlg(Collection<CDef.CallBeforeDeliveryFlg> cdefList) {
        doSetCallBeforeDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCallBeforeDeliveryFlg_InScope(Collection<String> callBeforeDeliveryFlgList) {
        regINS(CK_INS, cTL(callBeforeDeliveryFlgList), xgetCValueCallBeforeDeliveryFlg(), "CALL_BEFORE_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     * @param callBeforeDeliveryFlgList The collection of callBeforeDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_NotInScope(Collection<String> callBeforeDeliveryFlgList) {
        doSetCallBeforeDeliveryFlg_NotInScope(callBeforeDeliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As CallBeforeDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg} <br>
     * Call Before Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCallBeforeDeliveryFlg_NotInScope_AsCallBeforeDeliveryFlg(Collection<CDef.CallBeforeDeliveryFlg> cdefList) {
        doSetCallBeforeDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCallBeforeDeliveryFlg_NotInScope(Collection<String> callBeforeDeliveryFlgList) {
        regINS(CK_NINS, cTL(callBeforeDeliveryFlgList), xgetCValueCallBeforeDeliveryFlg(), "CALL_BEFORE_DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     */
    public void setCallBeforeDeliveryFlg_IsNull() { regCallBeforeDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CALL_BEFORE_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=CallBeforeDeliveryFlg}
     */
    public void setCallBeforeDeliveryFlg_IsNotNull() { regCallBeforeDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regCallBeforeDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCallBeforeDeliveryFlg(), "CALL_BEFORE_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueCallBeforeDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @param freezableProtectionFlg The value of freezableProtectionFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_Equal(String freezableProtectionFlg) {
        doSetFreezableProtectionFlg_Equal(fRES(freezableProtectionFlg));
    }

    /**
     * Equal(=). As FreezableProtectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_Equal_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg cdef) {
        doSetFreezableProtectionFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setFreezableProtectionFlg_Equal_$0() {
        setFreezableProtectionFlg_Equal_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setFreezableProtectionFlg_Equal_$1() {
        setFreezableProtectionFlg_Equal_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$1);
    }

    protected void doSetFreezableProtectionFlg_Equal(String freezableProtectionFlg) {
        regFreezableProtectionFlg(CK_EQ, freezableProtectionFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @param freezableProtectionFlg The value of freezableProtectionFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_NotEqual(String freezableProtectionFlg) {
        doSetFreezableProtectionFlg_NotEqual(fRES(freezableProtectionFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As FreezableProtectionFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_NotEqual_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg cdef) {
        doSetFreezableProtectionFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setFreezableProtectionFlg_NotEqual_$0() {
        setFreezableProtectionFlg_NotEqual_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setFreezableProtectionFlg_NotEqual_$1() {
        setFreezableProtectionFlg_NotEqual_AsFreezableProtectionFlg(CDef.FreezableProtectionFlg.$1);
    }

    protected void doSetFreezableProtectionFlg_NotEqual(String freezableProtectionFlg) {
        regFreezableProtectionFlg(CK_NES, freezableProtectionFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @param freezableProtectionFlgList The collection of freezableProtectionFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_InScope(Collection<String> freezableProtectionFlgList) {
        doSetFreezableProtectionFlg_InScope(freezableProtectionFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As FreezableProtectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_InScope_AsFreezableProtectionFlg(Collection<CDef.FreezableProtectionFlg> cdefList) {
        doSetFreezableProtectionFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetFreezableProtectionFlg_InScope(Collection<String> freezableProtectionFlgList) {
        regINS(CK_INS, cTL(freezableProtectionFlgList), xgetCValueFreezableProtectionFlg(), "FREEZABLE_PROTECTION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     * @param freezableProtectionFlgList The collection of freezableProtectionFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_NotInScope(Collection<String> freezableProtectionFlgList) {
        doSetFreezableProtectionFlg_NotInScope(freezableProtectionFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As FreezableProtectionFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg} <br>
     * Freezable Protection フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFreezableProtectionFlg_NotInScope_AsFreezableProtectionFlg(Collection<CDef.FreezableProtectionFlg> cdefList) {
        doSetFreezableProtectionFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetFreezableProtectionFlg_NotInScope(Collection<String> freezableProtectionFlgList) {
        regINS(CK_NINS, cTL(freezableProtectionFlgList), xgetCValueFreezableProtectionFlg(), "FREEZABLE_PROTECTION_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     */
    public void setFreezableProtectionFlg_IsNull() { regFreezableProtectionFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FREEZABLE_PROTECTION_FLG: {char(1), FK to B_CLASS_DTL, classification=FreezableProtectionFlg}
     */
    public void setFreezableProtectionFlg_IsNotNull() { regFreezableProtectionFlg(CK_ISNN, DOBJ); }

    protected void regFreezableProtectionFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFreezableProtectionFlg(), "FREEZABLE_PROTECTION_FLG"); }
    protected abstract ConditionValue xgetCValueFreezableProtectionFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @param guaranteedPlusFlg The value of guaranteedPlusFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_Equal(String guaranteedPlusFlg) {
        doSetGuaranteedPlusFlg_Equal(fRES(guaranteedPlusFlg));
    }

    /**
     * Equal(=). As GuaranteedPlusFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_Equal_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg cdef) {
        doSetGuaranteedPlusFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setGuaranteedPlusFlg_Equal_$0() {
        setGuaranteedPlusFlg_Equal_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setGuaranteedPlusFlg_Equal_$1() {
        setGuaranteedPlusFlg_Equal_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$1);
    }

    protected void doSetGuaranteedPlusFlg_Equal(String guaranteedPlusFlg) {
        regGuaranteedPlusFlg(CK_EQ, guaranteedPlusFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @param guaranteedPlusFlg The value of guaranteedPlusFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_NotEqual(String guaranteedPlusFlg) {
        doSetGuaranteedPlusFlg_NotEqual(fRES(guaranteedPlusFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As GuaranteedPlusFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_NotEqual_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg cdef) {
        doSetGuaranteedPlusFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setGuaranteedPlusFlg_NotEqual_$0() {
        setGuaranteedPlusFlg_NotEqual_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setGuaranteedPlusFlg_NotEqual_$1() {
        setGuaranteedPlusFlg_NotEqual_AsGuaranteedPlusFlg(CDef.GuaranteedPlusFlg.$1);
    }

    protected void doSetGuaranteedPlusFlg_NotEqual(String guaranteedPlusFlg) {
        regGuaranteedPlusFlg(CK_NES, guaranteedPlusFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @param guaranteedPlusFlgList The collection of guaranteedPlusFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_InScope(Collection<String> guaranteedPlusFlgList) {
        doSetGuaranteedPlusFlg_InScope(guaranteedPlusFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As GuaranteedPlusFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_InScope_AsGuaranteedPlusFlg(Collection<CDef.GuaranteedPlusFlg> cdefList) {
        doSetGuaranteedPlusFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetGuaranteedPlusFlg_InScope(Collection<String> guaranteedPlusFlgList) {
        regINS(CK_INS, cTL(guaranteedPlusFlgList), xgetCValueGuaranteedPlusFlg(), "GUARANTEED_PLUS_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     * @param guaranteedPlusFlgList The collection of guaranteedPlusFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_NotInScope(Collection<String> guaranteedPlusFlgList) {
        doSetGuaranteedPlusFlg_NotInScope(guaranteedPlusFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As GuaranteedPlusFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg} <br>
     * Guaranteed Plus フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGuaranteedPlusFlg_NotInScope_AsGuaranteedPlusFlg(Collection<CDef.GuaranteedPlusFlg> cdefList) {
        doSetGuaranteedPlusFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetGuaranteedPlusFlg_NotInScope(Collection<String> guaranteedPlusFlgList) {
        regINS(CK_NINS, cTL(guaranteedPlusFlgList), xgetCValueGuaranteedPlusFlg(), "GUARANTEED_PLUS_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     */
    public void setGuaranteedPlusFlg_IsNull() { regGuaranteedPlusFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * GUARANTEED_PLUS_FLG: {char(1), FK to B_CLASS_DTL, classification=GuaranteedPlusFlg}
     */
    public void setGuaranteedPlusFlg_IsNotNull() { regGuaranteedPlusFlg(CK_ISNN, DOBJ); }

    protected void regGuaranteedPlusFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGuaranteedPlusFlg(), "GUARANTEED_PLUS_FLG"); }
    protected abstract ConditionValue xgetCValueGuaranteedPlusFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @param residentialPickupFlg The value of residentialPickupFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_Equal(String residentialPickupFlg) {
        doSetResidentialPickupFlg_Equal(fRES(residentialPickupFlg));
    }

    /**
     * Equal(=). As ResidentialPickupFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_Equal_AsResidentialPickupFlg(CDef.ResidentialPickupFlg cdef) {
        doSetResidentialPickupFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setResidentialPickupFlg_Equal_$0() {
        setResidentialPickupFlg_Equal_AsResidentialPickupFlg(CDef.ResidentialPickupFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setResidentialPickupFlg_Equal_$1() {
        setResidentialPickupFlg_Equal_AsResidentialPickupFlg(CDef.ResidentialPickupFlg.$1);
    }

    protected void doSetResidentialPickupFlg_Equal(String residentialPickupFlg) {
        regResidentialPickupFlg(CK_EQ, residentialPickupFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @param residentialPickupFlg The value of residentialPickupFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_NotEqual(String residentialPickupFlg) {
        doSetResidentialPickupFlg_NotEqual(fRES(residentialPickupFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ResidentialPickupFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_NotEqual_AsResidentialPickupFlg(CDef.ResidentialPickupFlg cdef) {
        doSetResidentialPickupFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setResidentialPickupFlg_NotEqual_$0() {
        setResidentialPickupFlg_NotEqual_AsResidentialPickupFlg(CDef.ResidentialPickupFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setResidentialPickupFlg_NotEqual_$1() {
        setResidentialPickupFlg_NotEqual_AsResidentialPickupFlg(CDef.ResidentialPickupFlg.$1);
    }

    protected void doSetResidentialPickupFlg_NotEqual(String residentialPickupFlg) {
        regResidentialPickupFlg(CK_NES, residentialPickupFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @param residentialPickupFlgList The collection of residentialPickupFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_InScope(Collection<String> residentialPickupFlgList) {
        doSetResidentialPickupFlg_InScope(residentialPickupFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ResidentialPickupFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_InScope_AsResidentialPickupFlg(Collection<CDef.ResidentialPickupFlg> cdefList) {
        doSetResidentialPickupFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetResidentialPickupFlg_InScope(Collection<String> residentialPickupFlgList) {
        regINS(CK_INS, cTL(residentialPickupFlgList), xgetCValueResidentialPickupFlg(), "RESIDENTIAL_PICKUP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     * @param residentialPickupFlgList The collection of residentialPickupFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_NotInScope(Collection<String> residentialPickupFlgList) {
        doSetResidentialPickupFlg_NotInScope(residentialPickupFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ResidentialPickupFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg} <br>
     * Residential Pickup フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setResidentialPickupFlg_NotInScope_AsResidentialPickupFlg(Collection<CDef.ResidentialPickupFlg> cdefList) {
        doSetResidentialPickupFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetResidentialPickupFlg_NotInScope(Collection<String> residentialPickupFlgList) {
        regINS(CK_NINS, cTL(residentialPickupFlgList), xgetCValueResidentialPickupFlg(), "RESIDENTIAL_PICKUP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     */
    public void setResidentialPickupFlg_IsNull() { regResidentialPickupFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESIDENTIAL_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=ResidentialPickupFlg}
     */
    public void setResidentialPickupFlg_IsNotNull() { regResidentialPickupFlg(CK_ISNN, DOBJ); }

    protected void regResidentialPickupFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueResidentialPickupFlg(), "RESIDENTIAL_PICKUP_FLG"); }
    protected abstract ConditionValue xgetCValueResidentialPickupFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @param doNotStackStackFlg The value of doNotStackStackFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_Equal(String doNotStackStackFlg) {
        doSetDoNotStackStackFlg_Equal(fRES(doNotStackStackFlg));
    }

    /**
     * Equal(=). As DoNotStackStackFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_Equal_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg cdef) {
        doSetDoNotStackStackFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setDoNotStackStackFlg_Equal_$0() {
        setDoNotStackStackFlg_Equal_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setDoNotStackStackFlg_Equal_$1() {
        setDoNotStackStackFlg_Equal_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$1);
    }

    protected void doSetDoNotStackStackFlg_Equal(String doNotStackStackFlg) {
        regDoNotStackStackFlg(CK_EQ, doNotStackStackFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @param doNotStackStackFlg The value of doNotStackStackFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_NotEqual(String doNotStackStackFlg) {
        doSetDoNotStackStackFlg_NotEqual(fRES(doNotStackStackFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DoNotStackStackFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_NotEqual_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg cdef) {
        doSetDoNotStackStackFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setDoNotStackStackFlg_NotEqual_$0() {
        setDoNotStackStackFlg_NotEqual_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setDoNotStackStackFlg_NotEqual_$1() {
        setDoNotStackStackFlg_NotEqual_AsDoNotStackStackFlg(CDef.DoNotStackStackFlg.$1);
    }

    protected void doSetDoNotStackStackFlg_NotEqual(String doNotStackStackFlg) {
        regDoNotStackStackFlg(CK_NES, doNotStackStackFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @param doNotStackStackFlgList The collection of doNotStackStackFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_InScope(Collection<String> doNotStackStackFlgList) {
        doSetDoNotStackStackFlg_InScope(doNotStackStackFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DoNotStackStackFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_InScope_AsDoNotStackStackFlg(Collection<CDef.DoNotStackStackFlg> cdefList) {
        doSetDoNotStackStackFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDoNotStackStackFlg_InScope(Collection<String> doNotStackStackFlgList) {
        regINS(CK_INS, cTL(doNotStackStackFlgList), xgetCValueDoNotStackStackFlg(), "DO_NOT_STACK_STACK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     * @param doNotStackStackFlgList The collection of doNotStackStackFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_NotInScope(Collection<String> doNotStackStackFlgList) {
        doSetDoNotStackStackFlg_NotInScope(doNotStackStackFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DoNotStackStackFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg} <br>
     * Do Not Stack Pallets フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDoNotStackStackFlg_NotInScope_AsDoNotStackStackFlg(Collection<CDef.DoNotStackStackFlg> cdefList) {
        doSetDoNotStackStackFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDoNotStackStackFlg_NotInScope(Collection<String> doNotStackStackFlgList) {
        regINS(CK_NINS, cTL(doNotStackStackFlgList), xgetCValueDoNotStackStackFlg(), "DO_NOT_STACK_STACK_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     */
    public void setDoNotStackStackFlg_IsNull() { regDoNotStackStackFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DO_NOT_STACK_STACK_FLG: {char(1), FK to B_CLASS_DTL, classification=DoNotStackStackFlg}
     */
    public void setDoNotStackStackFlg_IsNotNull() { regDoNotStackStackFlg(CK_ISNN, DOBJ); }

    protected void regDoNotStackStackFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDoNotStackStackFlg(), "DO_NOT_STACK_STACK_FLG"); }
    protected abstract ConditionValue xgetCValueDoNotStackStackFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @param limitedAccessDeliveryFlg The value of limitedAccessDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_Equal(String limitedAccessDeliveryFlg) {
        doSetLimitedAccessDeliveryFlg_Equal(fRES(limitedAccessDeliveryFlg));
    }

    /**
     * Equal(=). As LimitedAccessDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_Equal_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg cdef) {
        doSetLimitedAccessDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLimitedAccessDeliveryFlg_Equal_$0() {
        setLimitedAccessDeliveryFlg_Equal_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLimitedAccessDeliveryFlg_Equal_$1() {
        setLimitedAccessDeliveryFlg_Equal_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$1);
    }

    protected void doSetLimitedAccessDeliveryFlg_Equal(String limitedAccessDeliveryFlg) {
        regLimitedAccessDeliveryFlg(CK_EQ, limitedAccessDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @param limitedAccessDeliveryFlg The value of limitedAccessDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_NotEqual(String limitedAccessDeliveryFlg) {
        doSetLimitedAccessDeliveryFlg_NotEqual(fRES(limitedAccessDeliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitedAccessDeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_NotEqual_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg cdef) {
        doSetLimitedAccessDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLimitedAccessDeliveryFlg_NotEqual_$0() {
        setLimitedAccessDeliveryFlg_NotEqual_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLimitedAccessDeliveryFlg_NotEqual_$1() {
        setLimitedAccessDeliveryFlg_NotEqual_AsLimitedAccessDeliveryFlg(CDef.LimitedAccessDeliveryFlg.$1);
    }

    protected void doSetLimitedAccessDeliveryFlg_NotEqual(String limitedAccessDeliveryFlg) {
        regLimitedAccessDeliveryFlg(CK_NES, limitedAccessDeliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @param limitedAccessDeliveryFlgList The collection of limitedAccessDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_InScope(Collection<String> limitedAccessDeliveryFlgList) {
        doSetLimitedAccessDeliveryFlg_InScope(limitedAccessDeliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitedAccessDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_InScope_AsLimitedAccessDeliveryFlg(Collection<CDef.LimitedAccessDeliveryFlg> cdefList) {
        doSetLimitedAccessDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitedAccessDeliveryFlg_InScope(Collection<String> limitedAccessDeliveryFlgList) {
        regINS(CK_INS, cTL(limitedAccessDeliveryFlgList), xgetCValueLimitedAccessDeliveryFlg(), "LIMITED_ACCESS_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     * @param limitedAccessDeliveryFlgList The collection of limitedAccessDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_NotInScope(Collection<String> limitedAccessDeliveryFlgList) {
        doSetLimitedAccessDeliveryFlg_NotInScope(limitedAccessDeliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitedAccessDeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg} <br>
     * Limited Access Delivery フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessDeliveryFlg_NotInScope_AsLimitedAccessDeliveryFlg(Collection<CDef.LimitedAccessDeliveryFlg> cdefList) {
        doSetLimitedAccessDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitedAccessDeliveryFlg_NotInScope(Collection<String> limitedAccessDeliveryFlgList) {
        regINS(CK_NINS, cTL(limitedAccessDeliveryFlgList), xgetCValueLimitedAccessDeliveryFlg(), "LIMITED_ACCESS_DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     */
    public void setLimitedAccessDeliveryFlg_IsNull() { regLimitedAccessDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_DELIVERY_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessDeliveryFlg}
     */
    public void setLimitedAccessDeliveryFlg_IsNotNull() { regLimitedAccessDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regLimitedAccessDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitedAccessDeliveryFlg(), "LIMITED_ACCESS_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueLimitedAccessDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @param limitedAccessPickupFlg The value of limitedAccessPickupFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_Equal(String limitedAccessPickupFlg) {
        doSetLimitedAccessPickupFlg_Equal(fRES(limitedAccessPickupFlg));
    }

    /**
     * Equal(=). As LimitedAccessPickupFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_Equal_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg cdef) {
        doSetLimitedAccessPickupFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLimitedAccessPickupFlg_Equal_$0() {
        setLimitedAccessPickupFlg_Equal_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLimitedAccessPickupFlg_Equal_$1() {
        setLimitedAccessPickupFlg_Equal_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$1);
    }

    protected void doSetLimitedAccessPickupFlg_Equal(String limitedAccessPickupFlg) {
        regLimitedAccessPickupFlg(CK_EQ, limitedAccessPickupFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @param limitedAccessPickupFlg The value of limitedAccessPickupFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_NotEqual(String limitedAccessPickupFlg) {
        doSetLimitedAccessPickupFlg_NotEqual(fRES(limitedAccessPickupFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitedAccessPickupFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_NotEqual_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg cdef) {
        doSetLimitedAccessPickupFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLimitedAccessPickupFlg_NotEqual_$0() {
        setLimitedAccessPickupFlg_NotEqual_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLimitedAccessPickupFlg_NotEqual_$1() {
        setLimitedAccessPickupFlg_NotEqual_AsLimitedAccessPickupFlg(CDef.LimitedAccessPickupFlg.$1);
    }

    protected void doSetLimitedAccessPickupFlg_NotEqual(String limitedAccessPickupFlg) {
        regLimitedAccessPickupFlg(CK_NES, limitedAccessPickupFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @param limitedAccessPickupFlgList The collection of limitedAccessPickupFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_InScope(Collection<String> limitedAccessPickupFlgList) {
        doSetLimitedAccessPickupFlg_InScope(limitedAccessPickupFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitedAccessPickupFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_InScope_AsLimitedAccessPickupFlg(Collection<CDef.LimitedAccessPickupFlg> cdefList) {
        doSetLimitedAccessPickupFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitedAccessPickupFlg_InScope(Collection<String> limitedAccessPickupFlgList) {
        regINS(CK_INS, cTL(limitedAccessPickupFlgList), xgetCValueLimitedAccessPickupFlg(), "LIMITED_ACCESS_PICKUP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     * @param limitedAccessPickupFlgList The collection of limitedAccessPickupFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_NotInScope(Collection<String> limitedAccessPickupFlgList) {
        doSetLimitedAccessPickupFlg_NotInScope(limitedAccessPickupFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitedAccessPickupFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg} <br>
     * Limited Access Pickup フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitedAccessPickupFlg_NotInScope_AsLimitedAccessPickupFlg(Collection<CDef.LimitedAccessPickupFlg> cdefList) {
        doSetLimitedAccessPickupFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitedAccessPickupFlg_NotInScope(Collection<String> limitedAccessPickupFlgList) {
        regINS(CK_NINS, cTL(limitedAccessPickupFlgList), xgetCValueLimitedAccessPickupFlg(), "LIMITED_ACCESS_PICKUP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     */
    public void setLimitedAccessPickupFlg_IsNull() { regLimitedAccessPickupFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMITED_ACCESS_PICKUP_FLG: {char(1), FK to B_CLASS_DTL, classification=LimitedAccessPickupFlg}
     */
    public void setLimitedAccessPickupFlg_IsNotNull() { regLimitedAccessPickupFlg(CK_ISNN, DOBJ); }

    protected void regLimitedAccessPickupFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitedAccessPickupFlg(), "LIMITED_ACCESS_PICKUP_FLG"); }
    protected abstract ConditionValue xgetCValueLimitedAccessPickupFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @param overSizedFlg The value of overSizedFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_Equal(String overSizedFlg) {
        doSetOverSizedFlg_Equal(fRES(overSizedFlg));
    }

    /**
     * Equal(=). As OverSizedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOverSizedFlg_Equal_AsOverSizedFlg(CDef.OverSizedFlg cdef) {
        doSetOverSizedFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setOverSizedFlg_Equal_$0() {
        setOverSizedFlg_Equal_AsOverSizedFlg(CDef.OverSizedFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setOverSizedFlg_Equal_$1() {
        setOverSizedFlg_Equal_AsOverSizedFlg(CDef.OverSizedFlg.$1);
    }

    protected void doSetOverSizedFlg_Equal(String overSizedFlg) {
        regOverSizedFlg(CK_EQ, overSizedFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @param overSizedFlg The value of overSizedFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_NotEqual(String overSizedFlg) {
        doSetOverSizedFlg_NotEqual(fRES(overSizedFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As OverSizedFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOverSizedFlg_NotEqual_AsOverSizedFlg(CDef.OverSizedFlg cdef) {
        doSetOverSizedFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setOverSizedFlg_NotEqual_$0() {
        setOverSizedFlg_NotEqual_AsOverSizedFlg(CDef.OverSizedFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setOverSizedFlg_NotEqual_$1() {
        setOverSizedFlg_NotEqual_AsOverSizedFlg(CDef.OverSizedFlg.$1);
    }

    protected void doSetOverSizedFlg_NotEqual(String overSizedFlg) {
        regOverSizedFlg(CK_NES, overSizedFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @param overSizedFlgList The collection of overSizedFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_InScope(Collection<String> overSizedFlgList) {
        doSetOverSizedFlg_InScope(overSizedFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As OverSizedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_InScope_AsOverSizedFlg(Collection<CDef.OverSizedFlg> cdefList) {
        doSetOverSizedFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOverSizedFlg_InScope(Collection<String> overSizedFlgList) {
        regINS(CK_INS, cTL(overSizedFlgList), xgetCValueOverSizedFlg(), "OVER_SIZED_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     * @param overSizedFlgList The collection of overSizedFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_NotInScope(Collection<String> overSizedFlgList) {
        doSetOverSizedFlg_NotInScope(overSizedFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As OverSizedFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg} <br>
     * Over-Sized/Extreme Length フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOverSizedFlg_NotInScope_AsOverSizedFlg(Collection<CDef.OverSizedFlg> cdefList) {
        doSetOverSizedFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOverSizedFlg_NotInScope(Collection<String> overSizedFlgList) {
        regINS(CK_NINS, cTL(overSizedFlgList), xgetCValueOverSizedFlg(), "OVER_SIZED_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     */
    public void setOverSizedFlg_IsNull() { regOverSizedFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OVER_SIZED_FLG: {char(1), FK to B_CLASS_DTL, classification=OverSizedFlg}
     */
    public void setOverSizedFlg_IsNotNull() { regOverSizedFlg(CK_ISNN, DOBJ); }

    protected void regOverSizedFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOverSizedFlg(), "OVER_SIZED_FLG"); }
    protected abstract ConditionValue xgetCValueOverSizedFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @param poisonFlg The value of poisonFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_Equal(String poisonFlg) {
        doSetPoisonFlg_Equal(fRES(poisonFlg));
    }

    /**
     * Equal(=). As PoisonFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPoisonFlg_Equal_AsPoisonFlg(CDef.PoisonFlg cdef) {
        doSetPoisonFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setPoisonFlg_Equal_$0() {
        setPoisonFlg_Equal_AsPoisonFlg(CDef.PoisonFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setPoisonFlg_Equal_$1() {
        setPoisonFlg_Equal_AsPoisonFlg(CDef.PoisonFlg.$1);
    }

    protected void doSetPoisonFlg_Equal(String poisonFlg) {
        regPoisonFlg(CK_EQ, poisonFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @param poisonFlg The value of poisonFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_NotEqual(String poisonFlg) {
        doSetPoisonFlg_NotEqual(fRES(poisonFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As PoisonFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPoisonFlg_NotEqual_AsPoisonFlg(CDef.PoisonFlg cdef) {
        doSetPoisonFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setPoisonFlg_NotEqual_$0() {
        setPoisonFlg_NotEqual_AsPoisonFlg(CDef.PoisonFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setPoisonFlg_NotEqual_$1() {
        setPoisonFlg_NotEqual_AsPoisonFlg(CDef.PoisonFlg.$1);
    }

    protected void doSetPoisonFlg_NotEqual(String poisonFlg) {
        regPoisonFlg(CK_NES, poisonFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @param poisonFlgList The collection of poisonFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_InScope(Collection<String> poisonFlgList) {
        doSetPoisonFlg_InScope(poisonFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As PoisonFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_InScope_AsPoisonFlg(Collection<CDef.PoisonFlg> cdefList) {
        doSetPoisonFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPoisonFlg_InScope(Collection<String> poisonFlgList) {
        regINS(CK_INS, cTL(poisonFlgList), xgetCValuePoisonFlg(), "POISON_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     * @param poisonFlgList The collection of poisonFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_NotInScope(Collection<String> poisonFlgList) {
        doSetPoisonFlg_NotInScope(poisonFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As PoisonFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg} <br>
     * Poison フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoisonFlg_NotInScope_AsPoisonFlg(Collection<CDef.PoisonFlg> cdefList) {
        doSetPoisonFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPoisonFlg_NotInScope(Collection<String> poisonFlgList) {
        regINS(CK_NINS, cTL(poisonFlgList), xgetCValuePoisonFlg(), "POISON_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     */
    public void setPoisonFlg_IsNull() { regPoisonFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POISON_FLG: {char(1), FK to B_CLASS_DTL, classification=PoisonFlg}
     */
    public void setPoisonFlg_IsNotNull() { regPoisonFlg(CK_ISNN, DOBJ); }

    protected void regPoisonFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePoisonFlg(), "POISON_FLG"); }
    protected abstract ConditionValue xgetCValuePoisonFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @param foogFlg The value of foogFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_Equal(String foogFlg) {
        doSetFoogFlg_Equal(fRES(foogFlg));
    }

    /**
     * Equal(=). As FoogFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFoogFlg_Equal_AsFoogFlg(CDef.FoogFlg cdef) {
        doSetFoogFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setFoogFlg_Equal_$0() {
        setFoogFlg_Equal_AsFoogFlg(CDef.FoogFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setFoogFlg_Equal_$1() {
        setFoogFlg_Equal_AsFoogFlg(CDef.FoogFlg.$1);
    }

    protected void doSetFoogFlg_Equal(String foogFlg) {
        regFoogFlg(CK_EQ, foogFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @param foogFlg The value of foogFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_NotEqual(String foogFlg) {
        doSetFoogFlg_NotEqual(fRES(foogFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As FoogFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setFoogFlg_NotEqual_AsFoogFlg(CDef.FoogFlg cdef) {
        doSetFoogFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setFoogFlg_NotEqual_$0() {
        setFoogFlg_NotEqual_AsFoogFlg(CDef.FoogFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setFoogFlg_NotEqual_$1() {
        setFoogFlg_NotEqual_AsFoogFlg(CDef.FoogFlg.$1);
    }

    protected void doSetFoogFlg_NotEqual(String foogFlg) {
        regFoogFlg(CK_NES, foogFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @param foogFlgList The collection of foogFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_InScope(Collection<String> foogFlgList) {
        doSetFoogFlg_InScope(foogFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As FoogFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_InScope_AsFoogFlg(Collection<CDef.FoogFlg> cdefList) {
        doSetFoogFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetFoogFlg_InScope(Collection<String> foogFlgList) {
        regINS(CK_INS, cTL(foogFlgList), xgetCValueFoogFlg(), "FOOG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     * @param foogFlgList The collection of foogFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_NotInScope(Collection<String> foogFlgList) {
        doSetFoogFlg_NotInScope(foogFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As FoogFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg} <br>
     * Food フラグCD
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFoogFlg_NotInScope_AsFoogFlg(Collection<CDef.FoogFlg> cdefList) {
        doSetFoogFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetFoogFlg_NotInScope(Collection<String> foogFlgList) {
        regINS(CK_NINS, cTL(foogFlgList), xgetCValueFoogFlg(), "FOOG_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     */
    public void setFoogFlg_IsNull() { regFoogFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOOG_FLG: {char(1), FK to B_CLASS_DTL, classification=FoogFlg}
     */
    public void setFoogFlg_IsNotNull() { regFoogFlg(CK_ISNN, DOBJ); }

    protected void regFoogFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFoogFlg(), "FOOG_FLG"); }
    protected abstract ConditionValue xgetCValueFoogFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @param liftgateDeliveryPrepaidFlg The value of liftgateDeliveryPrepaidFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_Equal(String liftgateDeliveryPrepaidFlg) {
        doSetLiftgateDeliveryPrepaidFlg_Equal(fRES(liftgateDeliveryPrepaidFlg));
    }

    /**
     * Equal(=). As LiftgateDeliveryPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_Equal_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg cdef) {
        doSetLiftgateDeliveryPrepaidFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryPrepaidFlg_Equal_$0() {
        setLiftgateDeliveryPrepaidFlg_Equal_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryPrepaidFlg_Equal_$1() {
        setLiftgateDeliveryPrepaidFlg_Equal_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$1);
    }

    protected void doSetLiftgateDeliveryPrepaidFlg_Equal(String liftgateDeliveryPrepaidFlg) {
        regLiftgateDeliveryPrepaidFlg(CK_EQ, liftgateDeliveryPrepaidFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @param liftgateDeliveryPrepaidFlg The value of liftgateDeliveryPrepaidFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_NotEqual(String liftgateDeliveryPrepaidFlg) {
        doSetLiftgateDeliveryPrepaidFlg_NotEqual(fRES(liftgateDeliveryPrepaidFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LiftgateDeliveryPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_NotEqual_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg cdef) {
        doSetLiftgateDeliveryPrepaidFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryPrepaidFlg_NotEqual_$0() {
        setLiftgateDeliveryPrepaidFlg_NotEqual_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryPrepaidFlg_NotEqual_$1() {
        setLiftgateDeliveryPrepaidFlg_NotEqual_AsLiftgateDeliveryPrepaidFlg(CDef.LiftgateDeliveryPrepaidFlg.$1);
    }

    protected void doSetLiftgateDeliveryPrepaidFlg_NotEqual(String liftgateDeliveryPrepaidFlg) {
        regLiftgateDeliveryPrepaidFlg(CK_NES, liftgateDeliveryPrepaidFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @param liftgateDeliveryPrepaidFlgList The collection of liftgateDeliveryPrepaidFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_InScope(Collection<String> liftgateDeliveryPrepaidFlgList) {
        doSetLiftgateDeliveryPrepaidFlg_InScope(liftgateDeliveryPrepaidFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LiftgateDeliveryPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_InScope_AsLiftgateDeliveryPrepaidFlg(Collection<CDef.LiftgateDeliveryPrepaidFlg> cdefList) {
        doSetLiftgateDeliveryPrepaidFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLiftgateDeliveryPrepaidFlg_InScope(Collection<String> liftgateDeliveryPrepaidFlgList) {
        regINS(CK_INS, cTL(liftgateDeliveryPrepaidFlgList), xgetCValueLiftgateDeliveryPrepaidFlg(), "LIFTGATE_DELIVERY_PREPAID_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     * @param liftgateDeliveryPrepaidFlgList The collection of liftgateDeliveryPrepaidFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_NotInScope(Collection<String> liftgateDeliveryPrepaidFlgList) {
        doSetLiftgateDeliveryPrepaidFlg_NotInScope(liftgateDeliveryPrepaidFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LiftgateDeliveryPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg} <br>
     * Liftgate at delivery フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryPrepaidFlg_NotInScope_AsLiftgateDeliveryPrepaidFlg(Collection<CDef.LiftgateDeliveryPrepaidFlg> cdefList) {
        doSetLiftgateDeliveryPrepaidFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLiftgateDeliveryPrepaidFlg_NotInScope(Collection<String> liftgateDeliveryPrepaidFlgList) {
        regINS(CK_NINS, cTL(liftgateDeliveryPrepaidFlgList), xgetCValueLiftgateDeliveryPrepaidFlg(), "LIFTGATE_DELIVERY_PREPAID_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     */
    public void setLiftgateDeliveryPrepaidFlg_IsNull() { regLiftgateDeliveryPrepaidFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryPrepaidFlg}
     */
    public void setLiftgateDeliveryPrepaidFlg_IsNotNull() { regLiftgateDeliveryPrepaidFlg(CK_ISNN, DOBJ); }

    protected void regLiftgateDeliveryPrepaidFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiftgateDeliveryPrepaidFlg(), "LIFTGATE_DELIVERY_PREPAID_FLG"); }
    protected abstract ConditionValue xgetCValueLiftgateDeliveryPrepaidFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @param liftgateDeliveryCollectFlg The value of liftgateDeliveryCollectFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_Equal(String liftgateDeliveryCollectFlg) {
        doSetLiftgateDeliveryCollectFlg_Equal(fRES(liftgateDeliveryCollectFlg));
    }

    /**
     * Equal(=). As LiftgateDeliveryCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_Equal_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg cdef) {
        doSetLiftgateDeliveryCollectFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryCollectFlg_Equal_$0() {
        setLiftgateDeliveryCollectFlg_Equal_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryCollectFlg_Equal_$1() {
        setLiftgateDeliveryCollectFlg_Equal_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$1);
    }

    protected void doSetLiftgateDeliveryCollectFlg_Equal(String liftgateDeliveryCollectFlg) {
        regLiftgateDeliveryCollectFlg(CK_EQ, liftgateDeliveryCollectFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @param liftgateDeliveryCollectFlg The value of liftgateDeliveryCollectFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_NotEqual(String liftgateDeliveryCollectFlg) {
        doSetLiftgateDeliveryCollectFlg_NotEqual(fRES(liftgateDeliveryCollectFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LiftgateDeliveryCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_NotEqual_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg cdef) {
        doSetLiftgateDeliveryCollectFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgateDeliveryCollectFlg_NotEqual_$0() {
        setLiftgateDeliveryCollectFlg_NotEqual_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgateDeliveryCollectFlg_NotEqual_$1() {
        setLiftgateDeliveryCollectFlg_NotEqual_AsLiftgateDeliveryCollectFlg(CDef.LiftgateDeliveryCollectFlg.$1);
    }

    protected void doSetLiftgateDeliveryCollectFlg_NotEqual(String liftgateDeliveryCollectFlg) {
        regLiftgateDeliveryCollectFlg(CK_NES, liftgateDeliveryCollectFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @param liftgateDeliveryCollectFlgList The collection of liftgateDeliveryCollectFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_InScope(Collection<String> liftgateDeliveryCollectFlgList) {
        doSetLiftgateDeliveryCollectFlg_InScope(liftgateDeliveryCollectFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LiftgateDeliveryCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_InScope_AsLiftgateDeliveryCollectFlg(Collection<CDef.LiftgateDeliveryCollectFlg> cdefList) {
        doSetLiftgateDeliveryCollectFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLiftgateDeliveryCollectFlg_InScope(Collection<String> liftgateDeliveryCollectFlgList) {
        regINS(CK_INS, cTL(liftgateDeliveryCollectFlgList), xgetCValueLiftgateDeliveryCollectFlg(), "LIFTGATE_DELIVERY_COLLECT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     * @param liftgateDeliveryCollectFlgList The collection of liftgateDeliveryCollectFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_NotInScope(Collection<String> liftgateDeliveryCollectFlgList) {
        doSetLiftgateDeliveryCollectFlg_NotInScope(liftgateDeliveryCollectFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LiftgateDeliveryCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg} <br>
     * Liftgate at delivery フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgateDeliveryCollectFlg_NotInScope_AsLiftgateDeliveryCollectFlg(Collection<CDef.LiftgateDeliveryCollectFlg> cdefList) {
        doSetLiftgateDeliveryCollectFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLiftgateDeliveryCollectFlg_NotInScope(Collection<String> liftgateDeliveryCollectFlgList) {
        regINS(CK_NINS, cTL(liftgateDeliveryCollectFlgList), xgetCValueLiftgateDeliveryCollectFlg(), "LIFTGATE_DELIVERY_COLLECT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     */
    public void setLiftgateDeliveryCollectFlg_IsNull() { regLiftgateDeliveryCollectFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgateDeliveryCollectFlg}
     */
    public void setLiftgateDeliveryCollectFlg_IsNotNull() { regLiftgateDeliveryCollectFlg(CK_ISNN, DOBJ); }

    protected void regLiftgateDeliveryCollectFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiftgateDeliveryCollectFlg(), "LIFTGATE_DELIVERY_COLLECT_FLG"); }
    protected abstract ConditionValue xgetCValueLiftgateDeliveryCollectFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @param liftgatePickupPrepaidFlg The value of liftgatePickupPrepaidFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_Equal(String liftgatePickupPrepaidFlg) {
        doSetLiftgatePickupPrepaidFlg_Equal(fRES(liftgatePickupPrepaidFlg));
    }

    /**
     * Equal(=). As LiftgatePickupPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_Equal_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg cdef) {
        doSetLiftgatePickupPrepaidFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgatePickupPrepaidFlg_Equal_$0() {
        setLiftgatePickupPrepaidFlg_Equal_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgatePickupPrepaidFlg_Equal_$1() {
        setLiftgatePickupPrepaidFlg_Equal_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$1);
    }

    protected void doSetLiftgatePickupPrepaidFlg_Equal(String liftgatePickupPrepaidFlg) {
        regLiftgatePickupPrepaidFlg(CK_EQ, liftgatePickupPrepaidFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @param liftgatePickupPrepaidFlg The value of liftgatePickupPrepaidFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_NotEqual(String liftgatePickupPrepaidFlg) {
        doSetLiftgatePickupPrepaidFlg_NotEqual(fRES(liftgatePickupPrepaidFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LiftgatePickupPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_NotEqual_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg cdef) {
        doSetLiftgatePickupPrepaidFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgatePickupPrepaidFlg_NotEqual_$0() {
        setLiftgatePickupPrepaidFlg_NotEqual_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgatePickupPrepaidFlg_NotEqual_$1() {
        setLiftgatePickupPrepaidFlg_NotEqual_AsLiftgatePickupPrepaidFlg(CDef.LiftgatePickupPrepaidFlg.$1);
    }

    protected void doSetLiftgatePickupPrepaidFlg_NotEqual(String liftgatePickupPrepaidFlg) {
        regLiftgatePickupPrepaidFlg(CK_NES, liftgatePickupPrepaidFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @param liftgatePickupPrepaidFlgList The collection of liftgatePickupPrepaidFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_InScope(Collection<String> liftgatePickupPrepaidFlgList) {
        doSetLiftgatePickupPrepaidFlg_InScope(liftgatePickupPrepaidFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LiftgatePickupPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_InScope_AsLiftgatePickupPrepaidFlg(Collection<CDef.LiftgatePickupPrepaidFlg> cdefList) {
        doSetLiftgatePickupPrepaidFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLiftgatePickupPrepaidFlg_InScope(Collection<String> liftgatePickupPrepaidFlgList) {
        regINS(CK_INS, cTL(liftgatePickupPrepaidFlgList), xgetCValueLiftgatePickupPrepaidFlg(), "LIFTGATE_PICKUP_PREPAID_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     * @param liftgatePickupPrepaidFlgList The collection of liftgatePickupPrepaidFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_NotInScope(Collection<String> liftgatePickupPrepaidFlgList) {
        doSetLiftgatePickupPrepaidFlg_NotInScope(liftgatePickupPrepaidFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LiftgatePickupPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg} <br>
     * Liftgate at pickup フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupPrepaidFlg_NotInScope_AsLiftgatePickupPrepaidFlg(Collection<CDef.LiftgatePickupPrepaidFlg> cdefList) {
        doSetLiftgatePickupPrepaidFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLiftgatePickupPrepaidFlg_NotInScope(Collection<String> liftgatePickupPrepaidFlgList) {
        regINS(CK_NINS, cTL(liftgatePickupPrepaidFlgList), xgetCValueLiftgatePickupPrepaidFlg(), "LIFTGATE_PICKUP_PREPAID_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     */
    public void setLiftgatePickupPrepaidFlg_IsNull() { regLiftgatePickupPrepaidFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupPrepaidFlg}
     */
    public void setLiftgatePickupPrepaidFlg_IsNotNull() { regLiftgatePickupPrepaidFlg(CK_ISNN, DOBJ); }

    protected void regLiftgatePickupPrepaidFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiftgatePickupPrepaidFlg(), "LIFTGATE_PICKUP_PREPAID_FLG"); }
    protected abstract ConditionValue xgetCValueLiftgatePickupPrepaidFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @param liftgatePickupCollectFlg The value of liftgatePickupCollectFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_Equal(String liftgatePickupCollectFlg) {
        doSetLiftgatePickupCollectFlg_Equal(fRES(liftgatePickupCollectFlg));
    }

    /**
     * Equal(=). As LiftgatePickupCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_Equal_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg cdef) {
        doSetLiftgatePickupCollectFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgatePickupCollectFlg_Equal_$0() {
        setLiftgatePickupCollectFlg_Equal_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgatePickupCollectFlg_Equal_$1() {
        setLiftgatePickupCollectFlg_Equal_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$1);
    }

    protected void doSetLiftgatePickupCollectFlg_Equal(String liftgatePickupCollectFlg) {
        regLiftgatePickupCollectFlg(CK_EQ, liftgatePickupCollectFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @param liftgatePickupCollectFlg The value of liftgatePickupCollectFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_NotEqual(String liftgatePickupCollectFlg) {
        doSetLiftgatePickupCollectFlg_NotEqual(fRES(liftgatePickupCollectFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LiftgatePickupCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_NotEqual_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg cdef) {
        doSetLiftgatePickupCollectFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setLiftgatePickupCollectFlg_NotEqual_$0() {
        setLiftgatePickupCollectFlg_NotEqual_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setLiftgatePickupCollectFlg_NotEqual_$1() {
        setLiftgatePickupCollectFlg_NotEqual_AsLiftgatePickupCollectFlg(CDef.LiftgatePickupCollectFlg.$1);
    }

    protected void doSetLiftgatePickupCollectFlg_NotEqual(String liftgatePickupCollectFlg) {
        regLiftgatePickupCollectFlg(CK_NES, liftgatePickupCollectFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @param liftgatePickupCollectFlgList The collection of liftgatePickupCollectFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_InScope(Collection<String> liftgatePickupCollectFlgList) {
        doSetLiftgatePickupCollectFlg_InScope(liftgatePickupCollectFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LiftgatePickupCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_InScope_AsLiftgatePickupCollectFlg(Collection<CDef.LiftgatePickupCollectFlg> cdefList) {
        doSetLiftgatePickupCollectFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLiftgatePickupCollectFlg_InScope(Collection<String> liftgatePickupCollectFlgList) {
        regINS(CK_INS, cTL(liftgatePickupCollectFlgList), xgetCValueLiftgatePickupCollectFlg(), "LIFTGATE_PICKUP_COLLECT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     * @param liftgatePickupCollectFlgList The collection of liftgatePickupCollectFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_NotInScope(Collection<String> liftgatePickupCollectFlgList) {
        doSetLiftgatePickupCollectFlg_NotInScope(liftgatePickupCollectFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LiftgatePickupCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg} <br>
     * Liftgate at pickup フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLiftgatePickupCollectFlg_NotInScope_AsLiftgatePickupCollectFlg(Collection<CDef.LiftgatePickupCollectFlg> cdefList) {
        doSetLiftgatePickupCollectFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLiftgatePickupCollectFlg_NotInScope(Collection<String> liftgatePickupCollectFlgList) {
        regINS(CK_NINS, cTL(liftgatePickupCollectFlgList), xgetCValueLiftgatePickupCollectFlg(), "LIFTGATE_PICKUP_COLLECT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     */
    public void setLiftgatePickupCollectFlg_IsNull() { regLiftgatePickupCollectFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIFTGATE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=LiftgatePickupCollectFlg}
     */
    public void setLiftgatePickupCollectFlg_IsNotNull() { regLiftgatePickupCollectFlg(CK_ISNN, DOBJ); }

    protected void regLiftgatePickupCollectFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLiftgatePickupCollectFlg(), "LIFTGATE_PICKUP_COLLECT_FLG"); }
    protected abstract ConditionValue xgetCValueLiftgatePickupCollectFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @param insideDeliveryPrepaidFlg The value of insideDeliveryPrepaidFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_Equal(String insideDeliveryPrepaidFlg) {
        doSetInsideDeliveryPrepaidFlg_Equal(fRES(insideDeliveryPrepaidFlg));
    }

    /**
     * Equal(=). As InsideDeliveryPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_Equal_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg cdef) {
        doSetInsideDeliveryPrepaidFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsideDeliveryPrepaidFlg_Equal_$0() {
        setInsideDeliveryPrepaidFlg_Equal_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsideDeliveryPrepaidFlg_Equal_$1() {
        setInsideDeliveryPrepaidFlg_Equal_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$1);
    }

    protected void doSetInsideDeliveryPrepaidFlg_Equal(String insideDeliveryPrepaidFlg) {
        regInsideDeliveryPrepaidFlg(CK_EQ, insideDeliveryPrepaidFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @param insideDeliveryPrepaidFlg The value of insideDeliveryPrepaidFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_NotEqual(String insideDeliveryPrepaidFlg) {
        doSetInsideDeliveryPrepaidFlg_NotEqual(fRES(insideDeliveryPrepaidFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InsideDeliveryPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_NotEqual_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg cdef) {
        doSetInsideDeliveryPrepaidFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsideDeliveryPrepaidFlg_NotEqual_$0() {
        setInsideDeliveryPrepaidFlg_NotEqual_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsideDeliveryPrepaidFlg_NotEqual_$1() {
        setInsideDeliveryPrepaidFlg_NotEqual_AsInsideDeliveryPrepaidFlg(CDef.InsideDeliveryPrepaidFlg.$1);
    }

    protected void doSetInsideDeliveryPrepaidFlg_NotEqual(String insideDeliveryPrepaidFlg) {
        regInsideDeliveryPrepaidFlg(CK_NES, insideDeliveryPrepaidFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @param insideDeliveryPrepaidFlgList The collection of insideDeliveryPrepaidFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_InScope(Collection<String> insideDeliveryPrepaidFlgList) {
        doSetInsideDeliveryPrepaidFlg_InScope(insideDeliveryPrepaidFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InsideDeliveryPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_InScope_AsInsideDeliveryPrepaidFlg(Collection<CDef.InsideDeliveryPrepaidFlg> cdefList) {
        doSetInsideDeliveryPrepaidFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInsideDeliveryPrepaidFlg_InScope(Collection<String> insideDeliveryPrepaidFlgList) {
        regINS(CK_INS, cTL(insideDeliveryPrepaidFlgList), xgetCValueInsideDeliveryPrepaidFlg(), "INSIDE_DELIVERY_PREPAID_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     * @param insideDeliveryPrepaidFlgList The collection of insideDeliveryPrepaidFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_NotInScope(Collection<String> insideDeliveryPrepaidFlgList) {
        doSetInsideDeliveryPrepaidFlg_NotInScope(insideDeliveryPrepaidFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InsideDeliveryPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg} <br>
     * Inside Delivery フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryPrepaidFlg_NotInScope_AsInsideDeliveryPrepaidFlg(Collection<CDef.InsideDeliveryPrepaidFlg> cdefList) {
        doSetInsideDeliveryPrepaidFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInsideDeliveryPrepaidFlg_NotInScope(Collection<String> insideDeliveryPrepaidFlgList) {
        regINS(CK_NINS, cTL(insideDeliveryPrepaidFlgList), xgetCValueInsideDeliveryPrepaidFlg(), "INSIDE_DELIVERY_PREPAID_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     */
    public void setInsideDeliveryPrepaidFlg_IsNull() { regInsideDeliveryPrepaidFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryPrepaidFlg}
     */
    public void setInsideDeliveryPrepaidFlg_IsNotNull() { regInsideDeliveryPrepaidFlg(CK_ISNN, DOBJ); }

    protected void regInsideDeliveryPrepaidFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsideDeliveryPrepaidFlg(), "INSIDE_DELIVERY_PREPAID_FLG"); }
    protected abstract ConditionValue xgetCValueInsideDeliveryPrepaidFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @param insideDeliveryCollectFlg The value of insideDeliveryCollectFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_Equal(String insideDeliveryCollectFlg) {
        doSetInsideDeliveryCollectFlg_Equal(fRES(insideDeliveryCollectFlg));
    }

    /**
     * Equal(=). As InsideDeliveryCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_Equal_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg cdef) {
        doSetInsideDeliveryCollectFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsideDeliveryCollectFlg_Equal_$0() {
        setInsideDeliveryCollectFlg_Equal_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsideDeliveryCollectFlg_Equal_$1() {
        setInsideDeliveryCollectFlg_Equal_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$1);
    }

    protected void doSetInsideDeliveryCollectFlg_Equal(String insideDeliveryCollectFlg) {
        regInsideDeliveryCollectFlg(CK_EQ, insideDeliveryCollectFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @param insideDeliveryCollectFlg The value of insideDeliveryCollectFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_NotEqual(String insideDeliveryCollectFlg) {
        doSetInsideDeliveryCollectFlg_NotEqual(fRES(insideDeliveryCollectFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InsideDeliveryCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_NotEqual_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg cdef) {
        doSetInsideDeliveryCollectFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsideDeliveryCollectFlg_NotEqual_$0() {
        setInsideDeliveryCollectFlg_NotEqual_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsideDeliveryCollectFlg_NotEqual_$1() {
        setInsideDeliveryCollectFlg_NotEqual_AsInsideDeliveryCollectFlg(CDef.InsideDeliveryCollectFlg.$1);
    }

    protected void doSetInsideDeliveryCollectFlg_NotEqual(String insideDeliveryCollectFlg) {
        regInsideDeliveryCollectFlg(CK_NES, insideDeliveryCollectFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @param insideDeliveryCollectFlgList The collection of insideDeliveryCollectFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_InScope(Collection<String> insideDeliveryCollectFlgList) {
        doSetInsideDeliveryCollectFlg_InScope(insideDeliveryCollectFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InsideDeliveryCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_InScope_AsInsideDeliveryCollectFlg(Collection<CDef.InsideDeliveryCollectFlg> cdefList) {
        doSetInsideDeliveryCollectFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInsideDeliveryCollectFlg_InScope(Collection<String> insideDeliveryCollectFlgList) {
        regINS(CK_INS, cTL(insideDeliveryCollectFlgList), xgetCValueInsideDeliveryCollectFlg(), "INSIDE_DELIVERY_COLLECT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     * @param insideDeliveryCollectFlgList The collection of insideDeliveryCollectFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_NotInScope(Collection<String> insideDeliveryCollectFlgList) {
        doSetInsideDeliveryCollectFlg_NotInScope(insideDeliveryCollectFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InsideDeliveryCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg} <br>
     * Inside Delivery フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideDeliveryCollectFlg_NotInScope_AsInsideDeliveryCollectFlg(Collection<CDef.InsideDeliveryCollectFlg> cdefList) {
        doSetInsideDeliveryCollectFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInsideDeliveryCollectFlg_NotInScope(Collection<String> insideDeliveryCollectFlgList) {
        regINS(CK_NINS, cTL(insideDeliveryCollectFlgList), xgetCValueInsideDeliveryCollectFlg(), "INSIDE_DELIVERY_COLLECT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     */
    public void setInsideDeliveryCollectFlg_IsNull() { regInsideDeliveryCollectFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSIDE_DELIVERY_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsideDeliveryCollectFlg}
     */
    public void setInsideDeliveryCollectFlg_IsNotNull() { regInsideDeliveryCollectFlg(CK_ISNN, DOBJ); }

    protected void regInsideDeliveryCollectFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsideDeliveryCollectFlg(), "INSIDE_DELIVERY_COLLECT_FLG"); }
    protected abstract ConditionValue xgetCValueInsideDeliveryCollectFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @param insidePickupPrepaidFlg The value of insidePickupPrepaidFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_Equal(String insidePickupPrepaidFlg) {
        doSetInsidePickupPrepaidFlg_Equal(fRES(insidePickupPrepaidFlg));
    }

    /**
     * Equal(=). As InsidePickupPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_Equal_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg cdef) {
        doSetInsidePickupPrepaidFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsidePickupPrepaidFlg_Equal_$0() {
        setInsidePickupPrepaidFlg_Equal_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsidePickupPrepaidFlg_Equal_$1() {
        setInsidePickupPrepaidFlg_Equal_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$1);
    }

    protected void doSetInsidePickupPrepaidFlg_Equal(String insidePickupPrepaidFlg) {
        regInsidePickupPrepaidFlg(CK_EQ, insidePickupPrepaidFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @param insidePickupPrepaidFlg The value of insidePickupPrepaidFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_NotEqual(String insidePickupPrepaidFlg) {
        doSetInsidePickupPrepaidFlg_NotEqual(fRES(insidePickupPrepaidFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InsidePickupPrepaidFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_NotEqual_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg cdef) {
        doSetInsidePickupPrepaidFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsidePickupPrepaidFlg_NotEqual_$0() {
        setInsidePickupPrepaidFlg_NotEqual_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsidePickupPrepaidFlg_NotEqual_$1() {
        setInsidePickupPrepaidFlg_NotEqual_AsInsidePickupPrepaidFlg(CDef.InsidePickupPrepaidFlg.$1);
    }

    protected void doSetInsidePickupPrepaidFlg_NotEqual(String insidePickupPrepaidFlg) {
        regInsidePickupPrepaidFlg(CK_NES, insidePickupPrepaidFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @param insidePickupPrepaidFlgList The collection of insidePickupPrepaidFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_InScope(Collection<String> insidePickupPrepaidFlgList) {
        doSetInsidePickupPrepaidFlg_InScope(insidePickupPrepaidFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InsidePickupPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_InScope_AsInsidePickupPrepaidFlg(Collection<CDef.InsidePickupPrepaidFlg> cdefList) {
        doSetInsidePickupPrepaidFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInsidePickupPrepaidFlg_InScope(Collection<String> insidePickupPrepaidFlgList) {
        regINS(CK_INS, cTL(insidePickupPrepaidFlgList), xgetCValueInsidePickupPrepaidFlg(), "INSIDE_PICKUP_PREPAID_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     * @param insidePickupPrepaidFlgList The collection of insidePickupPrepaidFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_NotInScope(Collection<String> insidePickupPrepaidFlgList) {
        doSetInsidePickupPrepaidFlg_NotInScope(insidePickupPrepaidFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InsidePickupPrepaidFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg} <br>
     * Inside Pickup フラグCD (Prepaid)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupPrepaidFlg_NotInScope_AsInsidePickupPrepaidFlg(Collection<CDef.InsidePickupPrepaidFlg> cdefList) {
        doSetInsidePickupPrepaidFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInsidePickupPrepaidFlg_NotInScope(Collection<String> insidePickupPrepaidFlgList) {
        regINS(CK_NINS, cTL(insidePickupPrepaidFlgList), xgetCValueInsidePickupPrepaidFlg(), "INSIDE_PICKUP_PREPAID_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     */
    public void setInsidePickupPrepaidFlg_IsNull() { regInsidePickupPrepaidFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_PREPAID_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupPrepaidFlg}
     */
    public void setInsidePickupPrepaidFlg_IsNotNull() { regInsidePickupPrepaidFlg(CK_ISNN, DOBJ); }

    protected void regInsidePickupPrepaidFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsidePickupPrepaidFlg(), "INSIDE_PICKUP_PREPAID_FLG"); }
    protected abstract ConditionValue xgetCValueInsidePickupPrepaidFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @param insidePickupCollectFlg The value of insidePickupCollectFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_Equal(String insidePickupCollectFlg) {
        doSetInsidePickupCollectFlg_Equal(fRES(insidePickupCollectFlg));
    }

    /**
     * Equal(=). As InsidePickupCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_Equal_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg cdef) {
        doSetInsidePickupCollectFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsidePickupCollectFlg_Equal_$0() {
        setInsidePickupCollectFlg_Equal_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsidePickupCollectFlg_Equal_$1() {
        setInsidePickupCollectFlg_Equal_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$1);
    }

    protected void doSetInsidePickupCollectFlg_Equal(String insidePickupCollectFlg) {
        regInsidePickupCollectFlg(CK_EQ, insidePickupCollectFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @param insidePickupCollectFlg The value of insidePickupCollectFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_NotEqual(String insidePickupCollectFlg) {
        doSetInsidePickupCollectFlg_NotEqual(fRES(insidePickupCollectFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InsidePickupCollectFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_NotEqual_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg cdef) {
        doSetInsidePickupCollectFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: Disable
     */
    public void setInsidePickupCollectFlg_NotEqual_$0() {
        setInsidePickupCollectFlg_NotEqual_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: Enable
     */
    public void setInsidePickupCollectFlg_NotEqual_$1() {
        setInsidePickupCollectFlg_NotEqual_AsInsidePickupCollectFlg(CDef.InsidePickupCollectFlg.$1);
    }

    protected void doSetInsidePickupCollectFlg_NotEqual(String insidePickupCollectFlg) {
        regInsidePickupCollectFlg(CK_NES, insidePickupCollectFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @param insidePickupCollectFlgList The collection of insidePickupCollectFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_InScope(Collection<String> insidePickupCollectFlgList) {
        doSetInsidePickupCollectFlg_InScope(insidePickupCollectFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InsidePickupCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_InScope_AsInsidePickupCollectFlg(Collection<CDef.InsidePickupCollectFlg> cdefList) {
        doSetInsidePickupCollectFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInsidePickupCollectFlg_InScope(Collection<String> insidePickupCollectFlgList) {
        regINS(CK_INS, cTL(insidePickupCollectFlgList), xgetCValueInsidePickupCollectFlg(), "INSIDE_PICKUP_COLLECT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     * @param insidePickupCollectFlgList The collection of insidePickupCollectFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_NotInScope(Collection<String> insidePickupCollectFlgList) {
        doSetInsidePickupCollectFlg_NotInScope(insidePickupCollectFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InsidePickupCollectFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg} <br>
     * Inside Pickup フラグCD (Collect)
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsidePickupCollectFlg_NotInScope_AsInsidePickupCollectFlg(Collection<CDef.InsidePickupCollectFlg> cdefList) {
        doSetInsidePickupCollectFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInsidePickupCollectFlg_NotInScope(Collection<String> insidePickupCollectFlgList) {
        regINS(CK_NINS, cTL(insidePickupCollectFlgList), xgetCValueInsidePickupCollectFlg(), "INSIDE_PICKUP_COLLECT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     */
    public void setInsidePickupCollectFlg_IsNull() { regInsidePickupCollectFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSIDE_PICKUP_COLLECT_FLG: {char(1), FK to B_CLASS_DTL, classification=InsidePickupCollectFlg}
     */
    public void setInsidePickupCollectFlg_IsNotNull() { regInsidePickupCollectFlg(CK_ISNN, DOBJ); }

    protected void regInsidePickupCollectFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsidePickupCollectFlg(), "INSIDE_PICKUP_COLLECT_FLG"); }
    protected abstract ConditionValue xgetCValueInsidePickupCollectFlg();

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
    public HpSLCFunction<MCarrierSlipCesCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCarrierSlipCesCB.class);
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
    public HpSLCFunction<MCarrierSlipCesCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCarrierSlipCesCB.class);
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
    public HpSLCFunction<MCarrierSlipCesCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCarrierSlipCesCB.class);
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
    public HpSLCFunction<MCarrierSlipCesCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCarrierSlipCesCB.class);
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
    public HpSLCFunction<MCarrierSlipCesCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCarrierSlipCesCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCarrierSlipCesCB&gt;() {
     *     public void query(MCarrierSlipCesCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCarrierSlipCesCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCarrierSlipCesCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipCesCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCarrierSlipCesCQ sq);

    protected MCarrierSlipCesCB xcreateScalarConditionCB() {
        MCarrierSlipCesCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCarrierSlipCesCB xcreateScalarConditionPartitionByCB() {
        MCarrierSlipCesCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCarrierSlipCesCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CUSTOMER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCarrierSlipCesCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCarrierSlipCesCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCarrierSlipCesCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CUSTOMER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCarrierSlipCesCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCarrierSlipCesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCarrierSlipCesCQ sq);

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
    protected MCarrierSlipCesCB newMyCB() {
        return new MCarrierSlipCesCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCarrierSlipCesCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
