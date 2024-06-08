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
 * The abstract condition-query of B_MESSAGE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsBMessageCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsBMessageCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "B_MESSAGE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_Equal(Long messageId) {
        doSetMessageId_Equal(messageId);
    }

    protected void doSetMessageId_Equal(Long messageId) {
        regMessageId(CK_EQ, messageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_NotEqual(Long messageId) {
        doSetMessageId_NotEqual(messageId);
    }

    protected void doSetMessageId_NotEqual(Long messageId) {
        regMessageId(CK_NES, messageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_GreaterThan(Long messageId) {
        regMessageId(CK_GT, messageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_LessThan(Long messageId) {
        regMessageId(CK_LT, messageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_GreaterEqual(Long messageId) {
        regMessageId(CK_GE, messageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageId The value of messageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageId_LessEqual(Long messageId) {
        regMessageId(CK_LE, messageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of messageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMessageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMessageId(), "MESSAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageIdList The collection of messageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageId_InScope(Collection<Long> messageIdList) {
        doSetMessageId_InScope(messageIdList);
    }

    protected void doSetMessageId_InScope(Collection<Long> messageIdList) {
        regINS(CK_INS, cTL(messageIdList), xgetCValueMessageId(), "MESSAGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param messageIdList The collection of messageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageId_NotInScope(Collection<Long> messageIdList) {
        doSetMessageId_NotInScope(messageIdList);
    }

    protected void doSetMessageId_NotInScope(Collection<Long> messageIdList) {
        regINS(CK_NINS, cTL(messageIdList), xgetCValueMessageId(), "MESSAGE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select MESSAGE_ID from M_HT_MESSAGE where ...)} <br>
     * M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMHtMessageAsOne</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MHtMessageAsOne for 'exists'. (NotNull)
     */
    public void existsMHtMessageAsOne(SubQuery<MHtMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MHtMessageCB cb = new MHtMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_ExistsReferrer_MHtMessageAsOne(cb.query());
        registerExistsReferrer(cb.query(), "MESSAGE_ID", "MESSAGE_ID", pp, "mHtMessageAsOne");
    }
    public abstract String keepMessageId_ExistsReferrer_MHtMessageAsOne(MHtMessageCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select MESSAGE_ID from M_HT_MESSAGE where ...)} <br>
     * M_HT_MESSAGE by MESSAGE_ID, named 'MHtMessageAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMHtMessageAsOne</span>(messageCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     messageCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MessageId_NotExistsReferrer_MHtMessageAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMHtMessageAsOne(SubQuery<MHtMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MHtMessageCB cb = new MHtMessageCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMessageId_NotExistsReferrer_MHtMessageAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "MESSAGE_ID", "MESSAGE_ID", pp, "mHtMessageAsOne");
    }
    public abstract String keepMessageId_NotExistsReferrer_MHtMessageAsOne(MHtMessageCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMessageId_IsNull() { regMessageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setMessageId_IsNotNull() { regMessageId(CK_ISNN, DOBJ); }

    protected void regMessageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageId(), "MESSAGE_ID"); }
    protected abstract ConditionValue xgetCValueMessageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_Equal(String messageCd) {
        doSetMessageCd_Equal(fRES(messageCd));
    }

    protected void doSetMessageCd_Equal(String messageCd) {
        regMessageCd(CK_EQ, messageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_NotEqual(String messageCd) {
        doSetMessageCd_NotEqual(fRES(messageCd));
    }

    protected void doSetMessageCd_NotEqual(String messageCd) {
        regMessageCd(CK_NES, messageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_GreaterThan(String messageCd) {
        regMessageCd(CK_GT, fRES(messageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_LessThan(String messageCd) {
        regMessageCd(CK_LT, fRES(messageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_GreaterEqual(String messageCd) {
        regMessageCd(CK_GE, fRES(messageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_LessEqual(String messageCd) {
        regMessageCd(CK_LE, fRES(messageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCdList The collection of messageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_InScope(Collection<String> messageCdList) {
        doSetMessageCd_InScope(messageCdList);
    }

    protected void doSetMessageCd_InScope(Collection<String> messageCdList) {
        regINS(CK_INS, cTL(messageCdList), xgetCValueMessageCd(), "MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCdList The collection of messageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_NotInScope(Collection<String> messageCdList) {
        doSetMessageCd_NotInScope(messageCdList);
    }

    protected void doSetMessageCd_NotInScope(Collection<String> messageCdList) {
        regINS(CK_NINS, cTL(messageCdList), xgetCValueMessageCd(), "MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)} <br>
     * <pre>e.g. setMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageCd The value of messageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageCd_LikeSearch(String messageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageCd), xgetCValueMessageCd(), "MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageCd_NotLikeSearch(String messageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageCd), xgetCValueMessageCd(), "MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     * @param messageCd The value of messageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageCd_PrefixSearch(String messageCd) {
        setMessageCd_LikeSearch(messageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     */
    public void setMessageCd_IsNull() { regMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     */
    public void setMessageCd_IsNullOrEmpty() { regMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_CD: {UQ+, varchar(100)}
     */
    public void setMessageCd_IsNotNull() { regMessageCd(CK_ISNN, DOBJ); }

    protected void regMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageCd(), "MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_Equal(String messageNm) {
        doSetMessageNm_Equal(fRES(messageNm));
    }

    protected void doSetMessageNm_Equal(String messageNm) {
        regMessageNm(CK_EQ, messageNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_NotEqual(String messageNm) {
        doSetMessageNm_NotEqual(fRES(messageNm));
    }

    protected void doSetMessageNm_NotEqual(String messageNm) {
        regMessageNm(CK_NES, messageNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_GreaterThan(String messageNm) {
        regMessageNm(CK_GT, fRES(messageNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_LessThan(String messageNm) {
        regMessageNm(CK_LT, fRES(messageNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_GreaterEqual(String messageNm) {
        regMessageNm(CK_GE, fRES(messageNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_LessEqual(String messageNm) {
        regMessageNm(CK_LE, fRES(messageNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNmList The collection of messageNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_InScope(Collection<String> messageNmList) {
        doSetMessageNm_InScope(messageNmList);
    }

    protected void doSetMessageNm_InScope(Collection<String> messageNmList) {
        regINS(CK_INS, cTL(messageNmList), xgetCValueMessageNm(), "MESSAGE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNmList The collection of messageNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_NotInScope(Collection<String> messageNmList) {
        doSetMessageNm_NotInScope(messageNmList);
    }

    protected void doSetMessageNm_NotInScope(Collection<String> messageNmList) {
        regINS(CK_NINS, cTL(messageNmList), xgetCValueMessageNm(), "MESSAGE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_NM: {varchar(4000)} <br>
     * <pre>e.g. setMessageNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageNm The value of messageNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageNm_LikeSearch(String messageNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageNm), xgetCValueMessageNm(), "MESSAGE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageNm_NotLikeSearch(String messageNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageNm), xgetCValueMessageNm(), "MESSAGE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     * @param messageNm The value of messageNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageNm_PrefixSearch(String messageNm) {
        setMessageNm_LikeSearch(messageNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     */
    public void setMessageNm_IsNull() { regMessageNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     */
    public void setMessageNm_IsNullOrEmpty() { regMessageNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_NM: {varchar(4000)}
     */
    public void setMessageNm_IsNotNull() { regMessageNm(CK_ISNN, DOBJ); }

    protected void regMessageNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageNm(), "MESSAGE_NM"); }
    protected abstract ConditionValue xgetCValueMessageNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_Equal(String messageAbbr) {
        doSetMessageAbbr_Equal(fRES(messageAbbr));
    }

    protected void doSetMessageAbbr_Equal(String messageAbbr) {
        regMessageAbbr(CK_EQ, messageAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_NotEqual(String messageAbbr) {
        doSetMessageAbbr_NotEqual(fRES(messageAbbr));
    }

    protected void doSetMessageAbbr_NotEqual(String messageAbbr) {
        regMessageAbbr(CK_NES, messageAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_GreaterThan(String messageAbbr) {
        regMessageAbbr(CK_GT, fRES(messageAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_LessThan(String messageAbbr) {
        regMessageAbbr(CK_LT, fRES(messageAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_GreaterEqual(String messageAbbr) {
        regMessageAbbr(CK_GE, fRES(messageAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_LessEqual(String messageAbbr) {
        regMessageAbbr(CK_LE, fRES(messageAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbrList The collection of messageAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_InScope(Collection<String> messageAbbrList) {
        doSetMessageAbbr_InScope(messageAbbrList);
    }

    protected void doSetMessageAbbr_InScope(Collection<String> messageAbbrList) {
        regINS(CK_INS, cTL(messageAbbrList), xgetCValueMessageAbbr(), "MESSAGE_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbrList The collection of messageAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_NotInScope(Collection<String> messageAbbrList) {
        doSetMessageAbbr_NotInScope(messageAbbrList);
    }

    protected void doSetMessageAbbr_NotInScope(Collection<String> messageAbbrList) {
        regINS(CK_NINS, cTL(messageAbbrList), xgetCValueMessageAbbr(), "MESSAGE_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)} <br>
     * <pre>e.g. setMessageAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param messageAbbr The value of messageAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMessageAbbr_LikeSearch(String messageAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(messageAbbr), xgetCValueMessageAbbr(), "MESSAGE_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMessageAbbr_NotLikeSearch(String messageAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(messageAbbr), xgetCValueMessageAbbr(), "MESSAGE_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     * @param messageAbbr The value of messageAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageAbbr_PrefixSearch(String messageAbbr) {
        setMessageAbbr_LikeSearch(messageAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     */
    public void setMessageAbbr_IsNull() { regMessageAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     */
    public void setMessageAbbr_IsNullOrEmpty() { regMessageAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_ABBR: {varchar(4000)}
     */
    public void setMessageAbbr_IsNotNull() { regMessageAbbr(CK_ISNN, DOBJ); }

    protected void regMessageAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageAbbr(), "MESSAGE_ABBR"); }
    protected abstract ConditionValue xgetCValueMessageAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @param messageType The value of messageType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_Equal(String messageType) {
        doSetMessageType_Equal(fRES(messageType));
    }

    /**
     * Equal(=). As MessageType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageType_Equal_AsMessageType(CDef.MessageType cdef) {
        doSetMessageType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $confirm (confirm). And OnlyOnceRegistered. <br>
     * $confirm: 確認
     */
    public void setMessageType_Equal_$confirm() {
        setMessageType_Equal_AsMessageType(CDef.MessageType.$confirm);
    }

    /**
     * Equal(=). As $error (error). And OnlyOnceRegistered. <br>
     * $error: エラー
     */
    public void setMessageType_Equal_$error() {
        setMessageType_Equal_AsMessageType(CDef.MessageType.$error);
    }

    /**
     * Equal(=). As $info (info). And OnlyOnceRegistered. <br>
     * $info: 情報
     */
    public void setMessageType_Equal_$info() {
        setMessageType_Equal_AsMessageType(CDef.MessageType.$info);
    }

    /**
     * Equal(=). As $warn (warn). And OnlyOnceRegistered. <br>
     * $warn: 警告
     */
    public void setMessageType_Equal_$warn() {
        setMessageType_Equal_AsMessageType(CDef.MessageType.$warn);
    }

    protected void doSetMessageType_Equal(String messageType) {
        regMessageType(CK_EQ, messageType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @param messageType The value of messageType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_NotEqual(String messageType) {
        doSetMessageType_NotEqual(fRES(messageType));
    }

    /**
     * NotEqual(&lt;&gt;). As MessageType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMessageType_NotEqual_AsMessageType(CDef.MessageType cdef) {
        doSetMessageType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $confirm (confirm). And OnlyOnceRegistered. <br>
     * $confirm: 確認
     */
    public void setMessageType_NotEqual_$confirm() {
        setMessageType_NotEqual_AsMessageType(CDef.MessageType.$confirm);
    }

    /**
     * NotEqual(&lt;&gt;). As $error (error). And OnlyOnceRegistered. <br>
     * $error: エラー
     */
    public void setMessageType_NotEqual_$error() {
        setMessageType_NotEqual_AsMessageType(CDef.MessageType.$error);
    }

    /**
     * NotEqual(&lt;&gt;). As $info (info). And OnlyOnceRegistered. <br>
     * $info: 情報
     */
    public void setMessageType_NotEqual_$info() {
        setMessageType_NotEqual_AsMessageType(CDef.MessageType.$info);
    }

    /**
     * NotEqual(&lt;&gt;). As $warn (warn). And OnlyOnceRegistered. <br>
     * $warn: 警告
     */
    public void setMessageType_NotEqual_$warn() {
        setMessageType_NotEqual_AsMessageType(CDef.MessageType.$warn);
    }

    protected void doSetMessageType_NotEqual(String messageType) {
        regMessageType(CK_NES, messageType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @param messageTypeList The collection of messageType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_InScope(Collection<String> messageTypeList) {
        doSetMessageType_InScope(messageTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As MessageType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_InScope_AsMessageType(Collection<CDef.MessageType> cdefList) {
        doSetMessageType_InScope(cTStrL(cdefList));
    }

    protected void doSetMessageType_InScope(Collection<String> messageTypeList) {
        regINS(CK_INS, cTL(messageTypeList), xgetCValueMessageType(), "MESSAGE_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     * @param messageTypeList The collection of messageType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_NotInScope(Collection<String> messageTypeList) {
        doSetMessageType_NotInScope(messageTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As MessageType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType} <br>
     * 属性
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMessageType_NotInScope_AsMessageType(Collection<CDef.MessageType> cdefList) {
        doSetMessageType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMessageType_NotInScope(Collection<String> messageTypeList) {
        regINS(CK_NINS, cTL(messageTypeList), xgetCValueMessageType(), "MESSAGE_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     */
    public void setMessageType_IsNull() { regMessageType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     */
    public void setMessageType_IsNullOrEmpty() { regMessageType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MESSAGE_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=MessageType}
     */
    public void setMessageType_IsNotNull() { regMessageType(CK_ISNN, DOBJ); }

    protected void regMessageType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMessageType(), "MESSAGE_TYPE"); }
    protected abstract ConditionValue xgetCValueMessageType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemType The value of systemType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_Equal(String systemType) {
        doSetSystemType_Equal(fRES(systemType));
    }

    /**
     * Equal(=). As SystemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemType_Equal_AsSystemType(CDef.SystemType cdef) {
        doSetSystemType_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $base (base). And OnlyOnceRegistered. <br>
     * $base: 基盤
     */
    public void setSystemType_Equal_$base() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$base);
    }

    /**
     * Equal(=). As $wms (wms). And OnlyOnceRegistered. <br>
     * $wms: WMS
     */
    public void setSystemType_Equal_$wms() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$wms);
    }

    /**
     * Equal(=). As $tsn (tsn). And OnlyOnceRegistered. <br>
     * $tsn: tsn
     */
    public void setSystemType_Equal_$tsn() {
        setSystemType_Equal_AsSystemType(CDef.SystemType.$tsn);
    }

    protected void doSetSystemType_Equal(String systemType) {
        regSystemType(CK_EQ, systemType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemType The value of systemType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual(String systemType) {
        doSetSystemType_NotEqual(fRES(systemType));
    }

    /**
     * NotEqual(&lt;&gt;). As SystemType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSystemType_NotEqual_AsSystemType(CDef.SystemType cdef) {
        doSetSystemType_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $base (base). And OnlyOnceRegistered. <br>
     * $base: 基盤
     */
    public void setSystemType_NotEqual_$base() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$base);
    }

    /**
     * NotEqual(&lt;&gt;). As $wms (wms). And OnlyOnceRegistered. <br>
     * $wms: WMS
     */
    public void setSystemType_NotEqual_$wms() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$wms);
    }

    /**
     * NotEqual(&lt;&gt;). As $tsn (tsn). And OnlyOnceRegistered. <br>
     * $tsn: tsn
     */
    public void setSystemType_NotEqual_$tsn() {
        setSystemType_NotEqual_AsSystemType(CDef.SystemType.$tsn);
    }

    protected void doSetSystemType_NotEqual(String systemType) {
        regSystemType(CK_NES, systemType);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemTypeList The collection of systemType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope(Collection<String> systemTypeList) {
        doSetSystemType_InScope(systemTypeList);
    }

    /**
     * InScope {in ('a', 'b')}. As SystemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_InScope_AsSystemType(Collection<CDef.SystemType> cdefList) {
        doSetSystemType_InScope(cTStrL(cdefList));
    }

    protected void doSetSystemType_InScope(Collection<String> systemTypeList) {
        regINS(CK_INS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     * @param systemTypeList The collection of systemType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope(Collection<String> systemTypeList) {
        doSetSystemType_NotInScope(systemTypeList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As SystemType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType} <br>
     * システム種別
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSystemType_NotInScope_AsSystemType(Collection<CDef.SystemType> cdefList) {
        doSetSystemType_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSystemType_NotInScope(Collection<String> systemTypeList) {
        regINS(CK_NINS, cTL(systemTypeList), xgetCValueSystemType(), "SYSTEM_TYPE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNull() { regSystemType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNullOrEmpty() { regSystemType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSTEM_TYPE: {varchar(30), FK to B_CLASS_DTL, classification=SystemType}
     */
    public void setSystemType_IsNotNull() { regSystemType(CK_ISNN, DOBJ); }

    protected void regSystemType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSystemType(), "SYSTEM_TYPE"); }
    protected abstract ConditionValue xgetCValueSystemType();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_Equal(Long cultureId) {
        doSetCultureId_Equal(cultureId);
    }

    protected void doSetCultureId_Equal(Long cultureId) {
        regCultureId(CK_EQ, cultureId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_NotEqual(Long cultureId) {
        doSetCultureId_NotEqual(cultureId);
    }

    protected void doSetCultureId_NotEqual(Long cultureId) {
        regCultureId(CK_NES, cultureId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterThan(Long cultureId) {
        regCultureId(CK_GT, cultureId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessThan(Long cultureId) {
        regCultureId(CK_LT, cultureId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_GreaterEqual(Long cultureId) {
        regCultureId(CK_GE, cultureId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureId The value of cultureId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCultureId_LessEqual(Long cultureId) {
        regCultureId(CK_LE, cultureId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param minNumber The min number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cultureId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCultureId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCultureId(), "CULTURE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_InScope(Collection<Long> cultureIdList) {
        doSetCultureId_InScope(cultureIdList);
    }

    protected void doSetCultureId_InScope(Collection<Long> cultureIdList) {
        regINS(CK_INS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CULTURE_ID: {+UQ, IX, NotNull, bigint(19), FK to B_CULTURE}
     * @param cultureIdList The collection of cultureId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCultureId_NotInScope(Collection<Long> cultureIdList) {
        doSetCultureId_NotInScope(cultureIdList);
    }

    protected void doSetCultureId_NotInScope(Collection<Long> cultureIdList) {
        regINS(CK_NINS, cTL(cultureIdList), xgetCValueCultureId(), "CULTURE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'in-scope'. (NotNull)
     */
    public void inScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_InScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", false);
    }
    public abstract String keepCultureId_InScopeRelation_BCulture(BCultureCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CULTURE_ID from B_CULTURE where ...)} <br />
     * B_CULTURE by my CULTURE_ID, named 'BCulture'.
     * @param subCBLambda The callback for sub-query of BCulture for 'not in-scope'. (NotNull)
     */
    public void notInScopeBCulture(SubQuery<BCultureCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BCultureCB cb = new BCultureCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCultureId_NotInScopeRelation_BCulture(cb.query());
        registerInScopeRelation(cb.query(), "CULTURE_ID", "CULTURE_ID", pp, "bCulture", true);
    }
    public abstract String keepCultureId_NotInScopeRelation_BCulture(BCultureCQ sq);

    protected void regCultureId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCultureId(), "CULTURE_ID"); }
    protected abstract ConditionValue xgetCValueCultureId();

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
    public HpSLCFunction<BMessageCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, BMessageCB.class);
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
    public HpSLCFunction<BMessageCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, BMessageCB.class);
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
    public HpSLCFunction<BMessageCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, BMessageCB.class);
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
    public HpSLCFunction<BMessageCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, BMessageCB.class);
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
    public HpSLCFunction<BMessageCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, BMessageCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;BMessageCB&gt;() {
     *     public void query(BMessageCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<BMessageCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, BMessageCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        BMessageCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(BMessageCQ sq);

    protected BMessageCB xcreateScalarConditionCB() {
        BMessageCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected BMessageCB xcreateScalarConditionPartitionByCB() {
        BMessageCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<BMessageCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMessageCB cb = new BMessageCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "MESSAGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(BMessageCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<BMessageCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(BMessageCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        BMessageCB cb = new BMessageCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "MESSAGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(BMessageCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<BMessageCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BMessageCB cb = new BMessageCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(BMessageCQ sq);

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
    protected BMessageCB newMyCB() {
        return new BMessageCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return BMessageCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
