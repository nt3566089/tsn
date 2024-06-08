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
 * The abstract condition-query of T_TRINVREQUEST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrinvrequestCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrinvrequestCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRINVREQUEST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_Equal(Long trinvrequestId) {
        doSetTrinvrequestId_Equal(trinvrequestId);
    }

    protected void doSetTrinvrequestId_Equal(Long trinvrequestId) {
        regTrinvrequestId(CK_EQ, trinvrequestId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_NotEqual(Long trinvrequestId) {
        doSetTrinvrequestId_NotEqual(trinvrequestId);
    }

    protected void doSetTrinvrequestId_NotEqual(Long trinvrequestId) {
        regTrinvrequestId(CK_NES, trinvrequestId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_GreaterThan(Long trinvrequestId) {
        regTrinvrequestId(CK_GT, trinvrequestId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_LessThan(Long trinvrequestId) {
        regTrinvrequestId(CK_LT, trinvrequestId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_GreaterEqual(Long trinvrequestId) {
        regTrinvrequestId(CK_GE, trinvrequestId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestId The value of trinvrequestId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvrequestId_LessEqual(Long trinvrequestId) {
        regTrinvrequestId(CK_LE, trinvrequestId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trinvrequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trinvrequestId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrinvrequestId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrinvrequestId(), "TRINVREQUEST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestIdList The collection of trinvrequestId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvrequestId_InScope(Collection<Long> trinvrequestIdList) {
        doSetTrinvrequestId_InScope(trinvrequestIdList);
    }

    protected void doSetTrinvrequestId_InScope(Collection<Long> trinvrequestIdList) {
        regINS(CK_INS, cTL(trinvrequestIdList), xgetCValueTrinvrequestId(), "TRINVREQUEST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvrequestIdList The collection of trinvrequestId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvrequestId_NotInScope(Collection<Long> trinvrequestIdList) {
        doSetTrinvrequestId_NotInScope(trinvrequestIdList);
    }

    protected void doSetTrinvrequestId_NotInScope(Collection<Long> trinvrequestIdList) {
        regINS(CK_NINS, cTL(trinvrequestIdList), xgetCValueTrinvrequestId(), "TRINVREQUEST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvrequestId_IsNull() { regTrinvrequestId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRINVREQUEST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvrequestId_IsNotNull() { regTrinvrequestId(CK_ISNN, DOBJ); }

    protected void regTrinvrequestId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrinvrequestId(), "TRINVREQUEST_ID"); }
    protected abstract ConditionValue xgetCValueTrinvrequestId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_Equal(java.math.BigDecimal invinqkey) {
        doSetInvinqkey_Equal(invinqkey);
    }

    protected void doSetInvinqkey_Equal(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_EQ, invinqkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_NotEqual(java.math.BigDecimal invinqkey) {
        doSetInvinqkey_NotEqual(invinqkey);
    }

    protected void doSetInvinqkey_NotEqual(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_NES, invinqkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_GreaterThan(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_GT, invinqkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_LessThan(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_LT, invinqkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_GreaterEqual(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_GE, invinqkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkey The value of invinqkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvinqkey_LessEqual(java.math.BigDecimal invinqkey) {
        regInvinqkey(CK_LE, invinqkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of invinqkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invinqkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvinqkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvinqkey(), "INVINQKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkeyList The collection of invinqkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqkey_InScope(Collection<java.math.BigDecimal> invinqkeyList) {
        doSetInvinqkey_InScope(invinqkeyList);
    }

    protected void doSetInvinqkey_InScope(Collection<java.math.BigDecimal> invinqkeyList) {
        regINS(CK_INS, cTL(invinqkeyList), xgetCValueInvinqkey(), "INVINQKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVINQKEY: {NotNull, decimal(16, 6)}
     * @param invinqkeyList The collection of invinqkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqkey_NotInScope(Collection<java.math.BigDecimal> invinqkeyList) {
        doSetInvinqkey_NotInScope(invinqkeyList);
    }

    protected void doSetInvinqkey_NotInScope(Collection<java.math.BigDecimal> invinqkeyList) {
        regINS(CK_NINS, cTL(invinqkeyList), xgetCValueInvinqkey(), "INVINQKEY");
    }

    protected void regInvinqkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvinqkey(), "INVINQKEY"); }
    protected abstract ConditionValue xgetCValueInvinqkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_Equal(java.math.BigDecimal questlineno) {
        doSetQuestlineno_Equal(questlineno);
    }

    protected void doSetQuestlineno_Equal(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_EQ, questlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_NotEqual(java.math.BigDecimal questlineno) {
        doSetQuestlineno_NotEqual(questlineno);
    }

    protected void doSetQuestlineno_NotEqual(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_NES, questlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_GreaterThan(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_GT, questlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_LessThan(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_LT, questlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_GreaterEqual(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_GE, questlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlineno The value of questlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQuestlineno_LessEqual(java.math.BigDecimal questlineno) {
        regQuestlineno(CK_LE, questlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of questlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of questlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQuestlineno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQuestlineno(), "QUESTLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlinenoList The collection of questlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestlineno_InScope(Collection<java.math.BigDecimal> questlinenoList) {
        doSetQuestlineno_InScope(questlinenoList);
    }

    protected void doSetQuestlineno_InScope(Collection<java.math.BigDecimal> questlinenoList) {
        regINS(CK_INS, cTL(questlinenoList), xgetCValueQuestlineno(), "QUESTLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QUESTLINENO: {NotNull, decimal(16, 6)}
     * @param questlinenoList The collection of questlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQuestlineno_NotInScope(Collection<java.math.BigDecimal> questlinenoList) {
        doSetQuestlineno_NotInScope(questlinenoList);
    }

    protected void doSetQuestlineno_NotInScope(Collection<java.math.BigDecimal> questlinenoList) {
        regINS(CK_NINS, cTL(questlinenoList), xgetCValueQuestlineno(), "QUESTLINENO");
    }

    protected void regQuestlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQuestlineno(), "QUESTLINENO"); }
    protected abstract ConditionValue xgetCValueQuestlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_Equal(String invinqno) {
        doSetInvinqno_Equal(fRES(invinqno));
    }

    protected void doSetInvinqno_Equal(String invinqno) {
        regInvinqno(CK_EQ, invinqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_NotEqual(String invinqno) {
        doSetInvinqno_NotEqual(fRES(invinqno));
    }

    protected void doSetInvinqno_NotEqual(String invinqno) {
        regInvinqno(CK_NES, invinqno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_GreaterThan(String invinqno) {
        regInvinqno(CK_GT, fRES(invinqno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_LessThan(String invinqno) {
        regInvinqno(CK_LT, fRES(invinqno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_GreaterEqual(String invinqno) {
        regInvinqno(CK_GE, fRES(invinqno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_LessEqual(String invinqno) {
        regInvinqno(CK_LE, fRES(invinqno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqnoList The collection of invinqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_InScope(Collection<String> invinqnoList) {
        doSetInvinqno_InScope(invinqnoList);
    }

    protected void doSetInvinqno_InScope(Collection<String> invinqnoList) {
        regINS(CK_INS, cTL(invinqnoList), xgetCValueInvinqno(), "INVINQNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqnoList The collection of invinqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_NotInScope(Collection<String> invinqnoList) {
        doSetInvinqno_NotInScope(invinqnoList);
    }

    protected void doSetInvinqno_NotInScope(Collection<String> invinqnoList) {
        regINS(CK_NINS, cTL(invinqnoList), xgetCValueInvinqno(), "INVINQNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQNO: {varchar(30)} <br>
     * <pre>e.g. setInvinqno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invinqno The value of invinqno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvinqno_LikeSearch(String invinqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invinqno), xgetCValueInvinqno(), "INVINQNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvinqno_NotLikeSearch(String invinqno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invinqno), xgetCValueInvinqno(), "INVINQNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQNO: {varchar(30)}
     * @param invinqno The value of invinqno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqno_PrefixSearch(String invinqno) {
        setInvinqno_LikeSearch(invinqno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     */
    public void setInvinqno_IsNull() { regInvinqno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     */
    public void setInvinqno_IsNullOrEmpty() { regInvinqno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVINQNO: {varchar(30)}
     */
    public void setInvinqno_IsNotNull() { regInvinqno(CK_ISNN, DOBJ); }

    protected void regInvinqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvinqno(), "INVINQNO"); }
    protected abstract ConditionValue xgetCValueInvinqno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_Equal(String invinqdate) {
        doSetInvinqdate_Equal(fRES(invinqdate));
    }

    protected void doSetInvinqdate_Equal(String invinqdate) {
        regInvinqdate(CK_EQ, invinqdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_NotEqual(String invinqdate) {
        doSetInvinqdate_NotEqual(fRES(invinqdate));
    }

    protected void doSetInvinqdate_NotEqual(String invinqdate) {
        regInvinqdate(CK_NES, invinqdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_GreaterThan(String invinqdate) {
        regInvinqdate(CK_GT, fRES(invinqdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_LessThan(String invinqdate) {
        regInvinqdate(CK_LT, fRES(invinqdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_GreaterEqual(String invinqdate) {
        regInvinqdate(CK_GE, fRES(invinqdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_LessEqual(String invinqdate) {
        regInvinqdate(CK_LE, fRES(invinqdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdateList The collection of invinqdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_InScope(Collection<String> invinqdateList) {
        doSetInvinqdate_InScope(invinqdateList);
    }

    protected void doSetInvinqdate_InScope(Collection<String> invinqdateList) {
        regINS(CK_INS, cTL(invinqdateList), xgetCValueInvinqdate(), "INVINQDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdateList The collection of invinqdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_NotInScope(Collection<String> invinqdateList) {
        doSetInvinqdate_NotInScope(invinqdateList);
    }

    protected void doSetInvinqdate_NotInScope(Collection<String> invinqdateList) {
        regINS(CK_NINS, cTL(invinqdateList), xgetCValueInvinqdate(), "INVINQDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQDATE: {IX, varchar(8)} <br>
     * <pre>e.g. setInvinqdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invinqdate The value of invinqdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvinqdate_LikeSearch(String invinqdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invinqdate), xgetCValueInvinqdate(), "INVINQDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvinqdate_NotLikeSearch(String invinqdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invinqdate), xgetCValueInvinqdate(), "INVINQDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     * @param invinqdate The value of invinqdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvinqdate_PrefixSearch(String invinqdate) {
        setInvinqdate_LikeSearch(invinqdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     */
    public void setInvinqdate_IsNull() { regInvinqdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     */
    public void setInvinqdate_IsNullOrEmpty() { regInvinqdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVINQDATE: {IX, varchar(8)}
     */
    public void setInvinqdate_IsNotNull() { regInvinqdate(CK_ISNN, DOBJ); }

    protected void regInvinqdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvinqdate(), "INVINQDATE"); }
    protected abstract ConditionValue xgetCValueInvinqdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_Equal(String companycd) {
        doSetCompanycd_Equal(fRES(companycd));
    }

    protected void doSetCompanycd_Equal(String companycd) {
        regCompanycd(CK_EQ, companycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotEqual(String companycd) {
        doSetCompanycd_NotEqual(fRES(companycd));
    }

    protected void doSetCompanycd_NotEqual(String companycd) {
        regCompanycd(CK_NES, companycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterThan(String companycd) {
        regCompanycd(CK_GT, fRES(companycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessThan(String companycd) {
        regCompanycd(CK_LT, fRES(companycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_GreaterEqual(String companycd) {
        regCompanycd(CK_GE, fRES(companycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_LessEqual(String companycd) {
        regCompanycd(CK_LE, fRES(companycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_InScope(Collection<String> companycdList) {
        doSetCompanycd_InScope(companycdList);
    }

    protected void doSetCompanycd_InScope(Collection<String> companycdList) {
        regINS(CK_INS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycdList The collection of companycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_NotInScope(Collection<String> companycdList) {
        doSetCompanycd_NotInScope(companycdList);
    }

    protected void doSetCompanycd_NotInScope(Collection<String> companycdList) {
        regINS(CK_NINS, cTL(companycdList), xgetCValueCompanycd(), "COMPANYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)} <br>
     * <pre>e.g. setCompanycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companycd The value of companycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanycd_LikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanycd_NotLikeSearch(String companycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companycd), xgetCValueCompanycd(), "COMPANYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYCD: {varchar(30)}
     * @param companycd The value of companycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanycd_PrefixSearch(String companycd) {
        setCompanycd_LikeSearch(companycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNull() { regCompanycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNullOrEmpty() { regCompanycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYCD: {varchar(30)}
     */
    public void setCompanycd_IsNotNull() { regCompanycd(CK_ISNN, DOBJ); }

    protected void regCompanycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanycd(), "COMPANYCD"); }
    protected abstract ConditionValue xgetCValueCompanycd();

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
     * STS: {varchar(30)}
     * @param sts The value of sts as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_Equal(String sts) {
        doSetSts_Equal(fRES(sts));
    }

    protected void doSetSts_Equal(String sts) {
        regSts(CK_EQ, sts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotEqual(String sts) {
        doSetSts_NotEqual(fRES(sts));
    }

    protected void doSetSts_NotEqual(String sts) {
        regSts(CK_NES, sts);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_GreaterThan(String sts) {
        regSts(CK_GT, fRES(sts));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_LessThan(String sts) {
        regSts(CK_LT, fRES(sts));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_GreaterEqual(String sts) {
        regSts(CK_GE, fRES(sts));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_LessEqual(String sts) {
        regSts(CK_LE, fRES(sts));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STS: {varchar(30)}
     * @param stsList The collection of sts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_InScope(Collection<String> stsList) {
        doSetSts_InScope(stsList);
    }

    protected void doSetSts_InScope(Collection<String> stsList) {
        regINS(CK_INS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STS: {varchar(30)}
     * @param stsList The collection of sts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_NotInScope(Collection<String> stsList) {
        doSetSts_NotInScope(stsList);
    }

    protected void doSetSts_NotInScope(Collection<String> stsList) {
        regINS(CK_NINS, cTL(stsList), xgetCValueSts(), "STS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {varchar(30)} <br>
     * <pre>e.g. setSts_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sts The value of sts as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSts_LikeSearch(String sts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sts), xgetCValueSts(), "STS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSts_NotLikeSearch(String sts, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sts), xgetCValueSts(), "STS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STS: {varchar(30)}
     * @param sts The value of sts as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSts_PrefixSearch(String sts) {
        setSts_LikeSearch(sts, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     */
    public void setSts_IsNull() { regSts(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     */
    public void setSts_IsNullOrEmpty() { regSts(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STS: {varchar(30)}
     */
    public void setSts_IsNotNull() { regSts(CK_ISNN, DOBJ); }

    protected void regSts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSts(), "STS"); }
    protected abstract ConditionValue xgetCValueSts();

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
    public HpSLCFunction<TTrinvrequestCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrinvrequestCB.class);
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
    public HpSLCFunction<TTrinvrequestCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrinvrequestCB.class);
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
    public HpSLCFunction<TTrinvrequestCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrinvrequestCB.class);
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
    public HpSLCFunction<TTrinvrequestCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrinvrequestCB.class);
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
    public HpSLCFunction<TTrinvrequestCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrinvrequestCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrinvrequestCB&gt;() {
     *     public void query(TTrinvrequestCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrinvrequestCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrinvrequestCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrinvrequestCQ sq);

    protected TTrinvrequestCB xcreateScalarConditionCB() {
        TTrinvrequestCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrinvrequestCB xcreateScalarConditionPartitionByCB() {
        TTrinvrequestCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrinvrequestCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRINVREQUEST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrinvrequestCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrinvrequestCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrinvrequestCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRINVREQUEST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrinvrequestCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrinvrequestCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvrequestCB cb = new TTrinvrequestCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrinvrequestCQ sq);

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
    protected TTrinvrequestCB newMyCB() {
        return new TTrinvrequestCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrinvrequestCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
