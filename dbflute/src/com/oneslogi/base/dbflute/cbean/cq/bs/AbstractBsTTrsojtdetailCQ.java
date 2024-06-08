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
 * The abstract condition-query of T_TRSOJTDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsojtdetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsojtdetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSOJTDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_Equal(Long sojtlineid) {
        doSetSojtlineid_Equal(sojtlineid);
    }

    protected void doSetSojtlineid_Equal(Long sojtlineid) {
        regSojtlineid(CK_EQ, sojtlineid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_NotEqual(Long sojtlineid) {
        doSetSojtlineid_NotEqual(sojtlineid);
    }

    protected void doSetSojtlineid_NotEqual(Long sojtlineid) {
        regSojtlineid(CK_NES, sojtlineid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_GreaterThan(Long sojtlineid) {
        regSojtlineid(CK_GT, sojtlineid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_LessThan(Long sojtlineid) {
        regSojtlineid(CK_LT, sojtlineid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_GreaterEqual(Long sojtlineid) {
        regSojtlineid(CK_GE, sojtlineid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineid The value of sojtlineid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineid_LessEqual(Long sojtlineid) {
        regSojtlineid(CK_LE, sojtlineid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sojtlineid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtlineid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtlineid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtlineid(), "SOJTLINEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineidList The collection of sojtlineid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineid_InScope(Collection<Long> sojtlineidList) {
        doSetSojtlineid_InScope(sojtlineidList);
    }

    protected void doSetSojtlineid_InScope(Collection<Long> sojtlineidList) {
        regINS(CK_INS, cTL(sojtlineidList), xgetCValueSojtlineid(), "SOJTLINEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     * @param sojtlineidList The collection of sojtlineid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineid_NotInScope(Collection<Long> sojtlineidList) {
        doSetSojtlineid_NotInScope(sojtlineidList);
    }

    protected void doSetSojtlineid_NotInScope(Collection<Long> sojtlineidList) {
        regINS(CK_NINS, cTL(sojtlineidList), xgetCValueSojtlineid(), "SOJTLINEID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtlineid_IsNull() { regSojtlineid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOJTLINEID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSojtlineid_IsNotNull() { regSojtlineid(CK_ISNN, DOBJ); }

    protected void regSojtlineid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtlineid(), "SOJTLINEID"); }
    protected abstract ConditionValue xgetCValueSojtlineid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_Equal(Long sojtid) {
        doSetSojtid_Equal(sojtid);
    }

    protected void doSetSojtid_Equal(Long sojtid) {
        regSojtid(CK_EQ, sojtid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_NotEqual(Long sojtid) {
        doSetSojtid_NotEqual(sojtid);
    }

    protected void doSetSojtid_NotEqual(Long sojtid) {
        regSojtid(CK_NES, sojtid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_GreaterThan(Long sojtid) {
        regSojtid(CK_GT, sojtid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_LessThan(Long sojtid) {
        regSojtid(CK_LT, sojtid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_GreaterEqual(Long sojtid) {
        regSojtid(CK_GE, sojtid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtid The value of sojtid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtid_LessEqual(Long sojtid) {
        regSojtid(CK_LE, sojtid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param minNumber The min number of sojtid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtid(), "SOJTID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtidList The collection of sojtid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtid_InScope(Collection<Long> sojtidList) {
        doSetSojtid_InScope(sojtidList);
    }

    protected void doSetSojtid_InScope(Collection<Long> sojtidList) {
        regINS(CK_INS, cTL(sojtidList), xgetCValueSojtid(), "SOJTID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTID: {NotNull, bigint(19)}
     * @param sojtidList The collection of sojtid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtid_NotInScope(Collection<Long> sojtidList) {
        doSetSojtid_NotInScope(sojtidList);
    }

    protected void doSetSojtid_NotInScope(Collection<Long> sojtidList) {
        regINS(CK_NINS, cTL(sojtidList), xgetCValueSojtid(), "SOJTID");
    }

    protected void regSojtid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtid(), "SOJTID"); }
    protected abstract ConditionValue xgetCValueSojtid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_Equal(Long sojtlineno) {
        doSetSojtlineno_Equal(sojtlineno);
    }

    protected void doSetSojtlineno_Equal(Long sojtlineno) {
        regSojtlineno(CK_EQ, sojtlineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_NotEqual(Long sojtlineno) {
        doSetSojtlineno_NotEqual(sojtlineno);
    }

    protected void doSetSojtlineno_NotEqual(Long sojtlineno) {
        regSojtlineno(CK_NES, sojtlineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_GreaterThan(Long sojtlineno) {
        regSojtlineno(CK_GT, sojtlineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_LessThan(Long sojtlineno) {
        regSojtlineno(CK_LT, sojtlineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_GreaterEqual(Long sojtlineno) {
        regSojtlineno(CK_GE, sojtlineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlineno The value of sojtlineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSojtlineno_LessEqual(Long sojtlineno) {
        regSojtlineno(CK_LE, sojtlineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param minNumber The min number of sojtlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sojtlineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSojtlineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSojtlineno(), "SOJTLINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlinenoList The collection of sojtlineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineno_InScope(Collection<Long> sojtlinenoList) {
        doSetSojtlineno_InScope(sojtlinenoList);
    }

    protected void doSetSojtlineno_InScope(Collection<Long> sojtlinenoList) {
        regINS(CK_INS, cTL(sojtlinenoList), xgetCValueSojtlineno(), "SOJTLINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOJTLINENO: {NotNull, bigint(19)}
     * @param sojtlinenoList The collection of sojtlineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSojtlineno_NotInScope(Collection<Long> sojtlinenoList) {
        doSetSojtlineno_NotInScope(sojtlinenoList);
    }

    protected void doSetSojtlineno_NotInScope(Collection<Long> sojtlinenoList) {
        regINS(CK_NINS, cTL(sojtlinenoList), xgetCValueSojtlineno(), "SOJTLINENO");
    }

    protected void regSojtlineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSojtlineno(), "SOJTLINENO"); }
    protected abstract ConditionValue xgetCValueSojtlineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_Equal(String datatype) {
        doSetDatatype_Equal(fRES(datatype));
    }

    protected void doSetDatatype_Equal(String datatype) {
        regDatatype(CK_EQ, datatype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_NotEqual(String datatype) {
        doSetDatatype_NotEqual(fRES(datatype));
    }

    protected void doSetDatatype_NotEqual(String datatype) {
        regDatatype(CK_NES, datatype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_GreaterThan(String datatype) {
        regDatatype(CK_GT, fRES(datatype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_LessThan(String datatype) {
        regDatatype(CK_LT, fRES(datatype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_GreaterEqual(String datatype) {
        regDatatype(CK_GE, fRES(datatype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_LessEqual(String datatype) {
        regDatatype(CK_LE, fRES(datatype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatypeList The collection of datatype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_InScope(Collection<String> datatypeList) {
        doSetDatatype_InScope(datatypeList);
    }

    protected void doSetDatatype_InScope(Collection<String> datatypeList) {
        regINS(CK_INS, cTL(datatypeList), xgetCValueDatatype(), "DATATYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatypeList The collection of datatype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_NotInScope(Collection<String> datatypeList) {
        doSetDatatype_NotInScope(datatypeList);
    }

    protected void doSetDatatype_NotInScope(Collection<String> datatypeList) {
        regINS(CK_NINS, cTL(datatypeList), xgetCValueDatatype(), "DATATYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATATYPE: {char(1)} <br>
     * <pre>e.g. setDatatype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param datatype The value of datatype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDatatype_LikeSearch(String datatype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(datatype), xgetCValueDatatype(), "DATATYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDatatype_NotLikeSearch(String datatype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(datatype), xgetCValueDatatype(), "DATATYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATATYPE: {char(1)}
     * @param datatype The value of datatype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDatatype_PrefixSearch(String datatype) {
        setDatatype_LikeSearch(datatype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     */
    public void setDatatype_IsNull() { regDatatype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATATYPE: {char(1)}
     */
    public void setDatatype_IsNotNull() { regDatatype(CK_ISNN, DOBJ); }

    protected void regDatatype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDatatype(), "DATATYPE"); }
    protected abstract ConditionValue xgetCValueDatatype();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_Equal(Long planseq) {
        doSetPlanseq_Equal(planseq);
    }

    protected void doSetPlanseq_Equal(Long planseq) {
        regPlanseq(CK_EQ, planseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_NotEqual(Long planseq) {
        doSetPlanseq_NotEqual(planseq);
    }

    protected void doSetPlanseq_NotEqual(Long planseq) {
        regPlanseq(CK_NES, planseq);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_GreaterThan(Long planseq) {
        regPlanseq(CK_GT, planseq);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_LessThan(Long planseq) {
        regPlanseq(CK_LT, planseq);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_GreaterEqual(Long planseq) {
        regPlanseq(CK_GE, planseq);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseq The value of planseq as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPlanseq_LessEqual(Long planseq) {
        regPlanseq(CK_LE, planseq);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param minNumber The min number of planseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of planseq. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPlanseq_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePlanseq(), "PLANSEQ", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseqList The collection of planseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanseq_InScope(Collection<Long> planseqList) {
        doSetPlanseq_InScope(planseqList);
    }

    protected void doSetPlanseq_InScope(Collection<Long> planseqList) {
        regINS(CK_INS, cTL(planseqList), xgetCValuePlanseq(), "PLANSEQ");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PLANSEQ: {bigint(19)}
     * @param planseqList The collection of planseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanseq_NotInScope(Collection<Long> planseqList) {
        doSetPlanseq_NotInScope(planseqList);
    }

    protected void doSetPlanseq_NotInScope(Collection<Long> planseqList) {
        regINS(CK_NINS, cTL(planseqList), xgetCValuePlanseq(), "PLANSEQ");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     */
    public void setPlanseq_IsNull() { regPlanseq(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANSEQ: {bigint(19)}
     */
    public void setPlanseq_IsNotNull() { regPlanseq(CK_ISNN, DOBJ); }

    protected void regPlanseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanseq(), "PLANSEQ"); }
    protected abstract ConditionValue xgetCValuePlanseq();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
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
     * PRODUCT_ID: {bigint(19)}
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
     * PRODUCT_ID: {bigint(19)}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
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
     * PRODUCT_ID: {bigint(19)}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {bigint(19)}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_Equal(String lot3) {
        doSetLot3_Equal(fRES(lot3));
    }

    protected void doSetLot3_Equal(String lot3) {
        regLot3(CK_EQ, lot3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotEqual(String lot3) {
        doSetLot3_NotEqual(fRES(lot3));
    }

    protected void doSetLot3_NotEqual(String lot3) {
        regLot3(CK_NES, lot3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterThan(String lot3) {
        regLot3(CK_GT, fRES(lot3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessThan(String lot3) {
        regLot3(CK_LT, fRES(lot3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_GreaterEqual(String lot3) {
        regLot3(CK_GE, fRES(lot3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_LessEqual(String lot3) {
        regLot3(CK_LE, fRES(lot3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_InScope(Collection<String> lot3List) {
        doSetLot3_InScope(lot3List);
    }

    protected void doSetLot3_InScope(Collection<String> lot3List) {
        regINS(CK_INS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3List The collection of lot3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_NotInScope(Collection<String> lot3List) {
        doSetLot3_NotInScope(lot3List);
    }

    protected void doSetLot3_NotInScope(Collection<String> lot3List) {
        regINS(CK_NINS, cTL(lot3List), xgetCValueLot3(), "LOT3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)} <br>
     * <pre>e.g. setLot3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot3 The value of lot3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot3_LikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot3_NotLikeSearch(String lot3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot3), xgetCValueLot3(), "LOT3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT3: {varchar(60)}
     * @param lot3 The value of lot3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot3_PrefixSearch(String lot3) {
        setLot3_LikeSearch(lot3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNull() { regLot3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNullOrEmpty() { regLot3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT3: {varchar(60)}
     */
    public void setLot3_IsNotNull() { regLot3(CK_ISNN, DOBJ); }

    protected void regLot3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot3(), "LOT3"); }
    protected abstract ConditionValue xgetCValueLot3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_Equal(String lot4) {
        doSetLot4_Equal(fRES(lot4));
    }

    protected void doSetLot4_Equal(String lot4) {
        regLot4(CK_EQ, lot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotEqual(String lot4) {
        doSetLot4_NotEqual(fRES(lot4));
    }

    protected void doSetLot4_NotEqual(String lot4) {
        regLot4(CK_NES, lot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_InScope(Collection<String> lot4List) {
        doSetLot4_InScope(lot4List);
    }

    protected void doSetLot4_InScope(Collection<String> lot4List) {
        regINS(CK_INS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4List The collection of lot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_NotInScope(Collection<String> lot4List) {
        doSetLot4_NotInScope(lot4List);
    }

    protected void doSetLot4_NotInScope(Collection<String> lot4List) {
        regINS(CK_NINS, cTL(lot4List), xgetCValueLot4(), "LOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)} <br>
     * <pre>e.g. setLot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot4 The value of lot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot4_LikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNull() { regLot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNullOrEmpty() { regLot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT4: {varchar(8)}
     */
    public void setLot4_IsNotNull() { regLot4(CK_ISNN, DOBJ); }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_Equal(Long expectqty1) {
        doSetExpectqty1_Equal(expectqty1);
    }

    protected void doSetExpectqty1_Equal(Long expectqty1) {
        regExpectqty1(CK_EQ, expectqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_NotEqual(Long expectqty1) {
        doSetExpectqty1_NotEqual(expectqty1);
    }

    protected void doSetExpectqty1_NotEqual(Long expectqty1) {
        regExpectqty1(CK_NES, expectqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterThan(Long expectqty1) {
        regExpectqty1(CK_GT, expectqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessThan(Long expectqty1) {
        regExpectqty1(CK_LT, expectqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_GreaterEqual(Long expectqty1) {
        regExpectqty1(CK_GE, expectqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1 The value of expectqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExpectqty1_LessEqual(Long expectqty1) {
        regExpectqty1(CK_LE, expectqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param minNumber The min number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of expectqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExpectqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExpectqty1(), "EXPECTQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1List The collection of expectqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_InScope(Collection<Long> expectqty1List) {
        doSetExpectqty1_InScope(expectqty1List);
    }

    protected void doSetExpectqty1_InScope(Collection<Long> expectqty1List) {
        regINS(CK_INS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     * @param expectqty1List The collection of expectqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpectqty1_NotInScope(Collection<Long> expectqty1List) {
        doSetExpectqty1_NotInScope(expectqty1List);
    }

    protected void doSetExpectqty1_NotInScope(Collection<Long> expectqty1List) {
        regINS(CK_NINS, cTL(expectqty1List), xgetCValueExpectqty1(), "EXPECTQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     */
    public void setExpectqty1_IsNull() { regExpectqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPECTQTY1: {bigint(19)}
     */
    public void setExpectqty1_IsNotNull() { regExpectqty1(CK_ISNN, DOBJ); }

    protected void regExpectqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpectqty1(), "EXPECTQTY1"); }
    protected abstract ConditionValue xgetCValueExpectqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_Equal(Long pickedqty1) {
        doSetPickedqty1_Equal(pickedqty1);
    }

    protected void doSetPickedqty1_Equal(Long pickedqty1) {
        regPickedqty1(CK_EQ, pickedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_NotEqual(Long pickedqty1) {
        doSetPickedqty1_NotEqual(pickedqty1);
    }

    protected void doSetPickedqty1_NotEqual(Long pickedqty1) {
        regPickedqty1(CK_NES, pickedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterThan(Long pickedqty1) {
        regPickedqty1(CK_GT, pickedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessThan(Long pickedqty1) {
        regPickedqty1(CK_LT, pickedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterEqual(Long pickedqty1) {
        regPickedqty1(CK_GE, pickedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessEqual(Long pickedqty1) {
        regPickedqty1(CK_LE, pickedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param minNumber The min number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqty1(), "PICKEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1List The collection of pickedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_InScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_InScope(pickedqty1List);
    }

    protected void doSetPickedqty1_InScope(Collection<Long> pickedqty1List) {
        regINS(CK_INS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1List The collection of pickedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_NotInScope(pickedqty1List);
    }

    protected void doSetPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        regINS(CK_NINS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     */
    public void setPickedqty1_IsNull() { regPickedqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     */
    public void setPickedqty1_IsNotNull() { regPickedqty1(CK_ISNN, DOBJ); }

    protected void regPickedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqty1(), "PICKEDQTY1"); }
    protected abstract ConditionValue xgetCValuePickedqty1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_Equal(String poid) {
        doSetPoid_Equal(fRES(poid));
    }

    protected void doSetPoid_Equal(String poid) {
        regPoid(CK_EQ, poid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_NotEqual(String poid) {
        doSetPoid_NotEqual(fRES(poid));
    }

    protected void doSetPoid_NotEqual(String poid) {
        regPoid(CK_NES, poid);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_GreaterThan(String poid) {
        regPoid(CK_GT, fRES(poid));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_LessThan(String poid) {
        regPoid(CK_LT, fRES(poid));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_GreaterEqual(String poid) {
        regPoid(CK_GE, fRES(poid));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_LessEqual(String poid) {
        regPoid(CK_LE, fRES(poid));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POID: {varchar(30)}
     * @param poidList The collection of poid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_InScope(Collection<String> poidList) {
        doSetPoid_InScope(poidList);
    }

    protected void doSetPoid_InScope(Collection<String> poidList) {
        regINS(CK_INS, cTL(poidList), xgetCValuePoid(), "POID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POID: {varchar(30)}
     * @param poidList The collection of poid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_NotInScope(Collection<String> poidList) {
        doSetPoid_NotInScope(poidList);
    }

    protected void doSetPoid_NotInScope(Collection<String> poidList) {
        regINS(CK_NINS, cTL(poidList), xgetCValuePoid(), "POID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POID: {varchar(30)} <br>
     * <pre>e.g. setPoid_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param poid The value of poid as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPoid_LikeSearch(String poid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(poid), xgetCValuePoid(), "POID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPoid_NotLikeSearch(String poid, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(poid), xgetCValuePoid(), "POID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POID: {varchar(30)}
     * @param poid The value of poid as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoid_PrefixSearch(String poid) {
        setPoid_LikeSearch(poid, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     */
    public void setPoid_IsNull() { regPoid(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     */
    public void setPoid_IsNullOrEmpty() { regPoid(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POID: {varchar(30)}
     */
    public void setPoid_IsNotNull() { regPoid(CK_ISNN, DOBJ); }

    protected void regPoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePoid(), "POID"); }
    protected abstract ConditionValue xgetCValuePoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {bigint(19)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNull() { regPalletId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLET_ID: {bigint(19)}
     */
    public void setPalletId_IsNotNull() { regPalletId(CK_ISNN, DOBJ); }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNull() { regLocationId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_ID: {bigint(19)}
     */
    public void setLocationId_IsNotNull() { regLocationId(CK_ISNN, DOBJ); }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNull() { regLotId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_ID: {bigint(19)}
     */
    public void setLotId_IsNotNull() { regLotId(CK_ISNN, DOBJ); }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_Equal(Long soid) {
        doSetSoid_Equal(soid);
    }

    protected void doSetSoid_Equal(Long soid) {
        regSoid(CK_EQ, soid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_NotEqual(Long soid) {
        doSetSoid_NotEqual(soid);
    }

    protected void doSetSoid_NotEqual(Long soid) {
        regSoid(CK_NES, soid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterThan(Long soid) {
        regSoid(CK_GT, soid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessThan(Long soid) {
        regSoid(CK_LT, soid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_GreaterEqual(Long soid) {
        regSoid(CK_GE, soid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param soid The value of soid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSoid_LessEqual(Long soid) {
        regSoid(CK_LE, soid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     * @param minNumber The min number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of soid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSoid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSoid(), "SOID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_InScope(Collection<Long> soidList) {
        doSetSoid_InScope(soidList);
    }

    protected void doSetSoid_InScope(Collection<Long> soidList) {
        regINS(CK_INS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SOID: {bigint(19)}
     * @param soidList The collection of soid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSoid_NotInScope(Collection<Long> soidList) {
        doSetSoid_NotInScope(soidList);
    }

    protected void doSetSoid_NotInScope(Collection<Long> soidList) {
        regINS(CK_NINS, cTL(soidList), xgetCValueSoid(), "SOID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNull() { regSoid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOID: {bigint(19)}
     */
    public void setSoid_IsNotNull() { regSoid(CK_ISNN, DOBJ); }

    protected void regSoid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSoid(), "SOID"); }
    protected abstract ConditionValue xgetCValueSoid();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_Equal(Long sodetailid) {
        doSetSodetailid_Equal(sodetailid);
    }

    protected void doSetSodetailid_Equal(Long sodetailid) {
        regSodetailid(CK_EQ, sodetailid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_NotEqual(Long sodetailid) {
        doSetSodetailid_NotEqual(sodetailid);
    }

    protected void doSetSodetailid_NotEqual(Long sodetailid) {
        regSodetailid(CK_NES, sodetailid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterThan(Long sodetailid) {
        regSodetailid(CK_GT, sodetailid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessThan(Long sodetailid) {
        regSodetailid(CK_LT, sodetailid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_GreaterEqual(Long sodetailid) {
        regSodetailid(CK_GE, sodetailid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailid The value of sodetailid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSodetailid_LessEqual(Long sodetailid) {
        regSodetailid(CK_LE, sodetailid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param minNumber The min number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sodetailid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSodetailid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSodetailid(), "SODETAILID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailidList The collection of sodetailid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_InScope(Collection<Long> sodetailidList) {
        doSetSodetailid_InScope(sodetailidList);
    }

    protected void doSetSodetailid_InScope(Collection<Long> sodetailidList) {
        regINS(CK_INS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SODETAILID: {bigint(19)}
     * @param sodetailidList The collection of sodetailid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSodetailid_NotInScope(Collection<Long> sodetailidList) {
        doSetSodetailid_NotInScope(sodetailidList);
    }

    protected void doSetSodetailid_NotInScope(Collection<Long> sodetailidList) {
        regINS(CK_NINS, cTL(sodetailidList), xgetCValueSodetailid(), "SODETAILID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     */
    public void setSodetailid_IsNull() { regSodetailid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SODETAILID: {bigint(19)}
     */
    public void setSodetailid_IsNotNull() { regSodetailid(CK_ISNN, DOBJ); }

    protected void regSodetailid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSodetailid(), "SODETAILID"); }
    protected abstract ConditionValue xgetCValueSodetailid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_Equal(String trsoaddflg) {
        doSetTrsoaddflg_Equal(fRES(trsoaddflg));
    }

    protected void doSetTrsoaddflg_Equal(String trsoaddflg) {
        regTrsoaddflg(CK_EQ, trsoaddflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_NotEqual(String trsoaddflg) {
        doSetTrsoaddflg_NotEqual(fRES(trsoaddflg));
    }

    protected void doSetTrsoaddflg_NotEqual(String trsoaddflg) {
        regTrsoaddflg(CK_NES, trsoaddflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_GreaterThan(String trsoaddflg) {
        regTrsoaddflg(CK_GT, fRES(trsoaddflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_LessThan(String trsoaddflg) {
        regTrsoaddflg(CK_LT, fRES(trsoaddflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_GreaterEqual(String trsoaddflg) {
        regTrsoaddflg(CK_GE, fRES(trsoaddflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_LessEqual(String trsoaddflg) {
        regTrsoaddflg(CK_LE, fRES(trsoaddflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflgList The collection of trsoaddflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_InScope(Collection<String> trsoaddflgList) {
        doSetTrsoaddflg_InScope(trsoaddflgList);
    }

    protected void doSetTrsoaddflg_InScope(Collection<String> trsoaddflgList) {
        regINS(CK_INS, cTL(trsoaddflgList), xgetCValueTrsoaddflg(), "TRSOADDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflgList The collection of trsoaddflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_NotInScope(Collection<String> trsoaddflgList) {
        doSetTrsoaddflg_NotInScope(trsoaddflgList);
    }

    protected void doSetTrsoaddflg_NotInScope(Collection<String> trsoaddflgList) {
        regINS(CK_NINS, cTL(trsoaddflgList), xgetCValueTrsoaddflg(), "TRSOADDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)} <br>
     * <pre>e.g. setTrsoaddflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trsoaddflg The value of trsoaddflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrsoaddflg_LikeSearch(String trsoaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trsoaddflg), xgetCValueTrsoaddflg(), "TRSOADDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrsoaddflg_NotLikeSearch(String trsoaddflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trsoaddflg), xgetCValueTrsoaddflg(), "TRSOADDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOADDFLG: {char(1)}
     * @param trsoaddflg The value of trsoaddflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoaddflg_PrefixSearch(String trsoaddflg) {
        setTrsoaddflg_LikeSearch(trsoaddflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     */
    public void setTrsoaddflg_IsNull() { regTrsoaddflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSOADDFLG: {char(1)}
     */
    public void setTrsoaddflg_IsNotNull() { regTrsoaddflg(CK_ISNN, DOBJ); }

    protected void regTrsoaddflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsoaddflg(), "TRSOADDFLG"); }
    protected abstract ConditionValue xgetCValueTrsoaddflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_Equal(String planoutseq) {
        doSetPlanoutseq_Equal(fRES(planoutseq));
    }

    protected void doSetPlanoutseq_Equal(String planoutseq) {
        regPlanoutseq(CK_EQ, planoutseq);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_NotEqual(String planoutseq) {
        doSetPlanoutseq_NotEqual(fRES(planoutseq));
    }

    protected void doSetPlanoutseq_NotEqual(String planoutseq) {
        regPlanoutseq(CK_NES, planoutseq);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_GreaterThan(String planoutseq) {
        regPlanoutseq(CK_GT, fRES(planoutseq));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_LessThan(String planoutseq) {
        regPlanoutseq(CK_LT, fRES(planoutseq));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_GreaterEqual(String planoutseq) {
        regPlanoutseq(CK_GE, fRES(planoutseq));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_LessEqual(String planoutseq) {
        regPlanoutseq(CK_LE, fRES(planoutseq));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseqList The collection of planoutseq as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_InScope(Collection<String> planoutseqList) {
        doSetPlanoutseq_InScope(planoutseqList);
    }

    protected void doSetPlanoutseq_InScope(Collection<String> planoutseqList) {
        regINS(CK_INS, cTL(planoutseqList), xgetCValuePlanoutseq(), "PLANOUTSEQ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseqList The collection of planoutseq as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_NotInScope(Collection<String> planoutseqList) {
        doSetPlanoutseq_NotInScope(planoutseqList);
    }

    protected void doSetPlanoutseq_NotInScope(Collection<String> planoutseqList) {
        regINS(CK_NINS, cTL(planoutseqList), xgetCValuePlanoutseq(), "PLANOUTSEQ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANOUTSEQ: {varchar(30)} <br>
     * <pre>e.g. setPlanoutseq_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planoutseq The value of planoutseq as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanoutseq_LikeSearch(String planoutseq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planoutseq), xgetCValuePlanoutseq(), "PLANOUTSEQ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanoutseq_NotLikeSearch(String planoutseq, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planoutseq), xgetCValuePlanoutseq(), "PLANOUTSEQ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     * @param planoutseq The value of planoutseq as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanoutseq_PrefixSearch(String planoutseq) {
        setPlanoutseq_LikeSearch(planoutseq, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     */
    public void setPlanoutseq_IsNull() { regPlanoutseq(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     */
    public void setPlanoutseq_IsNullOrEmpty() { regPlanoutseq(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANOUTSEQ: {varchar(30)}
     */
    public void setPlanoutseq_IsNotNull() { regPlanoutseq(CK_ISNN, DOBJ); }

    protected void regPlanoutseq(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanoutseq(), "PLANOUTSEQ"); }
    protected abstract ConditionValue xgetCValuePlanoutseq();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_Equal(String planprice1) {
        doSetPlanprice1_Equal(fRES(planprice1));
    }

    protected void doSetPlanprice1_Equal(String planprice1) {
        regPlanprice1(CK_EQ, planprice1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_NotEqual(String planprice1) {
        doSetPlanprice1_NotEqual(fRES(planprice1));
    }

    protected void doSetPlanprice1_NotEqual(String planprice1) {
        regPlanprice1(CK_NES, planprice1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_GreaterThan(String planprice1) {
        regPlanprice1(CK_GT, fRES(planprice1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_LessThan(String planprice1) {
        regPlanprice1(CK_LT, fRES(planprice1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_GreaterEqual(String planprice1) {
        regPlanprice1(CK_GE, fRES(planprice1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_LessEqual(String planprice1) {
        regPlanprice1(CK_LE, fRES(planprice1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1List The collection of planprice1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_InScope(Collection<String> planprice1List) {
        doSetPlanprice1_InScope(planprice1List);
    }

    protected void doSetPlanprice1_InScope(Collection<String> planprice1List) {
        regINS(CK_INS, cTL(planprice1List), xgetCValuePlanprice1(), "PLANPRICE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1List The collection of planprice1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_NotInScope(Collection<String> planprice1List) {
        doSetPlanprice1_NotInScope(planprice1List);
    }

    protected void doSetPlanprice1_NotInScope(Collection<String> planprice1List) {
        regINS(CK_NINS, cTL(planprice1List), xgetCValuePlanprice1(), "PLANPRICE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE1: {varchar(30)} <br>
     * <pre>e.g. setPlanprice1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planprice1 The value of planprice1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanprice1_LikeSearch(String planprice1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planprice1), xgetCValuePlanprice1(), "PLANPRICE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanprice1_NotLikeSearch(String planprice1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planprice1), xgetCValuePlanprice1(), "PLANPRICE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     * @param planprice1 The value of planprice1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice1_PrefixSearch(String planprice1) {
        setPlanprice1_LikeSearch(planprice1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     */
    public void setPlanprice1_IsNull() { regPlanprice1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     */
    public void setPlanprice1_IsNullOrEmpty() { regPlanprice1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANPRICE1: {varchar(30)}
     */
    public void setPlanprice1_IsNotNull() { regPlanprice1(CK_ISNN, DOBJ); }

    protected void regPlanprice1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanprice1(), "PLANPRICE1"); }
    protected abstract ConditionValue xgetCValuePlanprice1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_Equal(String planprice2) {
        doSetPlanprice2_Equal(fRES(planprice2));
    }

    protected void doSetPlanprice2_Equal(String planprice2) {
        regPlanprice2(CK_EQ, planprice2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_NotEqual(String planprice2) {
        doSetPlanprice2_NotEqual(fRES(planprice2));
    }

    protected void doSetPlanprice2_NotEqual(String planprice2) {
        regPlanprice2(CK_NES, planprice2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_GreaterThan(String planprice2) {
        regPlanprice2(CK_GT, fRES(planprice2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_LessThan(String planprice2) {
        regPlanprice2(CK_LT, fRES(planprice2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_GreaterEqual(String planprice2) {
        regPlanprice2(CK_GE, fRES(planprice2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_LessEqual(String planprice2) {
        regPlanprice2(CK_LE, fRES(planprice2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2List The collection of planprice2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_InScope(Collection<String> planprice2List) {
        doSetPlanprice2_InScope(planprice2List);
    }

    protected void doSetPlanprice2_InScope(Collection<String> planprice2List) {
        regINS(CK_INS, cTL(planprice2List), xgetCValuePlanprice2(), "PLANPRICE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2List The collection of planprice2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_NotInScope(Collection<String> planprice2List) {
        doSetPlanprice2_NotInScope(planprice2List);
    }

    protected void doSetPlanprice2_NotInScope(Collection<String> planprice2List) {
        regINS(CK_NINS, cTL(planprice2List), xgetCValuePlanprice2(), "PLANPRICE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE2: {varchar(30)} <br>
     * <pre>e.g. setPlanprice2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planprice2 The value of planprice2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanprice2_LikeSearch(String planprice2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planprice2), xgetCValuePlanprice2(), "PLANPRICE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanprice2_NotLikeSearch(String planprice2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planprice2), xgetCValuePlanprice2(), "PLANPRICE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     * @param planprice2 The value of planprice2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanprice2_PrefixSearch(String planprice2) {
        setPlanprice2_LikeSearch(planprice2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     */
    public void setPlanprice2_IsNull() { regPlanprice2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     */
    public void setPlanprice2_IsNullOrEmpty() { regPlanprice2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANPRICE2: {varchar(30)}
     */
    public void setPlanprice2_IsNotNull() { regPlanprice2(CK_ISNN, DOBJ); }

    protected void regPlanprice2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanprice2(), "PLANPRICE2"); }
    protected abstract ConditionValue xgetCValuePlanprice2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_Equal(String planitemname) {
        doSetPlanitemname_Equal(fRES(planitemname));
    }

    protected void doSetPlanitemname_Equal(String planitemname) {
        regPlanitemname(CK_EQ, planitemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_NotEqual(String planitemname) {
        doSetPlanitemname_NotEqual(fRES(planitemname));
    }

    protected void doSetPlanitemname_NotEqual(String planitemname) {
        regPlanitemname(CK_NES, planitemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_GreaterThan(String planitemname) {
        regPlanitemname(CK_GT, fRES(planitemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_LessThan(String planitemname) {
        regPlanitemname(CK_LT, fRES(planitemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_GreaterEqual(String planitemname) {
        regPlanitemname(CK_GE, fRES(planitemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_LessEqual(String planitemname) {
        regPlanitemname(CK_LE, fRES(planitemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemnameList The collection of planitemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_InScope(Collection<String> planitemnameList) {
        doSetPlanitemname_InScope(planitemnameList);
    }

    protected void doSetPlanitemname_InScope(Collection<String> planitemnameList) {
        regINS(CK_INS, cTL(planitemnameList), xgetCValuePlanitemname(), "PLANITEMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemnameList The collection of planitemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_NotInScope(Collection<String> planitemnameList) {
        doSetPlanitemname_NotInScope(planitemnameList);
    }

    protected void doSetPlanitemname_NotInScope(Collection<String> planitemnameList) {
        regINS(CK_NINS, cTL(planitemnameList), xgetCValuePlanitemname(), "PLANITEMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANITEMNAME: {varchar(60)} <br>
     * <pre>e.g. setPlanitemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param planitemname The value of planitemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlanitemname_LikeSearch(String planitemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(planitemname), xgetCValuePlanitemname(), "PLANITEMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlanitemname_NotLikeSearch(String planitemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(planitemname), xgetCValuePlanitemname(), "PLANITEMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     * @param planitemname The value of planitemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlanitemname_PrefixSearch(String planitemname) {
        setPlanitemname_LikeSearch(planitemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     */
    public void setPlanitemname_IsNull() { regPlanitemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     */
    public void setPlanitemname_IsNullOrEmpty() { regPlanitemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANITEMNAME: {varchar(60)}
     */
    public void setPlanitemname_IsNotNull() { regPlanitemname(CK_ISNN, DOBJ); }

    protected void regPlanitemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlanitemname(), "PLANITEMNAME"); }
    protected abstract ConditionValue xgetCValuePlanitemname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_Equal(String plandata1) {
        doSetPlandata1_Equal(fRES(plandata1));
    }

    protected void doSetPlandata1_Equal(String plandata1) {
        regPlandata1(CK_EQ, plandata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_NotEqual(String plandata1) {
        doSetPlandata1_NotEqual(fRES(plandata1));
    }

    protected void doSetPlandata1_NotEqual(String plandata1) {
        regPlandata1(CK_NES, plandata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_GreaterThan(String plandata1) {
        regPlandata1(CK_GT, fRES(plandata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_LessThan(String plandata1) {
        regPlandata1(CK_LT, fRES(plandata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_GreaterEqual(String plandata1) {
        regPlandata1(CK_GE, fRES(plandata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_LessEqual(String plandata1) {
        regPlandata1(CK_LE, fRES(plandata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1List The collection of plandata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_InScope(Collection<String> plandata1List) {
        doSetPlandata1_InScope(plandata1List);
    }

    protected void doSetPlandata1_InScope(Collection<String> plandata1List) {
        regINS(CK_INS, cTL(plandata1List), xgetCValuePlandata1(), "PLANDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1List The collection of plandata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_NotInScope(Collection<String> plandata1List) {
        doSetPlandata1_NotInScope(plandata1List);
    }

    protected void doSetPlandata1_NotInScope(Collection<String> plandata1List) {
        regINS(CK_NINS, cTL(plandata1List), xgetCValuePlandata1(), "PLANDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA1: {char(1)} <br>
     * <pre>e.g. setPlandata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plandata1 The value of plandata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlandata1_LikeSearch(String plandata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plandata1), xgetCValuePlandata1(), "PLANDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlandata1_NotLikeSearch(String plandata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plandata1), xgetCValuePlandata1(), "PLANDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA1: {char(1)}
     * @param plandata1 The value of plandata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata1_PrefixSearch(String plandata1) {
        setPlandata1_LikeSearch(plandata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     */
    public void setPlandata1_IsNull() { regPlandata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANDATA1: {char(1)}
     */
    public void setPlandata1_IsNotNull() { regPlandata1(CK_ISNN, DOBJ); }

    protected void regPlandata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlandata1(), "PLANDATA1"); }
    protected abstract ConditionValue xgetCValuePlandata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_Equal(String plandata2) {
        doSetPlandata2_Equal(fRES(plandata2));
    }

    protected void doSetPlandata2_Equal(String plandata2) {
        regPlandata2(CK_EQ, plandata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_NotEqual(String plandata2) {
        doSetPlandata2_NotEqual(fRES(plandata2));
    }

    protected void doSetPlandata2_NotEqual(String plandata2) {
        regPlandata2(CK_NES, plandata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_GreaterThan(String plandata2) {
        regPlandata2(CK_GT, fRES(plandata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_LessThan(String plandata2) {
        regPlandata2(CK_LT, fRES(plandata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_GreaterEqual(String plandata2) {
        regPlandata2(CK_GE, fRES(plandata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_LessEqual(String plandata2) {
        regPlandata2(CK_LE, fRES(plandata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2List The collection of plandata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_InScope(Collection<String> plandata2List) {
        doSetPlandata2_InScope(plandata2List);
    }

    protected void doSetPlandata2_InScope(Collection<String> plandata2List) {
        regINS(CK_INS, cTL(plandata2List), xgetCValuePlandata2(), "PLANDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2List The collection of plandata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_NotInScope(Collection<String> plandata2List) {
        doSetPlandata2_NotInScope(plandata2List);
    }

    protected void doSetPlandata2_NotInScope(Collection<String> plandata2List) {
        regINS(CK_NINS, cTL(plandata2List), xgetCValuePlandata2(), "PLANDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA2: {varchar(30)} <br>
     * <pre>e.g. setPlandata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plandata2 The value of plandata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlandata2_LikeSearch(String plandata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plandata2), xgetCValuePlandata2(), "PLANDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlandata2_NotLikeSearch(String plandata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plandata2), xgetCValuePlandata2(), "PLANDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA2: {varchar(30)}
     * @param plandata2 The value of plandata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata2_PrefixSearch(String plandata2) {
        setPlandata2_LikeSearch(plandata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     */
    public void setPlandata2_IsNull() { regPlandata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     */
    public void setPlandata2_IsNullOrEmpty() { regPlandata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANDATA2: {varchar(30)}
     */
    public void setPlandata2_IsNotNull() { regPlandata2(CK_ISNN, DOBJ); }

    protected void regPlandata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlandata2(), "PLANDATA2"); }
    protected abstract ConditionValue xgetCValuePlandata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_Equal(String plandata3) {
        doSetPlandata3_Equal(fRES(plandata3));
    }

    protected void doSetPlandata3_Equal(String plandata3) {
        regPlandata3(CK_EQ, plandata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_NotEqual(String plandata3) {
        doSetPlandata3_NotEqual(fRES(plandata3));
    }

    protected void doSetPlandata3_NotEqual(String plandata3) {
        regPlandata3(CK_NES, plandata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_GreaterThan(String plandata3) {
        regPlandata3(CK_GT, fRES(plandata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_LessThan(String plandata3) {
        regPlandata3(CK_LT, fRES(plandata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_GreaterEqual(String plandata3) {
        regPlandata3(CK_GE, fRES(plandata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_LessEqual(String plandata3) {
        regPlandata3(CK_LE, fRES(plandata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3List The collection of plandata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_InScope(Collection<String> plandata3List) {
        doSetPlandata3_InScope(plandata3List);
    }

    protected void doSetPlandata3_InScope(Collection<String> plandata3List) {
        regINS(CK_INS, cTL(plandata3List), xgetCValuePlandata3(), "PLANDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3List The collection of plandata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_NotInScope(Collection<String> plandata3List) {
        doSetPlandata3_NotInScope(plandata3List);
    }

    protected void doSetPlandata3_NotInScope(Collection<String> plandata3List) {
        regINS(CK_NINS, cTL(plandata3List), xgetCValuePlandata3(), "PLANDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA3: {varchar(30)} <br>
     * <pre>e.g. setPlandata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plandata3 The value of plandata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlandata3_LikeSearch(String plandata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plandata3), xgetCValuePlandata3(), "PLANDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlandata3_NotLikeSearch(String plandata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plandata3), xgetCValuePlandata3(), "PLANDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANDATA3: {varchar(30)}
     * @param plandata3 The value of plandata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlandata3_PrefixSearch(String plandata3) {
        setPlandata3_LikeSearch(plandata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     */
    public void setPlandata3_IsNull() { regPlandata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     */
    public void setPlandata3_IsNullOrEmpty() { regPlandata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANDATA3: {varchar(30)}
     */
    public void setPlandata3_IsNotNull() { regPlandata3(CK_ISNN, DOBJ); }

    protected void regPlandata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlandata3(), "PLANDATA3"); }
    protected abstract ConditionValue xgetCValuePlandata3();

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
    public HpSLCFunction<TTrsojtdetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsojtdetailCB.class);
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
    public HpSLCFunction<TTrsojtdetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsojtdetailCB.class);
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
    public HpSLCFunction<TTrsojtdetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsojtdetailCB.class);
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
    public HpSLCFunction<TTrsojtdetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsojtdetailCB.class);
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
    public HpSLCFunction<TTrsojtdetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsojtdetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsojtdetailCB&gt;() {
     *     public void query(TTrsojtdetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsojtdetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsojtdetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtdetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsojtdetailCQ sq);

    protected TTrsojtdetailCB xcreateScalarConditionCB() {
        TTrsojtdetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsojtdetailCB xcreateScalarConditionPartitionByCB() {
        TTrsojtdetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsojtdetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtdetailCB cb = new TTrsojtdetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SOJTLINEID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsojtdetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsojtdetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsojtdetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsojtdetailCB cb = new TTrsojtdetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SOJTLINEID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsojtdetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsojtdetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsojtdetailCB cb = new TTrsojtdetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsojtdetailCQ sq);

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
    protected TTrsojtdetailCB newMyCB() {
        return new TTrsojtdetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsojtdetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
