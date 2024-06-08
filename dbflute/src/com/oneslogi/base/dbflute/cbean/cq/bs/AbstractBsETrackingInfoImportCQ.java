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
 * The abstract condition-query of E_TRACKING_INFO_IMPORT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsETrackingInfoImportCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsETrackingInfoImportCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_TRACKING_INFO_IMPORT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_Equal(Long trackingInfoImportId) {
        doSetTrackingInfoImportId_Equal(trackingInfoImportId);
    }

    protected void doSetTrackingInfoImportId_Equal(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_EQ, trackingInfoImportId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_NotEqual(Long trackingInfoImportId) {
        doSetTrackingInfoImportId_NotEqual(trackingInfoImportId);
    }

    protected void doSetTrackingInfoImportId_NotEqual(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_NES, trackingInfoImportId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_GreaterThan(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_GT, trackingInfoImportId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_LessThan(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_LT, trackingInfoImportId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_GreaterEqual(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_GE, trackingInfoImportId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportId The value of trackingInfoImportId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_LessEqual(Long trackingInfoImportId) {
        regTrackingInfoImportId(CK_LE, trackingInfoImportId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trackingInfoImportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trackingInfoImportId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrackingInfoImportId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrackingInfoImportId(), "TRACKING_INFO_IMPORT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportIdList The collection of trackingInfoImportId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_InScope(Collection<Long> trackingInfoImportIdList) {
        doSetTrackingInfoImportId_InScope(trackingInfoImportIdList);
    }

    protected void doSetTrackingInfoImportId_InScope(Collection<Long> trackingInfoImportIdList) {
        regINS(CK_INS, cTL(trackingInfoImportIdList), xgetCValueTrackingInfoImportId(), "TRACKING_INFO_IMPORT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trackingInfoImportIdList The collection of trackingInfoImportId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrackingInfoImportId_NotInScope(Collection<Long> trackingInfoImportIdList) {
        doSetTrackingInfoImportId_NotInScope(trackingInfoImportIdList);
    }

    protected void doSetTrackingInfoImportId_NotInScope(Collection<Long> trackingInfoImportIdList) {
        regINS(CK_NINS, cTL(trackingInfoImportIdList), xgetCValueTrackingInfoImportId(), "TRACKING_INFO_IMPORT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrackingInfoImportId_IsNull() { regTrackingInfoImportId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACKING_INFO_IMPORT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrackingInfoImportId_IsNotNull() { regTrackingInfoImportId(CK_ISNN, DOBJ); }

    protected void regTrackingInfoImportId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrackingInfoImportId(), "TRACKING_INFO_IMPORT_ID"); }
    protected abstract ConditionValue xgetCValueTrackingInfoImportId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_Equal(Long symbolposkey) {
        doSetSymbolposkey_Equal(symbolposkey);
    }

    protected void doSetSymbolposkey_Equal(Long symbolposkey) {
        regSymbolposkey(CK_EQ, symbolposkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_NotEqual(Long symbolposkey) {
        doSetSymbolposkey_NotEqual(symbolposkey);
    }

    protected void doSetSymbolposkey_NotEqual(Long symbolposkey) {
        regSymbolposkey(CK_NES, symbolposkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_GreaterThan(Long symbolposkey) {
        regSymbolposkey(CK_GT, symbolposkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_LessThan(Long symbolposkey) {
        regSymbolposkey(CK_LT, symbolposkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_GreaterEqual(Long symbolposkey) {
        regSymbolposkey(CK_GE, symbolposkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkey The value of symbolposkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSymbolposkey_LessEqual(Long symbolposkey) {
        regSymbolposkey(CK_LE, symbolposkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of symbolposkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of symbolposkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSymbolposkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSymbolposkey(), "SYMBOLPOSKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkeyList The collection of symbolposkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolposkey_InScope(Collection<Long> symbolposkeyList) {
        doSetSymbolposkey_InScope(symbolposkeyList);
    }

    protected void doSetSymbolposkey_InScope(Collection<Long> symbolposkeyList) {
        regINS(CK_INS, cTL(symbolposkeyList), xgetCValueSymbolposkey(), "SYMBOLPOSKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SYMBOLPOSKEY: {NotNull, bigint(19)}
     * @param symbolposkeyList The collection of symbolposkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSymbolposkey_NotInScope(Collection<Long> symbolposkeyList) {
        doSetSymbolposkey_NotInScope(symbolposkeyList);
    }

    protected void doSetSymbolposkey_NotInScope(Collection<Long> symbolposkeyList) {
        regINS(CK_NINS, cTL(symbolposkeyList), xgetCValueSymbolposkey(), "SYMBOLPOSKEY");
    }

    protected void regSymbolposkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSymbolposkey(), "SYMBOLPOSKEY"); }
    protected abstract ConditionValue xgetCValueSymbolposkey();

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
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_Equal(String factorySname) {
        doSetFactorySname_Equal(fRES(factorySname));
    }

    protected void doSetFactorySname_Equal(String factorySname) {
        regFactorySname(CK_EQ, factorySname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_NotEqual(String factorySname) {
        doSetFactorySname_NotEqual(fRES(factorySname));
    }

    protected void doSetFactorySname_NotEqual(String factorySname) {
        regFactorySname(CK_NES, factorySname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_GreaterThan(String factorySname) {
        regFactorySname(CK_GT, fRES(factorySname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_LessThan(String factorySname) {
        regFactorySname(CK_LT, fRES(factorySname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_GreaterEqual(String factorySname) {
        regFactorySname(CK_GE, fRES(factorySname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_LessEqual(String factorySname) {
        regFactorySname(CK_LE, fRES(factorySname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySnameList The collection of factorySname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_InScope(Collection<String> factorySnameList) {
        doSetFactorySname_InScope(factorySnameList);
    }

    protected void doSetFactorySname_InScope(Collection<String> factorySnameList) {
        regINS(CK_INS, cTL(factorySnameList), xgetCValueFactorySname(), "FACTORY_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySnameList The collection of factorySname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_NotInScope(Collection<String> factorySnameList) {
        doSetFactorySname_NotInScope(factorySnameList);
    }

    protected void doSetFactorySname_NotInScope(Collection<String> factorySnameList) {
        regINS(CK_NINS, cTL(factorySnameList), xgetCValueFactorySname(), "FACTORY_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)} <br>
     * <pre>e.g. setFactorySname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorySname The value of factorySname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorySname_LikeSearch(String factorySname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorySname), xgetCValueFactorySname(), "FACTORY_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorySname_NotLikeSearch(String factorySname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorySname), xgetCValueFactorySname(), "FACTORY_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORY_SNAME: {NotNull, varchar(30)}
     * @param factorySname The value of factorySname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorySname_PrefixSearch(String factorySname) {
        setFactorySname_LikeSearch(factorySname, xcLSOPPre());
    }

    protected void regFactorySname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorySname(), "FACTORY_SNAME"); }
    protected abstract ConditionValue xgetCValueFactorySname();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_Equal(String factorycd) {
        doSetFactorycd_Equal(fRES(factorycd));
    }

    protected void doSetFactorycd_Equal(String factorycd) {
        regFactorycd(CK_EQ, factorycd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotEqual(String factorycd) {
        doSetFactorycd_NotEqual(fRES(factorycd));
    }

    protected void doSetFactorycd_NotEqual(String factorycd) {
        regFactorycd(CK_NES, factorycd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterThan(String factorycd) {
        regFactorycd(CK_GT, fRES(factorycd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessThan(String factorycd) {
        regFactorycd(CK_LT, fRES(factorycd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_GreaterEqual(String factorycd) {
        regFactorycd(CK_GE, fRES(factorycd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_LessEqual(String factorycd) {
        regFactorycd(CK_LE, fRES(factorycd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycdList The collection of factorycd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_InScope(Collection<String> factorycdList) {
        doSetFactorycd_InScope(factorycdList);
    }

    protected void doSetFactorycd_InScope(Collection<String> factorycdList) {
        regINS(CK_INS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycdList The collection of factorycd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_NotInScope(Collection<String> factorycdList) {
        doSetFactorycd_NotInScope(factorycdList);
    }

    protected void doSetFactorycd_NotInScope(Collection<String> factorycdList) {
        regINS(CK_NINS, cTL(factorycdList), xgetCValueFactorycd(), "FACTORYCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)} <br>
     * <pre>e.g. setFactorycd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param factorycd The value of factorycd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFactorycd_LikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFactorycd_NotLikeSearch(String factorycd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(factorycd), xgetCValueFactorycd(), "FACTORYCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FACTORYCD: {NotNull, varchar(100)}
     * @param factorycd The value of factorycd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFactorycd_PrefixSearch(String factorycd) {
        setFactorycd_LikeSearch(factorycd, xcLSOPPre());
    }

    protected void regFactorycd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFactorycd(), "FACTORYCD"); }
    protected abstract ConditionValue xgetCValueFactorycd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_Equal(String itemcdCase) {
        doSetItemcdCase_Equal(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_Equal(String itemcdCase) {
        regItemcdCase(CK_EQ, itemcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotEqual(String itemcdCase) {
        doSetItemcdCase_NotEqual(fRES(itemcdCase));
    }

    protected void doSetItemcdCase_NotEqual(String itemcdCase) {
        regItemcdCase(CK_NES, itemcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterThan(String itemcdCase) {
        regItemcdCase(CK_GT, fRES(itemcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessThan(String itemcdCase) {
        regItemcdCase(CK_LT, fRES(itemcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_GreaterEqual(String itemcdCase) {
        regItemcdCase(CK_GE, fRES(itemcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_LessEqual(String itemcdCase) {
        regItemcdCase(CK_LE, fRES(itemcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_InScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_InScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_InScope(Collection<String> itemcdCaseList) {
        regINS(CK_INS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCaseList The collection of itemcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        doSetItemcdCase_NotInScope(itemcdCaseList);
    }

    protected void doSetItemcdCase_NotInScope(Collection<String> itemcdCaseList) {
        regINS(CK_NINS, cTL(itemcdCaseList), xgetCValueItemcdCase(), "ITEMCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemcdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdCase The value of itemcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdCase_LikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdCase_NotLikeSearch(String itemcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdCase), xgetCValueItemcdCase(), "ITEMCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_CASE: {NotNull, varchar(30)}
     * @param itemcdCase The value of itemcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdCase_PrefixSearch(String itemcdCase) {
        setItemcdCase_LikeSearch(itemcdCase, xcLSOPPre());
    }

    protected void regItemcdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdCase(), "ITEMCD_CASE"); }
    protected abstract ConditionValue xgetCValueItemcdCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_Equal(String itemSnameCase) {
        doSetItemSnameCase_Equal(fRES(itemSnameCase));
    }

    protected void doSetItemSnameCase_Equal(String itemSnameCase) {
        regItemSnameCase(CK_EQ, itemSnameCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_NotEqual(String itemSnameCase) {
        doSetItemSnameCase_NotEqual(fRES(itemSnameCase));
    }

    protected void doSetItemSnameCase_NotEqual(String itemSnameCase) {
        regItemSnameCase(CK_NES, itemSnameCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_GreaterThan(String itemSnameCase) {
        regItemSnameCase(CK_GT, fRES(itemSnameCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_LessThan(String itemSnameCase) {
        regItemSnameCase(CK_LT, fRES(itemSnameCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_GreaterEqual(String itemSnameCase) {
        regItemSnameCase(CK_GE, fRES(itemSnameCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_LessEqual(String itemSnameCase) {
        regItemSnameCase(CK_LE, fRES(itemSnameCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCaseList The collection of itemSnameCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_InScope(Collection<String> itemSnameCaseList) {
        doSetItemSnameCase_InScope(itemSnameCaseList);
    }

    protected void doSetItemSnameCase_InScope(Collection<String> itemSnameCaseList) {
        regINS(CK_INS, cTL(itemSnameCaseList), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCaseList The collection of itemSnameCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_NotInScope(Collection<String> itemSnameCaseList) {
        doSetItemSnameCase_NotInScope(itemSnameCaseList);
    }

    protected void doSetItemSnameCase_NotInScope(Collection<String> itemSnameCaseList) {
        regINS(CK_NINS, cTL(itemSnameCaseList), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)} <br>
     * <pre>e.g. setItemSnameCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSnameCase The value of itemSnameCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSnameCase_LikeSearch(String itemSnameCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSnameCase), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSnameCase_NotLikeSearch(String itemSnameCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSnameCase), xgetCValueItemSnameCase(), "ITEM_SNAME_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_CASE: {NotNull, varchar(60)}
     * @param itemSnameCase The value of itemSnameCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameCase_PrefixSearch(String itemSnameCase) {
        setItemSnameCase_LikeSearch(itemSnameCase, xcLSOPPre());
    }

    protected void regItemSnameCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSnameCase(), "ITEM_SNAME_CASE"); }
    protected abstract ConditionValue xgetCValueItemSnameCase();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_Equal(String itemcdWh) {
        doSetItemcdWh_Equal(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_Equal(String itemcdWh) {
        regItemcdWh(CK_EQ, itemcdWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotEqual(String itemcdWh) {
        doSetItemcdWh_NotEqual(fRES(itemcdWh));
    }

    protected void doSetItemcdWh_NotEqual(String itemcdWh) {
        regItemcdWh(CK_NES, itemcdWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterThan(String itemcdWh) {
        regItemcdWh(CK_GT, fRES(itemcdWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessThan(String itemcdWh) {
        regItemcdWh(CK_LT, fRES(itemcdWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_GreaterEqual(String itemcdWh) {
        regItemcdWh(CK_GE, fRES(itemcdWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_LessEqual(String itemcdWh) {
        regItemcdWh(CK_LE, fRES(itemcdWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_InScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_InScope(itemcdWhList);
    }

    protected void doSetItemcdWh_InScope(Collection<String> itemcdWhList) {
        regINS(CK_INS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWhList The collection of itemcdWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        doSetItemcdWh_NotInScope(itemcdWhList);
    }

    protected void doSetItemcdWh_NotInScope(Collection<String> itemcdWhList) {
        regINS(CK_NINS, cTL(itemcdWhList), xgetCValueItemcdWh(), "ITEMCD_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)} <br>
     * <pre>e.g. setItemcdWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemcdWh The value of itemcdWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemcdWh_LikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemcdWh_NotLikeSearch(String itemcdWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemcdWh), xgetCValueItemcdWh(), "ITEMCD_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEMCD_WH: {NotNull, varchar(30)}
     * @param itemcdWh The value of itemcdWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemcdWh_PrefixSearch(String itemcdWh) {
        setItemcdWh_LikeSearch(itemcdWh, xcLSOPPre());
    }

    protected void regItemcdWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemcdWh(), "ITEMCD_WH"); }
    protected abstract ConditionValue xgetCValueItemcdWh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_Equal(String itemSnameWh) {
        doSetItemSnameWh_Equal(fRES(itemSnameWh));
    }

    protected void doSetItemSnameWh_Equal(String itemSnameWh) {
        regItemSnameWh(CK_EQ, itemSnameWh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_NotEqual(String itemSnameWh) {
        doSetItemSnameWh_NotEqual(fRES(itemSnameWh));
    }

    protected void doSetItemSnameWh_NotEqual(String itemSnameWh) {
        regItemSnameWh(CK_NES, itemSnameWh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_GreaterThan(String itemSnameWh) {
        regItemSnameWh(CK_GT, fRES(itemSnameWh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_LessThan(String itemSnameWh) {
        regItemSnameWh(CK_LT, fRES(itemSnameWh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_GreaterEqual(String itemSnameWh) {
        regItemSnameWh(CK_GE, fRES(itemSnameWh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_LessEqual(String itemSnameWh) {
        regItemSnameWh(CK_LE, fRES(itemSnameWh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWhList The collection of itemSnameWh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_InScope(Collection<String> itemSnameWhList) {
        doSetItemSnameWh_InScope(itemSnameWhList);
    }

    protected void doSetItemSnameWh_InScope(Collection<String> itemSnameWhList) {
        regINS(CK_INS, cTL(itemSnameWhList), xgetCValueItemSnameWh(), "ITEM_SNAME_WH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWhList The collection of itemSnameWh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_NotInScope(Collection<String> itemSnameWhList) {
        doSetItemSnameWh_NotInScope(itemSnameWhList);
    }

    protected void doSetItemSnameWh_NotInScope(Collection<String> itemSnameWhList) {
        regINS(CK_NINS, cTL(itemSnameWhList), xgetCValueItemSnameWh(), "ITEM_SNAME_WH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)} <br>
     * <pre>e.g. setItemSnameWh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param itemSnameWh The value of itemSnameWh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setItemSnameWh_LikeSearch(String itemSnameWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(itemSnameWh), xgetCValueItemSnameWh(), "ITEM_SNAME_WH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setItemSnameWh_NotLikeSearch(String itemSnameWh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(itemSnameWh), xgetCValueItemSnameWh(), "ITEM_SNAME_WH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ITEM_SNAME_WH: {NotNull, varchar(60)}
     * @param itemSnameWh The value of itemSnameWh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setItemSnameWh_PrefixSearch(String itemSnameWh) {
        setItemSnameWh_LikeSearch(itemSnameWh, xcLSOPPre());
    }

    protected void regItemSnameWh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueItemSnameWh(), "ITEM_SNAME_WH"); }
    protected abstract ConditionValue xgetCValueItemSnameWh();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_Equal(java.math.BigDecimal rcvkey) {
        doSetRcvkey_Equal(rcvkey);
    }

    protected void doSetRcvkey_Equal(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_EQ, rcvkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        doSetRcvkey_NotEqual(rcvkey);
    }

    protected void doSetRcvkey_NotEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_NES, rcvkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GT, rcvkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessThan(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LT, rcvkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_GreaterEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_GE, rcvkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkey The value of rcvkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvkey_LessEqual(java.math.BigDecimal rcvkey) {
        regRcvkey(CK_LE, rcvkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param minNumber The min number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvkey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvkey(), "RCVKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_InScope(rcvkeyList);
    }

    protected void doSetRcvkey_InScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_INS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVKEY: {NotNull, decimal(16, 6)}
     * @param rcvkeyList The collection of rcvkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        doSetRcvkey_NotInScope(rcvkeyList);
    }

    protected void doSetRcvkey_NotInScope(Collection<java.math.BigDecimal> rcvkeyList) {
        regINS(CK_NINS, cTL(rcvkeyList), xgetCValueRcvkey(), "RCVKEY");
    }

    protected void regRcvkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvkey(), "RCVKEY"); }
    protected abstract ConditionValue xgetCValueRcvkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_Equal(String machineno) {
        doSetMachineno_Equal(fRES(machineno));
    }

    protected void doSetMachineno_Equal(String machineno) {
        regMachineno(CK_EQ, machineno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotEqual(String machineno) {
        doSetMachineno_NotEqual(fRES(machineno));
    }

    protected void doSetMachineno_NotEqual(String machineno) {
        regMachineno(CK_NES, machineno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterThan(String machineno) {
        regMachineno(CK_GT, fRES(machineno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessThan(String machineno) {
        regMachineno(CK_LT, fRES(machineno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_GreaterEqual(String machineno) {
        regMachineno(CK_GE, fRES(machineno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_LessEqual(String machineno) {
        regMachineno(CK_LE, fRES(machineno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machinenoList The collection of machineno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_InScope(Collection<String> machinenoList) {
        doSetMachineno_InScope(machinenoList);
    }

    protected void doSetMachineno_InScope(Collection<String> machinenoList) {
        regINS(CK_INS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machinenoList The collection of machineno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_NotInScope(Collection<String> machinenoList) {
        doSetMachineno_NotInScope(machinenoList);
    }

    protected void doSetMachineno_NotInScope(Collection<String> machinenoList) {
        regINS(CK_NINS, cTL(machinenoList), xgetCValueMachineno(), "MACHINENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setMachineno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param machineno The value of machineno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMachineno_LikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMachineno_NotLikeSearch(String machineno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(machineno), xgetCValueMachineno(), "MACHINENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MACHINENO: {NotNull, varchar(30)}
     * @param machineno The value of machineno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMachineno_PrefixSearch(String machineno) {
        setMachineno_LikeSearch(machineno, xcLSOPPre());
    }

    protected void regMachineno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMachineno(), "MACHINENO"); }
    protected abstract ConditionValue xgetCValueMachineno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_Equal(String createno) {
        doSetCreateno_Equal(fRES(createno));
    }

    protected void doSetCreateno_Equal(String createno) {
        regCreateno(CK_EQ, createno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotEqual(String createno) {
        doSetCreateno_NotEqual(fRES(createno));
    }

    protected void doSetCreateno_NotEqual(String createno) {
        regCreateno(CK_NES, createno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterThan(String createno) {
        regCreateno(CK_GT, fRES(createno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessThan(String createno) {
        regCreateno(CK_LT, fRES(createno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_GreaterEqual(String createno) {
        regCreateno(CK_GE, fRES(createno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_LessEqual(String createno) {
        regCreateno(CK_LE, fRES(createno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createnoList The collection of createno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_InScope(Collection<String> createnoList) {
        doSetCreateno_InScope(createnoList);
    }

    protected void doSetCreateno_InScope(Collection<String> createnoList) {
        regINS(CK_INS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createnoList The collection of createno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_NotInScope(Collection<String> createnoList) {
        doSetCreateno_NotInScope(createnoList);
    }

    protected void doSetCreateno_NotInScope(Collection<String> createnoList) {
        regINS(CK_NINS, cTL(createnoList), xgetCValueCreateno(), "CREATENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {NotNull, varchar(30)} <br>
     * <pre>e.g. setCreateno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param createno The value of createno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCreateno_LikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCreateno_NotLikeSearch(String createno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(createno), xgetCValueCreateno(), "CREATENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CREATENO: {NotNull, varchar(30)}
     * @param createno The value of createno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCreateno_PrefixSearch(String createno) {
        setCreateno_LikeSearch(createno, xcLSOPPre());
    }

    protected void regCreateno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCreateno(), "CREATENO"); }
    protected abstract ConditionValue xgetCValueCreateno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_Equal(String limitdatenow) {
        doSetLimitdatenow_Equal(fRES(limitdatenow));
    }

    protected void doSetLimitdatenow_Equal(String limitdatenow) {
        regLimitdatenow(CK_EQ, limitdatenow);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_NotEqual(String limitdatenow) {
        doSetLimitdatenow_NotEqual(fRES(limitdatenow));
    }

    protected void doSetLimitdatenow_NotEqual(String limitdatenow) {
        regLimitdatenow(CK_NES, limitdatenow);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_GreaterThan(String limitdatenow) {
        regLimitdatenow(CK_GT, fRES(limitdatenow));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_LessThan(String limitdatenow) {
        regLimitdatenow(CK_LT, fRES(limitdatenow));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_GreaterEqual(String limitdatenow) {
        regLimitdatenow(CK_GE, fRES(limitdatenow));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_LessEqual(String limitdatenow) {
        regLimitdatenow(CK_LE, fRES(limitdatenow));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenowList The collection of limitdatenow as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_InScope(Collection<String> limitdatenowList) {
        doSetLimitdatenow_InScope(limitdatenowList);
    }

    protected void doSetLimitdatenow_InScope(Collection<String> limitdatenowList) {
        regINS(CK_INS, cTL(limitdatenowList), xgetCValueLimitdatenow(), "LIMITDATENOW");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenowList The collection of limitdatenow as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_NotInScope(Collection<String> limitdatenowList) {
        doSetLimitdatenow_NotInScope(limitdatenowList);
    }

    protected void doSetLimitdatenow_NotInScope(Collection<String> limitdatenowList) {
        regINS(CK_NINS, cTL(limitdatenowList), xgetCValueLimitdatenow(), "LIMITDATENOW");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)} <br>
     * <pre>e.g. setLimitdatenow_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitdatenow The value of limitdatenow as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitdatenow_LikeSearch(String limitdatenow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitdatenow), xgetCValueLimitdatenow(), "LIMITDATENOW", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitdatenow_NotLikeSearch(String limitdatenow, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitdatenow), xgetCValueLimitdatenow(), "LIMITDATENOW", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMITDATENOW: {NotNull, varchar(8)}
     * @param limitdatenow The value of limitdatenow as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitdatenow_PrefixSearch(String limitdatenow) {
        setLimitdatenow_LikeSearch(limitdatenow, xcLSOPPre());
    }

    protected void regLimitdatenow(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitdatenow(), "LIMITDATENOW"); }
    protected abstract ConditionValue xgetCValueLimitdatenow();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_Equal(String designcdCase) {
        doSetDesigncdCase_Equal(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_Equal(String designcdCase) {
        regDesigncdCase(CK_EQ, designcdCase);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotEqual(String designcdCase) {
        doSetDesigncdCase_NotEqual(fRES(designcdCase));
    }

    protected void doSetDesigncdCase_NotEqual(String designcdCase) {
        regDesigncdCase(CK_NES, designcdCase);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterThan(String designcdCase) {
        regDesigncdCase(CK_GT, fRES(designcdCase));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessThan(String designcdCase) {
        regDesigncdCase(CK_LT, fRES(designcdCase));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_GreaterEqual(String designcdCase) {
        regDesigncdCase(CK_GE, fRES(designcdCase));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_LessEqual(String designcdCase) {
        regDesigncdCase(CK_LE, fRES(designcdCase));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCaseList The collection of designcdCase as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_InScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_InScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_InScope(Collection<String> designcdCaseList) {
        regINS(CK_INS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCaseList The collection of designcdCase as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        doSetDesigncdCase_NotInScope(designcdCaseList);
    }

    protected void doSetDesigncdCase_NotInScope(Collection<String> designcdCaseList) {
        regINS(CK_NINS, cTL(designcdCaseList), xgetCValueDesigncdCase(), "DESIGNCD_CASE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)} <br>
     * <pre>e.g. setDesigncdCase_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designcdCase The value of designcdCase as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesigncdCase_LikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesigncdCase_NotLikeSearch(String designcdCase, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designcdCase), xgetCValueDesigncdCase(), "DESIGNCD_CASE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGNCD_CASE: {NotNull, varchar(30)}
     * @param designcdCase The value of designcdCase as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesigncdCase_PrefixSearch(String designcdCase) {
        setDesigncdCase_LikeSearch(designcdCase, xcLSOPPre());
    }

    protected void regDesigncdCase(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesigncdCase(), "DESIGNCD_CASE"); }
    protected abstract ConditionValue xgetCValueDesigncdCase();

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
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_Equal(String manufacturecd) {
        doSetManufacturecd_Equal(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_Equal(String manufacturecd) {
        regManufacturecd(CK_EQ, manufacturecd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotEqual(String manufacturecd) {
        doSetManufacturecd_NotEqual(fRES(manufacturecd));
    }

    protected void doSetManufacturecd_NotEqual(String manufacturecd) {
        regManufacturecd(CK_NES, manufacturecd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterThan(String manufacturecd) {
        regManufacturecd(CK_GT, fRES(manufacturecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessThan(String manufacturecd) {
        regManufacturecd(CK_LT, fRES(manufacturecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_GreaterEqual(String manufacturecd) {
        regManufacturecd(CK_GE, fRES(manufacturecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_LessEqual(String manufacturecd) {
        regManufacturecd(CK_LE, fRES(manufacturecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecdList The collection of manufacturecd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_InScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_InScope(manufacturecdList);
    }

    protected void doSetManufacturecd_InScope(Collection<String> manufacturecdList) {
        regINS(CK_INS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecdList The collection of manufacturecd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        doSetManufacturecd_NotInScope(manufacturecdList);
    }

    protected void doSetManufacturecd_NotInScope(Collection<String> manufacturecdList) {
        regINS(CK_NINS, cTL(manufacturecdList), xgetCValueManufacturecd(), "MANUFACTURECD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(60)} <br>
     * <pre>e.g. setManufacturecd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturecd The value of manufacturecd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturecd_LikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturecd_NotLikeSearch(String manufacturecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturecd), xgetCValueManufacturecd(), "MANUFACTURECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     * @param manufacturecd The value of manufacturecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturecd_PrefixSearch(String manufacturecd) {
        setManufacturecd_LikeSearch(manufacturecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     */
    public void setManufacturecd_IsNull() { regManufacturecd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     */
    public void setManufacturecd_IsNullOrEmpty() { regManufacturecd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTURECD: {varchar(60)}
     */
    public void setManufacturecd_IsNotNull() { regManufacturecd(CK_ISNN, DOBJ); }

    protected void regManufacturecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturecd(), "MANUFACTURECD"); }
    protected abstract ConditionValue xgetCValueManufacturecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_Equal(String otherlot1) {
        doSetOtherlot1_Equal(fRES(otherlot1));
    }

    protected void doSetOtherlot1_Equal(String otherlot1) {
        regOtherlot1(CK_EQ, otherlot1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotEqual(String otherlot1) {
        doSetOtherlot1_NotEqual(fRES(otherlot1));
    }

    protected void doSetOtherlot1_NotEqual(String otherlot1) {
        regOtherlot1(CK_NES, otherlot1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterThan(String otherlot1) {
        regOtherlot1(CK_GT, fRES(otherlot1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessThan(String otherlot1) {
        regOtherlot1(CK_LT, fRES(otherlot1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_GreaterEqual(String otherlot1) {
        regOtherlot1(CK_GE, fRES(otherlot1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_LessEqual(String otherlot1) {
        regOtherlot1(CK_LE, fRES(otherlot1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_InScope(Collection<String> otherlot1List) {
        doSetOtherlot1_InScope(otherlot1List);
    }

    protected void doSetOtherlot1_InScope(Collection<String> otherlot1List) {
        regINS(CK_INS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1List The collection of otherlot1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_NotInScope(Collection<String> otherlot1List) {
        doSetOtherlot1_NotInScope(otherlot1List);
    }

    protected void doSetOtherlot1_NotInScope(Collection<String> otherlot1List) {
        regINS(CK_NINS, cTL(otherlot1List), xgetCValueOtherlot1(), "OTHERLOT1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)} <br>
     * <pre>e.g. setOtherlot1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param otherlot1 The value of otherlot1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOtherlot1_LikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOtherlot1_NotLikeSearch(String otherlot1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(otherlot1), xgetCValueOtherlot1(), "OTHERLOT1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     * @param otherlot1 The value of otherlot1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOtherlot1_PrefixSearch(String otherlot1) {
        setOtherlot1_LikeSearch(otherlot1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNull() { regOtherlot1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNullOrEmpty() { regOtherlot1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERLOT1: {varchar(60)}
     */
    public void setOtherlot1_IsNotNull() { regOtherlot1(CK_ISNN, DOBJ); }

    protected void regOtherlot1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOtherlot1(), "OTHERLOT1"); }
    protected abstract ConditionValue xgetCValueOtherlot1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_Equal(String casecreatetype) {
        doSetCasecreatetype_Equal(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_Equal(String casecreatetype) {
        regCasecreatetype(CK_EQ, casecreatetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotEqual(String casecreatetype) {
        doSetCasecreatetype_NotEqual(fRES(casecreatetype));
    }

    protected void doSetCasecreatetype_NotEqual(String casecreatetype) {
        regCasecreatetype(CK_NES, casecreatetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterThan(String casecreatetype) {
        regCasecreatetype(CK_GT, fRES(casecreatetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessThan(String casecreatetype) {
        regCasecreatetype(CK_LT, fRES(casecreatetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_GreaterEqual(String casecreatetype) {
        regCasecreatetype(CK_GE, fRES(casecreatetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_LessEqual(String casecreatetype) {
        regCasecreatetype(CK_LE, fRES(casecreatetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_InScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_InScope(Collection<String> casecreatetypeList) {
        regINS(CK_INS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetypeList The collection of casecreatetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        doSetCasecreatetype_NotInScope(casecreatetypeList);
    }

    protected void doSetCasecreatetype_NotInScope(Collection<String> casecreatetypeList) {
        regINS(CK_NINS, cTL(casecreatetypeList), xgetCValueCasecreatetype(), "CASECREATETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)} <br>
     * <pre>e.g. setCasecreatetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecreatetype The value of casecreatetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecreatetype_LikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecreatetype_NotLikeSearch(String casecreatetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecreatetype), xgetCValueCasecreatetype(), "CASECREATETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     * @param casecreatetype The value of casecreatetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetype_PrefixSearch(String casecreatetype) {
        setCasecreatetype_LikeSearch(casecreatetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNull() { regCasecreatetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNullOrEmpty() { regCasecreatetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE: {varchar(30)}
     */
    public void setCasecreatetype_IsNotNull() { regCasecreatetype(CK_ISNN, DOBJ); }

    protected void regCasecreatetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecreatetype(), "CASECREATETYPE"); }
    protected abstract ConditionValue xgetCValueCasecreatetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_Equal(String casecreatetypeNm) {
        doSetCasecreatetypeNm_Equal(fRES(casecreatetypeNm));
    }

    protected void doSetCasecreatetypeNm_Equal(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_EQ, casecreatetypeNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_NotEqual(String casecreatetypeNm) {
        doSetCasecreatetypeNm_NotEqual(fRES(casecreatetypeNm));
    }

    protected void doSetCasecreatetypeNm_NotEqual(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_NES, casecreatetypeNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_GreaterThan(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_GT, fRES(casecreatetypeNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_LessThan(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_LT, fRES(casecreatetypeNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_GreaterEqual(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_GE, fRES(casecreatetypeNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_LessEqual(String casecreatetypeNm) {
        regCasecreatetypeNm(CK_LE, fRES(casecreatetypeNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNmList The collection of casecreatetypeNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_InScope(Collection<String> casecreatetypeNmList) {
        doSetCasecreatetypeNm_InScope(casecreatetypeNmList);
    }

    protected void doSetCasecreatetypeNm_InScope(Collection<String> casecreatetypeNmList) {
        regINS(CK_INS, cTL(casecreatetypeNmList), xgetCValueCasecreatetypeNm(), "CASECREATETYPE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNmList The collection of casecreatetypeNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_NotInScope(Collection<String> casecreatetypeNmList) {
        doSetCasecreatetypeNm_NotInScope(casecreatetypeNmList);
    }

    protected void doSetCasecreatetypeNm_NotInScope(Collection<String> casecreatetypeNmList) {
        regINS(CK_NINS, cTL(casecreatetypeNmList), xgetCValueCasecreatetypeNm(), "CASECREATETYPE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)} <br>
     * <pre>e.g. setCasecreatetypeNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecreatetypeNm The value of casecreatetypeNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecreatetypeNm_LikeSearch(String casecreatetypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecreatetypeNm), xgetCValueCasecreatetypeNm(), "CASECREATETYPE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecreatetypeNm_NotLikeSearch(String casecreatetypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecreatetypeNm), xgetCValueCasecreatetypeNm(), "CASECREATETYPE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     * @param casecreatetypeNm The value of casecreatetypeNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecreatetypeNm_PrefixSearch(String casecreatetypeNm) {
        setCasecreatetypeNm_LikeSearch(casecreatetypeNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     */
    public void setCasecreatetypeNm_IsNull() { regCasecreatetypeNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     */
    public void setCasecreatetypeNm_IsNullOrEmpty() { regCasecreatetypeNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECREATETYPE_NM: {varchar(60)}
     */
    public void setCasecreatetypeNm_IsNotNull() { regCasecreatetypeNm(CK_ISNN, DOBJ); }

    protected void regCasecreatetypeNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecreatetypeNm(), "CASECREATETYPE_NM"); }
    protected abstract ConditionValue xgetCValueCasecreatetypeNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_Equal(String receivedate) {
        doSetReceivedate_Equal(fRES(receivedate));
    }

    protected void doSetReceivedate_Equal(String receivedate) {
        regReceivedate(CK_EQ, receivedate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotEqual(String receivedate) {
        doSetReceivedate_NotEqual(fRES(receivedate));
    }

    protected void doSetReceivedate_NotEqual(String receivedate) {
        regReceivedate(CK_NES, receivedate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterThan(String receivedate) {
        regReceivedate(CK_GT, fRES(receivedate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessThan(String receivedate) {
        regReceivedate(CK_LT, fRES(receivedate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_GreaterEqual(String receivedate) {
        regReceivedate(CK_GE, fRES(receivedate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_LessEqual(String receivedate) {
        regReceivedate(CK_LE, fRES(receivedate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_InScope(Collection<String> receivedateList) {
        doSetReceivedate_InScope(receivedateList);
    }

    protected void doSetReceivedate_InScope(Collection<String> receivedateList) {
        regINS(CK_INS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedateList The collection of receivedate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_NotInScope(Collection<String> receivedateList) {
        doSetReceivedate_NotInScope(receivedateList);
    }

    protected void doSetReceivedate_NotInScope(Collection<String> receivedateList) {
        regINS(CK_NINS, cTL(receivedateList), xgetCValueReceivedate(), "RECEIVEDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)} <br>
     * <pre>e.g. setReceivedate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivedate The value of receivedate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivedate_LikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivedate_NotLikeSearch(String receivedate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivedate), xgetCValueReceivedate(), "RECEIVEDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     * @param receivedate The value of receivedate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivedate_PrefixSearch(String receivedate) {
        setReceivedate_LikeSearch(receivedate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNull() { regReceivedate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNullOrEmpty() { regReceivedate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVEDATE: {varchar(8)}
     */
    public void setReceivedate_IsNotNull() { regReceivedate(CK_ISNN, DOBJ); }

    protected void regReceivedate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivedate(), "RECEIVEDATE"); }
    protected abstract ConditionValue xgetCValueReceivedate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_Equal(String arrivalportdate) {
        doSetArrivalportdate_Equal(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_Equal(String arrivalportdate) {
        regArrivalportdate(CK_EQ, arrivalportdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotEqual(String arrivalportdate) {
        doSetArrivalportdate_NotEqual(fRES(arrivalportdate));
    }

    protected void doSetArrivalportdate_NotEqual(String arrivalportdate) {
        regArrivalportdate(CK_NES, arrivalportdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterThan(String arrivalportdate) {
        regArrivalportdate(CK_GT, fRES(arrivalportdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessThan(String arrivalportdate) {
        regArrivalportdate(CK_LT, fRES(arrivalportdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_GreaterEqual(String arrivalportdate) {
        regArrivalportdate(CK_GE, fRES(arrivalportdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_LessEqual(String arrivalportdate) {
        regArrivalportdate(CK_LE, fRES(arrivalportdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdateList The collection of arrivalportdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_InScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_InScope(Collection<String> arrivalportdateList) {
        regINS(CK_INS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdateList The collection of arrivalportdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        doSetArrivalportdate_NotInScope(arrivalportdateList);
    }

    protected void doSetArrivalportdate_NotInScope(Collection<String> arrivalportdateList) {
        regINS(CK_NINS, cTL(arrivalportdateList), xgetCValueArrivalportdate(), "ARRIVALPORTDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)} <br>
     * <pre>e.g. setArrivalportdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param arrivalportdate The value of arrivalportdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setArrivalportdate_LikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setArrivalportdate_NotLikeSearch(String arrivalportdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(arrivalportdate), xgetCValueArrivalportdate(), "ARRIVALPORTDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     * @param arrivalportdate The value of arrivalportdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setArrivalportdate_PrefixSearch(String arrivalportdate) {
        setArrivalportdate_LikeSearch(arrivalportdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNull() { regArrivalportdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNullOrEmpty() { regArrivalportdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ARRIVALPORTDATE: {varchar(8)}
     */
    public void setArrivalportdate_IsNotNull() { regArrivalportdate(CK_ISNN, DOBJ); }

    protected void regArrivalportdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueArrivalportdate(), "ARRIVALPORTDATE"); }
    protected abstract ConditionValue xgetCValueArrivalportdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_Equal(String shipname) {
        doSetShipname_Equal(fRES(shipname));
    }

    protected void doSetShipname_Equal(String shipname) {
        regShipname(CK_EQ, shipname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotEqual(String shipname) {
        doSetShipname_NotEqual(fRES(shipname));
    }

    protected void doSetShipname_NotEqual(String shipname) {
        regShipname(CK_NES, shipname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterThan(String shipname) {
        regShipname(CK_GT, fRES(shipname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessThan(String shipname) {
        regShipname(CK_LT, fRES(shipname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_GreaterEqual(String shipname) {
        regShipname(CK_GE, fRES(shipname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_LessEqual(String shipname) {
        regShipname(CK_LE, fRES(shipname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipnameList The collection of shipname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_InScope(Collection<String> shipnameList) {
        doSetShipname_InScope(shipnameList);
    }

    protected void doSetShipname_InScope(Collection<String> shipnameList) {
        regINS(CK_INS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipnameList The collection of shipname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_NotInScope(Collection<String> shipnameList) {
        doSetShipname_NotInScope(shipnameList);
    }

    protected void doSetShipname_NotInScope(Collection<String> shipnameList) {
        regINS(CK_NINS, cTL(shipnameList), xgetCValueShipname(), "SHIPNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)} <br>
     * <pre>e.g. setShipname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipname The value of shipname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipname_LikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipname_NotLikeSearch(String shipname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipname), xgetCValueShipname(), "SHIPNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPNAME: {varchar(100)}
     * @param shipname The value of shipname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipname_PrefixSearch(String shipname) {
        setShipname_LikeSearch(shipname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNull() { regShipname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNullOrEmpty() { regShipname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPNAME: {varchar(100)}
     */
    public void setShipname_IsNotNull() { regShipname(CK_ISNN, DOBJ); }

    protected void regShipname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipname(), "SHIPNAME"); }
    protected abstract ConditionValue xgetCValueShipname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_Equal(Long initnum) {
        doSetInitnum_Equal(initnum);
    }

    protected void doSetInitnum_Equal(Long initnum) {
        regInitnum(CK_EQ, initnum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_NotEqual(Long initnum) {
        doSetInitnum_NotEqual(initnum);
    }

    protected void doSetInitnum_NotEqual(Long initnum) {
        regInitnum(CK_NES, initnum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterThan(Long initnum) {
        regInitnum(CK_GT, initnum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessThan(Long initnum) {
        regInitnum(CK_LT, initnum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_GreaterEqual(Long initnum) {
        regInitnum(CK_GE, initnum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnum The value of initnum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInitnum_LessEqual(Long initnum) {
        regInitnum(CK_LE, initnum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param minNumber The min number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of initnum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInitnum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInitnum(), "INITNUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_InScope(Collection<Long> initnumList) {
        doSetInitnum_InScope(initnumList);
    }

    protected void doSetInitnum_InScope(Collection<Long> initnumList) {
        regINS(CK_INS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INITNUM: {bigint(19)}
     * @param initnumList The collection of initnum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInitnum_NotInScope(Collection<Long> initnumList) {
        doSetInitnum_NotInScope(initnumList);
    }

    protected void doSetInitnum_NotInScope(Collection<Long> initnumList) {
        regINS(CK_NINS, cTL(initnumList), xgetCValueInitnum(), "INITNUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNull() { regInitnum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INITNUM: {bigint(19)}
     */
    public void setInitnum_IsNotNull() { regInitnum(CK_ISNN, DOBJ); }

    protected void regInitnum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInitnum(), "INITNUM"); }
    protected abstract ConditionValue xgetCValueInitnum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_Equal(String mixedflg) {
        doSetMixedflg_Equal(fRES(mixedflg));
    }

    protected void doSetMixedflg_Equal(String mixedflg) {
        regMixedflg(CK_EQ, mixedflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotEqual(String mixedflg) {
        doSetMixedflg_NotEqual(fRES(mixedflg));
    }

    protected void doSetMixedflg_NotEqual(String mixedflg) {
        regMixedflg(CK_NES, mixedflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterThan(String mixedflg) {
        regMixedflg(CK_GT, fRES(mixedflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessThan(String mixedflg) {
        regMixedflg(CK_LT, fRES(mixedflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_GreaterEqual(String mixedflg) {
        regMixedflg(CK_GE, fRES(mixedflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_LessEqual(String mixedflg) {
        regMixedflg(CK_LE, fRES(mixedflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_InScope(Collection<String> mixedflgList) {
        doSetMixedflg_InScope(mixedflgList);
    }

    protected void doSetMixedflg_InScope(Collection<String> mixedflgList) {
        regINS(CK_INS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflgList The collection of mixedflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_NotInScope(Collection<String> mixedflgList) {
        doSetMixedflg_NotInScope(mixedflgList);
    }

    protected void doSetMixedflg_NotInScope(Collection<String> mixedflgList) {
        regINS(CK_NINS, cTL(mixedflgList), xgetCValueMixedflg(), "MIXEDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)} <br>
     * <pre>e.g. setMixedflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param mixedflg The value of mixedflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMixedflg_LikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMixedflg_NotLikeSearch(String mixedflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(mixedflg), xgetCValueMixedflg(), "MIXEDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MIXEDFLG: {char(1)}
     * @param mixedflg The value of mixedflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMixedflg_PrefixSearch(String mixedflg) {
        setMixedflg_LikeSearch(mixedflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNull() { regMixedflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MIXEDFLG: {char(1)}
     */
    public void setMixedflg_IsNotNull() { regMixedflg(CK_ISNN, DOBJ); }

    protected void regMixedflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMixedflg(), "MIXEDFLG"); }
    protected abstract ConditionValue xgetCValueMixedflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_Equal(String lendflg) {
        doSetLendflg_Equal(fRES(lendflg));
    }

    protected void doSetLendflg_Equal(String lendflg) {
        regLendflg(CK_EQ, lendflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_NotEqual(String lendflg) {
        doSetLendflg_NotEqual(fRES(lendflg));
    }

    protected void doSetLendflg_NotEqual(String lendflg) {
        regLendflg(CK_NES, lendflg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_GreaterThan(String lendflg) {
        regLendflg(CK_GT, fRES(lendflg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_LessThan(String lendflg) {
        regLendflg(CK_LT, fRES(lendflg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_GreaterEqual(String lendflg) {
        regLendflg(CK_GE, fRES(lendflg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_LessEqual(String lendflg) {
        regLendflg(CK_LE, fRES(lendflg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflgList The collection of lendflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_InScope(Collection<String> lendflgList) {
        doSetLendflg_InScope(lendflgList);
    }

    protected void doSetLendflg_InScope(Collection<String> lendflgList) {
        regINS(CK_INS, cTL(lendflgList), xgetCValueLendflg(), "LENDFLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflgList The collection of lendflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_NotInScope(Collection<String> lendflgList) {
        doSetLendflg_NotInScope(lendflgList);
    }

    protected void doSetLendflg_NotInScope(Collection<String> lendflgList) {
        regINS(CK_NINS, cTL(lendflgList), xgetCValueLendflg(), "LENDFLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)} <br>
     * <pre>e.g. setLendflg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lendflg The value of lendflg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLendflg_LikeSearch(String lendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lendflg), xgetCValueLendflg(), "LENDFLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLendflg_NotLikeSearch(String lendflg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lendflg), xgetCValueLendflg(), "LENDFLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LENDFLG: {char(1)}
     * @param lendflg The value of lendflg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLendflg_PrefixSearch(String lendflg) {
        setLendflg_LikeSearch(lendflg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     */
    public void setLendflg_IsNull() { regLendflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LENDFLG: {char(1)}
     */
    public void setLendflg_IsNotNull() { regLendflg(CK_ISNN, DOBJ); }

    protected void regLendflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLendflg(), "LENDFLG"); }
    protected abstract ConditionValue xgetCValueLendflg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_Equal(String locgroup) {
        doSetLocgroup_Equal(fRES(locgroup));
    }

    protected void doSetLocgroup_Equal(String locgroup) {
        regLocgroup(CK_EQ, locgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotEqual(String locgroup) {
        doSetLocgroup_NotEqual(fRES(locgroup));
    }

    protected void doSetLocgroup_NotEqual(String locgroup) {
        regLocgroup(CK_NES, locgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterThan(String locgroup) {
        regLocgroup(CK_GT, fRES(locgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessThan(String locgroup) {
        regLocgroup(CK_LT, fRES(locgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_GreaterEqual(String locgroup) {
        regLocgroup(CK_GE, fRES(locgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_LessEqual(String locgroup) {
        regLocgroup(CK_LE, fRES(locgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroupList The collection of locgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_InScope(Collection<String> locgroupList) {
        doSetLocgroup_InScope(locgroupList);
    }

    protected void doSetLocgroup_InScope(Collection<String> locgroupList) {
        regINS(CK_INS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroupList The collection of locgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_NotInScope(Collection<String> locgroupList) {
        doSetLocgroup_NotInScope(locgroupList);
    }

    protected void doSetLocgroup_NotInScope(Collection<String> locgroupList) {
        regINS(CK_NINS, cTL(locgroupList), xgetCValueLocgroup(), "LOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)} <br>
     * <pre>e.g. setLocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locgroup The value of locgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocgroup_LikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocgroup_NotLikeSearch(String locgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locgroup), xgetCValueLocgroup(), "LOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCGROUP: {varchar(30)}
     * @param locgroup The value of locgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocgroup_PrefixSearch(String locgroup) {
        setLocgroup_LikeSearch(locgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNull() { regLocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNullOrEmpty() { regLocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCGROUP: {varchar(30)}
     */
    public void setLocgroup_IsNotNull() { regLocgroup(CK_ISNN, DOBJ); }

    protected void regLocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocgroup(), "LOCGROUP"); }
    protected abstract ConditionValue xgetCValueLocgroup();

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
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_Equal(String shipdate) {
        doSetShipdate_Equal(fRES(shipdate));
    }

    protected void doSetShipdate_Equal(String shipdate) {
        regShipdate(CK_EQ, shipdate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotEqual(String shipdate) {
        doSetShipdate_NotEqual(fRES(shipdate));
    }

    protected void doSetShipdate_NotEqual(String shipdate) {
        regShipdate(CK_NES, shipdate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterThan(String shipdate) {
        regShipdate(CK_GT, fRES(shipdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessThan(String shipdate) {
        regShipdate(CK_LT, fRES(shipdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterEqual(String shipdate) {
        regShipdate(CK_GE, fRES(shipdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessEqual(String shipdate) {
        regShipdate(CK_LE, fRES(shipdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_InScope(Collection<String> shipdateList) {
        doSetShipdate_InScope(shipdateList);
    }

    protected void doSetShipdate_InScope(Collection<String> shipdateList) {
        regINS(CK_INS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdateList The collection of shipdate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_NotInScope(Collection<String> shipdateList) {
        doSetShipdate_NotInScope(shipdateList);
    }

    protected void doSetShipdate_NotInScope(Collection<String> shipdateList) {
        regINS(CK_NINS, cTL(shipdateList), xgetCValueShipdate(), "SHIPDATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)} <br>
     * <pre>e.g. setShipdate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipdate The value of shipdate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipdate_LikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipdate_NotLikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {varchar(8)}
     * @param shipdate The value of shipdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_PrefixSearch(String shipdate) {
        setShipdate_LikeSearch(shipdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNull() { regShipdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNullOrEmpty() { regShipdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {varchar(8)}
     */
    public void setShipdate_IsNotNull() { regShipdate(CK_ISNN, DOBJ); }

    protected void regShipdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipdate(), "SHIPDATE"); }
    protected abstract ConditionValue xgetCValueShipdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_Equal(String currentLocationCd) {
        doSetCurrentLocationCd_Equal(fRES(currentLocationCd));
    }

    protected void doSetCurrentLocationCd_Equal(String currentLocationCd) {
        regCurrentLocationCd(CK_EQ, currentLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_NotEqual(String currentLocationCd) {
        doSetCurrentLocationCd_NotEqual(fRES(currentLocationCd));
    }

    protected void doSetCurrentLocationCd_NotEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_NES, currentLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_GreaterThan(String currentLocationCd) {
        regCurrentLocationCd(CK_GT, fRES(currentLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_LessThan(String currentLocationCd) {
        regCurrentLocationCd(CK_LT, fRES(currentLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_GreaterEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_GE, fRES(currentLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_LessEqual(String currentLocationCd) {
        regCurrentLocationCd(CK_LE, fRES(currentLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCdList The collection of currentLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_InScope(Collection<String> currentLocationCdList) {
        doSetCurrentLocationCd_InScope(currentLocationCdList);
    }

    protected void doSetCurrentLocationCd_InScope(Collection<String> currentLocationCdList) {
        regINS(CK_INS, cTL(currentLocationCdList), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCdList The collection of currentLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_NotInScope(Collection<String> currentLocationCdList) {
        doSetCurrentLocationCd_NotInScope(currentLocationCdList);
    }

    protected void doSetCurrentLocationCd_NotInScope(Collection<String> currentLocationCdList) {
        regINS(CK_NINS, cTL(currentLocationCdList), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)} <br>
     * <pre>e.g. setCurrentLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currentLocationCd The value of currentLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrentLocationCd_LikeSearch(String currentLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currentLocationCd), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrentLocationCd_NotLikeSearch(String currentLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currentLocationCd), xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     * @param currentLocationCd The value of currentLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationCd_PrefixSearch(String currentLocationCd) {
        setCurrentLocationCd_LikeSearch(currentLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     */
    public void setCurrentLocationCd_IsNull() { regCurrentLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     */
    public void setCurrentLocationCd_IsNullOrEmpty() { regCurrentLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_CD: {varchar(30)}
     */
    public void setCurrentLocationCd_IsNotNull() { regCurrentLocationCd(CK_ISNN, DOBJ); }

    protected void regCurrentLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrentLocationCd(), "CURRENT_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueCurrentLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_Equal(String currentLocationSname) {
        doSetCurrentLocationSname_Equal(fRES(currentLocationSname));
    }

    protected void doSetCurrentLocationSname_Equal(String currentLocationSname) {
        regCurrentLocationSname(CK_EQ, currentLocationSname);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_NotEqual(String currentLocationSname) {
        doSetCurrentLocationSname_NotEqual(fRES(currentLocationSname));
    }

    protected void doSetCurrentLocationSname_NotEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_NES, currentLocationSname);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_GreaterThan(String currentLocationSname) {
        regCurrentLocationSname(CK_GT, fRES(currentLocationSname));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_LessThan(String currentLocationSname) {
        regCurrentLocationSname(CK_LT, fRES(currentLocationSname));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_GreaterEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_GE, fRES(currentLocationSname));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_LessEqual(String currentLocationSname) {
        regCurrentLocationSname(CK_LE, fRES(currentLocationSname));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSnameList The collection of currentLocationSname as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_InScope(Collection<String> currentLocationSnameList) {
        doSetCurrentLocationSname_InScope(currentLocationSnameList);
    }

    protected void doSetCurrentLocationSname_InScope(Collection<String> currentLocationSnameList) {
        regINS(CK_INS, cTL(currentLocationSnameList), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSnameList The collection of currentLocationSname as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_NotInScope(Collection<String> currentLocationSnameList) {
        doSetCurrentLocationSname_NotInScope(currentLocationSnameList);
    }

    protected void doSetCurrentLocationSname_NotInScope(Collection<String> currentLocationSnameList) {
        regINS(CK_NINS, cTL(currentLocationSnameList), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)} <br>
     * <pre>e.g. setCurrentLocationSname_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param currentLocationSname The value of currentLocationSname as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCurrentLocationSname_LikeSearch(String currentLocationSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(currentLocationSname), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCurrentLocationSname_NotLikeSearch(String currentLocationSname, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(currentLocationSname), xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     * @param currentLocationSname The value of currentLocationSname as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCurrentLocationSname_PrefixSearch(String currentLocationSname) {
        setCurrentLocationSname_LikeSearch(currentLocationSname, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     */
    public void setCurrentLocationSname_IsNull() { regCurrentLocationSname(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     */
    public void setCurrentLocationSname_IsNullOrEmpty() { regCurrentLocationSname(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CURRENT_LOCATION_SNAME: {varchar(100)}
     */
    public void setCurrentLocationSname_IsNotNull() { regCurrentLocationSname(CK_ISNN, DOBJ); }

    protected void regCurrentLocationSname(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCurrentLocationSname(), "CURRENT_LOCATION_SNAME"); }
    protected abstract ConditionValue xgetCValueCurrentLocationSname();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @param adddatetime The value of adddatetime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdddatetime_Equal(java.sql.Timestamp adddatetime) {
        regAdddatetime(CK_EQ,  adddatetime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @param adddatetime The value of adddatetime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdddatetime_GreaterThan(java.sql.Timestamp adddatetime) {
        regAdddatetime(CK_GT,  adddatetime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @param adddatetime The value of adddatetime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdddatetime_LessThan(java.sql.Timestamp adddatetime) {
        regAdddatetime(CK_LT,  adddatetime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @param adddatetime The value of adddatetime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdddatetime_GreaterEqual(java.sql.Timestamp adddatetime) {
        regAdddatetime(CK_GE,  adddatetime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * @param adddatetime The value of adddatetime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdddatetime_LessEqual(java.sql.Timestamp adddatetime) {
        regAdddatetime(CK_LE, adddatetime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * <pre>e.g. setAdddatetime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adddatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of adddatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setAdddatetime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueAdddatetime(), "ADDDATETIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of adddatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of adddatetime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setAdddatetime_DateFromTo(Date fromDate, Date toDate) {
        setAdddatetime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     */
    public void setAdddatetime_IsNull() { regAdddatetime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDDATETIME: {datetime2(26, 6)}
     */
    public void setAdddatetime_IsNotNull() { regAdddatetime(CK_ISNN, DOBJ); }

    protected void regAdddatetime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdddatetime(), "ADDDATETIME"); }
    protected abstract ConditionValue xgetCValueAdddatetime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_Equal(String tracetype) {
        doSetTracetype_Equal(fRES(tracetype));
    }

    protected void doSetTracetype_Equal(String tracetype) {
        regTracetype(CK_EQ, tracetype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotEqual(String tracetype) {
        doSetTracetype_NotEqual(fRES(tracetype));
    }

    protected void doSetTracetype_NotEqual(String tracetype) {
        regTracetype(CK_NES, tracetype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterThan(String tracetype) {
        regTracetype(CK_GT, fRES(tracetype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessThan(String tracetype) {
        regTracetype(CK_LT, fRES(tracetype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_GreaterEqual(String tracetype) {
        regTracetype(CK_GE, fRES(tracetype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_LessEqual(String tracetype) {
        regTracetype(CK_LE, fRES(tracetype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_InScope(Collection<String> tracetypeList) {
        doSetTracetype_InScope(tracetypeList);
    }

    protected void doSetTracetype_InScope(Collection<String> tracetypeList) {
        regINS(CK_INS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetypeList The collection of tracetype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_NotInScope(Collection<String> tracetypeList) {
        doSetTracetype_NotInScope(tracetypeList);
    }

    protected void doSetTracetype_NotInScope(Collection<String> tracetypeList) {
        regINS(CK_NINS, cTL(tracetypeList), xgetCValueTracetype(), "TRACETYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)} <br>
     * <pre>e.g. setTracetype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tracetype The value of tracetype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTracetype_LikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTracetype_NotLikeSearch(String tracetype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tracetype), xgetCValueTracetype(), "TRACETYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRACETYPE: {varchar(30)}
     * @param tracetype The value of tracetype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTracetype_PrefixSearch(String tracetype) {
        setTracetype_LikeSearch(tracetype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNull() { regTracetype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNullOrEmpty() { regTracetype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRACETYPE: {varchar(30)}
     */
    public void setTracetype_IsNotNull() { regTracetype(CK_ISNN, DOBJ); }

    protected void regTracetype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTracetype(), "TRACETYPE"); }
    protected abstract ConditionValue xgetCValueTracetype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_Equal(String othercd1) {
        doSetOthercd1_Equal(fRES(othercd1));
    }

    protected void doSetOthercd1_Equal(String othercd1) {
        regOthercd1(CK_EQ, othercd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_NotEqual(String othercd1) {
        doSetOthercd1_NotEqual(fRES(othercd1));
    }

    protected void doSetOthercd1_NotEqual(String othercd1) {
        regOthercd1(CK_NES, othercd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_GreaterThan(String othercd1) {
        regOthercd1(CK_GT, fRES(othercd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_LessThan(String othercd1) {
        regOthercd1(CK_LT, fRES(othercd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_GreaterEqual(String othercd1) {
        regOthercd1(CK_GE, fRES(othercd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_LessEqual(String othercd1) {
        regOthercd1(CK_LE, fRES(othercd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1List The collection of othercd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_InScope(Collection<String> othercd1List) {
        doSetOthercd1_InScope(othercd1List);
    }

    protected void doSetOthercd1_InScope(Collection<String> othercd1List) {
        regINS(CK_INS, cTL(othercd1List), xgetCValueOthercd1(), "OTHERCD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1List The collection of othercd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_NotInScope(Collection<String> othercd1List) {
        doSetOthercd1_NotInScope(othercd1List);
    }

    protected void doSetOthercd1_NotInScope(Collection<String> othercd1List) {
        regINS(CK_NINS, cTL(othercd1List), xgetCValueOthercd1(), "OTHERCD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(60)} <br>
     * <pre>e.g. setOthercd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercd1 The value of othercd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercd1_LikeSearch(String othercd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercd1), xgetCValueOthercd1(), "OTHERCD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd1_NotLikeSearch(String othercd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd1), xgetCValueOthercd1(), "OTHERCD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(60)}
     * @param othercd1 The value of othercd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_PrefixSearch(String othercd1) {
        setOthercd1_LikeSearch(othercd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     */
    public void setOthercd1_IsNull() { regOthercd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     */
    public void setOthercd1_IsNullOrEmpty() { regOthercd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(60)}
     */
    public void setOthercd1_IsNotNull() { regOthercd1(CK_ISNN, DOBJ); }

    protected void regOthercd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd1(), "OTHERCD1"); }
    protected abstract ConditionValue xgetCValueOthercd1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_Equal(Long examsts) {
        doSetExamsts_Equal(examsts);
    }

    protected void doSetExamsts_Equal(Long examsts) {
        regExamsts(CK_EQ, examsts);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_NotEqual(Long examsts) {
        doSetExamsts_NotEqual(examsts);
    }

    protected void doSetExamsts_NotEqual(Long examsts) {
        regExamsts(CK_NES, examsts);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_GreaterThan(Long examsts) {
        regExamsts(CK_GT, examsts);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_LessThan(Long examsts) {
        regExamsts(CK_LT, examsts);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_GreaterEqual(Long examsts) {
        regExamsts(CK_GE, examsts);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examsts The value of examsts as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExamsts_LessEqual(Long examsts) {
        regExamsts(CK_LE, examsts);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param minNumber The min number of examsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of examsts. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExamsts_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExamsts(), "EXAMSTS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examstsList The collection of examsts as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_InScope(Collection<Long> examstsList) {
        doSetExamsts_InScope(examstsList);
    }

    protected void doSetExamsts_InScope(Collection<Long> examstsList) {
        regINS(CK_INS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXAMSTS: {bigint(19)}
     * @param examstsList The collection of examsts as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExamsts_NotInScope(Collection<Long> examstsList) {
        doSetExamsts_NotInScope(examstsList);
    }

    protected void doSetExamsts_NotInScope(Collection<Long> examstsList) {
        regINS(CK_NINS, cTL(examstsList), xgetCValueExamsts(), "EXAMSTS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     */
    public void setExamsts_IsNull() { regExamsts(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXAMSTS: {bigint(19)}
     */
    public void setExamsts_IsNotNull() { regExamsts(CK_ISNN, DOBJ); }

    protected void regExamsts(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExamsts(), "EXAMSTS"); }
    protected abstract ConditionValue xgetCValueExamsts();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_Equal(Long caseinnumbowl) {
        doSetCaseinnumbowl_Equal(caseinnumbowl);
    }

    protected void doSetCaseinnumbowl_Equal(Long caseinnumbowl) {
        regCaseinnumbowl(CK_EQ, caseinnumbowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_NotEqual(Long caseinnumbowl) {
        doSetCaseinnumbowl_NotEqual(caseinnumbowl);
    }

    protected void doSetCaseinnumbowl_NotEqual(Long caseinnumbowl) {
        regCaseinnumbowl(CK_NES, caseinnumbowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_GreaterThan(Long caseinnumbowl) {
        regCaseinnumbowl(CK_GT, caseinnumbowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_LessThan(Long caseinnumbowl) {
        regCaseinnumbowl(CK_LT, caseinnumbowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_GreaterEqual(Long caseinnumbowl) {
        regCaseinnumbowl(CK_GE, caseinnumbowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowl The value of caseinnumbowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_LessEqual(Long caseinnumbowl) {
        regCaseinnumbowl(CK_LE, caseinnumbowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param minNumber The min number of caseinnumbowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseinnumbowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseinnumbowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseinnumbowl(), "CASEINNUMBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowlList The collection of caseinnumbowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_InScope(Collection<Long> caseinnumbowlList) {
        doSetCaseinnumbowl_InScope(caseinnumbowlList);
    }

    protected void doSetCaseinnumbowl_InScope(Collection<Long> caseinnumbowlList) {
        regINS(CK_INS, cTL(caseinnumbowlList), xgetCValueCaseinnumbowl(), "CASEINNUMBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     * @param caseinnumbowlList The collection of caseinnumbowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseinnumbowl_NotInScope(Collection<Long> caseinnumbowlList) {
        doSetCaseinnumbowl_NotInScope(caseinnumbowlList);
    }

    protected void doSetCaseinnumbowl_NotInScope(Collection<Long> caseinnumbowlList) {
        regINS(CK_NINS, cTL(caseinnumbowlList), xgetCValueCaseinnumbowl(), "CASEINNUMBOWL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     */
    public void setCaseinnumbowl_IsNull() { regCaseinnumbowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEINNUMBOWL: {bigint(19)}
     */
    public void setCaseinnumbowl_IsNotNull() { regCaseinnumbowl(CK_ISNN, DOBJ); }

    protected void regCaseinnumbowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseinnumbowl(), "CASEINNUMBOWL"); }
    protected abstract ConditionValue xgetCValueCaseinnumbowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_Equal(Long shipnumbowl) {
        doSetShipnumbowl_Equal(shipnumbowl);
    }

    protected void doSetShipnumbowl_Equal(Long shipnumbowl) {
        regShipnumbowl(CK_EQ, shipnumbowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_NotEqual(Long shipnumbowl) {
        doSetShipnumbowl_NotEqual(shipnumbowl);
    }

    protected void doSetShipnumbowl_NotEqual(Long shipnumbowl) {
        regShipnumbowl(CK_NES, shipnumbowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_GreaterThan(Long shipnumbowl) {
        regShipnumbowl(CK_GT, shipnumbowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_LessThan(Long shipnumbowl) {
        regShipnumbowl(CK_LT, shipnumbowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_GreaterEqual(Long shipnumbowl) {
        regShipnumbowl(CK_GE, shipnumbowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowl The value of shipnumbowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShipnumbowl_LessEqual(Long shipnumbowl) {
        regShipnumbowl(CK_LE, shipnumbowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param minNumber The min number of shipnumbowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shipnumbowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShipnumbowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShipnumbowl(), "SHIPNUMBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowlList The collection of shipnumbowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipnumbowl_InScope(Collection<Long> shipnumbowlList) {
        doSetShipnumbowl_InScope(shipnumbowlList);
    }

    protected void doSetShipnumbowl_InScope(Collection<Long> shipnumbowlList) {
        regINS(CK_INS, cTL(shipnumbowlList), xgetCValueShipnumbowl(), "SHIPNUMBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     * @param shipnumbowlList The collection of shipnumbowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipnumbowl_NotInScope(Collection<Long> shipnumbowlList) {
        doSetShipnumbowl_NotInScope(shipnumbowlList);
    }

    protected void doSetShipnumbowl_NotInScope(Collection<Long> shipnumbowlList) {
        regINS(CK_NINS, cTL(shipnumbowlList), xgetCValueShipnumbowl(), "SHIPNUMBOWL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     */
    public void setShipnumbowl_IsNull() { regShipnumbowl(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPNUMBOWL: {bigint(19)}
     */
    public void setShipnumbowl_IsNotNull() { regShipnumbowl(CK_ISNN, DOBJ); }

    protected void regShipnumbowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipnumbowl(), "SHIPNUMBOWL"); }
    protected abstract ConditionValue xgetCValueShipnumbowl();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_Equal(String supplierrcvno) {
        doSetSupplierrcvno_Equal(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_Equal(String supplierrcvno) {
        regSupplierrcvno(CK_EQ, supplierrcvno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotEqual(String supplierrcvno) {
        doSetSupplierrcvno_NotEqual(fRES(supplierrcvno));
    }

    protected void doSetSupplierrcvno_NotEqual(String supplierrcvno) {
        regSupplierrcvno(CK_NES, supplierrcvno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterThan(String supplierrcvno) {
        regSupplierrcvno(CK_GT, fRES(supplierrcvno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessThan(String supplierrcvno) {
        regSupplierrcvno(CK_LT, fRES(supplierrcvno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_GreaterEqual(String supplierrcvno) {
        regSupplierrcvno(CK_GE, fRES(supplierrcvno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_LessEqual(String supplierrcvno) {
        regSupplierrcvno(CK_LE, fRES(supplierrcvno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_InScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_InScope(Collection<String> supplierrcvnoList) {
        regINS(CK_INS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvnoList The collection of supplierrcvno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        doSetSupplierrcvno_NotInScope(supplierrcvnoList);
    }

    protected void doSetSupplierrcvno_NotInScope(Collection<String> supplierrcvnoList) {
        regINS(CK_NINS, cTL(supplierrcvnoList), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)} <br>
     * <pre>e.g. setSupplierrcvno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplierrcvno The value of supplierrcvno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplierrcvno_LikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplierrcvno_NotLikeSearch(String supplierrcvno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplierrcvno), xgetCValueSupplierrcvno(), "SUPPLIERRCVNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     * @param supplierrcvno The value of supplierrcvno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplierrcvno_PrefixSearch(String supplierrcvno) {
        setSupplierrcvno_LikeSearch(supplierrcvno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNull() { regSupplierrcvno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNullOrEmpty() { regSupplierrcvno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLIERRCVNO: {varchar(60)}
     */
    public void setSupplierrcvno_IsNotNull() { regSupplierrcvno(CK_ISNN, DOBJ); }

    protected void regSupplierrcvno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplierrcvno(), "SUPPLIERRCVNO"); }
    protected abstract ConditionValue xgetCValueSupplierrcvno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_Equal(String tokuhancd) {
        doSetTokuhancd_Equal(fRES(tokuhancd));
    }

    protected void doSetTokuhancd_Equal(String tokuhancd) {
        regTokuhancd(CK_EQ, tokuhancd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_NotEqual(String tokuhancd) {
        doSetTokuhancd_NotEqual(fRES(tokuhancd));
    }

    protected void doSetTokuhancd_NotEqual(String tokuhancd) {
        regTokuhancd(CK_NES, tokuhancd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_GreaterThan(String tokuhancd) {
        regTokuhancd(CK_GT, fRES(tokuhancd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_LessThan(String tokuhancd) {
        regTokuhancd(CK_LT, fRES(tokuhancd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_GreaterEqual(String tokuhancd) {
        regTokuhancd(CK_GE, fRES(tokuhancd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_LessEqual(String tokuhancd) {
        regTokuhancd(CK_LE, fRES(tokuhancd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancdList The collection of tokuhancd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_InScope(Collection<String> tokuhancdList) {
        doSetTokuhancd_InScope(tokuhancdList);
    }

    protected void doSetTokuhancd_InScope(Collection<String> tokuhancdList) {
        regINS(CK_INS, cTL(tokuhancdList), xgetCValueTokuhancd(), "TOKUHANCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancdList The collection of tokuhancd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_NotInScope(Collection<String> tokuhancdList) {
        doSetTokuhancd_NotInScope(tokuhancdList);
    }

    protected void doSetTokuhancd_NotInScope(Collection<String> tokuhancdList) {
        regINS(CK_NINS, cTL(tokuhancdList), xgetCValueTokuhancd(), "TOKUHANCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)} <br>
     * <pre>e.g. setTokuhancd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokuhancd The value of tokuhancd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTokuhancd_LikeSearch(String tokuhancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokuhancd), xgetCValueTokuhancd(), "TOKUHANCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTokuhancd_NotLikeSearch(String tokuhancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokuhancd), xgetCValueTokuhancd(), "TOKUHANCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     * @param tokuhancd The value of tokuhancd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhancd_PrefixSearch(String tokuhancd) {
        setTokuhancd_LikeSearch(tokuhancd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNull() { regTokuhancd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNullOrEmpty() { regTokuhancd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOKUHANCD: {varchar(100)}
     */
    public void setTokuhancd_IsNotNull() { regTokuhancd(CK_ISNN, DOBJ); }

    protected void regTokuhancd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokuhancd(), "TOKUHANCD"); }
    protected abstract ConditionValue xgetCValueTokuhancd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_Equal(String tokuhanNm) {
        doSetTokuhanNm_Equal(fRES(tokuhanNm));
    }

    protected void doSetTokuhanNm_Equal(String tokuhanNm) {
        regTokuhanNm(CK_EQ, tokuhanNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_NotEqual(String tokuhanNm) {
        doSetTokuhanNm_NotEqual(fRES(tokuhanNm));
    }

    protected void doSetTokuhanNm_NotEqual(String tokuhanNm) {
        regTokuhanNm(CK_NES, tokuhanNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_GreaterThan(String tokuhanNm) {
        regTokuhanNm(CK_GT, fRES(tokuhanNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_LessThan(String tokuhanNm) {
        regTokuhanNm(CK_LT, fRES(tokuhanNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_GreaterEqual(String tokuhanNm) {
        regTokuhanNm(CK_GE, fRES(tokuhanNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_LessEqual(String tokuhanNm) {
        regTokuhanNm(CK_LE, fRES(tokuhanNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNmList The collection of tokuhanNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_InScope(Collection<String> tokuhanNmList) {
        doSetTokuhanNm_InScope(tokuhanNmList);
    }

    protected void doSetTokuhanNm_InScope(Collection<String> tokuhanNmList) {
        regINS(CK_INS, cTL(tokuhanNmList), xgetCValueTokuhanNm(), "TOKUHAN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNmList The collection of tokuhanNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_NotInScope(Collection<String> tokuhanNmList) {
        doSetTokuhanNm_NotInScope(tokuhanNmList);
    }

    protected void doSetTokuhanNm_NotInScope(Collection<String> tokuhanNmList) {
        regINS(CK_NINS, cTL(tokuhanNmList), xgetCValueTokuhanNm(), "TOKUHAN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_NM: {varchar(60)} <br>
     * <pre>e.g. setTokuhanNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tokuhanNm The value of tokuhanNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTokuhanNm_LikeSearch(String tokuhanNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tokuhanNm), xgetCValueTokuhanNm(), "TOKUHAN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTokuhanNm_NotLikeSearch(String tokuhanNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tokuhanNm), xgetCValueTokuhanNm(), "TOKUHAN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     * @param tokuhanNm The value of tokuhanNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTokuhanNm_PrefixSearch(String tokuhanNm) {
        setTokuhanNm_LikeSearch(tokuhanNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     */
    public void setTokuhanNm_IsNull() { regTokuhanNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     */
    public void setTokuhanNm_IsNullOrEmpty() { regTokuhanNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOKUHAN_NM: {varchar(60)}
     */
    public void setTokuhanNm_IsNotNull() { regTokuhanNm(CK_ISNN, DOBJ); }

    protected void regTokuhanNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTokuhanNm(), "TOKUHAN_NM"); }
    protected abstract ConditionValue xgetCValueTokuhanNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_Equal(String makercaseno) {
        doSetMakercaseno_Equal(fRES(makercaseno));
    }

    protected void doSetMakercaseno_Equal(String makercaseno) {
        regMakercaseno(CK_EQ, makercaseno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotEqual(String makercaseno) {
        doSetMakercaseno_NotEqual(fRES(makercaseno));
    }

    protected void doSetMakercaseno_NotEqual(String makercaseno) {
        regMakercaseno(CK_NES, makercaseno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterThan(String makercaseno) {
        regMakercaseno(CK_GT, fRES(makercaseno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessThan(String makercaseno) {
        regMakercaseno(CK_LT, fRES(makercaseno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_GreaterEqual(String makercaseno) {
        regMakercaseno(CK_GE, fRES(makercaseno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_LessEqual(String makercaseno) {
        regMakercaseno(CK_LE, fRES(makercaseno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_InScope(Collection<String> makercasenoList) {
        doSetMakercaseno_InScope(makercasenoList);
    }

    protected void doSetMakercaseno_InScope(Collection<String> makercasenoList) {
        regINS(CK_INS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercasenoList The collection of makercaseno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_NotInScope(Collection<String> makercasenoList) {
        doSetMakercaseno_NotInScope(makercasenoList);
    }

    protected void doSetMakercaseno_NotInScope(Collection<String> makercasenoList) {
        regINS(CK_NINS, cTL(makercasenoList), xgetCValueMakercaseno(), "MAKERCASENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)} <br>
     * <pre>e.g. setMakercaseno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makercaseno The value of makercaseno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakercaseno_LikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakercaseno_NotLikeSearch(String makercaseno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makercaseno), xgetCValueMakercaseno(), "MAKERCASENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     * @param makercaseno The value of makercaseno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakercaseno_PrefixSearch(String makercaseno) {
        setMakercaseno_LikeSearch(makercaseno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNull() { regMakercaseno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNullOrEmpty() { regMakercaseno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKERCASENO: {varchar(60)}
     */
    public void setMakercaseno_IsNotNull() { regMakercaseno(CK_ISNN, DOBJ); }

    protected void regMakercaseno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakercaseno(), "MAKERCASENO"); }
    protected abstract ConditionValue xgetCValueMakercaseno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_Equal(String caseitfno) {
        doSetCaseitfno_Equal(fRES(caseitfno));
    }

    protected void doSetCaseitfno_Equal(String caseitfno) {
        regCaseitfno(CK_EQ, caseitfno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotEqual(String caseitfno) {
        doSetCaseitfno_NotEqual(fRES(caseitfno));
    }

    protected void doSetCaseitfno_NotEqual(String caseitfno) {
        regCaseitfno(CK_NES, caseitfno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterThan(String caseitfno) {
        regCaseitfno(CK_GT, fRES(caseitfno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessThan(String caseitfno) {
        regCaseitfno(CK_LT, fRES(caseitfno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_GreaterEqual(String caseitfno) {
        regCaseitfno(CK_GE, fRES(caseitfno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_LessEqual(String caseitfno) {
        regCaseitfno(CK_LE, fRES(caseitfno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_InScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_InScope(caseitfnoList);
    }

    protected void doSetCaseitfno_InScope(Collection<String> caseitfnoList) {
        regINS(CK_INS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfnoList The collection of caseitfno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        doSetCaseitfno_NotInScope(caseitfnoList);
    }

    protected void doSetCaseitfno_NotInScope(Collection<String> caseitfnoList) {
        regINS(CK_NINS, cTL(caseitfnoList), xgetCValueCaseitfno(), "CASEITFNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)} <br>
     * <pre>e.g. setCaseitfno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caseitfno The value of caseitfno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaseitfno_LikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaseitfno_NotLikeSearch(String caseitfno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caseitfno), xgetCValueCaseitfno(), "CASEITFNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEITFNO: {varchar(30)}
     * @param caseitfno The value of caseitfno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseitfno_PrefixSearch(String caseitfno) {
        setCaseitfno_LikeSearch(caseitfno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNull() { regCaseitfno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNullOrEmpty() { regCaseitfno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEITFNO: {varchar(30)}
     */
    public void setCaseitfno_IsNotNull() { regCaseitfno(CK_ISNN, DOBJ); }

    protected void regCaseitfno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseitfno(), "CASEITFNO"); }
    protected abstract ConditionValue xgetCValueCaseitfno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_Equal(String casebarcodevaliant) {
        doSetCasebarcodevaliant_Equal(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_Equal(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_EQ, casebarcodevaliant);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        doSetCasebarcodevaliant_NotEqual(fRES(casebarcodevaliant));
    }

    protected void doSetCasebarcodevaliant_NotEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_NES, casebarcodevaliant);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GT, fRES(casebarcodevaliant));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessThan(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LT, fRES(casebarcodevaliant));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_GreaterEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_GE, fRES(casebarcodevaliant));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_LessEqual(String casebarcodevaliant) {
        regCasebarcodevaliant(CK_LE, fRES(casebarcodevaliant));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_InScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_InScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_INS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliantList The collection of casebarcodevaliant as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        doSetCasebarcodevaliant_NotInScope(casebarcodevaliantList);
    }

    protected void doSetCasebarcodevaliant_NotInScope(Collection<String> casebarcodevaliantList) {
        regINS(CK_NINS, cTL(casebarcodevaliantList), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)} <br>
     * <pre>e.g. setCasebarcodevaliant_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casebarcodevaliant The value of casebarcodevaliant as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasebarcodevaliant_LikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasebarcodevaliant_NotLikeSearch(String casebarcodevaliant, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casebarcodevaliant), xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     * @param casebarcodevaliant The value of casebarcodevaliant as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasebarcodevaliant_PrefixSearch(String casebarcodevaliant) {
        setCasebarcodevaliant_LikeSearch(casebarcodevaliant, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNull() { regCasebarcodevaliant(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNullOrEmpty() { regCasebarcodevaliant(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEBARCODEVALIANT: {varchar(30)}
     */
    public void setCasebarcodevaliant_IsNotNull() { regCasebarcodevaliant(CK_ISNN, DOBJ); }

    protected void regCasebarcodevaliant(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasebarcodevaliant(), "CASEBARCODEVALIANT"); }
    protected abstract ConditionValue xgetCValueCasebarcodevaliant();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_Equal(String caselot4) {
        doSetCaselot4_Equal(fRES(caselot4));
    }

    protected void doSetCaselot4_Equal(String caselot4) {
        regCaselot4(CK_EQ, caselot4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotEqual(String caselot4) {
        doSetCaselot4_NotEqual(fRES(caselot4));
    }

    protected void doSetCaselot4_NotEqual(String caselot4) {
        regCaselot4(CK_NES, caselot4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterThan(String caselot4) {
        regCaselot4(CK_GT, fRES(caselot4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessThan(String caselot4) {
        regCaselot4(CK_LT, fRES(caselot4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_GreaterEqual(String caselot4) {
        regCaselot4(CK_GE, fRES(caselot4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_LessEqual(String caselot4) {
        regCaselot4(CK_LE, fRES(caselot4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_InScope(Collection<String> caselot4List) {
        doSetCaselot4_InScope(caselot4List);
    }

    protected void doSetCaselot4_InScope(Collection<String> caselot4List) {
        regINS(CK_INS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4List The collection of caselot4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_NotInScope(Collection<String> caselot4List) {
        doSetCaselot4_NotInScope(caselot4List);
    }

    protected void doSetCaselot4_NotInScope(Collection<String> caselot4List) {
        regINS(CK_NINS, cTL(caselot4List), xgetCValueCaselot4(), "CASELOT4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)} <br>
     * <pre>e.g. setCaselot4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param caselot4 The value of caselot4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCaselot4_LikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCaselot4_NotLikeSearch(String caselot4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(caselot4), xgetCValueCaselot4(), "CASELOT4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASELOT4: {varchar(30)}
     * @param caselot4 The value of caselot4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaselot4_PrefixSearch(String caselot4) {
        setCaselot4_LikeSearch(caselot4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNull() { regCaselot4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNullOrEmpty() { regCaselot4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASELOT4: {varchar(30)}
     */
    public void setCaselot4_IsNotNull() { regCaselot4(CK_ISNN, DOBJ); }

    protected void regCaselot4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaselot4(), "CASELOT4"); }
    protected abstract ConditionValue xgetCValueCaselot4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_Equal(String casecenterno) {
        doSetCasecenterno_Equal(fRES(casecenterno));
    }

    protected void doSetCasecenterno_Equal(String casecenterno) {
        regCasecenterno(CK_EQ, casecenterno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotEqual(String casecenterno) {
        doSetCasecenterno_NotEqual(fRES(casecenterno));
    }

    protected void doSetCasecenterno_NotEqual(String casecenterno) {
        regCasecenterno(CK_NES, casecenterno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterThan(String casecenterno) {
        regCasecenterno(CK_GT, fRES(casecenterno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessThan(String casecenterno) {
        regCasecenterno(CK_LT, fRES(casecenterno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_GreaterEqual(String casecenterno) {
        regCasecenterno(CK_GE, fRES(casecenterno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_LessEqual(String casecenterno) {
        regCasecenterno(CK_LE, fRES(casecenterno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_InScope(Collection<String> casecenternoList) {
        doSetCasecenterno_InScope(casecenternoList);
    }

    protected void doSetCasecenterno_InScope(Collection<String> casecenternoList) {
        regINS(CK_INS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenternoList The collection of casecenterno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_NotInScope(Collection<String> casecenternoList) {
        doSetCasecenterno_NotInScope(casecenternoList);
    }

    protected void doSetCasecenterno_NotInScope(Collection<String> casecenternoList) {
        regINS(CK_NINS, cTL(casecenternoList), xgetCValueCasecenterno(), "CASECENTERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)} <br>
     * <pre>e.g. setCasecenterno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casecenterno The value of casecenterno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasecenterno_LikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasecenterno_NotLikeSearch(String casecenterno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casecenterno), xgetCValueCasecenterno(), "CASECENTERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     * @param casecenterno The value of casecenterno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasecenterno_PrefixSearch(String casecenterno) {
        setCasecenterno_LikeSearch(casecenterno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNull() { regCasecenterno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNullOrEmpty() { regCasecenterno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASECENTERNO: {varchar(30)}
     */
    public void setCasecenterno_IsNotNull() { regCasecenterno(CK_ISNN, DOBJ); }

    protected void regCasecenterno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasecenterno(), "CASECENTERNO"); }
    protected abstract ConditionValue xgetCValueCasecenterno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_Equal(String casepackno) {
        doSetCasepackno_Equal(fRES(casepackno));
    }

    protected void doSetCasepackno_Equal(String casepackno) {
        regCasepackno(CK_EQ, casepackno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotEqual(String casepackno) {
        doSetCasepackno_NotEqual(fRES(casepackno));
    }

    protected void doSetCasepackno_NotEqual(String casepackno) {
        regCasepackno(CK_NES, casepackno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterThan(String casepackno) {
        regCasepackno(CK_GT, fRES(casepackno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessThan(String casepackno) {
        regCasepackno(CK_LT, fRES(casepackno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_GreaterEqual(String casepackno) {
        regCasepackno(CK_GE, fRES(casepackno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_LessEqual(String casepackno) {
        regCasepackno(CK_LE, fRES(casepackno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_InScope(Collection<String> casepacknoList) {
        doSetCasepackno_InScope(casepacknoList);
    }

    protected void doSetCasepackno_InScope(Collection<String> casepacknoList) {
        regINS(CK_INS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepacknoList The collection of casepackno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_NotInScope(Collection<String> casepacknoList) {
        doSetCasepackno_NotInScope(casepacknoList);
    }

    protected void doSetCasepackno_NotInScope(Collection<String> casepacknoList) {
        regINS(CK_NINS, cTL(casepacknoList), xgetCValueCasepackno(), "CASEPACKNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)} <br>
     * <pre>e.g. setCasepackno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepackno The value of casepackno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepackno_LikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepackno_NotLikeSearch(String casepackno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepackno), xgetCValueCasepackno(), "CASEPACKNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     * @param casepackno The value of casepackno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepackno_PrefixSearch(String casepackno) {
        setCasepackno_LikeSearch(casepackno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNull() { regCasepackno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNullOrEmpty() { regCasepackno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKNO: {varchar(30)}
     */
    public void setCasepackno_IsNotNull() { regCasepackno(CK_ISNN, DOBJ); }

    protected void regCasepackno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepackno(), "CASEPACKNO"); }
    protected abstract ConditionValue xgetCValueCasepackno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_Equal(String casepacktime) {
        doSetCasepacktime_Equal(fRES(casepacktime));
    }

    protected void doSetCasepacktime_Equal(String casepacktime) {
        regCasepacktime(CK_EQ, casepacktime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotEqual(String casepacktime) {
        doSetCasepacktime_NotEqual(fRES(casepacktime));
    }

    protected void doSetCasepacktime_NotEqual(String casepacktime) {
        regCasepacktime(CK_NES, casepacktime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterThan(String casepacktime) {
        regCasepacktime(CK_GT, fRES(casepacktime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessThan(String casepacktime) {
        regCasepacktime(CK_LT, fRES(casepacktime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_GreaterEqual(String casepacktime) {
        regCasepacktime(CK_GE, fRES(casepacktime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_LessEqual(String casepacktime) {
        regCasepacktime(CK_LE, fRES(casepacktime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_InScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_InScope(casepacktimeList);
    }

    protected void doSetCasepacktime_InScope(Collection<String> casepacktimeList) {
        regINS(CK_INS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktimeList The collection of casepacktime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        doSetCasepacktime_NotInScope(casepacktimeList);
    }

    protected void doSetCasepacktime_NotInScope(Collection<String> casepacktimeList) {
        regINS(CK_NINS, cTL(casepacktimeList), xgetCValueCasepacktime(), "CASEPACKTIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)} <br>
     * <pre>e.g. setCasepacktime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param casepacktime The value of casepacktime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCasepacktime_LikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCasepacktime_NotLikeSearch(String casepacktime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(casepacktime), xgetCValueCasepacktime(), "CASEPACKTIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     * @param casepacktime The value of casepacktime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCasepacktime_PrefixSearch(String casepacktime) {
        setCasepacktime_LikeSearch(casepacktime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNull() { regCasepacktime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNullOrEmpty() { regCasepacktime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASEPACKTIME: {varchar(30)}
     */
    public void setCasepacktime_IsNotNull() { regCasepacktime(CK_ISNN, DOBJ); }

    protected void regCasepacktime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCasepacktime(), "CASEPACKTIME"); }
    protected abstract ConditionValue xgetCValueCasepacktime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_Equal(String senderLocation) {
        doSetSenderLocation_Equal(fRES(senderLocation));
    }

    protected void doSetSenderLocation_Equal(String senderLocation) {
        regSenderLocation(CK_EQ, senderLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotEqual(String senderLocation) {
        doSetSenderLocation_NotEqual(fRES(senderLocation));
    }

    protected void doSetSenderLocation_NotEqual(String senderLocation) {
        regSenderLocation(CK_NES, senderLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterThan(String senderLocation) {
        regSenderLocation(CK_GT, fRES(senderLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessThan(String senderLocation) {
        regSenderLocation(CK_LT, fRES(senderLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_GreaterEqual(String senderLocation) {
        regSenderLocation(CK_GE, fRES(senderLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_LessEqual(String senderLocation) {
        regSenderLocation(CK_LE, fRES(senderLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_InScope(Collection<String> senderLocationList) {
        doSetSenderLocation_InScope(senderLocationList);
    }

    protected void doSetSenderLocation_InScope(Collection<String> senderLocationList) {
        regINS(CK_INS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocationList The collection of senderLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_NotInScope(Collection<String> senderLocationList) {
        doSetSenderLocation_NotInScope(senderLocationList);
    }

    protected void doSetSenderLocation_NotInScope(Collection<String> senderLocationList) {
        regINS(CK_NINS, cTL(senderLocationList), xgetCValueSenderLocation(), "SENDER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setSenderLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param senderLocation The value of senderLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSenderLocation_LikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSenderLocation_NotLikeSearch(String senderLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(senderLocation), xgetCValueSenderLocation(), "SENDER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     * @param senderLocation The value of senderLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSenderLocation_PrefixSearch(String senderLocation) {
        setSenderLocation_LikeSearch(senderLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNull() { regSenderLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNullOrEmpty() { regSenderLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SENDER_LOCATION: {varchar(30)}
     */
    public void setSenderLocation_IsNotNull() { regSenderLocation(CK_ISNN, DOBJ); }

    protected void regSenderLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSenderLocation(), "SENDER_LOCATION"); }
    protected abstract ConditionValue xgetCValueSenderLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_Equal(String receiverLocation) {
        doSetReceiverLocation_Equal(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_Equal(String receiverLocation) {
        regReceiverLocation(CK_EQ, receiverLocation);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotEqual(String receiverLocation) {
        doSetReceiverLocation_NotEqual(fRES(receiverLocation));
    }

    protected void doSetReceiverLocation_NotEqual(String receiverLocation) {
        regReceiverLocation(CK_NES, receiverLocation);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterThan(String receiverLocation) {
        regReceiverLocation(CK_GT, fRES(receiverLocation));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessThan(String receiverLocation) {
        regReceiverLocation(CK_LT, fRES(receiverLocation));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_GreaterEqual(String receiverLocation) {
        regReceiverLocation(CK_GE, fRES(receiverLocation));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_LessEqual(String receiverLocation) {
        regReceiverLocation(CK_LE, fRES(receiverLocation));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_InScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_InScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_InScope(Collection<String> receiverLocationList) {
        regINS(CK_INS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocationList The collection of receiverLocation as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        doSetReceiverLocation_NotInScope(receiverLocationList);
    }

    protected void doSetReceiverLocation_NotInScope(Collection<String> receiverLocationList) {
        regINS(CK_NINS, cTL(receiverLocationList), xgetCValueReceiverLocation(), "RECEIVER_LOCATION");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)} <br>
     * <pre>e.g. setReceiverLocation_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiverLocation The value of receiverLocation as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiverLocation_LikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiverLocation_NotLikeSearch(String receiverLocation, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiverLocation), xgetCValueReceiverLocation(), "RECEIVER_LOCATION", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     * @param receiverLocation The value of receiverLocation as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiverLocation_PrefixSearch(String receiverLocation) {
        setReceiverLocation_LikeSearch(receiverLocation, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNull() { regReceiverLocation(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNullOrEmpty() { regReceiverLocation(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVER_LOCATION: {varchar(30)}
     */
    public void setReceiverLocation_IsNotNull() { regReceiverLocation(CK_ISNN, DOBJ); }

    protected void regReceiverLocation(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiverLocation(), "RECEIVER_LOCATION"); }
    protected abstract ConditionValue xgetCValueReceiverLocation();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_Equal(String shipmentId) {
        doSetShipmentId_Equal(fRES(shipmentId));
    }

    protected void doSetShipmentId_Equal(String shipmentId) {
        regShipmentId(CK_EQ, shipmentId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotEqual(String shipmentId) {
        doSetShipmentId_NotEqual(fRES(shipmentId));
    }

    protected void doSetShipmentId_NotEqual(String shipmentId) {
        regShipmentId(CK_NES, shipmentId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterThan(String shipmentId) {
        regShipmentId(CK_GT, fRES(shipmentId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessThan(String shipmentId) {
        regShipmentId(CK_LT, fRES(shipmentId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_GreaterEqual(String shipmentId) {
        regShipmentId(CK_GE, fRES(shipmentId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_LessEqual(String shipmentId) {
        regShipmentId(CK_LE, fRES(shipmentId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_InScope(Collection<String> shipmentIdList) {
        doSetShipmentId_InScope(shipmentIdList);
    }

    protected void doSetShipmentId_InScope(Collection<String> shipmentIdList) {
        regINS(CK_INS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentIdList The collection of shipmentId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_NotInScope(Collection<String> shipmentIdList) {
        doSetShipmentId_NotInScope(shipmentIdList);
    }

    protected void doSetShipmentId_NotInScope(Collection<String> shipmentIdList) {
        regINS(CK_NINS, cTL(shipmentIdList), xgetCValueShipmentId(), "SHIPMENT_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)} <br>
     * <pre>e.g. setShipmentId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentId The value of shipmentId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentId_LikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentId_NotLikeSearch(String shipmentId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentId), xgetCValueShipmentId(), "SHIPMENT_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     * @param shipmentId The value of shipmentId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentId_PrefixSearch(String shipmentId) {
        setShipmentId_LikeSearch(shipmentId, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNull() { regShipmentId(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNullOrEmpty() { regShipmentId(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_ID: {varchar(30)}
     */
    public void setShipmentId_IsNotNull() { regShipmentId(CK_ISNN, DOBJ); }

    protected void regShipmentId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentId(), "SHIPMENT_ID"); }
    protected abstract ConditionValue xgetCValueShipmentId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_Equal(String shipmentDate) {
        doSetShipmentDate_Equal(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_Equal(String shipmentDate) {
        regShipmentDate(CK_EQ, shipmentDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotEqual(String shipmentDate) {
        doSetShipmentDate_NotEqual(fRES(shipmentDate));
    }

    protected void doSetShipmentDate_NotEqual(String shipmentDate) {
        regShipmentDate(CK_NES, shipmentDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterThan(String shipmentDate) {
        regShipmentDate(CK_GT, fRES(shipmentDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessThan(String shipmentDate) {
        regShipmentDate(CK_LT, fRES(shipmentDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_GreaterEqual(String shipmentDate) {
        regShipmentDate(CK_GE, fRES(shipmentDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_LessEqual(String shipmentDate) {
        regShipmentDate(CK_LE, fRES(shipmentDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_InScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_InScope(shipmentDateList);
    }

    protected void doSetShipmentDate_InScope(Collection<String> shipmentDateList) {
        regINS(CK_INS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDateList The collection of shipmentDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        doSetShipmentDate_NotInScope(shipmentDateList);
    }

    protected void doSetShipmentDate_NotInScope(Collection<String> shipmentDateList) {
        regINS(CK_NINS, cTL(shipmentDateList), xgetCValueShipmentDate(), "SHIPMENT_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)} <br>
     * <pre>e.g. setShipmentDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shipmentDate The value of shipmentDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShipmentDate_LikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipmentDate_NotLikeSearch(String shipmentDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipmentDate), xgetCValueShipmentDate(), "SHIPMENT_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     * @param shipmentDate The value of shipmentDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipmentDate_PrefixSearch(String shipmentDate) {
        setShipmentDate_LikeSearch(shipmentDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNull() { regShipmentDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNullOrEmpty() { regShipmentDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPMENT_DATE: {varchar(30)}
     */
    public void setShipmentDate_IsNotNull() { regShipmentDate(CK_ISNN, DOBJ); }

    protected void regShipmentDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipmentDate(), "SHIPMENT_DATE"); }
    protected abstract ConditionValue xgetCValueShipmentDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_Equal(String numberOfPallets) {
        doSetNumberOfPallets_Equal(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_Equal(String numberOfPallets) {
        regNumberOfPallets(CK_EQ, numberOfPallets);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotEqual(String numberOfPallets) {
        doSetNumberOfPallets_NotEqual(fRES(numberOfPallets));
    }

    protected void doSetNumberOfPallets_NotEqual(String numberOfPallets) {
        regNumberOfPallets(CK_NES, numberOfPallets);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterThan(String numberOfPallets) {
        regNumberOfPallets(CK_GT, fRES(numberOfPallets));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessThan(String numberOfPallets) {
        regNumberOfPallets(CK_LT, fRES(numberOfPallets));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_GreaterEqual(String numberOfPallets) {
        regNumberOfPallets(CK_GE, fRES(numberOfPallets));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_LessEqual(String numberOfPallets) {
        regNumberOfPallets(CK_LE, fRES(numberOfPallets));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_InScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_InScope(Collection<String> numberOfPalletsList) {
        regINS(CK_INS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPalletsList The collection of numberOfPallets as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        doSetNumberOfPallets_NotInScope(numberOfPalletsList);
    }

    protected void doSetNumberOfPallets_NotInScope(Collection<String> numberOfPalletsList) {
        regINS(CK_NINS, cTL(numberOfPalletsList), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)} <br>
     * <pre>e.g. setNumberOfPallets_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param numberOfPallets The value of numberOfPallets as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNumberOfPallets_LikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNumberOfPallets_NotLikeSearch(String numberOfPallets, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(numberOfPallets), xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     * @param numberOfPallets The value of numberOfPallets as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNumberOfPallets_PrefixSearch(String numberOfPallets) {
        setNumberOfPallets_LikeSearch(numberOfPallets, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNull() { regNumberOfPallets(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNullOrEmpty() { regNumberOfPallets(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUMBER_OF_PALLETS: {varchar(30)}
     */
    public void setNumberOfPallets_IsNotNull() { regNumberOfPallets(CK_ISNN, DOBJ); }

    protected void regNumberOfPallets(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNumberOfPallets(), "NUMBER_OF_PALLETS"); }
    protected abstract ConditionValue xgetCValueNumberOfPallets();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_Equal(String carrierno) {
        doSetCarrierno_Equal(fRES(carrierno));
    }

    protected void doSetCarrierno_Equal(String carrierno) {
        regCarrierno(CK_EQ, carrierno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotEqual(String carrierno) {
        doSetCarrierno_NotEqual(fRES(carrierno));
    }

    protected void doSetCarrierno_NotEqual(String carrierno) {
        regCarrierno(CK_NES, carrierno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterThan(String carrierno) {
        regCarrierno(CK_GT, fRES(carrierno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessThan(String carrierno) {
        regCarrierno(CK_LT, fRES(carrierno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_GreaterEqual(String carrierno) {
        regCarrierno(CK_GE, fRES(carrierno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_LessEqual(String carrierno) {
        regCarrierno(CK_LE, fRES(carrierno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_InScope(Collection<String> carriernoList) {
        doSetCarrierno_InScope(carriernoList);
    }

    protected void doSetCarrierno_InScope(Collection<String> carriernoList) {
        regINS(CK_INS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carriernoList The collection of carrierno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_NotInScope(Collection<String> carriernoList) {
        doSetCarrierno_NotInScope(carriernoList);
    }

    protected void doSetCarrierno_NotInScope(Collection<String> carriernoList) {
        regINS(CK_NINS, cTL(carriernoList), xgetCValueCarrierno(), "CARRIERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)} <br>
     * <pre>e.g. setCarrierno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierno The value of carrierno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierno_LikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierno_NotLikeSearch(String carrierno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierno), xgetCValueCarrierno(), "CARRIERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIERNO: {varchar(30)}
     * @param carrierno The value of carrierno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierno_PrefixSearch(String carrierno) {
        setCarrierno_LikeSearch(carrierno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNull() { regCarrierno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNullOrEmpty() { regCarrierno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIERNO: {varchar(30)}
     */
    public void setCarrierno_IsNotNull() { regCarrierno(CK_ISNN, DOBJ); }

    protected void regCarrierno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierno(), "CARRIERNO"); }
    protected abstract ConditionValue xgetCValueCarrierno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_Equal(String tkhnorderno) {
        doSetTkhnorderno_Equal(fRES(tkhnorderno));
    }

    protected void doSetTkhnorderno_Equal(String tkhnorderno) {
        regTkhnorderno(CK_EQ, tkhnorderno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_NotEqual(String tkhnorderno) {
        doSetTkhnorderno_NotEqual(fRES(tkhnorderno));
    }

    protected void doSetTkhnorderno_NotEqual(String tkhnorderno) {
        regTkhnorderno(CK_NES, tkhnorderno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_GreaterThan(String tkhnorderno) {
        regTkhnorderno(CK_GT, fRES(tkhnorderno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_LessThan(String tkhnorderno) {
        regTkhnorderno(CK_LT, fRES(tkhnorderno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_GreaterEqual(String tkhnorderno) {
        regTkhnorderno(CK_GE, fRES(tkhnorderno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_LessEqual(String tkhnorderno) {
        regTkhnorderno(CK_LE, fRES(tkhnorderno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnordernoList The collection of tkhnorderno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_InScope(Collection<String> tkhnordernoList) {
        doSetTkhnorderno_InScope(tkhnordernoList);
    }

    protected void doSetTkhnorderno_InScope(Collection<String> tkhnordernoList) {
        regINS(CK_INS, cTL(tkhnordernoList), xgetCValueTkhnorderno(), "TKHNORDERNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnordernoList The collection of tkhnorderno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_NotInScope(Collection<String> tkhnordernoList) {
        doSetTkhnorderno_NotInScope(tkhnordernoList);
    }

    protected void doSetTkhnorderno_NotInScope(Collection<String> tkhnordernoList) {
        regINS(CK_NINS, cTL(tkhnordernoList), xgetCValueTkhnorderno(), "TKHNORDERNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)} <br>
     * <pre>e.g. setTkhnorderno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tkhnorderno The value of tkhnorderno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTkhnorderno_LikeSearch(String tkhnorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tkhnorderno), xgetCValueTkhnorderno(), "TKHNORDERNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTkhnorderno_NotLikeSearch(String tkhnorderno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tkhnorderno), xgetCValueTkhnorderno(), "TKHNORDERNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     * @param tkhnorderno The value of tkhnorderno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTkhnorderno_PrefixSearch(String tkhnorderno) {
        setTkhnorderno_LikeSearch(tkhnorderno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNull() { regTkhnorderno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNullOrEmpty() { regTkhnorderno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TKHNORDERNO: {varchar(30)}
     */
    public void setTkhnorderno_IsNotNull() { regTkhnorderno(CK_ISNN, DOBJ); }

    protected void regTkhnorderno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTkhnorderno(), "TKHNORDERNO"); }
    protected abstract ConditionValue xgetCValueTkhnorderno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_Equal(String srccd) {
        doSetSrccd_Equal(fRES(srccd));
    }

    protected void doSetSrccd_Equal(String srccd) {
        regSrccd(CK_EQ, srccd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_NotEqual(String srccd) {
        doSetSrccd_NotEqual(fRES(srccd));
    }

    protected void doSetSrccd_NotEqual(String srccd) {
        regSrccd(CK_NES, srccd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_GreaterThan(String srccd) {
        regSrccd(CK_GT, fRES(srccd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_LessThan(String srccd) {
        regSrccd(CK_LT, fRES(srccd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_GreaterEqual(String srccd) {
        regSrccd(CK_GE, fRES(srccd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_LessEqual(String srccd) {
        regSrccd(CK_LE, fRES(srccd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccdList The collection of srccd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_InScope(Collection<String> srccdList) {
        doSetSrccd_InScope(srccdList);
    }

    protected void doSetSrccd_InScope(Collection<String> srccdList) {
        regINS(CK_INS, cTL(srccdList), xgetCValueSrccd(), "SRCCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccdList The collection of srccd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_NotInScope(Collection<String> srccdList) {
        doSetSrccd_NotInScope(srccdList);
    }

    protected void doSetSrccd_NotInScope(Collection<String> srccdList) {
        regINS(CK_NINS, cTL(srccdList), xgetCValueSrccd(), "SRCCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)} <br>
     * <pre>e.g. setSrccd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srccd The value of srccd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrccd_LikeSearch(String srccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srccd), xgetCValueSrccd(), "SRCCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrccd_NotLikeSearch(String srccd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srccd), xgetCValueSrccd(), "SRCCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SRCCD: {varchar(30)}
     * @param srccd The value of srccd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrccd_PrefixSearch(String srccd) {
        setSrccd_LikeSearch(srccd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNull() { regSrccd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNullOrEmpty() { regSrccd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SRCCD: {varchar(30)}
     */
    public void setSrccd_IsNotNull() { regSrccd(CK_ISNN, DOBJ); }

    protected void regSrccd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrccd(), "SRCCD"); }
    protected abstract ConditionValue xgetCValueSrccd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_Equal(String blno) {
        doSetBlno_Equal(fRES(blno));
    }

    protected void doSetBlno_Equal(String blno) {
        regBlno(CK_EQ, blno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_NotEqual(String blno) {
        doSetBlno_NotEqual(fRES(blno));
    }

    protected void doSetBlno_NotEqual(String blno) {
        regBlno(CK_NES, blno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_GreaterThan(String blno) {
        regBlno(CK_GT, fRES(blno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_LessThan(String blno) {
        regBlno(CK_LT, fRES(blno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_GreaterEqual(String blno) {
        regBlno(CK_GE, fRES(blno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_LessEqual(String blno) {
        regBlno(CK_LE, fRES(blno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blnoList The collection of blno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_InScope(Collection<String> blnoList) {
        doSetBlno_InScope(blnoList);
    }

    protected void doSetBlno_InScope(Collection<String> blnoList) {
        regINS(CK_INS, cTL(blnoList), xgetCValueBlno(), "BLNO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blnoList The collection of blno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_NotInScope(Collection<String> blnoList) {
        doSetBlno_NotInScope(blnoList);
    }

    protected void doSetBlno_NotInScope(Collection<String> blnoList) {
        regINS(CK_NINS, cTL(blnoList), xgetCValueBlno(), "BLNO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)} <br>
     * <pre>e.g. setBlno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param blno The value of blno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBlno_LikeSearch(String blno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(blno), xgetCValueBlno(), "BLNO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBlno_NotLikeSearch(String blno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(blno), xgetCValueBlno(), "BLNO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BLNO: {varchar(60)}
     * @param blno The value of blno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBlno_PrefixSearch(String blno) {
        setBlno_LikeSearch(blno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNull() { regBlno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNullOrEmpty() { regBlno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BLNO: {varchar(60)}
     */
    public void setBlno_IsNotNull() { regBlno(CK_ISNN, DOBJ); }

    protected void regBlno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBlno(), "BLNO"); }
    protected abstract ConditionValue xgetCValueBlno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_Equal(String invoiceno) {
        doSetInvoiceno_Equal(fRES(invoiceno));
    }

    protected void doSetInvoiceno_Equal(String invoiceno) {
        regInvoiceno(CK_EQ, invoiceno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_NotEqual(String invoiceno) {
        doSetInvoiceno_NotEqual(fRES(invoiceno));
    }

    protected void doSetInvoiceno_NotEqual(String invoiceno) {
        regInvoiceno(CK_NES, invoiceno);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_GreaterThan(String invoiceno) {
        regInvoiceno(CK_GT, fRES(invoiceno));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_LessThan(String invoiceno) {
        regInvoiceno(CK_LT, fRES(invoiceno));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_GreaterEqual(String invoiceno) {
        regInvoiceno(CK_GE, fRES(invoiceno));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_LessEqual(String invoiceno) {
        regInvoiceno(CK_LE, fRES(invoiceno));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoicenoList The collection of invoiceno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_InScope(Collection<String> invoicenoList) {
        doSetInvoiceno_InScope(invoicenoList);
    }

    protected void doSetInvoiceno_InScope(Collection<String> invoicenoList) {
        regINS(CK_INS, cTL(invoicenoList), xgetCValueInvoiceno(), "INVOICENO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoicenoList The collection of invoiceno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_NotInScope(Collection<String> invoicenoList) {
        doSetInvoiceno_NotInScope(invoicenoList);
    }

    protected void doSetInvoiceno_NotInScope(Collection<String> invoicenoList) {
        regINS(CK_NINS, cTL(invoicenoList), xgetCValueInvoiceno(), "INVOICENO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)} <br>
     * <pre>e.g. setInvoiceno_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceno The value of invoiceno as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceno_LikeSearch(String invoiceno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceno), xgetCValueInvoiceno(), "INVOICENO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceno_NotLikeSearch(String invoiceno, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceno), xgetCValueInvoiceno(), "INVOICENO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICENO: {varchar(60)}
     * @param invoiceno The value of invoiceno as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceno_PrefixSearch(String invoiceno) {
        setInvoiceno_LikeSearch(invoiceno, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNull() { regInvoiceno(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNullOrEmpty() { regInvoiceno(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICENO: {varchar(60)}
     */
    public void setInvoiceno_IsNotNull() { regInvoiceno(CK_ISNN, DOBJ); }

    protected void regInvoiceno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceno(), "INVOICENO"); }
    protected abstract ConditionValue xgetCValueInvoiceno();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_Equal(String sscc) {
        doSetSscc_Equal(fRES(sscc));
    }

    protected void doSetSscc_Equal(String sscc) {
        regSscc(CK_EQ, sscc);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotEqual(String sscc) {
        doSetSscc_NotEqual(fRES(sscc));
    }

    protected void doSetSscc_NotEqual(String sscc) {
        regSscc(CK_NES, sscc);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterThan(String sscc) {
        regSscc(CK_GT, fRES(sscc));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessThan(String sscc) {
        regSscc(CK_LT, fRES(sscc));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_GreaterEqual(String sscc) {
        regSscc(CK_GE, fRES(sscc));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_LessEqual(String sscc) {
        regSscc(CK_LE, fRES(sscc));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_InScope(Collection<String> ssccList) {
        doSetSscc_InScope(ssccList);
    }

    protected void doSetSscc_InScope(Collection<String> ssccList) {
        regINS(CK_INS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param ssccList The collection of sscc as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_NotInScope(Collection<String> ssccList) {
        doSetSscc_NotInScope(ssccList);
    }

    protected void doSetSscc_NotInScope(Collection<String> ssccList) {
        regINS(CK_NINS, cTL(ssccList), xgetCValueSscc(), "SSCC");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)} <br>
     * <pre>e.g. setSscc_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sscc The value of sscc as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSscc_LikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSscc_NotLikeSearch(String sscc, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sscc), xgetCValueSscc(), "SSCC", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SSCC: {varchar(30)}
     * @param sscc The value of sscc as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSscc_PrefixSearch(String sscc) {
        setSscc_LikeSearch(sscc, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNull() { regSscc(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNullOrEmpty() { regSscc(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SSCC: {varchar(30)}
     */
    public void setSscc_IsNotNull() { regSscc(CK_ISNN, DOBJ); }

    protected void regSscc(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSscc(), "SSCC"); }
    protected abstract ConditionValue xgetCValueSscc();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_Equal(Long invNum) {
        doSetInvNum_Equal(invNum);
    }

    protected void doSetInvNum_Equal(Long invNum) {
        regInvNum(CK_EQ, invNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_NotEqual(Long invNum) {
        doSetInvNum_NotEqual(invNum);
    }

    protected void doSetInvNum_NotEqual(Long invNum) {
        regInvNum(CK_NES, invNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterThan(Long invNum) {
        regInvNum(CK_GT, invNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessThan(Long invNum) {
        regInvNum(CK_LT, invNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_GreaterEqual(Long invNum) {
        regInvNum(CK_GE, invNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNum The value of invNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvNum_LessEqual(Long invNum) {
        regInvNum(CK_LE, invNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param minNumber The min number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvNum(), "INV_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNumList The collection of invNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_InScope(Collection<Long> invNumList) {
        doSetInvNum_InScope(invNumList);
    }

    protected void doSetInvNum_InScope(Collection<Long> invNumList) {
        regINS(CK_INS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INV_NUM: {bigint(19)}
     * @param invNumList The collection of invNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvNum_NotInScope(Collection<Long> invNumList) {
        doSetInvNum_NotInScope(invNumList);
    }

    protected void doSetInvNum_NotInScope(Collection<Long> invNumList) {
        regINS(CK_NINS, cTL(invNumList), xgetCValueInvNum(), "INV_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     */
    public void setInvNum_IsNull() { regInvNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INV_NUM: {bigint(19)}
     */
    public void setInvNum_IsNotNull() { regInvNum(CK_ISNN, DOBJ); }

    protected void regInvNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvNum(), "INV_NUM"); }
    protected abstract ConditionValue xgetCValueInvNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_Equal(Long sortNum) {
        doSetSortNum_Equal(sortNum);
    }

    protected void doSetSortNum_Equal(Long sortNum) {
        regSortNum(CK_EQ, sortNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_NotEqual(Long sortNum) {
        doSetSortNum_NotEqual(sortNum);
    }

    protected void doSetSortNum_NotEqual(Long sortNum) {
        regSortNum(CK_NES, sortNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_GreaterThan(Long sortNum) {
        regSortNum(CK_GT, sortNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_LessThan(Long sortNum) {
        regSortNum(CK_LT, sortNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_GreaterEqual(Long sortNum) {
        regSortNum(CK_GE, sortNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNum The value of sortNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortNum_LessEqual(Long sortNum) {
        regSortNum(CK_LE, sortNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param minNumber The min number of sortNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortNum(), "SORT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNumList The collection of sortNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_InScope(Collection<Long> sortNumList) {
        doSetSortNum_InScope(sortNumList);
    }

    protected void doSetSortNum_InScope(Collection<Long> sortNumList) {
        regINS(CK_INS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_NUM: {bigint(19)}
     * @param sortNumList The collection of sortNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortNum_NotInScope(Collection<Long> sortNumList) {
        doSetSortNum_NotInScope(sortNumList);
    }

    protected void doSetSortNum_NotInScope(Collection<Long> sortNumList) {
        regINS(CK_NINS, cTL(sortNumList), xgetCValueSortNum(), "SORT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     */
    public void setSortNum_IsNull() { regSortNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_NUM: {bigint(19)}
     */
    public void setSortNum_IsNotNull() { regSortNum(CK_ISNN, DOBJ); }

    protected void regSortNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortNum(), "SORT_NUM"); }
    protected abstract ConditionValue xgetCValueSortNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_Equal(Long adoptNum) {
        doSetAdoptNum_Equal(adoptNum);
    }

    protected void doSetAdoptNum_Equal(Long adoptNum) {
        regAdoptNum(CK_EQ, adoptNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_NotEqual(Long adoptNum) {
        doSetAdoptNum_NotEqual(adoptNum);
    }

    protected void doSetAdoptNum_NotEqual(Long adoptNum) {
        regAdoptNum(CK_NES, adoptNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterThan(Long adoptNum) {
        regAdoptNum(CK_GT, adoptNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_LessThan(Long adoptNum) {
        regAdoptNum(CK_LT, adoptNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_GreaterEqual(Long adoptNum) {
        regAdoptNum(CK_GE, adoptNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNum The value of adoptNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAdoptNum_LessEqual(Long adoptNum) {
        regAdoptNum(CK_LE, adoptNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param minNumber The min number of adoptNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of adoptNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAdoptNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAdoptNum(), "ADOPT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNumList The collection of adoptNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_InScope(Collection<Long> adoptNumList) {
        doSetAdoptNum_InScope(adoptNumList);
    }

    protected void doSetAdoptNum_InScope(Collection<Long> adoptNumList) {
        regINS(CK_INS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     * @param adoptNumList The collection of adoptNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAdoptNum_NotInScope(Collection<Long> adoptNumList) {
        doSetAdoptNum_NotInScope(adoptNumList);
    }

    protected void doSetAdoptNum_NotInScope(Collection<Long> adoptNumList) {
        regINS(CK_NINS, cTL(adoptNumList), xgetCValueAdoptNum(), "ADOPT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     */
    public void setAdoptNum_IsNull() { regAdoptNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADOPT_NUM: {bigint(19)}
     */
    public void setAdoptNum_IsNotNull() { regAdoptNum(CK_ISNN, DOBJ); }

    protected void regAdoptNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAdoptNum(), "ADOPT_NUM"); }
    protected abstract ConditionValue xgetCValueAdoptNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_Equal(String sendCd) {
        doSetSendCd_Equal(fRES(sendCd));
    }

    protected void doSetSendCd_Equal(String sendCd) {
        regSendCd(CK_EQ, sendCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotEqual(String sendCd) {
        doSetSendCd_NotEqual(fRES(sendCd));
    }

    protected void doSetSendCd_NotEqual(String sendCd) {
        regSendCd(CK_NES, sendCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterThan(String sendCd) {
        regSendCd(CK_GT, fRES(sendCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessThan(String sendCd) {
        regSendCd(CK_LT, fRES(sendCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_GreaterEqual(String sendCd) {
        regSendCd(CK_GE, fRES(sendCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_LessEqual(String sendCd) {
        regSendCd(CK_LE, fRES(sendCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_InScope(Collection<String> sendCdList) {
        doSetSendCd_InScope(sendCdList);
    }

    protected void doSetSendCd_InScope(Collection<String> sendCdList) {
        regINS(CK_INS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCdList The collection of sendCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_NotInScope(Collection<String> sendCdList) {
        doSetSendCd_NotInScope(sendCdList);
    }

    protected void doSetSendCd_NotInScope(Collection<String> sendCdList) {
        regINS(CK_NINS, cTL(sendCdList), xgetCValueSendCd(), "SEND_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)} <br>
     * <pre>e.g. setSendCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendCd The value of sendCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendCd_LikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendCd_NotLikeSearch(String sendCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendCd), xgetCValueSendCd(), "SEND_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_CD: {varchar(30)}
     * @param sendCd The value of sendCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendCd_PrefixSearch(String sendCd) {
        setSendCd_LikeSearch(sendCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNull() { regSendCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNullOrEmpty() { regSendCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEND_CD: {varchar(30)}
     */
    public void setSendCd_IsNotNull() { regSendCd(CK_ISNN, DOBJ); }

    protected void regSendCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendCd(), "SEND_CD"); }
    protected abstract ConditionValue xgetCValueSendCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_Equal(String sendFlg) {
        doSetSendFlg_Equal(fRES(sendFlg));
    }

    protected void doSetSendFlg_Equal(String sendFlg) {
        regSendFlg(CK_EQ, sendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotEqual(String sendFlg) {
        doSetSendFlg_NotEqual(fRES(sendFlg));
    }

    protected void doSetSendFlg_NotEqual(String sendFlg) {
        regSendFlg(CK_NES, sendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterThan(String sendFlg) {
        regSendFlg(CK_GT, fRES(sendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessThan(String sendFlg) {
        regSendFlg(CK_LT, fRES(sendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterEqual(String sendFlg) {
        regSendFlg(CK_GE, fRES(sendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessEqual(String sendFlg) {
        regSendFlg(CK_LE, fRES(sendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlgList The collection of sendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_InScope(Collection<String> sendFlgList) {
        doSetSendFlg_InScope(sendFlgList);
    }

    protected void doSetSendFlg_InScope(Collection<String> sendFlgList) {
        regINS(CK_INS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlgList The collection of sendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotInScope(Collection<String> sendFlgList) {
        doSetSendFlg_NotInScope(sendFlgList);
    }

    protected void doSetSendFlg_NotInScope(Collection<String> sendFlgList) {
        regINS(CK_NINS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, char(1)} <br>
     * <pre>e.g. setSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendFlg The value of sendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendFlg_LikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendFlg_NotLikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, char(1)}
     * @param sendFlg The value of sendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_PrefixSearch(String sendFlg) {
        setSendFlg_LikeSearch(sendFlg, xcLSOPPre());
    }

    protected void regSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendFlg(), "SEND_FLG"); }
    protected abstract ConditionValue xgetCValueSendFlg();

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
    public HpSLCFunction<ETrackingInfoImportCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ETrackingInfoImportCB.class);
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
    public HpSLCFunction<ETrackingInfoImportCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ETrackingInfoImportCB.class);
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
    public HpSLCFunction<ETrackingInfoImportCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ETrackingInfoImportCB.class);
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
    public HpSLCFunction<ETrackingInfoImportCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ETrackingInfoImportCB.class);
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
    public HpSLCFunction<ETrackingInfoImportCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ETrackingInfoImportCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ETrackingInfoImportCB&gt;() {
     *     public void query(ETrackingInfoImportCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ETrackingInfoImportCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ETrackingInfoImportCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrackingInfoImportCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ETrackingInfoImportCQ sq);

    protected ETrackingInfoImportCB xcreateScalarConditionCB() {
        ETrackingInfoImportCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ETrackingInfoImportCB xcreateScalarConditionPartitionByCB() {
        ETrackingInfoImportCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ETrackingInfoImportCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrackingInfoImportCB cb = new ETrackingInfoImportCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRACKING_INFO_IMPORT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ETrackingInfoImportCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ETrackingInfoImportCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ETrackingInfoImportCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ETrackingInfoImportCB cb = new ETrackingInfoImportCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRACKING_INFO_IMPORT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ETrackingInfoImportCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ETrackingInfoImportCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ETrackingInfoImportCB cb = new ETrackingInfoImportCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ETrackingInfoImportCQ sq);

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
    protected ETrackingInfoImportCB newMyCB() {
        return new ETrackingInfoImportCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ETrackingInfoImportCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
