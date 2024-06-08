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
 * The abstract condition-query of T_TRSTOCKDIFFHISTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrstockdiffhistoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrstockdiffhistoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSTOCKDIFFHISTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_Equal(Long trstockdiffhistoryId) {
        doSetTrstockdiffhistoryId_Equal(trstockdiffhistoryId);
    }

    protected void doSetTrstockdiffhistoryId_Equal(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_EQ, trstockdiffhistoryId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_NotEqual(Long trstockdiffhistoryId) {
        doSetTrstockdiffhistoryId_NotEqual(trstockdiffhistoryId);
    }

    protected void doSetTrstockdiffhistoryId_NotEqual(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_NES, trstockdiffhistoryId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_GreaterThan(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_GT, trstockdiffhistoryId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_LessThan(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_LT, trstockdiffhistoryId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_GreaterEqual(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_GE, trstockdiffhistoryId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryId The value of trstockdiffhistoryId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_LessEqual(Long trstockdiffhistoryId) {
        regTrstockdiffhistoryId(CK_LE, trstockdiffhistoryId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trstockdiffhistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trstockdiffhistoryId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrstockdiffhistoryId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrstockdiffhistoryId(), "TRSTOCKDIFFHISTORY_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryIdList The collection of trstockdiffhistoryId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_InScope(Collection<Long> trstockdiffhistoryIdList) {
        doSetTrstockdiffhistoryId_InScope(trstockdiffhistoryIdList);
    }

    protected void doSetTrstockdiffhistoryId_InScope(Collection<Long> trstockdiffhistoryIdList) {
        regINS(CK_INS, cTL(trstockdiffhistoryIdList), xgetCValueTrstockdiffhistoryId(), "TRSTOCKDIFFHISTORY_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trstockdiffhistoryIdList The collection of trstockdiffhistoryId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrstockdiffhistoryId_NotInScope(Collection<Long> trstockdiffhistoryIdList) {
        doSetTrstockdiffhistoryId_NotInScope(trstockdiffhistoryIdList);
    }

    protected void doSetTrstockdiffhistoryId_NotInScope(Collection<Long> trstockdiffhistoryIdList) {
        regINS(CK_NINS, cTL(trstockdiffhistoryIdList), xgetCValueTrstockdiffhistoryId(), "TRSTOCKDIFFHISTORY_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrstockdiffhistoryId_IsNull() { regTrstockdiffhistoryId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSTOCKDIFFHISTORY_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrstockdiffhistoryId_IsNotNull() { regTrstockdiffhistoryId(CK_ISNN, DOBJ); }

    protected void regTrstockdiffhistoryId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrstockdiffhistoryId(), "TRSTOCKDIFFHISTORY_ID"); }
    protected abstract ConditionValue xgetCValueTrstockdiffhistoryId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)} <br>
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_Equal(String diffaddDate) {
        doSetDiffaddDate_Equal(fRES(diffaddDate));
    }

    protected void doSetDiffaddDate_Equal(String diffaddDate) {
        regDiffaddDate(CK_EQ, diffaddDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_NotEqual(String diffaddDate) {
        doSetDiffaddDate_NotEqual(fRES(diffaddDate));
    }

    protected void doSetDiffaddDate_NotEqual(String diffaddDate) {
        regDiffaddDate(CK_NES, diffaddDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_GreaterThan(String diffaddDate) {
        regDiffaddDate(CK_GT, fRES(diffaddDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_LessThan(String diffaddDate) {
        regDiffaddDate(CK_LT, fRES(diffaddDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_GreaterEqual(String diffaddDate) {
        regDiffaddDate(CK_GE, fRES(diffaddDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_LessEqual(String diffaddDate) {
        regDiffaddDate(CK_LE, fRES(diffaddDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDateList The collection of diffaddDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_InScope(Collection<String> diffaddDateList) {
        doSetDiffaddDate_InScope(diffaddDateList);
    }

    protected void doSetDiffaddDate_InScope(Collection<String> diffaddDateList) {
        regINS(CK_INS, cTL(diffaddDateList), xgetCValueDiffaddDate(), "DIFFADD_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDateList The collection of diffaddDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_NotInScope(Collection<String> diffaddDateList) {
        doSetDiffaddDate_NotInScope(diffaddDateList);
    }

    protected void doSetDiffaddDate_NotInScope(Collection<String> diffaddDateList) {
        regINS(CK_NINS, cTL(diffaddDateList), xgetCValueDiffaddDate(), "DIFFADD_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setDiffaddDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffaddDate The value of diffaddDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffaddDate_LikeSearch(String diffaddDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffaddDate), xgetCValueDiffaddDate(), "DIFFADD_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffaddDate_NotLikeSearch(String diffaddDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffaddDate), xgetCValueDiffaddDate(), "DIFFADD_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADD_DATE: {NotNull, varchar(8)}
     * @param diffaddDate The value of diffaddDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffaddDate_PrefixSearch(String diffaddDate) {
        setDiffaddDate_LikeSearch(diffaddDate, xcLSOPPre());
    }

    protected void regDiffaddDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffaddDate(), "DIFFADD_DATE"); }
    protected abstract ConditionValue xgetCValueDiffaddDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_Equal(String diffoccArea) {
        doSetDiffoccArea_Equal(fRES(diffoccArea));
    }

    protected void doSetDiffoccArea_Equal(String diffoccArea) {
        regDiffoccArea(CK_EQ, diffoccArea);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_NotEqual(String diffoccArea) {
        doSetDiffoccArea_NotEqual(fRES(diffoccArea));
    }

    protected void doSetDiffoccArea_NotEqual(String diffoccArea) {
        regDiffoccArea(CK_NES, diffoccArea);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_GreaterThan(String diffoccArea) {
        regDiffoccArea(CK_GT, fRES(diffoccArea));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_LessThan(String diffoccArea) {
        regDiffoccArea(CK_LT, fRES(diffoccArea));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_GreaterEqual(String diffoccArea) {
        regDiffoccArea(CK_GE, fRES(diffoccArea));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_LessEqual(String diffoccArea) {
        regDiffoccArea(CK_LE, fRES(diffoccArea));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccAreaList The collection of diffoccArea as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_InScope(Collection<String> diffoccAreaList) {
        doSetDiffoccArea_InScope(diffoccAreaList);
    }

    protected void doSetDiffoccArea_InScope(Collection<String> diffoccAreaList) {
        regINS(CK_INS, cTL(diffoccAreaList), xgetCValueDiffoccArea(), "DIFFOCC_AREA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccAreaList The collection of diffoccArea as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_NotInScope(Collection<String> diffoccAreaList) {
        doSetDiffoccArea_NotInScope(diffoccAreaList);
    }

    protected void doSetDiffoccArea_NotInScope(Collection<String> diffoccAreaList) {
        regINS(CK_NINS, cTL(diffoccAreaList), xgetCValueDiffoccArea(), "DIFFOCC_AREA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)} <br>
     * <pre>e.g. setDiffoccArea_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffoccArea The value of diffoccArea as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffoccArea_LikeSearch(String diffoccArea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffoccArea), xgetCValueDiffoccArea(), "DIFFOCC_AREA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffoccArea_NotLikeSearch(String diffoccArea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffoccArea), xgetCValueDiffoccArea(), "DIFFOCC_AREA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCC_AREA: {NotNull, char(1)}
     * @param diffoccArea The value of diffoccArea as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccArea_PrefixSearch(String diffoccArea) {
        setDiffoccArea_LikeSearch(diffoccArea, xcLSOPPre());
    }

    protected void regDiffoccArea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffoccArea(), "DIFFOCC_AREA"); }
    protected abstract ConditionValue xgetCValueDiffoccArea();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {varchar(255)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_Equal(String inoutKbn) {
        doSetInoutKbn_Equal(fRES(inoutKbn));
    }

    protected void doSetInoutKbn_Equal(String inoutKbn) {
        regInoutKbn(CK_EQ, inoutKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_NotEqual(String inoutKbn) {
        doSetInoutKbn_NotEqual(fRES(inoutKbn));
    }

    protected void doSetInoutKbn_NotEqual(String inoutKbn) {
        regInoutKbn(CK_NES, inoutKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_GreaterThan(String inoutKbn) {
        regInoutKbn(CK_GT, fRES(inoutKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_LessThan(String inoutKbn) {
        regInoutKbn(CK_LT, fRES(inoutKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_GreaterEqual(String inoutKbn) {
        regInoutKbn(CK_GE, fRES(inoutKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_LessEqual(String inoutKbn) {
        regInoutKbn(CK_LE, fRES(inoutKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbnList The collection of inoutKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_InScope(Collection<String> inoutKbnList) {
        doSetInoutKbn_InScope(inoutKbnList);
    }

    protected void doSetInoutKbn_InScope(Collection<String> inoutKbnList) {
        regINS(CK_INS, cTL(inoutKbnList), xgetCValueInoutKbn(), "INOUT_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbnList The collection of inoutKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_NotInScope(Collection<String> inoutKbnList) {
        doSetInoutKbn_NotInScope(inoutKbnList);
    }

    protected void doSetInoutKbn_NotInScope(Collection<String> inoutKbnList) {
        regINS(CK_NINS, cTL(inoutKbnList), xgetCValueInoutKbn(), "INOUT_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInoutKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inoutKbn The value of inoutKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInoutKbn_LikeSearch(String inoutKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inoutKbn), xgetCValueInoutKbn(), "INOUT_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutKbn_NotLikeSearch(String inoutKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutKbn), xgetCValueInoutKbn(), "INOUT_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUT_KBN: {NotNull, varchar(30)}
     * @param inoutKbn The value of inoutKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutKbn_PrefixSearch(String inoutKbn) {
        setInoutKbn_LikeSearch(inoutKbn, xcLSOPPre());
    }

    protected void regInoutKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutKbn(), "INOUT_KBN"); }
    protected abstract ConditionValue xgetCValueInoutKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)}
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
     * PRODUCT_CD: {NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_Equal(String goodItemKbn) {
        doSetGoodItemKbn_Equal(fRES(goodItemKbn));
    }

    protected void doSetGoodItemKbn_Equal(String goodItemKbn) {
        regGoodItemKbn(CK_EQ, goodItemKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_NotEqual(String goodItemKbn) {
        doSetGoodItemKbn_NotEqual(fRES(goodItemKbn));
    }

    protected void doSetGoodItemKbn_NotEqual(String goodItemKbn) {
        regGoodItemKbn(CK_NES, goodItemKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_GreaterThan(String goodItemKbn) {
        regGoodItemKbn(CK_GT, fRES(goodItemKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_LessThan(String goodItemKbn) {
        regGoodItemKbn(CK_LT, fRES(goodItemKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_GreaterEqual(String goodItemKbn) {
        regGoodItemKbn(CK_GE, fRES(goodItemKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_LessEqual(String goodItemKbn) {
        regGoodItemKbn(CK_LE, fRES(goodItemKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbnList The collection of goodItemKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_InScope(Collection<String> goodItemKbnList) {
        doSetGoodItemKbn_InScope(goodItemKbnList);
    }

    protected void doSetGoodItemKbn_InScope(Collection<String> goodItemKbnList) {
        regINS(CK_INS, cTL(goodItemKbnList), xgetCValueGoodItemKbn(), "GOOD_ITEM_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbnList The collection of goodItemKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_NotInScope(Collection<String> goodItemKbnList) {
        doSetGoodItemKbn_NotInScope(goodItemKbnList);
    }

    protected void doSetGoodItemKbn_NotInScope(Collection<String> goodItemKbnList) {
        regINS(CK_NINS, cTL(goodItemKbnList), xgetCValueGoodItemKbn(), "GOOD_ITEM_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)} <br>
     * <pre>e.g. setGoodItemKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param goodItemKbn The value of goodItemKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setGoodItemKbn_LikeSearch(String goodItemKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(goodItemKbn), xgetCValueGoodItemKbn(), "GOOD_ITEM_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setGoodItemKbn_NotLikeSearch(String goodItemKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(goodItemKbn), xgetCValueGoodItemKbn(), "GOOD_ITEM_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * GOOD_ITEM_KBN: {NotNull, char(1)}
     * @param goodItemKbn The value of goodItemKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setGoodItemKbn_PrefixSearch(String goodItemKbn) {
        setGoodItemKbn_LikeSearch(goodItemKbn, xcLSOPPre());
    }

    protected void regGoodItemKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueGoodItemKbn(), "GOOD_ITEM_KBN"); }
    protected abstract ConditionValue xgetCValueGoodItemKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_Equal(String damageRefundKbn) {
        doSetDamageRefundKbn_Equal(fRES(damageRefundKbn));
    }

    protected void doSetDamageRefundKbn_Equal(String damageRefundKbn) {
        regDamageRefundKbn(CK_EQ, damageRefundKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_NotEqual(String damageRefundKbn) {
        doSetDamageRefundKbn_NotEqual(fRES(damageRefundKbn));
    }

    protected void doSetDamageRefundKbn_NotEqual(String damageRefundKbn) {
        regDamageRefundKbn(CK_NES, damageRefundKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_GreaterThan(String damageRefundKbn) {
        regDamageRefundKbn(CK_GT, fRES(damageRefundKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_LessThan(String damageRefundKbn) {
        regDamageRefundKbn(CK_LT, fRES(damageRefundKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_GreaterEqual(String damageRefundKbn) {
        regDamageRefundKbn(CK_GE, fRES(damageRefundKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_LessEqual(String damageRefundKbn) {
        regDamageRefundKbn(CK_LE, fRES(damageRefundKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbnList The collection of damageRefundKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_InScope(Collection<String> damageRefundKbnList) {
        doSetDamageRefundKbn_InScope(damageRefundKbnList);
    }

    protected void doSetDamageRefundKbn_InScope(Collection<String> damageRefundKbnList) {
        regINS(CK_INS, cTL(damageRefundKbnList), xgetCValueDamageRefundKbn(), "DAMAGE_REFUND_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbnList The collection of damageRefundKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_NotInScope(Collection<String> damageRefundKbnList) {
        doSetDamageRefundKbn_NotInScope(damageRefundKbnList);
    }

    protected void doSetDamageRefundKbn_NotInScope(Collection<String> damageRefundKbnList) {
        regINS(CK_NINS, cTL(damageRefundKbnList), xgetCValueDamageRefundKbn(), "DAMAGE_REFUND_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)} <br>
     * <pre>e.g. setDamageRefundKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param damageRefundKbn The value of damageRefundKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDamageRefundKbn_LikeSearch(String damageRefundKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(damageRefundKbn), xgetCValueDamageRefundKbn(), "DAMAGE_REFUND_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDamageRefundKbn_NotLikeSearch(String damageRefundKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(damageRefundKbn), xgetCValueDamageRefundKbn(), "DAMAGE_REFUND_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     * @param damageRefundKbn The value of damageRefundKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDamageRefundKbn_PrefixSearch(String damageRefundKbn) {
        setDamageRefundKbn_LikeSearch(damageRefundKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     */
    public void setDamageRefundKbn_IsNull() { regDamageRefundKbn(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAMAGE_REFUND_KBN: {char(1)}
     */
    public void setDamageRefundKbn_IsNotNull() { regDamageRefundKbn(CK_ISNN, DOBJ); }

    protected void regDamageRefundKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDamageRefundKbn(), "DAMAGE_REFUND_KBN"); }
    protected abstract ConditionValue xgetCValueDamageRefundKbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_Equal(java.math.BigDecimal diffQty) {
        doSetDiffQty_Equal(diffQty);
    }

    protected void doSetDiffQty_Equal(java.math.BigDecimal diffQty) {
        regDiffQty(CK_EQ, diffQty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_NotEqual(java.math.BigDecimal diffQty) {
        doSetDiffQty_NotEqual(diffQty);
    }

    protected void doSetDiffQty_NotEqual(java.math.BigDecimal diffQty) {
        regDiffQty(CK_NES, diffQty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_GreaterThan(java.math.BigDecimal diffQty) {
        regDiffQty(CK_GT, diffQty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_LessThan(java.math.BigDecimal diffQty) {
        regDiffQty(CK_LT, diffQty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_GreaterEqual(java.math.BigDecimal diffQty) {
        regDiffQty(CK_GE, diffQty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQty The value of diffQty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffQty_LessEqual(java.math.BigDecimal diffQty) {
        regDiffQty(CK_LE, diffQty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param minNumber The min number of diffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffQty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffQty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiffQty(), "DIFF_QTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQtyList The collection of diffQty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffQty_InScope(Collection<java.math.BigDecimal> diffQtyList) {
        doSetDiffQty_InScope(diffQtyList);
    }

    protected void doSetDiffQty_InScope(Collection<java.math.BigDecimal> diffQtyList) {
        regINS(CK_INS, cTL(diffQtyList), xgetCValueDiffQty(), "DIFF_QTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     * @param diffQtyList The collection of diffQty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffQty_NotInScope(Collection<java.math.BigDecimal> diffQtyList) {
        doSetDiffQty_NotInScope(diffQtyList);
    }

    protected void doSetDiffQty_NotInScope(Collection<java.math.BigDecimal> diffQtyList) {
        regINS(CK_NINS, cTL(diffQtyList), xgetCValueDiffQty(), "DIFF_QTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     */
    public void setDiffQty_IsNull() { regDiffQty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFF_QTY: {decimal(16, 6)}
     */
    public void setDiffQty_IsNotNull() { regDiffQty(CK_ISNN, DOBJ); }

    protected void regDiffQty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffQty(), "DIFF_QTY"); }
    protected abstract ConditionValue xgetCValueDiffQty();

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
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_Equal(String printedflg) {
        doSetPrintedflg_Equal(fRES(printedflg));
    }

    protected void doSetPrintedflg_Equal(String printedflg) {
        regPrintedflg(CK_EQ, printedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotEqual(String printedflg) {
        doSetPrintedflg_NotEqual(fRES(printedflg));
    }

    protected void doSetPrintedflg_NotEqual(String printedflg) {
        regPrintedflg(CK_NES, printedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_InScope(Collection<String> printedflgList) {
        doSetPrintedflg_InScope(printedflgList);
    }

    protected void doSetPrintedflg_InScope(Collection<String> printedflgList) {
        regINS(CK_INS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflgList The collection of printedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_NotInScope(Collection<String> printedflgList) {
        doSetPrintedflg_NotInScope(printedflgList);
    }

    protected void doSetPrintedflg_NotInScope(Collection<String> printedflgList) {
        regINS(CK_NINS, cTL(printedflgList), xgetCValuePrintedflg(), "PRINTEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)} <br>
     * <pre>e.g. setPrintedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printedflg The value of printedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrintedflg_LikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {NotNull, char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

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
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrstockdiffhistoryCB.class);
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
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrstockdiffhistoryCB.class);
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
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrstockdiffhistoryCB.class);
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
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrstockdiffhistoryCB.class);
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
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrstockdiffhistoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrstockdiffhistoryCB&gt;() {
     *     public void query(TTrstockdiffhistoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrstockdiffhistoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrstockdiffhistoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrstockdiffhistoryCQ sq);

    protected TTrstockdiffhistoryCB xcreateScalarConditionCB() {
        TTrstockdiffhistoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrstockdiffhistoryCB xcreateScalarConditionPartitionByCB() {
        TTrstockdiffhistoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrstockdiffhistoryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRSTOCKDIFFHISTORY_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrstockdiffhistoryCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrstockdiffhistoryCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrstockdiffhistoryCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRSTOCKDIFFHISTORY_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrstockdiffhistoryCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrstockdiffhistoryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrstockdiffhistoryCB cb = new TTrstockdiffhistoryCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrstockdiffhistoryCQ sq);

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
    protected TTrstockdiffhistoryCB newMyCB() {
        return new TTrstockdiffhistoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrstockdiffhistoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
