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
 * The abstract condition-query of T_TRZONEINVENTORY.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrzoneinventoryCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrzoneinventoryCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRZONEINVENTORY";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_Equal(java.math.BigDecimal trzoneinventorykey) {
        doSetTrzoneinventorykey_Equal(trzoneinventorykey);
    }

    protected void doSetTrzoneinventorykey_Equal(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_EQ, trzoneinventorykey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_NotEqual(java.math.BigDecimal trzoneinventorykey) {
        doSetTrzoneinventorykey_NotEqual(trzoneinventorykey);
    }

    protected void doSetTrzoneinventorykey_NotEqual(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_NES, trzoneinventorykey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_GreaterThan(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_GT, trzoneinventorykey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_LessThan(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_LT, trzoneinventorykey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_GreaterEqual(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_GE, trzoneinventorykey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykey The value of trzoneinventorykey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_LessEqual(java.math.BigDecimal trzoneinventorykey) {
        regTrzoneinventorykey(CK_LE, trzoneinventorykey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param minNumber The min number of trzoneinventorykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trzoneinventorykey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrzoneinventorykey_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrzoneinventorykey(), "TRZONEINVENTORYKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykeyList The collection of trzoneinventorykey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_InScope(Collection<java.math.BigDecimal> trzoneinventorykeyList) {
        doSetTrzoneinventorykey_InScope(trzoneinventorykeyList);
    }

    protected void doSetTrzoneinventorykey_InScope(Collection<java.math.BigDecimal> trzoneinventorykeyList) {
        regINS(CK_INS, cTL(trzoneinventorykeyList), xgetCValueTrzoneinventorykey(), "TRZONEINVENTORYKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     * @param trzoneinventorykeyList The collection of trzoneinventorykey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrzoneinventorykey_NotInScope(Collection<java.math.BigDecimal> trzoneinventorykeyList) {
        doSetTrzoneinventorykey_NotInScope(trzoneinventorykeyList);
    }

    protected void doSetTrzoneinventorykey_NotInScope(Collection<java.math.BigDecimal> trzoneinventorykeyList) {
        regINS(CK_NINS, cTL(trzoneinventorykeyList), xgetCValueTrzoneinventorykey(), "TRZONEINVENTORYKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setTrzoneinventorykey_IsNull() { regTrzoneinventorykey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRZONEINVENTORYKEY: {PK, NotNull, decimal(16, 6)}
     */
    public void setTrzoneinventorykey_IsNotNull() { regTrzoneinventorykey(CK_ISNN, DOBJ); }

    protected void regTrzoneinventorykey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrzoneinventorykey(), "TRZONEINVENTORYKEY"); }
    protected abstract ConditionValue xgetCValueTrzoneinventorykey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterThan(String warehousecd) {
        regWarehousecd(CK_GT, fRES(warehousecd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessThan(String warehousecd) {
        regWarehousecd(CK_LT, fRES(warehousecd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_GreaterEqual(String warehousecd) {
        regWarehousecd(CK_GE, fRES(warehousecd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_LessEqual(String warehousecd) {
        regWarehousecd(CK_LE, fRES(warehousecd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)} <br>
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
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehousecd_NotLikeSearch(String warehousecd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehousecd), xgetCValueWarehousecd(), "WAREHOUSECD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     * @param warehousecd The value of warehousecd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehousecd_PrefixSearch(String warehousecd) {
        setWarehousecd_LikeSearch(warehousecd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     */
    public void setWarehousecd_IsNull() { regWarehousecd(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSECD: {PK, NotNull, varchar(30)}
     */
    public void setWarehousecd_IsNotNull() { regWarehousecd(CK_ISNN, DOBJ); }

    protected void regWarehousecd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehousecd(), "WAREHOUSECD"); }
    protected abstract ConditionValue xgetCValueWarehousecd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
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
     * FLOOR: {PK, NotNull, varchar(60)}
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
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
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
     * FLOOR: {PK, NotNull, varchar(60)}
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
     * FLOOR: {PK, NotNull, varchar(60)} <br>
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
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     */
    public void setFloor_IsNull() { regFloor(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR: {PK, NotNull, varchar(60)}
     */
    public void setFloor_IsNotNull() { regFloor(CK_ISNN, DOBJ); }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_Equal(String zone) {
        doSetZone_Equal(fRES(zone));
    }

    protected void doSetZone_Equal(String zone) {
        regZone(CK_EQ, zone);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_NotEqual(String zone) {
        doSetZone_NotEqual(fRES(zone));
    }

    protected void doSetZone_NotEqual(String zone) {
        regZone(CK_NES, zone);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_GreaterThan(String zone) {
        regZone(CK_GT, fRES(zone));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_LessThan(String zone) {
        regZone(CK_LT, fRES(zone));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_GreaterEqual(String zone) {
        regZone(CK_GE, fRES(zone));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_LessEqual(String zone) {
        regZone(CK_LE, fRES(zone));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zoneList The collection of zone as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_InScope(Collection<String> zoneList) {
        doSetZone_InScope(zoneList);
    }

    protected void doSetZone_InScope(Collection<String> zoneList) {
        regINS(CK_INS, cTL(zoneList), xgetCValueZone(), "ZONE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zoneList The collection of zone as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_NotInScope(Collection<String> zoneList) {
        doSetZone_NotInScope(zoneList);
    }

    protected void doSetZone_NotInScope(Collection<String> zoneList) {
        regINS(CK_NINS, cTL(zoneList), xgetCValueZone(), "ZONE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)} <br>
     * <pre>e.g. setZone_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zone The value of zone as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZone_LikeSearch(String zone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zone), xgetCValueZone(), "ZONE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZone_NotLikeSearch(String zone, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zone), xgetCValueZone(), "ZONE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     * @param zone The value of zone as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZone_PrefixSearch(String zone) {
        setZone_LikeSearch(zone, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     */
    public void setZone_IsNull() { regZone(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE: {PK, NotNull, varchar(60)}
     */
    public void setZone_IsNotNull() { regZone(CK_ISNN, DOBJ); }

    protected void regZone(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZone(), "ZONE"); }
    protected abstract ConditionValue xgetCValueZone();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_Equal(java.math.BigDecimal palletcapacity) {
        doSetPalletcapacity_Equal(palletcapacity);
    }

    protected void doSetPalletcapacity_Equal(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_EQ, palletcapacity);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_NotEqual(java.math.BigDecimal palletcapacity) {
        doSetPalletcapacity_NotEqual(palletcapacity);
    }

    protected void doSetPalletcapacity_NotEqual(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_NES, palletcapacity);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_GreaterThan(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_GT, palletcapacity);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_LessThan(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_LT, palletcapacity);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_GreaterEqual(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_GE, palletcapacity);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacity The value of palletcapacity as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletcapacity_LessEqual(java.math.BigDecimal palletcapacity) {
        regPalletcapacity(CK_LE, palletcapacity);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param minNumber The min number of palletcapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletcapacity. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletcapacity_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletcapacity(), "PALLETCAPACITY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacityList The collection of palletcapacity as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcapacity_InScope(Collection<java.math.BigDecimal> palletcapacityList) {
        doSetPalletcapacity_InScope(palletcapacityList);
    }

    protected void doSetPalletcapacity_InScope(Collection<java.math.BigDecimal> palletcapacityList) {
        regINS(CK_INS, cTL(palletcapacityList), xgetCValuePalletcapacity(), "PALLETCAPACITY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     * @param palletcapacityList The collection of palletcapacity as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletcapacity_NotInScope(Collection<java.math.BigDecimal> palletcapacityList) {
        doSetPalletcapacity_NotInScope(palletcapacityList);
    }

    protected void doSetPalletcapacity_NotInScope(Collection<java.math.BigDecimal> palletcapacityList) {
        regINS(CK_NINS, cTL(palletcapacityList), xgetCValuePalletcapacity(), "PALLETCAPACITY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     */
    public void setPalletcapacity_IsNull() { regPalletcapacity(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETCAPACITY: {decimal(16, 6)}
     */
    public void setPalletcapacity_IsNotNull() { regPalletcapacity(CK_ISNN, DOBJ); }

    protected void regPalletcapacity(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletcapacity(), "PALLETCAPACITY"); }
    protected abstract ConditionValue xgetCValuePalletcapacity();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_Equal(java.math.BigDecimal palletspace) {
        doSetPalletspace_Equal(palletspace);
    }

    protected void doSetPalletspace_Equal(java.math.BigDecimal palletspace) {
        regPalletspace(CK_EQ, palletspace);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_NotEqual(java.math.BigDecimal palletspace) {
        doSetPalletspace_NotEqual(palletspace);
    }

    protected void doSetPalletspace_NotEqual(java.math.BigDecimal palletspace) {
        regPalletspace(CK_NES, palletspace);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_GreaterThan(java.math.BigDecimal palletspace) {
        regPalletspace(CK_GT, palletspace);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_LessThan(java.math.BigDecimal palletspace) {
        regPalletspace(CK_LT, palletspace);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_GreaterEqual(java.math.BigDecimal palletspace) {
        regPalletspace(CK_GE, palletspace);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspace The value of palletspace as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletspace_LessEqual(java.math.BigDecimal palletspace) {
        regPalletspace(CK_LE, palletspace);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param minNumber The min number of palletspace. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletspace. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletspace_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletspace(), "PALLETSPACE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspaceList The collection of palletspace as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletspace_InScope(Collection<java.math.BigDecimal> palletspaceList) {
        doSetPalletspace_InScope(palletspaceList);
    }

    protected void doSetPalletspace_InScope(Collection<java.math.BigDecimal> palletspaceList) {
        regINS(CK_INS, cTL(palletspaceList), xgetCValuePalletspace(), "PALLETSPACE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     * @param palletspaceList The collection of palletspace as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletspace_NotInScope(Collection<java.math.BigDecimal> palletspaceList) {
        doSetPalletspace_NotInScope(palletspaceList);
    }

    protected void doSetPalletspace_NotInScope(Collection<java.math.BigDecimal> palletspaceList) {
        regINS(CK_NINS, cTL(palletspaceList), xgetCValuePalletspace(), "PALLETSPACE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     */
    public void setPalletspace_IsNull() { regPalletspace(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PALLETSPACE: {decimal(16, 6)}
     */
    public void setPalletspace_IsNotNull() { regPalletspace(CK_ISNN, DOBJ); }

    protected void regPalletspace(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletspace(), "PALLETSPACE"); }
    protected abstract ConditionValue xgetCValuePalletspace();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_Equal(java.math.BigDecimal zoneinvflg) {
        doSetZoneinvflg_Equal(zoneinvflg);
    }

    protected void doSetZoneinvflg_Equal(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_EQ, zoneinvflg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_NotEqual(java.math.BigDecimal zoneinvflg) {
        doSetZoneinvflg_NotEqual(zoneinvflg);
    }

    protected void doSetZoneinvflg_NotEqual(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_NES, zoneinvflg);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_GreaterThan(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_GT, zoneinvflg);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_LessThan(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_LT, zoneinvflg);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_GreaterEqual(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_GE, zoneinvflg);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflg The value of zoneinvflg as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setZoneinvflg_LessEqual(java.math.BigDecimal zoneinvflg) {
        regZoneinvflg(CK_LE, zoneinvflg);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param minNumber The min number of zoneinvflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of zoneinvflg. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setZoneinvflg_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueZoneinvflg(), "ZONEINVFLG", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflgList The collection of zoneinvflg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneinvflg_InScope(Collection<java.math.BigDecimal> zoneinvflgList) {
        doSetZoneinvflg_InScope(zoneinvflgList);
    }

    protected void doSetZoneinvflg_InScope(Collection<java.math.BigDecimal> zoneinvflgList) {
        regINS(CK_INS, cTL(zoneinvflgList), xgetCValueZoneinvflg(), "ZONEINVFLG");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     * @param zoneinvflgList The collection of zoneinvflg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneinvflg_NotInScope(Collection<java.math.BigDecimal> zoneinvflgList) {
        doSetZoneinvflg_NotInScope(zoneinvflgList);
    }

    protected void doSetZoneinvflg_NotInScope(Collection<java.math.BigDecimal> zoneinvflgList) {
        regINS(CK_NINS, cTL(zoneinvflgList), xgetCValueZoneinvflg(), "ZONEINVFLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     */
    public void setZoneinvflg_IsNull() { regZoneinvflg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONEINVFLG: {decimal(16, 6)}
     */
    public void setZoneinvflg_IsNotNull() { regZoneinvflg(CK_ISNN, DOBJ); }

    protected void regZoneinvflg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneinvflg(), "ZONEINVFLG"); }
    protected abstract ConditionValue xgetCValueZoneinvflg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_Equal(java.math.BigDecimal qty1allocated) {
        doSetQty1allocated_Equal(qty1allocated);
    }

    protected void doSetQty1allocated_Equal(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_EQ, qty1allocated);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_NotEqual(java.math.BigDecimal qty1allocated) {
        doSetQty1allocated_NotEqual(qty1allocated);
    }

    protected void doSetQty1allocated_NotEqual(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_NES, qty1allocated);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_GreaterThan(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_GT, qty1allocated);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_LessThan(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_LT, qty1allocated);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_GreaterEqual(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_GE, qty1allocated);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocated The value of qty1allocated as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setQty1allocated_LessEqual(java.math.BigDecimal qty1allocated) {
        regQty1allocated(CK_LE, qty1allocated);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param minNumber The min number of qty1allocated. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of qty1allocated. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setQty1allocated_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueQty1allocated(), "QTY1ALLOCATED", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocatedList The collection of qty1allocated as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1allocated_InScope(Collection<java.math.BigDecimal> qty1allocatedList) {
        doSetQty1allocated_InScope(qty1allocatedList);
    }

    protected void doSetQty1allocated_InScope(Collection<java.math.BigDecimal> qty1allocatedList) {
        regINS(CK_INS, cTL(qty1allocatedList), xgetCValueQty1allocated(), "QTY1ALLOCATED");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     * @param qty1allocatedList The collection of qty1allocated as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setQty1allocated_NotInScope(Collection<java.math.BigDecimal> qty1allocatedList) {
        doSetQty1allocated_NotInScope(qty1allocatedList);
    }

    protected void doSetQty1allocated_NotInScope(Collection<java.math.BigDecimal> qty1allocatedList) {
        regINS(CK_NINS, cTL(qty1allocatedList), xgetCValueQty1allocated(), "QTY1ALLOCATED");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     */
    public void setQty1allocated_IsNull() { regQty1allocated(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * QTY1ALLOCATED: {decimal(16, 6)}
     */
    public void setQty1allocated_IsNotNull() { regQty1allocated(CK_ISNN, DOBJ); }

    protected void regQty1allocated(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueQty1allocated(), "QTY1ALLOCATED"); }
    protected abstract ConditionValue xgetCValueQty1allocated();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_Equal(java.math.BigDecimal rcvqty) {
        doSetRcvqty_Equal(rcvqty);
    }

    protected void doSetRcvqty_Equal(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_EQ, rcvqty);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_NotEqual(java.math.BigDecimal rcvqty) {
        doSetRcvqty_NotEqual(rcvqty);
    }

    protected void doSetRcvqty_NotEqual(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_NES, rcvqty);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_GreaterThan(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_GT, rcvqty);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_LessThan(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_LT, rcvqty);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_GreaterEqual(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_GE, rcvqty);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqty The value of rcvqty as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvqty_LessEqual(java.math.BigDecimal rcvqty) {
        regRcvqty(CK_LE, rcvqty);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param minNumber The min number of rcvqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvqty. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvqty_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvqty(), "RCVQTY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqtyList The collection of rcvqty as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_InScope(Collection<java.math.BigDecimal> rcvqtyList) {
        doSetRcvqty_InScope(rcvqtyList);
    }

    protected void doSetRcvqty_InScope(Collection<java.math.BigDecimal> rcvqtyList) {
        regINS(CK_INS, cTL(rcvqtyList), xgetCValueRcvqty(), "RCVQTY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     * @param rcvqtyList The collection of rcvqty as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvqty_NotInScope(Collection<java.math.BigDecimal> rcvqtyList) {
        doSetRcvqty_NotInScope(rcvqtyList);
    }

    protected void doSetRcvqty_NotInScope(Collection<java.math.BigDecimal> rcvqtyList) {
        regINS(CK_NINS, cTL(rcvqtyList), xgetCValueRcvqty(), "RCVQTY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setRcvqty_IsNull() { regRcvqty(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCVQTY: {decimal(16, 6), default=[(0)]}
     */
    public void setRcvqty_IsNotNull() { regRcvqty(CK_ISNN, DOBJ); }

    protected void regRcvqty(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvqty(), "RCVQTY"); }
    protected abstract ConditionValue xgetCValueRcvqty();

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
    public HpSLCFunction<TTrzoneinventoryCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrzoneinventoryCB.class);
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
    public HpSLCFunction<TTrzoneinventoryCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrzoneinventoryCB.class);
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
    public HpSLCFunction<TTrzoneinventoryCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrzoneinventoryCB.class);
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
    public HpSLCFunction<TTrzoneinventoryCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrzoneinventoryCB.class);
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
    public HpSLCFunction<TTrzoneinventoryCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrzoneinventoryCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrzoneinventoryCB&gt;() {
     *     public void query(TTrzoneinventoryCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrzoneinventoryCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrzoneinventoryCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrzoneinventoryCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrzoneinventoryCQ sq);

    protected TTrzoneinventoryCB xcreateScalarConditionCB() {
        TTrzoneinventoryCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrzoneinventoryCB xcreateScalarConditionPartitionByCB() {
        TTrzoneinventoryCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
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
    protected TTrzoneinventoryCB newMyCB() {
        return new TTrzoneinventoryCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrzoneinventoryCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
