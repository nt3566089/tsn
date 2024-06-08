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
 * The abstract condition-query of T_WORK_DATA.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTWorkDataCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTWorkDataCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_WORK_DATA";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_Equal(Long workDataId) {
        doSetWorkDataId_Equal(workDataId);
    }

    protected void doSetWorkDataId_Equal(Long workDataId) {
        regWorkDataId(CK_EQ, workDataId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_NotEqual(Long workDataId) {
        doSetWorkDataId_NotEqual(workDataId);
    }

    protected void doSetWorkDataId_NotEqual(Long workDataId) {
        regWorkDataId(CK_NES, workDataId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_GreaterThan(Long workDataId) {
        regWorkDataId(CK_GT, workDataId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_LessThan(Long workDataId) {
        regWorkDataId(CK_LT, workDataId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_GreaterEqual(Long workDataId) {
        regWorkDataId(CK_GE, workDataId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataId The value of workDataId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkDataId_LessEqual(Long workDataId) {
        regWorkDataId(CK_LE, workDataId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of workDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workDataId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkDataId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkDataId(), "WORK_DATA_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataIdList The collection of workDataId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDataId_InScope(Collection<Long> workDataIdList) {
        doSetWorkDataId_InScope(workDataIdList);
    }

    protected void doSetWorkDataId_InScope(Collection<Long> workDataIdList) {
        regINS(CK_INS, cTL(workDataIdList), xgetCValueWorkDataId(), "WORK_DATA_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param workDataIdList The collection of workDataId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDataId_NotInScope(Collection<Long> workDataIdList) {
        doSetWorkDataId_NotInScope(workDataIdList);
    }

    protected void doSetWorkDataId_NotInScope(Collection<Long> workDataIdList) {
        regINS(CK_NINS, cTL(workDataIdList), xgetCValueWorkDataId(), "WORK_DATA_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWorkDataId_IsNull() { regWorkDataId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DATA_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setWorkDataId_IsNotNull() { regWorkDataId(CK_ISNN, DOBJ); }

    protected void regWorkDataId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDataId(), "WORK_DATA_ID"); }
    protected abstract ConditionValue xgetCValueWorkDataId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_Equal(String userCd) {
        doSetUserCd_Equal(fRES(userCd));
    }

    protected void doSetUserCd_Equal(String userCd) {
        regUserCd(CK_EQ, userCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotEqual(String userCd) {
        doSetUserCd_NotEqual(fRES(userCd));
    }

    protected void doSetUserCd_NotEqual(String userCd) {
        regUserCd(CK_NES, userCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCdList The collection of userCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_InScope(Collection<String> userCdList) {
        doSetUserCd_InScope(userCdList);
    }

    protected void doSetUserCd_InScope(Collection<String> userCdList) {
        regINS(CK_INS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCdList The collection of userCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotInScope(Collection<String> userCdList) {
        doSetUserCd_NotInScope(userCdList);
    }

    protected void doSetUserCd_NotInScope(Collection<String> userCdList) {
        regINS(CK_NINS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {IX+, varchar(30)} <br>
     * <pre>e.g. setUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userCd The value of userCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserCd_LikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     */
    public void setUserCd_IsNull() { regUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     */
    public void setUserCd_IsNullOrEmpty() { regUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_CD: {IX+, varchar(30)}
     */
    public void setUserCd_IsNotNull() { regUserCd(CK_ISNN, DOBJ); }

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_Equal(String workCd) {
        doSetWorkCd_Equal(fRES(workCd));
    }

    protected void doSetWorkCd_Equal(String workCd) {
        regWorkCd(CK_EQ, workCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_NotEqual(String workCd) {
        doSetWorkCd_NotEqual(fRES(workCd));
    }

    protected void doSetWorkCd_NotEqual(String workCd) {
        regWorkCd(CK_NES, workCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_GreaterThan(String workCd) {
        regWorkCd(CK_GT, fRES(workCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_LessThan(String workCd) {
        regWorkCd(CK_LT, fRES(workCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_GreaterEqual(String workCd) {
        regWorkCd(CK_GE, fRES(workCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_LessEqual(String workCd) {
        regWorkCd(CK_LE, fRES(workCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCdList The collection of workCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_InScope(Collection<String> workCdList) {
        doSetWorkCd_InScope(workCdList);
    }

    protected void doSetWorkCd_InScope(Collection<String> workCdList) {
        regINS(CK_INS, cTL(workCdList), xgetCValueWorkCd(), "WORK_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCdList The collection of workCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_NotInScope(Collection<String> workCdList) {
        doSetWorkCd_NotInScope(workCdList);
    }

    protected void doSetWorkCd_NotInScope(Collection<String> workCdList) {
        regINS(CK_NINS, cTL(workCdList), xgetCValueWorkCd(), "WORK_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_CD: {varchar(30)} <br>
     * <pre>e.g. setWorkCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workCd The value of workCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkCd_LikeSearch(String workCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workCd), xgetCValueWorkCd(), "WORK_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkCd_NotLikeSearch(String workCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workCd), xgetCValueWorkCd(), "WORK_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_CD: {varchar(30)}
     * @param workCd The value of workCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCd_PrefixSearch(String workCd) {
        setWorkCd_LikeSearch(workCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     */
    public void setWorkCd_IsNull() { regWorkCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     */
    public void setWorkCd_IsNullOrEmpty() { regWorkCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_CD: {varchar(30)}
     */
    public void setWorkCd_IsNotNull() { regWorkCd(CK_ISNN, DOBJ); }

    protected void regWorkCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkCd(), "WORK_CD"); }
    protected abstract ConditionValue xgetCValueWorkCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_Equal(java.math.BigDecimal workQty) {
        doSetWorkQty_Equal(workQty);
    }

    protected void doSetWorkQty_Equal(java.math.BigDecimal workQty) {
        regWorkQty(CK_EQ, workQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_NotEqual(java.math.BigDecimal workQty) {
        doSetWorkQty_NotEqual(workQty);
    }

    protected void doSetWorkQty_NotEqual(java.math.BigDecimal workQty) {
        regWorkQty(CK_NES, workQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_GreaterThan(java.math.BigDecimal workQty) {
        regWorkQty(CK_GT, workQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_LessThan(java.math.BigDecimal workQty) {
        regWorkQty(CK_LT, workQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_GreaterEqual(java.math.BigDecimal workQty) {
        regWorkQty(CK_GE, workQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQty The value of workQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_LessEqual(java.math.BigDecimal workQty) {
        regWorkQty(CK_LE, workQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param minNumber The min number of workQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkQty(), "WORK_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQtyList The collection of workQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkQty_InScope(Collection<java.math.BigDecimal> workQtyList) {
        doSetWorkQty_InScope(workQtyList);
    }

    protected void doSetWorkQty_InScope(Collection<java.math.BigDecimal> workQtyList) {
        regINS(CK_INS, cTL(workQtyList), xgetCValueWorkQty(), "WORK_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     * @param workQtyList The collection of workQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkQty_NotInScope(Collection<java.math.BigDecimal> workQtyList) {
        doSetWorkQty_NotInScope(workQtyList);
    }

    protected void doSetWorkQty_NotInScope(Collection<java.math.BigDecimal> workQtyList) {
        regINS(CK_NINS, cTL(workQtyList), xgetCValueWorkQty(), "WORK_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     */
    public void setWorkQty_IsNull() { regWorkQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_QTY: {decimal(16, 6)}
     */
    public void setWorkQty_IsNotNull() { regWorkQty(CK_ISNN, DOBJ); }

    protected void regWorkQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkQty(), "WORK_QTY"); }
    protected abstract ConditionValue xgetCValueWorkQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_Equal(String macAddress) {
        doSetMacAddress_Equal(fRES(macAddress));
    }

    protected void doSetMacAddress_Equal(String macAddress) {
        regMacAddress(CK_EQ, macAddress);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotEqual(String macAddress) {
        doSetMacAddress_NotEqual(fRES(macAddress));
    }

    protected void doSetMacAddress_NotEqual(String macAddress) {
        regMacAddress(CK_NES, macAddress);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterThan(String macAddress) {
        regMacAddress(CK_GT, fRES(macAddress));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessThan(String macAddress) {
        regMacAddress(CK_LT, fRES(macAddress));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_GreaterEqual(String macAddress) {
        regMacAddress(CK_GE, fRES(macAddress));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_LessEqual(String macAddress) {
        regMacAddress(CK_LE, fRES(macAddress));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddressList The collection of macAddress as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_InScope(Collection<String> macAddressList) {
        doSetMacAddress_InScope(macAddressList);
    }

    protected void doSetMacAddress_InScope(Collection<String> macAddressList) {
        regINS(CK_INS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddressList The collection of macAddress as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_NotInScope(Collection<String> macAddressList) {
        doSetMacAddress_NotInScope(macAddressList);
    }

    protected void doSetMacAddress_NotInScope(Collection<String> macAddressList) {
        regINS(CK_NINS, cTL(macAddressList), xgetCValueMacAddress(), "MAC_ADDRESS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)} <br>
     * <pre>e.g. setMacAddress_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param macAddress The value of macAddress as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMacAddress_LikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMacAddress_NotLikeSearch(String macAddress, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(macAddress), xgetCValueMacAddress(), "MAC_ADDRESS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     * @param macAddress The value of macAddress as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMacAddress_PrefixSearch(String macAddress) {
        setMacAddress_LikeSearch(macAddress, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     */
    public void setMacAddress_IsNull() { regMacAddress(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     */
    public void setMacAddress_IsNullOrEmpty() { regMacAddress(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAC_ADDRESS: {IX+, varchar(60)}
     */
    public void setMacAddress_IsNotNull() { regMacAddress(CK_ISNN, DOBJ); }

    protected void regMacAddress(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMacAddress(), "MAC_ADDRESS"); }
    protected abstract ConditionValue xgetCValueMacAddress();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_Equal(Long workLogId) {
        doSetWorkLogId_Equal(workLogId);
    }

    protected void doSetWorkLogId_Equal(Long workLogId) {
        regWorkLogId(CK_EQ, workLogId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_NotEqual(Long workLogId) {
        doSetWorkLogId_NotEqual(workLogId);
    }

    protected void doSetWorkLogId_NotEqual(Long workLogId) {
        regWorkLogId(CK_NES, workLogId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_GreaterThan(Long workLogId) {
        regWorkLogId(CK_GT, workLogId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_LessThan(Long workLogId) {
        regWorkLogId(CK_LT, workLogId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_GreaterEqual(Long workLogId) {
        regWorkLogId(CK_GE, workLogId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogId The value of workLogId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkLogId_LessEqual(Long workLogId) {
        regWorkLogId(CK_LE, workLogId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param minNumber The min number of workLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workLogId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkLogId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkLogId(), "WORK_LOG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogIdList The collection of workLogId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkLogId_InScope(Collection<Long> workLogIdList) {
        doSetWorkLogId_InScope(workLogIdList);
    }

    protected void doSetWorkLogId_InScope(Collection<Long> workLogIdList) {
        regINS(CK_INS, cTL(workLogIdList), xgetCValueWorkLogId(), "WORK_LOG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_LOG_ID: {NotNull, bigint(19), FK to T_WORK_LOG}
     * @param workLogIdList The collection of workLogId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkLogId_NotInScope(Collection<Long> workLogIdList) {
        doSetWorkLogId_NotInScope(workLogIdList);
    }

    protected void doSetWorkLogId_NotInScope(Collection<Long> workLogIdList) {
        regINS(CK_NINS, cTL(workLogIdList), xgetCValueWorkLogId(), "WORK_LOG_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select WORK_LOG_ID from T_WORK_LOG where ...)} <br />
     * T_WORK_LOG by my WORK_LOG_ID, named 'TWorkLog'.
     * @param subCBLambda The callback for sub-query of TWorkLog for 'in-scope'. (NotNull)
     */
    public void inScopeTWorkLog(SubQuery<TWorkLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TWorkLogCB cb = new TWorkLogCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWorkLogId_InScopeRelation_TWorkLog(cb.query());
        registerInScopeRelation(cb.query(), "WORK_LOG_ID", "WORK_LOG_ID", pp, "tWorkLog", false);
    }
    public abstract String keepWorkLogId_InScopeRelation_TWorkLog(TWorkLogCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select WORK_LOG_ID from T_WORK_LOG where ...)} <br />
     * T_WORK_LOG by my WORK_LOG_ID, named 'TWorkLog'.
     * @param subCBLambda The callback for sub-query of TWorkLog for 'not in-scope'. (NotNull)
     */
    public void notInScopeTWorkLog(SubQuery<TWorkLogCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TWorkLogCB cb = new TWorkLogCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepWorkLogId_NotInScopeRelation_TWorkLog(cb.query());
        registerInScopeRelation(cb.query(), "WORK_LOG_ID", "WORK_LOG_ID", pp, "tWorkLog", true);
    }
    public abstract String keepWorkLogId_NotInScopeRelation_TWorkLog(TWorkLogCQ sq);

    protected void regWorkLogId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkLogId(), "WORK_LOG_ID"); }
    protected abstract ConditionValue xgetCValueWorkLogId();

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
    public HpSLCFunction<TWorkDataCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TWorkDataCB.class);
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
    public HpSLCFunction<TWorkDataCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TWorkDataCB.class);
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
    public HpSLCFunction<TWorkDataCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TWorkDataCB.class);
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
    public HpSLCFunction<TWorkDataCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TWorkDataCB.class);
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
    public HpSLCFunction<TWorkDataCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TWorkDataCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TWorkDataCB&gt;() {
     *     public void query(TWorkDataCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TWorkDataCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TWorkDataCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TWorkDataCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TWorkDataCQ sq);

    protected TWorkDataCB xcreateScalarConditionCB() {
        TWorkDataCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TWorkDataCB xcreateScalarConditionPartitionByCB() {
        TWorkDataCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TWorkDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TWorkDataCB cb = new TWorkDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "WORK_DATA_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TWorkDataCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TWorkDataCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TWorkDataCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TWorkDataCB cb = new TWorkDataCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "WORK_DATA_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TWorkDataCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TWorkDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TWorkDataCB cb = new TWorkDataCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TWorkDataCQ sq);

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
    protected TWorkDataCB newMyCB() {
        return new TWorkDataCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TWorkDataCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
