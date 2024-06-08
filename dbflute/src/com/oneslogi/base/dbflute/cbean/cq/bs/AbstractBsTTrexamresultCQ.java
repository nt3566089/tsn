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
 * The abstract condition-query of T_TREXAMRESULT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrexamresultCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrexamresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TREXAMRESULT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_Equal(Long trexamresultId) {
        doSetTrexamresultId_Equal(trexamresultId);
    }

    protected void doSetTrexamresultId_Equal(Long trexamresultId) {
        regTrexamresultId(CK_EQ, trexamresultId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotEqual(Long trexamresultId) {
        doSetTrexamresultId_NotEqual(trexamresultId);
    }

    protected void doSetTrexamresultId_NotEqual(Long trexamresultId) {
        regTrexamresultId(CK_NES, trexamresultId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterThan(Long trexamresultId) {
        regTrexamresultId(CK_GT, trexamresultId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessThan(Long trexamresultId) {
        regTrexamresultId(CK_LT, trexamresultId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_GreaterEqual(Long trexamresultId) {
        regTrexamresultId(CK_GE, trexamresultId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultId The value of trexamresultId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrexamresultId_LessEqual(Long trexamresultId) {
        regTrexamresultId(CK_LE, trexamresultId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trexamresultId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrexamresultId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrexamresultId(), "TREXAMRESULT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultIdList The collection of trexamresultId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_InScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_InScope(Collection<Long> trexamresultIdList) {
        regINS(CK_INS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trexamresultIdList The collection of trexamresultId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        doSetTrexamresultId_NotInScope(trexamresultIdList);
    }

    protected void doSetTrexamresultId_NotInScope(Collection<Long> trexamresultIdList) {
        regINS(CK_NINS, cTL(trexamresultIdList), xgetCValueTrexamresultId(), "TREXAMRESULT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrexamresultId_IsNull() { regTrexamresultId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TREXAMRESULT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrexamresultId_IsNotNull() { regTrexamresultId(CK_ISNN, DOBJ); }

    protected void regTrexamresultId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrexamresultId(), "TREXAMRESULT_ID"); }
    protected abstract ConditionValue xgetCValueTrexamresultId();

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
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)}
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
     * PRODUCT_CD: {varchar(30)} <br>
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
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_Equal(String lot2) {
        doSetLot2_Equal(fRES(lot2));
    }

    protected void doSetLot2_Equal(String lot2) {
        regLot2(CK_EQ, lot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotEqual(String lot2) {
        doSetLot2_NotEqual(fRES(lot2));
    }

    protected void doSetLot2_NotEqual(String lot2) {
        regLot2(CK_NES, lot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterThan(String lot2) {
        regLot2(CK_GT, fRES(lot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessThan(String lot2) {
        regLot2(CK_LT, fRES(lot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_GreaterEqual(String lot2) {
        regLot2(CK_GE, fRES(lot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_LessEqual(String lot2) {
        regLot2(CK_LE, fRES(lot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_InScope(Collection<String> lot2List) {
        doSetLot2_InScope(lot2List);
    }

    protected void doSetLot2_InScope(Collection<String> lot2List) {
        regINS(CK_INS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2List The collection of lot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_NotInScope(Collection<String> lot2List) {
        doSetLot2_NotInScope(lot2List);
    }

    protected void doSetLot2_NotInScope(Collection<String> lot2List) {
        regINS(CK_NINS, cTL(lot2List), xgetCValueLot2(), "LOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)} <br>
     * <pre>e.g. setLot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot2 The value of lot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot2_LikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot2_NotLikeSearch(String lot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot2), xgetCValueLot2(), "LOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT2: {varchar(60)}
     * @param lot2 The value of lot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot2_PrefixSearch(String lot2) {
        setLot2_LikeSearch(lot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNull() { regLot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNullOrEmpty() { regLot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT2: {varchar(60)}
     */
    public void setLot2_IsNotNull() { regLot2(CK_ISNN, DOBJ); }

    protected void regLot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot2(), "LOT2"); }
    protected abstract ConditionValue xgetCValueLot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_Equal(String lot5) {
        doSetLot5_Equal(fRES(lot5));
    }

    protected void doSetLot5_Equal(String lot5) {
        regLot5(CK_EQ, lot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotEqual(String lot5) {
        doSetLot5_NotEqual(fRES(lot5));
    }

    protected void doSetLot5_NotEqual(String lot5) {
        regLot5(CK_NES, lot5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterThan(String lot5) {
        regLot5(CK_GT, fRES(lot5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessThan(String lot5) {
        regLot5(CK_LT, fRES(lot5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_GreaterEqual(String lot5) {
        regLot5(CK_GE, fRES(lot5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_LessEqual(String lot5) {
        regLot5(CK_LE, fRES(lot5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_InScope(Collection<String> lot5List) {
        doSetLot5_InScope(lot5List);
    }

    protected void doSetLot5_InScope(Collection<String> lot5List) {
        regINS(CK_INS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5List The collection of lot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_NotInScope(Collection<String> lot5List) {
        doSetLot5_NotInScope(lot5List);
    }

    protected void doSetLot5_NotInScope(Collection<String> lot5List) {
        regINS(CK_NINS, cTL(lot5List), xgetCValueLot5(), "LOT5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)} <br>
     * <pre>e.g. setLot5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot5 The value of lot5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot5_LikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot5_NotLikeSearch(String lot5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot5), xgetCValueLot5(), "LOT5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT5: {varchar(8)}
     * @param lot5 The value of lot5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot5_PrefixSearch(String lot5) {
        setLot5_LikeSearch(lot5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNull() { regLot5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNullOrEmpty() { regLot5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT5: {varchar(8)}
     */
    public void setLot5_IsNotNull() { regLot5(CK_ISNN, DOBJ); }

    protected void regLot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot5(), "LOT5"); }
    protected abstract ConditionValue xgetCValueLot5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_Equal(String otherlot2) {
        doSetOtherlot2_Equal(fRES(otherlot2));
    }

    protected void doSetOtherlot2_Equal(String otherlot2) {
        regOtherlot2(CK_EQ, otherlot2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotEqual(String otherlot2) {
        doSetOtherlot2_NotEqual(fRES(otherlot2));
    }

    protected void doSetOtherlot2_NotEqual(String otherlot2) {
        regOtherlot2(CK_NES, otherlot2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterThan(String otherlot2) {
        regOtherlot2(CK_GT, fRES(otherlot2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessThan(String otherlot2) {
        regOtherlot2(CK_LT, fRES(otherlot2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_GreaterEqual(String otherlot2) {
        regOtherlot2(CK_GE, fRES(otherlot2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_LessEqual(String otherlot2) {
        regOtherlot2(CK_LE, fRES(otherlot2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_InScope(Collection<String> otherlot2List) {
        doSetOtherlot2_InScope(otherlot2List);
    }

    protected void doSetOtherlot2_InScope(Collection<String> otherlot2List) {
        regINS(CK_INS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2List The collection of otherlot2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_NotInScope(Collection<String> otherlot2List) {
        doSetOtherlot2_NotInScope(otherlot2List);
    }

    protected void doSetOtherlot2_NotInScope(Collection<String> otherlot2List) {
        regINS(CK_NINS, cTL(otherlot2List), xgetCValueOtherlot2(), "OTHERLOT2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)} <br>
     * <pre>e.g. setOtherlot2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot2 The value of otherlot2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot2_LikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot2_NotLikeSearch(String otherlot2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot2), xgetCValueOtherlot2(), "OTHERLOT2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     * @param otherlot2 The value of otherlot2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot2_PrefixSearch(String otherlot2) {
        setOtherlot2_LikeSearch(otherlot2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNull() { regOtherlot2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNullOrEmpty() { regOtherlot2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT2: {varchar(60)}
     */
    public void setOtherlot2_IsNotNull() { regOtherlot2(CK_ISNN, DOBJ); }

    protected void regOtherlot2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot2(), "OTHERLOT2"); }
    protected abstract ConditionValue xgetCValueOtherlot2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_Equal(String otherlot3) {
        doSetOtherlot3_Equal(fRES(otherlot3));
    }

    protected void doSetOtherlot3_Equal(String otherlot3) {
        regOtherlot3(CK_EQ, otherlot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotEqual(String otherlot3) {
        doSetOtherlot3_NotEqual(fRES(otherlot3));
    }

    protected void doSetOtherlot3_NotEqual(String otherlot3) {
        regOtherlot3(CK_NES, otherlot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterThan(String otherlot3) {
        regOtherlot3(CK_GT, fRES(otherlot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessThan(String otherlot3) {
        regOtherlot3(CK_LT, fRES(otherlot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_GreaterEqual(String otherlot3) {
        regOtherlot3(CK_GE, fRES(otherlot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_LessEqual(String otherlot3) {
        regOtherlot3(CK_LE, fRES(otherlot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_InScope(Collection<String> otherlot3List) {
        doSetOtherlot3_InScope(otherlot3List);
    }

    protected void doSetOtherlot3_InScope(Collection<String> otherlot3List) {
        regINS(CK_INS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3List The collection of otherlot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_NotInScope(Collection<String> otherlot3List) {
        doSetOtherlot3_NotInScope(otherlot3List);
    }

    protected void doSetOtherlot3_NotInScope(Collection<String> otherlot3List) {
        regINS(CK_NINS, cTL(otherlot3List), xgetCValueOtherlot3(), "OTHERLOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)} <br>
     * <pre>e.g. setOtherlot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot3 The value of otherlot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot3_LikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot3_NotLikeSearch(String otherlot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot3), xgetCValueOtherlot3(), "OTHERLOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     * @param otherlot3 The value of otherlot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot3_PrefixSearch(String otherlot3) {
        setOtherlot3_LikeSearch(otherlot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNull() { regOtherlot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNullOrEmpty() { regOtherlot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT3: {varchar(60)}
     */
    public void setOtherlot3_IsNotNull() { regOtherlot3(CK_ISNN, DOBJ); }

    protected void regOtherlot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot3(), "OTHERLOT3"); }
    protected abstract ConditionValue xgetCValueOtherlot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_Equal(String otherlot4) {
        doSetOtherlot4_Equal(fRES(otherlot4));
    }

    protected void doSetOtherlot4_Equal(String otherlot4) {
        regOtherlot4(CK_EQ, otherlot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotEqual(String otherlot4) {
        doSetOtherlot4_NotEqual(fRES(otherlot4));
    }

    protected void doSetOtherlot4_NotEqual(String otherlot4) {
        regOtherlot4(CK_NES, otherlot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterThan(String otherlot4) {
        regOtherlot4(CK_GT, fRES(otherlot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessThan(String otherlot4) {
        regOtherlot4(CK_LT, fRES(otherlot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_GreaterEqual(String otherlot4) {
        regOtherlot4(CK_GE, fRES(otherlot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_LessEqual(String otherlot4) {
        regOtherlot4(CK_LE, fRES(otherlot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_InScope(Collection<String> otherlot4List) {
        doSetOtherlot4_InScope(otherlot4List);
    }

    protected void doSetOtherlot4_InScope(Collection<String> otherlot4List) {
        regINS(CK_INS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4List The collection of otherlot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_NotInScope(Collection<String> otherlot4List) {
        doSetOtherlot4_NotInScope(otherlot4List);
    }

    protected void doSetOtherlot4_NotInScope(Collection<String> otherlot4List) {
        regINS(CK_NINS, cTL(otherlot4List), xgetCValueOtherlot4(), "OTHERLOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)} <br>
     * <pre>e.g. setOtherlot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot4 The value of otherlot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot4_LikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot4_NotLikeSearch(String otherlot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot4), xgetCValueOtherlot4(), "OTHERLOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     * @param otherlot4 The value of otherlot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot4_PrefixSearch(String otherlot4) {
        setOtherlot4_LikeSearch(otherlot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNull() { regOtherlot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNullOrEmpty() { regOtherlot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT4: {varchar(60)}
     */
    public void setOtherlot4_IsNotNull() { regOtherlot4(CK_ISNN, DOBJ); }

    protected void regOtherlot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot4(), "OTHERLOT4"); }
    protected abstract ConditionValue xgetCValueOtherlot4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_Equal(otherlot5);
    }

    protected void doSetOtherlot5_Equal(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_EQ, otherlot5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        doSetOtherlot5_NotEqual(otherlot5);
    }

    protected void doSetOtherlot5_NotEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_NES, otherlot5);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GT, otherlot5);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessThan(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LT, otherlot5);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_GreaterEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_GE, otherlot5);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5 The value of otherlot5 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOtherlot5_LessEqual(java.math.BigDecimal otherlot5) {
        regOtherlot5(CK_LE, otherlot5);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param minNumber The min number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of otherlot5. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOtherlot5_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOtherlot5(), "OTHERLOT5", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_InScope(otherlot5List);
    }

    protected void doSetOtherlot5_InScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_INS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     * @param otherlot5List The collection of otherlot5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        doSetOtherlot5_NotInScope(otherlot5List);
    }

    protected void doSetOtherlot5_NotInScope(Collection<java.math.BigDecimal> otherlot5List) {
        regINS(CK_NINS, cTL(otherlot5List), xgetCValueOtherlot5(), "OTHERLOT5");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNull() { regOtherlot5(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT5: {decimal(16, 6)}
     */
    public void setOtherlot5_IsNotNull() { regOtherlot5(CK_ISNN, DOBJ); }

    protected void regOtherlot5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot5(), "OTHERLOT5"); }
    protected abstract ConditionValue xgetCValueOtherlot5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_Equal(java.math.BigDecimal damageflg) {
        doSetDamageflg_Equal(damageflg);
    }

    protected void doSetDamageflg_Equal(java.math.BigDecimal damageflg) {
        regDamageflg(CK_EQ, damageflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        doSetDamageflg_NotEqual(damageflg);
    }

    protected void doSetDamageflg_NotEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_NES, damageflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GT, damageflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessThan(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LT, damageflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_GreaterEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_GE, damageflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflg The value of damageflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDamageflg_LessEqual(java.math.BigDecimal damageflg) {
        regDamageflg(CK_LE, damageflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of damageflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDamageflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDamageflg(), "DAMAGEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_InScope(damageflgList);
    }

    protected void doSetDamageflg_InScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_INS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     * @param damageflgList The collection of damageflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        doSetDamageflg_NotInScope(damageflgList);
    }

    protected void doSetDamageflg_NotInScope(Collection<java.math.BigDecimal> damageflgList) {
        regINS(CK_NINS, cTL(damageflgList), xgetCValueDamageflg(), "DAMAGEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setDamageflg_IsNull() { regDamageflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAMAGEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setDamageflg_IsNotNull() { regDamageflg(CK_ISNN, DOBJ); }

    protected void regDamageflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageflg(), "DAMAGEFLG"); }
    protected abstract ConditionValue xgetCValueDamageflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_Equal(noshippingflg);
    }

    protected void doSetNoshippingflg_Equal(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_EQ, noshippingflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        doSetNoshippingflg_NotEqual(noshippingflg);
    }

    protected void doSetNoshippingflg_NotEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_NES, noshippingflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GT, noshippingflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessThan(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LT, noshippingflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_GreaterEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_GE, noshippingflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflg The value of noshippingflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNoshippingflg_LessEqual(java.math.BigDecimal noshippingflg) {
        regNoshippingflg(CK_LE, noshippingflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of noshippingflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNoshippingflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNoshippingflg(), "NOSHIPPINGFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_InScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_InScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_INS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     * @param noshippingflgList The collection of noshippingflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        doSetNoshippingflg_NotInScope(noshippingflgList);
    }

    protected void doSetNoshippingflg_NotInScope(Collection<java.math.BigDecimal> noshippingflgList) {
        regINS(CK_NINS, cTL(noshippingflgList), xgetCValueNoshippingflg(), "NOSHIPPINGFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setNoshippingflg_IsNull() { regNoshippingflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOSHIPPINGFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setNoshippingflg_IsNotNull() { regNoshippingflg(CK_ISNN, DOBJ); }

    protected void regNoshippingflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNoshippingflg(), "NOSHIPPINGFLG"); }
    protected abstract ConditionValue xgetCValueNoshippingflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_Equal(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_Equal(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_EQ, foreigncargoflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        doSetForeigncargoflg_NotEqual(foreigncargoflg);
    }

    protected void doSetForeigncargoflg_NotEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_NES, foreigncargoflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GT, foreigncargoflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessThan(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LT, foreigncargoflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_GreaterEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_GE, foreigncargoflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflg The value of foreigncargoflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setForeigncargoflg_LessEqual(java.math.BigDecimal foreigncargoflg) {
        regForeigncargoflg(CK_LE, foreigncargoflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of foreigncargoflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setForeigncargoflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_InScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_InScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_INS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     * @param foreigncargoflgList The collection of foreigncargoflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        doSetForeigncargoflg_NotInScope(foreigncargoflgList);
    }

    protected void doSetForeigncargoflg_NotInScope(Collection<java.math.BigDecimal> foreigncargoflgList) {
        regINS(CK_NINS, cTL(foreigncargoflgList), xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setForeigncargoflg_IsNull() { regForeigncargoflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FOREIGNCARGOFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setForeigncargoflg_IsNotNull() { regForeigncargoflg(CK_ISNN, DOBJ); }

    protected void regForeigncargoflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueForeigncargoflg(), "FOREIGNCARGOFLG"); }
    protected abstract ConditionValue xgetCValueForeigncargoflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_Equal(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_Equal(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_EQ, customsreleaseflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        doSetCustomsreleaseflg_NotEqual(customsreleaseflg);
    }

    protected void doSetCustomsreleaseflg_NotEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_NES, customsreleaseflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GT, customsreleaseflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessThan(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LT, customsreleaseflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_GreaterEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_GE, customsreleaseflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflg The value of customsreleaseflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_LessEqual(java.math.BigDecimal customsreleaseflg) {
        regCustomsreleaseflg(CK_LE, customsreleaseflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customsreleaseflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomsreleaseflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_InScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_InScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_INS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     * @param customsreleaseflgList The collection of customsreleaseflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        doSetCustomsreleaseflg_NotInScope(customsreleaseflgList);
    }

    protected void doSetCustomsreleaseflg_NotInScope(Collection<java.math.BigDecimal> customsreleaseflgList) {
        regINS(CK_NINS, cTL(customsreleaseflgList), xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setCustomsreleaseflg_IsNull() { regCustomsreleaseflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMSRELEASEFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setCustomsreleaseflg_IsNotNull() { regCustomsreleaseflg(CK_ISNN, DOBJ); }

    protected void regCustomsreleaseflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomsreleaseflg(), "CUSTOMSRELEASEFLG"); }
    protected abstract ConditionValue xgetCValueCustomsreleaseflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_Equal(java.math.BigDecimal taxflg) {
        doSetTaxflg_Equal(taxflg);
    }

    protected void doSetTaxflg_Equal(java.math.BigDecimal taxflg) {
        regTaxflg(CK_EQ, taxflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        doSetTaxflg_NotEqual(taxflg);
    }

    protected void doSetTaxflg_NotEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_NES, taxflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GT, taxflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessThan(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LT, taxflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_GreaterEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_GE, taxflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflg The value of taxflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaxflg_LessEqual(java.math.BigDecimal taxflg) {
        regTaxflg(CK_LE, taxflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taxflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaxflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaxflg(), "TAXFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_InScope(taxflgList);
    }

    protected void doSetTaxflg_InScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_INS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     * @param taxflgList The collection of taxflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        doSetTaxflg_NotInScope(taxflgList);
    }

    protected void doSetTaxflg_NotInScope(Collection<java.math.BigDecimal> taxflgList) {
        regINS(CK_NINS, cTL(taxflgList), xgetCValueTaxflg(), "TAXFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setTaxflg_IsNull() { regTaxflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TAXFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setTaxflg_IsNotNull() { regTaxflg(CK_ISNN, DOBJ); }

    protected void regTaxflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaxflg(), "TAXFLG"); }
    protected abstract ConditionValue xgetCValueTaxflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_Equal(String examsts) {
        doSetExamsts_Equal(fRES(examsts));
    }

    protected void doSetExamsts_Equal(String examsts) {
        regExamsts(CK_EQ, examsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_NotEqual(String examsts) {
        doSetExamsts_NotEqual(fRES(examsts));
    }

    protected void doSetExamsts_NotEqual(String examsts) {
        regExamsts(CK_NES, examsts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_GreaterThan(String examsts) {
        regExamsts(CK_GT, fRES(examsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_LessThan(String examsts) {
        regExamsts(CK_LT, fRES(examsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_GreaterEqual(String examsts) {
        regExamsts(CK_GE, fRES(examsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_LessEqual(String examsts) {
        regExamsts(CK_LE, fRES(examsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examstsList The collection of examsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_InScope(Collection<String> examstsList) {
        doSetExamsts_InScope(examstsList);
    }

    protected void doSetExamsts_InScope(Collection<String> examstsList) {
        regINS(CK_INS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examstsList The collection of examsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_NotInScope(Collection<String> examstsList) {
        doSetExamsts_NotInScope(examstsList);
    }

    protected void doSetExamsts_NotInScope(Collection<String> examstsList) {
        regINS(CK_NINS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]} <br>
     * <pre>e.g. setExamsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examsts The value of examsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamsts_LikeSearch(String examsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examsts), xgetCValueExamsts(), "EXAMSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamsts_NotLikeSearch(String examsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examsts), xgetCValueExamsts(), "EXAMSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     * @param examsts The value of examsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_PrefixSearch(String examsts) {
        setExamsts_LikeSearch(examsts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     */
    public void setExamsts_IsNull() { regExamsts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {char(1), default=[(0)]}
     */
    public void setExamsts_IsNotNull() { regExamsts(CK_ISNN, DOBJ); }

    protected void regExamsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamsts(), "EXAMSTS"); }
    protected abstract ConditionValue xgetCValueExamsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_Equal(String examendsts) {
        doSetExamendsts_Equal(fRES(examendsts));
    }

    protected void doSetExamendsts_Equal(String examendsts) {
        regExamendsts(CK_EQ, examendsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_NotEqual(String examendsts) {
        doSetExamendsts_NotEqual(fRES(examendsts));
    }

    protected void doSetExamendsts_NotEqual(String examendsts) {
        regExamendsts(CK_NES, examendsts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_GreaterThan(String examendsts) {
        regExamendsts(CK_GT, fRES(examendsts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_LessThan(String examendsts) {
        regExamendsts(CK_LT, fRES(examendsts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_GreaterEqual(String examendsts) {
        regExamendsts(CK_GE, fRES(examendsts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_LessEqual(String examendsts) {
        regExamendsts(CK_LE, fRES(examendsts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendstsList The collection of examendsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_InScope(Collection<String> examendstsList) {
        doSetExamendsts_InScope(examendstsList);
    }

    protected void doSetExamendsts_InScope(Collection<String> examendstsList) {
        regINS(CK_INS, cTL(examendstsList), xgetCValueExamendsts(), "EXAMENDSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendstsList The collection of examendsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_NotInScope(Collection<String> examendstsList) {
        doSetExamendsts_NotInScope(examendstsList);
    }

    protected void doSetExamendsts_NotInScope(Collection<String> examendstsList) {
        regINS(CK_NINS, cTL(examendstsList), xgetCValueExamendsts(), "EXAMENDSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]} <br>
     * <pre>e.g. setExamendsts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param examendsts The value of examendsts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExamendsts_LikeSearch(String examendsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(examendsts), xgetCValueExamendsts(), "EXAMENDSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExamendsts_NotLikeSearch(String examendsts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(examendsts), xgetCValueExamendsts(), "EXAMENDSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     * @param examendsts The value of examendsts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamendsts_PrefixSearch(String examendsts) {
        setExamendsts_LikeSearch(examendsts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     */
    public void setExamendsts_IsNull() { regExamendsts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMENDSTS: {char(1), default=[(0)]}
     */
    public void setExamendsts_IsNotNull() { regExamendsts(CK_ISNN, DOBJ); }

    protected void regExamendsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamendsts(), "EXAMENDSTS"); }
    protected abstract ConditionValue xgetCValueExamendsts();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_Equal(String addflg) {
        doSetAddflg_Equal(fRES(addflg));
    }

    protected void doSetAddflg_Equal(String addflg) {
        regAddflg(CK_EQ, addflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_NotEqual(String addflg) {
        doSetAddflg_NotEqual(fRES(addflg));
    }

    protected void doSetAddflg_NotEqual(String addflg) {
        regAddflg(CK_NES, addflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_GreaterThan(String addflg) {
        regAddflg(CK_GT, fRES(addflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_LessThan(String addflg) {
        regAddflg(CK_LT, fRES(addflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_GreaterEqual(String addflg) {
        regAddflg(CK_GE, fRES(addflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_LessEqual(String addflg) {
        regAddflg(CK_LE, fRES(addflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflgList The collection of addflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_InScope(Collection<String> addflgList) {
        doSetAddflg_InScope(addflgList);
    }

    protected void doSetAddflg_InScope(Collection<String> addflgList) {
        regINS(CK_INS, cTL(addflgList), xgetCValueAddflg(), "ADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflgList The collection of addflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_NotInScope(Collection<String> addflgList) {
        doSetAddflg_NotInScope(addflgList);
    }

    protected void doSetAddflg_NotInScope(Collection<String> addflgList) {
        regINS(CK_NINS, cTL(addflgList), xgetCValueAddflg(), "ADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDFLG: {char(1)} <br>
     * <pre>e.g. setAddflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param addflg The value of addflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddflg_LikeSearch(String addflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(addflg), xgetCValueAddflg(), "ADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddflg_NotLikeSearch(String addflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(addflg), xgetCValueAddflg(), "ADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDFLG: {char(1)}
     * @param addflg The value of addflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddflg_PrefixSearch(String addflg) {
        setAddflg_LikeSearch(addflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     */
    public void setAddflg_IsNull() { regAddflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDFLG: {char(1)}
     */
    public void setAddflg_IsNotNull() { regAddflg(CK_ISNN, DOBJ); }

    protected void regAddflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddflg(), "ADDFLG"); }
    protected abstract ConditionValue xgetCValueAddflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_Equal(String receivedate) {
        doSetReceivedate_Equal(fRES(receivedate));
    }

    protected void doSetReceivedate_Equal(String receivedate) {
        regReceivedate(CK_EQ, receivedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotEqual(String receivedate) {
        doSetReceivedate_NotEqual(fRES(receivedate));
    }

    protected void doSetReceivedate_NotEqual(String receivedate) {
        regReceivedate(CK_NES, receivedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "RECEIVEDATE"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_Equal(String sendflg) {
        doSetSendflg_Equal(fRES(sendflg));
    }

    protected void doSetSendflg_Equal(String sendflg) {
        regSendflg(CK_EQ, sendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotEqual(String sendflg) {
        doSetSendflg_NotEqual(fRES(sendflg));
    }

    protected void doSetSendflg_NotEqual(String sendflg) {
        regSendflg(CK_NES, sendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_GreaterThan(String sendflg) {
        regSendflg(CK_GT, fRES(sendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_LessThan(String sendflg) {
        regSendflg(CK_LT, fRES(sendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_GreaterEqual(String sendflg) {
        regSendflg(CK_GE, fRES(sendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_LessEqual(String sendflg) {
        regSendflg(CK_LE, fRES(sendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflgList The collection of sendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_InScope(Collection<String> sendflgList) {
        doSetSendflg_InScope(sendflgList);
    }

    protected void doSetSendflg_InScope(Collection<String> sendflgList) {
        regINS(CK_INS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflgList The collection of sendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_NotInScope(Collection<String> sendflgList) {
        doSetSendflg_NotInScope(sendflgList);
    }

    protected void doSetSendflg_NotInScope(Collection<String> sendflgList) {
        regINS(CK_NINS, cTL(sendflgList), xgetCValueSendflg(), "SENDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDFLG: {char(1)} <br>
     * <pre>e.g. setSendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendflg The value of sendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendflg_LikeSearch(String sendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendflg), xgetCValueSendflg(), "SENDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendflg_NotLikeSearch(String sendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendflg), xgetCValueSendflg(), "SENDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDFLG: {char(1)}
     * @param sendflg The value of sendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendflg_PrefixSearch(String sendflg) {
        setSendflg_LikeSearch(sendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     */
    public void setSendflg_IsNull() { regSendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDFLG: {char(1)}
     */
    public void setSendflg_IsNotNull() { regSendflg(CK_ISNN, DOBJ); }

    protected void regSendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendflg(), "SENDFLG"); }
    protected abstract ConditionValue xgetCValueSendflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_Equal(java.math.BigDecimal examqty) {
        doSetExamqty_Equal(examqty);
    }

    protected void doSetExamqty_Equal(java.math.BigDecimal examqty) {
        regExamqty(CK_EQ, examqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_NotEqual(java.math.BigDecimal examqty) {
        doSetExamqty_NotEqual(examqty);
    }

    protected void doSetExamqty_NotEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_NES, examqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_GreaterThan(java.math.BigDecimal examqty) {
        regExamqty(CK_GT, examqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_LessThan(java.math.BigDecimal examqty) {
        regExamqty(CK_LT, examqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_GreaterEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_GE, examqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqty The value of examqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamqty_LessEqual(java.math.BigDecimal examqty) {
        regExamqty(CK_LE, examqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of examqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of examqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExamqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExamqty(), "EXAMQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqtyList The collection of examqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamqty_InScope(Collection<java.math.BigDecimal> examqtyList) {
        doSetExamqty_InScope(examqtyList);
    }

    protected void doSetExamqty_InScope(Collection<java.math.BigDecimal> examqtyList) {
        regINS(CK_INS, cTL(examqtyList), xgetCValueExamqty(), "EXAMQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     * @param examqtyList The collection of examqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamqty_NotInScope(Collection<java.math.BigDecimal> examqtyList) {
        doSetExamqty_NotInScope(examqtyList);
    }

    protected void doSetExamqty_NotInScope(Collection<java.math.BigDecimal> examqtyList) {
        regINS(CK_NINS, cTL(examqtyList), xgetCValueExamqty(), "EXAMQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setExamqty_IsNull() { regExamqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setExamqty_IsNotNull() { regExamqty(CK_ISNN, DOBJ); }

    protected void regExamqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamqty(), "EXAMQTY"); }
    protected abstract ConditionValue xgetCValueExamqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_Equal(java.math.BigDecimal res40qty) {
        doSetRes40qty_Equal(res40qty);
    }

    protected void doSetRes40qty_Equal(java.math.BigDecimal res40qty) {
        regRes40qty(CK_EQ, res40qty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_NotEqual(java.math.BigDecimal res40qty) {
        doSetRes40qty_NotEqual(res40qty);
    }

    protected void doSetRes40qty_NotEqual(java.math.BigDecimal res40qty) {
        regRes40qty(CK_NES, res40qty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_GreaterThan(java.math.BigDecimal res40qty) {
        regRes40qty(CK_GT, res40qty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_LessThan(java.math.BigDecimal res40qty) {
        regRes40qty(CK_LT, res40qty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_GreaterEqual(java.math.BigDecimal res40qty) {
        regRes40qty(CK_GE, res40qty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qty The value of res40qty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRes40qty_LessEqual(java.math.BigDecimal res40qty) {
        regRes40qty(CK_LE, res40qty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of res40qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of res40qty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRes40qty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRes40qty(), "RES40QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qtyList The collection of res40qty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty_InScope(Collection<java.math.BigDecimal> res40qtyList) {
        doSetRes40qty_InScope(res40qtyList);
    }

    protected void doSetRes40qty_InScope(Collection<java.math.BigDecimal> res40qtyList) {
        regINS(CK_INS, cTL(res40qtyList), xgetCValueRes40qty(), "RES40QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     * @param res40qtyList The collection of res40qty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRes40qty_NotInScope(Collection<java.math.BigDecimal> res40qtyList) {
        doSetRes40qty_NotInScope(res40qtyList);
    }

    protected void doSetRes40qty_NotInScope(Collection<java.math.BigDecimal> res40qtyList) {
        regINS(CK_NINS, cTL(res40qtyList), xgetCValueRes40qty(), "RES40QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     */
    public void setRes40qty_IsNull() { regRes40qty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RES40QTY: {decimal(16, 6), default=[(0)]}
     */
    public void setRes40qty_IsNotNull() { regRes40qty(CK_ISNN, DOBJ); }

    protected void regRes40qty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRes40qty(), "RES40QTY"); }
    protected abstract ConditionValue xgetCValueRes40qty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_Equal(java.math.BigDecimal inferiorqty) {
        doSetInferiorqty_Equal(inferiorqty);
    }

    protected void doSetInferiorqty_Equal(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_EQ, inferiorqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_NotEqual(java.math.BigDecimal inferiorqty) {
        doSetInferiorqty_NotEqual(inferiorqty);
    }

    protected void doSetInferiorqty_NotEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_NES, inferiorqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_GreaterThan(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_GT, inferiorqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_LessThan(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_LT, inferiorqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_GreaterEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_GE, inferiorqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqty The value of inferiorqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInferiorqty_LessEqual(java.math.BigDecimal inferiorqty) {
        regInferiorqty(CK_LE, inferiorqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of inferiorqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inferiorqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInferiorqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInferiorqty(), "INFERIORQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqtyList The collection of inferiorqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInferiorqty_InScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        doSetInferiorqty_InScope(inferiorqtyList);
    }

    protected void doSetInferiorqty_InScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        regINS(CK_INS, cTL(inferiorqtyList), xgetCValueInferiorqty(), "INFERIORQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     * @param inferiorqtyList The collection of inferiorqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInferiorqty_NotInScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        doSetInferiorqty_NotInScope(inferiorqtyList);
    }

    protected void doSetInferiorqty_NotInScope(Collection<java.math.BigDecimal> inferiorqtyList) {
        regINS(CK_NINS, cTL(inferiorqtyList), xgetCValueInferiorqty(), "INFERIORQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setInferiorqty_IsNull() { regInferiorqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INFERIORQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setInferiorqty_IsNotNull() { regInferiorqty(CK_ISNN, DOBJ); }

    protected void regInferiorqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInferiorqty(), "INFERIORQTY"); }
    protected abstract ConditionValue xgetCValueInferiorqty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_Equal(java.math.BigDecimal notexamqty) {
        doSetNotexamqty_Equal(notexamqty);
    }

    protected void doSetNotexamqty_Equal(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_EQ, notexamqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_NotEqual(java.math.BigDecimal notexamqty) {
        doSetNotexamqty_NotEqual(notexamqty);
    }

    protected void doSetNotexamqty_NotEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_NES, notexamqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_GreaterThan(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_GT, notexamqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_LessThan(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_LT, notexamqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_GreaterEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_GE, notexamqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqty The value of notexamqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNotexamqty_LessEqual(java.math.BigDecimal notexamqty) {
        regNotexamqty(CK_LE, notexamqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param minNumber The min number of notexamqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of notexamqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNotexamqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNotexamqty(), "NOTEXAMQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqtyList The collection of notexamqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotexamqty_InScope(Collection<java.math.BigDecimal> notexamqtyList) {
        doSetNotexamqty_InScope(notexamqtyList);
    }

    protected void doSetNotexamqty_InScope(Collection<java.math.BigDecimal> notexamqtyList) {
        regINS(CK_INS, cTL(notexamqtyList), xgetCValueNotexamqty(), "NOTEXAMQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     * @param notexamqtyList The collection of notexamqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotexamqty_NotInScope(Collection<java.math.BigDecimal> notexamqtyList) {
        doSetNotexamqty_NotInScope(notexamqtyList);
    }

    protected void doSetNotexamqty_NotInScope(Collection<java.math.BigDecimal> notexamqtyList) {
        regINS(CK_NINS, cTL(notexamqtyList), xgetCValueNotexamqty(), "NOTEXAMQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     */
    public void setNotexamqty_IsNull() { regNotexamqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTEXAMQTY: {decimal(16, 6)}
     */
    public void setNotexamqty_IsNotNull() { regNotexamqty(CK_ISNN, DOBJ); }

    protected void regNotexamqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotexamqty(), "NOTEXAMQTY"); }
    protected abstract ConditionValue xgetCValueNotexamqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_Equal(String firstexamsendflg) {
        doSetFirstexamsendflg_Equal(fRES(firstexamsendflg));
    }

    protected void doSetFirstexamsendflg_Equal(String firstexamsendflg) {
        regFirstexamsendflg(CK_EQ, firstexamsendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_NotEqual(String firstexamsendflg) {
        doSetFirstexamsendflg_NotEqual(fRES(firstexamsendflg));
    }

    protected void doSetFirstexamsendflg_NotEqual(String firstexamsendflg) {
        regFirstexamsendflg(CK_NES, firstexamsendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_GreaterThan(String firstexamsendflg) {
        regFirstexamsendflg(CK_GT, fRES(firstexamsendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_LessThan(String firstexamsendflg) {
        regFirstexamsendflg(CK_LT, fRES(firstexamsendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_GreaterEqual(String firstexamsendflg) {
        regFirstexamsendflg(CK_GE, fRES(firstexamsendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_LessEqual(String firstexamsendflg) {
        regFirstexamsendflg(CK_LE, fRES(firstexamsendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflgList The collection of firstexamsendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_InScope(Collection<String> firstexamsendflgList) {
        doSetFirstexamsendflg_InScope(firstexamsendflgList);
    }

    protected void doSetFirstexamsendflg_InScope(Collection<String> firstexamsendflgList) {
        regINS(CK_INS, cTL(firstexamsendflgList), xgetCValueFirstexamsendflg(), "FIRSTEXAMSENDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflgList The collection of firstexamsendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_NotInScope(Collection<String> firstexamsendflgList) {
        doSetFirstexamsendflg_NotInScope(firstexamsendflgList);
    }

    protected void doSetFirstexamsendflg_NotInScope(Collection<String> firstexamsendflgList) {
        regINS(CK_NINS, cTL(firstexamsendflgList), xgetCValueFirstexamsendflg(), "FIRSTEXAMSENDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)} <br>
     * <pre>e.g. setFirstexamsendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firstexamsendflg The value of firstexamsendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirstexamsendflg_LikeSearch(String firstexamsendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firstexamsendflg), xgetCValueFirstexamsendflg(), "FIRSTEXAMSENDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirstexamsendflg_NotLikeSearch(String firstexamsendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firstexamsendflg), xgetCValueFirstexamsendflg(), "FIRSTEXAMSENDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     * @param firstexamsendflg The value of firstexamsendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirstexamsendflg_PrefixSearch(String firstexamsendflg) {
        setFirstexamsendflg_LikeSearch(firstexamsendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     */
    public void setFirstexamsendflg_IsNull() { regFirstexamsendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRSTEXAMSENDFLG: {char(1)}
     */
    public void setFirstexamsendflg_IsNotNull() { regFirstexamsendflg(CK_ISNN, DOBJ); }

    protected void regFirstexamsendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirstexamsendflg(), "FIRSTEXAMSENDFLG"); }
    protected abstract ConditionValue xgetCValueFirstexamsendflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_Equal(String qualityexamflg) {
        doSetQualityexamflg_Equal(fRES(qualityexamflg));
    }

    protected void doSetQualityexamflg_Equal(String qualityexamflg) {
        regQualityexamflg(CK_EQ, qualityexamflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_NotEqual(String qualityexamflg) {
        doSetQualityexamflg_NotEqual(fRES(qualityexamflg));
    }

    protected void doSetQualityexamflg_NotEqual(String qualityexamflg) {
        regQualityexamflg(CK_NES, qualityexamflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_GreaterThan(String qualityexamflg) {
        regQualityexamflg(CK_GT, fRES(qualityexamflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_LessThan(String qualityexamflg) {
        regQualityexamflg(CK_LT, fRES(qualityexamflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_GreaterEqual(String qualityexamflg) {
        regQualityexamflg(CK_GE, fRES(qualityexamflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_LessEqual(String qualityexamflg) {
        regQualityexamflg(CK_LE, fRES(qualityexamflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflgList The collection of qualityexamflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_InScope(Collection<String> qualityexamflgList) {
        doSetQualityexamflg_InScope(qualityexamflgList);
    }

    protected void doSetQualityexamflg_InScope(Collection<String> qualityexamflgList) {
        regINS(CK_INS, cTL(qualityexamflgList), xgetCValueQualityexamflg(), "QUALITYEXAMFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflgList The collection of qualityexamflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_NotInScope(Collection<String> qualityexamflgList) {
        doSetQualityexamflg_NotInScope(qualityexamflgList);
    }

    protected void doSetQualityexamflg_NotInScope(Collection<String> qualityexamflgList) {
        regINS(CK_NINS, cTL(qualityexamflgList), xgetCValueQualityexamflg(), "QUALITYEXAMFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setQualityexamflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param qualityexamflg The value of qualityexamflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setQualityexamflg_LikeSearch(String qualityexamflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(qualityexamflg), xgetCValueQualityexamflg(), "QUALITYEXAMFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setQualityexamflg_NotLikeSearch(String qualityexamflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(qualityexamflg), xgetCValueQualityexamflg(), "QUALITYEXAMFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     * @param qualityexamflg The value of qualityexamflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQualityexamflg_PrefixSearch(String qualityexamflg) {
        setQualityexamflg_LikeSearch(qualityexamflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     */
    public void setQualityexamflg_IsNull() { regQualityexamflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QUALITYEXAMFLG: {char(1), default=[(0)]}
     */
    public void setQualityexamflg_IsNotNull() { regQualityexamflg(CK_ISNN, DOBJ); }

    protected void regQualityexamflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQualityexamflg(), "QUALITYEXAMFLG"); }
    protected abstract ConditionValue xgetCValueQualityexamflg();

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
    public HpSLCFunction<TTrexamresultCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrexamresultCB.class);
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
    public HpSLCFunction<TTrexamresultCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrexamresultCB.class);
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
    public HpSLCFunction<TTrexamresultCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrexamresultCB.class);
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
    public HpSLCFunction<TTrexamresultCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrexamresultCB.class);
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
    public HpSLCFunction<TTrexamresultCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrexamresultCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrexamresultCB&gt;() {
     *     public void query(TTrexamresultCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrexamresultCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrexamresultCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamresultCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrexamresultCQ sq);

    protected TTrexamresultCB xcreateScalarConditionCB() {
        TTrexamresultCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrexamresultCB xcreateScalarConditionPartitionByCB() {
        TTrexamresultCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrexamresultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamresultCB cb = new TTrexamresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TREXAMRESULT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrexamresultCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrexamresultCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrexamresultCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrexamresultCB cb = new TTrexamresultCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TREXAMRESULT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrexamresultCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrexamresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrexamresultCB cb = new TTrexamresultCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrexamresultCQ sq);

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
    protected TTrexamresultCB newMyCB() {
        return new TTrexamresultCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrexamresultCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
