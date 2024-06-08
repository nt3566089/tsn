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
 * The abstract condition-query of T_TRREFNOCTLDM.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrrefnoctldmCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrrefnoctldmCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRREFNOCTLDM";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_Equal(Long trrefnoctldmId) {
        doSetTrrefnoctldmId_Equal(trrefnoctldmId);
    }

    protected void doSetTrrefnoctldmId_Equal(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_EQ, trrefnoctldmId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_NotEqual(Long trrefnoctldmId) {
        doSetTrrefnoctldmId_NotEqual(trrefnoctldmId);
    }

    protected void doSetTrrefnoctldmId_NotEqual(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_NES, trrefnoctldmId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_GreaterThan(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_GT, trrefnoctldmId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_LessThan(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_LT, trrefnoctldmId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_GreaterEqual(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_GE, trrefnoctldmId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmId The value of trrefnoctldmId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_LessEqual(Long trrefnoctldmId) {
        regTrrefnoctldmId(CK_LE, trrefnoctldmId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trrefnoctldmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trrefnoctldmId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrrefnoctldmId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrrefnoctldmId(), "TRREFNOCTLDM_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmIdList The collection of trrefnoctldmId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_InScope(Collection<Long> trrefnoctldmIdList) {
        doSetTrrefnoctldmId_InScope(trrefnoctldmIdList);
    }

    protected void doSetTrrefnoctldmId_InScope(Collection<Long> trrefnoctldmIdList) {
        regINS(CK_INS, cTL(trrefnoctldmIdList), xgetCValueTrrefnoctldmId(), "TRREFNOCTLDM_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trrefnoctldmIdList The collection of trrefnoctldmId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrefnoctldmId_NotInScope(Collection<Long> trrefnoctldmIdList) {
        doSetTrrefnoctldmId_NotInScope(trrefnoctldmIdList);
    }

    protected void doSetTrrefnoctldmId_NotInScope(Collection<Long> trrefnoctldmIdList) {
        regINS(CK_NINS, cTL(trrefnoctldmIdList), xgetCValueTrrefnoctldmId(), "TRREFNOCTLDM_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrefnoctldmId_IsNull() { regTrrefnoctldmId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRREFNOCTLDM_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrrefnoctldmId_IsNotNull() { regTrrefnoctldmId(CK_ISNN, DOBJ); }

    protected void regTrrefnoctldmId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrrefnoctldmId(), "TRREFNOCTLDM_ID"); }
    protected abstract ConditionValue xgetCValueTrrefnoctldmId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_Equal(String refno) {
        doSetRefno_Equal(fRES(refno));
    }

    protected void doSetRefno_Equal(String refno) {
        regRefno(CK_EQ, refno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotEqual(String refno) {
        doSetRefno_NotEqual(fRES(refno));
    }

    protected void doSetRefno_NotEqual(String refno) {
        regRefno(CK_NES, refno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterThan(String refno) {
        regRefno(CK_GT, fRES(refno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessThan(String refno) {
        regRefno(CK_LT, fRES(refno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_GreaterEqual(String refno) {
        regRefno(CK_GE, fRES(refno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_LessEqual(String refno) {
        regRefno(CK_LE, fRES(refno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refnoList The collection of refno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_InScope(Collection<String> refnoList) {
        doSetRefno_InScope(refnoList);
    }

    protected void doSetRefno_InScope(Collection<String> refnoList) {
        regINS(CK_INS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refnoList The collection of refno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_NotInScope(Collection<String> refnoList) {
        doSetRefno_NotInScope(refnoList);
    }

    protected void doSetRefno_NotInScope(Collection<String> refnoList) {
        regINS(CK_NINS, cTL(refnoList), xgetCValueRefno(), "REFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setRefno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param refno The value of refno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRefno_LikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRefno_NotLikeSearch(String refno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(refno), xgetCValueRefno(), "REFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REFNO: {NotNull, varchar(30)}
     * @param refno The value of refno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRefno_PrefixSearch(String refno) {
        setRefno_LikeSearch(refno, xcLSOPPre());
    }

    protected void regRefno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRefno(), "REFNO"); }
    protected abstract ConditionValue xgetCValueRefno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_Equal(String planrcvflg) {
        doSetPlanrcvflg_Equal(fRES(planrcvflg));
    }

    protected void doSetPlanrcvflg_Equal(String planrcvflg) {
        regPlanrcvflg(CK_EQ, planrcvflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_NotEqual(String planrcvflg) {
        doSetPlanrcvflg_NotEqual(fRES(planrcvflg));
    }

    protected void doSetPlanrcvflg_NotEqual(String planrcvflg) {
        regPlanrcvflg(CK_NES, planrcvflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_GreaterThan(String planrcvflg) {
        regPlanrcvflg(CK_GT, fRES(planrcvflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_LessThan(String planrcvflg) {
        regPlanrcvflg(CK_LT, fRES(planrcvflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_GreaterEqual(String planrcvflg) {
        regPlanrcvflg(CK_GE, fRES(planrcvflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_LessEqual(String planrcvflg) {
        regPlanrcvflg(CK_LE, fRES(planrcvflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflgList The collection of planrcvflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_InScope(Collection<String> planrcvflgList) {
        doSetPlanrcvflg_InScope(planrcvflgList);
    }

    protected void doSetPlanrcvflg_InScope(Collection<String> planrcvflgList) {
        regINS(CK_INS, cTL(planrcvflgList), xgetCValuePlanrcvflg(), "PLANRCVFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflgList The collection of planrcvflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_NotInScope(Collection<String> planrcvflgList) {
        doSetPlanrcvflg_NotInScope(planrcvflgList);
    }

    protected void doSetPlanrcvflg_NotInScope(Collection<String> planrcvflgList) {
        regINS(CK_NINS, cTL(planrcvflgList), xgetCValuePlanrcvflg(), "PLANRCVFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)} <br>
     * <pre>e.g. setPlanrcvflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planrcvflg The value of planrcvflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanrcvflg_LikeSearch(String planrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planrcvflg), xgetCValuePlanrcvflg(), "PLANRCVFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanrcvflg_NotLikeSearch(String planrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planrcvflg), xgetCValuePlanrcvflg(), "PLANRCVFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANRCVFLG: {char(1)}
     * @param planrcvflg The value of planrcvflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanrcvflg_PrefixSearch(String planrcvflg) {
        setPlanrcvflg_LikeSearch(planrcvflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     */
    public void setPlanrcvflg_IsNull() { regPlanrcvflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANRCVFLG: {char(1)}
     */
    public void setPlanrcvflg_IsNotNull() { regPlanrcvflg(CK_ISNN, DOBJ); }

    protected void regPlanrcvflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanrcvflg(), "PLANRCVFLG"); }
    protected abstract ConditionValue xgetCValuePlanrcvflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_Equal(String ftsrcvflg) {
        doSetFtsrcvflg_Equal(fRES(ftsrcvflg));
    }

    protected void doSetFtsrcvflg_Equal(String ftsrcvflg) {
        regFtsrcvflg(CK_EQ, ftsrcvflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_NotEqual(String ftsrcvflg) {
        doSetFtsrcvflg_NotEqual(fRES(ftsrcvflg));
    }

    protected void doSetFtsrcvflg_NotEqual(String ftsrcvflg) {
        regFtsrcvflg(CK_NES, ftsrcvflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_GreaterThan(String ftsrcvflg) {
        regFtsrcvflg(CK_GT, fRES(ftsrcvflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_LessThan(String ftsrcvflg) {
        regFtsrcvflg(CK_LT, fRES(ftsrcvflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_GreaterEqual(String ftsrcvflg) {
        regFtsrcvflg(CK_GE, fRES(ftsrcvflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_LessEqual(String ftsrcvflg) {
        regFtsrcvflg(CK_LE, fRES(ftsrcvflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflgList The collection of ftsrcvflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_InScope(Collection<String> ftsrcvflgList) {
        doSetFtsrcvflg_InScope(ftsrcvflgList);
    }

    protected void doSetFtsrcvflg_InScope(Collection<String> ftsrcvflgList) {
        regINS(CK_INS, cTL(ftsrcvflgList), xgetCValueFtsrcvflg(), "FTSRCVFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflgList The collection of ftsrcvflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_NotInScope(Collection<String> ftsrcvflgList) {
        doSetFtsrcvflg_NotInScope(ftsrcvflgList);
    }

    protected void doSetFtsrcvflg_NotInScope(Collection<String> ftsrcvflgList) {
        regINS(CK_NINS, cTL(ftsrcvflgList), xgetCValueFtsrcvflg(), "FTSRCVFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FTSRCVFLG: {char(1)} <br>
     * <pre>e.g. setFtsrcvflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ftsrcvflg The value of ftsrcvflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFtsrcvflg_LikeSearch(String ftsrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ftsrcvflg), xgetCValueFtsrcvflg(), "FTSRCVFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFtsrcvflg_NotLikeSearch(String ftsrcvflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ftsrcvflg), xgetCValueFtsrcvflg(), "FTSRCVFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FTSRCVFLG: {char(1)}
     * @param ftsrcvflg The value of ftsrcvflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFtsrcvflg_PrefixSearch(String ftsrcvflg) {
        setFtsrcvflg_LikeSearch(ftsrcvflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     */
    public void setFtsrcvflg_IsNull() { regFtsrcvflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FTSRCVFLG: {char(1)}
     */
    public void setFtsrcvflg_IsNotNull() { regFtsrcvflg(CK_ISNN, DOBJ); }

    protected void regFtsrcvflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFtsrcvflg(), "FTSRCVFLG"); }
    protected abstract ConditionValue xgetCValueFtsrcvflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_Equal(String trrcvaddflg) {
        doSetTrrcvaddflg_Equal(fRES(trrcvaddflg));
    }

    protected void doSetTrrcvaddflg_Equal(String trrcvaddflg) {
        regTrrcvaddflg(CK_EQ, trrcvaddflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_NotEqual(String trrcvaddflg) {
        doSetTrrcvaddflg_NotEqual(fRES(trrcvaddflg));
    }

    protected void doSetTrrcvaddflg_NotEqual(String trrcvaddflg) {
        regTrrcvaddflg(CK_NES, trrcvaddflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_GreaterThan(String trrcvaddflg) {
        regTrrcvaddflg(CK_GT, fRES(trrcvaddflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_LessThan(String trrcvaddflg) {
        regTrrcvaddflg(CK_LT, fRES(trrcvaddflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_GreaterEqual(String trrcvaddflg) {
        regTrrcvaddflg(CK_GE, fRES(trrcvaddflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_LessEqual(String trrcvaddflg) {
        regTrrcvaddflg(CK_LE, fRES(trrcvaddflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflgList The collection of trrcvaddflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_InScope(Collection<String> trrcvaddflgList) {
        doSetTrrcvaddflg_InScope(trrcvaddflgList);
    }

    protected void doSetTrrcvaddflg_InScope(Collection<String> trrcvaddflgList) {
        regINS(CK_INS, cTL(trrcvaddflgList), xgetCValueTrrcvaddflg(), "TRRCVADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflgList The collection of trrcvaddflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_NotInScope(Collection<String> trrcvaddflgList) {
        doSetTrrcvaddflg_NotInScope(trrcvaddflgList);
    }

    protected void doSetTrrcvaddflg_NotInScope(Collection<String> trrcvaddflgList) {
        regINS(CK_NINS, cTL(trrcvaddflgList), xgetCValueTrrcvaddflg(), "TRRCVADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRRCVADDFLG: {char(1)} <br>
     * <pre>e.g. setTrrcvaddflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trrcvaddflg The value of trrcvaddflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrrcvaddflg_LikeSearch(String trrcvaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trrcvaddflg), xgetCValueTrrcvaddflg(), "TRRCVADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrrcvaddflg_NotLikeSearch(String trrcvaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trrcvaddflg), xgetCValueTrrcvaddflg(), "TRRCVADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     * @param trrcvaddflg The value of trrcvaddflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrrcvaddflg_PrefixSearch(String trrcvaddflg) {
        setTrrcvaddflg_LikeSearch(trrcvaddflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     */
    public void setTrrcvaddflg_IsNull() { regTrrcvaddflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRRCVADDFLG: {char(1)}
     */
    public void setTrrcvaddflg_IsNotNull() { regTrrcvaddflg(CK_ISNN, DOBJ); }

    protected void regTrrcvaddflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrrcvaddflg(), "TRRCVADDFLG"); }
    protected abstract ConditionValue xgetCValueTrrcvaddflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)}
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
     * WAREHOUSECD: {NotNull, varchar(30)} <br>
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
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

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
    public HpSLCFunction<TTrrefnoctldmCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrrefnoctldmCB.class);
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
    public HpSLCFunction<TTrrefnoctldmCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrrefnoctldmCB.class);
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
    public HpSLCFunction<TTrrefnoctldmCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrrefnoctldmCB.class);
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
    public HpSLCFunction<TTrrefnoctldmCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrrefnoctldmCB.class);
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
    public HpSLCFunction<TTrrefnoctldmCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrrefnoctldmCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrrefnoctldmCB&gt;() {
     *     public void query(TTrrefnoctldmCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrrefnoctldmCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrrefnoctldmCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrefnoctldmCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrrefnoctldmCQ sq);

    protected TTrrefnoctldmCB xcreateScalarConditionCB() {
        TTrrefnoctldmCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrrefnoctldmCB xcreateScalarConditionPartitionByCB() {
        TTrrefnoctldmCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrrefnoctldmCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrefnoctldmCB cb = new TTrrefnoctldmCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRREFNOCTLDM_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrrefnoctldmCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrrefnoctldmCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrrefnoctldmCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrrefnoctldmCB cb = new TTrrefnoctldmCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRREFNOCTLDM_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrrefnoctldmCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrrefnoctldmCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrrefnoctldmCB cb = new TTrrefnoctldmCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrrefnoctldmCQ sq);

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
    protected TTrrefnoctldmCB newMyCB() {
        return new TTrrefnoctldmCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrrefnoctldmCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}