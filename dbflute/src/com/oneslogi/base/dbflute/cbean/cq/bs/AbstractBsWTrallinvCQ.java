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
 * The abstract condition-query of W_TRALLINV.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWTrallinvCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWTrallinvCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_TRALLINV";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_Equal(Long trallinvId) {
        doSetTrallinvId_Equal(trallinvId);
    }

    protected void doSetTrallinvId_Equal(Long trallinvId) {
        regTrallinvId(CK_EQ, trallinvId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_NotEqual(Long trallinvId) {
        doSetTrallinvId_NotEqual(trallinvId);
    }

    protected void doSetTrallinvId_NotEqual(Long trallinvId) {
        regTrallinvId(CK_NES, trallinvId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_GreaterThan(Long trallinvId) {
        regTrallinvId(CK_GT, trallinvId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_LessThan(Long trallinvId) {
        regTrallinvId(CK_LT, trallinvId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_GreaterEqual(Long trallinvId) {
        regTrallinvId(CK_GE, trallinvId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvId The value of trallinvId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrallinvId_LessEqual(Long trallinvId) {
        regTrallinvId(CK_LE, trallinvId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trallinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trallinvId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrallinvId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrallinvId(), "TRALLINV_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvIdList The collection of trallinvId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrallinvId_InScope(Collection<Long> trallinvIdList) {
        doSetTrallinvId_InScope(trallinvIdList);
    }

    protected void doSetTrallinvId_InScope(Collection<Long> trallinvIdList) {
        regINS(CK_INS, cTL(trallinvIdList), xgetCValueTrallinvId(), "TRALLINV_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trallinvIdList The collection of trallinvId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrallinvId_NotInScope(Collection<Long> trallinvIdList) {
        doSetTrallinvId_NotInScope(trallinvIdList);
    }

    protected void doSetTrallinvId_NotInScope(Collection<Long> trallinvIdList) {
        regINS(CK_NINS, cTL(trallinvIdList), xgetCValueTrallinvId(), "TRALLINV_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrallinvId_IsNull() { regTrallinvId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRALLINV_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrallinvId_IsNotNull() { regTrallinvId(CK_ISNN, DOBJ); }

    protected void regTrallinvId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrallinvId(), "TRALLINV_ID"); }
    protected abstract ConditionValue xgetCValueTrallinvId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_Equal(String tagType) {
        doSetTagType_Equal(fRES(tagType));
    }

    protected void doSetTagType_Equal(String tagType) {
        regTagType(CK_EQ, tagType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotEqual(String tagType) {
        doSetTagType_NotEqual(fRES(tagType));
    }

    protected void doSetTagType_NotEqual(String tagType) {
        regTagType(CK_NES, tagType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_GreaterThan(String tagType) {
        regTagType(CK_GT, fRES(tagType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_LessThan(String tagType) {
        regTagType(CK_LT, fRES(tagType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_GreaterEqual(String tagType) {
        regTagType(CK_GE, fRES(tagType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_LessEqual(String tagType) {
        regTagType(CK_LE, fRES(tagType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagTypeList The collection of tagType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_InScope(Collection<String> tagTypeList) {
        doSetTagType_InScope(tagTypeList);
    }

    protected void doSetTagType_InScope(Collection<String> tagTypeList) {
        regINS(CK_INS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagTypeList The collection of tagType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_NotInScope(Collection<String> tagTypeList) {
        doSetTagType_NotInScope(tagTypeList);
    }

    protected void doSetTagType_NotInScope(Collection<String> tagTypeList) {
        regINS(CK_NINS, cTL(tagTypeList), xgetCValueTagType(), "TAG_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setTagType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tagType The value of tagType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTagType_LikeSearch(String tagType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tagType), xgetCValueTagType(), "TAG_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTagType_NotLikeSearch(String tagType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tagType), xgetCValueTagType(), "TAG_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TAG_TYPE: {NotNull, varchar(30)}
     * @param tagType The value of tagType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTagType_PrefixSearch(String tagType) {
        setTagType_LikeSearch(tagType, xcLSOPPre());
    }

    protected void regTagType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTagType(), "TAG_TYPE"); }
    protected abstract ConditionValue xgetCValueTagType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_Equal(String inoutkbn) {
        doSetInoutkbn_Equal(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_Equal(String inoutkbn) {
        regInoutkbn(CK_EQ, inoutkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotEqual(String inoutkbn) {
        doSetInoutkbn_NotEqual(fRES(inoutkbn));
    }

    protected void doSetInoutkbn_NotEqual(String inoutkbn) {
        regInoutkbn(CK_NES, inoutkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterThan(String inoutkbn) {
        regInoutkbn(CK_GT, fRES(inoutkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessThan(String inoutkbn) {
        regInoutkbn(CK_LT, fRES(inoutkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterEqual(String inoutkbn) {
        regInoutkbn(CK_GE, fRES(inoutkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessEqual(String inoutkbn) {
        regInoutkbn(CK_LE, fRES(inoutkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbnList The collection of inoutkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_InScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_InScope(inoutkbnList);
    }

    protected void doSetInoutkbn_InScope(Collection<String> inoutkbnList) {
        regINS(CK_INS, cTL(inoutkbnList), xgetCValueInoutkbn(), "INOUTKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbnList The collection of inoutkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        doSetInoutkbn_NotInScope(inoutkbnList);
    }

    protected void doSetInoutkbn_NotInScope(Collection<String> inoutkbnList) {
        regINS(CK_NINS, cTL(inoutkbnList), xgetCValueInoutkbn(), "INOUTKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)} <br>
     * <pre>e.g. setInoutkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inoutkbn The value of inoutkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInoutkbn_LikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutkbn_NotLikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {varchar(30)}
     * @param inoutkbn The value of inoutkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_PrefixSearch(String inoutkbn) {
        setInoutkbn_LikeSearch(inoutkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNull() { regInoutkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNullOrEmpty() { regInoutkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INOUTKBN: {varchar(30)}
     */
    public void setInoutkbn_IsNotNull() { regInoutkbn(CK_ISNN, DOBJ); }

    protected void regInoutkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutkbn(), "INOUTKBN"); }
    protected abstract ConditionValue xgetCValueInoutkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19)}
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
     * PRODUCT_ID: {NotNull, bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_Equal(java.math.BigDecimal qty1) {
        doSetQty1_Equal(qty1);
    }

    protected void doSetQty1_Equal(java.math.BigDecimal qty1) {
        regQty1(CK_EQ, qty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_NotEqual(java.math.BigDecimal qty1) {
        doSetQty1_NotEqual(qty1);
    }

    protected void doSetQty1_NotEqual(java.math.BigDecimal qty1) {
        regQty1(CK_NES, qty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_GreaterThan(java.math.BigDecimal qty1) {
        regQty1(CK_GT, qty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_LessThan(java.math.BigDecimal qty1) {
        regQty1(CK_LT, qty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_GreaterEqual(java.math.BigDecimal qty1) {
        regQty1(CK_GE, qty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1 The value of qty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1_LessEqual(java.math.BigDecimal qty1) {
        regQty1(CK_LE, qty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty1_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty1(), "QTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1List The collection of qty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_InScope(Collection<java.math.BigDecimal> qty1List) {
        doSetQty1_InScope(qty1List);
    }

    protected void doSetQty1_InScope(Collection<java.math.BigDecimal> qty1List) {
        regINS(CK_INS, cTL(qty1List), xgetCValueQty1(), "QTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     * @param qty1List The collection of qty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1_NotInScope(Collection<java.math.BigDecimal> qty1List) {
        doSetQty1_NotInScope(qty1List);
    }

    protected void doSetQty1_NotInScope(Collection<java.math.BigDecimal> qty1List) {
        regINS(CK_NINS, cTL(qty1List), xgetCValueQty1(), "QTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     */
    public void setQty1_IsNull() { regQty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY1: {decimal(16, 6), default=[(0)]}
     */
    public void setQty1_IsNotNull() { regQty1(CK_ISNN, DOBJ); }

    protected void regQty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1(), "QTY1"); }
    protected abstract ConditionValue xgetCValueQty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_Equal(java.math.BigDecimal qty2) {
        doSetQty2_Equal(qty2);
    }

    protected void doSetQty2_Equal(java.math.BigDecimal qty2) {
        regQty2(CK_EQ, qty2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_NotEqual(java.math.BigDecimal qty2) {
        doSetQty2_NotEqual(qty2);
    }

    protected void doSetQty2_NotEqual(java.math.BigDecimal qty2) {
        regQty2(CK_NES, qty2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_GreaterThan(java.math.BigDecimal qty2) {
        regQty2(CK_GT, qty2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_LessThan(java.math.BigDecimal qty2) {
        regQty2(CK_LT, qty2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_GreaterEqual(java.math.BigDecimal qty2) {
        regQty2(CK_GE, qty2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2 The value of qty2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty2_LessEqual(java.math.BigDecimal qty2) {
        regQty2(CK_LE, qty2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty2(), "QTY2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2List The collection of qty2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2_InScope(Collection<java.math.BigDecimal> qty2List) {
        doSetQty2_InScope(qty2List);
    }

    protected void doSetQty2_InScope(Collection<java.math.BigDecimal> qty2List) {
        regINS(CK_INS, cTL(qty2List), xgetCValueQty2(), "QTY2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     * @param qty2List The collection of qty2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty2_NotInScope(Collection<java.math.BigDecimal> qty2List) {
        doSetQty2_NotInScope(qty2List);
    }

    protected void doSetQty2_NotInScope(Collection<java.math.BigDecimal> qty2List) {
        regINS(CK_NINS, cTL(qty2List), xgetCValueQty2(), "QTY2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     */
    public void setQty2_IsNull() { regQty2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY2: {decimal(16, 6), default=[(0)]}
     */
    public void setQty2_IsNotNull() { regQty2(CK_ISNN, DOBJ); }

    protected void regQty2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty2(), "QTY2"); }
    protected abstract ConditionValue xgetCValueQty2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_Equal(java.math.BigDecimal qty3) {
        doSetQty3_Equal(qty3);
    }

    protected void doSetQty3_Equal(java.math.BigDecimal qty3) {
        regQty3(CK_EQ, qty3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_NotEqual(java.math.BigDecimal qty3) {
        doSetQty3_NotEqual(qty3);
    }

    protected void doSetQty3_NotEqual(java.math.BigDecimal qty3) {
        regQty3(CK_NES, qty3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_GreaterThan(java.math.BigDecimal qty3) {
        regQty3(CK_GT, qty3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_LessThan(java.math.BigDecimal qty3) {
        regQty3(CK_LT, qty3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_GreaterEqual(java.math.BigDecimal qty3) {
        regQty3(CK_GE, qty3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3 The value of qty3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty3_LessEqual(java.math.BigDecimal qty3) {
        regQty3(CK_LE, qty3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty3_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty3(), "QTY3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3List The collection of qty3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3_InScope(Collection<java.math.BigDecimal> qty3List) {
        doSetQty3_InScope(qty3List);
    }

    protected void doSetQty3_InScope(Collection<java.math.BigDecimal> qty3List) {
        regINS(CK_INS, cTL(qty3List), xgetCValueQty3(), "QTY3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     * @param qty3List The collection of qty3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty3_NotInScope(Collection<java.math.BigDecimal> qty3List) {
        doSetQty3_NotInScope(qty3List);
    }

    protected void doSetQty3_NotInScope(Collection<java.math.BigDecimal> qty3List) {
        regINS(CK_NINS, cTL(qty3List), xgetCValueQty3(), "QTY3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     */
    public void setQty3_IsNull() { regQty3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY3: {decimal(16, 6), default=[(0)]}
     */
    public void setQty3_IsNotNull() { regQty3(CK_ISNN, DOBJ); }

    protected void regQty3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty3(), "QTY3"); }
    protected abstract ConditionValue xgetCValueQty3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_Equal(java.math.BigDecimal qty4) {
        doSetQty4_Equal(qty4);
    }

    protected void doSetQty4_Equal(java.math.BigDecimal qty4) {
        regQty4(CK_EQ, qty4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_NotEqual(java.math.BigDecimal qty4) {
        doSetQty4_NotEqual(qty4);
    }

    protected void doSetQty4_NotEqual(java.math.BigDecimal qty4) {
        regQty4(CK_NES, qty4);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_GreaterThan(java.math.BigDecimal qty4) {
        regQty4(CK_GT, qty4);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_LessThan(java.math.BigDecimal qty4) {
        regQty4(CK_LT, qty4);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_GreaterEqual(java.math.BigDecimal qty4) {
        regQty4(CK_GE, qty4);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4 The value of qty4 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty4_LessEqual(java.math.BigDecimal qty4) {
        regQty4(CK_LE, qty4);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of qty4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty4. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty4_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty4(), "QTY4", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4List The collection of qty4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty4_InScope(Collection<java.math.BigDecimal> qty4List) {
        doSetQty4_InScope(qty4List);
    }

    protected void doSetQty4_InScope(Collection<java.math.BigDecimal> qty4List) {
        regINS(CK_INS, cTL(qty4List), xgetCValueQty4(), "QTY4");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     * @param qty4List The collection of qty4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty4_NotInScope(Collection<java.math.BigDecimal> qty4List) {
        doSetQty4_NotInScope(qty4List);
    }

    protected void doSetQty4_NotInScope(Collection<java.math.BigDecimal> qty4List) {
        regINS(CK_NINS, cTL(qty4List), xgetCValueQty4(), "QTY4");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     */
    public void setQty4_IsNull() { regQty4(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY4: {decimal(16, 6), default=[(0)]}
     */
    public void setQty4_IsNotNull() { regQty4(CK_ISNN, DOBJ); }

    protected void regQty4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty4(), "QTY4"); }
    protected abstract ConditionValue xgetCValueQty4();

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
    public HpSLCFunction<WTrallinvCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WTrallinvCB.class);
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
    public HpSLCFunction<WTrallinvCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WTrallinvCB.class);
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
    public HpSLCFunction<WTrallinvCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WTrallinvCB.class);
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
    public HpSLCFunction<WTrallinvCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WTrallinvCB.class);
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
    public HpSLCFunction<WTrallinvCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WTrallinvCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WTrallinvCB&gt;() {
     *     public void query(WTrallinvCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WTrallinvCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WTrallinvCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WTrallinvCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WTrallinvCQ sq);

    protected WTrallinvCB xcreateScalarConditionCB() {
        WTrallinvCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WTrallinvCB xcreateScalarConditionPartitionByCB() {
        WTrallinvCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WTrallinvCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WTrallinvCB cb = new WTrallinvCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRALLINV_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WTrallinvCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WTrallinvCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WTrallinvCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WTrallinvCB cb = new WTrallinvCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRALLINV_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WTrallinvCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WTrallinvCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WTrallinvCB cb = new WTrallinvCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WTrallinvCQ sq);

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
    protected WTrallinvCB newMyCB() {
        return new WTrallinvCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WTrallinvCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
