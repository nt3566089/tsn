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
 * The abstract condition-query of T_TRWORK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrworkCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrworkCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRWORK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_Equal(Long sequenceno) {
        doSetSequenceno_Equal(sequenceno);
    }

    protected void doSetSequenceno_Equal(Long sequenceno) {
        regSequenceno(CK_EQ, sequenceno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_NotEqual(Long sequenceno) {
        doSetSequenceno_NotEqual(sequenceno);
    }

    protected void doSetSequenceno_NotEqual(Long sequenceno) {
        regSequenceno(CK_NES, sequenceno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_GreaterThan(Long sequenceno) {
        regSequenceno(CK_GT, sequenceno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_LessThan(Long sequenceno) {
        regSequenceno(CK_LT, sequenceno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_GreaterEqual(Long sequenceno) {
        regSequenceno(CK_GE, sequenceno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequenceno The value of sequenceno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSequenceno_LessEqual(Long sequenceno) {
        regSequenceno(CK_LE, sequenceno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sequenceno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sequenceno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSequenceno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSequenceno(), "SEQUENCENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequencenoList The collection of sequenceno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceno_InScope(Collection<Long> sequencenoList) {
        doSetSequenceno_InScope(sequencenoList);
    }

    protected void doSetSequenceno_InScope(Collection<Long> sequencenoList) {
        regINS(CK_INS, cTL(sequencenoList), xgetCValueSequenceno(), "SEQUENCENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     * @param sequencenoList The collection of sequenceno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSequenceno_NotInScope(Collection<Long> sequencenoList) {
        doSetSequenceno_NotInScope(sequencenoList);
    }

    protected void doSetSequenceno_NotInScope(Collection<Long> sequencenoList) {
        regINS(CK_NINS, cTL(sequencenoList), xgetCValueSequenceno(), "SEQUENCENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSequenceno_IsNull() { regSequenceno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQUENCENO: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSequenceno_IsNotNull() { regSequenceno(CK_ISNN, DOBJ); }

    protected void regSequenceno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSequenceno(), "SEQUENCENO"); }
    protected abstract ConditionValue xgetCValueSequenceno();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_Equal(String usercd) {
        doSetUsercd_Equal(fRES(usercd));
    }

    protected void doSetUsercd_Equal(String usercd) {
        regUsercd(CK_EQ, usercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_NotEqual(String usercd) {
        doSetUsercd_NotEqual(fRES(usercd));
    }

    protected void doSetUsercd_NotEqual(String usercd) {
        regUsercd(CK_NES, usercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_GreaterThan(String usercd) {
        regUsercd(CK_GT, fRES(usercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_LessThan(String usercd) {
        regUsercd(CK_LT, fRES(usercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_GreaterEqual(String usercd) {
        regUsercd(CK_GE, fRES(usercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_LessEqual(String usercd) {
        regUsercd(CK_LE, fRES(usercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercdList The collection of usercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_InScope(Collection<String> usercdList) {
        doSetUsercd_InScope(usercdList);
    }

    protected void doSetUsercd_InScope(Collection<String> usercdList) {
        regINS(CK_INS, cTL(usercdList), xgetCValueUsercd(), "USERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercdList The collection of usercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_NotInScope(Collection<String> usercdList) {
        doSetUsercd_NotInScope(usercdList);
    }

    protected void doSetUsercd_NotInScope(Collection<String> usercdList) {
        regINS(CK_NINS, cTL(usercdList), xgetCValueUsercd(), "USERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setUsercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param usercd The value of usercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUsercd_LikeSearch(String usercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(usercd), xgetCValueUsercd(), "USERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUsercd_NotLikeSearch(String usercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(usercd), xgetCValueUsercd(), "USERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USERCD: {NotNull, varchar(30)}
     * @param usercd The value of usercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsercd_PrefixSearch(String usercd) {
        setUsercd_LikeSearch(usercd, xcLSOPPre());
    }

    protected void regUsercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsercd(), "USERCD"); }
    protected abstract ConditionValue xgetCValueUsercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_Equal(String taskType) {
        doSetTaskType_Equal(fRES(taskType));
    }

    protected void doSetTaskType_Equal(String taskType) {
        regTaskType(CK_EQ, taskType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_NotEqual(String taskType) {
        doSetTaskType_NotEqual(fRES(taskType));
    }

    protected void doSetTaskType_NotEqual(String taskType) {
        regTaskType(CK_NES, taskType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_GreaterThan(String taskType) {
        regTaskType(CK_GT, fRES(taskType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_LessThan(String taskType) {
        regTaskType(CK_LT, fRES(taskType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_GreaterEqual(String taskType) {
        regTaskType(CK_GE, fRES(taskType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_LessEqual(String taskType) {
        regTaskType(CK_LE, fRES(taskType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskTypeList The collection of taskType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_InScope(Collection<String> taskTypeList) {
        doSetTaskType_InScope(taskTypeList);
    }

    protected void doSetTaskType_InScope(Collection<String> taskTypeList) {
        regINS(CK_INS, cTL(taskTypeList), xgetCValueTaskType(), "TASK_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskTypeList The collection of taskType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_NotInScope(Collection<String> taskTypeList) {
        doSetTaskType_NotInScope(taskTypeList);
    }

    protected void doSetTaskType_NotInScope(Collection<String> taskTypeList) {
        regINS(CK_NINS, cTL(taskTypeList), xgetCValueTaskType(), "TASK_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE: {varchar(30)} <br>
     * <pre>e.g. setTaskType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taskType The value of taskType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaskType_LikeSearch(String taskType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taskType), xgetCValueTaskType(), "TASK_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaskType_NotLikeSearch(String taskType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taskType), xgetCValueTaskType(), "TASK_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     * @param taskType The value of taskType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskType_PrefixSearch(String taskType) {
        setTaskType_LikeSearch(taskType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     */
    public void setTaskType_IsNull() { regTaskType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     */
    public void setTaskType_IsNullOrEmpty() { regTaskType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TASK_TYPE: {varchar(30)}
     */
    public void setTaskType_IsNotNull() { regTaskType(CK_ISNN, DOBJ); }

    protected void regTaskType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskType(), "TASK_TYPE"); }
    protected abstract ConditionValue xgetCValueTaskType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_Equal(String taskTypeDetail) {
        doSetTaskTypeDetail_Equal(fRES(taskTypeDetail));
    }

    protected void doSetTaskTypeDetail_Equal(String taskTypeDetail) {
        regTaskTypeDetail(CK_EQ, taskTypeDetail);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_NotEqual(String taskTypeDetail) {
        doSetTaskTypeDetail_NotEqual(fRES(taskTypeDetail));
    }

    protected void doSetTaskTypeDetail_NotEqual(String taskTypeDetail) {
        regTaskTypeDetail(CK_NES, taskTypeDetail);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_GreaterThan(String taskTypeDetail) {
        regTaskTypeDetail(CK_GT, fRES(taskTypeDetail));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_LessThan(String taskTypeDetail) {
        regTaskTypeDetail(CK_LT, fRES(taskTypeDetail));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_GreaterEqual(String taskTypeDetail) {
        regTaskTypeDetail(CK_GE, fRES(taskTypeDetail));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_LessEqual(String taskTypeDetail) {
        regTaskTypeDetail(CK_LE, fRES(taskTypeDetail));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetailList The collection of taskTypeDetail as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_InScope(Collection<String> taskTypeDetailList) {
        doSetTaskTypeDetail_InScope(taskTypeDetailList);
    }

    protected void doSetTaskTypeDetail_InScope(Collection<String> taskTypeDetailList) {
        regINS(CK_INS, cTL(taskTypeDetailList), xgetCValueTaskTypeDetail(), "TASK_TYPE_DETAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetailList The collection of taskTypeDetail as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_NotInScope(Collection<String> taskTypeDetailList) {
        doSetTaskTypeDetail_NotInScope(taskTypeDetailList);
    }

    protected void doSetTaskTypeDetail_NotInScope(Collection<String> taskTypeDetailList) {
        regINS(CK_NINS, cTL(taskTypeDetailList), xgetCValueTaskTypeDetail(), "TASK_TYPE_DETAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)} <br>
     * <pre>e.g. setTaskTypeDetail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param taskTypeDetail The value of taskTypeDetail as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTaskTypeDetail_LikeSearch(String taskTypeDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(taskTypeDetail), xgetCValueTaskTypeDetail(), "TASK_TYPE_DETAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTaskTypeDetail_NotLikeSearch(String taskTypeDetail, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(taskTypeDetail), xgetCValueTaskTypeDetail(), "TASK_TYPE_DETAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     * @param taskTypeDetail The value of taskTypeDetail as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaskTypeDetail_PrefixSearch(String taskTypeDetail) {
        setTaskTypeDetail_LikeSearch(taskTypeDetail, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     */
    public void setTaskTypeDetail_IsNull() { regTaskTypeDetail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     */
    public void setTaskTypeDetail_IsNullOrEmpty() { regTaskTypeDetail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TASK_TYPE_DETAIL: {varchar(30)}
     */
    public void setTaskTypeDetail_IsNotNull() { regTaskTypeDetail(CK_ISNN, DOBJ); }

    protected void regTaskTypeDetail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaskTypeDetail(), "TASK_TYPE_DETAIL"); }
    protected abstract ConditionValue xgetCValueTaskTypeDetail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
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
     * WORK_DT: {varchar(8)}
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
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
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
     * WORK_DT: {varchar(8)}
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
     * WORK_DT: {varchar(8)} <br>
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
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {varchar(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {varchar(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @param worktime The value of worktime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorktime_Equal(java.sql.Timestamp worktime) {
        regWorktime(CK_EQ,  worktime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @param worktime The value of worktime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorktime_GreaterThan(java.sql.Timestamp worktime) {
        regWorktime(CK_GT,  worktime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @param worktime The value of worktime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorktime_LessThan(java.sql.Timestamp worktime) {
        regWorktime(CK_LT,  worktime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @param worktime The value of worktime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorktime_GreaterEqual(java.sql.Timestamp worktime) {
        regWorktime(CK_GE,  worktime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * @param worktime The value of worktime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorktime_LessEqual(java.sql.Timestamp worktime) {
        regWorktime(CK_LE, worktime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * <pre>e.g. setWorktime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of worktime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of worktime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setWorktime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueWorktime(), "WORKTIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKTIME: {NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of worktime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of worktime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setWorktime_DateFromTo(Date fromDate, Date toDate) {
        setWorktime_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regWorktime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorktime(), "WORKTIME"); }
    protected abstract ConditionValue xgetCValueWorktime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_Equal(String startEnd) {
        doSetStartEnd_Equal(fRES(startEnd));
    }

    protected void doSetStartEnd_Equal(String startEnd) {
        regStartEnd(CK_EQ, startEnd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_NotEqual(String startEnd) {
        doSetStartEnd_NotEqual(fRES(startEnd));
    }

    protected void doSetStartEnd_NotEqual(String startEnd) {
        regStartEnd(CK_NES, startEnd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_GreaterThan(String startEnd) {
        regStartEnd(CK_GT, fRES(startEnd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_LessThan(String startEnd) {
        regStartEnd(CK_LT, fRES(startEnd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_GreaterEqual(String startEnd) {
        regStartEnd(CK_GE, fRES(startEnd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_LessEqual(String startEnd) {
        regStartEnd(CK_LE, fRES(startEnd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEndList The collection of startEnd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_InScope(Collection<String> startEndList) {
        doSetStartEnd_InScope(startEndList);
    }

    protected void doSetStartEnd_InScope(Collection<String> startEndList) {
        regINS(CK_INS, cTL(startEndList), xgetCValueStartEnd(), "START_END");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEndList The collection of startEnd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_NotInScope(Collection<String> startEndList) {
        doSetStartEnd_NotInScope(startEndList);
    }

    protected void doSetStartEnd_NotInScope(Collection<String> startEndList) {
        regINS(CK_NINS, cTL(startEndList), xgetCValueStartEnd(), "START_END");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * START_END: {varchar(30)} <br>
     * <pre>e.g. setStartEnd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param startEnd The value of startEnd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStartEnd_LikeSearch(String startEnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(startEnd), xgetCValueStartEnd(), "START_END", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStartEnd_NotLikeSearch(String startEnd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(startEnd), xgetCValueStartEnd(), "START_END", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * START_END: {varchar(30)}
     * @param startEnd The value of startEnd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStartEnd_PrefixSearch(String startEnd) {
        setStartEnd_LikeSearch(startEnd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     */
    public void setStartEnd_IsNull() { regStartEnd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     */
    public void setStartEnd_IsNullOrEmpty() { regStartEnd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * START_END: {varchar(30)}
     */
    public void setStartEnd_IsNotNull() { regStartEnd(CK_ISNN, DOBJ); }

    protected void regStartEnd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStartEnd(), "START_END"); }
    protected abstract ConditionValue xgetCValueStartEnd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_Equal(Long workPalletQty) {
        doSetWorkPalletQty_Equal(workPalletQty);
    }

    protected void doSetWorkPalletQty_Equal(Long workPalletQty) {
        regWorkPalletQty(CK_EQ, workPalletQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_NotEqual(Long workPalletQty) {
        doSetWorkPalletQty_NotEqual(workPalletQty);
    }

    protected void doSetWorkPalletQty_NotEqual(Long workPalletQty) {
        regWorkPalletQty(CK_NES, workPalletQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_GreaterThan(Long workPalletQty) {
        regWorkPalletQty(CK_GT, workPalletQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_LessThan(Long workPalletQty) {
        regWorkPalletQty(CK_LT, workPalletQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_GreaterEqual(Long workPalletQty) {
        regWorkPalletQty(CK_GE, workPalletQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQty The value of workPalletQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkPalletQty_LessEqual(Long workPalletQty) {
        regWorkPalletQty(CK_LE, workPalletQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param minNumber The min number of workPalletQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workPalletQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkPalletQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkPalletQty(), "WORK_PALLET_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQtyList The collection of workPalletQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkPalletQty_InScope(Collection<Long> workPalletQtyList) {
        doSetWorkPalletQty_InScope(workPalletQtyList);
    }

    protected void doSetWorkPalletQty_InScope(Collection<Long> workPalletQtyList) {
        regINS(CK_INS, cTL(workPalletQtyList), xgetCValueWorkPalletQty(), "WORK_PALLET_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     * @param workPalletQtyList The collection of workPalletQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkPalletQty_NotInScope(Collection<Long> workPalletQtyList) {
        doSetWorkPalletQty_NotInScope(workPalletQtyList);
    }

    protected void doSetWorkPalletQty_NotInScope(Collection<Long> workPalletQtyList) {
        regINS(CK_NINS, cTL(workPalletQtyList), xgetCValueWorkPalletQty(), "WORK_PALLET_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     */
    public void setWorkPalletQty_IsNull() { regWorkPalletQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_PALLET_QTY: {bigint(19)}
     */
    public void setWorkPalletQty_IsNotNull() { regWorkPalletQty(CK_ISNN, DOBJ); }

    protected void regWorkPalletQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkPalletQty(), "WORK_PALLET_QTY"); }
    protected abstract ConditionValue xgetCValueWorkPalletQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_Equal(Long workCaseQty) {
        doSetWorkCaseQty_Equal(workCaseQty);
    }

    protected void doSetWorkCaseQty_Equal(Long workCaseQty) {
        regWorkCaseQty(CK_EQ, workCaseQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_NotEqual(Long workCaseQty) {
        doSetWorkCaseQty_NotEqual(workCaseQty);
    }

    protected void doSetWorkCaseQty_NotEqual(Long workCaseQty) {
        regWorkCaseQty(CK_NES, workCaseQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_GreaterThan(Long workCaseQty) {
        regWorkCaseQty(CK_GT, workCaseQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_LessThan(Long workCaseQty) {
        regWorkCaseQty(CK_LT, workCaseQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_GreaterEqual(Long workCaseQty) {
        regWorkCaseQty(CK_GE, workCaseQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQty The value of workCaseQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCaseQty_LessEqual(Long workCaseQty) {
        regWorkCaseQty(CK_LE, workCaseQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param minNumber The min number of workCaseQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workCaseQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkCaseQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkCaseQty(), "WORK_CASE_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQtyList The collection of workCaseQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCaseQty_InScope(Collection<Long> workCaseQtyList) {
        doSetWorkCaseQty_InScope(workCaseQtyList);
    }

    protected void doSetWorkCaseQty_InScope(Collection<Long> workCaseQtyList) {
        regINS(CK_INS, cTL(workCaseQtyList), xgetCValueWorkCaseQty(), "WORK_CASE_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     * @param workCaseQtyList The collection of workCaseQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCaseQty_NotInScope(Collection<Long> workCaseQtyList) {
        doSetWorkCaseQty_NotInScope(workCaseQtyList);
    }

    protected void doSetWorkCaseQty_NotInScope(Collection<Long> workCaseQtyList) {
        regINS(CK_NINS, cTL(workCaseQtyList), xgetCValueWorkCaseQty(), "WORK_CASE_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     */
    public void setWorkCaseQty_IsNull() { regWorkCaseQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_CASE_QTY: {bigint(19)}
     */
    public void setWorkCaseQty_IsNotNull() { regWorkCaseQty(CK_ISNN, DOBJ); }

    protected void regWorkCaseQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkCaseQty(), "WORK_CASE_QTY"); }
    protected abstract ConditionValue xgetCValueWorkCaseQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_Equal(Long workCartonQty) {
        doSetWorkCartonQty_Equal(workCartonQty);
    }

    protected void doSetWorkCartonQty_Equal(Long workCartonQty) {
        regWorkCartonQty(CK_EQ, workCartonQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_NotEqual(Long workCartonQty) {
        doSetWorkCartonQty_NotEqual(workCartonQty);
    }

    protected void doSetWorkCartonQty_NotEqual(Long workCartonQty) {
        regWorkCartonQty(CK_NES, workCartonQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_GreaterThan(Long workCartonQty) {
        regWorkCartonQty(CK_GT, workCartonQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_LessThan(Long workCartonQty) {
        regWorkCartonQty(CK_LT, workCartonQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_GreaterEqual(Long workCartonQty) {
        regWorkCartonQty(CK_GE, workCartonQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQty The value of workCartonQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkCartonQty_LessEqual(Long workCartonQty) {
        regWorkCartonQty(CK_LE, workCartonQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param minNumber The min number of workCartonQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workCartonQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkCartonQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkCartonQty(), "WORK_CARTON_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQtyList The collection of workCartonQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCartonQty_InScope(Collection<Long> workCartonQtyList) {
        doSetWorkCartonQty_InScope(workCartonQtyList);
    }

    protected void doSetWorkCartonQty_InScope(Collection<Long> workCartonQtyList) {
        regINS(CK_INS, cTL(workCartonQtyList), xgetCValueWorkCartonQty(), "WORK_CARTON_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     * @param workCartonQtyList The collection of workCartonQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkCartonQty_NotInScope(Collection<Long> workCartonQtyList) {
        doSetWorkCartonQty_NotInScope(workCartonQtyList);
    }

    protected void doSetWorkCartonQty_NotInScope(Collection<Long> workCartonQtyList) {
        regINS(CK_NINS, cTL(workCartonQtyList), xgetCValueWorkCartonQty(), "WORK_CARTON_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     */
    public void setWorkCartonQty_IsNull() { regWorkCartonQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_CARTON_QTY: {bigint(19)}
     */
    public void setWorkCartonQty_IsNotNull() { regWorkCartonQty(CK_ISNN, DOBJ); }

    protected void regWorkCartonQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkCartonQty(), "WORK_CARTON_QTY"); }
    protected abstract ConditionValue xgetCValueWorkCartonQty();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_Equal(Long workQty) {
        doSetWorkQty_Equal(workQty);
    }

    protected void doSetWorkQty_Equal(Long workQty) {
        regWorkQty(CK_EQ, workQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_NotEqual(Long workQty) {
        doSetWorkQty_NotEqual(workQty);
    }

    protected void doSetWorkQty_NotEqual(Long workQty) {
        regWorkQty(CK_NES, workQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_GreaterThan(Long workQty) {
        regWorkQty(CK_GT, workQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_LessThan(Long workQty) {
        regWorkQty(CK_LT, workQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_GreaterEqual(Long workQty) {
        regWorkQty(CK_GE, workQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQty The value of workQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkQty_LessEqual(Long workQty) {
        regWorkQty(CK_LE, workQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param minNumber The min number of workQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkQty_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkQty(), "WORK_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQtyList The collection of workQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkQty_InScope(Collection<Long> workQtyList) {
        doSetWorkQty_InScope(workQtyList);
    }

    protected void doSetWorkQty_InScope(Collection<Long> workQtyList) {
        regINS(CK_INS, cTL(workQtyList), xgetCValueWorkQty(), "WORK_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_QTY: {bigint(19)}
     * @param workQtyList The collection of workQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkQty_NotInScope(Collection<Long> workQtyList) {
        doSetWorkQty_NotInScope(workQtyList);
    }

    protected void doSetWorkQty_NotInScope(Collection<Long> workQtyList) {
        regINS(CK_NINS, cTL(workQtyList), xgetCValueWorkQty(), "WORK_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     */
    public void setWorkQty_IsNull() { regWorkQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_QTY: {bigint(19)}
     */
    public void setWorkQty_IsNotNull() { regWorkQty(CK_ISNN, DOBJ); }

    protected void regWorkQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkQty(), "WORK_QTY"); }
    protected abstract ConditionValue xgetCValueWorkQty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_Equal(String errcd) {
        doSetErrcd_Equal(fRES(errcd));
    }

    protected void doSetErrcd_Equal(String errcd) {
        regErrcd(CK_EQ, errcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_NotEqual(String errcd) {
        doSetErrcd_NotEqual(fRES(errcd));
    }

    protected void doSetErrcd_NotEqual(String errcd) {
        regErrcd(CK_NES, errcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_GreaterThan(String errcd) {
        regErrcd(CK_GT, fRES(errcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_LessThan(String errcd) {
        regErrcd(CK_LT, fRES(errcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_GreaterEqual(String errcd) {
        regErrcd(CK_GE, fRES(errcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_LessEqual(String errcd) {
        regErrcd(CK_LE, fRES(errcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcdList The collection of errcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_InScope(Collection<String> errcdList) {
        doSetErrcd_InScope(errcdList);
    }

    protected void doSetErrcd_InScope(Collection<String> errcdList) {
        regINS(CK_INS, cTL(errcdList), xgetCValueErrcd(), "ERRCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcdList The collection of errcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_NotInScope(Collection<String> errcdList) {
        doSetErrcd_NotInScope(errcdList);
    }

    protected void doSetErrcd_NotInScope(Collection<String> errcdList) {
        regINS(CK_NINS, cTL(errcdList), xgetCValueErrcd(), "ERRCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERRCD: {varchar(30)} <br>
     * <pre>e.g. setErrcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errcd The value of errcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrcd_LikeSearch(String errcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errcd), xgetCValueErrcd(), "ERRCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrcd_NotLikeSearch(String errcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errcd), xgetCValueErrcd(), "ERRCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERRCD: {varchar(30)}
     * @param errcd The value of errcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrcd_PrefixSearch(String errcd) {
        setErrcd_LikeSearch(errcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     */
    public void setErrcd_IsNull() { regErrcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     */
    public void setErrcd_IsNullOrEmpty() { regErrcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERRCD: {varchar(30)}
     */
    public void setErrcd_IsNotNull() { regErrcd(CK_ISNN, DOBJ); }

    protected void regErrcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrcd(), "ERRCD"); }
    protected abstract ConditionValue xgetCValueErrcd();

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
    public HpSLCFunction<TTrworkCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrworkCB.class);
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
    public HpSLCFunction<TTrworkCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrworkCB.class);
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
    public HpSLCFunction<TTrworkCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrworkCB.class);
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
    public HpSLCFunction<TTrworkCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrworkCB.class);
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
    public HpSLCFunction<TTrworkCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrworkCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrworkCB&gt;() {
     *     public void query(TTrworkCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrworkCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrworkCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrworkCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrworkCQ sq);

    protected TTrworkCB xcreateScalarConditionCB() {
        TTrworkCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrworkCB xcreateScalarConditionPartitionByCB() {
        TTrworkCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrworkCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrworkCB cb = new TTrworkCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SEQUENCENO";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrworkCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrworkCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrworkCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrworkCB cb = new TTrworkCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SEQUENCENO";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrworkCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrworkCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrworkCB cb = new TTrworkCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrworkCQ sq);

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
    protected TTrworkCB newMyCB() {
        return new TTrworkCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrworkCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
