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
 * The abstract condition-query of M_MFCOMPANY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMMfcompanyCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMMfcompanyCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_MFCOMPANY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_Equal(Long companyId) {
        doSetCompanyId_Equal(companyId);
    }

    protected void doSetCompanyId_Equal(Long companyId) {
        regCompanyId(CK_EQ, companyId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_NotEqual(Long companyId) {
        doSetCompanyId_NotEqual(companyId);
    }

    protected void doSetCompanyId_NotEqual(Long companyId) {
        regCompanyId(CK_NES, companyId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_GreaterThan(Long companyId) {
        regCompanyId(CK_GT, companyId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_LessThan(Long companyId) {
        regCompanyId(CK_LT, companyId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_GreaterEqual(Long companyId) {
        regCompanyId(CK_GE, companyId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyId The value of companyId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCompanyId_LessEqual(Long companyId) {
        regCompanyId(CK_LE, companyId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of companyId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCompanyId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCompanyId(), "COMPANY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyIdList The collection of companyId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyId_InScope(Collection<Long> companyIdList) {
        doSetCompanyId_InScope(companyIdList);
    }

    protected void doSetCompanyId_InScope(Collection<Long> companyIdList) {
        regINS(CK_INS, cTL(companyIdList), xgetCValueCompanyId(), "COMPANY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param companyIdList The collection of companyId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyId_NotInScope(Collection<Long> companyIdList) {
        doSetCompanyId_NotInScope(companyIdList);
    }

    protected void doSetCompanyId_NotInScope(Collection<Long> companyIdList) {
        regINS(CK_NINS, cTL(companyIdList), xgetCValueCompanyId(), "COMPANY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCompanyId_IsNull() { regCompanyId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setCompanyId_IsNotNull() { regCompanyId(CK_ISNN, DOBJ); }

    protected void regCompanyId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyId(), "COMPANY_ID"); }
    protected abstract ConditionValue xgetCValueCompanyId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_Equal(String companyCd) {
        doSetCompanyCd_Equal(fRES(companyCd));
    }

    protected void doSetCompanyCd_Equal(String companyCd) {
        regCompanyCd(CK_EQ, companyCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotEqual(String companyCd) {
        doSetCompanyCd_NotEqual(fRES(companyCd));
    }

    protected void doSetCompanyCd_NotEqual(String companyCd) {
        regCompanyCd(CK_NES, companyCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterThan(String companyCd) {
        regCompanyCd(CK_GT, fRES(companyCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessThan(String companyCd) {
        regCompanyCd(CK_LT, fRES(companyCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_GreaterEqual(String companyCd) {
        regCompanyCd(CK_GE, fRES(companyCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_LessEqual(String companyCd) {
        regCompanyCd(CK_LE, fRES(companyCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCdList The collection of companyCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_InScope(Collection<String> companyCdList) {
        doSetCompanyCd_InScope(companyCdList);
    }

    protected void doSetCompanyCd_InScope(Collection<String> companyCdList) {
        regINS(CK_INS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCdList The collection of companyCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_NotInScope(Collection<String> companyCdList) {
        doSetCompanyCd_NotInScope(companyCdList);
    }

    protected void doSetCompanyCd_NotInScope(Collection<String> companyCdList) {
        regINS(CK_NINS, cTL(companyCdList), xgetCValueCompanyCd(), "COMPANY_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)} <br>
     * <pre>e.g. setCompanyCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companyCd The value of companyCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanyCd_LikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanyCd_NotLikeSearch(String companyCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companyCd), xgetCValueCompanyCd(), "COMPANY_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     * @param companyCd The value of companyCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanyCd_PrefixSearch(String companyCd) {
        setCompanyCd_LikeSearch(companyCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNull() { regCompanyCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNullOrEmpty() { regCompanyCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANY_CD: {varchar(30)}
     */
    public void setCompanyCd_IsNotNull() { regCompanyCd(CK_ISNN, DOBJ); }

    protected void regCompanyCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanyCd(), "COMPANY_CD"); }
    protected abstract ConditionValue xgetCValueCompanyCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_Equal(String companygroup) {
        doSetCompanygroup_Equal(fRES(companygroup));
    }

    protected void doSetCompanygroup_Equal(String companygroup) {
        regCompanygroup(CK_EQ, companygroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_NotEqual(String companygroup) {
        doSetCompanygroup_NotEqual(fRES(companygroup));
    }

    protected void doSetCompanygroup_NotEqual(String companygroup) {
        regCompanygroup(CK_NES, companygroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_GreaterThan(String companygroup) {
        regCompanygroup(CK_GT, fRES(companygroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_LessThan(String companygroup) {
        regCompanygroup(CK_LT, fRES(companygroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_GreaterEqual(String companygroup) {
        regCompanygroup(CK_GE, fRES(companygroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_LessEqual(String companygroup) {
        regCompanygroup(CK_LE, fRES(companygroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroupList The collection of companygroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_InScope(Collection<String> companygroupList) {
        doSetCompanygroup_InScope(companygroupList);
    }

    protected void doSetCompanygroup_InScope(Collection<String> companygroupList) {
        regINS(CK_INS, cTL(companygroupList), xgetCValueCompanygroup(), "COMPANYGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroupList The collection of companygroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_NotInScope(Collection<String> companygroupList) {
        doSetCompanygroup_NotInScope(companygroupList);
    }

    protected void doSetCompanygroup_NotInScope(Collection<String> companygroupList) {
        regINS(CK_NINS, cTL(companygroupList), xgetCValueCompanygroup(), "COMPANYGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYGROUP: {varchar(60)} <br>
     * <pre>e.g. setCompanygroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param companygroup The value of companygroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCompanygroup_LikeSearch(String companygroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(companygroup), xgetCValueCompanygroup(), "COMPANYGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCompanygroup_NotLikeSearch(String companygroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(companygroup), xgetCValueCompanygroup(), "COMPANYGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     * @param companygroup The value of companygroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCompanygroup_PrefixSearch(String companygroup) {
        setCompanygroup_LikeSearch(companygroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     */
    public void setCompanygroup_IsNull() { regCompanygroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     */
    public void setCompanygroup_IsNullOrEmpty() { regCompanygroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COMPANYGROUP: {varchar(60)}
     */
    public void setCompanygroup_IsNotNull() { regCompanygroup(CK_ISNN, DOBJ); }

    protected void regCompanygroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCompanygroup(), "COMPANYGROUP"); }
    protected abstract ConditionValue xgetCValueCompanygroup();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_Equal(String name) {
        doSetName_Equal(fRES(name));
    }

    protected void doSetName_Equal(String name) {
        regName(CK_EQ, name);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotEqual(String name) {
        doSetName_NotEqual(fRES(name));
    }

    protected void doSetName_NotEqual(String name) {
        regName(CK_NES, name);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterThan(String name) {
        regName(CK_GT, fRES(name));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessThan(String name) {
        regName(CK_LT, fRES(name));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_GreaterEqual(String name) {
        regName(CK_GE, fRES(name));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_LessEqual(String name) {
        regName(CK_LE, fRES(name));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param nameList The collection of name as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_InScope(Collection<String> nameList) {
        doSetName_InScope(nameList);
    }

    protected void doSetName_InScope(Collection<String> nameList) {
        regINS(CK_INS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param nameList The collection of name as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_NotInScope(Collection<String> nameList) {
        doSetName_NotInScope(nameList);
    }

    protected void doSetName_NotInScope(Collection<String> nameList) {
        regINS(CK_NINS, cTL(nameList), xgetCValueName(), "NAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, varchar(255)} <br>
     * <pre>e.g. setName_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param name The value of name as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setName_LikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setName_NotLikeSearch(String name, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(name), xgetCValueName(), "NAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NAME: {NotNull, varchar(255)}
     * @param name The value of name as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setName_PrefixSearch(String name) {
        setName_LikeSearch(name, xcLSOPPre());
    }

    protected void regName(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueName(), "NAME"); }
    protected abstract ConditionValue xgetCValueName();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_Equal(String sname) {
        doSetSname_Equal(fRES(sname));
    }

    protected void doSetSname_Equal(String sname) {
        regSname(CK_EQ, sname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotEqual(String sname) {
        doSetSname_NotEqual(fRES(sname));
    }

    protected void doSetSname_NotEqual(String sname) {
        regSname(CK_NES, sname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterThan(String sname) {
        regSname(CK_GT, fRES(sname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessThan(String sname) {
        regSname(CK_LT, fRES(sname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_GreaterEqual(String sname) {
        regSname(CK_GE, fRES(sname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_LessEqual(String sname) {
        regSname(CK_LE, fRES(sname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param snameList The collection of sname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_InScope(Collection<String> snameList) {
        doSetSname_InScope(snameList);
    }

    protected void doSetSname_InScope(Collection<String> snameList) {
        regINS(CK_INS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param snameList The collection of sname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_NotInScope(Collection<String> snameList) {
        doSetSname_NotInScope(snameList);
    }

    protected void doSetSname_NotInScope(Collection<String> snameList) {
        regINS(CK_NINS, cTL(snameList), xgetCValueSname(), "SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {NotNull, varchar(100)} <br>
     * <pre>e.g. setSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sname The value of sname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSname_LikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSname_NotLikeSearch(String sname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sname), xgetCValueSname(), "SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SNAME: {NotNull, varchar(100)}
     * @param sname The value of sname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSname_PrefixSearch(String sname) {
        setSname_LikeSearch(sname, xcLSOPPre());
    }

    protected void regSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSname(), "SNAME"); }
    protected abstract ConditionValue xgetCValueSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_Equal(String aname) {
        doSetAname_Equal(fRES(aname));
    }

    protected void doSetAname_Equal(String aname) {
        regAname(CK_EQ, aname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotEqual(String aname) {
        doSetAname_NotEqual(fRES(aname));
    }

    protected void doSetAname_NotEqual(String aname) {
        regAname(CK_NES, aname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterThan(String aname) {
        regAname(CK_GT, fRES(aname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessThan(String aname) {
        regAname(CK_LT, fRES(aname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_GreaterEqual(String aname) {
        regAname(CK_GE, fRES(aname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_LessEqual(String aname) {
        regAname(CK_LE, fRES(aname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param anameList The collection of aname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_InScope(Collection<String> anameList) {
        doSetAname_InScope(anameList);
    }

    protected void doSetAname_InScope(Collection<String> anameList) {
        regINS(CK_INS, cTL(anameList), xgetCValueAname(), "ANAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param anameList The collection of aname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_NotInScope(Collection<String> anameList) {
        doSetAname_NotInScope(anameList);
    }

    protected void doSetAname_NotInScope(Collection<String> anameList) {
        regINS(CK_NINS, cTL(anameList), xgetCValueAname(), "ANAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {NotNull, varchar(100)} <br>
     * <pre>e.g. setAname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param aname The value of aname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAname_LikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(aname), xgetCValueAname(), "ANAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAname_NotLikeSearch(String aname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(aname), xgetCValueAname(), "ANAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ANAME: {NotNull, varchar(100)}
     * @param aname The value of aname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAname_PrefixSearch(String aname) {
        setAname_LikeSearch(aname, xcLSOPPre());
    }

    protected void regAname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAname(), "ANAME"); }
    protected abstract ConditionValue xgetCValueAname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {varchar(255)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {varchar(255)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {varchar(255)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {varchar(255)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {varchar(255)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {varchar(255)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_Equal(String postno) {
        doSetPostno_Equal(fRES(postno));
    }

    protected void doSetPostno_Equal(String postno) {
        regPostno(CK_EQ, postno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotEqual(String postno) {
        doSetPostno_NotEqual(fRES(postno));
    }

    protected void doSetPostno_NotEqual(String postno) {
        regPostno(CK_NES, postno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterThan(String postno) {
        regPostno(CK_GT, fRES(postno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessThan(String postno) {
        regPostno(CK_LT, fRES(postno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_GreaterEqual(String postno) {
        regPostno(CK_GE, fRES(postno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_LessEqual(String postno) {
        regPostno(CK_LE, fRES(postno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postnoList The collection of postno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_InScope(Collection<String> postnoList) {
        doSetPostno_InScope(postnoList);
    }

    protected void doSetPostno_InScope(Collection<String> postnoList) {
        regINS(CK_INS, cTL(postnoList), xgetCValuePostno(), "POSTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postnoList The collection of postno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_NotInScope(Collection<String> postnoList) {
        doSetPostno_NotInScope(postnoList);
    }

    protected void doSetPostno_NotInScope(Collection<String> postnoList) {
        regINS(CK_NINS, cTL(postnoList), xgetCValuePostno(), "POSTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setPostno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param postno The value of postno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPostno_LikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(postno), xgetCValuePostno(), "POSTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPostno_NotLikeSearch(String postno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(postno), xgetCValuePostno(), "POSTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POSTNO: {NotNull, varchar(30)}
     * @param postno The value of postno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPostno_PrefixSearch(String postno) {
        setPostno_LikeSearch(postno, xcLSOPPre());
    }

    protected void regPostno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePostno(), "POSTNO"); }
    protected abstract ConditionValue xgetCValuePostno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_Equal(String countrycd) {
        doSetCountrycd_Equal(fRES(countrycd));
    }

    protected void doSetCountrycd_Equal(String countrycd) {
        regCountrycd(CK_EQ, countrycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotEqual(String countrycd) {
        doSetCountrycd_NotEqual(fRES(countrycd));
    }

    protected void doSetCountrycd_NotEqual(String countrycd) {
        regCountrycd(CK_NES, countrycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterThan(String countrycd) {
        regCountrycd(CK_GT, fRES(countrycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessThan(String countrycd) {
        regCountrycd(CK_LT, fRES(countrycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_GreaterEqual(String countrycd) {
        regCountrycd(CK_GE, fRES(countrycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_LessEqual(String countrycd) {
        regCountrycd(CK_LE, fRES(countrycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycdList The collection of countrycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_InScope(Collection<String> countrycdList) {
        doSetCountrycd_InScope(countrycdList);
    }

    protected void doSetCountrycd_InScope(Collection<String> countrycdList) {
        regINS(CK_INS, cTL(countrycdList), xgetCValueCountrycd(), "COUNTRYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycdList The collection of countrycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_NotInScope(Collection<String> countrycdList) {
        doSetCountrycd_NotInScope(countrycdList);
    }

    protected void doSetCountrycd_NotInScope(Collection<String> countrycdList) {
        regINS(CK_NINS, cTL(countrycdList), xgetCValueCountrycd(), "COUNTRYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)} <br>
     * <pre>e.g. setCountrycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param countrycd The value of countrycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCountrycd_LikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(countrycd), xgetCValueCountrycd(), "COUNTRYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCountrycd_NotLikeSearch(String countrycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(countrycd), xgetCValueCountrycd(), "COUNTRYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     * @param countrycd The value of countrycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCountrycd_PrefixSearch(String countrycd) {
        setCountrycd_LikeSearch(countrycd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNull() { regCountrycd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNullOrEmpty() { regCountrycd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COUNTRYCD: {varchar(60)}
     */
    public void setCountrycd_IsNotNull() { regCountrycd(CK_ISNN, DOBJ); }

    protected void regCountrycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCountrycd(), "COUNTRYCD"); }
    protected abstract ConditionValue xgetCValueCountrycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_Equal(String portcd) {
        doSetPortcd_Equal(fRES(portcd));
    }

    protected void doSetPortcd_Equal(String portcd) {
        regPortcd(CK_EQ, portcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotEqual(String portcd) {
        doSetPortcd_NotEqual(fRES(portcd));
    }

    protected void doSetPortcd_NotEqual(String portcd) {
        regPortcd(CK_NES, portcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterThan(String portcd) {
        regPortcd(CK_GT, fRES(portcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessThan(String portcd) {
        regPortcd(CK_LT, fRES(portcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_GreaterEqual(String portcd) {
        regPortcd(CK_GE, fRES(portcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_LessEqual(String portcd) {
        regPortcd(CK_LE, fRES(portcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcdList The collection of portcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_InScope(Collection<String> portcdList) {
        doSetPortcd_InScope(portcdList);
    }

    protected void doSetPortcd_InScope(Collection<String> portcdList) {
        regINS(CK_INS, cTL(portcdList), xgetCValuePortcd(), "PORTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcdList The collection of portcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_NotInScope(Collection<String> portcdList) {
        doSetPortcd_NotInScope(portcdList);
    }

    protected void doSetPortcd_NotInScope(Collection<String> portcdList) {
        regINS(CK_NINS, cTL(portcdList), xgetCValuePortcd(), "PORTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)} <br>
     * <pre>e.g. setPortcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param portcd The value of portcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPortcd_LikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(portcd), xgetCValuePortcd(), "PORTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPortcd_NotLikeSearch(String portcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(portcd), xgetCValuePortcd(), "PORTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PORTCD: {varchar(60)}
     * @param portcd The value of portcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPortcd_PrefixSearch(String portcd) {
        setPortcd_LikeSearch(portcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNull() { regPortcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNullOrEmpty() { regPortcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PORTCD: {varchar(60)}
     */
    public void setPortcd_IsNotNull() { regPortcd(CK_ISNN, DOBJ); }

    protected void regPortcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePortcd(), "PORTCD"); }
    protected abstract ConditionValue xgetCValuePortcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_Equal(String districtcd) {
        doSetDistrictcd_Equal(fRES(districtcd));
    }

    protected void doSetDistrictcd_Equal(String districtcd) {
        regDistrictcd(CK_EQ, districtcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotEqual(String districtcd) {
        doSetDistrictcd_NotEqual(fRES(districtcd));
    }

    protected void doSetDistrictcd_NotEqual(String districtcd) {
        regDistrictcd(CK_NES, districtcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterThan(String districtcd) {
        regDistrictcd(CK_GT, fRES(districtcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessThan(String districtcd) {
        regDistrictcd(CK_LT, fRES(districtcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_GreaterEqual(String districtcd) {
        regDistrictcd(CK_GE, fRES(districtcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_LessEqual(String districtcd) {
        regDistrictcd(CK_LE, fRES(districtcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcdList The collection of districtcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_InScope(Collection<String> districtcdList) {
        doSetDistrictcd_InScope(districtcdList);
    }

    protected void doSetDistrictcd_InScope(Collection<String> districtcdList) {
        regINS(CK_INS, cTL(districtcdList), xgetCValueDistrictcd(), "DISTRICTCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcdList The collection of districtcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_NotInScope(Collection<String> districtcdList) {
        doSetDistrictcd_NotInScope(districtcdList);
    }

    protected void doSetDistrictcd_NotInScope(Collection<String> districtcdList) {
        regINS(CK_NINS, cTL(districtcdList), xgetCValueDistrictcd(), "DISTRICTCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)} <br>
     * <pre>e.g. setDistrictcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param districtcd The value of districtcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDistrictcd_LikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(districtcd), xgetCValueDistrictcd(), "DISTRICTCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDistrictcd_NotLikeSearch(String districtcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(districtcd), xgetCValueDistrictcd(), "DISTRICTCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     * @param districtcd The value of districtcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDistrictcd_PrefixSearch(String districtcd) {
        setDistrictcd_LikeSearch(districtcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNull() { regDistrictcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNullOrEmpty() { regDistrictcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DISTRICTCD: {varchar(30)}
     */
    public void setDistrictcd_IsNotNull() { regDistrictcd(CK_ISNN, DOBJ); }

    protected void regDistrictcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDistrictcd(), "DISTRICTCD"); }
    protected abstract ConditionValue xgetCValueDistrictcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_Equal(String phone1) {
        doSetPhone1_Equal(fRES(phone1));
    }

    protected void doSetPhone1_Equal(String phone1) {
        regPhone1(CK_EQ, phone1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_NotEqual(String phone1) {
        doSetPhone1_NotEqual(fRES(phone1));
    }

    protected void doSetPhone1_NotEqual(String phone1) {
        regPhone1(CK_NES, phone1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_GreaterThan(String phone1) {
        regPhone1(CK_GT, fRES(phone1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_LessThan(String phone1) {
        regPhone1(CK_LT, fRES(phone1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_GreaterEqual(String phone1) {
        regPhone1(CK_GE, fRES(phone1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_LessEqual(String phone1) {
        regPhone1(CK_LE, fRES(phone1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1List The collection of phone1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_InScope(Collection<String> phone1List) {
        doSetPhone1_InScope(phone1List);
    }

    protected void doSetPhone1_InScope(Collection<String> phone1List) {
        regINS(CK_INS, cTL(phone1List), xgetCValuePhone1(), "PHONE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1List The collection of phone1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_NotInScope(Collection<String> phone1List) {
        doSetPhone1_NotInScope(phone1List);
    }

    protected void doSetPhone1_NotInScope(Collection<String> phone1List) {
        regINS(CK_NINS, cTL(phone1List), xgetCValuePhone1(), "PHONE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE1: {varchar(60)} <br>
     * <pre>e.g. setPhone1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone1 The value of phone1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone1_LikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone1), xgetCValuePhone1(), "PHONE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone1_NotLikeSearch(String phone1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone1), xgetCValuePhone1(), "PHONE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE1: {varchar(60)}
     * @param phone1 The value of phone1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone1_PrefixSearch(String phone1) {
        setPhone1_LikeSearch(phone1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     */
    public void setPhone1_IsNull() { regPhone1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     */
    public void setPhone1_IsNullOrEmpty() { regPhone1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHONE1: {varchar(60)}
     */
    public void setPhone1_IsNotNull() { regPhone1(CK_ISNN, DOBJ); }

    protected void regPhone1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone1(), "PHONE1"); }
    protected abstract ConditionValue xgetCValuePhone1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_Equal(String phone2) {
        doSetPhone2_Equal(fRES(phone2));
    }

    protected void doSetPhone2_Equal(String phone2) {
        regPhone2(CK_EQ, phone2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_NotEqual(String phone2) {
        doSetPhone2_NotEqual(fRES(phone2));
    }

    protected void doSetPhone2_NotEqual(String phone2) {
        regPhone2(CK_NES, phone2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_GreaterThan(String phone2) {
        regPhone2(CK_GT, fRES(phone2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_LessThan(String phone2) {
        regPhone2(CK_LT, fRES(phone2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_GreaterEqual(String phone2) {
        regPhone2(CK_GE, fRES(phone2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_LessEqual(String phone2) {
        regPhone2(CK_LE, fRES(phone2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2List The collection of phone2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_InScope(Collection<String> phone2List) {
        doSetPhone2_InScope(phone2List);
    }

    protected void doSetPhone2_InScope(Collection<String> phone2List) {
        regINS(CK_INS, cTL(phone2List), xgetCValuePhone2(), "PHONE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2List The collection of phone2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_NotInScope(Collection<String> phone2List) {
        doSetPhone2_NotInScope(phone2List);
    }

    protected void doSetPhone2_NotInScope(Collection<String> phone2List) {
        regINS(CK_NINS, cTL(phone2List), xgetCValuePhone2(), "PHONE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE2: {varchar(60)} <br>
     * <pre>e.g. setPhone2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param phone2 The value of phone2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPhone2_LikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(phone2), xgetCValuePhone2(), "PHONE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPhone2_NotLikeSearch(String phone2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(phone2), xgetCValuePhone2(), "PHONE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PHONE2: {varchar(60)}
     * @param phone2 The value of phone2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPhone2_PrefixSearch(String phone2) {
        setPhone2_LikeSearch(phone2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     */
    public void setPhone2_IsNull() { regPhone2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     */
    public void setPhone2_IsNullOrEmpty() { regPhone2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PHONE2: {varchar(60)}
     */
    public void setPhone2_IsNotNull() { regPhone2(CK_ISNN, DOBJ); }

    protected void regPhone2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePhone2(), "PHONE2"); }
    protected abstract ConditionValue xgetCValuePhone2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_Equal(String fax1) {
        doSetFax1_Equal(fRES(fax1));
    }

    protected void doSetFax1_Equal(String fax1) {
        regFax1(CK_EQ, fax1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotEqual(String fax1) {
        doSetFax1_NotEqual(fRES(fax1));
    }

    protected void doSetFax1_NotEqual(String fax1) {
        regFax1(CK_NES, fax1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterThan(String fax1) {
        regFax1(CK_GT, fRES(fax1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessThan(String fax1) {
        regFax1(CK_LT, fRES(fax1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_GreaterEqual(String fax1) {
        regFax1(CK_GE, fRES(fax1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_LessEqual(String fax1) {
        regFax1(CK_LE, fRES(fax1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_InScope(Collection<String> fax1List) {
        doSetFax1_InScope(fax1List);
    }

    protected void doSetFax1_InScope(Collection<String> fax1List) {
        regINS(CK_INS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1List The collection of fax1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_NotInScope(Collection<String> fax1List) {
        doSetFax1_NotInScope(fax1List);
    }

    protected void doSetFax1_NotInScope(Collection<String> fax1List) {
        regINS(CK_NINS, cTL(fax1List), xgetCValueFax1(), "FAX1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)} <br>
     * <pre>e.g. setFax1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax1 The value of fax1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax1_LikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax1_NotLikeSearch(String fax1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax1), xgetCValueFax1(), "FAX1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX1: {varchar(60)}
     * @param fax1 The value of fax1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax1_PrefixSearch(String fax1) {
        setFax1_LikeSearch(fax1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNull() { regFax1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNullOrEmpty() { regFax1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX1: {varchar(60)}
     */
    public void setFax1_IsNotNull() { regFax1(CK_ISNN, DOBJ); }

    protected void regFax1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax1(), "FAX1"); }
    protected abstract ConditionValue xgetCValueFax1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_Equal(String fax2) {
        doSetFax2_Equal(fRES(fax2));
    }

    protected void doSetFax2_Equal(String fax2) {
        regFax2(CK_EQ, fax2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotEqual(String fax2) {
        doSetFax2_NotEqual(fRES(fax2));
    }

    protected void doSetFax2_NotEqual(String fax2) {
        regFax2(CK_NES, fax2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterThan(String fax2) {
        regFax2(CK_GT, fRES(fax2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessThan(String fax2) {
        regFax2(CK_LT, fRES(fax2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_GreaterEqual(String fax2) {
        regFax2(CK_GE, fRES(fax2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_LessEqual(String fax2) {
        regFax2(CK_LE, fRES(fax2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2List The collection of fax2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_InScope(Collection<String> fax2List) {
        doSetFax2_InScope(fax2List);
    }

    protected void doSetFax2_InScope(Collection<String> fax2List) {
        regINS(CK_INS, cTL(fax2List), xgetCValueFax2(), "FAX2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2List The collection of fax2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_NotInScope(Collection<String> fax2List) {
        doSetFax2_NotInScope(fax2List);
    }

    protected void doSetFax2_NotInScope(Collection<String> fax2List) {
        regINS(CK_NINS, cTL(fax2List), xgetCValueFax2(), "FAX2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX2: {varchar(60)} <br>
     * <pre>e.g. setFax2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fax2 The value of fax2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFax2_LikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fax2), xgetCValueFax2(), "FAX2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFax2_NotLikeSearch(String fax2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fax2), xgetCValueFax2(), "FAX2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FAX2: {varchar(60)}
     * @param fax2 The value of fax2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFax2_PrefixSearch(String fax2) {
        setFax2_LikeSearch(fax2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     */
    public void setFax2_IsNull() { regFax2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     */
    public void setFax2_IsNullOrEmpty() { regFax2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FAX2: {varchar(60)}
     */
    public void setFax2_IsNotNull() { regFax2(CK_ISNN, DOBJ); }

    protected void regFax2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFax2(), "FAX2"); }
    protected abstract ConditionValue xgetCValueFax2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_Equal(String refname) {
        doSetRefname_Equal(fRES(refname));
    }

    protected void doSetRefname_Equal(String refname) {
        regRefname(CK_EQ, refname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotEqual(String refname) {
        doSetRefname_NotEqual(fRES(refname));
    }

    protected void doSetRefname_NotEqual(String refname) {
        regRefname(CK_NES, refname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterThan(String refname) {
        regRefname(CK_GT, fRES(refname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessThan(String refname) {
        regRefname(CK_LT, fRES(refname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_GreaterEqual(String refname) {
        regRefname(CK_GE, fRES(refname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_LessEqual(String refname) {
        regRefname(CK_LE, fRES(refname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refnameList The collection of refname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_InScope(Collection<String> refnameList) {
        doSetRefname_InScope(refnameList);
    }

    protected void doSetRefname_InScope(Collection<String> refnameList) {
        regINS(CK_INS, cTL(refnameList), xgetCValueRefname(), "REFNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refnameList The collection of refname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_NotInScope(Collection<String> refnameList) {
        doSetRefname_NotInScope(refnameList);
    }

    protected void doSetRefname_NotInScope(Collection<String> refnameList) {
        regINS(CK_NINS, cTL(refnameList), xgetCValueRefname(), "REFNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)} <br>
     * <pre>e.g. setRefname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refname The value of refname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefname_LikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refname), xgetCValueRefname(), "REFNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefname_NotLikeSearch(String refname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refname), xgetCValueRefname(), "REFNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNAME: {varchar(60)}
     * @param refname The value of refname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefname_PrefixSearch(String refname) {
        setRefname_LikeSearch(refname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNull() { regRefname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNullOrEmpty() { regRefname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REFNAME: {varchar(60)}
     */
    public void setRefname_IsNotNull() { regRefname(CK_ISNN, DOBJ); }

    protected void regRefname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefname(), "REFNAME"); }
    protected abstract ConditionValue xgetCValueRefname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_Equal(String email) {
        doSetEmail_Equal(fRES(email));
    }

    protected void doSetEmail_Equal(String email) {
        regEmail(CK_EQ, email);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotEqual(String email) {
        doSetEmail_NotEqual(fRES(email));
    }

    protected void doSetEmail_NotEqual(String email) {
        regEmail(CK_NES, email);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterThan(String email) {
        regEmail(CK_GT, fRES(email));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessThan(String email) {
        regEmail(CK_LT, fRES(email));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_GreaterEqual(String email) {
        regEmail(CK_GE, fRES(email));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_LessEqual(String email) {
        regEmail(CK_LE, fRES(email));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param emailList The collection of email as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_InScope(Collection<String> emailList) {
        doSetEmail_InScope(emailList);
    }

    protected void doSetEmail_InScope(Collection<String> emailList) {
        regINS(CK_INS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param emailList The collection of email as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_NotInScope(Collection<String> emailList) {
        doSetEmail_NotInScope(emailList);
    }

    protected void doSetEmail_NotInScope(Collection<String> emailList) {
        regINS(CK_NINS, cTL(emailList), xgetCValueEmail(), "EMAIL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)} <br>
     * <pre>e.g. setEmail_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param email The value of email as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmail_LikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmail_NotLikeSearch(String email, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(email), xgetCValueEmail(), "EMAIL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMAIL: {varchar(255)}
     * @param email The value of email as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmail_PrefixSearch(String email) {
        setEmail_LikeSearch(email, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNull() { regEmail(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNullOrEmpty() { regEmail(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMAIL: {varchar(255)}
     */
    public void setEmail_IsNotNull() { regEmail(CK_ISNN, DOBJ); }

    protected void regEmail(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmail(), "EMAIL"); }
    protected abstract ConditionValue xgetCValueEmail();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_Equal(String url) {
        doSetUrl_Equal(fRES(url));
    }

    protected void doSetUrl_Equal(String url) {
        regUrl(CK_EQ, url);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_NotEqual(String url) {
        doSetUrl_NotEqual(fRES(url));
    }

    protected void doSetUrl_NotEqual(String url) {
        regUrl(CK_NES, url);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_GreaterThan(String url) {
        regUrl(CK_GT, fRES(url));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_LessThan(String url) {
        regUrl(CK_LT, fRES(url));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_GreaterEqual(String url) {
        regUrl(CK_GE, fRES(url));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_LessEqual(String url) {
        regUrl(CK_LE, fRES(url));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL: {varchar(255)}
     * @param urlList The collection of url as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_InScope(Collection<String> urlList) {
        doSetUrl_InScope(urlList);
    }

    protected void doSetUrl_InScope(Collection<String> urlList) {
        regINS(CK_INS, cTL(urlList), xgetCValueUrl(), "URL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * URL: {varchar(255)}
     * @param urlList The collection of url as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_NotInScope(Collection<String> urlList) {
        doSetUrl_NotInScope(urlList);
    }

    protected void doSetUrl_NotInScope(Collection<String> urlList) {
        regINS(CK_NINS, cTL(urlList), xgetCValueUrl(), "URL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {varchar(255)} <br>
     * <pre>e.g. setUrl_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param url The value of url as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUrl_LikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(url), xgetCValueUrl(), "URL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUrl_NotLikeSearch(String url, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(url), xgetCValueUrl(), "URL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * URL: {varchar(255)}
     * @param url The value of url as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUrl_PrefixSearch(String url) {
        setUrl_LikeSearch(url, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     */
    public void setUrl_IsNull() { regUrl(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     */
    public void setUrl_IsNullOrEmpty() { regUrl(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * URL: {varchar(255)}
     */
    public void setUrl_IsNotNull() { regUrl(CK_ISNN, DOBJ); }

    protected void regUrl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUrl(), "URL"); }
    protected abstract ConditionValue xgetCValueUrl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_Equal(java.math.BigDecimal typeowner) {
        doSetTypeowner_Equal(typeowner);
    }

    protected void doSetTypeowner_Equal(java.math.BigDecimal typeowner) {
        regTypeowner(CK_EQ, typeowner);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_NotEqual(java.math.BigDecimal typeowner) {
        doSetTypeowner_NotEqual(typeowner);
    }

    protected void doSetTypeowner_NotEqual(java.math.BigDecimal typeowner) {
        regTypeowner(CK_NES, typeowner);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_GreaterThan(java.math.BigDecimal typeowner) {
        regTypeowner(CK_GT, typeowner);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_LessThan(java.math.BigDecimal typeowner) {
        regTypeowner(CK_LT, typeowner);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_GreaterEqual(java.math.BigDecimal typeowner) {
        regTypeowner(CK_GE, typeowner);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeowner The value of typeowner as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeowner_LessEqual(java.math.BigDecimal typeowner) {
        regTypeowner(CK_LE, typeowner);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typeowner. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeowner. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeowner_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeowner(), "TYPEOWNER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeownerList The collection of typeowner as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeowner_InScope(Collection<java.math.BigDecimal> typeownerList) {
        doSetTypeowner_InScope(typeownerList);
    }

    protected void doSetTypeowner_InScope(Collection<java.math.BigDecimal> typeownerList) {
        regINS(CK_INS, cTL(typeownerList), xgetCValueTypeowner(), "TYPEOWNER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEOWNER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeownerList The collection of typeowner as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeowner_NotInScope(Collection<java.math.BigDecimal> typeownerList) {
        doSetTypeowner_NotInScope(typeownerList);
    }

    protected void doSetTypeowner_NotInScope(Collection<java.math.BigDecimal> typeownerList) {
        regINS(CK_NINS, cTL(typeownerList), xgetCValueTypeowner(), "TYPEOWNER");
    }

    protected void regTypeowner(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeowner(), "TYPEOWNER"); }
    protected abstract ConditionValue xgetCValueTypeowner();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_Equal(java.math.BigDecimal typecustomer) {
        doSetTypecustomer_Equal(typecustomer);
    }

    protected void doSetTypecustomer_Equal(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_EQ, typecustomer);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_NotEqual(java.math.BigDecimal typecustomer) {
        doSetTypecustomer_NotEqual(typecustomer);
    }

    protected void doSetTypecustomer_NotEqual(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_NES, typecustomer);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_GreaterThan(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_GT, typecustomer);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_LessThan(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_LT, typecustomer);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_GreaterEqual(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_GE, typecustomer);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomer The value of typecustomer as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecustomer_LessEqual(java.math.BigDecimal typecustomer) {
        regTypecustomer(CK_LE, typecustomer);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typecustomer. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typecustomer. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypecustomer_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypecustomer(), "TYPECUSTOMER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomerList The collection of typecustomer as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypecustomer_InScope(Collection<java.math.BigDecimal> typecustomerList) {
        doSetTypecustomer_InScope(typecustomerList);
    }

    protected void doSetTypecustomer_InScope(Collection<java.math.BigDecimal> typecustomerList) {
        regINS(CK_INS, cTL(typecustomerList), xgetCValueTypecustomer(), "TYPECUSTOMER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPECUSTOMER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecustomerList The collection of typecustomer as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypecustomer_NotInScope(Collection<java.math.BigDecimal> typecustomerList) {
        doSetTypecustomer_NotInScope(typecustomerList);
    }

    protected void doSetTypecustomer_NotInScope(Collection<java.math.BigDecimal> typecustomerList) {
        regINS(CK_NINS, cTL(typecustomerList), xgetCValueTypecustomer(), "TYPECUSTOMER");
    }

    protected void regTypecustomer(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypecustomer(), "TYPECUSTOMER"); }
    protected abstract ConditionValue xgetCValueTypecustomer();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_Equal(java.math.BigDecimal typeshipto) {
        doSetTypeshipto_Equal(typeshipto);
    }

    protected void doSetTypeshipto_Equal(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_EQ, typeshipto);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_NotEqual(java.math.BigDecimal typeshipto) {
        doSetTypeshipto_NotEqual(typeshipto);
    }

    protected void doSetTypeshipto_NotEqual(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_NES, typeshipto);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_GreaterThan(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_GT, typeshipto);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_LessThan(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_LT, typeshipto);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_GreaterEqual(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_GE, typeshipto);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshipto The value of typeshipto as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeshipto_LessEqual(java.math.BigDecimal typeshipto) {
        regTypeshipto(CK_LE, typeshipto);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typeshipto. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeshipto. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeshipto_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeshipto(), "TYPESHIPTO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshiptoList The collection of typeshipto as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeshipto_InScope(Collection<java.math.BigDecimal> typeshiptoList) {
        doSetTypeshipto_InScope(typeshiptoList);
    }

    protected void doSetTypeshipto_InScope(Collection<java.math.BigDecimal> typeshiptoList) {
        regINS(CK_INS, cTL(typeshiptoList), xgetCValueTypeshipto(), "TYPESHIPTO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPESHIPTO: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeshiptoList The collection of typeshipto as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeshipto_NotInScope(Collection<java.math.BigDecimal> typeshiptoList) {
        doSetTypeshipto_NotInScope(typeshiptoList);
    }

    protected void doSetTypeshipto_NotInScope(Collection<java.math.BigDecimal> typeshiptoList) {
        regINS(CK_NINS, cTL(typeshiptoList), xgetCValueTypeshipto(), "TYPESHIPTO");
    }

    protected void regTypeshipto(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeshipto(), "TYPESHIPTO"); }
    protected abstract ConditionValue xgetCValueTypeshipto();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_Equal(java.math.BigDecimal typesupplier) {
        doSetTypesupplier_Equal(typesupplier);
    }

    protected void doSetTypesupplier_Equal(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_EQ, typesupplier);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_NotEqual(java.math.BigDecimal typesupplier) {
        doSetTypesupplier_NotEqual(typesupplier);
    }

    protected void doSetTypesupplier_NotEqual(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_NES, typesupplier);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_GreaterThan(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_GT, typesupplier);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_LessThan(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_LT, typesupplier);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_GreaterEqual(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_GE, typesupplier);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplier The value of typesupplier as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypesupplier_LessEqual(java.math.BigDecimal typesupplier) {
        regTypesupplier(CK_LE, typesupplier);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typesupplier. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typesupplier. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypesupplier_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypesupplier(), "TYPESUPPLIER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplierList The collection of typesupplier as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypesupplier_InScope(Collection<java.math.BigDecimal> typesupplierList) {
        doSetTypesupplier_InScope(typesupplierList);
    }

    protected void doSetTypesupplier_InScope(Collection<java.math.BigDecimal> typesupplierList) {
        regINS(CK_INS, cTL(typesupplierList), xgetCValueTypesupplier(), "TYPESUPPLIER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPESUPPLIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typesupplierList The collection of typesupplier as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypesupplier_NotInScope(Collection<java.math.BigDecimal> typesupplierList) {
        doSetTypesupplier_NotInScope(typesupplierList);
    }

    protected void doSetTypesupplier_NotInScope(Collection<java.math.BigDecimal> typesupplierList) {
        regINS(CK_NINS, cTL(typesupplierList), xgetCValueTypesupplier(), "TYPESUPPLIER");
    }

    protected void regTypesupplier(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypesupplier(), "TYPESUPPLIER"); }
    protected abstract ConditionValue xgetCValueTypesupplier();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_Equal(java.math.BigDecimal typewarehouse) {
        doSetTypewarehouse_Equal(typewarehouse);
    }

    protected void doSetTypewarehouse_Equal(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_EQ, typewarehouse);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_NotEqual(java.math.BigDecimal typewarehouse) {
        doSetTypewarehouse_NotEqual(typewarehouse);
    }

    protected void doSetTypewarehouse_NotEqual(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_NES, typewarehouse);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_GreaterThan(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_GT, typewarehouse);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_LessThan(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_LT, typewarehouse);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_GreaterEqual(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_GE, typewarehouse);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouse The value of typewarehouse as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypewarehouse_LessEqual(java.math.BigDecimal typewarehouse) {
        regTypewarehouse(CK_LE, typewarehouse);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typewarehouse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typewarehouse. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypewarehouse_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypewarehouse(), "TYPEWAREHOUSE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouseList The collection of typewarehouse as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypewarehouse_InScope(Collection<java.math.BigDecimal> typewarehouseList) {
        doSetTypewarehouse_InScope(typewarehouseList);
    }

    protected void doSetTypewarehouse_InScope(Collection<java.math.BigDecimal> typewarehouseList) {
        regINS(CK_INS, cTL(typewarehouseList), xgetCValueTypewarehouse(), "TYPEWAREHOUSE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEWAREHOUSE: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typewarehouseList The collection of typewarehouse as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypewarehouse_NotInScope(Collection<java.math.BigDecimal> typewarehouseList) {
        doSetTypewarehouse_NotInScope(typewarehouseList);
    }

    protected void doSetTypewarehouse_NotInScope(Collection<java.math.BigDecimal> typewarehouseList) {
        regINS(CK_NINS, cTL(typewarehouseList), xgetCValueTypewarehouse(), "TYPEWAREHOUSE");
    }

    protected void regTypewarehouse(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypewarehouse(), "TYPEWAREHOUSE"); }
    protected abstract ConditionValue xgetCValueTypewarehouse();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_Equal(java.math.BigDecimal typecarrier) {
        doSetTypecarrier_Equal(typecarrier);
    }

    protected void doSetTypecarrier_Equal(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_EQ, typecarrier);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_NotEqual(java.math.BigDecimal typecarrier) {
        doSetTypecarrier_NotEqual(typecarrier);
    }

    protected void doSetTypecarrier_NotEqual(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_NES, typecarrier);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_GreaterThan(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_GT, typecarrier);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_LessThan(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_LT, typecarrier);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_GreaterEqual(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_GE, typecarrier);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrier The value of typecarrier as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypecarrier_LessEqual(java.math.BigDecimal typecarrier) {
        regTypecarrier(CK_LE, typecarrier);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typecarrier. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typecarrier. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypecarrier_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypecarrier(), "TYPECARRIER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrierList The collection of typecarrier as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypecarrier_InScope(Collection<java.math.BigDecimal> typecarrierList) {
        doSetTypecarrier_InScope(typecarrierList);
    }

    protected void doSetTypecarrier_InScope(Collection<java.math.BigDecimal> typecarrierList) {
        regINS(CK_INS, cTL(typecarrierList), xgetCValueTypecarrier(), "TYPECARRIER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPECARRIER: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typecarrierList The collection of typecarrier as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypecarrier_NotInScope(Collection<java.math.BigDecimal> typecarrierList) {
        doSetTypecarrier_NotInScope(typecarrierList);
    }

    protected void doSetTypecarrier_NotInScope(Collection<java.math.BigDecimal> typecarrierList) {
        regINS(CK_NINS, cTL(typecarrierList), xgetCValueTypecarrier(), "TYPECARRIER");
    }

    protected void regTypecarrier(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypecarrier(), "TYPECARRIER"); }
    protected abstract ConditionValue xgetCValueTypecarrier();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_Equal(java.math.BigDecimal typeetc) {
        doSetTypeetc_Equal(typeetc);
    }

    protected void doSetTypeetc_Equal(java.math.BigDecimal typeetc) {
        regTypeetc(CK_EQ, typeetc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_NotEqual(java.math.BigDecimal typeetc) {
        doSetTypeetc_NotEqual(typeetc);
    }

    protected void doSetTypeetc_NotEqual(java.math.BigDecimal typeetc) {
        regTypeetc(CK_NES, typeetc);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_GreaterThan(java.math.BigDecimal typeetc) {
        regTypeetc(CK_GT, typeetc);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_LessThan(java.math.BigDecimal typeetc) {
        regTypeetc(CK_LT, typeetc);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_GreaterEqual(java.math.BigDecimal typeetc) {
        regTypeetc(CK_GE, typeetc);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetc The value of typeetc as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTypeetc_LessEqual(java.math.BigDecimal typeetc) {
        regTypeetc(CK_LE, typeetc);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of typeetc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of typeetc. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTypeetc_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTypeetc(), "TYPEETC", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetcList The collection of typeetc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeetc_InScope(Collection<java.math.BigDecimal> typeetcList) {
        doSetTypeetc_InScope(typeetcList);
    }

    protected void doSetTypeetc_InScope(Collection<java.math.BigDecimal> typeetcList) {
        regINS(CK_INS, cTL(typeetcList), xgetCValueTypeetc(), "TYPEETC");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TYPEETC: {NotNull, decimal(16, 6), default=[(0)]}
     * @param typeetcList The collection of typeetc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTypeetc_NotInScope(Collection<java.math.BigDecimal> typeetcList) {
        doSetTypeetc_NotInScope(typeetcList);
    }

    protected void doSetTypeetc_NotInScope(Collection<java.math.BigDecimal> typeetcList) {
        regINS(CK_NINS, cTL(typeetcList), xgetCValueTypeetc(), "TYPEETC");
    }

    protected void regTypeetc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTypeetc(), "TYPEETC"); }
    protected abstract ConditionValue xgetCValueTypeetc();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_Equal(java.math.BigDecimal ownoranotherflg) {
        doSetOwnoranotherflg_Equal(ownoranotherflg);
    }

    protected void doSetOwnoranotherflg_Equal(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_EQ, ownoranotherflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_NotEqual(java.math.BigDecimal ownoranotherflg) {
        doSetOwnoranotherflg_NotEqual(ownoranotherflg);
    }

    protected void doSetOwnoranotherflg_NotEqual(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_NES, ownoranotherflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_GreaterThan(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_GT, ownoranotherflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_LessThan(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_LT, ownoranotherflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_GreaterEqual(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_GE, ownoranotherflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflg The value of ownoranotherflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_LessEqual(java.math.BigDecimal ownoranotherflg) {
        regOwnoranotherflg(CK_LE, ownoranotherflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of ownoranotherflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ownoranotherflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOwnoranotherflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOwnoranotherflg(), "OWNORANOTHERFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflgList The collection of ownoranotherflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_InScope(Collection<java.math.BigDecimal> ownoranotherflgList) {
        doSetOwnoranotherflg_InScope(ownoranotherflgList);
    }

    protected void doSetOwnoranotherflg_InScope(Collection<java.math.BigDecimal> ownoranotherflgList) {
        regINS(CK_INS, cTL(ownoranotherflgList), xgetCValueOwnoranotherflg(), "OWNORANOTHERFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     * @param ownoranotherflgList The collection of ownoranotherflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnoranotherflg_NotInScope(Collection<java.math.BigDecimal> ownoranotherflgList) {
        doSetOwnoranotherflg_NotInScope(ownoranotherflgList);
    }

    protected void doSetOwnoranotherflg_NotInScope(Collection<java.math.BigDecimal> ownoranotherflgList) {
        regINS(CK_NINS, cTL(ownoranotherflgList), xgetCValueOwnoranotherflg(), "OWNORANOTHERFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setOwnoranotherflg_IsNull() { regOwnoranotherflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNORANOTHERFLG: {decimal(16, 6), default=[(0)]}
     */
    public void setOwnoranotherflg_IsNotNull() { regOwnoranotherflg(CK_ISNN, DOBJ); }

    protected void regOwnoranotherflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnoranotherflg(), "OWNORANOTHERFLG"); }
    protected abstract ConditionValue xgetCValueOwnoranotherflg();

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
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_Equal(String fUser1) {
        doSetFUser1_Equal(fRES(fUser1));
    }

    protected void doSetFUser1_Equal(String fUser1) {
        regFUser1(CK_EQ, fUser1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotEqual(String fUser1) {
        doSetFUser1_NotEqual(fRES(fUser1));
    }

    protected void doSetFUser1_NotEqual(String fUser1) {
        regFUser1(CK_NES, fUser1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterThan(String fUser1) {
        regFUser1(CK_GT, fRES(fUser1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessThan(String fUser1) {
        regFUser1(CK_LT, fRES(fUser1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_GreaterEqual(String fUser1) {
        regFUser1(CK_GE, fRES(fUser1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_LessEqual(String fUser1) {
        regFUser1(CK_LE, fRES(fUser1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_InScope(Collection<String> fUser1List) {
        doSetFUser1_InScope(fUser1List);
    }

    protected void doSetFUser1_InScope(Collection<String> fUser1List) {
        regINS(CK_INS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1List The collection of fUser1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_NotInScope(Collection<String> fUser1List) {
        doSetFUser1_NotInScope(fUser1List);
    }

    protected void doSetFUser1_NotInScope(Collection<String> fUser1List) {
        regINS(CK_NINS, cTL(fUser1List), xgetCValueFUser1(), "F_USER1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)} <br>
     * <pre>e.g. setFUser1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser1 The value of fUser1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser1_LikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser1_NotLikeSearch(String fUser1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser1), xgetCValueFUser1(), "F_USER1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER1: {varchar(30)}
     * @param fUser1 The value of fUser1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser1_PrefixSearch(String fUser1) {
        setFUser1_LikeSearch(fUser1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNull() { regFUser1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNullOrEmpty() { regFUser1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER1: {varchar(30)}
     */
    public void setFUser1_IsNotNull() { regFUser1(CK_ISNN, DOBJ); }

    protected void regFUser1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser1(), "F_USER1"); }
    protected abstract ConditionValue xgetCValueFUser1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_Equal(String fUser2) {
        doSetFUser2_Equal(fRES(fUser2));
    }

    protected void doSetFUser2_Equal(String fUser2) {
        regFUser2(CK_EQ, fUser2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotEqual(String fUser2) {
        doSetFUser2_NotEqual(fRES(fUser2));
    }

    protected void doSetFUser2_NotEqual(String fUser2) {
        regFUser2(CK_NES, fUser2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterThan(String fUser2) {
        regFUser2(CK_GT, fRES(fUser2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessThan(String fUser2) {
        regFUser2(CK_LT, fRES(fUser2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_GreaterEqual(String fUser2) {
        regFUser2(CK_GE, fRES(fUser2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_LessEqual(String fUser2) {
        regFUser2(CK_LE, fRES(fUser2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_InScope(Collection<String> fUser2List) {
        doSetFUser2_InScope(fUser2List);
    }

    protected void doSetFUser2_InScope(Collection<String> fUser2List) {
        regINS(CK_INS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2List The collection of fUser2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_NotInScope(Collection<String> fUser2List) {
        doSetFUser2_NotInScope(fUser2List);
    }

    protected void doSetFUser2_NotInScope(Collection<String> fUser2List) {
        regINS(CK_NINS, cTL(fUser2List), xgetCValueFUser2(), "F_USER2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)} <br>
     * <pre>e.g. setFUser2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser2 The value of fUser2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser2_LikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser2_NotLikeSearch(String fUser2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser2), xgetCValueFUser2(), "F_USER2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER2: {varchar(30)}
     * @param fUser2 The value of fUser2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser2_PrefixSearch(String fUser2) {
        setFUser2_LikeSearch(fUser2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNull() { regFUser2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNullOrEmpty() { regFUser2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER2: {varchar(30)}
     */
    public void setFUser2_IsNotNull() { regFUser2(CK_ISNN, DOBJ); }

    protected void regFUser2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser2(), "F_USER2"); }
    protected abstract ConditionValue xgetCValueFUser2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_Equal(String fUser3) {
        doSetFUser3_Equal(fRES(fUser3));
    }

    protected void doSetFUser3_Equal(String fUser3) {
        regFUser3(CK_EQ, fUser3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotEqual(String fUser3) {
        doSetFUser3_NotEqual(fRES(fUser3));
    }

    protected void doSetFUser3_NotEqual(String fUser3) {
        regFUser3(CK_NES, fUser3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterThan(String fUser3) {
        regFUser3(CK_GT, fRES(fUser3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessThan(String fUser3) {
        regFUser3(CK_LT, fRES(fUser3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_GreaterEqual(String fUser3) {
        regFUser3(CK_GE, fRES(fUser3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_LessEqual(String fUser3) {
        regFUser3(CK_LE, fRES(fUser3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_InScope(Collection<String> fUser3List) {
        doSetFUser3_InScope(fUser3List);
    }

    protected void doSetFUser3_InScope(Collection<String> fUser3List) {
        regINS(CK_INS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3List The collection of fUser3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_NotInScope(Collection<String> fUser3List) {
        doSetFUser3_NotInScope(fUser3List);
    }

    protected void doSetFUser3_NotInScope(Collection<String> fUser3List) {
        regINS(CK_NINS, cTL(fUser3List), xgetCValueFUser3(), "F_USER3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)} <br>
     * <pre>e.g. setFUser3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser3 The value of fUser3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser3_LikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser3_NotLikeSearch(String fUser3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser3), xgetCValueFUser3(), "F_USER3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER3: {varchar(30)}
     * @param fUser3 The value of fUser3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser3_PrefixSearch(String fUser3) {
        setFUser3_LikeSearch(fUser3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNull() { regFUser3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNullOrEmpty() { regFUser3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER3: {varchar(30)}
     */
    public void setFUser3_IsNotNull() { regFUser3(CK_ISNN, DOBJ); }

    protected void regFUser3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser3(), "F_USER3"); }
    protected abstract ConditionValue xgetCValueFUser3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_Equal(String fUser4) {
        doSetFUser4_Equal(fRES(fUser4));
    }

    protected void doSetFUser4_Equal(String fUser4) {
        regFUser4(CK_EQ, fUser4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotEqual(String fUser4) {
        doSetFUser4_NotEqual(fRES(fUser4));
    }

    protected void doSetFUser4_NotEqual(String fUser4) {
        regFUser4(CK_NES, fUser4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterThan(String fUser4) {
        regFUser4(CK_GT, fRES(fUser4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessThan(String fUser4) {
        regFUser4(CK_LT, fRES(fUser4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_GreaterEqual(String fUser4) {
        regFUser4(CK_GE, fRES(fUser4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_LessEqual(String fUser4) {
        regFUser4(CK_LE, fRES(fUser4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_InScope(Collection<String> fUser4List) {
        doSetFUser4_InScope(fUser4List);
    }

    protected void doSetFUser4_InScope(Collection<String> fUser4List) {
        regINS(CK_INS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4List The collection of fUser4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_NotInScope(Collection<String> fUser4List) {
        doSetFUser4_NotInScope(fUser4List);
    }

    protected void doSetFUser4_NotInScope(Collection<String> fUser4List) {
        regINS(CK_NINS, cTL(fUser4List), xgetCValueFUser4(), "F_USER4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)} <br>
     * <pre>e.g. setFUser4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser4 The value of fUser4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser4_LikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser4_NotLikeSearch(String fUser4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser4), xgetCValueFUser4(), "F_USER4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER4: {varchar(30)}
     * @param fUser4 The value of fUser4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser4_PrefixSearch(String fUser4) {
        setFUser4_LikeSearch(fUser4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNull() { regFUser4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNullOrEmpty() { regFUser4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER4: {varchar(30)}
     */
    public void setFUser4_IsNotNull() { regFUser4(CK_ISNN, DOBJ); }

    protected void regFUser4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser4(), "F_USER4"); }
    protected abstract ConditionValue xgetCValueFUser4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_Equal(String fUser5) {
        doSetFUser5_Equal(fRES(fUser5));
    }

    protected void doSetFUser5_Equal(String fUser5) {
        regFUser5(CK_EQ, fUser5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotEqual(String fUser5) {
        doSetFUser5_NotEqual(fRES(fUser5));
    }

    protected void doSetFUser5_NotEqual(String fUser5) {
        regFUser5(CK_NES, fUser5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterThan(String fUser5) {
        regFUser5(CK_GT, fRES(fUser5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessThan(String fUser5) {
        regFUser5(CK_LT, fRES(fUser5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_GreaterEqual(String fUser5) {
        regFUser5(CK_GE, fRES(fUser5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_LessEqual(String fUser5) {
        regFUser5(CK_LE, fRES(fUser5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_InScope(Collection<String> fUser5List) {
        doSetFUser5_InScope(fUser5List);
    }

    protected void doSetFUser5_InScope(Collection<String> fUser5List) {
        regINS(CK_INS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5List The collection of fUser5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_NotInScope(Collection<String> fUser5List) {
        doSetFUser5_NotInScope(fUser5List);
    }

    protected void doSetFUser5_NotInScope(Collection<String> fUser5List) {
        regINS(CK_NINS, cTL(fUser5List), xgetCValueFUser5(), "F_USER5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)} <br>
     * <pre>e.g. setFUser5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param fUser5 The value of fUser5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFUser5_LikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFUser5_NotLikeSearch(String fUser5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(fUser5), xgetCValueFUser5(), "F_USER5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * F_USER5: {varchar(30)}
     * @param fUser5 The value of fUser5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFUser5_PrefixSearch(String fUser5) {
        setFUser5_LikeSearch(fUser5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNull() { regFUser5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNullOrEmpty() { regFUser5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * F_USER5: {varchar(30)}
     */
    public void setFUser5_IsNotNull() { regFUser5(CK_ISNN, DOBJ); }

    protected void regFUser5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFUser5(), "F_USER5"); }
    protected abstract ConditionValue xgetCValueFUser5();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_Equal(java.math.BigDecimal transportpriority) {
        doSetTransportpriority_Equal(transportpriority);
    }

    protected void doSetTransportpriority_Equal(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_EQ, transportpriority);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_NotEqual(java.math.BigDecimal transportpriority) {
        doSetTransportpriority_NotEqual(transportpriority);
    }

    protected void doSetTransportpriority_NotEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_NES, transportpriority);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_GreaterThan(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_GT, transportpriority);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_LessThan(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_LT, transportpriority);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_GreaterEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_GE, transportpriority);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriority The value of transportpriority as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransportpriority_LessEqual(java.math.BigDecimal transportpriority) {
        regTransportpriority(CK_LE, transportpriority);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of transportpriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transportpriority. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransportpriority_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransportpriority(), "TRANSPORTPRIORITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriorityList The collection of transportpriority as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportpriority_InScope(Collection<java.math.BigDecimal> transportpriorityList) {
        doSetTransportpriority_InScope(transportpriorityList);
    }

    protected void doSetTransportpriority_InScope(Collection<java.math.BigDecimal> transportpriorityList) {
        regINS(CK_INS, cTL(transportpriorityList), xgetCValueTransportpriority(), "TRANSPORTPRIORITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     * @param transportpriorityList The collection of transportpriority as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportpriority_NotInScope(Collection<java.math.BigDecimal> transportpriorityList) {
        doSetTransportpriority_NotInScope(transportpriorityList);
    }

    protected void doSetTransportpriority_NotInScope(Collection<java.math.BigDecimal> transportpriorityList) {
        regINS(CK_NINS, cTL(transportpriorityList), xgetCValueTransportpriority(), "TRANSPORTPRIORITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     */
    public void setTransportpriority_IsNull() { regTransportpriority(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSPORTPRIORITY: {decimal(16, 6), default=[(0)]}
     */
    public void setTransportpriority_IsNotNull() { regTransportpriority(CK_ISNN, DOBJ); }

    protected void regTransportpriority(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportpriority(), "TRANSPORTPRIORITY"); }
    protected abstract ConditionValue xgetCValueTransportpriority();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_Equal(String purchasetype) {
        doSetPurchasetype_Equal(fRES(purchasetype));
    }

    protected void doSetPurchasetype_Equal(String purchasetype) {
        regPurchasetype(CK_EQ, purchasetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_NotEqual(String purchasetype) {
        doSetPurchasetype_NotEqual(fRES(purchasetype));
    }

    protected void doSetPurchasetype_NotEqual(String purchasetype) {
        regPurchasetype(CK_NES, purchasetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_GreaterThan(String purchasetype) {
        regPurchasetype(CK_GT, fRES(purchasetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_LessThan(String purchasetype) {
        regPurchasetype(CK_LT, fRES(purchasetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_GreaterEqual(String purchasetype) {
        regPurchasetype(CK_GE, fRES(purchasetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_LessEqual(String purchasetype) {
        regPurchasetype(CK_LE, fRES(purchasetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetypeList The collection of purchasetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_InScope(Collection<String> purchasetypeList) {
        doSetPurchasetype_InScope(purchasetypeList);
    }

    protected void doSetPurchasetype_InScope(Collection<String> purchasetypeList) {
        regINS(CK_INS, cTL(purchasetypeList), xgetCValuePurchasetype(), "PURCHASETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetypeList The collection of purchasetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_NotInScope(Collection<String> purchasetypeList) {
        doSetPurchasetype_NotInScope(purchasetypeList);
    }

    protected void doSetPurchasetype_NotInScope(Collection<String> purchasetypeList) {
        regINS(CK_NINS, cTL(purchasetypeList), xgetCValuePurchasetype(), "PURCHASETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASETYPE: {varchar(30)} <br>
     * <pre>e.g. setPurchasetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchasetype The value of purchasetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchasetype_LikeSearch(String purchasetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchasetype), xgetCValuePurchasetype(), "PURCHASETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchasetype_NotLikeSearch(String purchasetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchasetype), xgetCValuePurchasetype(), "PURCHASETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     * @param purchasetype The value of purchasetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchasetype_PrefixSearch(String purchasetype) {
        setPurchasetype_LikeSearch(purchasetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     */
    public void setPurchasetype_IsNull() { regPurchasetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     */
    public void setPurchasetype_IsNullOrEmpty() { regPurchasetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASETYPE: {varchar(30)}
     */
    public void setPurchasetype_IsNotNull() { regPurchasetype(CK_ISNN, DOBJ); }

    protected void regPurchasetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchasetype(), "PURCHASETYPE"); }
    protected abstract ConditionValue xgetCValuePurchasetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_Equal(String calendarcd) {
        doSetCalendarcd_Equal(fRES(calendarcd));
    }

    protected void doSetCalendarcd_Equal(String calendarcd) {
        regCalendarcd(CK_EQ, calendarcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_NotEqual(String calendarcd) {
        doSetCalendarcd_NotEqual(fRES(calendarcd));
    }

    protected void doSetCalendarcd_NotEqual(String calendarcd) {
        regCalendarcd(CK_NES, calendarcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_GreaterThan(String calendarcd) {
        regCalendarcd(CK_GT, fRES(calendarcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_LessThan(String calendarcd) {
        regCalendarcd(CK_LT, fRES(calendarcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_GreaterEqual(String calendarcd) {
        regCalendarcd(CK_GE, fRES(calendarcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_LessEqual(String calendarcd) {
        regCalendarcd(CK_LE, fRES(calendarcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcdList The collection of calendarcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_InScope(Collection<String> calendarcdList) {
        doSetCalendarcd_InScope(calendarcdList);
    }

    protected void doSetCalendarcd_InScope(Collection<String> calendarcdList) {
        regINS(CK_INS, cTL(calendarcdList), xgetCValueCalendarcd(), "CALENDARCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcdList The collection of calendarcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_NotInScope(Collection<String> calendarcdList) {
        doSetCalendarcd_NotInScope(calendarcdList);
    }

    protected void doSetCalendarcd_NotInScope(Collection<String> calendarcdList) {
        regINS(CK_NINS, cTL(calendarcdList), xgetCValueCalendarcd(), "CALENDARCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDARCD: {IX, varchar(30)} <br>
     * <pre>e.g. setCalendarcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param calendarcd The value of calendarcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCalendarcd_LikeSearch(String calendarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(calendarcd), xgetCValueCalendarcd(), "CALENDARCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCalendarcd_NotLikeSearch(String calendarcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(calendarcd), xgetCValueCalendarcd(), "CALENDARCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     * @param calendarcd The value of calendarcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCalendarcd_PrefixSearch(String calendarcd) {
        setCalendarcd_LikeSearch(calendarcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     */
    public void setCalendarcd_IsNull() { regCalendarcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     */
    public void setCalendarcd_IsNullOrEmpty() { regCalendarcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CALENDARCD: {IX, varchar(30)}
     */
    public void setCalendarcd_IsNotNull() { regCalendarcd(CK_ISNN, DOBJ); }

    protected void regCalendarcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCalendarcd(), "CALENDARCD"); }
    protected abstract ConditionValue xgetCValueCalendarcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_Equal(String ownercustomercd) {
        doSetOwnercustomercd_Equal(fRES(ownercustomercd));
    }

    protected void doSetOwnercustomercd_Equal(String ownercustomercd) {
        regOwnercustomercd(CK_EQ, ownercustomercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_NotEqual(String ownercustomercd) {
        doSetOwnercustomercd_NotEqual(fRES(ownercustomercd));
    }

    protected void doSetOwnercustomercd_NotEqual(String ownercustomercd) {
        regOwnercustomercd(CK_NES, ownercustomercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_GreaterThan(String ownercustomercd) {
        regOwnercustomercd(CK_GT, fRES(ownercustomercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_LessThan(String ownercustomercd) {
        regOwnercustomercd(CK_LT, fRES(ownercustomercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_GreaterEqual(String ownercustomercd) {
        regOwnercustomercd(CK_GE, fRES(ownercustomercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_LessEqual(String ownercustomercd) {
        regOwnercustomercd(CK_LE, fRES(ownercustomercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercdList The collection of ownercustomercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_InScope(Collection<String> ownercustomercdList) {
        doSetOwnercustomercd_InScope(ownercustomercdList);
    }

    protected void doSetOwnercustomercd_InScope(Collection<String> ownercustomercdList) {
        regINS(CK_INS, cTL(ownercustomercdList), xgetCValueOwnercustomercd(), "OWNERCUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercdList The collection of ownercustomercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_NotInScope(Collection<String> ownercustomercdList) {
        doSetOwnercustomercd_NotInScope(ownercustomercdList);
    }

    protected void doSetOwnercustomercd_NotInScope(Collection<String> ownercustomercdList) {
        regINS(CK_NINS, cTL(ownercustomercdList), xgetCValueOwnercustomercd(), "OWNERCUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)} <br>
     * <pre>e.g. setOwnercustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownercustomercd The value of ownercustomercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnercustomercd_LikeSearch(String ownercustomercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownercustomercd), xgetCValueOwnercustomercd(), "OWNERCUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnercustomercd_NotLikeSearch(String ownercustomercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownercustomercd), xgetCValueOwnercustomercd(), "OWNERCUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     * @param ownercustomercd The value of ownercustomercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnercustomercd_PrefixSearch(String ownercustomercd) {
        setOwnercustomercd_LikeSearch(ownercustomercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     */
    public void setOwnercustomercd_IsNull() { regOwnercustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     */
    public void setOwnercustomercd_IsNullOrEmpty() { regOwnercustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERCUSTOMERCD: {varchar(30)}
     */
    public void setOwnercustomercd_IsNotNull() { regOwnercustomercd(CK_ISNN, DOBJ); }

    protected void regOwnercustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnercustomercd(), "OWNERCUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueOwnercustomercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_Equal(String ownersuppliercd) {
        doSetOwnersuppliercd_Equal(fRES(ownersuppliercd));
    }

    protected void doSetOwnersuppliercd_Equal(String ownersuppliercd) {
        regOwnersuppliercd(CK_EQ, ownersuppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_NotEqual(String ownersuppliercd) {
        doSetOwnersuppliercd_NotEqual(fRES(ownersuppliercd));
    }

    protected void doSetOwnersuppliercd_NotEqual(String ownersuppliercd) {
        regOwnersuppliercd(CK_NES, ownersuppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_GreaterThan(String ownersuppliercd) {
        regOwnersuppliercd(CK_GT, fRES(ownersuppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_LessThan(String ownersuppliercd) {
        regOwnersuppliercd(CK_LT, fRES(ownersuppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_GreaterEqual(String ownersuppliercd) {
        regOwnersuppliercd(CK_GE, fRES(ownersuppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_LessEqual(String ownersuppliercd) {
        regOwnersuppliercd(CK_LE, fRES(ownersuppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercdList The collection of ownersuppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_InScope(Collection<String> ownersuppliercdList) {
        doSetOwnersuppliercd_InScope(ownersuppliercdList);
    }

    protected void doSetOwnersuppliercd_InScope(Collection<String> ownersuppliercdList) {
        regINS(CK_INS, cTL(ownersuppliercdList), xgetCValueOwnersuppliercd(), "OWNERSUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercdList The collection of ownersuppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_NotInScope(Collection<String> ownersuppliercdList) {
        doSetOwnersuppliercd_NotInScope(ownersuppliercdList);
    }

    protected void doSetOwnersuppliercd_NotInScope(Collection<String> ownersuppliercdList) {
        regINS(CK_NINS, cTL(ownersuppliercdList), xgetCValueOwnersuppliercd(), "OWNERSUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)} <br>
     * <pre>e.g. setOwnersuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersuppliercd The value of ownersuppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersuppliercd_LikeSearch(String ownersuppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersuppliercd), xgetCValueOwnersuppliercd(), "OWNERSUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersuppliercd_NotLikeSearch(String ownersuppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersuppliercd), xgetCValueOwnersuppliercd(), "OWNERSUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     * @param ownersuppliercd The value of ownersuppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersuppliercd_PrefixSearch(String ownersuppliercd) {
        setOwnersuppliercd_LikeSearch(ownersuppliercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     */
    public void setOwnersuppliercd_IsNull() { regOwnersuppliercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     */
    public void setOwnersuppliercd_IsNullOrEmpty() { regOwnersuppliercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERSUPPLIERCD: {varchar(30)}
     */
    public void setOwnersuppliercd_IsNotNull() { regOwnersuppliercd(CK_ISNN, DOBJ); }

    protected void regOwnersuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersuppliercd(), "OWNERSUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueOwnersuppliercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_Equal(java.math.BigDecimal ownerrefflg) {
        doSetOwnerrefflg_Equal(ownerrefflg);
    }

    protected void doSetOwnerrefflg_Equal(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_EQ, ownerrefflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_NotEqual(java.math.BigDecimal ownerrefflg) {
        doSetOwnerrefflg_NotEqual(ownerrefflg);
    }

    protected void doSetOwnerrefflg_NotEqual(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_NES, ownerrefflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_GreaterThan(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_GT, ownerrefflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_LessThan(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_LT, ownerrefflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_GreaterEqual(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_GE, ownerrefflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflg The value of ownerrefflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setOwnerrefflg_LessEqual(java.math.BigDecimal ownerrefflg) {
        regOwnerrefflg(CK_LE, ownerrefflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of ownerrefflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ownerrefflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setOwnerrefflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueOwnerrefflg(), "OWNERREFFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflgList The collection of ownerrefflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerrefflg_InScope(Collection<java.math.BigDecimal> ownerrefflgList) {
        doSetOwnerrefflg_InScope(ownerrefflgList);
    }

    protected void doSetOwnerrefflg_InScope(Collection<java.math.BigDecimal> ownerrefflgList) {
        regINS(CK_INS, cTL(ownerrefflgList), xgetCValueOwnerrefflg(), "OWNERREFFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * OWNERREFFLG: {NotNull, decimal(16, 6)}
     * @param ownerrefflgList The collection of ownerrefflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerrefflg_NotInScope(Collection<java.math.BigDecimal> ownerrefflgList) {
        doSetOwnerrefflg_NotInScope(ownerrefflgList);
    }

    protected void doSetOwnerrefflg_NotInScope(Collection<java.math.BigDecimal> ownerrefflgList) {
        regINS(CK_NINS, cTL(ownerrefflgList), xgetCValueOwnerrefflg(), "OWNERREFFLG");
    }

    protected void regOwnerrefflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerrefflg(), "OWNERREFFLG"); }
    protected abstract ConditionValue xgetCValueOwnerrefflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_Equal(Long warehouseFuncKbn) {
        doSetWarehouseFuncKbn_Equal(warehouseFuncKbn);
    }

    protected void doSetWarehouseFuncKbn_Equal(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_EQ, warehouseFuncKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_NotEqual(Long warehouseFuncKbn) {
        doSetWarehouseFuncKbn_NotEqual(warehouseFuncKbn);
    }

    protected void doSetWarehouseFuncKbn_NotEqual(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_NES, warehouseFuncKbn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_GreaterThan(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_GT, warehouseFuncKbn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_LessThan(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_LT, warehouseFuncKbn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_GreaterEqual(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_GE, warehouseFuncKbn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbn The value of warehouseFuncKbn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_LessEqual(Long warehouseFuncKbn) {
        regWarehouseFuncKbn(CK_LE, warehouseFuncKbn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param minNumber The min number of warehouseFuncKbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of warehouseFuncKbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWarehouseFuncKbn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWarehouseFuncKbn(), "WAREHOUSE_FUNC_KBN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbnList The collection of warehouseFuncKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_InScope(Collection<Long> warehouseFuncKbnList) {
        doSetWarehouseFuncKbn_InScope(warehouseFuncKbnList);
    }

    protected void doSetWarehouseFuncKbn_InScope(Collection<Long> warehouseFuncKbnList) {
        regINS(CK_INS, cTL(warehouseFuncKbnList), xgetCValueWarehouseFuncKbn(), "WAREHOUSE_FUNC_KBN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     * @param warehouseFuncKbnList The collection of warehouseFuncKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseFuncKbn_NotInScope(Collection<Long> warehouseFuncKbnList) {
        doSetWarehouseFuncKbn_NotInScope(warehouseFuncKbnList);
    }

    protected void doSetWarehouseFuncKbn_NotInScope(Collection<Long> warehouseFuncKbnList) {
        regINS(CK_NINS, cTL(warehouseFuncKbnList), xgetCValueWarehouseFuncKbn(), "WAREHOUSE_FUNC_KBN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     */
    public void setWarehouseFuncKbn_IsNull() { regWarehouseFuncKbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_FUNC_KBN: {bigint(19)}
     */
    public void setWarehouseFuncKbn_IsNotNull() { regWarehouseFuncKbn(CK_ISNN, DOBJ); }

    protected void regWarehouseFuncKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseFuncKbn(), "WAREHOUSE_FUNC_KBN"); }
    protected abstract ConditionValue xgetCValueWarehouseFuncKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_Equal(String dpcd) {
        doSetDpcd_Equal(fRES(dpcd));
    }

    protected void doSetDpcd_Equal(String dpcd) {
        regDpcd(CK_EQ, dpcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotEqual(String dpcd) {
        doSetDpcd_NotEqual(fRES(dpcd));
    }

    protected void doSetDpcd_NotEqual(String dpcd) {
        regDpcd(CK_NES, dpcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterThan(String dpcd) {
        regDpcd(CK_GT, fRES(dpcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessThan(String dpcd) {
        regDpcd(CK_LT, fRES(dpcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_GreaterEqual(String dpcd) {
        regDpcd(CK_GE, fRES(dpcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_LessEqual(String dpcd) {
        regDpcd(CK_LE, fRES(dpcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcdList The collection of dpcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_InScope(Collection<String> dpcdList) {
        doSetDpcd_InScope(dpcdList);
    }

    protected void doSetDpcd_InScope(Collection<String> dpcdList) {
        regINS(CK_INS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcdList The collection of dpcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_NotInScope(Collection<String> dpcdList) {
        doSetDpcd_NotInScope(dpcdList);
    }

    protected void doSetDpcd_NotInScope(Collection<String> dpcdList) {
        regINS(CK_NINS, cTL(dpcdList), xgetCValueDpcd(), "DPCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)} <br>
     * <pre>e.g. setDpcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpcd The value of dpcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpcd_LikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpcd_NotLikeSearch(String dpcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpcd), xgetCValueDpcd(), "DPCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPCD: {varchar(30)}
     * @param dpcd The value of dpcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpcd_PrefixSearch(String dpcd) {
        setDpcd_LikeSearch(dpcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNull() { regDpcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNullOrEmpty() { regDpcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DPCD: {varchar(30)}
     */
    public void setDpcd_IsNotNull() { regDpcd(CK_ISNN, DOBJ); }

    protected void regDpcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpcd(), "DPCD"); }
    protected abstract ConditionValue xgetCValueDpcd();

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
    public HpSLCFunction<MMfcompanyCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MMfcompanyCB.class);
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
    public HpSLCFunction<MMfcompanyCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MMfcompanyCB.class);
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
    public HpSLCFunction<MMfcompanyCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MMfcompanyCB.class);
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
    public HpSLCFunction<MMfcompanyCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MMfcompanyCB.class);
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
    public HpSLCFunction<MMfcompanyCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MMfcompanyCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MMfcompanyCB&gt;() {
     *     public void query(MMfcompanyCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MMfcompanyCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MMfcompanyCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfcompanyCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MMfcompanyCQ sq);

    protected MMfcompanyCB xcreateScalarConditionCB() {
        MMfcompanyCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MMfcompanyCB xcreateScalarConditionPartitionByCB() {
        MMfcompanyCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MMfcompanyCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfcompanyCB cb = new MMfcompanyCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "COMPANY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MMfcompanyCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MMfcompanyCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MMfcompanyCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MMfcompanyCB cb = new MMfcompanyCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "COMPANY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MMfcompanyCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MMfcompanyCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MMfcompanyCB cb = new MMfcompanyCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MMfcompanyCQ sq);

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
    protected MMfcompanyCB newMyCB() {
        return new MMfcompanyCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MMfcompanyCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
