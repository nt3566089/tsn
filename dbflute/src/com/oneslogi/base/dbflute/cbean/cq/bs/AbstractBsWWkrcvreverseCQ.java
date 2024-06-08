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
 * The abstract condition-query of W_WKRCVREVERSE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWkrcvreverseCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWkrcvreverseCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKRCVREVERSE";
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_Equal(java.math.BigDecimal rcvreverseno) {
        doSetRcvreverseno_Equal(rcvreverseno);
    }

    protected void doSetRcvreverseno_Equal(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_EQ, rcvreverseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_NotEqual(java.math.BigDecimal rcvreverseno) {
        doSetRcvreverseno_NotEqual(rcvreverseno);
    }

    protected void doSetRcvreverseno_NotEqual(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_NES, rcvreverseno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_GreaterThan(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_GT, rcvreverseno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_LessThan(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_LT, rcvreverseno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_GreaterEqual(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_GE, rcvreverseno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreverseno The value of rcvreverseno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverseno_LessEqual(java.math.BigDecimal rcvreverseno) {
        regRcvreverseno(CK_LE, rcvreverseno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvreverseno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvreverseno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvreverseno_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvreverseno(), "RCVREVERSENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreversenoList The collection of rcvreverseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvreverseno_InScope(Collection<java.math.BigDecimal> rcvreversenoList) {
        doSetRcvreverseno_InScope(rcvreversenoList);
    }

    protected void doSetRcvreverseno_InScope(Collection<java.math.BigDecimal> rcvreversenoList) {
        regINS(CK_INS, cTL(rcvreversenoList), xgetCValueRcvreverseno(), "RCVREVERSENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     * @param rcvreversenoList The collection of rcvreverseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvreverseno_NotInScope(Collection<java.math.BigDecimal> rcvreversenoList) {
        doSetRcvreverseno_NotInScope(rcvreversenoList);
    }

    protected void doSetRcvreverseno_NotInScope(Collection<java.math.BigDecimal> rcvreversenoList) {
        regINS(CK_NINS, cTL(rcvreversenoList), xgetCValueRcvreverseno(), "RCVREVERSENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     */
    public void setRcvreverseno_IsNull() { regRcvreverseno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVREVERSENO: {PK, NotNull, decimal(16, 6)}
     */
    public void setRcvreverseno_IsNotNull() { regRcvreverseno(CK_ISNN, DOBJ); }

    protected void regRcvreverseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvreverseno(), "RCVREVERSENO"); }
    protected abstract ConditionValue xgetCValueRcvreverseno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_Equal(Long rcvreverselineno) {
        doSetRcvreverselineno_Equal(rcvreverselineno);
    }

    protected void doSetRcvreverselineno_Equal(Long rcvreverselineno) {
        regRcvreverselineno(CK_EQ, rcvreverselineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_NotEqual(Long rcvreverselineno) {
        doSetRcvreverselineno_NotEqual(rcvreverselineno);
    }

    protected void doSetRcvreverselineno_NotEqual(Long rcvreverselineno) {
        regRcvreverselineno(CK_NES, rcvreverselineno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_GreaterThan(Long rcvreverselineno) {
        regRcvreverselineno(CK_GT, rcvreverselineno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_LessThan(Long rcvreverselineno) {
        regRcvreverselineno(CK_LT, rcvreverselineno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_GreaterEqual(Long rcvreverselineno) {
        regRcvreverselineno(CK_GE, rcvreverselineno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselineno The value of rcvreverselineno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvreverselineno_LessEqual(Long rcvreverselineno) {
        regRcvreverselineno(CK_LE, rcvreverselineno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param minNumber The min number of rcvreverselineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvreverselineno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvreverselineno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvreverselineno(), "RCVREVERSELINENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselinenoList The collection of rcvreverselineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvreverselineno_InScope(Collection<Long> rcvreverselinenoList) {
        doSetRcvreverselineno_InScope(rcvreverselinenoList);
    }

    protected void doSetRcvreverselineno_InScope(Collection<Long> rcvreverselinenoList) {
        regINS(CK_INS, cTL(rcvreverselinenoList), xgetCValueRcvreverselineno(), "RCVREVERSELINENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     * @param rcvreverselinenoList The collection of rcvreverselineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvreverselineno_NotInScope(Collection<Long> rcvreverselinenoList) {
        doSetRcvreverselineno_NotInScope(rcvreverselinenoList);
    }

    protected void doSetRcvreverselineno_NotInScope(Collection<Long> rcvreverselinenoList) {
        regINS(CK_NINS, cTL(rcvreverselinenoList), xgetCValueRcvreverselineno(), "RCVREVERSELINENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     */
    public void setRcvreverselineno_IsNull() { regRcvreverselineno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVREVERSELINENO: {PK, NotNull, bigint(19)}
     */
    public void setRcvreverselineno_IsNotNull() { regRcvreverselineno(CK_ISNN, DOBJ); }

    protected void regRcvreverselineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvreverselineno(), "RCVREVERSELINENO"); }
    protected abstract ConditionValue xgetCValueRcvreverselineno();

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
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_Equal(String transportno) {
        doSetTransportno_Equal(fRES(transportno));
    }

    protected void doSetTransportno_Equal(String transportno) {
        regTransportno(CK_EQ, transportno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_NotEqual(String transportno) {
        doSetTransportno_NotEqual(fRES(transportno));
    }

    protected void doSetTransportno_NotEqual(String transportno) {
        regTransportno(CK_NES, transportno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_GreaterThan(String transportno) {
        regTransportno(CK_GT, fRES(transportno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_LessThan(String transportno) {
        regTransportno(CK_LT, fRES(transportno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_GreaterEqual(String transportno) {
        regTransportno(CK_GE, fRES(transportno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_LessEqual(String transportno) {
        regTransportno(CK_LE, fRES(transportno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportnoList The collection of transportno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_InScope(Collection<String> transportnoList) {
        doSetTransportno_InScope(transportnoList);
    }

    protected void doSetTransportno_InScope(Collection<String> transportnoList) {
        regINS(CK_INS, cTL(transportnoList), xgetCValueTransportno(), "TRANSPORTNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportnoList The collection of transportno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_NotInScope(Collection<String> transportnoList) {
        doSetTransportno_NotInScope(transportnoList);
    }

    protected void doSetTransportno_NotInScope(Collection<String> transportnoList) {
        regINS(CK_NINS, cTL(transportnoList), xgetCValueTransportno(), "TRANSPORTNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)} <br>
     * <pre>e.g. setTransportno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transportno The value of transportno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransportno_LikeSearch(String transportno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transportno), xgetCValueTransportno(), "TRANSPORTNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransportno_NotLikeSearch(String transportno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transportno), xgetCValueTransportno(), "TRANSPORTNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSPORTNO: {NotNull, varchar(60)}
     * @param transportno The value of transportno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransportno_PrefixSearch(String transportno) {
        setTransportno_LikeSearch(transportno, xcLSOPPre());
    }

    protected void regTransportno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransportno(), "TRANSPORTNO"); }
    protected abstract ConditionValue xgetCValueTransportno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_Equal(String rcvschdate) {
        doSetRcvschdate_Equal(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_Equal(String rcvschdate) {
        regRcvschdate(CK_EQ, rcvschdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotEqual(String rcvschdate) {
        doSetRcvschdate_NotEqual(fRES(rcvschdate));
    }

    protected void doSetRcvschdate_NotEqual(String rcvschdate) {
        regRcvschdate(CK_NES, rcvschdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterThan(String rcvschdate) {
        regRcvschdate(CK_GT, fRES(rcvschdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessThan(String rcvschdate) {
        regRcvschdate(CK_LT, fRES(rcvschdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_GreaterEqual(String rcvschdate) {
        regRcvschdate(CK_GE, fRES(rcvschdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_LessEqual(String rcvschdate) {
        regRcvschdate(CK_LE, fRES(rcvschdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_InScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_InScope(rcvschdateList);
    }

    protected void doSetRcvschdate_InScope(Collection<String> rcvschdateList) {
        regINS(CK_INS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdateList The collection of rcvschdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        doSetRcvschdate_NotInScope(rcvschdateList);
    }

    protected void doSetRcvschdate_NotInScope(Collection<String> rcvschdateList) {
        regINS(CK_NINS, cTL(rcvschdateList), xgetCValueRcvschdate(), "RCVSCHDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setRcvschdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvschdate The value of rcvschdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvschdate_LikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvschdate_NotLikeSearch(String rcvschdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvschdate), xgetCValueRcvschdate(), "RCVSCHDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVSCHDATE: {NotNull, varchar(8)}
     * @param rcvschdate The value of rcvschdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvschdate_PrefixSearch(String rcvschdate) {
        setRcvschdate_LikeSearch(rcvschdate, xcLSOPPre());
    }

    protected void regRcvschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvschdate(), "RCVSCHDATE"); }
    protected abstract ConditionValue xgetCValueRcvschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_Equal(String suppliercd) {
        doSetSuppliercd_Equal(fRES(suppliercd));
    }

    protected void doSetSuppliercd_Equal(String suppliercd) {
        regSuppliercd(CK_EQ, suppliercd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotEqual(String suppliercd) {
        doSetSuppliercd_NotEqual(fRES(suppliercd));
    }

    protected void doSetSuppliercd_NotEqual(String suppliercd) {
        regSuppliercd(CK_NES, suppliercd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterThan(String suppliercd) {
        regSuppliercd(CK_GT, fRES(suppliercd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessThan(String suppliercd) {
        regSuppliercd(CK_LT, fRES(suppliercd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_GreaterEqual(String suppliercd) {
        regSuppliercd(CK_GE, fRES(suppliercd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_LessEqual(String suppliercd) {
        regSuppliercd(CK_LE, fRES(suppliercd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercdList The collection of suppliercd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_InScope(Collection<String> suppliercdList) {
        doSetSuppliercd_InScope(suppliercdList);
    }

    protected void doSetSuppliercd_InScope(Collection<String> suppliercdList) {
        regINS(CK_INS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercdList The collection of suppliercd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_NotInScope(Collection<String> suppliercdList) {
        doSetSuppliercd_NotInScope(suppliercdList);
    }

    protected void doSetSuppliercd_NotInScope(Collection<String> suppliercdList) {
        regINS(CK_NINS, cTL(suppliercdList), xgetCValueSuppliercd(), "SUPPLIERCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setSuppliercd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliercd The value of suppliercd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliercd_LikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliercd_NotLikeSearch(String suppliercd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliercd), xgetCValueSuppliercd(), "SUPPLIERCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERCD: {NotNull, varchar(30)}
     * @param suppliercd The value of suppliercd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliercd_PrefixSearch(String suppliercd) {
        setSuppliercd_LikeSearch(suppliercd, xcLSOPPre());
    }

    protected void regSuppliercd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliercd(), "SUPPLIERCD"); }
    protected abstract ConditionValue xgetCValueSuppliercd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_Equal(String suppliername) {
        doSetSuppliername_Equal(fRES(suppliername));
    }

    protected void doSetSuppliername_Equal(String suppliername) {
        regSuppliername(CK_EQ, suppliername);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_NotEqual(String suppliername) {
        doSetSuppliername_NotEqual(fRES(suppliername));
    }

    protected void doSetSuppliername_NotEqual(String suppliername) {
        regSuppliername(CK_NES, suppliername);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_GreaterThan(String suppliername) {
        regSuppliername(CK_GT, fRES(suppliername));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_LessThan(String suppliername) {
        regSuppliername(CK_LT, fRES(suppliername));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_GreaterEqual(String suppliername) {
        regSuppliername(CK_GE, fRES(suppliername));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_LessEqual(String suppliername) {
        regSuppliername(CK_LE, fRES(suppliername));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliernameList The collection of suppliername as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_InScope(Collection<String> suppliernameList) {
        doSetSuppliername_InScope(suppliernameList);
    }

    protected void doSetSuppliername_InScope(Collection<String> suppliernameList) {
        regINS(CK_INS, cTL(suppliernameList), xgetCValueSuppliername(), "SUPPLIERNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliernameList The collection of suppliername as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_NotInScope(Collection<String> suppliernameList) {
        doSetSuppliername_NotInScope(suppliernameList);
    }

    protected void doSetSuppliername_NotInScope(Collection<String> suppliernameList) {
        regINS(CK_NINS, cTL(suppliernameList), xgetCValueSuppliername(), "SUPPLIERNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)} <br>
     * <pre>e.g. setSuppliername_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param suppliername The value of suppliername as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSuppliername_LikeSearch(String suppliername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(suppliername), xgetCValueSuppliername(), "SUPPLIERNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSuppliername_NotLikeSearch(String suppliername, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(suppliername), xgetCValueSuppliername(), "SUPPLIERNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     * @param suppliername The value of suppliername as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSuppliername_PrefixSearch(String suppliername) {
        setSuppliername_LikeSearch(suppliername, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNull() { regSuppliername(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNullOrEmpty() { regSuppliername(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERNAME: {varchar(255)}
     */
    public void setSuppliername_IsNotNull() { regSuppliername(CK_ISNN, DOBJ); }

    protected void regSuppliername(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSuppliername(), "SUPPLIERNAME"); }
    protected abstract ConditionValue xgetCValueSuppliername();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_Equal(String rcvlimitdate) {
        doSetRcvlimitdate_Equal(fRES(rcvlimitdate));
    }

    protected void doSetRcvlimitdate_Equal(String rcvlimitdate) {
        regRcvlimitdate(CK_EQ, rcvlimitdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_NotEqual(String rcvlimitdate) {
        doSetRcvlimitdate_NotEqual(fRES(rcvlimitdate));
    }

    protected void doSetRcvlimitdate_NotEqual(String rcvlimitdate) {
        regRcvlimitdate(CK_NES, rcvlimitdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_GreaterThan(String rcvlimitdate) {
        regRcvlimitdate(CK_GT, fRES(rcvlimitdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_LessThan(String rcvlimitdate) {
        regRcvlimitdate(CK_LT, fRES(rcvlimitdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_GreaterEqual(String rcvlimitdate) {
        regRcvlimitdate(CK_GE, fRES(rcvlimitdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_LessEqual(String rcvlimitdate) {
        regRcvlimitdate(CK_LE, fRES(rcvlimitdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdateList The collection of rcvlimitdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_InScope(Collection<String> rcvlimitdateList) {
        doSetRcvlimitdate_InScope(rcvlimitdateList);
    }

    protected void doSetRcvlimitdate_InScope(Collection<String> rcvlimitdateList) {
        regINS(CK_INS, cTL(rcvlimitdateList), xgetCValueRcvlimitdate(), "RCVLIMITDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdateList The collection of rcvlimitdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_NotInScope(Collection<String> rcvlimitdateList) {
        doSetRcvlimitdate_NotInScope(rcvlimitdateList);
    }

    protected void doSetRcvlimitdate_NotInScope(Collection<String> rcvlimitdateList) {
        regINS(CK_NINS, cTL(rcvlimitdateList), xgetCValueRcvlimitdate(), "RCVLIMITDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)} <br>
     * <pre>e.g. setRcvlimitdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvlimitdate The value of rcvlimitdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvlimitdate_LikeSearch(String rcvlimitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvlimitdate), xgetCValueRcvlimitdate(), "RCVLIMITDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvlimitdate_NotLikeSearch(String rcvlimitdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvlimitdate), xgetCValueRcvlimitdate(), "RCVLIMITDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVLIMITDATE: {NotNull, varchar(255)}
     * @param rcvlimitdate The value of rcvlimitdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvlimitdate_PrefixSearch(String rcvlimitdate) {
        setRcvlimitdate_LikeSearch(rcvlimitdate, xcLSOPPre());
    }

    protected void regRcvlimitdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvlimitdate(), "RCVLIMITDATE"); }
    protected abstract ConditionValue xgetCValueRcvlimitdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_Equal(String rcvdesigncd) {
        doSetRcvdesigncd_Equal(fRES(rcvdesigncd));
    }

    protected void doSetRcvdesigncd_Equal(String rcvdesigncd) {
        regRcvdesigncd(CK_EQ, rcvdesigncd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_NotEqual(String rcvdesigncd) {
        doSetRcvdesigncd_NotEqual(fRES(rcvdesigncd));
    }

    protected void doSetRcvdesigncd_NotEqual(String rcvdesigncd) {
        regRcvdesigncd(CK_NES, rcvdesigncd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_GreaterThan(String rcvdesigncd) {
        regRcvdesigncd(CK_GT, fRES(rcvdesigncd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_LessThan(String rcvdesigncd) {
        regRcvdesigncd(CK_LT, fRES(rcvdesigncd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_GreaterEqual(String rcvdesigncd) {
        regRcvdesigncd(CK_GE, fRES(rcvdesigncd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_LessEqual(String rcvdesigncd) {
        regRcvdesigncd(CK_LE, fRES(rcvdesigncd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncdList The collection of rcvdesigncd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_InScope(Collection<String> rcvdesigncdList) {
        doSetRcvdesigncd_InScope(rcvdesigncdList);
    }

    protected void doSetRcvdesigncd_InScope(Collection<String> rcvdesigncdList) {
        regINS(CK_INS, cTL(rcvdesigncdList), xgetCValueRcvdesigncd(), "RCVDESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncdList The collection of rcvdesigncd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_NotInScope(Collection<String> rcvdesigncdList) {
        doSetRcvdesigncd_NotInScope(rcvdesigncdList);
    }

    protected void doSetRcvdesigncd_NotInScope(Collection<String> rcvdesigncdList) {
        regINS(CK_NINS, cTL(rcvdesigncdList), xgetCValueRcvdesigncd(), "RCVDESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDESIGNCD: {varchar(100)} <br>
     * <pre>e.g. setRcvdesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvdesigncd The value of rcvdesigncd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvdesigncd_LikeSearch(String rcvdesigncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvdesigncd), xgetCValueRcvdesigncd(), "RCVDESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvdesigncd_NotLikeSearch(String rcvdesigncd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvdesigncd), xgetCValueRcvdesigncd(), "RCVDESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     * @param rcvdesigncd The value of rcvdesigncd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvdesigncd_PrefixSearch(String rcvdesigncd) {
        setRcvdesigncd_LikeSearch(rcvdesigncd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     */
    public void setRcvdesigncd_IsNull() { regRcvdesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     */
    public void setRcvdesigncd_IsNullOrEmpty() { regRcvdesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVDESIGNCD: {varchar(100)}
     */
    public void setRcvdesigncd_IsNotNull() { regRcvdesigncd(CK_ISNN, DOBJ); }

    protected void regRcvdesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvdesigncd(), "RCVDESIGNCD"); }
    protected abstract ConditionValue xgetCValueRcvdesigncd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_Equal(String rcvqty) {
        doSetRcvqty_Equal(fRES(rcvqty));
    }

    protected void doSetRcvqty_Equal(String rcvqty) {
        regRcvqty(CK_EQ, rcvqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_NotEqual(String rcvqty) {
        doSetRcvqty_NotEqual(fRES(rcvqty));
    }

    protected void doSetRcvqty_NotEqual(String rcvqty) {
        regRcvqty(CK_NES, rcvqty);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_GreaterThan(String rcvqty) {
        regRcvqty(CK_GT, fRES(rcvqty));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_LessThan(String rcvqty) {
        regRcvqty(CK_LT, fRES(rcvqty));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_GreaterEqual(String rcvqty) {
        regRcvqty(CK_GE, fRES(rcvqty));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_LessEqual(String rcvqty) {
        regRcvqty(CK_LE, fRES(rcvqty));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqtyList The collection of rcvqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_InScope(Collection<String> rcvqtyList) {
        doSetRcvqty_InScope(rcvqtyList);
    }

    protected void doSetRcvqty_InScope(Collection<String> rcvqtyList) {
        regINS(CK_INS, cTL(rcvqtyList), xgetCValueRcvqty(), "RCVQTY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqtyList The collection of rcvqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_NotInScope(Collection<String> rcvqtyList) {
        doSetRcvqty_NotInScope(rcvqtyList);
    }

    protected void doSetRcvqty_NotInScope(Collection<String> rcvqtyList) {
        regINS(CK_NINS, cTL(rcvqtyList), xgetCValueRcvqty(), "RCVQTY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)} <br>
     * <pre>e.g. setRcvqty_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvqty The value of rcvqty as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvqty_LikeSearch(String rcvqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvqty), xgetCValueRcvqty(), "RCVQTY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvqty_NotLikeSearch(String rcvqty, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvqty), xgetCValueRcvqty(), "RCVQTY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCVQTY: {NotNull, varchar(4000)}
     * @param rcvqty The value of rcvqty as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_PrefixSearch(String rcvqty) {
        setRcvqty_LikeSearch(rcvqty, xcLSOPPre());
    }

    protected void regRcvqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvqty(), "RCVQTY"); }
    protected abstract ConditionValue xgetCValueRcvqty();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_Equal(String workdatetime) {
        doSetWorkdatetime_Equal(fRES(workdatetime));
    }

    protected void doSetWorkdatetime_Equal(String workdatetime) {
        regWorkdatetime(CK_EQ, workdatetime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_NotEqual(String workdatetime) {
        doSetWorkdatetime_NotEqual(fRES(workdatetime));
    }

    protected void doSetWorkdatetime_NotEqual(String workdatetime) {
        regWorkdatetime(CK_NES, workdatetime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_GreaterThan(String workdatetime) {
        regWorkdatetime(CK_GT, fRES(workdatetime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_LessThan(String workdatetime) {
        regWorkdatetime(CK_LT, fRES(workdatetime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_GreaterEqual(String workdatetime) {
        regWorkdatetime(CK_GE, fRES(workdatetime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_LessEqual(String workdatetime) {
        regWorkdatetime(CK_LE, fRES(workdatetime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetimeList The collection of workdatetime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_InScope(Collection<String> workdatetimeList) {
        doSetWorkdatetime_InScope(workdatetimeList);
    }

    protected void doSetWorkdatetime_InScope(Collection<String> workdatetimeList) {
        regINS(CK_INS, cTL(workdatetimeList), xgetCValueWorkdatetime(), "WORKDATETIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetimeList The collection of workdatetime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_NotInScope(Collection<String> workdatetimeList) {
        doSetWorkdatetime_NotInScope(workdatetimeList);
    }

    protected void doSetWorkdatetime_NotInScope(Collection<String> workdatetimeList) {
        regINS(CK_NINS, cTL(workdatetimeList), xgetCValueWorkdatetime(), "WORKDATETIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKDATETIME: {varchar(8)} <br>
     * <pre>e.g. setWorkdatetime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workdatetime The value of workdatetime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkdatetime_LikeSearch(String workdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workdatetime), xgetCValueWorkdatetime(), "WORKDATETIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkdatetime_NotLikeSearch(String workdatetime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workdatetime), xgetCValueWorkdatetime(), "WORKDATETIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     * @param workdatetime The value of workdatetime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkdatetime_PrefixSearch(String workdatetime) {
        setWorkdatetime_LikeSearch(workdatetime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     */
    public void setWorkdatetime_IsNull() { regWorkdatetime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     */
    public void setWorkdatetime_IsNullOrEmpty() { regWorkdatetime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORKDATETIME: {varchar(8)}
     */
    public void setWorkdatetime_IsNotNull() { regWorkdatetime(CK_ISNN, DOBJ); }

    protected void regWorkdatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkdatetime(), "WORKDATETIME"); }
    protected abstract ConditionValue xgetCValueWorkdatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_Equal(String loc) {
        doSetLoc_Equal(fRES(loc));
    }

    protected void doSetLoc_Equal(String loc) {
        regLoc(CK_EQ, loc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_NotEqual(String loc) {
        doSetLoc_NotEqual(fRES(loc));
    }

    protected void doSetLoc_NotEqual(String loc) {
        regLoc(CK_NES, loc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_GreaterThan(String loc) {
        regLoc(CK_GT, fRES(loc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_LessThan(String loc) {
        regLoc(CK_LT, fRES(loc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_GreaterEqual(String loc) {
        regLoc(CK_GE, fRES(loc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_LessEqual(String loc) {
        regLoc(CK_LE, fRES(loc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param locList The collection of loc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_InScope(Collection<String> locList) {
        doSetLoc_InScope(locList);
    }

    protected void doSetLoc_InScope(Collection<String> locList) {
        regINS(CK_INS, cTL(locList), xgetCValueLoc(), "LOC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param locList The collection of loc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_NotInScope(Collection<String> locList) {
        doSetLoc_NotInScope(locList);
    }

    protected void doSetLoc_NotInScope(Collection<String> locList) {
        regINS(CK_NINS, cTL(locList), xgetCValueLoc(), "LOC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLoc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loc The value of loc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoc_LikeSearch(String loc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loc), xgetCValueLoc(), "LOC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoc_NotLikeSearch(String loc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loc), xgetCValueLoc(), "LOC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOC: {NotNull, varchar(30)}
     * @param loc The value of loc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoc_PrefixSearch(String loc) {
        setLoc_LikeSearch(loc, xcLSOPPre());
    }

    protected void regLoc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoc(), "LOC"); }
    protected abstract ConditionValue xgetCValueLoc();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_Equal(String loccd) {
        doSetLoccd_Equal(fRES(loccd));
    }

    protected void doSetLoccd_Equal(String loccd) {
        regLoccd(CK_EQ, loccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotEqual(String loccd) {
        doSetLoccd_NotEqual(fRES(loccd));
    }

    protected void doSetLoccd_NotEqual(String loccd) {
        regLoccd(CK_NES, loccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_InScope(Collection<String> loccdList) {
        doSetLoccd_InScope(loccdList);
    }

    protected void doSetLoccd_InScope(Collection<String> loccdList) {
        regINS(CK_INS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccdList The collection of loccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_NotInScope(Collection<String> loccdList) {
        doSetLoccd_NotInScope(loccdList);
    }

    protected void doSetLoccd_NotInScope(Collection<String> loccdList) {
        regINS(CK_NINS, cTL(loccdList), xgetCValueLoccd(), "LOCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)} <br>
     * <pre>e.g. setLoccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param loccd The value of loccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLoccd_LikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNull() { regLoccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNullOrEmpty() { regLoccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCCD: {varchar(30)}
     */
    public void setLoccd_IsNotNull() { regLoccd(CK_ISNN, DOBJ); }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_Equal(String limitday) {
        doSetLimitday_Equal(fRES(limitday));
    }

    protected void doSetLimitday_Equal(String limitday) {
        regLimitday(CK_EQ, limitday);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_NotEqual(String limitday) {
        doSetLimitday_NotEqual(fRES(limitday));
    }

    protected void doSetLimitday_NotEqual(String limitday) {
        regLimitday(CK_NES, limitday);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_GreaterThan(String limitday) {
        regLimitday(CK_GT, fRES(limitday));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_LessThan(String limitday) {
        regLimitday(CK_LT, fRES(limitday));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_GreaterEqual(String limitday) {
        regLimitday(CK_GE, fRES(limitday));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_LessEqual(String limitday) {
        regLimitday(CK_LE, fRES(limitday));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitdayList The collection of limitday as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_InScope(Collection<String> limitdayList) {
        doSetLimitday_InScope(limitdayList);
    }

    protected void doSetLimitday_InScope(Collection<String> limitdayList) {
        regINS(CK_INS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitdayList The collection of limitday as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_NotInScope(Collection<String> limitdayList) {
        doSetLimitday_NotInScope(limitdayList);
    }

    protected void doSetLimitday_NotInScope(Collection<String> limitdayList) {
        regINS(CK_NINS, cTL(limitdayList), xgetCValueLimitday(), "LIMITDAY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)} <br>
     * <pre>e.g. setLimitday_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitday The value of limitday as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitday_LikeSearch(String limitday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitday), xgetCValueLimitday(), "LIMITDAY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitday_NotLikeSearch(String limitday, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitday), xgetCValueLimitday(), "LIMITDAY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDAY: {NotNull, varchar(8)}
     * @param limitday The value of limitday as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitday_PrefixSearch(String limitday) {
        setLimitday_LikeSearch(limitday, xcLSOPPre());
    }

    protected void regLimitday(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitday(), "LIMITDAY"); }
    protected abstract ConditionValue xgetCValueLimitday();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_Equal(String designcd) {
        doSetDesigncd_Equal(fRES(designcd));
    }

    protected void doSetDesigncd_Equal(String designcd) {
        regDesigncd(CK_EQ, designcd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotEqual(String designcd) {
        doSetDesigncd_NotEqual(fRES(designcd));
    }

    protected void doSetDesigncd_NotEqual(String designcd) {
        regDesigncd(CK_NES, designcd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterThan(String designcd) {
        regDesigncd(CK_GT, fRES(designcd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessThan(String designcd) {
        regDesigncd(CK_LT, fRES(designcd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_GreaterEqual(String designcd) {
        regDesigncd(CK_GE, fRES(designcd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_LessEqual(String designcd) {
        regDesigncd(CK_LE, fRES(designcd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_InScope(Collection<String> designcdList) {
        doSetDesigncd_InScope(designcdList);
    }

    protected void doSetDesigncd_InScope(Collection<String> designcdList) {
        regINS(CK_INS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcdList The collection of designcd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_NotInScope(Collection<String> designcdList) {
        doSetDesigncd_NotInScope(designcdList);
    }

    protected void doSetDesigncd_NotInScope(Collection<String> designcdList) {
        regINS(CK_NINS, cTL(designcdList), xgetCValueDesigncd(), "DESIGNCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)} <br>
     * <pre>e.g. setDesigncd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcd The value of designcd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncd_LikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncd_NotLikeSearch(String designcd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcd), xgetCValueDesigncd(), "DESIGNCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD: {varchar(30)}
     * @param designcd The value of designcd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncd_PrefixSearch(String designcd) {
        setDesigncd_LikeSearch(designcd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNull() { regDesigncd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNullOrEmpty() { regDesigncd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGNCD: {varchar(30)}
     */
    public void setDesigncd_IsNotNull() { regDesigncd(CK_ISNN, DOBJ); }

    protected void regDesigncd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncd(), "DESIGNCD"); }
    protected abstract ConditionValue xgetCValueDesigncd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_Equal(java.math.BigDecimal qtycase) {
        doSetQtycase_Equal(qtycase);
    }

    protected void doSetQtycase_Equal(java.math.BigDecimal qtycase) {
        regQtycase(CK_EQ, qtycase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_NotEqual(java.math.BigDecimal qtycase) {
        doSetQtycase_NotEqual(qtycase);
    }

    protected void doSetQtycase_NotEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_NES, qtycase);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_GT, qtycase);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessThan(java.math.BigDecimal qtycase) {
        regQtycase(CK_LT, qtycase);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_GreaterEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_GE, qtycase);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycase The value of qtycase as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtycase_LessEqual(java.math.BigDecimal qtycase) {
        regQtycase(CK_LE, qtycase);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtycase. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtycase_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtycase(), "QTYCASE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_InScope(qtycaseList);
    }

    protected void doSetQtycase_InScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_INS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYCASE: {NotNull, decimal(16, 6)}
     * @param qtycaseList The collection of qtycase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        doSetQtycase_NotInScope(qtycaseList);
    }

    protected void doSetQtycase_NotInScope(Collection<java.math.BigDecimal> qtycaseList) {
        regINS(CK_NINS, cTL(qtycaseList), xgetCValueQtycase(), "QTYCASE");
    }

    protected void regQtycase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtycase(), "QTYCASE"); }
    protected abstract ConditionValue xgetCValueQtycase();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_Equal(java.math.BigDecimal qtybowl) {
        doSetQtybowl_Equal(qtybowl);
    }

    protected void doSetQtybowl_Equal(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_EQ, qtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        doSetQtybowl_NotEqual(qtybowl);
    }

    protected void doSetQtybowl_NotEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_NES, qtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GT, qtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessThan(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LT, qtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_GreaterEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_GE, qtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowl The value of qtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQtybowl_LessEqual(java.math.BigDecimal qtybowl) {
        regQtybowl(CK_LE, qtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQtybowl_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQtybowl(), "QTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_InScope(qtybowlList);
    }

    protected void doSetQtybowl_InScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_INS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTYBOWL: {NotNull, decimal(16, 6)}
     * @param qtybowlList The collection of qtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        doSetQtybowl_NotInScope(qtybowlList);
    }

    protected void doSetQtybowl_NotInScope(Collection<java.math.BigDecimal> qtybowlList) {
        regINS(CK_NINS, cTL(qtybowlList), xgetCValueQtybowl(), "QTYBOWL");
    }

    protected void regQtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQtybowl(), "QTYBOWL"); }
    protected abstract ConditionValue xgetCValueQtybowl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_Equal(String flg) {
        doSetFlg_Equal(fRES(flg));
    }

    protected void doSetFlg_Equal(String flg) {
        regFlg(CK_EQ, flg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_NotEqual(String flg) {
        doSetFlg_NotEqual(fRES(flg));
    }

    protected void doSetFlg_NotEqual(String flg) {
        regFlg(CK_NES, flg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_GreaterThan(String flg) {
        regFlg(CK_GT, fRES(flg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_LessThan(String flg) {
        regFlg(CK_LT, fRES(flg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_GreaterEqual(String flg) {
        regFlg(CK_GE, fRES(flg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_LessEqual(String flg) {
        regFlg(CK_LE, fRES(flg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG: {char(1)}
     * @param flgList The collection of flg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_InScope(Collection<String> flgList) {
        doSetFlg_InScope(flgList);
    }

    protected void doSetFlg_InScope(Collection<String> flgList) {
        regINS(CK_INS, cTL(flgList), xgetCValueFlg(), "FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLG: {char(1)}
     * @param flgList The collection of flg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_NotInScope(Collection<String> flgList) {
        doSetFlg_NotInScope(flgList);
    }

    protected void doSetFlg_NotInScope(Collection<String> flgList) {
        regINS(CK_NINS, cTL(flgList), xgetCValueFlg(), "FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG: {char(1)} <br>
     * <pre>e.g. setFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param flg The value of flg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFlg_LikeSearch(String flg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(flg), xgetCValueFlg(), "FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFlg_NotLikeSearch(String flg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(flg), xgetCValueFlg(), "FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLG: {char(1)}
     * @param flg The value of flg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFlg_PrefixSearch(String flg) {
        setFlg_LikeSearch(flg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     */
    public void setFlg_IsNull() { regFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLG: {char(1)}
     */
    public void setFlg_IsNotNull() { regFlg(CK_ISNN, DOBJ); }

    protected void regFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFlg(), "FLG"); }
    protected abstract ConditionValue xgetCValueFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_Equal(String insideOutsideKbn) {
        doSetInsideOutsideKbn_Equal(fRES(insideOutsideKbn));
    }

    protected void doSetInsideOutsideKbn_Equal(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_EQ, insideOutsideKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_NotEqual(String insideOutsideKbn) {
        doSetInsideOutsideKbn_NotEqual(fRES(insideOutsideKbn));
    }

    protected void doSetInsideOutsideKbn_NotEqual(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_NES, insideOutsideKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_GreaterThan(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_GT, fRES(insideOutsideKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_LessThan(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_LT, fRES(insideOutsideKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_GreaterEqual(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_GE, fRES(insideOutsideKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_LessEqual(String insideOutsideKbn) {
        regInsideOutsideKbn(CK_LE, fRES(insideOutsideKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbnList The collection of insideOutsideKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_InScope(Collection<String> insideOutsideKbnList) {
        doSetInsideOutsideKbn_InScope(insideOutsideKbnList);
    }

    protected void doSetInsideOutsideKbn_InScope(Collection<String> insideOutsideKbnList) {
        regINS(CK_INS, cTL(insideOutsideKbnList), xgetCValueInsideOutsideKbn(), "INSIDE_OUTSIDE_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbnList The collection of insideOutsideKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_NotInScope(Collection<String> insideOutsideKbnList) {
        doSetInsideOutsideKbn_NotInScope(insideOutsideKbnList);
    }

    protected void doSetInsideOutsideKbn_NotInScope(Collection<String> insideOutsideKbnList) {
        regINS(CK_NINS, cTL(insideOutsideKbnList), xgetCValueInsideOutsideKbn(), "INSIDE_OUTSIDE_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)} <br>
     * <pre>e.g. setInsideOutsideKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param insideOutsideKbn The value of insideOutsideKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInsideOutsideKbn_LikeSearch(String insideOutsideKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(insideOutsideKbn), xgetCValueInsideOutsideKbn(), "INSIDE_OUTSIDE_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInsideOutsideKbn_NotLikeSearch(String insideOutsideKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(insideOutsideKbn), xgetCValueInsideOutsideKbn(), "INSIDE_OUTSIDE_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     * @param insideOutsideKbn The value of insideOutsideKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInsideOutsideKbn_PrefixSearch(String insideOutsideKbn) {
        setInsideOutsideKbn_LikeSearch(insideOutsideKbn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     */
    public void setInsideOutsideKbn_IsNull() { regInsideOutsideKbn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     */
    public void setInsideOutsideKbn_IsNullOrEmpty() { regInsideOutsideKbn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INSIDE_OUTSIDE_KBN: {varchar(60)}
     */
    public void setInsideOutsideKbn_IsNotNull() { regInsideOutsideKbn(CK_ISNN, DOBJ); }

    protected void regInsideOutsideKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInsideOutsideKbn(), "INSIDE_OUTSIDE_KBN"); }
    protected abstract ConditionValue xgetCValueInsideOutsideKbn();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_Equal(Long itemOrderby) {
        doSetItemOrderby_Equal(itemOrderby);
    }

    protected void doSetItemOrderby_Equal(Long itemOrderby) {
        regItemOrderby(CK_EQ, itemOrderby);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_NotEqual(Long itemOrderby) {
        doSetItemOrderby_NotEqual(itemOrderby);
    }

    protected void doSetItemOrderby_NotEqual(Long itemOrderby) {
        regItemOrderby(CK_NES, itemOrderby);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterThan(Long itemOrderby) {
        regItemOrderby(CK_GT, itemOrderby);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_LessThan(Long itemOrderby) {
        regItemOrderby(CK_LT, itemOrderby);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_GreaterEqual(Long itemOrderby) {
        regItemOrderby(CK_GE, itemOrderby);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderby The value of itemOrderby as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setItemOrderby_LessEqual(Long itemOrderby) {
        regItemOrderby(CK_LE, itemOrderby);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param minNumber The min number of itemOrderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of itemOrderby. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setItemOrderby_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueItemOrderby(), "ITEM_ORDERBY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderbyList The collection of itemOrderby as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_InScope(Collection<Long> itemOrderbyList) {
        doSetItemOrderby_InScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_InScope(Collection<Long> itemOrderbyList) {
        regINS(CK_INS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     * @param itemOrderbyList The collection of itemOrderby as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemOrderby_NotInScope(Collection<Long> itemOrderbyList) {
        doSetItemOrderby_NotInScope(itemOrderbyList);
    }

    protected void doSetItemOrderby_NotInScope(Collection<Long> itemOrderbyList) {
        regINS(CK_NINS, cTL(itemOrderbyList), xgetCValueItemOrderby(), "ITEM_ORDERBY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     */
    public void setItemOrderby_IsNull() { regItemOrderby(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ITEM_ORDERBY: {bigint(19)}
     */
    public void setItemOrderby_IsNotNull() { regItemOrderby(CK_ISNN, DOBJ); }

    protected void regItemOrderby(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemOrderby(), "ITEM_ORDERBY"); }
    protected abstract ConditionValue xgetCValueItemOrderby();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_Equal(Long printpageno) {
        doSetPrintpageno_Equal(printpageno);
    }

    protected void doSetPrintpageno_Equal(Long printpageno) {
        regPrintpageno(CK_EQ, printpageno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_NotEqual(Long printpageno) {
        doSetPrintpageno_NotEqual(printpageno);
    }

    protected void doSetPrintpageno_NotEqual(Long printpageno) {
        regPrintpageno(CK_NES, printpageno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterThan(Long printpageno) {
        regPrintpageno(CK_GT, printpageno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessThan(Long printpageno) {
        regPrintpageno(CK_LT, printpageno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterEqual(Long printpageno) {
        regPrintpageno(CK_GE, printpageno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpageno The value of printpageno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessEqual(Long printpageno) {
        regPrintpageno(CK_LE, printpageno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param minNumber The min number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintpageno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintpageno(), "PRINTPAGENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpagenoList The collection of printpageno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintpageno_InScope(Collection<Long> printpagenoList) {
        doSetPrintpageno_InScope(printpagenoList);
    }

    protected void doSetPrintpageno_InScope(Collection<Long> printpagenoList) {
        regINS(CK_INS, cTL(printpagenoList), xgetCValuePrintpageno(), "PRINTPAGENO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     * @param printpagenoList The collection of printpageno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        doSetPrintpageno_NotInScope(printpagenoList);
    }

    protected void doSetPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        regINS(CK_NINS, cTL(printpagenoList), xgetCValuePrintpageno(), "PRINTPAGENO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     */
    public void setPrintpageno_IsNull() { regPrintpageno(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTPAGENO: {bigint(19)}
     */
    public void setPrintpageno_IsNotNull() { regPrintpageno(CK_ISNN, DOBJ); }

    protected void regPrintpageno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintpageno(), "PRINTPAGENO"); }
    protected abstract ConditionValue xgetCValuePrintpageno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_Equal(java.math.BigDecimal seqsortkey) {
        doSetSeqsortkey_Equal(seqsortkey);
    }

    protected void doSetSeqsortkey_Equal(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_EQ, seqsortkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_NotEqual(java.math.BigDecimal seqsortkey) {
        doSetSeqsortkey_NotEqual(seqsortkey);
    }

    protected void doSetSeqsortkey_NotEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_NES, seqsortkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GT, seqsortkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LT, seqsortkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GE, seqsortkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LE, seqsortkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param minNumber The min number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqsortkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqsortkey(), "SEQSORTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkeyList The collection of seqsortkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqsortkey_InScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        doSetSeqsortkey_InScope(seqsortkeyList);
    }

    protected void doSetSeqsortkey_InScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        regINS(CK_INS, cTL(seqsortkeyList), xgetCValueSeqsortkey(), "SEQSORTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     * @param seqsortkeyList The collection of seqsortkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        doSetSeqsortkey_NotInScope(seqsortkeyList);
    }

    protected void doSetSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        regINS(CK_NINS, cTL(seqsortkeyList), xgetCValueSeqsortkey(), "SEQSORTKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     */
    public void setSeqsortkey_IsNull() { regSeqsortkey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEQSORTKEY: {decimal(16, 6)}
     */
    public void setSeqsortkey_IsNotNull() { regSeqsortkey(CK_ISNN, DOBJ); }

    protected void regSeqsortkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqsortkey(), "SEQSORTKEY"); }
    protected abstract ConditionValue xgetCValueSeqsortkey();

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
    public HpSLCFunction<WWkrcvreverseCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWkrcvreverseCB.class);
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
    public HpSLCFunction<WWkrcvreverseCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWkrcvreverseCB.class);
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
    public HpSLCFunction<WWkrcvreverseCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWkrcvreverseCB.class);
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
    public HpSLCFunction<WWkrcvreverseCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWkrcvreverseCB.class);
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
    public HpSLCFunction<WWkrcvreverseCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWkrcvreverseCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWkrcvreverseCB&gt;() {
     *     public void query(WWkrcvreverseCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWkrcvreverseCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWkrcvreverseCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWkrcvreverseCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWkrcvreverseCQ sq);

    protected WWkrcvreverseCB xcreateScalarConditionCB() {
        WWkrcvreverseCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWkrcvreverseCB xcreateScalarConditionPartitionByCB() {
        WWkrcvreverseCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WWkrcvreverseCB newMyCB() {
        return new WWkrcvreverseCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWkrcvreverseCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
