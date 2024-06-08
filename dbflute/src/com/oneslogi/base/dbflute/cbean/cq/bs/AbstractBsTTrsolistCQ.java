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
 * The abstract condition-query of T_TRSOLIST.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsolistCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsolistCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSOLIST";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_Equal(Long shippingListPrintId) {
        doSetShippingListPrintId_Equal(shippingListPrintId);
    }

    protected void doSetShippingListPrintId_Equal(Long shippingListPrintId) {
        regShippingListPrintId(CK_EQ, shippingListPrintId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_NotEqual(Long shippingListPrintId) {
        doSetShippingListPrintId_NotEqual(shippingListPrintId);
    }

    protected void doSetShippingListPrintId_NotEqual(Long shippingListPrintId) {
        regShippingListPrintId(CK_NES, shippingListPrintId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_GreaterThan(Long shippingListPrintId) {
        regShippingListPrintId(CK_GT, shippingListPrintId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_LessThan(Long shippingListPrintId) {
        regShippingListPrintId(CK_LT, shippingListPrintId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_GreaterEqual(Long shippingListPrintId) {
        regShippingListPrintId(CK_GE, shippingListPrintId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintId The value of shippingListPrintId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingListPrintId_LessEqual(Long shippingListPrintId) {
        regShippingListPrintId(CK_LE, shippingListPrintId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of shippingListPrintId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingListPrintId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingListPrintId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingListPrintId(), "SHIPPING_LIST_PRINT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintIdList The collection of shippingListPrintId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingListPrintId_InScope(Collection<Long> shippingListPrintIdList) {
        doSetShippingListPrintId_InScope(shippingListPrintIdList);
    }

    protected void doSetShippingListPrintId_InScope(Collection<Long> shippingListPrintIdList) {
        regINS(CK_INS, cTL(shippingListPrintIdList), xgetCValueShippingListPrintId(), "SHIPPING_LIST_PRINT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param shippingListPrintIdList The collection of shippingListPrintId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingListPrintId_NotInScope(Collection<Long> shippingListPrintIdList) {
        doSetShippingListPrintId_NotInScope(shippingListPrintIdList);
    }

    protected void doSetShippingListPrintId_NotInScope(Collection<Long> shippingListPrintIdList) {
        regINS(CK_NINS, cTL(shippingListPrintIdList), xgetCValueShippingListPrintId(), "SHIPPING_LIST_PRINT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingListPrintId_IsNull() { regShippingListPrintId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_LIST_PRINT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setShippingListPrintId_IsNotNull() { regShippingListPrintId(CK_ISNN, DOBJ); }

    protected void regShippingListPrintId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingListPrintId(), "SHIPPING_LIST_PRINT_ID"); }
    protected abstract ConditionValue xgetCValueShippingListPrintId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_Equal(Long trsolistkey) {
        doSetTrsolistkey_Equal(trsolistkey);
    }

    protected void doSetTrsolistkey_Equal(Long trsolistkey) {
        regTrsolistkey(CK_EQ, trsolistkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_NotEqual(Long trsolistkey) {
        doSetTrsolistkey_NotEqual(trsolistkey);
    }

    protected void doSetTrsolistkey_NotEqual(Long trsolistkey) {
        regTrsolistkey(CK_NES, trsolistkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_GreaterThan(Long trsolistkey) {
        regTrsolistkey(CK_GT, trsolistkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_LessThan(Long trsolistkey) {
        regTrsolistkey(CK_LT, trsolistkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_GreaterEqual(Long trsolistkey) {
        regTrsolistkey(CK_GE, trsolistkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkey The value of trsolistkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrsolistkey_LessEqual(Long trsolistkey) {
        regTrsolistkey(CK_LE, trsolistkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of trsolistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trsolistkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrsolistkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrsolistkey(), "TRSOLISTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkeyList The collection of trsolistkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsolistkey_InScope(Collection<Long> trsolistkeyList) {
        doSetTrsolistkey_InScope(trsolistkeyList);
    }

    protected void doSetTrsolistkey_InScope(Collection<Long> trsolistkeyList) {
        regINS(CK_INS, cTL(trsolistkeyList), xgetCValueTrsolistkey(), "TRSOLISTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRSOLISTKEY: {NotNull, bigint(19)}
     * @param trsolistkeyList The collection of trsolistkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsolistkey_NotInScope(Collection<Long> trsolistkeyList) {
        doSetTrsolistkey_NotInScope(trsolistkeyList);
    }

    protected void doSetTrsolistkey_NotInScope(Collection<Long> trsolistkeyList) {
        regINS(CK_NINS, cTL(trsolistkeyList), xgetCValueTrsolistkey(), "TRSOLISTKEY");
    }

    protected void regTrsolistkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsolistkey(), "TRSOLISTKEY"); }
    protected abstract ConditionValue xgetCValueTrsolistkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_Equal(String listkbn) {
        doSetListkbn_Equal(fRES(listkbn));
    }

    protected void doSetListkbn_Equal(String listkbn) {
        regListkbn(CK_EQ, listkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_NotEqual(String listkbn) {
        doSetListkbn_NotEqual(fRES(listkbn));
    }

    protected void doSetListkbn_NotEqual(String listkbn) {
        regListkbn(CK_NES, listkbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_GreaterThan(String listkbn) {
        regListkbn(CK_GT, fRES(listkbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_LessThan(String listkbn) {
        regListkbn(CK_LT, fRES(listkbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_GreaterEqual(String listkbn) {
        regListkbn(CK_GE, fRES(listkbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_LessEqual(String listkbn) {
        regListkbn(CK_LE, fRES(listkbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbnList The collection of listkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_InScope(Collection<String> listkbnList) {
        doSetListkbn_InScope(listkbnList);
    }

    protected void doSetListkbn_InScope(Collection<String> listkbnList) {
        regINS(CK_INS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbnList The collection of listkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_NotInScope(Collection<String> listkbnList) {
        doSetListkbn_NotInScope(listkbnList);
    }

    protected void doSetListkbn_NotInScope(Collection<String> listkbnList) {
        regINS(CK_NINS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {varchar(100)} <br>
     * <pre>e.g. setListkbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param listkbn The value of listkbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setListkbn_LikeSearch(String listkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(listkbn), xgetCValueListkbn(), "LISTKBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setListkbn_NotLikeSearch(String listkbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(listkbn), xgetCValueListkbn(), "LISTKBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LISTKBN: {varchar(100)}
     * @param listkbn The value of listkbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_PrefixSearch(String listkbn) {
        setListkbn_LikeSearch(listkbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     */
    public void setListkbn_IsNull() { regListkbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     */
    public void setListkbn_IsNullOrEmpty() { regListkbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LISTKBN: {varchar(100)}
     */
    public void setListkbn_IsNotNull() { regListkbn(CK_ISNN, DOBJ); }

    protected void regListkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueListkbn(), "LISTKBN"); }
    protected abstract ConditionValue xgetCValueListkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterThan(String printedflg) {
        regPrintedflg(CK_GT, fRES(printedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessThan(String printedflg) {
        regPrintedflg(CK_LT, fRES(printedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_GreaterEqual(String printedflg) {
        regPrintedflg(CK_GE, fRES(printedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_LessEqual(String printedflg) {
        regPrintedflg(CK_LE, fRES(printedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)}
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
     * PRINTEDFLG: {char(1)} <br>
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
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrintedflg_NotLikeSearch(String printedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printedflg), xgetCValuePrintedflg(), "PRINTEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTEDFLG: {char(1)}
     * @param printedflg The value of printedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintedflg_PrefixSearch(String printedflg) {
        setPrintedflg_LikeSearch(printedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     */
    public void setPrintedflg_IsNull() { regPrintedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTEDFLG: {char(1)}
     */
    public void setPrintedflg_IsNotNull() { regPrintedflg(CK_ISNN, DOBJ); }

    protected void regPrintedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintedflg(), "PRINTEDFLG"); }
    protected abstract ConditionValue xgetCValuePrintedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_Equal(String trsoliststs) {
        doSetTrsoliststs_Equal(fRES(trsoliststs));
    }

    protected void doSetTrsoliststs_Equal(String trsoliststs) {
        regTrsoliststs(CK_EQ, trsoliststs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_NotEqual(String trsoliststs) {
        doSetTrsoliststs_NotEqual(fRES(trsoliststs));
    }

    protected void doSetTrsoliststs_NotEqual(String trsoliststs) {
        regTrsoliststs(CK_NES, trsoliststs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_GreaterThan(String trsoliststs) {
        regTrsoliststs(CK_GT, fRES(trsoliststs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_LessThan(String trsoliststs) {
        regTrsoliststs(CK_LT, fRES(trsoliststs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_GreaterEqual(String trsoliststs) {
        regTrsoliststs(CK_GE, fRES(trsoliststs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_LessEqual(String trsoliststs) {
        regTrsoliststs(CK_LE, fRES(trsoliststs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststsList The collection of trsoliststs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_InScope(Collection<String> trsoliststsList) {
        doSetTrsoliststs_InScope(trsoliststsList);
    }

    protected void doSetTrsoliststs_InScope(Collection<String> trsoliststsList) {
        regINS(CK_INS, cTL(trsoliststsList), xgetCValueTrsoliststs(), "TRSOLISTSTS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststsList The collection of trsoliststs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_NotInScope(Collection<String> trsoliststsList) {
        doSetTrsoliststs_NotInScope(trsoliststsList);
    }

    protected void doSetTrsoliststs_NotInScope(Collection<String> trsoliststsList) {
        regINS(CK_NINS, cTL(trsoliststsList), xgetCValueTrsoliststs(), "TRSOLISTSTS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOLISTSTS: {varchar(100)} <br>
     * <pre>e.g. setTrsoliststs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param trsoliststs The value of trsoliststs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTrsoliststs_LikeSearch(String trsoliststs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(trsoliststs), xgetCValueTrsoliststs(), "TRSOLISTSTS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTrsoliststs_NotLikeSearch(String trsoliststs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(trsoliststs), xgetCValueTrsoliststs(), "TRSOLISTSTS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     * @param trsoliststs The value of trsoliststs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrsoliststs_PrefixSearch(String trsoliststs) {
        setTrsoliststs_LikeSearch(trsoliststs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     */
    public void setTrsoliststs_IsNull() { regTrsoliststs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     */
    public void setTrsoliststs_IsNullOrEmpty() { regTrsoliststs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRSOLISTSTS: {varchar(100)}
     */
    public void setTrsoliststs_IsNotNull() { regTrsoliststs(CK_ISNN, DOBJ); }

    protected void regTrsoliststs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrsoliststs(), "TRSOLISTSTS"); }
    protected abstract ConditionValue xgetCValueTrsoliststs();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_Equal(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_EQ,  printdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_GreaterThan(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_GT,  printdatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_LessThan(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_LT,  printdatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_GreaterEqual(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_GE,  printdatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * @param printdatetime The value of printdatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintdatetime_LessEqual(java.sql.Timestamp printdatetime) {
        regPrintdatetime(CK_LE, printdatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * <pre>e.g. setPrintdatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPrintdatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePrintdatetime(), "PRINTDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of printdatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPrintdatetime_DateFromTo(Date fromDate, Date toDate) {
        setPrintdatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     */
    public void setPrintdatetime_IsNull() { regPrintdatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTDATETIME: {datetime2(26, 6)}
     */
    public void setPrintdatetime_IsNotNull() { regPrintdatetime(CK_ISNN, DOBJ); }

    protected void regPrintdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintdatetime(), "PRINTDATETIME"); }
    protected abstract ConditionValue xgetCValuePrintdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_Equal(String shipschdate) {
        doSetShipschdate_Equal(fRES(shipschdate));
    }

    protected void doSetShipschdate_Equal(String shipschdate) {
        regShipschdate(CK_EQ, shipschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotEqual(String shipschdate) {
        doSetShipschdate_NotEqual(fRES(shipschdate));
    }

    protected void doSetShipschdate_NotEqual(String shipschdate) {
        regShipschdate(CK_NES, shipschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterThan(String shipschdate) {
        regShipschdate(CK_GT, fRES(shipschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessThan(String shipschdate) {
        regShipschdate(CK_LT, fRES(shipschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_GreaterEqual(String shipschdate) {
        regShipschdate(CK_GE, fRES(shipschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_LessEqual(String shipschdate) {
        regShipschdate(CK_LE, fRES(shipschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdateList The collection of shipschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_InScope(Collection<String> shipschdateList) {
        doSetShipschdate_InScope(shipschdateList);
    }

    protected void doSetShipschdate_InScope(Collection<String> shipschdateList) {
        regINS(CK_INS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdateList The collection of shipschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_NotInScope(Collection<String> shipschdateList) {
        doSetShipschdate_NotInScope(shipschdateList);
    }

    protected void doSetShipschdate_NotInScope(Collection<String> shipschdateList) {
        regINS(CK_NINS, cTL(shipschdateList), xgetCValueShipschdate(), "SHIPSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)} <br>
     * <pre>e.g. setShipschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipschdate The value of shipschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipschdate_LikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipschdate_NotLikeSearch(String shipschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipschdate), xgetCValueShipschdate(), "SHIPSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     * @param shipschdate The value of shipschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipschdate_PrefixSearch(String shipschdate) {
        setShipschdate_LikeSearch(shipschdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNull() { regShipschdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNullOrEmpty() { regShipschdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPSCHDATE: {varchar(8)}
     */
    public void setShipschdate_IsNotNull() { regShipschdate(CK_ISNN, DOBJ); }

    protected void regShipschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipschdate(), "SHIPSCHDATE"); }
    protected abstract ConditionValue xgetCValueShipschdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_Equal(Long workallocateid) {
        doSetWorkallocateid_Equal(workallocateid);
    }

    protected void doSetWorkallocateid_Equal(Long workallocateid) {
        regWorkallocateid(CK_EQ, workallocateid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotEqual(Long workallocateid) {
        doSetWorkallocateid_NotEqual(workallocateid);
    }

    protected void doSetWorkallocateid_NotEqual(Long workallocateid) {
        regWorkallocateid(CK_NES, workallocateid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterThan(Long workallocateid) {
        regWorkallocateid(CK_GT, workallocateid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessThan(Long workallocateid) {
        regWorkallocateid(CK_LT, workallocateid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterEqual(Long workallocateid) {
        regWorkallocateid(CK_GE, workallocateid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateid The value of workallocateid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessEqual(Long workallocateid) {
        regWorkallocateid(CK_LE, workallocateid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param minNumber The min number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkallocateid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkallocateid(), "WORKALLOCATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateidList The collection of workallocateid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_InScope(Collection<Long> workallocateidList) {
        doSetWorkallocateid_InScope(workallocateidList);
    }

    protected void doSetWorkallocateid_InScope(Collection<Long> workallocateidList) {
        regINS(CK_INS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     * @param workallocateidList The collection of workallocateid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        doSetWorkallocateid_NotInScope(workallocateidList);
    }

    protected void doSetWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        regINS(CK_NINS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     */
    public void setWorkallocateid_IsNull() { regWorkallocateid(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {bigint(19)}
     */
    public void setWorkallocateid_IsNotNull() { regWorkallocateid(CK_ISNN, DOBJ); }

    protected void regWorkallocateid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocateid(), "WORKALLOCATEID"); }
    protected abstract ConditionValue xgetCValueWorkallocateid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_Equal(String rmano) {
        doSetRmano_Equal(fRES(rmano));
    }

    protected void doSetRmano_Equal(String rmano) {
        regRmano(CK_EQ, rmano);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotEqual(String rmano) {
        doSetRmano_NotEqual(fRES(rmano));
    }

    protected void doSetRmano_NotEqual(String rmano) {
        regRmano(CK_NES, rmano);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmanoList The collection of rmano as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_InScope(Collection<String> rmanoList) {
        doSetRmano_InScope(rmanoList);
    }

    protected void doSetRmano_InScope(Collection<String> rmanoList) {
        regINS(CK_INS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmanoList The collection of rmano as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_NotInScope(Collection<String> rmanoList) {
        doSetRmano_NotInScope(rmanoList);
    }

    protected void doSetRmano_NotInScope(Collection<String> rmanoList) {
        regINS(CK_NINS, cTL(rmanoList), xgetCValueRmano(), "RMANO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)} <br>
     * <pre>e.g. setRmano_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rmano The value of rmano as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRmano_LikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(60)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNull() { regRmano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNullOrEmpty() { regRmano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(60)}
     */
    public void setRmano_IsNotNull() { regRmano(CK_ISNN, DOBJ); }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RMANO"); }
    protected abstract ConditionValue xgetCValueRmano();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_Equal(String ownersono) {
        doSetOwnersono_Equal(fRES(ownersono));
    }

    protected void doSetOwnersono_Equal(String ownersono) {
        regOwnersono(CK_EQ, ownersono);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotEqual(String ownersono) {
        doSetOwnersono_NotEqual(fRES(ownersono));
    }

    protected void doSetOwnersono_NotEqual(String ownersono) {
        regOwnersono(CK_NES, ownersono);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterThan(String ownersono) {
        regOwnersono(CK_GT, fRES(ownersono));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessThan(String ownersono) {
        regOwnersono(CK_LT, fRES(ownersono));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_GreaterEqual(String ownersono) {
        regOwnersono(CK_GE, fRES(ownersono));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_LessEqual(String ownersono) {
        regOwnersono(CK_LE, fRES(ownersono));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersonoList The collection of ownersono as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_InScope(Collection<String> ownersonoList) {
        doSetOwnersono_InScope(ownersonoList);
    }

    protected void doSetOwnersono_InScope(Collection<String> ownersonoList) {
        regINS(CK_INS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersonoList The collection of ownersono as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_NotInScope(Collection<String> ownersonoList) {
        doSetOwnersono_NotInScope(ownersonoList);
    }

    protected void doSetOwnersono_NotInScope(Collection<String> ownersonoList) {
        regINS(CK_NINS, cTL(ownersonoList), xgetCValueOwnersono(), "OWNERSONO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)} <br>
     * <pre>e.g. setOwnersono_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownersono The value of ownersono as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnersono_LikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnersono_NotLikeSearch(String ownersono, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownersono), xgetCValueOwnersono(), "OWNERSONO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNERSONO: {varchar(60)}
     * @param ownersono The value of ownersono as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnersono_PrefixSearch(String ownersono) {
        setOwnersono_LikeSearch(ownersono, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNull() { regOwnersono(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNullOrEmpty() { regOwnersono(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNERSONO: {varchar(60)}
     */
    public void setOwnersono_IsNotNull() { regOwnersono(CK_ISNN, DOBJ); }

    protected void regOwnersono(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnersono(), "OWNERSONO"); }
    protected abstract ConditionValue xgetCValueOwnersono();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_Equal(String shiptocd) {
        doSetShiptocd_Equal(fRES(shiptocd));
    }

    protected void doSetShiptocd_Equal(String shiptocd) {
        regShiptocd(CK_EQ, shiptocd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotEqual(String shiptocd) {
        doSetShiptocd_NotEqual(fRES(shiptocd));
    }

    protected void doSetShiptocd_NotEqual(String shiptocd) {
        regShiptocd(CK_NES, shiptocd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterThan(String shiptocd) {
        regShiptocd(CK_GT, fRES(shiptocd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessThan(String shiptocd) {
        regShiptocd(CK_LT, fRES(shiptocd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_GreaterEqual(String shiptocd) {
        regShiptocd(CK_GE, fRES(shiptocd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_LessEqual(String shiptocd) {
        regShiptocd(CK_LE, fRES(shiptocd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_InScope(Collection<String> shiptocdList) {
        doSetShiptocd_InScope(shiptocdList);
    }

    protected void doSetShiptocd_InScope(Collection<String> shiptocdList) {
        regINS(CK_INS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocdList The collection of shiptocd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_NotInScope(Collection<String> shiptocdList) {
        doSetShiptocd_NotInScope(shiptocdList);
    }

    protected void doSetShiptocd_NotInScope(Collection<String> shiptocdList) {
        regINS(CK_NINS, cTL(shiptocdList), xgetCValueShiptocd(), "SHIPTOCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)} <br>
     * <pre>e.g. setShiptocd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shiptocd The value of shiptocd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShiptocd_LikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShiptocd_NotLikeSearch(String shiptocd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shiptocd), xgetCValueShiptocd(), "SHIPTOCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     * @param shiptocd The value of shiptocd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiptocd_PrefixSearch(String shiptocd) {
        setShiptocd_LikeSearch(shiptocd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNull() { regShiptocd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNullOrEmpty() { regShiptocd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPTOCD: {varchar(30)}
     */
    public void setShiptocd_IsNotNull() { regShiptocd(CK_ISNN, DOBJ); }

    protected void regShiptocd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiptocd(), "SHIPTOCD"); }
    protected abstract ConditionValue xgetCValueShiptocd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_Equal(String itemcd) {
        doSetItemcd_Equal(fRES(itemcd));
    }

    protected void doSetItemcd_Equal(String itemcd) {
        regItemcd(CK_EQ, itemcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotEqual(String itemcd) {
        doSetItemcd_NotEqual(fRES(itemcd));
    }

    protected void doSetItemcd_NotEqual(String itemcd) {
        regItemcd(CK_NES, itemcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterThan(String itemcd) {
        regItemcd(CK_GT, fRES(itemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessThan(String itemcd) {
        regItemcd(CK_LT, fRES(itemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterEqual(String itemcd) {
        regItemcd(CK_GE, fRES(itemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessEqual(String itemcd) {
        regItemcd(CK_LE, fRES(itemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_InScope(Collection<String> itemcdList) {
        doSetItemcd_InScope(itemcdList);
    }

    protected void doSetItemcd_InScope(Collection<String> itemcdList) {
        regINS(CK_INS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcdList The collection of itemcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_NotInScope(Collection<String> itemcdList) {
        doSetItemcd_NotInScope(itemcdList);
    }

    protected void doSetItemcd_NotInScope(Collection<String> itemcdList) {
        regINS(CK_NINS, cTL(itemcdList), xgetCValueItemcd(), "ITEMCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)} <br>
     * <pre>e.g. setItemcd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcd The value of itemcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcd_LikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcd_NotLikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {varchar(30)}
     * @param itemcd The value of itemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_PrefixSearch(String itemcd) {
        setItemcd_LikeSearch(itemcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNull() { regItemcd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNullOrEmpty() { regItemcd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMCD: {varchar(30)}
     */
    public void setItemcd_IsNotNull() { regItemcd(CK_ISNN, DOBJ); }

    protected void regItemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcd(), "ITEMCD"); }
    protected abstract ConditionValue xgetCValueItemcd();

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
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_Equal(String sopalletno) {
        doSetSopalletno_Equal(fRES(sopalletno));
    }

    protected void doSetSopalletno_Equal(String sopalletno) {
        regSopalletno(CK_EQ, sopalletno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotEqual(String sopalletno) {
        doSetSopalletno_NotEqual(fRES(sopalletno));
    }

    protected void doSetSopalletno_NotEqual(String sopalletno) {
        regSopalletno(CK_NES, sopalletno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterThan(String sopalletno) {
        regSopalletno(CK_GT, fRES(sopalletno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessThan(String sopalletno) {
        regSopalletno(CK_LT, fRES(sopalletno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_GreaterEqual(String sopalletno) {
        regSopalletno(CK_GE, fRES(sopalletno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_LessEqual(String sopalletno) {
        regSopalletno(CK_LE, fRES(sopalletno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletnoList The collection of sopalletno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_InScope(Collection<String> sopalletnoList) {
        doSetSopalletno_InScope(sopalletnoList);
    }

    protected void doSetSopalletno_InScope(Collection<String> sopalletnoList) {
        regINS(CK_INS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletnoList The collection of sopalletno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_NotInScope(Collection<String> sopalletnoList) {
        doSetSopalletno_NotInScope(sopalletnoList);
    }

    protected void doSetSopalletno_NotInScope(Collection<String> sopalletnoList) {
        regINS(CK_NINS, cTL(sopalletnoList), xgetCValueSopalletno(), "SOPALLETNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {varchar(30)} <br>
     * <pre>e.g. setSopalletno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sopalletno The value of sopalletno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSopalletno_LikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSopalletno_NotLikeSearch(String sopalletno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sopalletno), xgetCValueSopalletno(), "SOPALLETNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     * @param sopalletno The value of sopalletno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSopalletno_PrefixSearch(String sopalletno) {
        setSopalletno_LikeSearch(sopalletno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     */
    public void setSopalletno_IsNull() { regSopalletno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     */
    public void setSopalletno_IsNullOrEmpty() { regSopalletno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOPALLETNO: {varchar(30)}
     */
    public void setSopalletno_IsNotNull() { regSopalletno(CK_ISNN, DOBJ); }

    protected void regSopalletno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSopalletno(), "SOPALLETNO"); }
    protected abstract ConditionValue xgetCValueSopalletno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_Equal(String floor) {
        doSetFloor_Equal(fRES(floor));
    }

    protected void doSetFloor_Equal(String floor) {
        regFloor(CK_EQ, floor);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotEqual(String floor) {
        doSetFloor_NotEqual(fRES(floor));
    }

    protected void doSetFloor_NotEqual(String floor) {
        regFloor(CK_NES, floor);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floorList The collection of floor as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_InScope(Collection<String> floorList) {
        doSetFloor_InScope(floorList);
    }

    protected void doSetFloor_InScope(Collection<String> floorList) {
        regINS(CK_INS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floorList The collection of floor as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_NotInScope(Collection<String> floorList) {
        doSetFloor_NotInScope(floorList);
    }

    protected void doSetFloor_NotInScope(Collection<String> floorList) {
        regINS(CK_NINS, cTL(floorList), xgetCValueFloor(), "FLOOR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(30)} <br>
     * <pre>e.g. setFloor_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floor The value of floor as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloor_LikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {varchar(30)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     */
    public void setFloor_IsNull() { regFloor(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     */
    public void setFloor_IsNullOrEmpty() { regFloor(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR: {varchar(30)}
     */
    public void setFloor_IsNotNull() { regFloor(CK_ISNN, DOBJ); }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_Equal(Long pickingInstId) {
        doSetPickingInstId_Equal(pickingInstId);
    }

    protected void doSetPickingInstId_Equal(Long pickingInstId) {
        regPickingInstId(CK_EQ, pickingInstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_NotEqual(Long pickingInstId) {
        doSetPickingInstId_NotEqual(pickingInstId);
    }

    protected void doSetPickingInstId_NotEqual(Long pickingInstId) {
        regPickingInstId(CK_NES, pickingInstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterThan(Long pickingInstId) {
        regPickingInstId(CK_GT, pickingInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessThan(Long pickingInstId) {
        regPickingInstId(CK_LT, pickingInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterEqual(Long pickingInstId) {
        regPickingInstId(CK_GE, pickingInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstId The value of pickingInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessEqual(Long pickingInstId) {
        regPickingInstId(CK_LE, pickingInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param minNumber The min number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstId(), "PICKING_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_InScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_InScope(Collection<Long> pickingInstIdList) {
        regINS(CK_INS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     * @param pickingInstIdList The collection of pickingInstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        doSetPickingInstId_NotInScope(pickingInstIdList);
    }

    protected void doSetPickingInstId_NotInScope(Collection<Long> pickingInstIdList) {
        regINS(CK_NINS, cTL(pickingInstIdList), xgetCValuePickingInstId(), "PICKING_INST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     */
    public void setPickingInstId_IsNull() { regPickingInstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {bigint(19)}
     */
    public void setPickingInstId_IsNotNull() { regPickingInstId(CK_ISNN, DOBJ); }

    protected void regPickingInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstId(), "PICKING_INST_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
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
     * CENTER_ID: {IX, NotNull, bigint(19)}
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
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, bigint(19)}
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
     * CENTER_ID: {IX, NotNull, bigint(19)}
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
    public HpSLCFunction<TTrsolistCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsolistCB.class);
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
    public HpSLCFunction<TTrsolistCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsolistCB.class);
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
    public HpSLCFunction<TTrsolistCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsolistCB.class);
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
    public HpSLCFunction<TTrsolistCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsolistCB.class);
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
    public HpSLCFunction<TTrsolistCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsolistCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsolistCB&gt;() {
     *     public void query(TTrsolistCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsolistCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsolistCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsolistCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsolistCQ sq);

    protected TTrsolistCB xcreateScalarConditionCB() {
        TTrsolistCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsolistCB xcreateScalarConditionPartitionByCB() {
        TTrsolistCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsolistCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsolistCB cb = new TTrsolistCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_LIST_PRINT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsolistCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsolistCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsolistCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsolistCB cb = new TTrsolistCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_LIST_PRINT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsolistCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsolistCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsolistCB cb = new TTrsolistCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsolistCQ sq);

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
    protected TTrsolistCB newMyCB() {
        return new TTrsolistCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsolistCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
