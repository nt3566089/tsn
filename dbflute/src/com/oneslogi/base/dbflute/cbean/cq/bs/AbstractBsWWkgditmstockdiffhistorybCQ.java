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
 * The abstract condition-query of W_WKGDITMSTOCKDIFFHISTORYB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkgditmstockdiffhistorybCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkgditmstockdiffhistorybCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKGDITMSTOCKDIFFHISTORYB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_Equal(java.math.BigDecimal printkey) {
        doSetPrintkey_Equal(printkey);
    }

    protected void doSetPrintkey_Equal(java.math.BigDecimal printkey) {
        regPrintkey(CK_EQ, printkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_NotEqual(java.math.BigDecimal printkey) {
        doSetPrintkey_NotEqual(printkey);
    }

    protected void doSetPrintkey_NotEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_NES, printkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterThan(java.math.BigDecimal printkey) {
        regPrintkey(CK_GT, printkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessThan(java.math.BigDecimal printkey) {
        regPrintkey(CK_LT, printkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_GE, printkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkey The value of printkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessEqual(java.math.BigDecimal printkey) {
        regPrintkey(CK_LE, printkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintkey(), "PRINTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkeyList The collection of printkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_InScope(Collection<java.math.BigDecimal> printkeyList) {
        doSetPrintkey_InScope(printkeyList);
    }

    protected void doSetPrintkey_InScope(Collection<java.math.BigDecimal> printkeyList) {
        regINS(CK_INS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     * @param printkeyList The collection of printkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_NotInScope(Collection<java.math.BigDecimal> printkeyList) {
        doSetPrintkey_NotInScope(printkeyList);
    }

    protected void doSetPrintkey_NotInScope(Collection<java.math.BigDecimal> printkeyList) {
        regINS(CK_NINS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setPrintkey_IsNull() { regPrintkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setPrintkey_IsNotNull() { regPrintkey(CK_ISNN, DOBJ); }

    protected void regPrintkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintkey(), "PRINTKEY"); }
    protected abstract ConditionValue xgetCValuePrintkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)} <br>
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
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(60)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_Equal(String warehousename) {
        doSetWarehousename_Equal(fRES(warehousename));
    }

    protected void doSetWarehousename_Equal(String warehousename) {
        regWarehousename(CK_EQ, warehousename);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_NotEqual(String warehousename) {
        doSetWarehousename_NotEqual(fRES(warehousename));
    }

    protected void doSetWarehousename_NotEqual(String warehousename) {
        regWarehousename(CK_NES, warehousename);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterThan(String warehousename) {
        regWarehousename(CK_GT, fRES(warehousename));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessThan(String warehousename) {
        regWarehousename(CK_LT, fRES(warehousename));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_GreaterEqual(String warehousename) {
        regWarehousename(CK_GE, fRES(warehousename));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_LessEqual(String warehousename) {
        regWarehousename(CK_LE, fRES(warehousename));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousenameList The collection of warehousename as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_InScope(Collection<String> warehousenameList) {
        doSetWarehousename_InScope(warehousenameList);
    }

    protected void doSetWarehousename_InScope(Collection<String> warehousenameList) {
        regINS(CK_INS, cTL(warehousenameList), xgetCValueWarehousename(), "WAREHOUSENAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousenameList The collection of warehousename as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_NotInScope(Collection<String> warehousenameList) {
        doSetWarehousename_NotInScope(warehousenameList);
    }

    protected void doSetWarehousename_NotInScope(Collection<String> warehousenameList) {
        regINS(CK_NINS, cTL(warehousenameList), xgetCValueWarehousename(), "WAREHOUSENAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(100)} <br>
     * <pre>e.g. setWarehousename_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehousename The value of warehousename as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehousename_LikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehousename), xgetCValueWarehousename(), "WAREHOUSENAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousename_NotLikeSearch(String warehousename, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousename), xgetCValueWarehousename(), "WAREHOUSENAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     * @param warehousename The value of warehousename as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousename_PrefixSearch(String warehousename) {
        setWarehousename_LikeSearch(warehousename, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     */
    public void setWarehousename_IsNull() { regWarehousename(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     */
    public void setWarehousename_IsNullOrEmpty() { regWarehousename(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSENAME: {varchar(100)}
     */
    public void setWarehousename_IsNotNull() { regWarehousename(CK_ISNN, DOBJ); }

    protected void regWarehousename(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousename(), "WAREHOUSENAME"); }
    protected abstract ConditionValue xgetCValueWarehousename();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_Equal(String diffadddate) {
        doSetDiffadddate_Equal(fRES(diffadddate));
    }

    protected void doSetDiffadddate_Equal(String diffadddate) {
        regDiffadddate(CK_EQ, diffadddate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_NotEqual(String diffadddate) {
        doSetDiffadddate_NotEqual(fRES(diffadddate));
    }

    protected void doSetDiffadddate_NotEqual(String diffadddate) {
        regDiffadddate(CK_NES, diffadddate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_GreaterThan(String diffadddate) {
        regDiffadddate(CK_GT, fRES(diffadddate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_LessThan(String diffadddate) {
        regDiffadddate(CK_LT, fRES(diffadddate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_GreaterEqual(String diffadddate) {
        regDiffadddate(CK_GE, fRES(diffadddate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_LessEqual(String diffadddate) {
        regDiffadddate(CK_LE, fRES(diffadddate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddateList The collection of diffadddate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_InScope(Collection<String> diffadddateList) {
        doSetDiffadddate_InScope(diffadddateList);
    }

    protected void doSetDiffadddate_InScope(Collection<String> diffadddateList) {
        regINS(CK_INS, cTL(diffadddateList), xgetCValueDiffadddate(), "DIFFADDDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddateList The collection of diffadddate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_NotInScope(Collection<String> diffadddateList) {
        doSetDiffadddate_NotInScope(diffadddateList);
    }

    protected void doSetDiffadddate_NotInScope(Collection<String> diffadddateList) {
        regINS(CK_NINS, cTL(diffadddateList), xgetCValueDiffadddate(), "DIFFADDDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)} <br>
     * <pre>e.g. setDiffadddate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffadddate The value of diffadddate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffadddate_LikeSearch(String diffadddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffadddate), xgetCValueDiffadddate(), "DIFFADDDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffadddate_NotLikeSearch(String diffadddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffadddate), xgetCValueDiffadddate(), "DIFFADDDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     * @param diffadddate The value of diffadddate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffadddate_PrefixSearch(String diffadddate) {
        setDiffadddate_LikeSearch(diffadddate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     */
    public void setDiffadddate_IsNull() { regDiffadddate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFFADDDATE: {PK, NotNull, varchar(8)}
     */
    public void setDiffadddate_IsNotNull() { regDiffadddate(CK_ISNN, DOBJ); }

    protected void regDiffadddate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffadddate(), "DIFFADDDATE"); }
    protected abstract ConditionValue xgetCValueDiffadddate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_Equal(String diffoccarea) {
        doSetDiffoccarea_Equal(fRES(diffoccarea));
    }

    protected void doSetDiffoccarea_Equal(String diffoccarea) {
        regDiffoccarea(CK_EQ, diffoccarea);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_NotEqual(String diffoccarea) {
        doSetDiffoccarea_NotEqual(fRES(diffoccarea));
    }

    protected void doSetDiffoccarea_NotEqual(String diffoccarea) {
        regDiffoccarea(CK_NES, diffoccarea);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_GreaterThan(String diffoccarea) {
        regDiffoccarea(CK_GT, fRES(diffoccarea));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_LessThan(String diffoccarea) {
        regDiffoccarea(CK_LT, fRES(diffoccarea));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_GreaterEqual(String diffoccarea) {
        regDiffoccarea(CK_GE, fRES(diffoccarea));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_LessEqual(String diffoccarea) {
        regDiffoccarea(CK_LE, fRES(diffoccarea));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccareaList The collection of diffoccarea as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_InScope(Collection<String> diffoccareaList) {
        doSetDiffoccarea_InScope(diffoccareaList);
    }

    protected void doSetDiffoccarea_InScope(Collection<String> diffoccareaList) {
        regINS(CK_INS, cTL(diffoccareaList), xgetCValueDiffoccarea(), "DIFFOCCAREA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccareaList The collection of diffoccarea as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_NotInScope(Collection<String> diffoccareaList) {
        doSetDiffoccarea_NotInScope(diffoccareaList);
    }

    protected void doSetDiffoccarea_NotInScope(Collection<String> diffoccareaList) {
        regINS(CK_NINS, cTL(diffoccareaList), xgetCValueDiffoccarea(), "DIFFOCCAREA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)} <br>
     * <pre>e.g. setDiffoccarea_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param diffoccarea The value of diffoccarea as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDiffoccarea_LikeSearch(String diffoccarea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(diffoccarea), xgetCValueDiffoccarea(), "DIFFOCCAREA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDiffoccarea_NotLikeSearch(String diffoccarea, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(diffoccarea), xgetCValueDiffoccarea(), "DIFFOCCAREA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     * @param diffoccarea The value of diffoccarea as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffoccarea_PrefixSearch(String diffoccarea) {
        setDiffoccarea_LikeSearch(diffoccarea, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     */
    public void setDiffoccarea_IsNull() { regDiffoccarea(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFFOCCAREA: {PK, NotNull, char(1)}
     */
    public void setDiffoccarea_IsNotNull() { regDiffoccarea(CK_ISNN, DOBJ); }

    protected void regDiffoccarea(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffoccarea(), "DIFFOCCAREA"); }
    protected abstract ConditionValue xgetCValueDiffoccarea();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
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
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
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
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
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
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
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
     * PRODUCT_CD: {PK, NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {PK, NotNull, varchar(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_Equal(String itemname) {
        doSetItemname_Equal(fRES(itemname));
    }

    protected void doSetItemname_Equal(String itemname) {
        regItemname(CK_EQ, itemname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotEqual(String itemname) {
        doSetItemname_NotEqual(fRES(itemname));
    }

    protected void doSetItemname_NotEqual(String itemname) {
        regItemname(CK_NES, itemname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterThan(String itemname) {
        regItemname(CK_GT, fRES(itemname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessThan(String itemname) {
        regItemname(CK_LT, fRES(itemname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_GreaterEqual(String itemname) {
        regItemname(CK_GE, fRES(itemname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_LessEqual(String itemname) {
        regItemname(CK_LE, fRES(itemname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemnameList The collection of itemname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_InScope(Collection<String> itemnameList) {
        doSetItemname_InScope(itemnameList);
    }

    protected void doSetItemname_InScope(Collection<String> itemnameList) {
        regINS(CK_INS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemnameList The collection of itemname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_NotInScope(Collection<String> itemnameList) {
        doSetItemname_NotInScope(itemnameList);
    }

    protected void doSetItemname_NotInScope(Collection<String> itemnameList) {
        regINS(CK_NINS, cTL(itemnameList), xgetCValueItemname(), "ITEMNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)} <br>
     * <pre>e.g. setItemname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemname The value of itemname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemname_LikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemname_NotLikeSearch(String itemname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemname), xgetCValueItemname(), "ITEMNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMNAME: {varchar(100)}
     * @param itemname The value of itemname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemname_PrefixSearch(String itemname) {
        setItemname_LikeSearch(itemname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNull() { regItemname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNullOrEmpty() { regItemname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMNAME: {varchar(100)}
     */
    public void setItemname_IsNotNull() { regItemname(CK_ISNN, DOBJ); }

    protected void regItemname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemname(), "ITEMNAME"); }
    protected abstract ConditionValue xgetCValueItemname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_Equal(java.math.BigDecimal diffqty) {
        doSetDiffqty_Equal(diffqty);
    }

    protected void doSetDiffqty_Equal(java.math.BigDecimal diffqty) {
        regDiffqty(CK_EQ, diffqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_NotEqual(java.math.BigDecimal diffqty) {
        doSetDiffqty_NotEqual(diffqty);
    }

    protected void doSetDiffqty_NotEqual(java.math.BigDecimal diffqty) {
        regDiffqty(CK_NES, diffqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_GreaterThan(java.math.BigDecimal diffqty) {
        regDiffqty(CK_GT, diffqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_LessThan(java.math.BigDecimal diffqty) {
        regDiffqty(CK_LT, diffqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_GreaterEqual(java.math.BigDecimal diffqty) {
        regDiffqty(CK_GE, diffqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqty The value of diffqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDiffqty_LessEqual(java.math.BigDecimal diffqty) {
        regDiffqty(CK_LE, diffqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param minNumber The min number of diffqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of diffqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDiffqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDiffqty(), "DIFFQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqtyList The collection of diffqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqty_InScope(Collection<java.math.BigDecimal> diffqtyList) {
        doSetDiffqty_InScope(diffqtyList);
    }

    protected void doSetDiffqty_InScope(Collection<java.math.BigDecimal> diffqtyList) {
        regINS(CK_INS, cTL(diffqtyList), xgetCValueDiffqty(), "DIFFQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     * @param diffqtyList The collection of diffqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDiffqty_NotInScope(Collection<java.math.BigDecimal> diffqtyList) {
        doSetDiffqty_NotInScope(diffqtyList);
    }

    protected void doSetDiffqty_NotInScope(Collection<java.math.BigDecimal> diffqtyList) {
        regINS(CK_NINS, cTL(diffqtyList), xgetCValueDiffqty(), "DIFFQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     */
    public void setDiffqty_IsNull() { regDiffqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIFFQTY: {decimal(16, 6)}
     */
    public void setDiffqty_IsNotNull() { regDiffqty(CK_ISNN, DOBJ); }

    protected void regDiffqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDiffqty(), "DIFFQTY"); }
    protected abstract ConditionValue xgetCValueDiffqty();

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
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_Equal(Long itemorderby) {
        doSetItemorderby_Equal(itemorderby);
    }

    protected void doSetItemorderby_Equal(Long itemorderby) {
        regItemorderby(CK_EQ, itemorderby);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_NotEqual(Long itemorderby) {
        doSetItemorderby_NotEqual(itemorderby);
    }

    protected void doSetItemorderby_NotEqual(Long itemorderby) {
        regItemorderby(CK_NES, itemorderby);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_GreaterThan(Long itemorderby) {
        regItemorderby(CK_GT, itemorderby);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_LessThan(Long itemorderby) {
        regItemorderby(CK_LT, itemorderby);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_GreaterEqual(Long itemorderby) {
        regItemorderby(CK_GE, itemorderby);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderby The value of itemorderby as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemorderby_LessEqual(Long itemorderby) {
        regItemorderby(CK_LE, itemorderby);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param minNumber The min number of itemorderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemorderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemorderby_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemorderby(), "ITEMORDERBY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderbyList The collection of itemorderby as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemorderby_InScope(Collection<Long> itemorderbyList) {
        doSetItemorderby_InScope(itemorderbyList);
    }

    protected void doSetItemorderby_InScope(Collection<Long> itemorderbyList) {
        regINS(CK_INS, cTL(itemorderbyList), xgetCValueItemorderby(), "ITEMORDERBY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     * @param itemorderbyList The collection of itemorderby as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemorderby_NotInScope(Collection<Long> itemorderbyList) {
        doSetItemorderby_NotInScope(itemorderbyList);
    }

    protected void doSetItemorderby_NotInScope(Collection<Long> itemorderbyList) {
        regINS(CK_NINS, cTL(itemorderbyList), xgetCValueItemorderby(), "ITEMORDERBY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     */
    public void setItemorderby_IsNull() { regItemorderby(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEMORDERBY: {bigint(19)}
     */
    public void setItemorderby_IsNotNull() { regItemorderby(CK_ISNN, DOBJ); }

    protected void regItemorderby(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemorderby(), "ITEMORDERBY"); }
    protected abstract ConditionValue xgetCValueItemorderby();

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
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkgditmstockdiffhistorybCB.class);
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
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkgditmstockdiffhistorybCB.class);
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
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkgditmstockdiffhistorybCB.class);
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
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkgditmstockdiffhistorybCB.class);
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
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkgditmstockdiffhistorybCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkgditmstockdiffhistorybCB&gt;() {
     *     public void query(WWkgditmstockdiffhistorybCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkgditmstockdiffhistorybCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkgditmstockdiffhistorybCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkgditmstockdiffhistorybCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkgditmstockdiffhistorybCQ sq);

    protected WWkgditmstockdiffhistorybCB xcreateScalarConditionCB() {
        WWkgditmstockdiffhistorybCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkgditmstockdiffhistorybCB xcreateScalarConditionPartitionByCB() {
        WWkgditmstockdiffhistorybCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected WWkgditmstockdiffhistorybCB newMyCB() {
        return new WWkgditmstockdiffhistorybCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkgditmstockdiffhistorybCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
