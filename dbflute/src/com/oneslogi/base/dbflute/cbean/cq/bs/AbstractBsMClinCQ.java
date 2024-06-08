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
 * The abstract condition-query of M_CLIN.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMClinCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMClinCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CLIN";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_Equal(Long clinId) {
        doSetClinId_Equal(clinId);
    }

    protected void doSetClinId_Equal(Long clinId) {
        regClinId(CK_EQ, clinId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_NotEqual(Long clinId) {
        doSetClinId_NotEqual(clinId);
    }

    protected void doSetClinId_NotEqual(Long clinId) {
        regClinId(CK_NES, clinId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_GreaterThan(Long clinId) {
        regClinId(CK_GT, clinId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_LessThan(Long clinId) {
        regClinId(CK_LT, clinId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_GreaterEqual(Long clinId) {
        regClinId(CK_GE, clinId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinId The value of clinId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClinId_LessEqual(Long clinId) {
        regClinId(CK_LE, clinId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of clinId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clinId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClinId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClinId(), "CLIN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinIdList The collection of clinId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClinId_InScope(Collection<Long> clinIdList) {
        doSetClinId_InScope(clinIdList);
    }

    protected void doSetClinId_InScope(Collection<Long> clinIdList) {
        regINS(CK_INS, cTL(clinIdList), xgetCValueClinId(), "CLIN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param clinIdList The collection of clinId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClinId_NotInScope(Collection<Long> clinIdList) {
        doSetClinId_NotInScope(clinIdList);
    }

    protected void doSetClinId_NotInScope(Collection<Long> clinIdList) {
        regINS(CK_NINS, cTL(clinIdList), xgetCValueClinId(), "CLIN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClinId_IsNull() { regClinId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIN_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setClinId_IsNotNull() { regClinId(CK_ISNN, DOBJ); }

    protected void regClinId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClinId(), "CLIN_ID"); }
    protected abstract ConditionValue xgetCValueClinId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_Equal(String lincd) {
        doSetLincd_Equal(fRES(lincd));
    }

    protected void doSetLincd_Equal(String lincd) {
        regLincd(CK_EQ, lincd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_NotEqual(String lincd) {
        doSetLincd_NotEqual(fRES(lincd));
    }

    protected void doSetLincd_NotEqual(String lincd) {
        regLincd(CK_NES, lincd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_GreaterThan(String lincd) {
        regLincd(CK_GT, fRES(lincd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_LessThan(String lincd) {
        regLincd(CK_LT, fRES(lincd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_GreaterEqual(String lincd) {
        regLincd(CK_GE, fRES(lincd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_LessEqual(String lincd) {
        regLincd(CK_LE, fRES(lincd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincdList The collection of lincd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_InScope(Collection<String> lincdList) {
        doSetLincd_InScope(lincdList);
    }

    protected void doSetLincd_InScope(Collection<String> lincdList) {
        regINS(CK_INS, cTL(lincdList), xgetCValueLincd(), "LINCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincdList The collection of lincd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_NotInScope(Collection<String> lincdList) {
        doSetLincd_NotInScope(lincdList);
    }

    protected void doSetLincd_NotInScope(Collection<String> lincdList) {
        regINS(CK_NINS, cTL(lincdList), xgetCValueLincd(), "LINCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLincd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lincd The value of lincd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLincd_LikeSearch(String lincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lincd), xgetCValueLincd(), "LINCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLincd_NotLikeSearch(String lincd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lincd), xgetCValueLincd(), "LINCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINCD: {NotNull, varchar(30)}
     * @param lincd The value of lincd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLincd_PrefixSearch(String lincd) {
        setLincd_LikeSearch(lincd, xcLSOPPre());
    }

    protected void regLincd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLincd(), "LINCD"); }
    protected abstract ConditionValue xgetCValueLincd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_Equal(String linnm) {
        doSetLinnm_Equal(fRES(linnm));
    }

    protected void doSetLinnm_Equal(String linnm) {
        regLinnm(CK_EQ, linnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_NotEqual(String linnm) {
        doSetLinnm_NotEqual(fRES(linnm));
    }

    protected void doSetLinnm_NotEqual(String linnm) {
        regLinnm(CK_NES, linnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_GreaterThan(String linnm) {
        regLinnm(CK_GT, fRES(linnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_LessThan(String linnm) {
        regLinnm(CK_LT, fRES(linnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_GreaterEqual(String linnm) {
        regLinnm(CK_GE, fRES(linnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_LessEqual(String linnm) {
        regLinnm(CK_LE, fRES(linnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnmList The collection of linnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_InScope(Collection<String> linnmList) {
        doSetLinnm_InScope(linnmList);
    }

    protected void doSetLinnm_InScope(Collection<String> linnmList) {
        regINS(CK_INS, cTL(linnmList), xgetCValueLinnm(), "LINNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnmList The collection of linnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_NotInScope(Collection<String> linnmList) {
        doSetLinnm_NotInScope(linnmList);
    }

    protected void doSetLinnm_NotInScope(Collection<String> linnmList) {
        regINS(CK_NINS, cTL(linnmList), xgetCValueLinnm(), "LINNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINNM: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLinnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linnm The value of linnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinnm_LikeSearch(String linnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linnm), xgetCValueLinnm(), "LINNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinnm_NotLikeSearch(String linnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linnm), xgetCValueLinnm(), "LINNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINNM: {NotNull, varchar(30)}
     * @param linnm The value of linnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinnm_PrefixSearch(String linnm) {
        setLinnm_LikeSearch(linnm, xcLSOPPre());
    }

    protected void regLinnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinnm(), "LINNM"); }
    protected abstract ConditionValue xgetCValueLinnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_Equal(String splctg) {
        doSetSplctg_Equal(fRES(splctg));
    }

    protected void doSetSplctg_Equal(String splctg) {
        regSplctg(CK_EQ, splctg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_NotEqual(String splctg) {
        doSetSplctg_NotEqual(fRES(splctg));
    }

    protected void doSetSplctg_NotEqual(String splctg) {
        regSplctg(CK_NES, splctg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_GreaterThan(String splctg) {
        regSplctg(CK_GT, fRES(splctg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_LessThan(String splctg) {
        regSplctg(CK_LT, fRES(splctg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_GreaterEqual(String splctg) {
        regSplctg(CK_GE, fRES(splctg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_LessEqual(String splctg) {
        regSplctg(CK_LE, fRES(splctg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctgList The collection of splctg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_InScope(Collection<String> splctgList) {
        doSetSplctg_InScope(splctgList);
    }

    protected void doSetSplctg_InScope(Collection<String> splctgList) {
        regINS(CK_INS, cTL(splctgList), xgetCValueSplctg(), "SPLCTG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctgList The collection of splctg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_NotInScope(Collection<String> splctgList) {
        doSetSplctg_NotInScope(splctgList);
    }

    protected void doSetSplctg_NotInScope(Collection<String> splctgList) {
        regINS(CK_NINS, cTL(splctgList), xgetCValueSplctg(), "SPLCTG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCTG: {varchar(30)} <br>
     * <pre>e.g. setSplctg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splctg The value of splctg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplctg_LikeSearch(String splctg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splctg), xgetCValueSplctg(), "SPLCTG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplctg_NotLikeSearch(String splctg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splctg), xgetCValueSplctg(), "SPLCTG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLCTG: {varchar(30)}
     * @param splctg The value of splctg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplctg_PrefixSearch(String splctg) {
        setSplctg_LikeSearch(splctg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     */
    public void setSplctg_IsNull() { regSplctg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     */
    public void setSplctg_IsNullOrEmpty() { regSplctg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPLCTG: {varchar(30)}
     */
    public void setSplctg_IsNotNull() { regSplctg(CK_ISNN, DOBJ); }

    protected void regSplctg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplctg(), "SPLCTG"); }
    protected abstract ConditionValue xgetCValueSplctg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_Equal(String linblk1) {
        doSetLinblk1_Equal(fRES(linblk1));
    }

    protected void doSetLinblk1_Equal(String linblk1) {
        regLinblk1(CK_EQ, linblk1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_NotEqual(String linblk1) {
        doSetLinblk1_NotEqual(fRES(linblk1));
    }

    protected void doSetLinblk1_NotEqual(String linblk1) {
        regLinblk1(CK_NES, linblk1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_GreaterThan(String linblk1) {
        regLinblk1(CK_GT, fRES(linblk1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_LessThan(String linblk1) {
        regLinblk1(CK_LT, fRES(linblk1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_GreaterEqual(String linblk1) {
        regLinblk1(CK_GE, fRES(linblk1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_LessEqual(String linblk1) {
        regLinblk1(CK_LE, fRES(linblk1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1List The collection of linblk1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_InScope(Collection<String> linblk1List) {
        doSetLinblk1_InScope(linblk1List);
    }

    protected void doSetLinblk1_InScope(Collection<String> linblk1List) {
        regINS(CK_INS, cTL(linblk1List), xgetCValueLinblk1(), "LINBLK1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1List The collection of linblk1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_NotInScope(Collection<String> linblk1List) {
        doSetLinblk1_NotInScope(linblk1List);
    }

    protected void doSetLinblk1_NotInScope(Collection<String> linblk1List) {
        regINS(CK_NINS, cTL(linblk1List), xgetCValueLinblk1(), "LINBLK1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK1: {varchar(30)} <br>
     * <pre>e.g. setLinblk1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk1 The value of linblk1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk1_LikeSearch(String linblk1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk1), xgetCValueLinblk1(), "LINBLK1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk1_NotLikeSearch(String linblk1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk1), xgetCValueLinblk1(), "LINBLK1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK1: {varchar(30)}
     * @param linblk1 The value of linblk1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk1_PrefixSearch(String linblk1) {
        setLinblk1_LikeSearch(linblk1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     */
    public void setLinblk1_IsNull() { regLinblk1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     */
    public void setLinblk1_IsNullOrEmpty() { regLinblk1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK1: {varchar(30)}
     */
    public void setLinblk1_IsNotNull() { regLinblk1(CK_ISNN, DOBJ); }

    protected void regLinblk1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk1(), "LINBLK1"); }
    protected abstract ConditionValue xgetCValueLinblk1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_Equal(String linblk2) {
        doSetLinblk2_Equal(fRES(linblk2));
    }

    protected void doSetLinblk2_Equal(String linblk2) {
        regLinblk2(CK_EQ, linblk2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_NotEqual(String linblk2) {
        doSetLinblk2_NotEqual(fRES(linblk2));
    }

    protected void doSetLinblk2_NotEqual(String linblk2) {
        regLinblk2(CK_NES, linblk2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_GreaterThan(String linblk2) {
        regLinblk2(CK_GT, fRES(linblk2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_LessThan(String linblk2) {
        regLinblk2(CK_LT, fRES(linblk2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_GreaterEqual(String linblk2) {
        regLinblk2(CK_GE, fRES(linblk2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_LessEqual(String linblk2) {
        regLinblk2(CK_LE, fRES(linblk2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2List The collection of linblk2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_InScope(Collection<String> linblk2List) {
        doSetLinblk2_InScope(linblk2List);
    }

    protected void doSetLinblk2_InScope(Collection<String> linblk2List) {
        regINS(CK_INS, cTL(linblk2List), xgetCValueLinblk2(), "LINBLK2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2List The collection of linblk2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_NotInScope(Collection<String> linblk2List) {
        doSetLinblk2_NotInScope(linblk2List);
    }

    protected void doSetLinblk2_NotInScope(Collection<String> linblk2List) {
        regINS(CK_NINS, cTL(linblk2List), xgetCValueLinblk2(), "LINBLK2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK2: {varchar(30)} <br>
     * <pre>e.g. setLinblk2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk2 The value of linblk2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk2_LikeSearch(String linblk2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk2), xgetCValueLinblk2(), "LINBLK2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk2_NotLikeSearch(String linblk2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk2), xgetCValueLinblk2(), "LINBLK2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK2: {varchar(30)}
     * @param linblk2 The value of linblk2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk2_PrefixSearch(String linblk2) {
        setLinblk2_LikeSearch(linblk2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     */
    public void setLinblk2_IsNull() { regLinblk2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     */
    public void setLinblk2_IsNullOrEmpty() { regLinblk2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK2: {varchar(30)}
     */
    public void setLinblk2_IsNotNull() { regLinblk2(CK_ISNN, DOBJ); }

    protected void regLinblk2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk2(), "LINBLK2"); }
    protected abstract ConditionValue xgetCValueLinblk2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_Equal(String sftpclrsfid) {
        doSetSftpclrsfid_Equal(fRES(sftpclrsfid));
    }

    protected void doSetSftpclrsfid_Equal(String sftpclrsfid) {
        regSftpclrsfid(CK_EQ, sftpclrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_NotEqual(String sftpclrsfid) {
        doSetSftpclrsfid_NotEqual(fRES(sftpclrsfid));
    }

    protected void doSetSftpclrsfid_NotEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_NES, sftpclrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_GreaterThan(String sftpclrsfid) {
        regSftpclrsfid(CK_GT, fRES(sftpclrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_LessThan(String sftpclrsfid) {
        regSftpclrsfid(CK_LT, fRES(sftpclrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_GreaterEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_GE, fRES(sftpclrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_LessEqual(String sftpclrsfid) {
        regSftpclrsfid(CK_LE, fRES(sftpclrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfidList The collection of sftpclrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_InScope(Collection<String> sftpclrsfidList) {
        doSetSftpclrsfid_InScope(sftpclrsfidList);
    }

    protected void doSetSftpclrsfid_InScope(Collection<String> sftpclrsfidList) {
        regINS(CK_INS, cTL(sftpclrsfidList), xgetCValueSftpclrsfid(), "SFTPCLRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfidList The collection of sftpclrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_NotInScope(Collection<String> sftpclrsfidList) {
        doSetSftpclrsfid_NotInScope(sftpclrsfidList);
    }

    protected void doSetSftpclrsfid_NotInScope(Collection<String> sftpclrsfidList) {
        regINS(CK_NINS, cTL(sftpclrsfidList), xgetCValueSftpclrsfid(), "SFTPCLRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)} <br>
     * <pre>e.g. setSftpclrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sftpclrsfid The value of sftpclrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSftpclrsfid_LikeSearch(String sftpclrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sftpclrsfid), xgetCValueSftpclrsfid(), "SFTPCLRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSftpclrsfid_NotLikeSearch(String sftpclrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sftpclrsfid), xgetCValueSftpclrsfid(), "SFTPCLRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     * @param sftpclrsfid The value of sftpclrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSftpclrsfid_PrefixSearch(String sftpclrsfid) {
        setSftpclrsfid_LikeSearch(sftpclrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     */
    public void setSftpclrsfid_IsNull() { regSftpclrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SFTPCLRSFID: {char(1)}
     */
    public void setSftpclrsfid_IsNotNull() { regSftpclrsfid(CK_ISNN, DOBJ); }

    protected void regSftpclrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSftpclrsfid(), "SFTPCLRSFID"); }
    protected abstract ConditionValue xgetCValueSftpclrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_Equal(String tsnboxrsfid) {
        doSetTsnboxrsfid_Equal(fRES(tsnboxrsfid));
    }

    protected void doSetTsnboxrsfid_Equal(String tsnboxrsfid) {
        regTsnboxrsfid(CK_EQ, tsnboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_NotEqual(String tsnboxrsfid) {
        doSetTsnboxrsfid_NotEqual(fRES(tsnboxrsfid));
    }

    protected void doSetTsnboxrsfid_NotEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_NES, tsnboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_GreaterThan(String tsnboxrsfid) {
        regTsnboxrsfid(CK_GT, fRES(tsnboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_LessThan(String tsnboxrsfid) {
        regTsnboxrsfid(CK_LT, fRES(tsnboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_GreaterEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_GE, fRES(tsnboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_LessEqual(String tsnboxrsfid) {
        regTsnboxrsfid(CK_LE, fRES(tsnboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfidList The collection of tsnboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_InScope(Collection<String> tsnboxrsfidList) {
        doSetTsnboxrsfid_InScope(tsnboxrsfidList);
    }

    protected void doSetTsnboxrsfid_InScope(Collection<String> tsnboxrsfidList) {
        regINS(CK_INS, cTL(tsnboxrsfidList), xgetCValueTsnboxrsfid(), "TSNBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfidList The collection of tsnboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_NotInScope(Collection<String> tsnboxrsfidList) {
        doSetTsnboxrsfid_NotInScope(tsnboxrsfidList);
    }

    protected void doSetTsnboxrsfid_NotInScope(Collection<String> tsnboxrsfidList) {
        regINS(CK_NINS, cTL(tsnboxrsfidList), xgetCValueTsnboxrsfid(), "TSNBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)} <br>
     * <pre>e.g. setTsnboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tsnboxrsfid The value of tsnboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTsnboxrsfid_LikeSearch(String tsnboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tsnboxrsfid), xgetCValueTsnboxrsfid(), "TSNBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTsnboxrsfid_NotLikeSearch(String tsnboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tsnboxrsfid), xgetCValueTsnboxrsfid(), "TSNBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     * @param tsnboxrsfid The value of tsnboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTsnboxrsfid_PrefixSearch(String tsnboxrsfid) {
        setTsnboxrsfid_LikeSearch(tsnboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     */
    public void setTsnboxrsfid_IsNull() { regTsnboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TSNBOXRSFID: {char(1)}
     */
    public void setTsnboxrsfid_IsNotNull() { regTsnboxrsfid(CK_ISNN, DOBJ); }

    protected void regTsnboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTsnboxrsfid(), "TSNBOXRSFID"); }
    protected abstract ConditionValue xgetCValueTsnboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_Equal(String jtboxrsfid) {
        doSetJtboxrsfid_Equal(fRES(jtboxrsfid));
    }

    protected void doSetJtboxrsfid_Equal(String jtboxrsfid) {
        regJtboxrsfid(CK_EQ, jtboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_NotEqual(String jtboxrsfid) {
        doSetJtboxrsfid_NotEqual(fRES(jtboxrsfid));
    }

    protected void doSetJtboxrsfid_NotEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_NES, jtboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_GreaterThan(String jtboxrsfid) {
        regJtboxrsfid(CK_GT, fRES(jtboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_LessThan(String jtboxrsfid) {
        regJtboxrsfid(CK_LT, fRES(jtboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_GreaterEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_GE, fRES(jtboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_LessEqual(String jtboxrsfid) {
        regJtboxrsfid(CK_LE, fRES(jtboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfidList The collection of jtboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_InScope(Collection<String> jtboxrsfidList) {
        doSetJtboxrsfid_InScope(jtboxrsfidList);
    }

    protected void doSetJtboxrsfid_InScope(Collection<String> jtboxrsfidList) {
        regINS(CK_INS, cTL(jtboxrsfidList), xgetCValueJtboxrsfid(), "JTBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfidList The collection of jtboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_NotInScope(Collection<String> jtboxrsfidList) {
        doSetJtboxrsfid_NotInScope(jtboxrsfidList);
    }

    protected void doSetJtboxrsfid_NotInScope(Collection<String> jtboxrsfidList) {
        regINS(CK_NINS, cTL(jtboxrsfidList), xgetCValueJtboxrsfid(), "JTBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)} <br>
     * <pre>e.g. setJtboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jtboxrsfid The value of jtboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJtboxrsfid_LikeSearch(String jtboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jtboxrsfid), xgetCValueJtboxrsfid(), "JTBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJtboxrsfid_NotLikeSearch(String jtboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jtboxrsfid), xgetCValueJtboxrsfid(), "JTBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JTBOXRSFID: {char(1)}
     * @param jtboxrsfid The value of jtboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJtboxrsfid_PrefixSearch(String jtboxrsfid) {
        setJtboxrsfid_LikeSearch(jtboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     */
    public void setJtboxrsfid_IsNull() { regJtboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JTBOXRSFID: {char(1)}
     */
    public void setJtboxrsfid_IsNotNull() { regJtboxrsfid(CK_ISNN, DOBJ); }

    protected void regJtboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJtboxrsfid(), "JTBOXRSFID"); }
    protected abstract ConditionValue xgetCValueJtboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_Equal(String hdrdboxrsfid) {
        doSetHdrdboxrsfid_Equal(fRES(hdrdboxrsfid));
    }

    protected void doSetHdrdboxrsfid_Equal(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_EQ, hdrdboxrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_NotEqual(String hdrdboxrsfid) {
        doSetHdrdboxrsfid_NotEqual(fRES(hdrdboxrsfid));
    }

    protected void doSetHdrdboxrsfid_NotEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_NES, hdrdboxrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_GreaterThan(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_GT, fRES(hdrdboxrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_LessThan(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_LT, fRES(hdrdboxrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_GreaterEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_GE, fRES(hdrdboxrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_LessEqual(String hdrdboxrsfid) {
        regHdrdboxrsfid(CK_LE, fRES(hdrdboxrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfidList The collection of hdrdboxrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_InScope(Collection<String> hdrdboxrsfidList) {
        doSetHdrdboxrsfid_InScope(hdrdboxrsfidList);
    }

    protected void doSetHdrdboxrsfid_InScope(Collection<String> hdrdboxrsfidList) {
        regINS(CK_INS, cTL(hdrdboxrsfidList), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfidList The collection of hdrdboxrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_NotInScope(Collection<String> hdrdboxrsfidList) {
        doSetHdrdboxrsfid_NotInScope(hdrdboxrsfidList);
    }

    protected void doSetHdrdboxrsfid_NotInScope(Collection<String> hdrdboxrsfidList) {
        regINS(CK_NINS, cTL(hdrdboxrsfidList), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)} <br>
     * <pre>e.g. setHdrdboxrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param hdrdboxrsfid The value of hdrdboxrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setHdrdboxrsfid_LikeSearch(String hdrdboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(hdrdboxrsfid), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHdrdboxrsfid_NotLikeSearch(String hdrdboxrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hdrdboxrsfid), xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     * @param hdrdboxrsfid The value of hdrdboxrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHdrdboxrsfid_PrefixSearch(String hdrdboxrsfid) {
        setHdrdboxrsfid_LikeSearch(hdrdboxrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     */
    public void setHdrdboxrsfid_IsNull() { regHdrdboxrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HDRDBOXRSFID: {char(1)}
     */
    public void setHdrdboxrsfid_IsNotNull() { regHdrdboxrsfid(CK_ISNN, DOBJ); }

    protected void regHdrdboxrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueHdrdboxrsfid(), "HDRDBOXRSFID"); }
    protected abstract ConditionValue xgetCValueHdrdboxrsfid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_Equal(String odrdvrsfid) {
        doSetOdrdvrsfid_Equal(fRES(odrdvrsfid));
    }

    protected void doSetOdrdvrsfid_Equal(String odrdvrsfid) {
        regOdrdvrsfid(CK_EQ, odrdvrsfid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_NotEqual(String odrdvrsfid) {
        doSetOdrdvrsfid_NotEqual(fRES(odrdvrsfid));
    }

    protected void doSetOdrdvrsfid_NotEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_NES, odrdvrsfid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_GreaterThan(String odrdvrsfid) {
        regOdrdvrsfid(CK_GT, fRES(odrdvrsfid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_LessThan(String odrdvrsfid) {
        regOdrdvrsfid(CK_LT, fRES(odrdvrsfid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_GreaterEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_GE, fRES(odrdvrsfid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_LessEqual(String odrdvrsfid) {
        regOdrdvrsfid(CK_LE, fRES(odrdvrsfid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfidList The collection of odrdvrsfid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_InScope(Collection<String> odrdvrsfidList) {
        doSetOdrdvrsfid_InScope(odrdvrsfidList);
    }

    protected void doSetOdrdvrsfid_InScope(Collection<String> odrdvrsfidList) {
        regINS(CK_INS, cTL(odrdvrsfidList), xgetCValueOdrdvrsfid(), "ODRDVRSFID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfidList The collection of odrdvrsfid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_NotInScope(Collection<String> odrdvrsfidList) {
        doSetOdrdvrsfid_NotInScope(odrdvrsfidList);
    }

    protected void doSetOdrdvrsfid_NotInScope(Collection<String> odrdvrsfidList) {
        regINS(CK_NINS, cTL(odrdvrsfidList), xgetCValueOdrdvrsfid(), "ODRDVRSFID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)} <br>
     * <pre>e.g. setOdrdvrsfid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param odrdvrsfid The value of odrdvrsfid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOdrdvrsfid_LikeSearch(String odrdvrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(odrdvrsfid), xgetCValueOdrdvrsfid(), "ODRDVRSFID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOdrdvrsfid_NotLikeSearch(String odrdvrsfid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(odrdvrsfid), xgetCValueOdrdvrsfid(), "ODRDVRSFID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ODRDVRSFID: {char(1)}
     * @param odrdvrsfid The value of odrdvrsfid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOdrdvrsfid_PrefixSearch(String odrdvrsfid) {
        setOdrdvrsfid_LikeSearch(odrdvrsfid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     */
    public void setOdrdvrsfid_IsNull() { regOdrdvrsfid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ODRDVRSFID: {char(1)}
     */
    public void setOdrdvrsfid_IsNotNull() { regOdrdvrsfid(CK_ISNN, DOBJ); }

    protected void regOdrdvrsfid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOdrdvrsfid(), "ODRDVRSFID"); }
    protected abstract ConditionValue xgetCValueOdrdvrsfid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_Equal(Long pkgrt) {
        doSetPkgrt_Equal(pkgrt);
    }

    protected void doSetPkgrt_Equal(Long pkgrt) {
        regPkgrt(CK_EQ, pkgrt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_NotEqual(Long pkgrt) {
        doSetPkgrt_NotEqual(pkgrt);
    }

    protected void doSetPkgrt_NotEqual(Long pkgrt) {
        regPkgrt(CK_NES, pkgrt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_GreaterThan(Long pkgrt) {
        regPkgrt(CK_GT, pkgrt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_LessThan(Long pkgrt) {
        regPkgrt(CK_LT, pkgrt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_GreaterEqual(Long pkgrt) {
        regPkgrt(CK_GE, pkgrt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrt The value of pkgrt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPkgrt_LessEqual(Long pkgrt) {
        regPkgrt(CK_LE, pkgrt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param minNumber The min number of pkgrt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pkgrt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPkgrt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePkgrt(), "PKGRT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrtList The collection of pkgrt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkgrt_InScope(Collection<Long> pkgrtList) {
        doSetPkgrt_InScope(pkgrtList);
    }

    protected void doSetPkgrt_InScope(Collection<Long> pkgrtList) {
        regINS(CK_INS, cTL(pkgrtList), xgetCValuePkgrt(), "PKGRT");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PKGRT: {bigint(19)}
     * @param pkgrtList The collection of pkgrt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPkgrt_NotInScope(Collection<Long> pkgrtList) {
        doSetPkgrt_NotInScope(pkgrtList);
    }

    protected void doSetPkgrt_NotInScope(Collection<Long> pkgrtList) {
        regINS(CK_NINS, cTL(pkgrtList), xgetCValuePkgrt(), "PKGRT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     */
    public void setPkgrt_IsNull() { regPkgrt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PKGRT: {bigint(19)}
     */
    public void setPkgrt_IsNotNull() { regPkgrt(CK_ISNN, DOBJ); }

    protected void regPkgrt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePkgrt(), "PKGRT"); }
    protected abstract ConditionValue xgetCValuePkgrt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_Equal(String linblk3) {
        doSetLinblk3_Equal(fRES(linblk3));
    }

    protected void doSetLinblk3_Equal(String linblk3) {
        regLinblk3(CK_EQ, linblk3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_NotEqual(String linblk3) {
        doSetLinblk3_NotEqual(fRES(linblk3));
    }

    protected void doSetLinblk3_NotEqual(String linblk3) {
        regLinblk3(CK_NES, linblk3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_GreaterThan(String linblk3) {
        regLinblk3(CK_GT, fRES(linblk3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_LessThan(String linblk3) {
        regLinblk3(CK_LT, fRES(linblk3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_GreaterEqual(String linblk3) {
        regLinblk3(CK_GE, fRES(linblk3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_LessEqual(String linblk3) {
        regLinblk3(CK_LE, fRES(linblk3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3List The collection of linblk3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_InScope(Collection<String> linblk3List) {
        doSetLinblk3_InScope(linblk3List);
    }

    protected void doSetLinblk3_InScope(Collection<String> linblk3List) {
        regINS(CK_INS, cTL(linblk3List), xgetCValueLinblk3(), "LINBLK3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3List The collection of linblk3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_NotInScope(Collection<String> linblk3List) {
        doSetLinblk3_NotInScope(linblk3List);
    }

    protected void doSetLinblk3_NotInScope(Collection<String> linblk3List) {
        regINS(CK_NINS, cTL(linblk3List), xgetCValueLinblk3(), "LINBLK3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK3: {varchar(30)} <br>
     * <pre>e.g. setLinblk3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linblk3 The value of linblk3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinblk3_LikeSearch(String linblk3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linblk3), xgetCValueLinblk3(), "LINBLK3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinblk3_NotLikeSearch(String linblk3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linblk3), xgetCValueLinblk3(), "LINBLK3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINBLK3: {varchar(30)}
     * @param linblk3 The value of linblk3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinblk3_PrefixSearch(String linblk3) {
        setLinblk3_LikeSearch(linblk3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     */
    public void setLinblk3_IsNull() { regLinblk3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     */
    public void setLinblk3_IsNullOrEmpty() { regLinblk3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINBLK3: {varchar(30)}
     */
    public void setLinblk3_IsNotNull() { regLinblk3(CK_ISNN, DOBJ); }

    protected void regLinblk3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinblk3(), "LINBLK3"); }
    protected abstract ConditionValue xgetCValueLinblk3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_Equal(String sprprsid) {
        doSetSprprsid_Equal(fRES(sprprsid));
    }

    protected void doSetSprprsid_Equal(String sprprsid) {
        regSprprsid(CK_EQ, sprprsid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_NotEqual(String sprprsid) {
        doSetSprprsid_NotEqual(fRES(sprprsid));
    }

    protected void doSetSprprsid_NotEqual(String sprprsid) {
        regSprprsid(CK_NES, sprprsid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterThan(String sprprsid) {
        regSprprsid(CK_GT, fRES(sprprsid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessThan(String sprprsid) {
        regSprprsid(CK_LT, fRES(sprprsid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_GreaterEqual(String sprprsid) {
        regSprprsid(CK_GE, fRES(sprprsid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_LessEqual(String sprprsid) {
        regSprprsid(CK_LE, fRES(sprprsid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsidList The collection of sprprsid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_InScope(Collection<String> sprprsidList) {
        doSetSprprsid_InScope(sprprsidList);
    }

    protected void doSetSprprsid_InScope(Collection<String> sprprsidList) {
        regINS(CK_INS, cTL(sprprsidList), xgetCValueSprprsid(), "SPRPRSID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsidList The collection of sprprsid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_NotInScope(Collection<String> sprprsidList) {
        doSetSprprsid_NotInScope(sprprsidList);
    }

    protected void doSetSprprsid_NotInScope(Collection<String> sprprsidList) {
        regINS(CK_NINS, cTL(sprprsidList), xgetCValueSprprsid(), "SPRPRSID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)} <br>
     * <pre>e.g. setSprprsid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sprprsid The value of sprprsid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSprprsid_LikeSearch(String sprprsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sprprsid), xgetCValueSprprsid(), "SPRPRSID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSprprsid_NotLikeSearch(String sprprsid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sprprsid), xgetCValueSprprsid(), "SPRPRSID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPRPRSID: {varchar(30)}
     * @param sprprsid The value of sprprsid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSprprsid_PrefixSearch(String sprprsid) {
        setSprprsid_LikeSearch(sprprsid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNull() { regSprprsid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNullOrEmpty() { regSprprsid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPRPRSID: {varchar(30)}
     */
    public void setSprprsid_IsNotNull() { regSprprsid(CK_ISNN, DOBJ); }

    protected void regSprprsid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSprprsid(), "SPRPRSID"); }
    protected abstract ConditionValue xgetCValueSprprsid();

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
    public HpSLCFunction<MClinCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MClinCB.class);
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
    public HpSLCFunction<MClinCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MClinCB.class);
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
    public HpSLCFunction<MClinCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MClinCB.class);
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
    public HpSLCFunction<MClinCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MClinCB.class);
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
    public HpSLCFunction<MClinCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MClinCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MClinCB&gt;() {
     *     public void query(MClinCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MClinCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MClinCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MClinCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MClinCQ sq);

    protected MClinCB xcreateScalarConditionCB() {
        MClinCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MClinCB xcreateScalarConditionPartitionByCB() {
        MClinCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MClinCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClinCB cb = new MClinCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CLIN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MClinCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MClinCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MClinCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClinCB cb = new MClinCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CLIN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MClinCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MClinCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClinCB cb = new MClinCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MClinCQ sq);

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
    protected MClinCB newMyCB() {
        return new MClinCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MClinCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
