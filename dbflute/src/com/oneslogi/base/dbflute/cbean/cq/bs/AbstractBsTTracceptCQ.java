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
 * The abstract condition-query of T_TRACCEPT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTracceptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTracceptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRACCEPT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_Equal(Long tracceptId) {
        doSetTracceptId_Equal(tracceptId);
    }

    protected void doSetTracceptId_Equal(Long tracceptId) {
        regTracceptId(CK_EQ, tracceptId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_NotEqual(Long tracceptId) {
        doSetTracceptId_NotEqual(tracceptId);
    }

    protected void doSetTracceptId_NotEqual(Long tracceptId) {
        regTracceptId(CK_NES, tracceptId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_GreaterThan(Long tracceptId) {
        regTracceptId(CK_GT, tracceptId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_LessThan(Long tracceptId) {
        regTracceptId(CK_LT, tracceptId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_GreaterEqual(Long tracceptId) {
        regTracceptId(CK_GE, tracceptId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptId The value of tracceptId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTracceptId_LessEqual(Long tracceptId) {
        regTracceptId(CK_LE, tracceptId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of tracceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tracceptId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTracceptId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTracceptId(), "TRACCEPT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptIdList The collection of tracceptId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracceptId_InScope(Collection<Long> tracceptIdList) {
        doSetTracceptId_InScope(tracceptIdList);
    }

    protected void doSetTracceptId_InScope(Collection<Long> tracceptIdList) {
        regINS(CK_INS, cTL(tracceptIdList), xgetCValueTracceptId(), "TRACCEPT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param tracceptIdList The collection of tracceptId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracceptId_NotInScope(Collection<Long> tracceptIdList) {
        doSetTracceptId_NotInScope(tracceptIdList);
    }

    protected void doSetTracceptId_NotInScope(Collection<Long> tracceptIdList) {
        regINS(CK_NINS, cTL(tracceptIdList), xgetCValueTracceptId(), "TRACCEPT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTracceptId_IsNull() { regTracceptId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACCEPT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTracceptId_IsNotNull() { regTracceptId(CK_ISNN, DOBJ); }

    protected void regTracceptId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracceptId(), "TRACCEPT_ID"); }
    protected abstract ConditionValue xgetCValueTracceptId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_Equal(java.math.BigDecimal prekey) {
        doSetPrekey_Equal(prekey);
    }

    protected void doSetPrekey_Equal(java.math.BigDecimal prekey) {
        regPrekey(CK_EQ, prekey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_NotEqual(java.math.BigDecimal prekey) {
        doSetPrekey_NotEqual(prekey);
    }

    protected void doSetPrekey_NotEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_NES, prekey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_GreaterThan(java.math.BigDecimal prekey) {
        regPrekey(CK_GT, prekey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_LessThan(java.math.BigDecimal prekey) {
        regPrekey(CK_LT, prekey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_GreaterEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_GE, prekey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekey The value of prekey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrekey_LessEqual(java.math.BigDecimal prekey) {
        regPrekey(CK_LE, prekey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param minNumber The min number of prekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of prekey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrekey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrekey(), "PREKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekeyList The collection of prekey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrekey_InScope(Collection<java.math.BigDecimal> prekeyList) {
        doSetPrekey_InScope(prekeyList);
    }

    protected void doSetPrekey_InScope(Collection<java.math.BigDecimal> prekeyList) {
        regINS(CK_INS, cTL(prekeyList), xgetCValuePrekey(), "PREKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     * @param prekeyList The collection of prekey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrekey_NotInScope(Collection<java.math.BigDecimal> prekeyList) {
        doSetPrekey_NotInScope(prekeyList);
    }

    protected void doSetPrekey_NotInScope(Collection<java.math.BigDecimal> prekeyList) {
        regINS(CK_NINS, cTL(prekeyList), xgetCValuePrekey(), "PREKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     */
    public void setPrekey_IsNull() { regPrekey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PREKEY: {IX, decimal(16, 6)}
     */
    public void setPrekey_IsNotNull() { regPrekey(CK_ISNN, DOBJ); }

    protected void regPrekey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrekey(), "PREKEY"); }
    protected abstract ConditionValue xgetCValuePrekey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_Equal(String accepttype) {
        doSetAccepttype_Equal(fRES(accepttype));
    }

    protected void doSetAccepttype_Equal(String accepttype) {
        regAccepttype(CK_EQ, accepttype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_NotEqual(String accepttype) {
        doSetAccepttype_NotEqual(fRES(accepttype));
    }

    protected void doSetAccepttype_NotEqual(String accepttype) {
        regAccepttype(CK_NES, accepttype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_GreaterThan(String accepttype) {
        regAccepttype(CK_GT, fRES(accepttype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_LessThan(String accepttype) {
        regAccepttype(CK_LT, fRES(accepttype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_GreaterEqual(String accepttype) {
        regAccepttype(CK_GE, fRES(accepttype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_LessEqual(String accepttype) {
        regAccepttype(CK_LE, fRES(accepttype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttypeList The collection of accepttype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_InScope(Collection<String> accepttypeList) {
        doSetAccepttype_InScope(accepttypeList);
    }

    protected void doSetAccepttype_InScope(Collection<String> accepttypeList) {
        regINS(CK_INS, cTL(accepttypeList), xgetCValueAccepttype(), "ACCEPTTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttypeList The collection of accepttype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_NotInScope(Collection<String> accepttypeList) {
        doSetAccepttype_NotInScope(accepttypeList);
    }

    protected void doSetAccepttype_NotInScope(Collection<String> accepttypeList) {
        regINS(CK_NINS, cTL(accepttypeList), xgetCValueAccepttype(), "ACCEPTTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTTYPE: {varchar(30)} <br>
     * <pre>e.g. setAccepttype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accepttype The value of accepttype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAccepttype_LikeSearch(String accepttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accepttype), xgetCValueAccepttype(), "ACCEPTTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAccepttype_NotLikeSearch(String accepttype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accepttype), xgetCValueAccepttype(), "ACCEPTTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     * @param accepttype The value of accepttype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccepttype_PrefixSearch(String accepttype) {
        setAccepttype_LikeSearch(accepttype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     */
    public void setAccepttype_IsNull() { regAccepttype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     */
    public void setAccepttype_IsNullOrEmpty() { regAccepttype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTTYPE: {varchar(30)}
     */
    public void setAccepttype_IsNotNull() { regAccepttype(CK_ISNN, DOBJ); }

    protected void regAccepttype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccepttype(), "ACCEPTTYPE"); }
    protected abstract ConditionValue xgetCValueAccepttype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_Equal(String acceptgroup) {
        doSetAcceptgroup_Equal(fRES(acceptgroup));
    }

    protected void doSetAcceptgroup_Equal(String acceptgroup) {
        regAcceptgroup(CK_EQ, acceptgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_NotEqual(String acceptgroup) {
        doSetAcceptgroup_NotEqual(fRES(acceptgroup));
    }

    protected void doSetAcceptgroup_NotEqual(String acceptgroup) {
        regAcceptgroup(CK_NES, acceptgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_GreaterThan(String acceptgroup) {
        regAcceptgroup(CK_GT, fRES(acceptgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_LessThan(String acceptgroup) {
        regAcceptgroup(CK_LT, fRES(acceptgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_GreaterEqual(String acceptgroup) {
        regAcceptgroup(CK_GE, fRES(acceptgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_LessEqual(String acceptgroup) {
        regAcceptgroup(CK_LE, fRES(acceptgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroupList The collection of acceptgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_InScope(Collection<String> acceptgroupList) {
        doSetAcceptgroup_InScope(acceptgroupList);
    }

    protected void doSetAcceptgroup_InScope(Collection<String> acceptgroupList) {
        regINS(CK_INS, cTL(acceptgroupList), xgetCValueAcceptgroup(), "ACCEPTGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroupList The collection of acceptgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_NotInScope(Collection<String> acceptgroupList) {
        doSetAcceptgroup_NotInScope(acceptgroupList);
    }

    protected void doSetAcceptgroup_NotInScope(Collection<String> acceptgroupList) {
        regINS(CK_NINS, cTL(acceptgroupList), xgetCValueAcceptgroup(), "ACCEPTGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTGROUP: {varchar(60)} <br>
     * <pre>e.g. setAcceptgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param acceptgroup The value of acceptgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAcceptgroup_LikeSearch(String acceptgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(acceptgroup), xgetCValueAcceptgroup(), "ACCEPTGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAcceptgroup_NotLikeSearch(String acceptgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(acceptgroup), xgetCValueAcceptgroup(), "ACCEPTGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     * @param acceptgroup The value of acceptgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptgroup_PrefixSearch(String acceptgroup) {
        setAcceptgroup_LikeSearch(acceptgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     */
    public void setAcceptgroup_IsNull() { regAcceptgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     */
    public void setAcceptgroup_IsNullOrEmpty() { regAcceptgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTGROUP: {varchar(60)}
     */
    public void setAcceptgroup_IsNotNull() { regAcceptgroup(CK_ISNN, DOBJ); }

    protected void regAcceptgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptgroup(), "ACCEPTGROUP"); }
    protected abstract ConditionValue xgetCValueAcceptgroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_Equal(String logisticscd) {
        doSetLogisticscd_Equal(fRES(logisticscd));
    }

    protected void doSetLogisticscd_Equal(String logisticscd) {
        regLogisticscd(CK_EQ, logisticscd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotEqual(String logisticscd) {
        doSetLogisticscd_NotEqual(fRES(logisticscd));
    }

    protected void doSetLogisticscd_NotEqual(String logisticscd) {
        regLogisticscd(CK_NES, logisticscd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterThan(String logisticscd) {
        regLogisticscd(CK_GT, fRES(logisticscd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessThan(String logisticscd) {
        regLogisticscd(CK_LT, fRES(logisticscd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_GreaterEqual(String logisticscd) {
        regLogisticscd(CK_GE, fRES(logisticscd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_LessEqual(String logisticscd) {
        regLogisticscd(CK_LE, fRES(logisticscd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscdList The collection of logisticscd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_InScope(Collection<String> logisticscdList) {
        doSetLogisticscd_InScope(logisticscdList);
    }

    protected void doSetLogisticscd_InScope(Collection<String> logisticscdList) {
        regINS(CK_INS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscdList The collection of logisticscd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_NotInScope(Collection<String> logisticscdList) {
        doSetLogisticscd_NotInScope(logisticscdList);
    }

    protected void doSetLogisticscd_NotInScope(Collection<String> logisticscdList) {
        regINS(CK_NINS, cTL(logisticscdList), xgetCValueLogisticscd(), "LOGISTICSCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLogisticscd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logisticscd The value of logisticscd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogisticscd_LikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogisticscd_NotLikeSearch(String logisticscd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logisticscd), xgetCValueLogisticscd(), "LOGISTICSCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGISTICSCD: {NotNull, varchar(30)}
     * @param logisticscd The value of logisticscd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogisticscd_PrefixSearch(String logisticscd) {
        setLogisticscd_LikeSearch(logisticscd, xcLSOPPre());
    }

    protected void regLogisticscd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogisticscd(), "LOGISTICSCD"); }
    protected abstract ConditionValue xgetCValueLogisticscd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_Equal(String warehousecd) {
        doSetWarehousecd_Equal(fRES(warehousecd));
    }

    protected void doSetWarehousecd_Equal(String warehousecd) {
        regWarehousecd(CK_EQ, warehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotEqual(String warehousecd) {
        doSetWarehousecd_NotEqual(fRES(warehousecd));
    }

    protected void doSetWarehousecd_NotEqual(String warehousecd) {
        regWarehousecd(CK_NES, warehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_InScope(Collection<String> warehousecdList) {
        doSetWarehousecd_InScope(warehousecdList);
    }

    protected void doSetWarehousecd_InScope(Collection<String> warehousecdList) {
        regINS(CK_INS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecdList The collection of warehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_NotInScope(Collection<String> warehousecdList) {
        doSetWarehousecd_NotInScope(warehousecdList);
    }

    protected void doSetWarehousecd_NotInScope(Collection<String> warehousecdList) {
        regINS(CK_NINS, cTL(warehousecdList), xgetCValueWarehousecd(), "WAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setWarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousecd The value of warehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousecd_LikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {IX+, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_Equal(String inspectedusercd) {
        doSetInspectedusercd_Equal(fRES(inspectedusercd));
    }

    protected void doSetInspectedusercd_Equal(String inspectedusercd) {
        regInspectedusercd(CK_EQ, inspectedusercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_NotEqual(String inspectedusercd) {
        doSetInspectedusercd_NotEqual(fRES(inspectedusercd));
    }

    protected void doSetInspectedusercd_NotEqual(String inspectedusercd) {
        regInspectedusercd(CK_NES, inspectedusercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_GreaterThan(String inspectedusercd) {
        regInspectedusercd(CK_GT, fRES(inspectedusercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_LessThan(String inspectedusercd) {
        regInspectedusercd(CK_LT, fRES(inspectedusercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_GreaterEqual(String inspectedusercd) {
        regInspectedusercd(CK_GE, fRES(inspectedusercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_LessEqual(String inspectedusercd) {
        regInspectedusercd(CK_LE, fRES(inspectedusercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercdList The collection of inspectedusercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_InScope(Collection<String> inspectedusercdList) {
        doSetInspectedusercd_InScope(inspectedusercdList);
    }

    protected void doSetInspectedusercd_InScope(Collection<String> inspectedusercdList) {
        regINS(CK_INS, cTL(inspectedusercdList), xgetCValueInspectedusercd(), "INSPECTEDUSERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercdList The collection of inspectedusercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_NotInScope(Collection<String> inspectedusercdList) {
        doSetInspectedusercd_NotInScope(inspectedusercdList);
    }

    protected void doSetInspectedusercd_NotInScope(Collection<String> inspectedusercdList) {
        regINS(CK_NINS, cTL(inspectedusercdList), xgetCValueInspectedusercd(), "INSPECTEDUSERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)} <br>
     * <pre>e.g. setInspectedusercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inspectedusercd The value of inspectedusercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInspectedusercd_LikeSearch(String inspectedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inspectedusercd), xgetCValueInspectedusercd(), "INSPECTEDUSERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInspectedusercd_NotLikeSearch(String inspectedusercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inspectedusercd), xgetCValueInspectedusercd(), "INSPECTEDUSERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     * @param inspectedusercd The value of inspectedusercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInspectedusercd_PrefixSearch(String inspectedusercd) {
        setInspectedusercd_LikeSearch(inspectedusercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNull() { regInspectedusercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNullOrEmpty() { regInspectedusercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSPECTEDUSERCD: {varchar(30)}
     */
    public void setInspectedusercd_IsNotNull() { regInspectedusercd(CK_ISNN, DOBJ); }

    protected void regInspectedusercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInspectedusercd(), "INSPECTEDUSERCD"); }
    protected abstract ConditionValue xgetCValueInspectedusercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_Equal(String carriercd) {
        doSetCarriercd_Equal(fRES(carriercd));
    }

    protected void doSetCarriercd_Equal(String carriercd) {
        regCarriercd(CK_EQ, carriercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_NotEqual(String carriercd) {
        doSetCarriercd_NotEqual(fRES(carriercd));
    }

    protected void doSetCarriercd_NotEqual(String carriercd) {
        regCarriercd(CK_NES, carriercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_GreaterThan(String carriercd) {
        regCarriercd(CK_GT, fRES(carriercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_LessThan(String carriercd) {
        regCarriercd(CK_LT, fRES(carriercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_GreaterEqual(String carriercd) {
        regCarriercd(CK_GE, fRES(carriercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_LessEqual(String carriercd) {
        regCarriercd(CK_LE, fRES(carriercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercdList The collection of carriercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_InScope(Collection<String> carriercdList) {
        doSetCarriercd_InScope(carriercdList);
    }

    protected void doSetCarriercd_InScope(Collection<String> carriercdList) {
        regINS(CK_INS, cTL(carriercdList), xgetCValueCarriercd(), "CARRIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercdList The collection of carriercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_NotInScope(Collection<String> carriercdList) {
        doSetCarriercd_NotInScope(carriercdList);
    }

    protected void doSetCarriercd_NotInScope(Collection<String> carriercdList) {
        regINS(CK_NINS, cTL(carriercdList), xgetCValueCarriercd(), "CARRIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)} <br>
     * <pre>e.g. setCarriercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriercd The value of carriercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriercd_LikeSearch(String carriercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriercd), xgetCValueCarriercd(), "CARRIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriercd_NotLikeSearch(String carriercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriercd), xgetCValueCarriercd(), "CARRIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERCD: {varchar(30)}
     * @param carriercd The value of carriercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriercd_PrefixSearch(String carriercd) {
        setCarriercd_LikeSearch(carriercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNull() { regCarriercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNullOrEmpty() { regCarriercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERCD: {varchar(30)}
     */
    public void setCarriercd_IsNotNull() { regCarriercd(CK_ISNN, DOBJ); }

    protected void regCarriercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriercd(), "CARRIERCD"); }
    protected abstract ConditionValue xgetCValueCarriercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_Equal(String carriername) {
        doSetCarriername_Equal(fRES(carriername));
    }

    protected void doSetCarriername_Equal(String carriername) {
        regCarriername(CK_EQ, carriername);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotEqual(String carriername) {
        doSetCarriername_NotEqual(fRES(carriername));
    }

    protected void doSetCarriername_NotEqual(String carriername) {
        regCarriername(CK_NES, carriername);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterThan(String carriername) {
        regCarriername(CK_GT, fRES(carriername));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessThan(String carriername) {
        regCarriername(CK_LT, fRES(carriername));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_GreaterEqual(String carriername) {
        regCarriername(CK_GE, fRES(carriername));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_LessEqual(String carriername) {
        regCarriername(CK_LE, fRES(carriername));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_InScope(Collection<String> carriernameList) {
        doSetCarriername_InScope(carriernameList);
    }

    protected void doSetCarriername_InScope(Collection<String> carriernameList) {
        regINS(CK_INS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriernameList The collection of carriername as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_NotInScope(Collection<String> carriernameList) {
        doSetCarriername_NotInScope(carriernameList);
    }

    protected void doSetCarriername_NotInScope(Collection<String> carriernameList) {
        regINS(CK_NINS, cTL(carriernameList), xgetCValueCarriername(), "CARRIERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)} <br>
     * <pre>e.g. setCarriername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriername The value of carriername as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriername_LikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriername_NotLikeSearch(String carriername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriername), xgetCValueCarriername(), "CARRIERNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     * @param carriername The value of carriername as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriername_PrefixSearch(String carriername) {
        setCarriername_LikeSearch(carriername, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNull() { regCarriername(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNullOrEmpty() { regCarriername(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNAME: {varchar(255)}
     */
    public void setCarriername_IsNotNull() { regCarriername(CK_ISNN, DOBJ); }

    protected void regCarriername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriername(), "CARRIERNAME"); }
    protected abstract ConditionValue xgetCValueCarriername();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_Equal(String carrierwbno) {
        doSetCarrierwbno_Equal(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_Equal(String carrierwbno) {
        regCarrierwbno(CK_EQ, carrierwbno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotEqual(String carrierwbno) {
        doSetCarrierwbno_NotEqual(fRES(carrierwbno));
    }

    protected void doSetCarrierwbno_NotEqual(String carrierwbno) {
        regCarrierwbno(CK_NES, carrierwbno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterThan(String carrierwbno) {
        regCarrierwbno(CK_GT, fRES(carrierwbno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessThan(String carrierwbno) {
        regCarrierwbno(CK_LT, fRES(carrierwbno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_GreaterEqual(String carrierwbno) {
        regCarrierwbno(CK_GE, fRES(carrierwbno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_LessEqual(String carrierwbno) {
        regCarrierwbno(CK_LE, fRES(carrierwbno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbnoList The collection of carrierwbno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_InScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_InScope(Collection<String> carrierwbnoList) {
        regINS(CK_INS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbnoList The collection of carrierwbno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        doSetCarrierwbno_NotInScope(carrierwbnoList);
    }

    protected void doSetCarrierwbno_NotInScope(Collection<String> carrierwbnoList) {
        regINS(CK_NINS, cTL(carrierwbnoList), xgetCValueCarrierwbno(), "CARRIERWBNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)} <br>
     * <pre>e.g. setCarrierwbno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierwbno The value of carrierwbno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierwbno_LikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierwbno_NotLikeSearch(String carrierwbno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierwbno), xgetCValueCarrierwbno(), "CARRIERWBNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     * @param carrierwbno The value of carrierwbno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierwbno_PrefixSearch(String carrierwbno) {
        setCarrierwbno_LikeSearch(carrierwbno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNull() { regCarrierwbno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNullOrEmpty() { regCarrierwbno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERWBNO: {varchar(60)}
     */
    public void setCarrierwbno_IsNotNull() { regCarrierwbno(CK_ISNN, DOBJ); }

    protected void regCarrierwbno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierwbno(), "CARRIERWBNO"); }
    protected abstract ConditionValue xgetCValueCarrierwbno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_Equal(String deliverycd) {
        doSetDeliverycd_Equal(fRES(deliverycd));
    }

    protected void doSetDeliverycd_Equal(String deliverycd) {
        regDeliverycd(CK_EQ, deliverycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_NotEqual(String deliverycd) {
        doSetDeliverycd_NotEqual(fRES(deliverycd));
    }

    protected void doSetDeliverycd_NotEqual(String deliverycd) {
        regDeliverycd(CK_NES, deliverycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterThan(String deliverycd) {
        regDeliverycd(CK_GT, fRES(deliverycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessThan(String deliverycd) {
        regDeliverycd(CK_LT, fRES(deliverycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_GreaterEqual(String deliverycd) {
        regDeliverycd(CK_GE, fRES(deliverycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_LessEqual(String deliverycd) {
        regDeliverycd(CK_LE, fRES(deliverycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycdList The collection of deliverycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_InScope(Collection<String> deliverycdList) {
        doSetDeliverycd_InScope(deliverycdList);
    }

    protected void doSetDeliverycd_InScope(Collection<String> deliverycdList) {
        regINS(CK_INS, cTL(deliverycdList), xgetCValueDeliverycd(), "DELIVERYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycdList The collection of deliverycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_NotInScope(Collection<String> deliverycdList) {
        doSetDeliverycd_NotInScope(deliverycdList);
    }

    protected void doSetDeliverycd_NotInScope(Collection<String> deliverycdList) {
        regINS(CK_NINS, cTL(deliverycdList), xgetCValueDeliverycd(), "DELIVERYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)} <br>
     * <pre>e.g. setDeliverycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverycd The value of deliverycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverycd_LikeSearch(String deliverycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverycd), xgetCValueDeliverycd(), "DELIVERYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverycd_NotLikeSearch(String deliverycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverycd), xgetCValueDeliverycd(), "DELIVERYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     * @param deliverycd The value of deliverycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverycd_PrefixSearch(String deliverycd) {
        setDeliverycd_LikeSearch(deliverycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNull() { regDeliverycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNullOrEmpty() { regDeliverycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERYCD: {varchar(30)}
     */
    public void setDeliverycd_IsNotNull() { regDeliverycd(CK_ISNN, DOBJ); }

    protected void regDeliverycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverycd(), "DELIVERYCD"); }
    protected abstract ConditionValue xgetCValueDeliverycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(60)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(60)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_Equal(String carriersname) {
        doSetCarriersname_Equal(fRES(carriersname));
    }

    protected void doSetCarriersname_Equal(String carriersname) {
        regCarriersname(CK_EQ, carriersname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotEqual(String carriersname) {
        doSetCarriersname_NotEqual(fRES(carriersname));
    }

    protected void doSetCarriersname_NotEqual(String carriersname) {
        regCarriersname(CK_NES, carriersname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterThan(String carriersname) {
        regCarriersname(CK_GT, fRES(carriersname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessThan(String carriersname) {
        regCarriersname(CK_LT, fRES(carriersname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_GreaterEqual(String carriersname) {
        regCarriersname(CK_GE, fRES(carriersname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_LessEqual(String carriersname) {
        regCarriersname(CK_LE, fRES(carriersname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersnameList The collection of carriersname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_InScope(Collection<String> carriersnameList) {
        doSetCarriersname_InScope(carriersnameList);
    }

    protected void doSetCarriersname_InScope(Collection<String> carriersnameList) {
        regINS(CK_INS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersnameList The collection of carriersname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_NotInScope(Collection<String> carriersnameList) {
        doSetCarriersname_NotInScope(carriersnameList);
    }

    protected void doSetCarriersname_NotInScope(Collection<String> carriersnameList) {
        regINS(CK_NINS, cTL(carriersnameList), xgetCValueCarriersname(), "CARRIERSNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)} <br>
     * <pre>e.g. setCarriersname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carriersname The value of carriersname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarriersname_LikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarriersname_NotLikeSearch(String carriersname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carriersname), xgetCValueCarriersname(), "CARRIERSNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     * @param carriersname The value of carriersname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarriersname_PrefixSearch(String carriersname) {
        setCarriersname_LikeSearch(carriersname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNull() { regCarriersname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNullOrEmpty() { regCarriersname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERSNAME: {varchar(100)}
     */
    public void setCarriersname_IsNotNull() { regCarriersname(CK_ISNN, DOBJ); }

    protected void regCarriersname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarriersname(), "CARRIERSNAME"); }
    protected abstract ConditionValue xgetCValueCarriersname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @param actualtime The value of actualtime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActualtime_Equal(java.sql.Timestamp actualtime) {
        regActualtime(CK_EQ,  actualtime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @param actualtime The value of actualtime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActualtime_GreaterThan(java.sql.Timestamp actualtime) {
        regActualtime(CK_GT,  actualtime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @param actualtime The value of actualtime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActualtime_LessThan(java.sql.Timestamp actualtime) {
        regActualtime(CK_LT,  actualtime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @param actualtime The value of actualtime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActualtime_GreaterEqual(java.sql.Timestamp actualtime) {
        regActualtime(CK_GE,  actualtime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * @param actualtime The value of actualtime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActualtime_LessEqual(java.sql.Timestamp actualtime) {
        regActualtime(CK_LE, actualtime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * <pre>e.g. setActualtime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of actualtime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of actualtime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setActualtime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueActualtime(), "ACTUALTIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of actualtime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of actualtime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setActualtime_DateFromTo(Date fromDate, Date toDate) {
        setActualtime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     */
    public void setActualtime_IsNull() { regActualtime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACTUALTIME: {datetime2(26, 6)}
     */
    public void setActualtime_IsNotNull() { regActualtime(CK_ISNN, DOBJ); }

    protected void regActualtime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActualtime(), "ACTUALTIME"); }
    protected abstract ConditionValue xgetCValueActualtime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @param completetime The value of completetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompletetime_Equal(java.sql.Timestamp completetime) {
        regCompletetime(CK_EQ,  completetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @param completetime The value of completetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompletetime_GreaterThan(java.sql.Timestamp completetime) {
        regCompletetime(CK_GT,  completetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @param completetime The value of completetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompletetime_LessThan(java.sql.Timestamp completetime) {
        regCompletetime(CK_LT,  completetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @param completetime The value of completetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompletetime_GreaterEqual(java.sql.Timestamp completetime) {
        regCompletetime(CK_GE,  completetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * @param completetime The value of completetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompletetime_LessEqual(java.sql.Timestamp completetime) {
        regCompletetime(CK_LE, completetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * <pre>e.g. setCompletetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of completetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of completetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCompletetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueCompletetime(), "COMPLETETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of completetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of completetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setCompletetime_DateFromTo(Date fromDate, Date toDate) {
        setCompletetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     */
    public void setCompletetime_IsNull() { regCompletetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPLETETIME: {datetime2(26, 6)}
     */
    public void setCompletetime_IsNotNull() { regCompletetime(CK_ISNN, DOBJ); }

    protected void regCompletetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompletetime(), "COMPLETETIME"); }
    protected abstract ConditionValue xgetCValueCompletetime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_Equal(java.math.BigDecimal acceptlinetotal) {
        doSetAcceptlinetotal_Equal(acceptlinetotal);
    }

    protected void doSetAcceptlinetotal_Equal(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_EQ, acceptlinetotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_NotEqual(java.math.BigDecimal acceptlinetotal) {
        doSetAcceptlinetotal_NotEqual(acceptlinetotal);
    }

    protected void doSetAcceptlinetotal_NotEqual(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_NES, acceptlinetotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_GreaterThan(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_GT, acceptlinetotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_LessThan(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_LT, acceptlinetotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_GreaterEqual(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_GE, acceptlinetotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotal The value of acceptlinetotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_LessEqual(java.math.BigDecimal acceptlinetotal) {
        regAcceptlinetotal(CK_LE, acceptlinetotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of acceptlinetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of acceptlinetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAcceptlinetotal_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAcceptlinetotal(), "ACCEPTLINETOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotalList The collection of acceptlinetotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_InScope(Collection<java.math.BigDecimal> acceptlinetotalList) {
        doSetAcceptlinetotal_InScope(acceptlinetotalList);
    }

    protected void doSetAcceptlinetotal_InScope(Collection<java.math.BigDecimal> acceptlinetotalList) {
        regINS(CK_INS, cTL(acceptlinetotalList), xgetCValueAcceptlinetotal(), "ACCEPTLINETOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     * @param acceptlinetotalList The collection of acceptlinetotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAcceptlinetotal_NotInScope(Collection<java.math.BigDecimal> acceptlinetotalList) {
        doSetAcceptlinetotal_NotInScope(acceptlinetotalList);
    }

    protected void doSetAcceptlinetotal_NotInScope(Collection<java.math.BigDecimal> acceptlinetotalList) {
        regINS(CK_NINS, cTL(acceptlinetotalList), xgetCValueAcceptlinetotal(), "ACCEPTLINETOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     */
    public void setAcceptlinetotal_IsNull() { regAcceptlinetotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCEPTLINETOTAL: {decimal(16, 6), default=[(0)]}
     */
    public void setAcceptlinetotal_IsNotNull() { regAcceptlinetotal(CK_ISNN, DOBJ); }

    protected void regAcceptlinetotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAcceptlinetotal(), "ACCEPTLINETOTAL"); }
    protected abstract ConditionValue xgetCValueAcceptlinetotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_Equal(java.math.BigDecimal taglabelprintflg) {
        doSetTaglabelprintflg_Equal(taglabelprintflg);
    }

    protected void doSetTaglabelprintflg_Equal(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_EQ, taglabelprintflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_NotEqual(java.math.BigDecimal taglabelprintflg) {
        doSetTaglabelprintflg_NotEqual(taglabelprintflg);
    }

    protected void doSetTaglabelprintflg_NotEqual(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_NES, taglabelprintflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_GreaterThan(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_GT, taglabelprintflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_LessThan(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_LT, taglabelprintflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_GreaterEqual(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_GE, taglabelprintflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflg The value of taglabelprintflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_LessEqual(java.math.BigDecimal taglabelprintflg) {
        regTaglabelprintflg(CK_LE, taglabelprintflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of taglabelprintflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of taglabelprintflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTaglabelprintflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTaglabelprintflg(), "TAGLABELPRINTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflgList The collection of taglabelprintflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_InScope(Collection<java.math.BigDecimal> taglabelprintflgList) {
        doSetTaglabelprintflg_InScope(taglabelprintflgList);
    }

    protected void doSetTaglabelprintflg_InScope(Collection<java.math.BigDecimal> taglabelprintflgList) {
        regINS(CK_INS, cTL(taglabelprintflgList), xgetCValueTaglabelprintflg(), "TAGLABELPRINTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TAGLABELPRINTFLG: {IX, NotNull, decimal(16, 6), default=[(0)]}
     * @param taglabelprintflgList The collection of taglabelprintflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTaglabelprintflg_NotInScope(Collection<java.math.BigDecimal> taglabelprintflgList) {
        doSetTaglabelprintflg_NotInScope(taglabelprintflgList);
    }

    protected void doSetTaglabelprintflg_NotInScope(Collection<java.math.BigDecimal> taglabelprintflgList) {
        regINS(CK_NINS, cTL(taglabelprintflgList), xgetCValueTaglabelprintflg(), "TAGLABELPRINTFLG");
    }

    protected void regTaglabelprintflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTaglabelprintflg(), "TAGLABELPRINTFLG"); }
    protected abstract ConditionValue xgetCValueTaglabelprintflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {IX, bigint(19)}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

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
    public HpSLCFunction<TTracceptCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTracceptCB.class);
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
    public HpSLCFunction<TTracceptCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTracceptCB.class);
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
    public HpSLCFunction<TTracceptCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTracceptCB.class);
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
    public HpSLCFunction<TTracceptCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTracceptCB.class);
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
    public HpSLCFunction<TTracceptCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTracceptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTracceptCB&gt;() {
     *     public void query(TTracceptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTracceptCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTracceptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTracceptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTracceptCQ sq);

    protected TTracceptCB xcreateScalarConditionCB() {
        TTracceptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTracceptCB xcreateScalarConditionPartitionByCB() {
        TTracceptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTracceptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTracceptCB cb = new TTracceptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRACCEPT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTracceptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTracceptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTracceptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTracceptCB cb = new TTracceptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRACCEPT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTracceptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTracceptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTracceptCB cb = new TTracceptCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTracceptCQ sq);

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
    protected TTracceptCB newMyCB() {
        return new TTracceptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTracceptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
