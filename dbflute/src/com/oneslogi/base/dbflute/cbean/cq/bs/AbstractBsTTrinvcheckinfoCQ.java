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
 * The abstract condition-query of T_TRINVCHECKINFO.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrinvcheckinfoCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrinvcheckinfoCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRINVCHECKINFO";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_Equal(Long trinvcheckinfoId) {
        doSetTrinvcheckinfoId_Equal(trinvcheckinfoId);
    }

    protected void doSetTrinvcheckinfoId_Equal(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_EQ, trinvcheckinfoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_NotEqual(Long trinvcheckinfoId) {
        doSetTrinvcheckinfoId_NotEqual(trinvcheckinfoId);
    }

    protected void doSetTrinvcheckinfoId_NotEqual(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_NES, trinvcheckinfoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_GreaterThan(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_GT, trinvcheckinfoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_LessThan(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_LT, trinvcheckinfoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_GreaterEqual(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_GE, trinvcheckinfoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoId The value of trinvcheckinfoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_LessEqual(Long trinvcheckinfoId) {
        regTrinvcheckinfoId(CK_LE, trinvcheckinfoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trinvcheckinfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trinvcheckinfoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrinvcheckinfoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrinvcheckinfoId(), "TRINVCHECKINFO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoIdList The collection of trinvcheckinfoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_InScope(Collection<Long> trinvcheckinfoIdList) {
        doSetTrinvcheckinfoId_InScope(trinvcheckinfoIdList);
    }

    protected void doSetTrinvcheckinfoId_InScope(Collection<Long> trinvcheckinfoIdList) {
        regINS(CK_INS, cTL(trinvcheckinfoIdList), xgetCValueTrinvcheckinfoId(), "TRINVCHECKINFO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trinvcheckinfoIdList The collection of trinvcheckinfoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrinvcheckinfoId_NotInScope(Collection<Long> trinvcheckinfoIdList) {
        doSetTrinvcheckinfoId_NotInScope(trinvcheckinfoIdList);
    }

    protected void doSetTrinvcheckinfoId_NotInScope(Collection<Long> trinvcheckinfoIdList) {
        regINS(CK_NINS, cTL(trinvcheckinfoIdList), xgetCValueTrinvcheckinfoId(), "TRINVCHECKINFO_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvcheckinfoId_IsNull() { regTrinvcheckinfoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRINVCHECKINFO_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrinvcheckinfoId_IsNotNull() { regTrinvcheckinfoId(CK_ISNN, DOBJ); }

    protected void regTrinvcheckinfoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrinvcheckinfoId(), "TRINVCHECKINFO_ID"); }
    protected abstract ConditionValue xgetCValueTrinvcheckinfoId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_Equal(String executedate) {
        doSetExecutedate_Equal(fRES(executedate));
    }

    protected void doSetExecutedate_Equal(String executedate) {
        regExecutedate(CK_EQ, executedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_NotEqual(String executedate) {
        doSetExecutedate_NotEqual(fRES(executedate));
    }

    protected void doSetExecutedate_NotEqual(String executedate) {
        regExecutedate(CK_NES, executedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_GreaterThan(String executedate) {
        regExecutedate(CK_GT, fRES(executedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_LessThan(String executedate) {
        regExecutedate(CK_LT, fRES(executedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_GreaterEqual(String executedate) {
        regExecutedate(CK_GE, fRES(executedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_LessEqual(String executedate) {
        regExecutedate(CK_LE, fRES(executedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedateList The collection of executedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_InScope(Collection<String> executedateList) {
        doSetExecutedate_InScope(executedateList);
    }

    protected void doSetExecutedate_InScope(Collection<String> executedateList) {
        regINS(CK_INS, cTL(executedateList), xgetCValueExecutedate(), "EXECUTEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedateList The collection of executedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_NotInScope(Collection<String> executedateList) {
        doSetExecutedate_NotInScope(executedateList);
    }

    protected void doSetExecutedate_NotInScope(Collection<String> executedateList) {
        regINS(CK_NINS, cTL(executedateList), xgetCValueExecutedate(), "EXECUTEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setExecutedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param executedate The value of executedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExecutedate_LikeSearch(String executedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(executedate), xgetCValueExecutedate(), "EXECUTEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExecutedate_NotLikeSearch(String executedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(executedate), xgetCValueExecutedate(), "EXECUTEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXECUTEDATE: {NotNull, varchar(8)}
     * @param executedate The value of executedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExecutedate_PrefixSearch(String executedate) {
        setExecutedate_LikeSearch(executedate, xcLSOPPre());
    }

    protected void regExecutedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExecutedate(), "EXECUTEDATE"); }
    protected abstract ConditionValue xgetCValueExecutedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
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
     * INOUTKBN: {NotNull, varchar(30)}
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
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterThan(String inoutkbn) {
        regInoutkbn(CK_GT, fRES(inoutkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessThan(String inoutkbn) {
        regInoutkbn(CK_LT, fRES(inoutkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_GreaterEqual(String inoutkbn) {
        regInoutkbn(CK_GE, fRES(inoutkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_LessEqual(String inoutkbn) {
        regInoutkbn(CK_LE, fRES(inoutkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
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
     * INOUTKBN: {NotNull, varchar(30)}
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
     * INOUTKBN: {NotNull, varchar(30)} <br>
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
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInoutkbn_NotLikeSearch(String inoutkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inoutkbn), xgetCValueInoutkbn(), "INOUTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INOUTKBN: {NotNull, varchar(30)}
     * @param inoutkbn The value of inoutkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInoutkbn_PrefixSearch(String inoutkbn) {
        setInoutkbn_LikeSearch(inoutkbn, xcLSOPPre());
    }

    protected void regInoutkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInoutkbn(), "INOUTKBN"); }
    protected abstract ConditionValue xgetCValueInoutkbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
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
     * PRODUCT_ID: {NotNull, bigint(19), FK to M_PRODUCT}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from M_PRODUCT where ...)} <br />
     * M_PRODUCT by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_Equal(java.math.BigDecimal dualitemcdflg) {
        doSetDualitemcdflg_Equal(dualitemcdflg);
    }

    protected void doSetDualitemcdflg_Equal(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_EQ, dualitemcdflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_NotEqual(java.math.BigDecimal dualitemcdflg) {
        doSetDualitemcdflg_NotEqual(dualitemcdflg);
    }

    protected void doSetDualitemcdflg_NotEqual(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_NES, dualitemcdflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_GreaterThan(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_GT, dualitemcdflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_LessThan(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_LT, dualitemcdflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_GreaterEqual(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_GE, dualitemcdflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflg The value of dualitemcdflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDualitemcdflg_LessEqual(java.math.BigDecimal dualitemcdflg) {
        regDualitemcdflg(CK_LE, dualitemcdflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of dualitemcdflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dualitemcdflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDualitemcdflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDualitemcdflg(), "DUALITEMCDFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflgList The collection of dualitemcdflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcdflg_InScope(Collection<java.math.BigDecimal> dualitemcdflgList) {
        doSetDualitemcdflg_InScope(dualitemcdflgList);
    }

    protected void doSetDualitemcdflg_InScope(Collection<java.math.BigDecimal> dualitemcdflgList) {
        regINS(CK_INS, cTL(dualitemcdflgList), xgetCValueDualitemcdflg(), "DUALITEMCDFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DUALITEMCDFLG: {NotNull, decimal(16, 6)}
     * @param dualitemcdflgList The collection of dualitemcdflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcdflg_NotInScope(Collection<java.math.BigDecimal> dualitemcdflgList) {
        doSetDualitemcdflg_NotInScope(dualitemcdflgList);
    }

    protected void doSetDualitemcdflg_NotInScope(Collection<java.math.BigDecimal> dualitemcdflgList) {
        regINS(CK_NINS, cTL(dualitemcdflgList), xgetCValueDualitemcdflg(), "DUALITEMCDFLG");
    }

    protected void regDualitemcdflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDualitemcdflg(), "DUALITEMCDFLG"); }
    protected abstract ConditionValue xgetCValueDualitemcdflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_Equal(String dualitemcd) {
        doSetDualitemcd_Equal(fRES(dualitemcd));
    }

    protected void doSetDualitemcd_Equal(String dualitemcd) {
        regDualitemcd(CK_EQ, dualitemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_NotEqual(String dualitemcd) {
        doSetDualitemcd_NotEqual(fRES(dualitemcd));
    }

    protected void doSetDualitemcd_NotEqual(String dualitemcd) {
        regDualitemcd(CK_NES, dualitemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_GreaterThan(String dualitemcd) {
        regDualitemcd(CK_GT, fRES(dualitemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_LessThan(String dualitemcd) {
        regDualitemcd(CK_LT, fRES(dualitemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_GreaterEqual(String dualitemcd) {
        regDualitemcd(CK_GE, fRES(dualitemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_LessEqual(String dualitemcd) {
        regDualitemcd(CK_LE, fRES(dualitemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcdList The collection of dualitemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_InScope(Collection<String> dualitemcdList) {
        doSetDualitemcd_InScope(dualitemcdList);
    }

    protected void doSetDualitemcd_InScope(Collection<String> dualitemcdList) {
        regINS(CK_INS, cTL(dualitemcdList), xgetCValueDualitemcd(), "DUALITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcdList The collection of dualitemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_NotInScope(Collection<String> dualitemcdList) {
        doSetDualitemcd_NotInScope(dualitemcdList);
    }

    protected void doSetDualitemcd_NotInScope(Collection<String> dualitemcdList) {
        regINS(CK_NINS, cTL(dualitemcdList), xgetCValueDualitemcd(), "DUALITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUALITEMCD: {varchar(30)} <br>
     * <pre>e.g. setDualitemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dualitemcd The value of dualitemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDualitemcd_LikeSearch(String dualitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dualitemcd), xgetCValueDualitemcd(), "DUALITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDualitemcd_NotLikeSearch(String dualitemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dualitemcd), xgetCValueDualitemcd(), "DUALITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     * @param dualitemcd The value of dualitemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDualitemcd_PrefixSearch(String dualitemcd) {
        setDualitemcd_LikeSearch(dualitemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     */
    public void setDualitemcd_IsNull() { regDualitemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     */
    public void setDualitemcd_IsNullOrEmpty() { regDualitemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DUALITEMCD: {varchar(30)}
     */
    public void setDualitemcd_IsNotNull() { regDualitemcd(CK_ISNN, DOBJ); }

    protected void regDualitemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDualitemcd(), "DUALITEMCD"); }
    protected abstract ConditionValue xgetCValueDualitemcd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_Equal(java.math.BigDecimal ydaytlequlytotalinv) {
        doSetYdaytlequlytotalinv_Equal(ydaytlequlytotalinv);
    }

    protected void doSetYdaytlequlytotalinv_Equal(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_EQ, ydaytlequlytotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_NotEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        doSetYdaytlequlytotalinv_NotEqual(ydaytlequlytotalinv);
    }

    protected void doSetYdaytlequlytotalinv_NotEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_NES, ydaytlequlytotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_GreaterThan(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_GT, ydaytlequlytotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_LessThan(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_LT, ydaytlequlytotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_GreaterEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_GE, ydaytlequlytotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinv The value of ydaytlequlytotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_LessEqual(java.math.BigDecimal ydaytlequlytotalinv) {
        regYdaytlequlytotalinv(CK_LE, ydaytlequlytotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of ydaytlequlytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of ydaytlequlytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setYdaytlequlytotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinvList The collection of ydaytlequlytotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        doSetYdaytlequlytotalinv_InScope(ydaytlequlytotalinvList);
    }

    protected void doSetYdaytlequlytotalinv_InScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        regINS(CK_INS, cTL(ydaytlequlytotalinvList), xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     * @param ydaytlequlytotalinvList The collection of ydaytlequlytotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setYdaytlequlytotalinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        doSetYdaytlequlytotalinv_NotInScope(ydaytlequlytotalinvList);
    }

    protected void doSetYdaytlequlytotalinv_NotInScope(Collection<java.math.BigDecimal> ydaytlequlytotalinvList) {
        regINS(CK_NINS, cTL(ydaytlequlytotalinvList), xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytotalinv_IsNull() { regYdaytlequlytotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * YDAYTLEQULYTOTALINV: {decimal(16, 6)}
     */
    public void setYdaytlequlytotalinv_IsNotNull() { regYdaytlequlytotalinv(CK_ISNN, DOBJ); }

    protected void regYdaytlequlytotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueYdaytlequlytotalinv(), "YDAYTLEQULYTOTALINV"); }
    protected abstract ConditionValue xgetCValueYdaytlequlytotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_Equal(java.math.BigDecimal tdayeqytotalinv) {
        doSetTdayeqytotalinv_Equal(tdayeqytotalinv);
    }

    protected void doSetTdayeqytotalinv_Equal(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_EQ, tdayeqytotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_NotEqual(java.math.BigDecimal tdayeqytotalinv) {
        doSetTdayeqytotalinv_NotEqual(tdayeqytotalinv);
    }

    protected void doSetTdayeqytotalinv_NotEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_NES, tdayeqytotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_GreaterThan(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_GT, tdayeqytotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_LessThan(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_LT, tdayeqytotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_GreaterEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_GE, tdayeqytotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinv The value of tdayeqytotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_LessEqual(java.math.BigDecimal tdayeqytotalinv) {
        regTdayeqytotalinv(CK_LE, tdayeqytotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of tdayeqytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of tdayeqytotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTdayeqytotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinvList The collection of tdayeqytotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_InScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        doSetTdayeqytotalinv_InScope(tdayeqytotalinvList);
    }

    protected void doSetTdayeqytotalinv_InScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        regINS(CK_INS, cTL(tdayeqytotalinvList), xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     * @param tdayeqytotalinvList The collection of tdayeqytotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTdayeqytotalinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        doSetTdayeqytotalinv_NotInScope(tdayeqytotalinvList);
    }

    protected void doSetTdayeqytotalinv_NotInScope(Collection<java.math.BigDecimal> tdayeqytotalinvList) {
        regINS(CK_NINS, cTL(tdayeqytotalinvList), xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     */
    public void setTdayeqytotalinv_IsNull() { regTdayeqytotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TDAYEQYTOTALINV: {decimal(16, 6)}
     */
    public void setTdayeqytotalinv_IsNotNull() { regTdayeqytotalinv(CK_ISNN, DOBJ); }

    protected void regTdayeqytotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTdayeqytotalinv(), "TDAYEQYTOTALINV"); }
    protected abstract ConditionValue xgetCValueTdayeqytotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_Equal(java.math.BigDecimal sysinvtotalinv) {
        doSetSysinvtotalinv_Equal(sysinvtotalinv);
    }

    protected void doSetSysinvtotalinv_Equal(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_EQ, sysinvtotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_NotEqual(java.math.BigDecimal sysinvtotalinv) {
        doSetSysinvtotalinv_NotEqual(sysinvtotalinv);
    }

    protected void doSetSysinvtotalinv_NotEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_NES, sysinvtotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_GreaterThan(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_GT, sysinvtotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_LessThan(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_LT, sysinvtotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_GreaterEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_GE, sysinvtotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinv The value of sysinvtotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_LessEqual(java.math.BigDecimal sysinvtotalinv) {
        regSysinvtotalinv(CK_LE, sysinvtotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of sysinvtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sysinvtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSysinvtotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSysinvtotalinv(), "SYSINVTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinvList The collection of sysinvtotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_InScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        doSetSysinvtotalinv_InScope(sysinvtotalinvList);
    }

    protected void doSetSysinvtotalinv_InScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        regINS(CK_INS, cTL(sysinvtotalinvList), xgetCValueSysinvtotalinv(), "SYSINVTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     * @param sysinvtotalinvList The collection of sysinvtotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSysinvtotalinv_NotInScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        doSetSysinvtotalinv_NotInScope(sysinvtotalinvList);
    }

    protected void doSetSysinvtotalinv_NotInScope(Collection<java.math.BigDecimal> sysinvtotalinvList) {
        regINS(CK_NINS, cTL(sysinvtotalinvList), xgetCValueSysinvtotalinv(), "SYSINVTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     */
    public void setSysinvtotalinv_IsNull() { regSysinvtotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SYSINVTOTALINV: {decimal(16, 6)}
     */
    public void setSysinvtotalinv_IsNotNull() { regSysinvtotalinv(CK_ISNN, DOBJ); }

    protected void regSysinvtotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSysinvtotalinv(), "SYSINVTOTALINV"); }
    protected abstract ConditionValue xgetCValueSysinvtotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_Equal(java.math.BigDecimal investtotalinv) {
        doSetInvesttotalinv_Equal(investtotalinv);
    }

    protected void doSetInvesttotalinv_Equal(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_EQ, investtotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_NotEqual(java.math.BigDecimal investtotalinv) {
        doSetInvesttotalinv_NotEqual(investtotalinv);
    }

    protected void doSetInvesttotalinv_NotEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_NES, investtotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_GreaterThan(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_GT, investtotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_LessThan(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_LT, investtotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_GreaterEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_GE, investtotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinv The value of investtotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttotalinv_LessEqual(java.math.BigDecimal investtotalinv) {
        regInvesttotalinv(CK_LE, investtotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of investtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investtotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvesttotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvesttotalinv(), "INVESTTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinvList The collection of investtotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttotalinv_InScope(Collection<java.math.BigDecimal> investtotalinvList) {
        doSetInvesttotalinv_InScope(investtotalinvList);
    }

    protected void doSetInvesttotalinv_InScope(Collection<java.math.BigDecimal> investtotalinvList) {
        regINS(CK_INS, cTL(investtotalinvList), xgetCValueInvesttotalinv(), "INVESTTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     * @param investtotalinvList The collection of investtotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttotalinv_NotInScope(Collection<java.math.BigDecimal> investtotalinvList) {
        doSetInvesttotalinv_NotInScope(investtotalinvList);
    }

    protected void doSetInvesttotalinv_NotInScope(Collection<java.math.BigDecimal> investtotalinvList) {
        regINS(CK_NINS, cTL(investtotalinvList), xgetCValueInvesttotalinv(), "INVESTTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     */
    public void setInvesttotalinv_IsNull() { regInvesttotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTTOTALINV: {decimal(16, 6)}
     */
    public void setInvesttotalinv_IsNotNull() { regInvesttotalinv(CK_ISNN, DOBJ); }

    protected void regInvesttotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvesttotalinv(), "INVESTTOTALINV"); }
    protected abstract ConditionValue xgetCValueInvesttotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_Equal(java.math.BigDecimal investkeeplocinv) {
        doSetInvestkeeplocinv_Equal(investkeeplocinv);
    }

    protected void doSetInvestkeeplocinv_Equal(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_EQ, investkeeplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_NotEqual(java.math.BigDecimal investkeeplocinv) {
        doSetInvestkeeplocinv_NotEqual(investkeeplocinv);
    }

    protected void doSetInvestkeeplocinv_NotEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_NES, investkeeplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_GreaterThan(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_GT, investkeeplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_LessThan(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_LT, investkeeplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_GreaterEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_GE, investkeeplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinv The value of investkeeplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_LessEqual(java.math.BigDecimal investkeeplocinv) {
        regInvestkeeplocinv(CK_LE, investkeeplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investkeeplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestkeeplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinvList The collection of investkeeplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_InScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        doSetInvestkeeplocinv_InScope(investkeeplocinvList);
    }

    protected void doSetInvestkeeplocinv_InScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        regINS(CK_INS, cTL(investkeeplocinvList), xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     * @param investkeeplocinvList The collection of investkeeplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestkeeplocinv_NotInScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        doSetInvestkeeplocinv_NotInScope(investkeeplocinvList);
    }

    protected void doSetInvestkeeplocinv_NotInScope(Collection<java.math.BigDecimal> investkeeplocinvList) {
        regINS(CK_NINS, cTL(investkeeplocinvList), xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     */
    public void setInvestkeeplocinv_IsNull() { regInvestkeeplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTKEEPLOCINV: {decimal(16, 6)}
     */
    public void setInvestkeeplocinv_IsNotNull() { regInvestkeeplocinv(CK_ISNN, DOBJ); }

    protected void regInvestkeeplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestkeeplocinv(), "INVESTKEEPLOCINV"); }
    protected abstract ConditionValue xgetCValueInvestkeeplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_Equal(java.math.BigDecimal investreceivelocinv) {
        doSetInvestreceivelocinv_Equal(investreceivelocinv);
    }

    protected void doSetInvestreceivelocinv_Equal(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_EQ, investreceivelocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_NotEqual(java.math.BigDecimal investreceivelocinv) {
        doSetInvestreceivelocinv_NotEqual(investreceivelocinv);
    }

    protected void doSetInvestreceivelocinv_NotEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_NES, investreceivelocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_GreaterThan(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_GT, investreceivelocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_LessThan(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_LT, investreceivelocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_GreaterEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_GE, investreceivelocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinv The value of investreceivelocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_LessEqual(java.math.BigDecimal investreceivelocinv) {
        regInvestreceivelocinv(CK_LE, investreceivelocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investreceivelocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestreceivelocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinvList The collection of investreceivelocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_InScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        doSetInvestreceivelocinv_InScope(investreceivelocinvList);
    }

    protected void doSetInvestreceivelocinv_InScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        regINS(CK_INS, cTL(investreceivelocinvList), xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     * @param investreceivelocinvList The collection of investreceivelocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestreceivelocinv_NotInScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        doSetInvestreceivelocinv_NotInScope(investreceivelocinvList);
    }

    protected void doSetInvestreceivelocinv_NotInScope(Collection<java.math.BigDecimal> investreceivelocinvList) {
        regINS(CK_NINS, cTL(investreceivelocinvList), xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setInvestreceivelocinv_IsNull() { regInvestreceivelocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTRECEIVELOCINV: {decimal(16, 6)}
     */
    public void setInvestreceivelocinv_IsNotNull() { regInvestreceivelocinv(CK_ISNN, DOBJ); }

    protected void regInvestreceivelocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestreceivelocinv(), "INVESTRECEIVELOCINV"); }
    protected abstract ConditionValue xgetCValueInvestreceivelocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_Equal(java.math.BigDecimal investdamageitem) {
        doSetInvestdamageitem_Equal(investdamageitem);
    }

    protected void doSetInvestdamageitem_Equal(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_EQ, investdamageitem);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_NotEqual(java.math.BigDecimal investdamageitem) {
        doSetInvestdamageitem_NotEqual(investdamageitem);
    }

    protected void doSetInvestdamageitem_NotEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_NES, investdamageitem);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_GreaterThan(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_GT, investdamageitem);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_LessThan(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_LT, investdamageitem);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_GreaterEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_GE, investdamageitem);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitem The value of investdamageitem as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestdamageitem_LessEqual(java.math.BigDecimal investdamageitem) {
        regInvestdamageitem(CK_LE, investdamageitem);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param minNumber The min number of investdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investdamageitem. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestdamageitem_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitemList The collection of investdamageitem as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestdamageitem_InScope(Collection<java.math.BigDecimal> investdamageitemList) {
        doSetInvestdamageitem_InScope(investdamageitemList);
    }

    protected void doSetInvestdamageitem_InScope(Collection<java.math.BigDecimal> investdamageitemList) {
        regINS(CK_INS, cTL(investdamageitemList), xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     * @param investdamageitemList The collection of investdamageitem as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestdamageitem_NotInScope(Collection<java.math.BigDecimal> investdamageitemList) {
        doSetInvestdamageitem_NotInScope(investdamageitemList);
    }

    protected void doSetInvestdamageitem_NotInScope(Collection<java.math.BigDecimal> investdamageitemList) {
        regINS(CK_NINS, cTL(investdamageitemList), xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     */
    public void setInvestdamageitem_IsNull() { regInvestdamageitem(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTDAMAGEITEM: {decimal(16, 6)}
     */
    public void setInvestdamageitem_IsNotNull() { regInvestdamageitem(CK_ISNN, DOBJ); }

    protected void regInvestdamageitem(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestdamageitem(), "INVESTDAMAGEITEM"); }
    protected abstract ConditionValue xgetCValueInvestdamageitem();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_Equal(java.math.BigDecimal investclssifylocinv) {
        doSetInvestclssifylocinv_Equal(investclssifylocinv);
    }

    protected void doSetInvestclssifylocinv_Equal(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_EQ, investclssifylocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_NotEqual(java.math.BigDecimal investclssifylocinv) {
        doSetInvestclssifylocinv_NotEqual(investclssifylocinv);
    }

    protected void doSetInvestclssifylocinv_NotEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_NES, investclssifylocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_GreaterThan(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_GT, investclssifylocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_LessThan(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_LT, investclssifylocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_GreaterEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_GE, investclssifylocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinv The value of investclssifylocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_LessEqual(java.math.BigDecimal investclssifylocinv) {
        regInvestclssifylocinv(CK_LE, investclssifylocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investclssifylocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestclssifylocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinvList The collection of investclssifylocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_InScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        doSetInvestclssifylocinv_InScope(investclssifylocinvList);
    }

    protected void doSetInvestclssifylocinv_InScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        regINS(CK_INS, cTL(investclssifylocinvList), xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     * @param investclssifylocinvList The collection of investclssifylocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestclssifylocinv_NotInScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        doSetInvestclssifylocinv_NotInScope(investclssifylocinvList);
    }

    protected void doSetInvestclssifylocinv_NotInScope(Collection<java.math.BigDecimal> investclssifylocinvList) {
        regINS(CK_NINS, cTL(investclssifylocinvList), xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setInvestclssifylocinv_IsNull() { regInvestclssifylocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTCLSSIFYLOCINV: {decimal(16, 6)}
     */
    public void setInvestclssifylocinv_IsNotNull() { regInvestclssifylocinv(CK_ISNN, DOBJ); }

    protected void regInvestclssifylocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestclssifylocinv(), "INVESTCLSSIFYLOCINV"); }
    protected abstract ConditionValue xgetCValueInvestclssifylocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_Equal(java.math.BigDecimal investtmplocinv) {
        doSetInvesttmplocinv_Equal(investtmplocinv);
    }

    protected void doSetInvesttmplocinv_Equal(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_EQ, investtmplocinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_NotEqual(java.math.BigDecimal investtmplocinv) {
        doSetInvesttmplocinv_NotEqual(investtmplocinv);
    }

    protected void doSetInvesttmplocinv_NotEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_NES, investtmplocinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_GreaterThan(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_GT, investtmplocinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_LessThan(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_LT, investtmplocinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_GreaterEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_GE, investtmplocinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinv The value of investtmplocinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_LessEqual(java.math.BigDecimal investtmplocinv) {
        regInvesttmplocinv(CK_LE, investtmplocinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param minNumber The min number of investtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investtmplocinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvesttmplocinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinvList The collection of investtmplocinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_InScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        doSetInvesttmplocinv_InScope(investtmplocinvList);
    }

    protected void doSetInvesttmplocinv_InScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        regINS(CK_INS, cTL(investtmplocinvList), xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     * @param investtmplocinvList The collection of investtmplocinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvesttmplocinv_NotInScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        doSetInvesttmplocinv_NotInScope(investtmplocinvList);
    }

    protected void doSetInvesttmplocinv_NotInScope(Collection<java.math.BigDecimal> investtmplocinvList) {
        regINS(CK_NINS, cTL(investtmplocinvList), xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     */
    public void setInvesttmplocinv_IsNull() { regInvesttmplocinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTTMPLOCINV: {decimal(16, 6)}
     */
    public void setInvesttmplocinv_IsNotNull() { regInvesttmplocinv(CK_ISNN, DOBJ); }

    protected void regInvesttmplocinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvesttmplocinv(), "INVESTTMPLOCINV"); }
    protected abstract ConditionValue xgetCValueInvesttmplocinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_Equal(java.math.BigDecimal investautoinv) {
        doSetInvestautoinv_Equal(investautoinv);
    }

    protected void doSetInvestautoinv_Equal(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_EQ, investautoinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_NotEqual(java.math.BigDecimal investautoinv) {
        doSetInvestautoinv_NotEqual(investautoinv);
    }

    protected void doSetInvestautoinv_NotEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_NES, investautoinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_GreaterThan(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_GT, investautoinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_LessThan(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_LT, investautoinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_GreaterEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_GE, investautoinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinv The value of investautoinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvestautoinv_LessEqual(java.math.BigDecimal investautoinv) {
        regInvestautoinv(CK_LE, investautoinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param minNumber The min number of investautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of investautoinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvestautoinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvestautoinv(), "INVESTAUTOINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinvList The collection of investautoinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestautoinv_InScope(Collection<java.math.BigDecimal> investautoinvList) {
        doSetInvestautoinv_InScope(investautoinvList);
    }

    protected void doSetInvestautoinv_InScope(Collection<java.math.BigDecimal> investautoinvList) {
        regINS(CK_INS, cTL(investautoinvList), xgetCValueInvestautoinv(), "INVESTAUTOINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     * @param investautoinvList The collection of investautoinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvestautoinv_NotInScope(Collection<java.math.BigDecimal> investautoinvList) {
        doSetInvestautoinv_NotInScope(investautoinvList);
    }

    protected void doSetInvestautoinv_NotInScope(Collection<java.math.BigDecimal> investautoinvList) {
        regINS(CK_NINS, cTL(investautoinvList), xgetCValueInvestautoinv(), "INVESTAUTOINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     */
    public void setInvestautoinv_IsNull() { regInvestautoinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVESTAUTOINV: {decimal(16, 6)}
     */
    public void setInvestautoinv_IsNotNull() { regInvestautoinv(CK_ISNN, DOBJ); }

    protected void regInvestautoinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvestautoinv(), "INVESTAUTOINV"); }
    protected abstract ConditionValue xgetCValueInvestautoinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_Equal(java.math.BigDecimal excesstotalinv) {
        doSetExcesstotalinv_Equal(excesstotalinv);
    }

    protected void doSetExcesstotalinv_Equal(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_EQ, excesstotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_NotEqual(java.math.BigDecimal excesstotalinv) {
        doSetExcesstotalinv_NotEqual(excesstotalinv);
    }

    protected void doSetExcesstotalinv_NotEqual(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_NES, excesstotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_GreaterThan(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_GT, excesstotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_LessThan(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_LT, excesstotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_GreaterEqual(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_GE, excesstotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinv The value of excesstotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExcesstotalinv_LessEqual(java.math.BigDecimal excesstotalinv) {
        regExcesstotalinv(CK_LE, excesstotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of excesstotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of excesstotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExcesstotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExcesstotalinv(), "EXCESSTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinvList The collection of excesstotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExcesstotalinv_InScope(Collection<java.math.BigDecimal> excesstotalinvList) {
        doSetExcesstotalinv_InScope(excesstotalinvList);
    }

    protected void doSetExcesstotalinv_InScope(Collection<java.math.BigDecimal> excesstotalinvList) {
        regINS(CK_INS, cTL(excesstotalinvList), xgetCValueExcesstotalinv(), "EXCESSTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     * @param excesstotalinvList The collection of excesstotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExcesstotalinv_NotInScope(Collection<java.math.BigDecimal> excesstotalinvList) {
        doSetExcesstotalinv_NotInScope(excesstotalinvList);
    }

    protected void doSetExcesstotalinv_NotInScope(Collection<java.math.BigDecimal> excesstotalinvList) {
        regINS(CK_NINS, cTL(excesstotalinvList), xgetCValueExcesstotalinv(), "EXCESSTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     */
    public void setExcesstotalinv_IsNull() { regExcesstotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXCESSTOTALINV: {decimal(16, 6)}
     */
    public void setExcesstotalinv_IsNotNull() { regExcesstotalinv(CK_ISNN, DOBJ); }

    protected void regExcesstotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExcesstotalinv(), "EXCESSTOTALINV"); }
    protected abstract ConditionValue xgetCValueExcesstotalinv();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_Equal(java.math.BigDecimal defecttotalinv) {
        doSetDefecttotalinv_Equal(defecttotalinv);
    }

    protected void doSetDefecttotalinv_Equal(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_EQ, defecttotalinv);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_NotEqual(java.math.BigDecimal defecttotalinv) {
        doSetDefecttotalinv_NotEqual(defecttotalinv);
    }

    protected void doSetDefecttotalinv_NotEqual(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_NES, defecttotalinv);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_GreaterThan(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_GT, defecttotalinv);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_LessThan(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_LT, defecttotalinv);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_GreaterEqual(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_GE, defecttotalinv);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinv The value of defecttotalinv as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDefecttotalinv_LessEqual(java.math.BigDecimal defecttotalinv) {
        regDefecttotalinv(CK_LE, defecttotalinv);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param minNumber The min number of defecttotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of defecttotalinv. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDefecttotalinv_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDefecttotalinv(), "DEFECTTOTALINV", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinvList The collection of defecttotalinv as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefecttotalinv_InScope(Collection<java.math.BigDecimal> defecttotalinvList) {
        doSetDefecttotalinv_InScope(defecttotalinvList);
    }

    protected void doSetDefecttotalinv_InScope(Collection<java.math.BigDecimal> defecttotalinvList) {
        regINS(CK_INS, cTL(defecttotalinvList), xgetCValueDefecttotalinv(), "DEFECTTOTALINV");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     * @param defecttotalinvList The collection of defecttotalinv as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDefecttotalinv_NotInScope(Collection<java.math.BigDecimal> defecttotalinvList) {
        doSetDefecttotalinv_NotInScope(defecttotalinvList);
    }

    protected void doSetDefecttotalinv_NotInScope(Collection<java.math.BigDecimal> defecttotalinvList) {
        regINS(CK_NINS, cTL(defecttotalinvList), xgetCValueDefecttotalinv(), "DEFECTTOTALINV");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     */
    public void setDefecttotalinv_IsNull() { regDefecttotalinv(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEFECTTOTALINV: {decimal(16, 6)}
     */
    public void setDefecttotalinv_IsNotNull() { regDefecttotalinv(CK_ISNN, DOBJ); }

    protected void regDefecttotalinv(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDefecttotalinv(), "DEFECTTOTALINV"); }
    protected abstract ConditionValue xgetCValueDefecttotalinv();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_Equal(String capitemflg) {
        doSetCapitemflg_Equal(fRES(capitemflg));
    }

    protected void doSetCapitemflg_Equal(String capitemflg) {
        regCapitemflg(CK_EQ, capitemflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_NotEqual(String capitemflg) {
        doSetCapitemflg_NotEqual(fRES(capitemflg));
    }

    protected void doSetCapitemflg_NotEqual(String capitemflg) {
        regCapitemflg(CK_NES, capitemflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_GreaterThan(String capitemflg) {
        regCapitemflg(CK_GT, fRES(capitemflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_LessThan(String capitemflg) {
        regCapitemflg(CK_LT, fRES(capitemflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_GreaterEqual(String capitemflg) {
        regCapitemflg(CK_GE, fRES(capitemflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_LessEqual(String capitemflg) {
        regCapitemflg(CK_LE, fRES(capitemflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflgList The collection of capitemflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_InScope(Collection<String> capitemflgList) {
        doSetCapitemflg_InScope(capitemflgList);
    }

    protected void doSetCapitemflg_InScope(Collection<String> capitemflgList) {
        regINS(CK_INS, cTL(capitemflgList), xgetCValueCapitemflg(), "CAPITEMFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflgList The collection of capitemflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_NotInScope(Collection<String> capitemflgList) {
        doSetCapitemflg_NotInScope(capitemflgList);
    }

    protected void doSetCapitemflg_NotInScope(Collection<String> capitemflgList) {
        regINS(CK_NINS, cTL(capitemflgList), xgetCValueCapitemflg(), "CAPITEMFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {char(1)} <br>
     * <pre>e.g. setCapitemflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param capitemflg The value of capitemflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCapitemflg_LikeSearch(String capitemflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(capitemflg), xgetCValueCapitemflg(), "CAPITEMFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCapitemflg_NotLikeSearch(String capitemflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(capitemflg), xgetCValueCapitemflg(), "CAPITEMFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CAPITEMFLG: {char(1)}
     * @param capitemflg The value of capitemflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCapitemflg_PrefixSearch(String capitemflg) {
        setCapitemflg_LikeSearch(capitemflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     */
    public void setCapitemflg_IsNull() { regCapitemflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CAPITEMFLG: {char(1)}
     */
    public void setCapitemflg_IsNotNull() { regCapitemflg(CK_ISNN, DOBJ); }

    protected void regCapitemflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCapitemflg(), "CAPITEMFLG"); }
    protected abstract ConditionValue xgetCValueCapitemflg();

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
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrinvcheckinfoCB.class);
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
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrinvcheckinfoCB.class);
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
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrinvcheckinfoCB.class);
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
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrinvcheckinfoCB.class);
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
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrinvcheckinfoCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrinvcheckinfoCB&gt;() {
     *     public void query(TTrinvcheckinfoCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrinvcheckinfoCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrinvcheckinfoCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrinvcheckinfoCQ sq);

    protected TTrinvcheckinfoCB xcreateScalarConditionCB() {
        TTrinvcheckinfoCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrinvcheckinfoCB xcreateScalarConditionPartitionByCB() {
        TTrinvcheckinfoCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrinvcheckinfoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRINVCHECKINFO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrinvcheckinfoCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrinvcheckinfoCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrinvcheckinfoCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRINVCHECKINFO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrinvcheckinfoCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrinvcheckinfoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrinvcheckinfoCB cb = new TTrinvcheckinfoCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrinvcheckinfoCQ sq);

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
    protected TTrinvcheckinfoCB newMyCB() {
        return new TTrinvcheckinfoCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrinvcheckinfoCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
