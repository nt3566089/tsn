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
 * The abstract condition-query of T_TRASSORTORDER.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrassortorderCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrassortorderCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRASSORTORDER";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_Equal(Long directionorderkey) {
        doSetDirectionorderkey_Equal(directionorderkey);
    }

    protected void doSetDirectionorderkey_Equal(Long directionorderkey) {
        regDirectionorderkey(CK_EQ, directionorderkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_NotEqual(Long directionorderkey) {
        doSetDirectionorderkey_NotEqual(directionorderkey);
    }

    protected void doSetDirectionorderkey_NotEqual(Long directionorderkey) {
        regDirectionorderkey(CK_NES, directionorderkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_GreaterThan(Long directionorderkey) {
        regDirectionorderkey(CK_GT, directionorderkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_LessThan(Long directionorderkey) {
        regDirectionorderkey(CK_LT, directionorderkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_GreaterEqual(Long directionorderkey) {
        regDirectionorderkey(CK_GE, directionorderkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkey The value of directionorderkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionorderkey_LessEqual(Long directionorderkey) {
        regDirectionorderkey(CK_LE, directionorderkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of directionorderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionorderkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionorderkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionorderkey(), "DIRECTIONORDERKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkeyList The collection of directionorderkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionorderkey_InScope(Collection<Long> directionorderkeyList) {
        doSetDirectionorderkey_InScope(directionorderkeyList);
    }

    protected void doSetDirectionorderkey_InScope(Collection<Long> directionorderkeyList) {
        regINS(CK_INS, cTL(directionorderkeyList), xgetCValueDirectionorderkey(), "DIRECTIONORDERKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     * @param directionorderkeyList The collection of directionorderkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionorderkey_NotInScope(Collection<Long> directionorderkeyList) {
        doSetDirectionorderkey_NotInScope(directionorderkeyList);
    }

    protected void doSetDirectionorderkey_NotInScope(Collection<Long> directionorderkeyList) {
        regINS(CK_NINS, cTL(directionorderkeyList), xgetCValueDirectionorderkey(), "DIRECTIONORDERKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDirectionorderkey_IsNull() { regDirectionorderkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONORDERKEY: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDirectionorderkey_IsNotNull() { regDirectionorderkey(CK_ISNN, DOBJ); }

    protected void regDirectionorderkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionorderkey(), "DIRECTIONORDERKEY"); }
    protected abstract ConditionValue xgetCValueDirectionorderkey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_Equal(Long directionordergno) {
        doSetDirectionordergno_Equal(directionordergno);
    }

    protected void doSetDirectionordergno_Equal(Long directionordergno) {
        regDirectionordergno(CK_EQ, directionordergno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_NotEqual(Long directionordergno) {
        doSetDirectionordergno_NotEqual(directionordergno);
    }

    protected void doSetDirectionordergno_NotEqual(Long directionordergno) {
        regDirectionordergno(CK_NES, directionordergno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_GreaterThan(Long directionordergno) {
        regDirectionordergno(CK_GT, directionordergno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_LessThan(Long directionordergno) {
        regDirectionordergno(CK_LT, directionordergno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_GreaterEqual(Long directionordergno) {
        regDirectionordergno(CK_GE, directionordergno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergno The value of directionordergno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionordergno_LessEqual(Long directionordergno) {
        regDirectionordergno(CK_LE, directionordergno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of directionordergno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionordergno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionordergno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionordergno(), "DIRECTIONORDERGNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergnoList The collection of directionordergno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionordergno_InScope(Collection<Long> directionordergnoList) {
        doSetDirectionordergno_InScope(directionordergnoList);
    }

    protected void doSetDirectionordergno_InScope(Collection<Long> directionordergnoList) {
        regINS(CK_INS, cTL(directionordergnoList), xgetCValueDirectionordergno(), "DIRECTIONORDERGNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     * @param directionordergnoList The collection of directionordergno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionordergno_NotInScope(Collection<Long> directionordergnoList) {
        doSetDirectionordergno_NotInScope(directionordergnoList);
    }

    protected void doSetDirectionordergno_NotInScope(Collection<Long> directionordergnoList) {
        regINS(CK_NINS, cTL(directionordergnoList), xgetCValueDirectionordergno(), "DIRECTIONORDERGNO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     */
    public void setDirectionordergno_IsNull() { regDirectionordergno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONORDERGNO: {PK, NotNull, bigint(19)}
     */
    public void setDirectionordergno_IsNotNull() { regDirectionordergno(CK_ISNN, DOBJ); }

    protected void regDirectionordergno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionordergno(), "DIRECTIONORDERGNO"); }
    protected abstract ConditionValue xgetCValueDirectionordergno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_Equal(java.math.BigDecimal actflg) {
        doSetActflg_Equal(actflg);
    }

    protected void doSetActflg_Equal(java.math.BigDecimal actflg) {
        regActflg(CK_EQ, actflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_NotEqual(java.math.BigDecimal actflg) {
        doSetActflg_NotEqual(actflg);
    }

    protected void doSetActflg_NotEqual(java.math.BigDecimal actflg) {
        regActflg(CK_NES, actflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterThan(java.math.BigDecimal actflg) {
        regActflg(CK_GT, actflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessThan(java.math.BigDecimal actflg) {
        regActflg(CK_LT, actflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_GreaterEqual(java.math.BigDecimal actflg) {
        regActflg(CK_GE, actflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflg The value of actflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setActflg_LessEqual(java.math.BigDecimal actflg) {
        regActflg(CK_LE, actflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param minNumber The min number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of actflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setActflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueActflg(), "ACTFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_InScope(actflgList);
    }

    protected void doSetActflg_InScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_INS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ACTFLG: {NotNull, decimal(16, 6), default=[(1)]}
     * @param actflgList The collection of actflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        doSetActflg_NotInScope(actflgList);
    }

    protected void doSetActflg_NotInScope(Collection<java.math.BigDecimal> actflgList) {
        regINS(CK_NINS, cTL(actflgList), xgetCValueActflg(), "ACTFLG");
    }

    protected void regActflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueActflg(), "ACTFLG"); }
    protected abstract ConditionValue xgetCValueActflg();

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
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_Equal(String rcvdate) {
        doSetRcvdate_Equal(fRES(rcvdate));
    }

    protected void doSetRcvdate_Equal(String rcvdate) {
        regRcvdate(CK_EQ, rcvdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotEqual(String rcvdate) {
        doSetRcvdate_NotEqual(fRES(rcvdate));
    }

    protected void doSetRcvdate_NotEqual(String rcvdate) {
        regRcvdate(CK_NES, rcvdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterThan(String rcvdate) {
        regRcvdate(CK_GT, fRES(rcvdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessThan(String rcvdate) {
        regRcvdate(CK_LT, fRES(rcvdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_GreaterEqual(String rcvdate) {
        regRcvdate(CK_GE, fRES(rcvdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_LessEqual(String rcvdate) {
        regRcvdate(CK_LE, fRES(rcvdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdateList The collection of rcvdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_InScope(Collection<String> rcvdateList) {
        doSetRcvdate_InScope(rcvdateList);
    }

    protected void doSetRcvdate_InScope(Collection<String> rcvdateList) {
        regINS(CK_INS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdateList The collection of rcvdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_NotInScope(Collection<String> rcvdateList) {
        doSetRcvdate_NotInScope(rcvdateList);
    }

    protected void doSetRcvdate_NotInScope(Collection<String> rcvdateList) {
        regINS(CK_NINS, cTL(rcvdateList), xgetCValueRcvdate(), "RCVDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX+, varchar(8)} <br>
     * <pre>e.g. setRcvdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvdate The value of rcvdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvdate_LikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvdate_NotLikeSearch(String rcvdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvdate), xgetCValueRcvdate(), "RCVDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     * @param rcvdate The value of rcvdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdate_PrefixSearch(String rcvdate) {
        setRcvdate_LikeSearch(rcvdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     */
    public void setRcvdate_IsNull() { regRcvdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     */
    public void setRcvdate_IsNullOrEmpty() { regRcvdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVDATE: {IX+, varchar(8)}
     */
    public void setRcvdate_IsNotNull() { regRcvdate(CK_ISNN, DOBJ); }

    protected void regRcvdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvdate(), "RCVDATE"); }
    protected abstract ConditionValue xgetCValueRcvdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_Equal(Long shiporder) {
        doSetShiporder_Equal(shiporder);
    }

    protected void doSetShiporder_Equal(Long shiporder) {
        regShiporder(CK_EQ, shiporder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_NotEqual(Long shiporder) {
        doSetShiporder_NotEqual(shiporder);
    }

    protected void doSetShiporder_NotEqual(Long shiporder) {
        regShiporder(CK_NES, shiporder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_GreaterThan(Long shiporder) {
        regShiporder(CK_GT, shiporder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_LessThan(Long shiporder) {
        regShiporder(CK_LT, shiporder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_GreaterEqual(Long shiporder) {
        regShiporder(CK_GE, shiporder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporder The value of shiporder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShiporder_LessEqual(Long shiporder) {
        regShiporder(CK_LE, shiporder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param minNumber The min number of shiporder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shiporder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShiporder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShiporder(), "SHIPORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporderList The collection of shiporder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiporder_InScope(Collection<Long> shiporderList) {
        doSetShiporder_InScope(shiporderList);
    }

    protected void doSetShiporder_InScope(Collection<Long> shiporderList) {
        regINS(CK_INS, cTL(shiporderList), xgetCValueShiporder(), "SHIPORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPORDER: {NotNull, bigint(19)}
     * @param shiporderList The collection of shiporder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShiporder_NotInScope(Collection<Long> shiporderList) {
        doSetShiporder_NotInScope(shiporderList);
    }

    protected void doSetShiporder_NotInScope(Collection<Long> shiporderList) {
        regINS(CK_NINS, cTL(shiporderList), xgetCValueShiporder(), "SHIPORDER");
    }

    protected void regShiporder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShiporder(), "SHIPORDER"); }
    protected abstract ConditionValue xgetCValueShiporder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_Equal(java.math.BigDecimal rangestart) {
        doSetRangestart_Equal(rangestart);
    }

    protected void doSetRangestart_Equal(java.math.BigDecimal rangestart) {
        regRangestart(CK_EQ, rangestart);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_NotEqual(java.math.BigDecimal rangestart) {
        doSetRangestart_NotEqual(rangestart);
    }

    protected void doSetRangestart_NotEqual(java.math.BigDecimal rangestart) {
        regRangestart(CK_NES, rangestart);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_GreaterThan(java.math.BigDecimal rangestart) {
        regRangestart(CK_GT, rangestart);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_LessThan(java.math.BigDecimal rangestart) {
        regRangestart(CK_LT, rangestart);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_GreaterEqual(java.math.BigDecimal rangestart) {
        regRangestart(CK_GE, rangestart);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestart The value of rangestart as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangestart_LessEqual(java.math.BigDecimal rangestart) {
        regRangestart(CK_LE, rangestart);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rangestart. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rangestart. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRangestart_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRangestart(), "RANGESTART", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestartList The collection of rangestart as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRangestart_InScope(Collection<java.math.BigDecimal> rangestartList) {
        doSetRangestart_InScope(rangestartList);
    }

    protected void doSetRangestart_InScope(Collection<java.math.BigDecimal> rangestartList) {
        regINS(CK_INS, cTL(rangestartList), xgetCValueRangestart(), "RANGESTART");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RANGESTART: {NotNull, decimal(16, 6)}
     * @param rangestartList The collection of rangestart as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRangestart_NotInScope(Collection<java.math.BigDecimal> rangestartList) {
        doSetRangestart_NotInScope(rangestartList);
    }

    protected void doSetRangestart_NotInScope(Collection<java.math.BigDecimal> rangestartList) {
        regINS(CK_NINS, cTL(rangestartList), xgetCValueRangestart(), "RANGESTART");
    }

    protected void regRangestart(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRangestart(), "RANGESTART"); }
    protected abstract ConditionValue xgetCValueRangestart();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_Equal(java.math.BigDecimal rangeend) {
        doSetRangeend_Equal(rangeend);
    }

    protected void doSetRangeend_Equal(java.math.BigDecimal rangeend) {
        regRangeend(CK_EQ, rangeend);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_NotEqual(java.math.BigDecimal rangeend) {
        doSetRangeend_NotEqual(rangeend);
    }

    protected void doSetRangeend_NotEqual(java.math.BigDecimal rangeend) {
        regRangeend(CK_NES, rangeend);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_GreaterThan(java.math.BigDecimal rangeend) {
        regRangeend(CK_GT, rangeend);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_LessThan(java.math.BigDecimal rangeend) {
        regRangeend(CK_LT, rangeend);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_GreaterEqual(java.math.BigDecimal rangeend) {
        regRangeend(CK_GE, rangeend);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeend The value of rangeend as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRangeend_LessEqual(java.math.BigDecimal rangeend) {
        regRangeend(CK_LE, rangeend);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rangeend. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rangeend. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRangeend_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRangeend(), "RANGEEND", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeendList The collection of rangeend as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRangeend_InScope(Collection<java.math.BigDecimal> rangeendList) {
        doSetRangeend_InScope(rangeendList);
    }

    protected void doSetRangeend_InScope(Collection<java.math.BigDecimal> rangeendList) {
        regINS(CK_INS, cTL(rangeendList), xgetCValueRangeend(), "RANGEEND");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RANGEEND: {NotNull, decimal(16, 6)}
     * @param rangeendList The collection of rangeend as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRangeend_NotInScope(Collection<java.math.BigDecimal> rangeendList) {
        doSetRangeend_NotInScope(rangeendList);
    }

    protected void doSetRangeend_NotInScope(Collection<java.math.BigDecimal> rangeendList) {
        regINS(CK_NINS, cTL(rangeendList), xgetCValueRangeend(), "RANGEEND");
    }

    protected void regRangeend(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRangeend(), "RANGEEND"); }
    protected abstract ConditionValue xgetCValueRangeend();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_Equal(String dpwarehousecd) {
        doSetDpwarehousecd_Equal(fRES(dpwarehousecd));
    }

    protected void doSetDpwarehousecd_Equal(String dpwarehousecd) {
        regDpwarehousecd(CK_EQ, dpwarehousecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_NotEqual(String dpwarehousecd) {
        doSetDpwarehousecd_NotEqual(fRES(dpwarehousecd));
    }

    protected void doSetDpwarehousecd_NotEqual(String dpwarehousecd) {
        regDpwarehousecd(CK_NES, dpwarehousecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_GreaterThan(String dpwarehousecd) {
        regDpwarehousecd(CK_GT, fRES(dpwarehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_LessThan(String dpwarehousecd) {
        regDpwarehousecd(CK_LT, fRES(dpwarehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_GreaterEqual(String dpwarehousecd) {
        regDpwarehousecd(CK_GE, fRES(dpwarehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_LessEqual(String dpwarehousecd) {
        regDpwarehousecd(CK_LE, fRES(dpwarehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecdList The collection of dpwarehousecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_InScope(Collection<String> dpwarehousecdList) {
        doSetDpwarehousecd_InScope(dpwarehousecdList);
    }

    protected void doSetDpwarehousecd_InScope(Collection<String> dpwarehousecdList) {
        regINS(CK_INS, cTL(dpwarehousecdList), xgetCValueDpwarehousecd(), "DPWAREHOUSECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecdList The collection of dpwarehousecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_NotInScope(Collection<String> dpwarehousecdList) {
        doSetDpwarehousecd_NotInScope(dpwarehousecdList);
    }

    protected void doSetDpwarehousecd_NotInScope(Collection<String> dpwarehousecdList) {
        regINS(CK_NINS, cTL(dpwarehousecdList), xgetCValueDpwarehousecd(), "DPWAREHOUSECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDpwarehousecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dpwarehousecd The value of dpwarehousecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDpwarehousecd_LikeSearch(String dpwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dpwarehousecd), xgetCValueDpwarehousecd(), "DPWAREHOUSECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDpwarehousecd_NotLikeSearch(String dpwarehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dpwarehousecd), xgetCValueDpwarehousecd(), "DPWAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DPWAREHOUSECD: {NotNull, varchar(30)}
     * @param dpwarehousecd The value of dpwarehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDpwarehousecd_PrefixSearch(String dpwarehousecd) {
        setDpwarehousecd_LikeSearch(dpwarehousecd, xcLSOPPre());
    }

    protected void regDpwarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDpwarehousecd(), "DPWAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueDpwarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_Equal(String deliverydate) {
        doSetDeliverydate_Equal(fRES(deliverydate));
    }

    protected void doSetDeliverydate_Equal(String deliverydate) {
        regDeliverydate(CK_EQ, deliverydate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_NotEqual(String deliverydate) {
        doSetDeliverydate_NotEqual(fRES(deliverydate));
    }

    protected void doSetDeliverydate_NotEqual(String deliverydate) {
        regDeliverydate(CK_NES, deliverydate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_GreaterThan(String deliverydate) {
        regDeliverydate(CK_GT, fRES(deliverydate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_LessThan(String deliverydate) {
        regDeliverydate(CK_LT, fRES(deliverydate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_GreaterEqual(String deliverydate) {
        regDeliverydate(CK_GE, fRES(deliverydate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_LessEqual(String deliverydate) {
        regDeliverydate(CK_LE, fRES(deliverydate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydateList The collection of deliverydate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_InScope(Collection<String> deliverydateList) {
        doSetDeliverydate_InScope(deliverydateList);
    }

    protected void doSetDeliverydate_InScope(Collection<String> deliverydateList) {
        regINS(CK_INS, cTL(deliverydateList), xgetCValueDeliverydate(), "DELIVERYDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydateList The collection of deliverydate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_NotInScope(Collection<String> deliverydateList) {
        doSetDeliverydate_NotInScope(deliverydateList);
    }

    protected void doSetDeliverydate_NotInScope(Collection<String> deliverydateList) {
        regINS(CK_NINS, cTL(deliverydateList), xgetCValueDeliverydate(), "DELIVERYDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setDeliverydate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverydate The value of deliverydate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverydate_LikeSearch(String deliverydate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverydate), xgetCValueDeliverydate(), "DELIVERYDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverydate_NotLikeSearch(String deliverydate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverydate), xgetCValueDeliverydate(), "DELIVERYDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERYDATE: {NotNull, varchar(8)}
     * @param deliverydate The value of deliverydate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverydate_PrefixSearch(String deliverydate) {
        setDeliverydate_LikeSearch(deliverydate, xcLSOPPre());
    }

    protected void regDeliverydate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverydate(), "DELIVERYDATE"); }
    protected abstract ConditionValue xgetCValueDeliverydate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
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
     * ITEMCD: {NotNull, varchar(30)}
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
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterThan(String itemcd) {
        regItemcd(CK_GT, fRES(itemcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessThan(String itemcd) {
        regItemcd(CK_LT, fRES(itemcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_GreaterEqual(String itemcd) {
        regItemcd(CK_GE, fRES(itemcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_LessEqual(String itemcd) {
        regItemcd(CK_LE, fRES(itemcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
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
     * ITEMCD: {NotNull, varchar(30)}
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
     * ITEMCD: {NotNull, varchar(30)} <br>
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
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcd_NotLikeSearch(String itemcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcd), xgetCValueItemcd(), "ITEMCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD: {NotNull, varchar(30)}
     * @param itemcd The value of itemcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcd_PrefixSearch(String itemcd) {
        setItemcd_LikeSearch(itemcd, xcLSOPPre());
    }

    protected void regItemcd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcd(), "ITEMCD"); }
    protected abstract ConditionValue xgetCValueItemcd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_Equal(String linecd) {
        doSetLinecd_Equal(fRES(linecd));
    }

    protected void doSetLinecd_Equal(String linecd) {
        regLinecd(CK_EQ, linecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_NotEqual(String linecd) {
        doSetLinecd_NotEqual(fRES(linecd));
    }

    protected void doSetLinecd_NotEqual(String linecd) {
        regLinecd(CK_NES, linecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_GreaterThan(String linecd) {
        regLinecd(CK_GT, fRES(linecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_LessThan(String linecd) {
        regLinecd(CK_LT, fRES(linecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_GreaterEqual(String linecd) {
        regLinecd(CK_GE, fRES(linecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_LessEqual(String linecd) {
        regLinecd(CK_LE, fRES(linecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecdList The collection of linecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_InScope(Collection<String> linecdList) {
        doSetLinecd_InScope(linecdList);
    }

    protected void doSetLinecd_InScope(Collection<String> linecdList) {
        regINS(CK_INS, cTL(linecdList), xgetCValueLinecd(), "LINECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecdList The collection of linecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_NotInScope(Collection<String> linecdList) {
        doSetLinecd_NotInScope(linecdList);
    }

    protected void doSetLinecd_NotInScope(Collection<String> linecdList) {
        regINS(CK_NINS, cTL(linecdList), xgetCValueLinecd(), "LINECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINECD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLinecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param linecd The value of linecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLinecd_LikeSearch(String linecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(linecd), xgetCValueLinecd(), "LINECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLinecd_NotLikeSearch(String linecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(linecd), xgetCValueLinecd(), "LINECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINECD: {NotNull, varchar(30)}
     * @param linecd The value of linecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLinecd_PrefixSearch(String linecd) {
        setLinecd_LikeSearch(linecd, xcLSOPPre());
    }

    protected void regLinecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLinecd(), "LINECD"); }
    protected abstract ConditionValue xgetCValueLinecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_Equal(String sotedunit) {
        doSetSotedunit_Equal(fRES(sotedunit));
    }

    protected void doSetSotedunit_Equal(String sotedunit) {
        regSotedunit(CK_EQ, sotedunit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotEqual(String sotedunit) {
        doSetSotedunit_NotEqual(fRES(sotedunit));
    }

    protected void doSetSotedunit_NotEqual(String sotedunit) {
        regSotedunit(CK_NES, sotedunit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterThan(String sotedunit) {
        regSotedunit(CK_GT, fRES(sotedunit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessThan(String sotedunit) {
        regSotedunit(CK_LT, fRES(sotedunit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_GreaterEqual(String sotedunit) {
        regSotedunit(CK_GE, fRES(sotedunit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_LessEqual(String sotedunit) {
        regSotedunit(CK_LE, fRES(sotedunit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunitList The collection of sotedunit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_InScope(Collection<String> sotedunitList) {
        doSetSotedunit_InScope(sotedunitList);
    }

    protected void doSetSotedunit_InScope(Collection<String> sotedunitList) {
        regINS(CK_INS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunitList The collection of sotedunit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_NotInScope(Collection<String> sotedunitList) {
        doSetSotedunit_NotInScope(sotedunitList);
    }

    protected void doSetSotedunit_NotInScope(Collection<String> sotedunitList) {
        regINS(CK_NINS, cTL(sotedunitList), xgetCValueSotedunit(), "SOTEDUNIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {varchar(30)} <br>
     * <pre>e.g. setSotedunit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedunit The value of sotedunit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedunit_LikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedunit_NotLikeSearch(String sotedunit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedunit), xgetCValueSotedunit(), "SOTEDUNIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     * @param sotedunit The value of sotedunit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedunit_PrefixSearch(String sotedunit) {
        setSotedunit_LikeSearch(sotedunit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     */
    public void setSotedunit_IsNull() { regSotedunit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     */
    public void setSotedunit_IsNullOrEmpty() { regSotedunit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTEDUNIT: {varchar(30)}
     */
    public void setSotedunit_IsNotNull() { regSotedunit(CK_ISNN, DOBJ); }

    protected void regSotedunit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedunit(), "SOTEDUNIT"); }
    protected abstract ConditionValue xgetCValueSotedunit();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_Equal(Long assortedorder) {
        doSetAssortedorder_Equal(assortedorder);
    }

    protected void doSetAssortedorder_Equal(Long assortedorder) {
        regAssortedorder(CK_EQ, assortedorder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_NotEqual(Long assortedorder) {
        doSetAssortedorder_NotEqual(assortedorder);
    }

    protected void doSetAssortedorder_NotEqual(Long assortedorder) {
        regAssortedorder(CK_NES, assortedorder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_GreaterThan(Long assortedorder) {
        regAssortedorder(CK_GT, assortedorder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_LessThan(Long assortedorder) {
        regAssortedorder(CK_LT, assortedorder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_GreaterEqual(Long assortedorder) {
        regAssortedorder(CK_GE, assortedorder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorder The value of assortedorder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAssortedorder_LessEqual(Long assortedorder) {
        regAssortedorder(CK_LE, assortedorder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param minNumber The min number of assortedorder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of assortedorder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAssortedorder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAssortedorder(), "ASSORTEDORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorderList The collection of assortedorder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedorder_InScope(Collection<Long> assortedorderList) {
        doSetAssortedorder_InScope(assortedorderList);
    }

    protected void doSetAssortedorder_InScope(Collection<Long> assortedorderList) {
        regINS(CK_INS, cTL(assortedorderList), xgetCValueAssortedorder(), "ASSORTEDORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ASSORTEDORDER: {NotNull, bigint(19)}
     * @param assortedorderList The collection of assortedorder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAssortedorder_NotInScope(Collection<Long> assortedorderList) {
        doSetAssortedorder_NotInScope(assortedorderList);
    }

    protected void doSetAssortedorder_NotInScope(Collection<Long> assortedorderList) {
        regINS(CK_NINS, cTL(assortedorderList), xgetCValueAssortedorder(), "ASSORTEDORDER");
    }

    protected void regAssortedorder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAssortedorder(), "ASSORTEDORDER"); }
    protected abstract ConditionValue xgetCValueAssortedorder();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_Equal(Long deliveryseqno) {
        doSetDeliveryseqno_Equal(deliveryseqno);
    }

    protected void doSetDeliveryseqno_Equal(Long deliveryseqno) {
        regDeliveryseqno(CK_EQ, deliveryseqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_NotEqual(Long deliveryseqno) {
        doSetDeliveryseqno_NotEqual(deliveryseqno);
    }

    protected void doSetDeliveryseqno_NotEqual(Long deliveryseqno) {
        regDeliveryseqno(CK_NES, deliveryseqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_GreaterThan(Long deliveryseqno) {
        regDeliveryseqno(CK_GT, deliveryseqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_LessThan(Long deliveryseqno) {
        regDeliveryseqno(CK_LT, deliveryseqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_GreaterEqual(Long deliveryseqno) {
        regDeliveryseqno(CK_GE, deliveryseqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqno The value of deliveryseqno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryseqno_LessEqual(Long deliveryseqno) {
        regDeliveryseqno(CK_LE, deliveryseqno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param minNumber The min number of deliveryseqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryseqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryseqno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryseqno(), "DELIVERYSEQNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqnoList The collection of deliveryseqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryseqno_InScope(Collection<Long> deliveryseqnoList) {
        doSetDeliveryseqno_InScope(deliveryseqnoList);
    }

    protected void doSetDeliveryseqno_InScope(Collection<Long> deliveryseqnoList) {
        regINS(CK_INS, cTL(deliveryseqnoList), xgetCValueDeliveryseqno(), "DELIVERYSEQNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYSEQNO: {NotNull, bigint(19)}
     * @param deliveryseqnoList The collection of deliveryseqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryseqno_NotInScope(Collection<Long> deliveryseqnoList) {
        doSetDeliveryseqno_NotInScope(deliveryseqnoList);
    }

    protected void doSetDeliveryseqno_NotInScope(Collection<Long> deliveryseqnoList) {
        regINS(CK_NINS, cTL(deliveryseqnoList), xgetCValueDeliveryseqno(), "DELIVERYSEQNO");
    }

    protected void regDeliveryseqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryseqno(), "DELIVERYSEQNO"); }
    protected abstract ConditionValue xgetCValueDeliveryseqno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_Equal(java.math.BigDecimal deliverybranchno) {
        doSetDeliverybranchno_Equal(deliverybranchno);
    }

    protected void doSetDeliverybranchno_Equal(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_EQ, deliverybranchno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_NotEqual(java.math.BigDecimal deliverybranchno) {
        doSetDeliverybranchno_NotEqual(deliverybranchno);
    }

    protected void doSetDeliverybranchno_NotEqual(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_NES, deliverybranchno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_GreaterThan(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_GT, deliverybranchno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_LessThan(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_LT, deliverybranchno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_GreaterEqual(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_GE, deliverybranchno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchno The value of deliverybranchno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliverybranchno_LessEqual(java.math.BigDecimal deliverybranchno) {
        regDeliverybranchno(CK_LE, deliverybranchno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of deliverybranchno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliverybranchno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliverybranchno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliverybranchno(), "DELIVERYBRANCHNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchnoList The collection of deliverybranchno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverybranchno_InScope(Collection<java.math.BigDecimal> deliverybranchnoList) {
        doSetDeliverybranchno_InScope(deliverybranchnoList);
    }

    protected void doSetDeliverybranchno_InScope(Collection<java.math.BigDecimal> deliverybranchnoList) {
        regINS(CK_INS, cTL(deliverybranchnoList), xgetCValueDeliverybranchno(), "DELIVERYBRANCHNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERYBRANCHNO: {NotNull, decimal(16, 6)}
     * @param deliverybranchnoList The collection of deliverybranchno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverybranchno_NotInScope(Collection<java.math.BigDecimal> deliverybranchnoList) {
        doSetDeliverybranchno_NotInScope(deliverybranchnoList);
    }

    protected void doSetDeliverybranchno_NotInScope(Collection<java.math.BigDecimal> deliverybranchnoList) {
        regINS(CK_NINS, cTL(deliverybranchnoList), xgetCValueDeliverybranchno(), "DELIVERYBRANCHNO");
    }

    protected void regDeliverybranchno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverybranchno(), "DELIVERYBRANCHNO"); }
    protected abstract ConditionValue xgetCValueDeliverybranchno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_Equal(String caseno) {
        doSetCaseno_Equal(fRES(caseno));
    }

    protected void doSetCaseno_Equal(String caseno) {
        regCaseno(CK_EQ, caseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotEqual(String caseno) {
        doSetCaseno_NotEqual(fRES(caseno));
    }

    protected void doSetCaseno_NotEqual(String caseno) {
        regCaseno(CK_NES, caseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterThan(String caseno) {
        regCaseno(CK_GT, fRES(caseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessThan(String caseno) {
        regCaseno(CK_LT, fRES(caseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_GreaterEqual(String caseno) {
        regCaseno(CK_GE, fRES(caseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_LessEqual(String caseno) {
        regCaseno(CK_LE, fRES(caseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_InScope(Collection<String> casenoList) {
        doSetCaseno_InScope(casenoList);
    }

    protected void doSetCaseno_InScope(Collection<String> casenoList) {
        regINS(CK_INS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param casenoList The collection of caseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_NotInScope(Collection<String> casenoList) {
        doSetCaseno_NotInScope(casenoList);
    }

    protected void doSetCaseno_NotInScope(Collection<String> casenoList) {
        regINS(CK_NINS, cTL(casenoList), xgetCValueCaseno(), "CASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)} <br>
     * <pre>e.g. setCaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseno The value of caseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseno_LikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseno_NotLikeSearch(String caseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseno), xgetCValueCaseno(), "CASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASENO: {varchar(30)}
     * @param caseno The value of caseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseno_PrefixSearch(String caseno) {
        setCaseno_LikeSearch(caseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNull() { regCaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNullOrEmpty() { regCaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASENO: {varchar(30)}
     */
    public void setCaseno_IsNotNull() { regCaseno(CK_ISNN, DOBJ); }

    protected void regCaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseno(), "CASENO"); }
    protected abstract ConditionValue xgetCValueCaseno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_Equal(String caseserial) {
        doSetCaseserial_Equal(fRES(caseserial));
    }

    protected void doSetCaseserial_Equal(String caseserial) {
        regCaseserial(CK_EQ, caseserial);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_NotEqual(String caseserial) {
        doSetCaseserial_NotEqual(fRES(caseserial));
    }

    protected void doSetCaseserial_NotEqual(String caseserial) {
        regCaseserial(CK_NES, caseserial);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_GreaterThan(String caseserial) {
        regCaseserial(CK_GT, fRES(caseserial));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_LessThan(String caseserial) {
        regCaseserial(CK_LT, fRES(caseserial));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_GreaterEqual(String caseserial) {
        regCaseserial(CK_GE, fRES(caseserial));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_LessEqual(String caseserial) {
        regCaseserial(CK_LE, fRES(caseserial));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserialList The collection of caseserial as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_InScope(Collection<String> caseserialList) {
        doSetCaseserial_InScope(caseserialList);
    }

    protected void doSetCaseserial_InScope(Collection<String> caseserialList) {
        regINS(CK_INS, cTL(caseserialList), xgetCValueCaseserial(), "CASESERIAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserialList The collection of caseserial as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_NotInScope(Collection<String> caseserialList) {
        doSetCaseserial_NotInScope(caseserialList);
    }

    protected void doSetCaseserial_NotInScope(Collection<String> caseserialList) {
        regINS(CK_NINS, cTL(caseserialList), xgetCValueCaseserial(), "CASESERIAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)} <br>
     * <pre>e.g. setCaseserial_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseserial The value of caseserial as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseserial_LikeSearch(String caseserial, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseserial), xgetCValueCaseserial(), "CASESERIAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseserial_NotLikeSearch(String caseserial, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseserial), xgetCValueCaseserial(), "CASESERIAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASESERIAL: {varchar(30)}
     * @param caseserial The value of caseserial as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseserial_PrefixSearch(String caseserial) {
        setCaseserial_LikeSearch(caseserial, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNull() { regCaseserial(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNullOrEmpty() { regCaseserial(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASESERIAL: {varchar(30)}
     */
    public void setCaseserial_IsNotNull() { regCaseserial(CK_ISNN, DOBJ); }

    protected void regCaseserial(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseserial(), "CASESERIAL"); }
    protected abstract ConditionValue xgetCValueCaseserial();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_Equal(String sotedloc) {
        doSetSotedloc_Equal(fRES(sotedloc));
    }

    protected void doSetSotedloc_Equal(String sotedloc) {
        regSotedloc(CK_EQ, sotedloc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_NotEqual(String sotedloc) {
        doSetSotedloc_NotEqual(fRES(sotedloc));
    }

    protected void doSetSotedloc_NotEqual(String sotedloc) {
        regSotedloc(CK_NES, sotedloc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_GreaterThan(String sotedloc) {
        regSotedloc(CK_GT, fRES(sotedloc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_LessThan(String sotedloc) {
        regSotedloc(CK_LT, fRES(sotedloc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_GreaterEqual(String sotedloc) {
        regSotedloc(CK_GE, fRES(sotedloc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_LessEqual(String sotedloc) {
        regSotedloc(CK_LE, fRES(sotedloc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedlocList The collection of sotedloc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_InScope(Collection<String> sotedlocList) {
        doSetSotedloc_InScope(sotedlocList);
    }

    protected void doSetSotedloc_InScope(Collection<String> sotedlocList) {
        regINS(CK_INS, cTL(sotedlocList), xgetCValueSotedloc(), "SOTEDLOC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedlocList The collection of sotedloc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_NotInScope(Collection<String> sotedlocList) {
        doSetSotedloc_NotInScope(sotedlocList);
    }

    protected void doSetSotedloc_NotInScope(Collection<String> sotedlocList) {
        regINS(CK_NINS, cTL(sotedlocList), xgetCValueSotedloc(), "SOTEDLOC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(255)} <br>
     * <pre>e.g. setSotedloc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sotedloc The value of sotedloc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSotedloc_LikeSearch(String sotedloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sotedloc), xgetCValueSotedloc(), "SOTEDLOC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSotedloc_NotLikeSearch(String sotedloc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sotedloc), xgetCValueSotedloc(), "SOTEDLOC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     * @param sotedloc The value of sotedloc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSotedloc_PrefixSearch(String sotedloc) {
        setSotedloc_LikeSearch(sotedloc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     */
    public void setSotedloc_IsNull() { regSotedloc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     */
    public void setSotedloc_IsNullOrEmpty() { regSotedloc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SOTEDLOC: {varchar(255)}
     */
    public void setSotedloc_IsNotNull() { regSotedloc(CK_ISNN, DOBJ); }

    protected void regSotedloc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSotedloc(), "SOTEDLOC"); }
    protected abstract ConditionValue xgetCValueSotedloc();

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
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_Equal(String directioncd) {
        doSetDirectioncd_Equal(fRES(directioncd));
    }

    protected void doSetDirectioncd_Equal(String directioncd) {
        regDirectioncd(CK_EQ, directioncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotEqual(String directioncd) {
        doSetDirectioncd_NotEqual(fRES(directioncd));
    }

    protected void doSetDirectioncd_NotEqual(String directioncd) {
        regDirectioncd(CK_NES, directioncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterThan(String directioncd) {
        regDirectioncd(CK_GT, fRES(directioncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessThan(String directioncd) {
        regDirectioncd(CK_LT, fRES(directioncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_GreaterEqual(String directioncd) {
        regDirectioncd(CK_GE, fRES(directioncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_LessEqual(String directioncd) {
        regDirectioncd(CK_LE, fRES(directioncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_InScope(Collection<String> directioncdList) {
        doSetDirectioncd_InScope(directioncdList);
    }

    protected void doSetDirectioncd_InScope(Collection<String> directioncdList) {
        regINS(CK_INS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncdList The collection of directioncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_NotInScope(Collection<String> directioncdList) {
        doSetDirectioncd_NotInScope(directioncdList);
    }

    protected void doSetDirectioncd_NotInScope(Collection<String> directioncdList) {
        regINS(CK_NINS, cTL(directioncdList), xgetCValueDirectioncd(), "DIRECTIONCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)} <br>
     * <pre>e.g. setDirectioncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directioncd The value of directioncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectioncd_LikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectioncd_NotLikeSearch(String directioncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directioncd), xgetCValueDirectioncd(), "DIRECTIONCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     * @param directioncd The value of directioncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectioncd_PrefixSearch(String directioncd) {
        setDirectioncd_LikeSearch(directioncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNull() { regDirectioncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNullOrEmpty() { regDirectioncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONCD: {varchar(30)}
     */
    public void setDirectioncd_IsNotNull() { regDirectioncd(CK_ISNN, DOBJ); }

    protected void regDirectioncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectioncd(), "DIRECTIONCD"); }
    protected abstract ConditionValue xgetCValueDirectioncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_Equal(String pistontype) {
        doSetPistontype_Equal(fRES(pistontype));
    }

    protected void doSetPistontype_Equal(String pistontype) {
        regPistontype(CK_EQ, pistontype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotEqual(String pistontype) {
        doSetPistontype_NotEqual(fRES(pistontype));
    }

    protected void doSetPistontype_NotEqual(String pistontype) {
        regPistontype(CK_NES, pistontype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterThan(String pistontype) {
        regPistontype(CK_GT, fRES(pistontype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessThan(String pistontype) {
        regPistontype(CK_LT, fRES(pistontype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_GreaterEqual(String pistontype) {
        regPistontype(CK_GE, fRES(pistontype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_LessEqual(String pistontype) {
        regPistontype(CK_LE, fRES(pistontype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_InScope(Collection<String> pistontypeList) {
        doSetPistontype_InScope(pistontypeList);
    }

    protected void doSetPistontype_InScope(Collection<String> pistontypeList) {
        regINS(CK_INS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontypeList The collection of pistontype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_NotInScope(Collection<String> pistontypeList) {
        doSetPistontype_NotInScope(pistontypeList);
    }

    protected void doSetPistontype_NotInScope(Collection<String> pistontypeList) {
        regINS(CK_NINS, cTL(pistontypeList), xgetCValuePistontype(), "PISTONTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)} <br>
     * <pre>e.g. setPistontype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pistontype The value of pistontype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPistontype_LikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPistontype_NotLikeSearch(String pistontype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pistontype), xgetCValuePistontype(), "PISTONTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PISTONTYPE: {char(1)}
     * @param pistontype The value of pistontype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPistontype_PrefixSearch(String pistontype) {
        setPistontype_LikeSearch(pistontype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNull() { regPistontype(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PISTONTYPE: {char(1)}
     */
    public void setPistontype_IsNotNull() { regPistontype(CK_ISNN, DOBJ); }

    protected void regPistontype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePistontype(), "PISTONTYPE"); }
    protected abstract ConditionValue xgetCValuePistontype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_Equal(String customercd) {
        doSetCustomercd_Equal(fRES(customercd));
    }

    protected void doSetCustomercd_Equal(String customercd) {
        regCustomercd(CK_EQ, customercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotEqual(String customercd) {
        doSetCustomercd_NotEqual(fRES(customercd));
    }

    protected void doSetCustomercd_NotEqual(String customercd) {
        regCustomercd(CK_NES, customercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterThan(String customercd) {
        regCustomercd(CK_GT, fRES(customercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessThan(String customercd) {
        regCustomercd(CK_LT, fRES(customercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_GreaterEqual(String customercd) {
        regCustomercd(CK_GE, fRES(customercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_LessEqual(String customercd) {
        regCustomercd(CK_LE, fRES(customercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_InScope(Collection<String> customercdList) {
        doSetCustomercd_InScope(customercdList);
    }

    protected void doSetCustomercd_InScope(Collection<String> customercdList) {
        regINS(CK_INS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercdList The collection of customercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_NotInScope(Collection<String> customercdList) {
        doSetCustomercd_NotInScope(customercdList);
    }

    protected void doSetCustomercd_NotInScope(Collection<String> customercdList) {
        regINS(CK_NINS, cTL(customercdList), xgetCValueCustomercd(), "CUSTOMERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)} <br>
     * <pre>e.g. setCustomercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customercd The value of customercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomercd_LikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomercd_NotLikeSearch(String customercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customercd), xgetCValueCustomercd(), "CUSTOMERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     * @param customercd The value of customercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomercd_PrefixSearch(String customercd) {
        setCustomercd_LikeSearch(customercd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNull() { regCustomercd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNullOrEmpty() { regCustomercd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMERCD: {varchar(30)}
     */
    public void setCustomercd_IsNotNull() { regCustomercd(CK_ISNN, DOBJ); }

    protected void regCustomercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomercd(), "CUSTOMERCD"); }
    protected abstract ConditionValue xgetCValueCustomercd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_Equal(Long directionnum) {
        doSetDirectionnum_Equal(directionnum);
    }

    protected void doSetDirectionnum_Equal(Long directionnum) {
        regDirectionnum(CK_EQ, directionnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_NotEqual(Long directionnum) {
        doSetDirectionnum_NotEqual(directionnum);
    }

    protected void doSetDirectionnum_NotEqual(Long directionnum) {
        regDirectionnum(CK_NES, directionnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterThan(Long directionnum) {
        regDirectionnum(CK_GT, directionnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessThan(Long directionnum) {
        regDirectionnum(CK_LT, directionnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_GreaterEqual(Long directionnum) {
        regDirectionnum(CK_GE, directionnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnum The value of directionnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDirectionnum_LessEqual(Long directionnum) {
        regDirectionnum(CK_LE, directionnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param minNumber The min number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of directionnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDirectionnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDirectionnum(), "DIRECTIONNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_InScope(Collection<Long> directionnumList) {
        doSetDirectionnum_InScope(directionnumList);
    }

    protected void doSetDirectionnum_InScope(Collection<Long> directionnumList) {
        regINS(CK_INS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     * @param directionnumList The collection of directionnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectionnum_NotInScope(Collection<Long> directionnumList) {
        doSetDirectionnum_NotInScope(directionnumList);
    }

    protected void doSetDirectionnum_NotInScope(Collection<Long> directionnumList) {
        regINS(CK_NINS, cTL(directionnumList), xgetCValueDirectionnum(), "DIRECTIONNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNull() { regDirectionnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECTIONNUM: {bigint(19)}
     */
    public void setDirectionnum_IsNotNull() { regDirectionnum(CK_ISNN, DOBJ); }

    protected void regDirectionnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectionnum(), "DIRECTIONNUM"); }
    protected abstract ConditionValue xgetCValueDirectionnum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterThan(Long sroprtcnt) {
        regSroprtcnt(CK_GT, sroprtcnt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessThan(Long sroprtcnt) {
        regSroprtcnt(CK_LT, sroprtcnt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_GreaterEqual(Long sroprtcnt) {
        regSroprtcnt(CK_GE, sroprtcnt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcnt The value of sroprtcnt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSroprtcnt_LessEqual(Long sroprtcnt) {
        regSroprtcnt(CK_LE, sroprtcnt);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     * @param minNumber The min number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sroprtcnt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSroprtcnt_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSroprtcnt(), "SROPRTCNT", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SROPRTCNT: {bigint(19)}
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
     * SROPRTCNT: {bigint(19)}
     * @param sroprtcntList The collection of sroprtcnt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        doSetSroprtcnt_NotInScope(sroprtcntList);
    }

    protected void doSetSroprtcnt_NotInScope(Collection<Long> sroprtcntList) {
        regINS(CK_NINS, cTL(sroprtcntList), xgetCValueSroprtcnt(), "SROPRTCNT");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNull() { regSroprtcnt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SROPRTCNT: {bigint(19)}
     */
    public void setSroprtcnt_IsNotNull() { regSroprtcnt(CK_ISNN, DOBJ); }

    protected void regSroprtcnt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSroprtcnt(), "SROPRTCNT"); }
    protected abstract ConditionValue xgetCValueSroprtcnt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_Equal(String vaExtdata1) {
        doSetVaExtdata1_Equal(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_Equal(String vaExtdata1) {
        regVaExtdata1(CK_EQ, vaExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotEqual(String vaExtdata1) {
        doSetVaExtdata1_NotEqual(fRES(vaExtdata1));
    }

    protected void doSetVaExtdata1_NotEqual(String vaExtdata1) {
        regVaExtdata1(CK_NES, vaExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterThan(String vaExtdata1) {
        regVaExtdata1(CK_GT, fRES(vaExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessThan(String vaExtdata1) {
        regVaExtdata1(CK_LT, fRES(vaExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_GreaterEqual(String vaExtdata1) {
        regVaExtdata1(CK_GE, fRES(vaExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_LessEqual(String vaExtdata1) {
        regVaExtdata1(CK_LE, fRES(vaExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_InScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_InScope(Collection<String> vaExtdata1List) {
        regINS(CK_INS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1List The collection of vaExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        doSetVaExtdata1_NotInScope(vaExtdata1List);
    }

    protected void doSetVaExtdata1_NotInScope(Collection<String> vaExtdata1List) {
        regINS(CK_NINS, cTL(vaExtdata1List), xgetCValueVaExtdata1(), "VA_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata1 The value of vaExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata1_LikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata1_NotLikeSearch(String vaExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata1), xgetCValueVaExtdata1(), "VA_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     * @param vaExtdata1 The value of vaExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata1_PrefixSearch(String vaExtdata1) {
        setVaExtdata1_LikeSearch(vaExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNull() { regVaExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNullOrEmpty() { regVaExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA1: {varchar(30)}
     */
    public void setVaExtdata1_IsNotNull() { regVaExtdata1(CK_ISNN, DOBJ); }

    protected void regVaExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata1(), "VA_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueVaExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_Equal(String vaExtdata2) {
        doSetVaExtdata2_Equal(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_Equal(String vaExtdata2) {
        regVaExtdata2(CK_EQ, vaExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotEqual(String vaExtdata2) {
        doSetVaExtdata2_NotEqual(fRES(vaExtdata2));
    }

    protected void doSetVaExtdata2_NotEqual(String vaExtdata2) {
        regVaExtdata2(CK_NES, vaExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterThan(String vaExtdata2) {
        regVaExtdata2(CK_GT, fRES(vaExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessThan(String vaExtdata2) {
        regVaExtdata2(CK_LT, fRES(vaExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_GreaterEqual(String vaExtdata2) {
        regVaExtdata2(CK_GE, fRES(vaExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_LessEqual(String vaExtdata2) {
        regVaExtdata2(CK_LE, fRES(vaExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_InScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_InScope(Collection<String> vaExtdata2List) {
        regINS(CK_INS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2List The collection of vaExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        doSetVaExtdata2_NotInScope(vaExtdata2List);
    }

    protected void doSetVaExtdata2_NotInScope(Collection<String> vaExtdata2List) {
        regINS(CK_NINS, cTL(vaExtdata2List), xgetCValueVaExtdata2(), "VA_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata2 The value of vaExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata2_LikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata2_NotLikeSearch(String vaExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata2), xgetCValueVaExtdata2(), "VA_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     * @param vaExtdata2 The value of vaExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata2_PrefixSearch(String vaExtdata2) {
        setVaExtdata2_LikeSearch(vaExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNull() { regVaExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNullOrEmpty() { regVaExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA2: {varchar(30)}
     */
    public void setVaExtdata2_IsNotNull() { regVaExtdata2(CK_ISNN, DOBJ); }

    protected void regVaExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata2(), "VA_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueVaExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_Equal(String vaExtdata3) {
        doSetVaExtdata3_Equal(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_Equal(String vaExtdata3) {
        regVaExtdata3(CK_EQ, vaExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotEqual(String vaExtdata3) {
        doSetVaExtdata3_NotEqual(fRES(vaExtdata3));
    }

    protected void doSetVaExtdata3_NotEqual(String vaExtdata3) {
        regVaExtdata3(CK_NES, vaExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterThan(String vaExtdata3) {
        regVaExtdata3(CK_GT, fRES(vaExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessThan(String vaExtdata3) {
        regVaExtdata3(CK_LT, fRES(vaExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_GreaterEqual(String vaExtdata3) {
        regVaExtdata3(CK_GE, fRES(vaExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_LessEqual(String vaExtdata3) {
        regVaExtdata3(CK_LE, fRES(vaExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_InScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_InScope(Collection<String> vaExtdata3List) {
        regINS(CK_INS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3List The collection of vaExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        doSetVaExtdata3_NotInScope(vaExtdata3List);
    }

    protected void doSetVaExtdata3_NotInScope(Collection<String> vaExtdata3List) {
        regINS(CK_NINS, cTL(vaExtdata3List), xgetCValueVaExtdata3(), "VA_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)} <br>
     * <pre>e.g. setVaExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param vaExtdata3 The value of vaExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setVaExtdata3_LikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setVaExtdata3_NotLikeSearch(String vaExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(vaExtdata3), xgetCValueVaExtdata3(), "VA_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     * @param vaExtdata3 The value of vaExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVaExtdata3_PrefixSearch(String vaExtdata3) {
        setVaExtdata3_LikeSearch(vaExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNull() { regVaExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNullOrEmpty() { regVaExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VA_EXTDATA3: {varchar(30)}
     */
    public void setVaExtdata3_IsNotNull() { regVaExtdata3(CK_ISNN, DOBJ); }

    protected void regVaExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVaExtdata3(), "VA_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueVaExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_Equal(String nvExtdata1) {
        doSetNvExtdata1_Equal(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_Equal(String nvExtdata1) {
        regNvExtdata1(CK_EQ, nvExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotEqual(String nvExtdata1) {
        doSetNvExtdata1_NotEqual(fRES(nvExtdata1));
    }

    protected void doSetNvExtdata1_NotEqual(String nvExtdata1) {
        regNvExtdata1(CK_NES, nvExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterThan(String nvExtdata1) {
        regNvExtdata1(CK_GT, fRES(nvExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessThan(String nvExtdata1) {
        regNvExtdata1(CK_LT, fRES(nvExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_GreaterEqual(String nvExtdata1) {
        regNvExtdata1(CK_GE, fRES(nvExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_LessEqual(String nvExtdata1) {
        regNvExtdata1(CK_LE, fRES(nvExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_InScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_InScope(Collection<String> nvExtdata1List) {
        regINS(CK_INS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1List The collection of nvExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        doSetNvExtdata1_NotInScope(nvExtdata1List);
    }

    protected void doSetNvExtdata1_NotInScope(Collection<String> nvExtdata1List) {
        regINS(CK_NINS, cTL(nvExtdata1List), xgetCValueNvExtdata1(), "NV_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata1 The value of nvExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata1_LikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata1_NotLikeSearch(String nvExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata1), xgetCValueNvExtdata1(), "NV_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     * @param nvExtdata1 The value of nvExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata1_PrefixSearch(String nvExtdata1) {
        setNvExtdata1_LikeSearch(nvExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNull() { regNvExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNullOrEmpty() { regNvExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA1: {varchar(60)}
     */
    public void setNvExtdata1_IsNotNull() { regNvExtdata1(CK_ISNN, DOBJ); }

    protected void regNvExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata1(), "NV_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNvExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_Equal(String nvExtdata2) {
        doSetNvExtdata2_Equal(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_Equal(String nvExtdata2) {
        regNvExtdata2(CK_EQ, nvExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotEqual(String nvExtdata2) {
        doSetNvExtdata2_NotEqual(fRES(nvExtdata2));
    }

    protected void doSetNvExtdata2_NotEqual(String nvExtdata2) {
        regNvExtdata2(CK_NES, nvExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterThan(String nvExtdata2) {
        regNvExtdata2(CK_GT, fRES(nvExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessThan(String nvExtdata2) {
        regNvExtdata2(CK_LT, fRES(nvExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_GreaterEqual(String nvExtdata2) {
        regNvExtdata2(CK_GE, fRES(nvExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_LessEqual(String nvExtdata2) {
        regNvExtdata2(CK_LE, fRES(nvExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_InScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_InScope(Collection<String> nvExtdata2List) {
        regINS(CK_INS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2List The collection of nvExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        doSetNvExtdata2_NotInScope(nvExtdata2List);
    }

    protected void doSetNvExtdata2_NotInScope(Collection<String> nvExtdata2List) {
        regINS(CK_NINS, cTL(nvExtdata2List), xgetCValueNvExtdata2(), "NV_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata2 The value of nvExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata2_LikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata2_NotLikeSearch(String nvExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata2), xgetCValueNvExtdata2(), "NV_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     * @param nvExtdata2 The value of nvExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata2_PrefixSearch(String nvExtdata2) {
        setNvExtdata2_LikeSearch(nvExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNull() { regNvExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNullOrEmpty() { regNvExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA2: {varchar(60)}
     */
    public void setNvExtdata2_IsNotNull() { regNvExtdata2(CK_ISNN, DOBJ); }

    protected void regNvExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata2(), "NV_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNvExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_Equal(String nvExtdata3) {
        doSetNvExtdata3_Equal(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_Equal(String nvExtdata3) {
        regNvExtdata3(CK_EQ, nvExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotEqual(String nvExtdata3) {
        doSetNvExtdata3_NotEqual(fRES(nvExtdata3));
    }

    protected void doSetNvExtdata3_NotEqual(String nvExtdata3) {
        regNvExtdata3(CK_NES, nvExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterThan(String nvExtdata3) {
        regNvExtdata3(CK_GT, fRES(nvExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessThan(String nvExtdata3) {
        regNvExtdata3(CK_LT, fRES(nvExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_GreaterEqual(String nvExtdata3) {
        regNvExtdata3(CK_GE, fRES(nvExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_LessEqual(String nvExtdata3) {
        regNvExtdata3(CK_LE, fRES(nvExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_InScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_InScope(Collection<String> nvExtdata3List) {
        regINS(CK_INS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3List The collection of nvExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        doSetNvExtdata3_NotInScope(nvExtdata3List);
    }

    protected void doSetNvExtdata3_NotInScope(Collection<String> nvExtdata3List) {
        regINS(CK_NINS, cTL(nvExtdata3List), xgetCValueNvExtdata3(), "NV_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)} <br>
     * <pre>e.g. setNvExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nvExtdata3 The value of nvExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNvExtdata3_LikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNvExtdata3_NotLikeSearch(String nvExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nvExtdata3), xgetCValueNvExtdata3(), "NV_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     * @param nvExtdata3 The value of nvExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNvExtdata3_PrefixSearch(String nvExtdata3) {
        setNvExtdata3_LikeSearch(nvExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNull() { regNvExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNullOrEmpty() { regNvExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NV_EXTDATA3: {varchar(60)}
     */
    public void setNvExtdata3_IsNotNull() { regNvExtdata3(CK_ISNN, DOBJ); }

    protected void regNvExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNvExtdata3(), "NV_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNvExtdata3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_Equal(Long nmExtdata1) {
        doSetNmExtdata1_Equal(nmExtdata1);
    }

    protected void doSetNmExtdata1_Equal(Long nmExtdata1) {
        regNmExtdata1(CK_EQ, nmExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotEqual(Long nmExtdata1) {
        doSetNmExtdata1_NotEqual(nmExtdata1);
    }

    protected void doSetNmExtdata1_NotEqual(Long nmExtdata1) {
        regNmExtdata1(CK_NES, nmExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterThan(Long nmExtdata1) {
        regNmExtdata1(CK_GT, nmExtdata1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessThan(Long nmExtdata1) {
        regNmExtdata1(CK_LT, nmExtdata1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_GreaterEqual(Long nmExtdata1) {
        regNmExtdata1(CK_GE, nmExtdata1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1 The value of nmExtdata1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata1_LessEqual(Long nmExtdata1) {
        regNmExtdata1(CK_LE, nmExtdata1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param minNumber The min number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata1(), "NM_EXTDATA1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_InScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_InScope(Collection<Long> nmExtdata1List) {
        regINS(CK_INS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     * @param nmExtdata1List The collection of nmExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        doSetNmExtdata1_NotInScope(nmExtdata1List);
    }

    protected void doSetNmExtdata1_NotInScope(Collection<Long> nmExtdata1List) {
        regINS(CK_NINS, cTL(nmExtdata1List), xgetCValueNmExtdata1(), "NM_EXTDATA1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNull() { regNmExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA1: {bigint(19)}
     */
    public void setNmExtdata1_IsNotNull() { regNmExtdata1(CK_ISNN, DOBJ); }

    protected void regNmExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata1(), "NM_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueNmExtdata1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_Equal(Long nmExtdata2) {
        doSetNmExtdata2_Equal(nmExtdata2);
    }

    protected void doSetNmExtdata2_Equal(Long nmExtdata2) {
        regNmExtdata2(CK_EQ, nmExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotEqual(Long nmExtdata2) {
        doSetNmExtdata2_NotEqual(nmExtdata2);
    }

    protected void doSetNmExtdata2_NotEqual(Long nmExtdata2) {
        regNmExtdata2(CK_NES, nmExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterThan(Long nmExtdata2) {
        regNmExtdata2(CK_GT, nmExtdata2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessThan(Long nmExtdata2) {
        regNmExtdata2(CK_LT, nmExtdata2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_GreaterEqual(Long nmExtdata2) {
        regNmExtdata2(CK_GE, nmExtdata2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2 The value of nmExtdata2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata2_LessEqual(Long nmExtdata2) {
        regNmExtdata2(CK_LE, nmExtdata2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param minNumber The min number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata2_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata2(), "NM_EXTDATA2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_InScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_InScope(Collection<Long> nmExtdata2List) {
        regINS(CK_INS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     * @param nmExtdata2List The collection of nmExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        doSetNmExtdata2_NotInScope(nmExtdata2List);
    }

    protected void doSetNmExtdata2_NotInScope(Collection<Long> nmExtdata2List) {
        regINS(CK_NINS, cTL(nmExtdata2List), xgetCValueNmExtdata2(), "NM_EXTDATA2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNull() { regNmExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA2: {bigint(19)}
     */
    public void setNmExtdata2_IsNotNull() { regNmExtdata2(CK_ISNN, DOBJ); }

    protected void regNmExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata2(), "NM_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueNmExtdata2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_Equal(Long nmExtdata3) {
        doSetNmExtdata3_Equal(nmExtdata3);
    }

    protected void doSetNmExtdata3_Equal(Long nmExtdata3) {
        regNmExtdata3(CK_EQ, nmExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotEqual(Long nmExtdata3) {
        doSetNmExtdata3_NotEqual(nmExtdata3);
    }

    protected void doSetNmExtdata3_NotEqual(Long nmExtdata3) {
        regNmExtdata3(CK_NES, nmExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterThan(Long nmExtdata3) {
        regNmExtdata3(CK_GT, nmExtdata3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessThan(Long nmExtdata3) {
        regNmExtdata3(CK_LT, nmExtdata3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_GreaterEqual(Long nmExtdata3) {
        regNmExtdata3(CK_GE, nmExtdata3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3 The value of nmExtdata3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNmExtdata3_LessEqual(Long nmExtdata3) {
        regNmExtdata3(CK_LE, nmExtdata3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param minNumber The min number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of nmExtdata3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNmExtdata3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNmExtdata3(), "NM_EXTDATA3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_InScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_InScope(Collection<Long> nmExtdata3List) {
        regINS(CK_INS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     * @param nmExtdata3List The collection of nmExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        doSetNmExtdata3_NotInScope(nmExtdata3List);
    }

    protected void doSetNmExtdata3_NotInScope(Collection<Long> nmExtdata3List) {
        regINS(CK_NINS, cTL(nmExtdata3List), xgetCValueNmExtdata3(), "NM_EXTDATA3");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNull() { regNmExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NM_EXTDATA3: {bigint(19)}
     */
    public void setNmExtdata3_IsNotNull() { regNmExtdata3(CK_ISNN, DOBJ); }

    protected void regNmExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNmExtdata3(), "NM_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueNmExtdata3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_Equal(String dtExtdata1) {
        doSetDtExtdata1_Equal(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_Equal(String dtExtdata1) {
        regDtExtdata1(CK_EQ, dtExtdata1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotEqual(String dtExtdata1) {
        doSetDtExtdata1_NotEqual(fRES(dtExtdata1));
    }

    protected void doSetDtExtdata1_NotEqual(String dtExtdata1) {
        regDtExtdata1(CK_NES, dtExtdata1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterThan(String dtExtdata1) {
        regDtExtdata1(CK_GT, fRES(dtExtdata1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessThan(String dtExtdata1) {
        regDtExtdata1(CK_LT, fRES(dtExtdata1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_GreaterEqual(String dtExtdata1) {
        regDtExtdata1(CK_GE, fRES(dtExtdata1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_LessEqual(String dtExtdata1) {
        regDtExtdata1(CK_LE, fRES(dtExtdata1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_InScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_InScope(Collection<String> dtExtdata1List) {
        regINS(CK_INS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1List The collection of dtExtdata1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        doSetDtExtdata1_NotInScope(dtExtdata1List);
    }

    protected void doSetDtExtdata1_NotInScope(Collection<String> dtExtdata1List) {
        regINS(CK_NINS, cTL(dtExtdata1List), xgetCValueDtExtdata1(), "DT_EXTDATA1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata1 The value of dtExtdata1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata1_LikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata1_NotLikeSearch(String dtExtdata1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata1), xgetCValueDtExtdata1(), "DT_EXTDATA1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     * @param dtExtdata1 The value of dtExtdata1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata1_PrefixSearch(String dtExtdata1) {
        setDtExtdata1_LikeSearch(dtExtdata1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNull() { regDtExtdata1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNullOrEmpty() { regDtExtdata1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA1: {varchar(8)}
     */
    public void setDtExtdata1_IsNotNull() { regDtExtdata1(CK_ISNN, DOBJ); }

    protected void regDtExtdata1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata1(), "DT_EXTDATA1"); }
    protected abstract ConditionValue xgetCValueDtExtdata1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_Equal(String dtExtdata2) {
        doSetDtExtdata2_Equal(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_Equal(String dtExtdata2) {
        regDtExtdata2(CK_EQ, dtExtdata2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotEqual(String dtExtdata2) {
        doSetDtExtdata2_NotEqual(fRES(dtExtdata2));
    }

    protected void doSetDtExtdata2_NotEqual(String dtExtdata2) {
        regDtExtdata2(CK_NES, dtExtdata2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterThan(String dtExtdata2) {
        regDtExtdata2(CK_GT, fRES(dtExtdata2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessThan(String dtExtdata2) {
        regDtExtdata2(CK_LT, fRES(dtExtdata2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_GreaterEqual(String dtExtdata2) {
        regDtExtdata2(CK_GE, fRES(dtExtdata2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_LessEqual(String dtExtdata2) {
        regDtExtdata2(CK_LE, fRES(dtExtdata2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_InScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_InScope(Collection<String> dtExtdata2List) {
        regINS(CK_INS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2List The collection of dtExtdata2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        doSetDtExtdata2_NotInScope(dtExtdata2List);
    }

    protected void doSetDtExtdata2_NotInScope(Collection<String> dtExtdata2List) {
        regINS(CK_NINS, cTL(dtExtdata2List), xgetCValueDtExtdata2(), "DT_EXTDATA2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata2 The value of dtExtdata2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata2_LikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata2_NotLikeSearch(String dtExtdata2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata2), xgetCValueDtExtdata2(), "DT_EXTDATA2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     * @param dtExtdata2 The value of dtExtdata2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata2_PrefixSearch(String dtExtdata2) {
        setDtExtdata2_LikeSearch(dtExtdata2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNull() { regDtExtdata2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNullOrEmpty() { regDtExtdata2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA2: {varchar(8)}
     */
    public void setDtExtdata2_IsNotNull() { regDtExtdata2(CK_ISNN, DOBJ); }

    protected void regDtExtdata2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata2(), "DT_EXTDATA2"); }
    protected abstract ConditionValue xgetCValueDtExtdata2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_Equal(String dtExtdata3) {
        doSetDtExtdata3_Equal(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_Equal(String dtExtdata3) {
        regDtExtdata3(CK_EQ, dtExtdata3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotEqual(String dtExtdata3) {
        doSetDtExtdata3_NotEqual(fRES(dtExtdata3));
    }

    protected void doSetDtExtdata3_NotEqual(String dtExtdata3) {
        regDtExtdata3(CK_NES, dtExtdata3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterThan(String dtExtdata3) {
        regDtExtdata3(CK_GT, fRES(dtExtdata3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessThan(String dtExtdata3) {
        regDtExtdata3(CK_LT, fRES(dtExtdata3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_GreaterEqual(String dtExtdata3) {
        regDtExtdata3(CK_GE, fRES(dtExtdata3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_LessEqual(String dtExtdata3) {
        regDtExtdata3(CK_LE, fRES(dtExtdata3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_InScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_InScope(Collection<String> dtExtdata3List) {
        regINS(CK_INS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3List The collection of dtExtdata3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        doSetDtExtdata3_NotInScope(dtExtdata3List);
    }

    protected void doSetDtExtdata3_NotInScope(Collection<String> dtExtdata3List) {
        regINS(CK_NINS, cTL(dtExtdata3List), xgetCValueDtExtdata3(), "DT_EXTDATA3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)} <br>
     * <pre>e.g. setDtExtdata3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dtExtdata3 The value of dtExtdata3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDtExtdata3_LikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDtExtdata3_NotLikeSearch(String dtExtdata3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dtExtdata3), xgetCValueDtExtdata3(), "DT_EXTDATA3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     * @param dtExtdata3 The value of dtExtdata3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDtExtdata3_PrefixSearch(String dtExtdata3) {
        setDtExtdata3_LikeSearch(dtExtdata3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNull() { regDtExtdata3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNullOrEmpty() { regDtExtdata3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DT_EXTDATA3: {varchar(8)}
     */
    public void setDtExtdata3_IsNotNull() { regDtExtdata3(CK_ISNN, DOBJ); }

    protected void regDtExtdata3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDtExtdata3(), "DT_EXTDATA3"); }
    protected abstract ConditionValue xgetCValueDtExtdata3();

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
    public HpSLCFunction<TTrassortorderCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrassortorderCB.class);
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
    public HpSLCFunction<TTrassortorderCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrassortorderCB.class);
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
    public HpSLCFunction<TTrassortorderCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrassortorderCB.class);
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
    public HpSLCFunction<TTrassortorderCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrassortorderCB.class);
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
    public HpSLCFunction<TTrassortorderCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrassortorderCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrassortorderCB&gt;() {
     *     public void query(TTrassortorderCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrassortorderCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrassortorderCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrassortorderCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrassortorderCQ sq);

    protected TTrassortorderCB xcreateScalarConditionCB() {
        TTrassortorderCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrassortorderCB xcreateScalarConditionPartitionByCB() {
        TTrassortorderCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected TTrassortorderCB newMyCB() {
        return new TTrassortorderCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrassortorderCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
