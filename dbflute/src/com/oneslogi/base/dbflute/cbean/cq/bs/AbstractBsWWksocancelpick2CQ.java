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
 * The abstract condition-query of W_WKSOCANCELPICK2.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWWksocancelpick2CQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWWksocancelpick2CQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_WKSOCANCELPICK2";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_Equal(Long printkey) {
        doSetPrintkey_Equal(printkey);
    }

    protected void doSetPrintkey_Equal(Long printkey) {
        regPrintkey(CK_EQ, printkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_NotEqual(Long printkey) {
        doSetPrintkey_NotEqual(printkey);
    }

    protected void doSetPrintkey_NotEqual(Long printkey) {
        regPrintkey(CK_NES, printkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterThan(Long printkey) {
        regPrintkey(CK_GT, printkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessThan(Long printkey) {
        regPrintkey(CK_LT, printkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_GreaterEqual(Long printkey) {
        regPrintkey(CK_GE, printkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkey The value of printkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintkey_LessEqual(Long printkey) {
        regPrintkey(CK_LE, printkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param minNumber The min number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintkey(), "PRINTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkeyList The collection of printkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_InScope(Collection<Long> printkeyList) {
        doSetPrintkey_InScope(printkeyList);
    }

    protected void doSetPrintkey_InScope(Collection<Long> printkeyList) {
        regINS(CK_INS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTKEY: {NotNull, bigint identity(19)}
     * @param printkeyList The collection of printkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintkey_NotInScope(Collection<Long> printkeyList) {
        doSetPrintkey_NotInScope(printkeyList);
    }

    protected void doSetPrintkey_NotInScope(Collection<Long> printkeyList) {
        regINS(CK_NINS, cTL(printkeyList), xgetCValuePrintkey(), "PRINTKEY");
    }

    protected void regPrintkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintkey(), "PRINTKEY"); }
    protected abstract ConditionValue xgetCValuePrintkey();

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
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_Equal(String warehouseSname) {
        doSetWarehouseSname_Equal(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_Equal(String warehouseSname) {
        regWarehouseSname(CK_EQ, warehouseSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotEqual(String warehouseSname) {
        doSetWarehouseSname_NotEqual(fRES(warehouseSname));
    }

    protected void doSetWarehouseSname_NotEqual(String warehouseSname) {
        regWarehouseSname(CK_NES, warehouseSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterThan(String warehouseSname) {
        regWarehouseSname(CK_GT, fRES(warehouseSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessThan(String warehouseSname) {
        regWarehouseSname(CK_LT, fRES(warehouseSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_GreaterEqual(String warehouseSname) {
        regWarehouseSname(CK_GE, fRES(warehouseSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_LessEqual(String warehouseSname) {
        regWarehouseSname(CK_LE, fRES(warehouseSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSnameList The collection of warehouseSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_InScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_InScope(Collection<String> warehouseSnameList) {
        regINS(CK_INS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSnameList The collection of warehouseSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        doSetWarehouseSname_NotInScope(warehouseSnameList);
    }

    protected void doSetWarehouseSname_NotInScope(Collection<String> warehouseSnameList) {
        regINS(CK_NINS, cTL(warehouseSnameList), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)} <br>
     * <pre>e.g. setWarehouseSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseSname The value of warehouseSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseSname_LikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseSname_NotLikeSearch(String warehouseSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseSname), xgetCValueWarehouseSname(), "WAREHOUSE_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_SNAME: {NotNull, varchar(100)}
     * @param warehouseSname The value of warehouseSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseSname_PrefixSearch(String warehouseSname) {
        setWarehouseSname_LikeSearch(warehouseSname, xcLSOPPre());
    }

    protected void regWarehouseSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseSname(), "WAREHOUSE_SNAME"); }
    protected abstract ConditionValue xgetCValueWarehouseSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_Equal(String pickeddate) {
        doSetPickeddate_Equal(fRES(pickeddate));
    }

    protected void doSetPickeddate_Equal(String pickeddate) {
        regPickeddate(CK_EQ, pickeddate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_NotEqual(String pickeddate) {
        doSetPickeddate_NotEqual(fRES(pickeddate));
    }

    protected void doSetPickeddate_NotEqual(String pickeddate) {
        regPickeddate(CK_NES, pickeddate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_GreaterThan(String pickeddate) {
        regPickeddate(CK_GT, fRES(pickeddate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_LessThan(String pickeddate) {
        regPickeddate(CK_LT, fRES(pickeddate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_GreaterEqual(String pickeddate) {
        regPickeddate(CK_GE, fRES(pickeddate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_LessEqual(String pickeddate) {
        regPickeddate(CK_LE, fRES(pickeddate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddateList The collection of pickeddate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_InScope(Collection<String> pickeddateList) {
        doSetPickeddate_InScope(pickeddateList);
    }

    protected void doSetPickeddate_InScope(Collection<String> pickeddateList) {
        regINS(CK_INS, cTL(pickeddateList), xgetCValuePickeddate(), "PICKEDDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddateList The collection of pickeddate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_NotInScope(Collection<String> pickeddateList) {
        doSetPickeddate_NotInScope(pickeddateList);
    }

    protected void doSetPickeddate_NotInScope(Collection<String> pickeddateList) {
        regINS(CK_NINS, cTL(pickeddateList), xgetCValuePickeddate(), "PICKEDDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)} <br>
     * <pre>e.g. setPickeddate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickeddate The value of pickeddate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickeddate_LikeSearch(String pickeddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickeddate), xgetCValuePickeddate(), "PICKEDDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickeddate_NotLikeSearch(String pickeddate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickeddate), xgetCValuePickeddate(), "PICKEDDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKEDDATE: {NotNull, varchar(8)}
     * @param pickeddate The value of pickeddate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickeddate_PrefixSearch(String pickeddate) {
        setPickeddate_LikeSearch(pickeddate, xcLSOPPre());
    }

    protected void regPickeddate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickeddate(), "PICKEDDATE"); }
    protected abstract ConditionValue xgetCValuePickeddate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_Equal(java.math.BigDecimal workallocateid) {
        doSetWorkallocateid_Equal(workallocateid);
    }

    protected void doSetWorkallocateid_Equal(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_EQ, workallocateid);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotEqual(java.math.BigDecimal workallocateid) {
        doSetWorkallocateid_NotEqual(workallocateid);
    }

    protected void doSetWorkallocateid_NotEqual(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_NES, workallocateid);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterThan(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_GT, workallocateid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessThan(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_LT, workallocateid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterEqual(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_GE, workallocateid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateid The value of workallocateid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessEqual(java.math.BigDecimal workallocateid) {
        regWorkallocateid(CK_LE, workallocateid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkallocateid_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkallocateid(), "WORKALLOCATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateidList The collection of workallocateid as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_InScope(Collection<java.math.BigDecimal> workallocateidList) {
        doSetWorkallocateid_InScope(workallocateidList);
    }

    protected void doSetWorkallocateid_InScope(Collection<java.math.BigDecimal> workallocateidList) {
        regINS(CK_INS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {NotNull, decimal(16, 6)}
     * @param workallocateidList The collection of workallocateid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotInScope(Collection<java.math.BigDecimal> workallocateidList) {
        doSetWorkallocateid_NotInScope(workallocateidList);
    }

    protected void doSetWorkallocateid_NotInScope(Collection<java.math.BigDecimal> workallocateidList) {
        regINS(CK_NINS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    protected void regWorkallocateid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocateid(), "WORKALLOCATEID"); }
    protected abstract ConditionValue xgetCValueWorkallocateid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
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
     * FLOOR: {NotNull, varchar(60)}
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
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
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
     * FLOOR: {NotNull, varchar(60)}
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
     * FLOOR: {NotNull, varchar(60)} <br>
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
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {NotNull, varchar(60)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
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
     * LOCCD: {NotNull, varchar(30)}
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
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterThan(String loccd) {
        regLoccd(CK_GT, fRES(loccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessThan(String loccd) {
        regLoccd(CK_LT, fRES(loccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_GreaterEqual(String loccd) {
        regLoccd(CK_GE, fRES(loccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_LessEqual(String loccd) {
        regLoccd(CK_LE, fRES(loccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
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
     * LOCCD: {NotNull, varchar(30)}
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
     * LOCCD: {NotNull, varchar(30)} <br>
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
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLoccd_NotLikeSearch(String loccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(loccd), xgetCValueLoccd(), "LOCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCCD: {NotNull, varchar(30)}
     * @param loccd The value of loccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLoccd_PrefixSearch(String loccd) {
        setLoccd_LikeSearch(loccd, xcLSOPPre());
    }

    protected void regLoccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLoccd(), "LOCCD"); }
    protected abstract ConditionValue xgetCValueLoccd();

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
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_Equal(String itemSname) {
        doSetItemSname_Equal(fRES(itemSname));
    }

    protected void doSetItemSname_Equal(String itemSname) {
        regItemSname(CK_EQ, itemSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_NotEqual(String itemSname) {
        doSetItemSname_NotEqual(fRES(itemSname));
    }

    protected void doSetItemSname_NotEqual(String itemSname) {
        regItemSname(CK_NES, itemSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_GreaterThan(String itemSname) {
        regItemSname(CK_GT, fRES(itemSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_LessThan(String itemSname) {
        regItemSname(CK_LT, fRES(itemSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_GreaterEqual(String itemSname) {
        regItemSname(CK_GE, fRES(itemSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_LessEqual(String itemSname) {
        regItemSname(CK_LE, fRES(itemSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSnameList The collection of itemSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_InScope(Collection<String> itemSnameList) {
        doSetItemSname_InScope(itemSnameList);
    }

    protected void doSetItemSname_InScope(Collection<String> itemSnameList) {
        regINS(CK_INS, cTL(itemSnameList), xgetCValueItemSname(), "ITEM_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSnameList The collection of itemSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_NotInScope(Collection<String> itemSnameList) {
        doSetItemSname_NotInScope(itemSnameList);
    }

    protected void doSetItemSname_NotInScope(Collection<String> itemSnameList) {
        regINS(CK_NINS, cTL(itemSnameList), xgetCValueItemSname(), "ITEM_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)} <br>
     * <pre>e.g. setItemSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSname The value of itemSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSname_LikeSearch(String itemSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSname), xgetCValueItemSname(), "ITEM_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSname_NotLikeSearch(String itemSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSname), xgetCValueItemSname(), "ITEM_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME: {NotNull, varchar(100)}
     * @param itemSname The value of itemSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSname_PrefixSearch(String itemSname) {
        setItemSname_LikeSearch(itemSname, xcLSOPPre());
    }

    protected void regItemSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSname(), "ITEM_SNAME"); }
    protected abstract ConditionValue xgetCValueItemSname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_Equal(String lot1) {
        doSetLot1_Equal(fRES(lot1));
    }

    protected void doSetLot1_Equal(String lot1) {
        regLot1(CK_EQ, lot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotEqual(String lot1) {
        doSetLot1_NotEqual(fRES(lot1));
    }

    protected void doSetLot1_NotEqual(String lot1) {
        regLot1(CK_NES, lot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterThan(String lot1) {
        regLot1(CK_GT, fRES(lot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessThan(String lot1) {
        regLot1(CK_LT, fRES(lot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_GreaterEqual(String lot1) {
        regLot1(CK_GE, fRES(lot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_LessEqual(String lot1) {
        regLot1(CK_LE, fRES(lot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_InScope(Collection<String> lot1List) {
        doSetLot1_InScope(lot1List);
    }

    protected void doSetLot1_InScope(Collection<String> lot1List) {
        regINS(CK_INS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1List The collection of lot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_NotInScope(Collection<String> lot1List) {
        doSetLot1_NotInScope(lot1List);
    }

    protected void doSetLot1_NotInScope(Collection<String> lot1List) {
        regINS(CK_NINS, cTL(lot1List), xgetCValueLot1(), "LOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)} <br>
     * <pre>e.g. setLot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lot1 The value of lot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLot1_LikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot1_NotLikeSearch(String lot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot1), xgetCValueLot1(), "LOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT1: {varchar(60)}
     * @param lot1 The value of lot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot1_PrefixSearch(String lot1) {
        setLot1_LikeSearch(lot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNull() { regLot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNullOrEmpty() { regLot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT1: {varchar(60)}
     */
    public void setLot1_IsNotNull() { regLot1(CK_ISNN, DOBJ); }

    protected void regLot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot1(), "LOT1"); }
    protected abstract ConditionValue xgetCValueLot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
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
     * LOT4: {NotNull, varchar(8)}
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
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterThan(String lot4) {
        regLot4(CK_GT, fRES(lot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessThan(String lot4) {
        regLot4(CK_LT, fRES(lot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_GreaterEqual(String lot4) {
        regLot4(CK_GE, fRES(lot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_LessEqual(String lot4) {
        regLot4(CK_LE, fRES(lot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
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
     * LOT4: {NotNull, varchar(8)}
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
     * LOT4: {NotNull, varchar(8)} <br>
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
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot4_NotLikeSearch(String lot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot4), xgetCValueLot4(), "LOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT4: {NotNull, varchar(8)}
     * @param lot4 The value of lot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot4_PrefixSearch(String lot4) {
        setLot4_LikeSearch(lot4, xcLSOPPre());
    }

    protected void regLot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot4(), "LOT4"); }
    protected abstract ConditionValue xgetCValueLot4();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_Equal(java.math.BigDecimal pickedqtyC) {
        doSetPickedqtyC_Equal(pickedqtyC);
    }

    protected void doSetPickedqtyC_Equal(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_EQ, pickedqtyC);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_NotEqual(java.math.BigDecimal pickedqtyC) {
        doSetPickedqtyC_NotEqual(pickedqtyC);
    }

    protected void doSetPickedqtyC_NotEqual(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_NES, pickedqtyC);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_GreaterThan(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_GT, pickedqtyC);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_LessThan(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_LT, pickedqtyC);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_GreaterEqual(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_GE, pickedqtyC);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyC The value of pickedqtyC as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC_LessEqual(java.math.BigDecimal pickedqtyC) {
        regPickedqtyC(CK_LE, pickedqtyC);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of pickedqtyC. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqtyC. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqtyC_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqtyC(), "PICKEDQTY_C", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyCList The collection of pickedqtyC as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyC_InScope(Collection<java.math.BigDecimal> pickedqtyCList) {
        doSetPickedqtyC_InScope(pickedqtyCList);
    }

    protected void doSetPickedqtyC_InScope(Collection<java.math.BigDecimal> pickedqtyCList) {
        regINS(CK_INS, cTL(pickedqtyCList), xgetCValuePickedqtyC(), "PICKEDQTY_C");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_C: {NotNull, decimal(16, 6)}
     * @param pickedqtyCList The collection of pickedqtyC as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyC_NotInScope(Collection<java.math.BigDecimal> pickedqtyCList) {
        doSetPickedqtyC_NotInScope(pickedqtyCList);
    }

    protected void doSetPickedqtyC_NotInScope(Collection<java.math.BigDecimal> pickedqtyCList) {
        regINS(CK_NINS, cTL(pickedqtyCList), xgetCValuePickedqtyC(), "PICKEDQTY_C");
    }

    protected void regPickedqtyC(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqtyC(), "PICKEDQTY_C"); }
    protected abstract ConditionValue xgetCValuePickedqtyC();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_Equal(java.math.BigDecimal pickedqtyB) {
        doSetPickedqtyB_Equal(pickedqtyB);
    }

    protected void doSetPickedqtyB_Equal(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_EQ, pickedqtyB);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_NotEqual(java.math.BigDecimal pickedqtyB) {
        doSetPickedqtyB_NotEqual(pickedqtyB);
    }

    protected void doSetPickedqtyB_NotEqual(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_NES, pickedqtyB);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_GreaterThan(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_GT, pickedqtyB);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_LessThan(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_LT, pickedqtyB);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_GreaterEqual(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_GE, pickedqtyB);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyB The value of pickedqtyB as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyB_LessEqual(java.math.BigDecimal pickedqtyB) {
        regPickedqtyB(CK_LE, pickedqtyB);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param minNumber The min number of pickedqtyB. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqtyB. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqtyB_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqtyB(), "PICKEDQTY_B", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyBList The collection of pickedqtyB as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyB_InScope(Collection<java.math.BigDecimal> pickedqtyBList) {
        doSetPickedqtyB_InScope(pickedqtyBList);
    }

    protected void doSetPickedqtyB_InScope(Collection<java.math.BigDecimal> pickedqtyBList) {
        regINS(CK_INS, cTL(pickedqtyBList), xgetCValuePickedqtyB(), "PICKEDQTY_B");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     * @param pickedqtyBList The collection of pickedqtyB as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyB_NotInScope(Collection<java.math.BigDecimal> pickedqtyBList) {
        doSetPickedqtyB_NotInScope(pickedqtyBList);
    }

    protected void doSetPickedqtyB_NotInScope(Collection<java.math.BigDecimal> pickedqtyBList) {
        regINS(CK_NINS, cTL(pickedqtyBList), xgetCValuePickedqtyB(), "PICKEDQTY_B");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     */
    public void setPickedqtyB_IsNull() { regPickedqtyB(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY_B: {decimal(16, 6)}
     */
    public void setPickedqtyB_IsNotNull() { regPickedqtyB(CK_ISNN, DOBJ); }

    protected void regPickedqtyB(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqtyB(), "PICKEDQTY_B"); }
    protected abstract ConditionValue xgetCValuePickedqtyB();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_Equal(java.math.BigDecimal pickedqtyP) {
        doSetPickedqtyP_Equal(pickedqtyP);
    }

    protected void doSetPickedqtyP_Equal(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_EQ, pickedqtyP);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_NotEqual(java.math.BigDecimal pickedqtyP) {
        doSetPickedqtyP_NotEqual(pickedqtyP);
    }

    protected void doSetPickedqtyP_NotEqual(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_NES, pickedqtyP);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_GreaterThan(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_GT, pickedqtyP);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_LessThan(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_LT, pickedqtyP);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_GreaterEqual(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_GE, pickedqtyP);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyP The value of pickedqtyP as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyP_LessEqual(java.math.BigDecimal pickedqtyP) {
        regPickedqtyP(CK_LE, pickedqtyP);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of pickedqtyP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqtyP. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqtyP_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqtyP(), "PICKEDQTY_P", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyPList The collection of pickedqtyP as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyP_InScope(Collection<java.math.BigDecimal> pickedqtyPList) {
        doSetPickedqtyP_InScope(pickedqtyPList);
    }

    protected void doSetPickedqtyP_InScope(Collection<java.math.BigDecimal> pickedqtyPList) {
        regINS(CK_INS, cTL(pickedqtyPList), xgetCValuePickedqtyP(), "PICKEDQTY_P");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_P: {NotNull, decimal(16, 6)}
     * @param pickedqtyPList The collection of pickedqtyP as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyP_NotInScope(Collection<java.math.BigDecimal> pickedqtyPList) {
        doSetPickedqtyP_NotInScope(pickedqtyPList);
    }

    protected void doSetPickedqtyP_NotInScope(Collection<java.math.BigDecimal> pickedqtyPList) {
        regINS(CK_NINS, cTL(pickedqtyPList), xgetCValuePickedqtyP(), "PICKEDQTY_P");
    }

    protected void regPickedqtyP(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqtyP(), "PICKEDQTY_P"); }
    protected abstract ConditionValue xgetCValuePickedqtyP();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_Equal(java.math.BigDecimal pickedqtyC2) {
        doSetPickedqtyC2_Equal(pickedqtyC2);
    }

    protected void doSetPickedqtyC2_Equal(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_EQ, pickedqtyC2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_NotEqual(java.math.BigDecimal pickedqtyC2) {
        doSetPickedqtyC2_NotEqual(pickedqtyC2);
    }

    protected void doSetPickedqtyC2_NotEqual(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_NES, pickedqtyC2);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_GreaterThan(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_GT, pickedqtyC2);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_LessThan(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_LT, pickedqtyC2);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_GreaterEqual(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_GE, pickedqtyC2);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2 The value of pickedqtyC2 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqtyC2_LessEqual(java.math.BigDecimal pickedqtyC2) {
        regPickedqtyC2(CK_LE, pickedqtyC2);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param minNumber The min number of pickedqtyC2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqtyC2. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqtyC2_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqtyC2(), "PICKEDQTY_C2", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2List The collection of pickedqtyC2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyC2_InScope(Collection<java.math.BigDecimal> pickedqtyC2List) {
        doSetPickedqtyC2_InScope(pickedqtyC2List);
    }

    protected void doSetPickedqtyC2_InScope(Collection<java.math.BigDecimal> pickedqtyC2List) {
        regINS(CK_INS, cTL(pickedqtyC2List), xgetCValuePickedqtyC2(), "PICKEDQTY_C2");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     * @param pickedqtyC2List The collection of pickedqtyC2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqtyC2_NotInScope(Collection<java.math.BigDecimal> pickedqtyC2List) {
        doSetPickedqtyC2_NotInScope(pickedqtyC2List);
    }

    protected void doSetPickedqtyC2_NotInScope(Collection<java.math.BigDecimal> pickedqtyC2List) {
        regINS(CK_NINS, cTL(pickedqtyC2List), xgetCValuePickedqtyC2(), "PICKEDQTY_C2");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     */
    public void setPickedqtyC2_IsNull() { regPickedqtyC2(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY_C2: {decimal(16, 6)}
     */
    public void setPickedqtyC2_IsNotNull() { regPickedqtyC2(CK_ISNN, DOBJ); }

    protected void regPickedqtyC2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqtyC2(), "PICKEDQTY_C2"); }
    protected abstract ConditionValue xgetCValuePickedqtyC2();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_Equal(Long usernum3) {
        doSetUsernum3_Equal(usernum3);
    }

    protected void doSetUsernum3_Equal(Long usernum3) {
        regUsernum3(CK_EQ, usernum3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_NotEqual(Long usernum3) {
        doSetUsernum3_NotEqual(usernum3);
    }

    protected void doSetUsernum3_NotEqual(Long usernum3) {
        regUsernum3(CK_NES, usernum3);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterThan(Long usernum3) {
        regUsernum3(CK_GT, usernum3);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessThan(Long usernum3) {
        regUsernum3(CK_LT, usernum3);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_GreaterEqual(Long usernum3) {
        regUsernum3(CK_GE, usernum3);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3 The value of usernum3 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setUsernum3_LessEqual(Long usernum3) {
        regUsernum3(CK_LE, usernum3);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param minNumber The min number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of usernum3. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setUsernum3_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueUsernum3(), "USERNUM3", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3List The collection of usernum3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_InScope(Collection<Long> usernum3List) {
        doSetUsernum3_InScope(usernum3List);
    }

    protected void doSetUsernum3_InScope(Collection<Long> usernum3List) {
        regINS(CK_INS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * USERNUM3: {NotNull, bigint(19)}
     * @param usernum3List The collection of usernum3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUsernum3_NotInScope(Collection<Long> usernum3List) {
        doSetUsernum3_NotInScope(usernum3List);
    }

    protected void doSetUsernum3_NotInScope(Collection<Long> usernum3List) {
        regINS(CK_NINS, cTL(usernum3List), xgetCValueUsernum3(), "USERNUM3");
    }

    protected void regUsernum3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUsernum3(), "USERNUM3"); }
    protected abstract ConditionValue xgetCValueUsernum3();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
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
     * PRINTPAGENO: {NotNull, bigint(19)}
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
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param printpageno The value of printpageno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterThan(Long printpageno) {
        regPrintpageno(CK_GT, printpageno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param printpageno The value of printpageno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessThan(Long printpageno) {
        regPrintpageno(CK_LT, printpageno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param printpageno The value of printpageno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_GreaterEqual(Long printpageno) {
        regPrintpageno(CK_GE, printpageno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param printpageno The value of printpageno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPrintpageno_LessEqual(Long printpageno) {
        regPrintpageno(CK_LE, printpageno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param minNumber The min number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of printpageno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPrintpageno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePrintpageno(), "PRINTPAGENO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRINTPAGENO: {NotNull, bigint(19)}
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
     * PRINTPAGENO: {NotNull, bigint(19)}
     * @param printpagenoList The collection of printpageno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        doSetPrintpageno_NotInScope(printpagenoList);
    }

    protected void doSetPrintpageno_NotInScope(Collection<Long> printpagenoList) {
        regINS(CK_NINS, cTL(printpagenoList), xgetCValuePrintpageno(), "PRINTPAGENO");
    }

    protected void regPrintpageno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrintpageno(), "PRINTPAGENO"); }
    protected abstract ConditionValue xgetCValuePrintpageno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
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
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
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
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GT, seqsortkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessThan(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LT, seqsortkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_GreaterEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_GE, seqsortkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param seqsortkey The value of seqsortkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqsortkey_LessEqual(java.math.BigDecimal seqsortkey) {
        regSeqsortkey(CK_LE, seqsortkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqsortkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqsortkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqsortkey(), "SEQSORTKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
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
     * SEQSORTKEY: {NotNull, decimal(16, 6)}
     * @param seqsortkeyList The collection of seqsortkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        doSetSeqsortkey_NotInScope(seqsortkeyList);
    }

    protected void doSetSeqsortkey_NotInScope(Collection<java.math.BigDecimal> seqsortkeyList) {
        regINS(CK_NINS, cTL(seqsortkeyList), xgetCValueSeqsortkey(), "SEQSORTKEY");
    }

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
    public HpSLCFunction<WWksocancelpick2CB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WWksocancelpick2CB.class);
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
    public HpSLCFunction<WWksocancelpick2CB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WWksocancelpick2CB.class);
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
    public HpSLCFunction<WWksocancelpick2CB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WWksocancelpick2CB.class);
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
    public HpSLCFunction<WWksocancelpick2CB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WWksocancelpick2CB.class);
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
    public HpSLCFunction<WWksocancelpick2CB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WWksocancelpick2CB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WWksocancelpick2CB&gt;() {
     *     public void query(WWksocancelpick2CB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WWksocancelpick2CB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WWksocancelpick2CB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WWksocancelpick2CB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WWksocancelpick2CQ sq);

    protected WWksocancelpick2CB xcreateScalarConditionCB() {
        WWksocancelpick2CB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WWksocancelpick2CB xcreateScalarConditionPartitionByCB() {
        WWksocancelpick2CB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected WWksocancelpick2CB newMyCB() {
        return new WWksocancelpick2CB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WWksocancelpick2CQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
