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
 * The abstract condition-query of T_CDTLVMKADM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTCdtlvmkadmCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTCdtlvmkadmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_CDTLVMKADM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_Equal(Long specificationLabelMakeManageId) {
        doSetSpecificationLabelMakeManageId_Equal(specificationLabelMakeManageId);
    }

    protected void doSetSpecificationLabelMakeManageId_Equal(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_EQ, specificationLabelMakeManageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_NotEqual(Long specificationLabelMakeManageId) {
        doSetSpecificationLabelMakeManageId_NotEqual(specificationLabelMakeManageId);
    }

    protected void doSetSpecificationLabelMakeManageId_NotEqual(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_NES, specificationLabelMakeManageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_GreaterThan(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_GT, specificationLabelMakeManageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_LessThan(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_LT, specificationLabelMakeManageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_GreaterEqual(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_GE, specificationLabelMakeManageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageId The value of specificationLabelMakeManageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_LessEqual(Long specificationLabelMakeManageId) {
        regSpecificationLabelMakeManageId(CK_LE, specificationLabelMakeManageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of specificationLabelMakeManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of specificationLabelMakeManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpecificationLabelMakeManageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpecificationLabelMakeManageId(), "SPECIFICATION_LABEL_MAKE_MANAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageIdList The collection of specificationLabelMakeManageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_InScope(Collection<Long> specificationLabelMakeManageIdList) {
        doSetSpecificationLabelMakeManageId_InScope(specificationLabelMakeManageIdList);
    }

    protected void doSetSpecificationLabelMakeManageId_InScope(Collection<Long> specificationLabelMakeManageIdList) {
        regINS(CK_INS, cTL(specificationLabelMakeManageIdList), xgetCValueSpecificationLabelMakeManageId(), "SPECIFICATION_LABEL_MAKE_MANAGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param specificationLabelMakeManageIdList The collection of specificationLabelMakeManageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationLabelMakeManageId_NotInScope(Collection<Long> specificationLabelMakeManageIdList) {
        doSetSpecificationLabelMakeManageId_NotInScope(specificationLabelMakeManageIdList);
    }

    protected void doSetSpecificationLabelMakeManageId_NotInScope(Collection<Long> specificationLabelMakeManageIdList) {
        regINS(CK_NINS, cTL(specificationLabelMakeManageIdList), xgetCValueSpecificationLabelMakeManageId(), "SPECIFICATION_LABEL_MAKE_MANAGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSpecificationLabelMakeManageId_IsNull() { regSpecificationLabelMakeManageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFICATION_LABEL_MAKE_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSpecificationLabelMakeManageId_IsNotNull() { regSpecificationLabelMakeManageId(CK_ISNN, DOBJ); }

    protected void regSpecificationLabelMakeManageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecificationLabelMakeManageId(), "SPECIFICATION_LABEL_MAKE_MANAGE_ID"); }
    protected abstract ConditionValue xgetCValueSpecificationLabelMakeManageId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_Equal(String zzorgncd) {
        doSetZzorgncd_Equal(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_Equal(String zzorgncd) {
        regZzorgncd(CK_EQ, zzorgncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotEqual(String zzorgncd) {
        doSetZzorgncd_NotEqual(fRES(zzorgncd));
    }

    protected void doSetZzorgncd_NotEqual(String zzorgncd) {
        regZzorgncd(CK_NES, zzorgncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterThan(String zzorgncd) {
        regZzorgncd(CK_GT, fRES(zzorgncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessThan(String zzorgncd) {
        regZzorgncd(CK_LT, fRES(zzorgncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_GreaterEqual(String zzorgncd) {
        regZzorgncd(CK_GE, fRES(zzorgncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_LessEqual(String zzorgncd) {
        regZzorgncd(CK_LE, fRES(zzorgncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_InScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_InScope(zzorgncdList);
    }

    protected void doSetZzorgncd_InScope(Collection<String> zzorgncdList) {
        regINS(CK_INS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncdList The collection of zzorgncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        doSetZzorgncd_NotInScope(zzorgncdList);
    }

    protected void doSetZzorgncd_NotInScope(Collection<String> zzorgncdList) {
        regINS(CK_NINS, cTL(zzorgncdList), xgetCValueZzorgncd(), "ZZORGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setZzorgncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zzorgncd The value of zzorgncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZzorgncd_LikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZzorgncd_NotLikeSearch(String zzorgncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zzorgncd), xgetCValueZzorgncd(), "ZZORGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZZORGNCD: {NotNull, varchar(30)}
     * @param zzorgncd The value of zzorgncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZzorgncd_PrefixSearch(String zzorgncd) {
        setZzorgncd_LikeSearch(zzorgncd, xcLSOPPre());
    }

    protected void regZzorgncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZzorgncd(), "ZZORGNCD"); }
    protected abstract ConditionValue xgetCValueZzorgncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_Equal(String srymd) {
        doSetSrymd_Equal(fRES(srymd));
    }

    protected void doSetSrymd_Equal(String srymd) {
        regSrymd(CK_EQ, srymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotEqual(String srymd) {
        doSetSrymd_NotEqual(fRES(srymd));
    }

    protected void doSetSrymd_NotEqual(String srymd) {
        regSrymd(CK_NES, srymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterThan(String srymd) {
        regSrymd(CK_GT, fRES(srymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessThan(String srymd) {
        regSrymd(CK_LT, fRES(srymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_GreaterEqual(String srymd) {
        regSrymd(CK_GE, fRES(srymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_LessEqual(String srymd) {
        regSrymd(CK_LE, fRES(srymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymdList The collection of srymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_InScope(Collection<String> srymdList) {
        doSetSrymd_InScope(srymdList);
    }

    protected void doSetSrymd_InScope(Collection<String> srymdList) {
        regINS(CK_INS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymdList The collection of srymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_NotInScope(Collection<String> srymdList) {
        doSetSrymd_NotInScope(srymdList);
    }

    protected void doSetSrymd_NotInScope(Collection<String> srymdList) {
        regINS(CK_NINS, cTL(srymdList), xgetCValueSrymd(), "SRYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)} <br>
     * <pre>e.g. setSrymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srymd The value of srymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrymd_LikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrymd_NotLikeSearch(String srymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srymd), xgetCValueSrymd(), "SRYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRYMD: {NotNull, varchar(8)}
     * @param srymd The value of srymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrymd_PrefixSearch(String srymd) {
        setSrymd_LikeSearch(srymd, xcLSOPPre());
    }

    protected void regSrymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrymd(), "SRYMD"); }
    protected abstract ConditionValue xgetCValueSrymd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_Equal(Long sroprtcnt) {
        doSetSroprtcnt_Equal(sroprtcnt);
    }

    protected void doSetSroprtcnt_Equal(Long sroprtcnt) {
        regSroprtcnt(CK_EQ, sroprtcnt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotEqual(Long sroprtcnt) {
        doSetSroprtcnt_NotEqual(sroprtcnt);
    }

    protected void doSetSroprtcnt_NotEqual(Long sroprtcnt) {
        regSroprtcnt(CK_NES, sroprtcnt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_InScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_InScope(Collection<Long> sroprtcntList) {
        regINS(CK_INS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {NotNull, bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_Equal(String dlvymd) {
        doSetDlvymd_Equal(fRES(dlvymd));
    }

    protected void doSetDlvymd_Equal(String dlvymd) {
        regDlvymd(CK_EQ, dlvymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotEqual(String dlvymd) {
        doSetDlvymd_NotEqual(fRES(dlvymd));
    }

    protected void doSetDlvymd_NotEqual(String dlvymd) {
        regDlvymd(CK_NES, dlvymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterThan(String dlvymd) {
        regDlvymd(CK_GT, fRES(dlvymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessThan(String dlvymd) {
        regDlvymd(CK_LT, fRES(dlvymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_GreaterEqual(String dlvymd) {
        regDlvymd(CK_GE, fRES(dlvymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_LessEqual(String dlvymd) {
        regDlvymd(CK_LE, fRES(dlvymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymdList The collection of dlvymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_InScope(Collection<String> dlvymdList) {
        doSetDlvymd_InScope(dlvymdList);
    }

    protected void doSetDlvymd_InScope(Collection<String> dlvymdList) {
        regINS(CK_INS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymdList The collection of dlvymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_NotInScope(Collection<String> dlvymdList) {
        doSetDlvymd_NotInScope(dlvymdList);
    }

    protected void doSetDlvymd_NotInScope(Collection<String> dlvymdList) {
        regINS(CK_NINS, cTL(dlvymdList), xgetCValueDlvymd(), "DLVYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)} <br>
     * <pre>e.g. setDlvymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dlvymd The value of dlvymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDlvymd_LikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDlvymd_NotLikeSearch(String dlvymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dlvymd), xgetCValueDlvymd(), "DLVYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DLVYMD: {varchar(8)}
     * @param dlvymd The value of dlvymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDlvymd_PrefixSearch(String dlvymd) {
        setDlvymd_LikeSearch(dlvymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNull() { regDlvymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNullOrEmpty() { regDlvymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DLVYMD: {varchar(8)}
     */
    public void setDlvymd_IsNotNull() { regDlvymd(CK_ISNN, DOBJ); }

    protected void regDlvymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDlvymd(), "DLVYMD"); }
    protected abstract ConditionValue xgetCValueDlvymd();

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
     * DED: {varchar(30)}
     * @param ded The value of ded as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_Equal(String ded) {
        doSetDed_Equal(fRES(ded));
    }

    protected void doSetDed_Equal(String ded) {
        regDed(CK_EQ, ded);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotEqual(String ded) {
        doSetDed_NotEqual(fRES(ded));
    }

    protected void doSetDed_NotEqual(String ded) {
        regDed(CK_NES, ded);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterThan(String ded) {
        regDed(CK_GT, fRES(ded));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessThan(String ded) {
        regDed(CK_LT, fRES(ded));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_GreaterEqual(String ded) {
        regDed(CK_GE, fRES(ded));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_LessEqual(String ded) {
        regDed(CK_LE, fRES(ded));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param dedList The collection of ded as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_InScope(Collection<String> dedList) {
        doSetDed_InScope(dedList);
    }

    protected void doSetDed_InScope(Collection<String> dedList) {
        regINS(CK_INS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param dedList The collection of ded as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_NotInScope(Collection<String> dedList) {
        doSetDed_NotInScope(dedList);
    }

    protected void doSetDed_NotInScope(Collection<String> dedList) {
        regINS(CK_NINS, cTL(dedList), xgetCValueDed(), "DED");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)} <br>
     * <pre>e.g. setDed_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ded The value of ded as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDed_LikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDed_NotLikeSearch(String ded, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ded), xgetCValueDed(), "DED", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DED: {varchar(30)}
     * @param ded The value of ded as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDed_PrefixSearch(String ded) {
        setDed_LikeSearch(ded, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNull() { regDed(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNullOrEmpty() { regDed(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DED: {varchar(30)}
     */
    public void setDed_IsNotNull() { regDed(CK_ISNN, DOBJ); }

    protected void regDed(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDed(), "DED"); }
    protected abstract ConditionValue xgetCValueDed();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_Equal(String pstnid) {
        doSetPstnid_Equal(fRES(pstnid));
    }

    protected void doSetPstnid_Equal(String pstnid) {
        regPstnid(CK_EQ, pstnid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotEqual(String pstnid) {
        doSetPstnid_NotEqual(fRES(pstnid));
    }

    protected void doSetPstnid_NotEqual(String pstnid) {
        regPstnid(CK_NES, pstnid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterThan(String pstnid) {
        regPstnid(CK_GT, fRES(pstnid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessThan(String pstnid) {
        regPstnid(CK_LT, fRES(pstnid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_GreaterEqual(String pstnid) {
        regPstnid(CK_GE, fRES(pstnid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_LessEqual(String pstnid) {
        regPstnid(CK_LE, fRES(pstnid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnidList The collection of pstnid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_InScope(Collection<String> pstnidList) {
        doSetPstnid_InScope(pstnidList);
    }

    protected void doSetPstnid_InScope(Collection<String> pstnidList) {
        regINS(CK_INS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnidList The collection of pstnid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_NotInScope(Collection<String> pstnidList) {
        doSetPstnid_NotInScope(pstnidList);
    }

    protected void doSetPstnid_NotInScope(Collection<String> pstnidList) {
        regINS(CK_NINS, cTL(pstnidList), xgetCValuePstnid(), "PSTNID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(30)} <br>
     * <pre>e.g. setPstnid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pstnid The value of pstnid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPstnid_LikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPstnid_NotLikeSearch(String pstnid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pstnid), xgetCValuePstnid(), "PSTNID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSTNID: {varchar(30)}
     * @param pstnid The value of pstnid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPstnid_PrefixSearch(String pstnid) {
        setPstnid_LikeSearch(pstnid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     */
    public void setPstnid_IsNull() { regPstnid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     */
    public void setPstnid_IsNullOrEmpty() { regPstnid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSTNID: {varchar(30)}
     */
    public void setPstnid_IsNotNull() { regPstnid(CK_ISNN, DOBJ); }

    protected void regPstnid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePstnid(), "PSTNID"); }
    protected abstract ConditionValue xgetCValuePstnid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_Equal(String linblk) {
        doSetLinblk_Equal(fRES(linblk));
    }

    protected void doSetLinblk_Equal(String linblk) {
        regLinblk(CK_EQ, linblk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotEqual(String linblk) {
        doSetLinblk_NotEqual(fRES(linblk));
    }

    protected void doSetLinblk_NotEqual(String linblk) {
        regLinblk(CK_NES, linblk);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterThan(String linblk) {
        regLinblk(CK_GT, fRES(linblk));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessThan(String linblk) {
        regLinblk(CK_LT, fRES(linblk));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_GreaterEqual(String linblk) {
        regLinblk(CK_GE, fRES(linblk));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_LessEqual(String linblk) {
        regLinblk(CK_LE, fRES(linblk));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblkList The collection of linblk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_InScope(Collection<String> linblkList) {
        doSetLinblk_InScope(linblkList);
    }

    protected void doSetLinblk_InScope(Collection<String> linblkList) {
        regINS(CK_INS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblkList The collection of linblk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_NotInScope(Collection<String> linblkList) {
        doSetLinblk_NotInScope(linblkList);
    }

    protected void doSetLinblk_NotInScope(Collection<String> linblkList) {
        regINS(CK_NINS, cTL(linblkList), xgetCValueLinblk(), "LINBLK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)} <br>
     * <pre>e.g. setLinblk_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk The value of linblk as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk_LikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk_NotLikeSearch(String linblk, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk), xgetCValueLinblk(), "LINBLK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK: {varchar(30)}
     * @param linblk The value of linblk as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk_PrefixSearch(String linblk) {
        setLinblk_LikeSearch(linblk, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNull() { regLinblk(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNullOrEmpty() { regLinblk(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK: {varchar(30)}
     */
    public void setLinblk_IsNotNull() { regLinblk(CK_ISNN, DOBJ); }

    protected void regLinblk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk(), "LINBLK"); }
    protected abstract ConditionValue xgetCValueLinblk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_Equal(Long srrnk) {
        doSetSrrnk_Equal(srrnk);
    }

    protected void doSetSrrnk_Equal(Long srrnk) {
        regSrrnk(CK_EQ, srrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_NotEqual(Long srrnk) {
        doSetSrrnk_NotEqual(srrnk);
    }

    protected void doSetSrrnk_NotEqual(Long srrnk) {
        regSrrnk(CK_NES, srrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterThan(Long srrnk) {
        regSrrnk(CK_GT, srrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessThan(Long srrnk) {
        regSrrnk(CK_LT, srrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_GreaterEqual(Long srrnk) {
        regSrrnk(CK_GE, srrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnk The value of srrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrrnk_LessEqual(Long srrnk) {
        regSrrnk(CK_LE, srrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param minNumber The min number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrrnk(), "SRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_InScope(Collection<Long> srrnkList) {
        doSetSrrnk_InScope(srrnkList);
    }

    protected void doSetSrrnk_InScope(Collection<Long> srrnkList) {
        regINS(CK_INS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRRNK: {bigint(19)}
     * @param srrnkList The collection of srrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrrnk_NotInScope(Collection<Long> srrnkList) {
        doSetSrrnk_NotInScope(srrnkList);
    }

    protected void doSetSrrnk_NotInScope(Collection<Long> srrnkList) {
        regINS(CK_NINS, cTL(srrnkList), xgetCValueSrrnk(), "SRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNull() { regSrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRRNK: {bigint(19)}
     */
    public void setSrrnk_IsNotNull() { regSrrnk(CK_ISNN, DOBJ); }

    protected void regSrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrrnk(), "SRRNK"); }
    protected abstract ConditionValue xgetCValueSrrnk();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * @param mkdtm The value of mkdtm as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMkdtm_Equal(java.sql.Timestamp mkdtm) {
        regMkdtm(CK_EQ,  mkdtm);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * @param mkdtm The value of mkdtm as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMkdtm_GreaterThan(java.sql.Timestamp mkdtm) {
        regMkdtm(CK_GT,  mkdtm);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * @param mkdtm The value of mkdtm as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMkdtm_LessThan(java.sql.Timestamp mkdtm) {
        regMkdtm(CK_LT,  mkdtm);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * @param mkdtm The value of mkdtm as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMkdtm_GreaterEqual(java.sql.Timestamp mkdtm) {
        regMkdtm(CK_GE,  mkdtm);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * @param mkdtm The value of mkdtm as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMkdtm_LessEqual(java.sql.Timestamp mkdtm) {
        regMkdtm(CK_LE, mkdtm);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * <pre>e.g. setMkdtm_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mkdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of mkdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setMkdtm_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueMkdtm(), "MKDTM", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of mkdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of mkdtm. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setMkdtm_DateFromTo(Date fromDate, Date toDate) {
        setMkdtm_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     */
    public void setMkdtm_IsNull() { regMkdtm(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MKDTM: {datetime2(26, 6)}
     */
    public void setMkdtm_IsNotNull() { regMkdtm(CK_ISNN, DOBJ); }

    protected void regMkdtm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMkdtm(), "MKDTM"); }
    protected abstract ConditionValue xgetCValueMkdtm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_Equal(String lstdsymd) {
        doSetLstdsymd_Equal(fRES(lstdsymd));
    }

    protected void doSetLstdsymd_Equal(String lstdsymd) {
        regLstdsymd(CK_EQ, lstdsymd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_NotEqual(String lstdsymd) {
        doSetLstdsymd_NotEqual(fRES(lstdsymd));
    }

    protected void doSetLstdsymd_NotEqual(String lstdsymd) {
        regLstdsymd(CK_NES, lstdsymd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_GreaterThan(String lstdsymd) {
        regLstdsymd(CK_GT, fRES(lstdsymd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_LessThan(String lstdsymd) {
        regLstdsymd(CK_LT, fRES(lstdsymd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_GreaterEqual(String lstdsymd) {
        regLstdsymd(CK_GE, fRES(lstdsymd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_LessEqual(String lstdsymd) {
        regLstdsymd(CK_LE, fRES(lstdsymd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymdList The collection of lstdsymd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_InScope(Collection<String> lstdsymdList) {
        doSetLstdsymd_InScope(lstdsymdList);
    }

    protected void doSetLstdsymd_InScope(Collection<String> lstdsymdList) {
        regINS(CK_INS, cTL(lstdsymdList), xgetCValueLstdsymd(), "LSTDSYMD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymdList The collection of lstdsymd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_NotInScope(Collection<String> lstdsymdList) {
        doSetLstdsymd_NotInScope(lstdsymdList);
    }

    protected void doSetLstdsymd_NotInScope(Collection<String> lstdsymdList) {
        regINS(CK_NINS, cTL(lstdsymdList), xgetCValueLstdsymd(), "LSTDSYMD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LSTDSYMD: {varchar(8)} <br>
     * <pre>e.g. setLstdsymd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lstdsymd The value of lstdsymd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLstdsymd_LikeSearch(String lstdsymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lstdsymd), xgetCValueLstdsymd(), "LSTDSYMD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLstdsymd_NotLikeSearch(String lstdsymd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lstdsymd), xgetCValueLstdsymd(), "LSTDSYMD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     * @param lstdsymd The value of lstdsymd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLstdsymd_PrefixSearch(String lstdsymd) {
        setLstdsymd_LikeSearch(lstdsymd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     */
    public void setLstdsymd_IsNull() { regLstdsymd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     */
    public void setLstdsymd_IsNullOrEmpty() { regLstdsymd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LSTDSYMD: {varchar(8)}
     */
    public void setLstdsymd_IsNotNull() { regLstdsymd(CK_ISNN, DOBJ); }

    protected void regLstdsymd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLstdsymd(), "LSTDSYMD"); }
    protected abstract ConditionValue xgetCValueLstdsymd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_Equal(String srlincd) {
        doSetSrlincd_Equal(fRES(srlincd));
    }

    protected void doSetSrlincd_Equal(String srlincd) {
        regSrlincd(CK_EQ, srlincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotEqual(String srlincd) {
        doSetSrlincd_NotEqual(fRES(srlincd));
    }

    protected void doSetSrlincd_NotEqual(String srlincd) {
        regSrlincd(CK_NES, srlincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterThan(String srlincd) {
        regSrlincd(CK_GT, fRES(srlincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessThan(String srlincd) {
        regSrlincd(CK_LT, fRES(srlincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_GreaterEqual(String srlincd) {
        regSrlincd(CK_GE, fRES(srlincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_LessEqual(String srlincd) {
        regSrlincd(CK_LE, fRES(srlincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_InScope(Collection<String> srlincdList) {
        doSetSrlincd_InScope(srlincdList);
    }

    protected void doSetSrlincd_InScope(Collection<String> srlincdList) {
        regINS(CK_INS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincdList The collection of srlincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_NotInScope(Collection<String> srlincdList) {
        doSetSrlincd_NotInScope(srlincdList);
    }

    protected void doSetSrlincd_NotInScope(Collection<String> srlincdList) {
        regINS(CK_NINS, cTL(srlincdList), xgetCValueSrlincd(), "SRLINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)} <br>
     * <pre>e.g. setSrlincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srlincd The value of srlincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrlincd_LikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrlincd_NotLikeSearch(String srlincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srlincd), xgetCValueSrlincd(), "SRLINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRLINCD: {varchar(30)}
     * @param srlincd The value of srlincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrlincd_PrefixSearch(String srlincd) {
        setSrlincd_LikeSearch(srlincd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNull() { regSrlincd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNullOrEmpty() { regSrlincd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRLINCD: {varchar(30)}
     */
    public void setSrlincd_IsNotNull() { regSrlincd(CK_ISNN, DOBJ); }

    protected void regSrlincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrlincd(), "SRLINCD"); }
    protected abstract ConditionValue xgetCValueSrlincd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_Equal(Long srsrrnk) {
        doSetSrsrrnk_Equal(srsrrnk);
    }

    protected void doSetSrsrrnk_Equal(Long srsrrnk) {
        regSrsrrnk(CK_EQ, srsrrnk);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_NotEqual(Long srsrrnk) {
        doSetSrsrrnk_NotEqual(srsrrnk);
    }

    protected void doSetSrsrrnk_NotEqual(Long srsrrnk) {
        regSrsrrnk(CK_NES, srsrrnk);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_GreaterThan(Long srsrrnk) {
        regSrsrrnk(CK_GT, srsrrnk);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_LessThan(Long srsrrnk) {
        regSrsrrnk(CK_LT, srsrrnk);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_GreaterEqual(Long srsrrnk) {
        regSrsrrnk(CK_GE, srsrrnk);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnk The value of srsrrnk as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSrsrrnk_LessEqual(Long srsrrnk) {
        regSrsrrnk(CK_LE, srsrrnk);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param minNumber The min number of srsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of srsrrnk. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSrsrrnk_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSrsrrnk(), "SRSRRNK", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnkList The collection of srsrrnk as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrrnk_InScope(Collection<Long> srsrrnkList) {
        doSetSrsrrnk_InScope(srsrrnkList);
    }

    protected void doSetSrsrrnk_InScope(Collection<Long> srsrrnkList) {
        regINS(CK_INS, cTL(srsrrnkList), xgetCValueSrsrrnk(), "SRSRRNK");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SRSRRNK: {bigint(19)}
     * @param srsrrnkList The collection of srsrrnk as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrsrrnk_NotInScope(Collection<Long> srsrrnkList) {
        doSetSrsrrnk_NotInScope(srsrrnkList);
    }

    protected void doSetSrsrrnk_NotInScope(Collection<Long> srsrrnkList) {
        regINS(CK_NINS, cTL(srsrrnkList), xgetCValueSrsrrnk(), "SRSRRNK");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     */
    public void setSrsrrnk_IsNull() { regSrsrrnk(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRSRRNK: {bigint(19)}
     */
    public void setSrsrrnk_IsNotNull() { regSrsrrnk(CK_ISNN, DOBJ); }

    protected void regSrsrrnk(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrsrrnk(), "SRSRRNK"); }
    protected abstract ConditionValue xgetCValueSrsrrnk();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_Equal(String specificationPrintedflg) {
        doSetSpecificationPrintedflg_Equal(fRES(specificationPrintedflg));
    }

    protected void doSetSpecificationPrintedflg_Equal(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_EQ, specificationPrintedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_NotEqual(String specificationPrintedflg) {
        doSetSpecificationPrintedflg_NotEqual(fRES(specificationPrintedflg));
    }

    protected void doSetSpecificationPrintedflg_NotEqual(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_NES, specificationPrintedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_GreaterThan(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_GT, fRES(specificationPrintedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_LessThan(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_LT, fRES(specificationPrintedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_GreaterEqual(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_GE, fRES(specificationPrintedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_LessEqual(String specificationPrintedflg) {
        regSpecificationPrintedflg(CK_LE, fRES(specificationPrintedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflgList The collection of specificationPrintedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_InScope(Collection<String> specificationPrintedflgList) {
        doSetSpecificationPrintedflg_InScope(specificationPrintedflgList);
    }

    protected void doSetSpecificationPrintedflg_InScope(Collection<String> specificationPrintedflgList) {
        regINS(CK_INS, cTL(specificationPrintedflgList), xgetCValueSpecificationPrintedflg(), "SPECIFICATION_PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflgList The collection of specificationPrintedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_NotInScope(Collection<String> specificationPrintedflgList) {
        doSetSpecificationPrintedflg_NotInScope(specificationPrintedflgList);
    }

    protected void doSetSpecificationPrintedflg_NotInScope(Collection<String> specificationPrintedflgList) {
        regINS(CK_NINS, cTL(specificationPrintedflgList), xgetCValueSpecificationPrintedflg(), "SPECIFICATION_PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)} <br>
     * <pre>e.g. setSpecificationPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specificationPrintedflg The value of specificationPrintedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecificationPrintedflg_LikeSearch(String specificationPrintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specificationPrintedflg), xgetCValueSpecificationPrintedflg(), "SPECIFICATION_PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecificationPrintedflg_NotLikeSearch(String specificationPrintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specificationPrintedflg), xgetCValueSpecificationPrintedflg(), "SPECIFICATION_PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     * @param specificationPrintedflg The value of specificationPrintedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecificationPrintedflg_PrefixSearch(String specificationPrintedflg) {
        setSpecificationPrintedflg_LikeSearch(specificationPrintedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     */
    public void setSpecificationPrintedflg_IsNull() { regSpecificationPrintedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFICATION_PRINTEDFLG: {char(1)}
     */
    public void setSpecificationPrintedflg_IsNotNull() { regSpecificationPrintedflg(CK_ISNN, DOBJ); }

    protected void regSpecificationPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecificationPrintedflg(), "SPECIFICATION_PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValueSpecificationPrintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_Equal(String labelPrintedflg) {
        doSetLabelPrintedflg_Equal(fRES(labelPrintedflg));
    }

    protected void doSetLabelPrintedflg_Equal(String labelPrintedflg) {
        regLabelPrintedflg(CK_EQ, labelPrintedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_NotEqual(String labelPrintedflg) {
        doSetLabelPrintedflg_NotEqual(fRES(labelPrintedflg));
    }

    protected void doSetLabelPrintedflg_NotEqual(String labelPrintedflg) {
        regLabelPrintedflg(CK_NES, labelPrintedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_GreaterThan(String labelPrintedflg) {
        regLabelPrintedflg(CK_GT, fRES(labelPrintedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_LessThan(String labelPrintedflg) {
        regLabelPrintedflg(CK_LT, fRES(labelPrintedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_GreaterEqual(String labelPrintedflg) {
        regLabelPrintedflg(CK_GE, fRES(labelPrintedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_LessEqual(String labelPrintedflg) {
        regLabelPrintedflg(CK_LE, fRES(labelPrintedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflgList The collection of labelPrintedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_InScope(Collection<String> labelPrintedflgList) {
        doSetLabelPrintedflg_InScope(labelPrintedflgList);
    }

    protected void doSetLabelPrintedflg_InScope(Collection<String> labelPrintedflgList) {
        regINS(CK_INS, cTL(labelPrintedflgList), xgetCValueLabelPrintedflg(), "LABEL_PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflgList The collection of labelPrintedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_NotInScope(Collection<String> labelPrintedflgList) {
        doSetLabelPrintedflg_NotInScope(labelPrintedflgList);
    }

    protected void doSetLabelPrintedflg_NotInScope(Collection<String> labelPrintedflgList) {
        regINS(CK_NINS, cTL(labelPrintedflgList), xgetCValueLabelPrintedflg(), "LABEL_PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)} <br>
     * <pre>e.g. setLabelPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param labelPrintedflg The value of labelPrintedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLabelPrintedflg_LikeSearch(String labelPrintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(labelPrintedflg), xgetCValueLabelPrintedflg(), "LABEL_PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLabelPrintedflg_NotLikeSearch(String labelPrintedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(labelPrintedflg), xgetCValueLabelPrintedflg(), "LABEL_PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     * @param labelPrintedflg The value of labelPrintedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLabelPrintedflg_PrefixSearch(String labelPrintedflg) {
        setLabelPrintedflg_LikeSearch(labelPrintedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     */
    public void setLabelPrintedflg_IsNull() { regLabelPrintedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LABEL_PRINTEDFLG: {char(1)}
     */
    public void setLabelPrintedflg_IsNotNull() { regLabelPrintedflg(CK_ISNN, DOBJ); }

    protected void regLabelPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLabelPrintedflg(), "LABEL_PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValueLabelPrintedflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_Equal(Long reportId) {
        doSetReportId_Equal(reportId);
    }

    protected void doSetReportId_Equal(Long reportId) {
        regReportId(CK_EQ, reportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_NotEqual(Long reportId) {
        doSetReportId_NotEqual(reportId);
    }

    protected void doSetReportId_NotEqual(Long reportId) {
        regReportId(CK_NES, reportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterThan(Long reportId) {
        regReportId(CK_GT, reportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessThan(Long reportId) {
        regReportId(CK_LT, reportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_GreaterEqual(Long reportId) {
        regReportId(CK_GE, reportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportId The value of reportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportId_LessEqual(Long reportId) {
        regReportId(CK_LE, reportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param minNumber The min number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of reportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReportId(), "REPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportIdList The collection of reportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_InScope(Collection<Long> reportIdList) {
        doSetReportId_InScope(reportIdList);
    }

    protected void doSetReportId_InScope(Collection<Long> reportIdList) {
        regINS(CK_INS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPORT_ID: {bigint(19)}
     * @param reportIdList The collection of reportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportId_NotInScope(Collection<Long> reportIdList) {
        doSetReportId_NotInScope(reportIdList);
    }

    protected void doSetReportId_NotInScope(Collection<Long> reportIdList) {
        regINS(CK_NINS, cTL(reportIdList), xgetCValueReportId(), "REPORT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     */
    public void setReportId_IsNull() { regReportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_ID: {bigint(19)}
     */
    public void setReportId_IsNotNull() { regReportId(CK_ISNN, DOBJ); }

    protected void regReportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportId(), "REPORT_ID"); }
    protected abstract ConditionValue xgetCValueReportId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_Equal(String reportNm) {
        doSetReportNm_Equal(fRES(reportNm));
    }

    protected void doSetReportNm_Equal(String reportNm) {
        regReportNm(CK_EQ, reportNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotEqual(String reportNm) {
        doSetReportNm_NotEqual(fRES(reportNm));
    }

    protected void doSetReportNm_NotEqual(String reportNm) {
        regReportNm(CK_NES, reportNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterThan(String reportNm) {
        regReportNm(CK_GT, fRES(reportNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessThan(String reportNm) {
        regReportNm(CK_LT, fRES(reportNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_GreaterEqual(String reportNm) {
        regReportNm(CK_GE, fRES(reportNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_LessEqual(String reportNm) {
        regReportNm(CK_LE, fRES(reportNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNmList The collection of reportNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_InScope(Collection<String> reportNmList) {
        doSetReportNm_InScope(reportNmList);
    }

    protected void doSetReportNm_InScope(Collection<String> reportNmList) {
        regINS(CK_INS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNmList The collection of reportNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_NotInScope(Collection<String> reportNmList) {
        doSetReportNm_NotInScope(reportNmList);
    }

    protected void doSetReportNm_NotInScope(Collection<String> reportNmList) {
        regINS(CK_NINS, cTL(reportNmList), xgetCValueReportNm(), "REPORT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {varchar(30)} <br>
     * <pre>e.g. setReportNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reportNm The value of reportNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReportNm_LikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReportNm_NotLikeSearch(String reportNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reportNm), xgetCValueReportNm(), "REPORT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPORT_NM: {varchar(30)}
     * @param reportNm The value of reportNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReportNm_PrefixSearch(String reportNm) {
        setReportNm_LikeSearch(reportNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     */
    public void setReportNm_IsNull() { regReportNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     */
    public void setReportNm_IsNullOrEmpty() { regReportNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_NM: {varchar(30)}
     */
    public void setReportNm_IsNotNull() { regReportNm(CK_ISNN, DOBJ); }

    protected void regReportNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportNm(), "REPORT_NM"); }
    protected abstract ConditionValue xgetCValueReportNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_Equal(Long stockNum) {
        doSetStockNum_Equal(stockNum);
    }

    protected void doSetStockNum_Equal(Long stockNum) {
        regStockNum(CK_EQ, stockNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_NotEqual(Long stockNum) {
        doSetStockNum_NotEqual(stockNum);
    }

    protected void doSetStockNum_NotEqual(Long stockNum) {
        regStockNum(CK_NES, stockNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterThan(Long stockNum) {
        regStockNum(CK_GT, stockNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessThan(Long stockNum) {
        regStockNum(CK_LT, stockNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_GreaterEqual(Long stockNum) {
        regStockNum(CK_GE, stockNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNum The value of stockNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockNum_LessEqual(Long stockNum) {
        regStockNum(CK_LE, stockNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param minNumber The min number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockNum(), "STOCK_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNumList The collection of stockNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_InScope(Collection<Long> stockNumList) {
        doSetStockNum_InScope(stockNumList);
    }

    protected void doSetStockNum_InScope(Collection<Long> stockNumList) {
        regINS(CK_INS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     * @param stockNumList The collection of stockNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockNum_NotInScope(Collection<Long> stockNumList) {
        doSetStockNum_NotInScope(stockNumList);
    }

    protected void doSetStockNum_NotInScope(Collection<Long> stockNumList) {
        regINS(CK_NINS, cTL(stockNumList), xgetCValueStockNum(), "STOCK_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     */
    public void setStockNum_IsNull() { regStockNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_NUM: {bigint(19)}
     */
    public void setStockNum_IsNotNull() { regStockNum(CK_ISNN, DOBJ); }

    protected void regStockNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockNum(), "STOCK_NUM"); }
    protected abstract ConditionValue xgetCValueStockNum();

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
    public HpSLCFunction<TCdtlvmkadmCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TCdtlvmkadmCB.class);
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
    public HpSLCFunction<TCdtlvmkadmCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TCdtlvmkadmCB.class);
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
    public HpSLCFunction<TCdtlvmkadmCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TCdtlvmkadmCB.class);
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
    public HpSLCFunction<TCdtlvmkadmCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TCdtlvmkadmCB.class);
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
    public HpSLCFunction<TCdtlvmkadmCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TCdtlvmkadmCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TCdtlvmkadmCB&gt;() {
     *     public void query(TCdtlvmkadmCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TCdtlvmkadmCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TCdtlvmkadmCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdtlvmkadmCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TCdtlvmkadmCQ sq);

    protected TCdtlvmkadmCB xcreateScalarConditionCB() {
        TCdtlvmkadmCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TCdtlvmkadmCB xcreateScalarConditionPartitionByCB() {
        TCdtlvmkadmCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TCdtlvmkadmCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdtlvmkadmCB cb = new TCdtlvmkadmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SPECIFICATION_LABEL_MAKE_MANAGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TCdtlvmkadmCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TCdtlvmkadmCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TCdtlvmkadmCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TCdtlvmkadmCB cb = new TCdtlvmkadmCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SPECIFICATION_LABEL_MAKE_MANAGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TCdtlvmkadmCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TCdtlvmkadmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TCdtlvmkadmCB cb = new TCdtlvmkadmCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TCdtlvmkadmCQ sq);

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
    protected TCdtlvmkadmCB newMyCB() {
        return new TCdtlvmkadmCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TCdtlvmkadmCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
