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
 * The abstract condition-query of W_LOCATION_INPUT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWLocationInputCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWLocationInputCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "W_LOCATION_INPUT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_Equal(Long locationInputId) {
        doSetLocationInputId_Equal(locationInputId);
    }

    protected void doSetLocationInputId_Equal(Long locationInputId) {
        regLocationInputId(CK_EQ, locationInputId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_NotEqual(Long locationInputId) {
        doSetLocationInputId_NotEqual(locationInputId);
    }

    protected void doSetLocationInputId_NotEqual(Long locationInputId) {
        regLocationInputId(CK_NES, locationInputId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_GreaterThan(Long locationInputId) {
        regLocationInputId(CK_GT, locationInputId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_LessThan(Long locationInputId) {
        regLocationInputId(CK_LT, locationInputId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_GreaterEqual(Long locationInputId) {
        regLocationInputId(CK_GE, locationInputId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputId The value of locationInputId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationInputId_LessEqual(Long locationInputId) {
        regLocationInputId(CK_LE, locationInputId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of locationInputId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationInputId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationInputId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationInputId(), "LOCATION_INPUT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputIdList The collection of locationInputId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationInputId_InScope(Collection<Long> locationInputIdList) {
        doSetLocationInputId_InScope(locationInputIdList);
    }

    protected void doSetLocationInputId_InScope(Collection<Long> locationInputIdList) {
        regINS(CK_INS, cTL(locationInputIdList), xgetCValueLocationInputId(), "LOCATION_INPUT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param locationInputIdList The collection of locationInputId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationInputId_NotInScope(Collection<Long> locationInputIdList) {
        doSetLocationInputId_NotInScope(locationInputIdList);
    }

    protected void doSetLocationInputId_NotInScope(Collection<Long> locationInputIdList) {
        regINS(CK_NINS, cTL(locationInputIdList), xgetCValueLocationInputId(), "LOCATION_INPUT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLocationInputId_IsNull() { regLocationInputId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_INPUT_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setLocationInputId_IsNotNull() { regLocationInputId(CK_ISNN, DOBJ); }

    protected void regLocationInputId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationInputId(), "LOCATION_INPUT_ID"); }
    protected abstract ConditionValue xgetCValueLocationInputId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
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
     * CENTER_CD: {varchar(255)}
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
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
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
     * CENTER_CD: {varchar(255)}
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
     * CENTER_CD: {varchar(255)} <br>
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
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {varchar(255)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNull() { regCenterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNullOrEmpty() { regCenterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CD: {varchar(255)}
     */
    public void setCenterCd_IsNotNull() { regCenterCd(CK_ISNN, DOBJ); }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_Equal(String warehouseCd) {
        doSetWarehouseCd_Equal(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_Equal(String warehouseCd) {
        regWarehouseCd(CK_EQ, warehouseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotEqual(String warehouseCd) {
        doSetWarehouseCd_NotEqual(fRES(warehouseCd));
    }

    protected void doSetWarehouseCd_NotEqual(String warehouseCd) {
        regWarehouseCd(CK_NES, warehouseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterThan(String warehouseCd) {
        regWarehouseCd(CK_GT, fRES(warehouseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessThan(String warehouseCd) {
        regWarehouseCd(CK_LT, fRES(warehouseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_GreaterEqual(String warehouseCd) {
        regWarehouseCd(CK_GE, fRES(warehouseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_LessEqual(String warehouseCd) {
        regWarehouseCd(CK_LE, fRES(warehouseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_InScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_InScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_InScope(Collection<String> warehouseCdList) {
        regINS(CK_INS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCdList The collection of warehouseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        doSetWarehouseCd_NotInScope(warehouseCdList);
    }

    protected void doSetWarehouseCd_NotInScope(Collection<String> warehouseCdList) {
        regINS(CK_NINS, cTL(warehouseCdList), xgetCValueWarehouseCd(), "WAREHOUSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)} <br>
     * <pre>e.g. setWarehouseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param warehouseCd The value of warehouseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWarehouseCd_LikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWarehouseCd_NotLikeSearch(String warehouseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(warehouseCd), xgetCValueWarehouseCd(), "WAREHOUSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     * @param warehouseCd The value of warehouseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWarehouseCd_PrefixSearch(String warehouseCd) {
        setWarehouseCd_LikeSearch(warehouseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNull() { regWarehouseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNullOrEmpty() { regWarehouseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WAREHOUSE_CD: {varchar(255)}
     */
    public void setWarehouseCd_IsNotNull() { regWarehouseCd(CK_ISNN, DOBJ); }

    protected void regWarehouseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWarehouseCd(), "WAREHOUSE_CD"); }
    protected abstract ConditionValue xgetCValueWarehouseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_Equal(String zoneCd) {
        doSetZoneCd_Equal(fRES(zoneCd));
    }

    protected void doSetZoneCd_Equal(String zoneCd) {
        regZoneCd(CK_EQ, zoneCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotEqual(String zoneCd) {
        doSetZoneCd_NotEqual(fRES(zoneCd));
    }

    protected void doSetZoneCd_NotEqual(String zoneCd) {
        regZoneCd(CK_NES, zoneCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterThan(String zoneCd) {
        regZoneCd(CK_GT, fRES(zoneCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessThan(String zoneCd) {
        regZoneCd(CK_LT, fRES(zoneCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_GreaterEqual(String zoneCd) {
        regZoneCd(CK_GE, fRES(zoneCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_LessEqual(String zoneCd) {
        regZoneCd(CK_LE, fRES(zoneCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCdList The collection of zoneCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_InScope(Collection<String> zoneCdList) {
        doSetZoneCd_InScope(zoneCdList);
    }

    protected void doSetZoneCd_InScope(Collection<String> zoneCdList) {
        regINS(CK_INS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCdList The collection of zoneCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_NotInScope(Collection<String> zoneCdList) {
        doSetZoneCd_NotInScope(zoneCdList);
    }

    protected void doSetZoneCd_NotInScope(Collection<String> zoneCdList) {
        regINS(CK_NINS, cTL(zoneCdList), xgetCValueZoneCd(), "ZONE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)} <br>
     * <pre>e.g. setZoneCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zoneCd The value of zoneCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZoneCd_LikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZoneCd_NotLikeSearch(String zoneCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zoneCd), xgetCValueZoneCd(), "ZONE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZONE_CD: {varchar(255)}
     * @param zoneCd The value of zoneCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZoneCd_PrefixSearch(String zoneCd) {
        setZoneCd_LikeSearch(zoneCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNull() { regZoneCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNullOrEmpty() { regZoneCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZONE_CD: {varchar(255)}
     */
    public void setZoneCd_IsNotNull() { regZoneCd(CK_ISNN, DOBJ); }

    protected void regZoneCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZoneCd(), "ZONE_CD"); }
    protected abstract ConditionValue xgetCValueZoneCd();

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
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_Equal(String locationNm) {
        doSetLocationNm_Equal(fRES(locationNm));
    }

    protected void doSetLocationNm_Equal(String locationNm) {
        regLocationNm(CK_EQ, locationNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotEqual(String locationNm) {
        doSetLocationNm_NotEqual(fRES(locationNm));
    }

    protected void doSetLocationNm_NotEqual(String locationNm) {
        regLocationNm(CK_NES, locationNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterThan(String locationNm) {
        regLocationNm(CK_GT, fRES(locationNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessThan(String locationNm) {
        regLocationNm(CK_LT, fRES(locationNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_GreaterEqual(String locationNm) {
        regLocationNm(CK_GE, fRES(locationNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_LessEqual(String locationNm) {
        regLocationNm(CK_LE, fRES(locationNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNmList The collection of locationNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_InScope(Collection<String> locationNmList) {
        doSetLocationNm_InScope(locationNmList);
    }

    protected void doSetLocationNm_InScope(Collection<String> locationNmList) {
        regINS(CK_INS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNmList The collection of locationNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_NotInScope(Collection<String> locationNmList) {
        doSetLocationNm_NotInScope(locationNmList);
    }

    protected void doSetLocationNm_NotInScope(Collection<String> locationNmList) {
        regINS(CK_NINS, cTL(locationNmList), xgetCValueLocationNm(), "LOCATION_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)} <br>
     * <pre>e.g. setLocationNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationNm The value of locationNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationNm_LikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationNm_NotLikeSearch(String locationNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationNm), xgetCValueLocationNm(), "LOCATION_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     * @param locationNm The value of locationNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationNm_PrefixSearch(String locationNm) {
        setLocationNm_LikeSearch(locationNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNull() { regLocationNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNullOrEmpty() { regLocationNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_NM: {varchar(255)}
     */
    public void setLocationNm_IsNotNull() { regLocationNm(CK_ISNN, DOBJ); }

    protected void regLocationNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationNm(), "LOCATION_NM"); }
    protected abstract ConditionValue xgetCValueLocationNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_Equal(String pickingLocationFlg) {
        doSetPickingLocationFlg_Equal(fRES(pickingLocationFlg));
    }

    protected void doSetPickingLocationFlg_Equal(String pickingLocationFlg) {
        regPickingLocationFlg(CK_EQ, pickingLocationFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        doSetPickingLocationFlg_NotEqual(fRES(pickingLocationFlg));
    }

    protected void doSetPickingLocationFlg_NotEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_NES, pickingLocationFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_GreaterThan(String pickingLocationFlg) {
        regPickingLocationFlg(CK_GT, fRES(pickingLocationFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_LessThan(String pickingLocationFlg) {
        regPickingLocationFlg(CK_LT, fRES(pickingLocationFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_GreaterEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_GE, fRES(pickingLocationFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_LessEqual(String pickingLocationFlg) {
        regPickingLocationFlg(CK_LE, fRES(pickingLocationFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_InScope(pickingLocationFlgList);
    }

    protected void doSetPickingLocationFlg_InScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_INS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlgList The collection of pickingLocationFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        doSetPickingLocationFlg_NotInScope(pickingLocationFlgList);
    }

    protected void doSetPickingLocationFlg_NotInScope(Collection<String> pickingLocationFlgList) {
        regINS(CK_NINS, cTL(pickingLocationFlgList), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)} <br>
     * <pre>e.g. setPickingLocationFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingLocationFlg The value of pickingLocationFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingLocationFlg_LikeSearch(String pickingLocationFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingLocationFlg), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingLocationFlg_NotLikeSearch(String pickingLocationFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingLocationFlg), xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     * @param pickingLocationFlg The value of pickingLocationFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingLocationFlg_PrefixSearch(String pickingLocationFlg) {
        setPickingLocationFlg_LikeSearch(pickingLocationFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     */
    public void setPickingLocationFlg_IsNull() { regPickingLocationFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     */
    public void setPickingLocationFlg_IsNullOrEmpty() { regPickingLocationFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_LOCATION_FLG: {varchar(255)}
     */
    public void setPickingLocationFlg_IsNotNull() { regPickingLocationFlg(CK_ISNN, DOBJ); }

    protected void regPickingLocationFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingLocationFlg(), "PICKING_LOCATION_FLG"); }
    protected abstract ConditionValue xgetCValuePickingLocationFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_Equal(String pickingOrder) {
        doSetPickingOrder_Equal(fRES(pickingOrder));
    }

    protected void doSetPickingOrder_Equal(String pickingOrder) {
        regPickingOrder(CK_EQ, pickingOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_NotEqual(String pickingOrder) {
        doSetPickingOrder_NotEqual(fRES(pickingOrder));
    }

    protected void doSetPickingOrder_NotEqual(String pickingOrder) {
        regPickingOrder(CK_NES, pickingOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterThan(String pickingOrder) {
        regPickingOrder(CK_GT, fRES(pickingOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_LessThan(String pickingOrder) {
        regPickingOrder(CK_LT, fRES(pickingOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_GreaterEqual(String pickingOrder) {
        regPickingOrder(CK_GE, fRES(pickingOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_LessEqual(String pickingOrder) {
        regPickingOrder(CK_LE, fRES(pickingOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrderList The collection of pickingOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_InScope(Collection<String> pickingOrderList) {
        doSetPickingOrder_InScope(pickingOrderList);
    }

    protected void doSetPickingOrder_InScope(Collection<String> pickingOrderList) {
        regINS(CK_INS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrderList The collection of pickingOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_NotInScope(Collection<String> pickingOrderList) {
        doSetPickingOrder_NotInScope(pickingOrderList);
    }

    protected void doSetPickingOrder_NotInScope(Collection<String> pickingOrderList) {
        regINS(CK_NINS, cTL(pickingOrderList), xgetCValuePickingOrder(), "PICKING_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)} <br>
     * <pre>e.g. setPickingOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingOrder The value of pickingOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingOrder_LikeSearch(String pickingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingOrder), xgetCValuePickingOrder(), "PICKING_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingOrder_NotLikeSearch(String pickingOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingOrder), xgetCValuePickingOrder(), "PICKING_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     * @param pickingOrder The value of pickingOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingOrder_PrefixSearch(String pickingOrder) {
        setPickingOrder_LikeSearch(pickingOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNull() { regPickingOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNullOrEmpty() { regPickingOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_ORDER: {varchar(255)}
     */
    public void setPickingOrder_IsNotNull() { regPickingOrder(CK_ISNN, DOBJ); }

    protected void regPickingOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingOrder(), "PICKING_ORDER"); }
    protected abstract ConditionValue xgetCValuePickingOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_Equal(String locationType) {
        doSetLocationType_Equal(fRES(locationType));
    }

    protected void doSetLocationType_Equal(String locationType) {
        regLocationType(CK_EQ, locationType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotEqual(String locationType) {
        doSetLocationType_NotEqual(fRES(locationType));
    }

    protected void doSetLocationType_NotEqual(String locationType) {
        regLocationType(CK_NES, locationType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterThan(String locationType) {
        regLocationType(CK_GT, fRES(locationType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessThan(String locationType) {
        regLocationType(CK_LT, fRES(locationType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_GreaterEqual(String locationType) {
        regLocationType(CK_GE, fRES(locationType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_LessEqual(String locationType) {
        regLocationType(CK_LE, fRES(locationType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_InScope(Collection<String> locationTypeList) {
        doSetLocationType_InScope(locationTypeList);
    }

    protected void doSetLocationType_InScope(Collection<String> locationTypeList) {
        regINS(CK_INS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationTypeList The collection of locationType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_NotInScope(Collection<String> locationTypeList) {
        doSetLocationType_NotInScope(locationTypeList);
    }

    protected void doSetLocationType_NotInScope(Collection<String> locationTypeList) {
        regINS(CK_NINS, cTL(locationTypeList), xgetCValueLocationType(), "LOCATION_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)} <br>
     * <pre>e.g. setLocationType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationType The value of locationType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationType_LikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationType_NotLikeSearch(String locationType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationType), xgetCValueLocationType(), "LOCATION_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     * @param locationType The value of locationType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationType_PrefixSearch(String locationType) {
        setLocationType_LikeSearch(locationType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNull() { regLocationType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNullOrEmpty() { regLocationType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_TYPE: {varchar(255)}
     */
    public void setLocationType_IsNotNull() { regLocationType(CK_ISNN, DOBJ); }

    protected void regLocationType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationType(), "LOCATION_TYPE"); }
    protected abstract ConditionValue xgetCValueLocationType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_Equal(String allocOrder) {
        doSetAllocOrder_Equal(fRES(allocOrder));
    }

    protected void doSetAllocOrder_Equal(String allocOrder) {
        regAllocOrder(CK_EQ, allocOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotEqual(String allocOrder) {
        doSetAllocOrder_NotEqual(fRES(allocOrder));
    }

    protected void doSetAllocOrder_NotEqual(String allocOrder) {
        regAllocOrder(CK_NES, allocOrder);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterThan(String allocOrder) {
        regAllocOrder(CK_GT, fRES(allocOrder));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_LessThan(String allocOrder) {
        regAllocOrder(CK_LT, fRES(allocOrder));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterEqual(String allocOrder) {
        regAllocOrder(CK_GE, fRES(allocOrder));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_LessEqual(String allocOrder) {
        regAllocOrder(CK_LE, fRES(allocOrder));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrderList The collection of allocOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_InScope(Collection<String> allocOrderList) {
        doSetAllocOrder_InScope(allocOrderList);
    }

    protected void doSetAllocOrder_InScope(Collection<String> allocOrderList) {
        regINS(CK_INS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrderList The collection of allocOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotInScope(Collection<String> allocOrderList) {
        doSetAllocOrder_NotInScope(allocOrderList);
    }

    protected void doSetAllocOrder_NotInScope(Collection<String> allocOrderList) {
        regINS(CK_NINS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)} <br>
     * <pre>e.g. setAllocOrder_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocOrder The value of allocOrder as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocOrder_LikeSearch(String allocOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocOrder), xgetCValueAllocOrder(), "ALLOC_ORDER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocOrder_NotLikeSearch(String allocOrder, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocOrder), xgetCValueAllocOrder(), "ALLOC_ORDER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     * @param allocOrder The value of allocOrder as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_PrefixSearch(String allocOrder) {
        setAllocOrder_LikeSearch(allocOrder, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNull() { regAllocOrder(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNullOrEmpty() { regAllocOrder(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {varchar(255)}
     */
    public void setAllocOrder_IsNotNull() { regAllocOrder(CK_ISNN, DOBJ); }

    protected void regAllocOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocOrder(), "ALLOC_ORDER"); }
    protected abstract ConditionValue xgetCValueAllocOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_Equal(String allocNgFlg) {
        doSetAllocNgFlg_Equal(fRES(allocNgFlg));
    }

    protected void doSetAllocNgFlg_Equal(String allocNgFlg) {
        regAllocNgFlg(CK_EQ, allocNgFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotEqual(String allocNgFlg) {
        doSetAllocNgFlg_NotEqual(fRES(allocNgFlg));
    }

    protected void doSetAllocNgFlg_NotEqual(String allocNgFlg) {
        regAllocNgFlg(CK_NES, allocNgFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_GreaterThan(String allocNgFlg) {
        regAllocNgFlg(CK_GT, fRES(allocNgFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_LessThan(String allocNgFlg) {
        regAllocNgFlg(CK_LT, fRES(allocNgFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_GreaterEqual(String allocNgFlg) {
        regAllocNgFlg(CK_GE, fRES(allocNgFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_LessEqual(String allocNgFlg) {
        regAllocNgFlg(CK_LE, fRES(allocNgFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlgList The collection of allocNgFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_InScope(allocNgFlgList);
    }

    protected void doSetAllocNgFlg_InScope(Collection<String> allocNgFlgList) {
        regINS(CK_INS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlgList The collection of allocNgFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        doSetAllocNgFlg_NotInScope(allocNgFlgList);
    }

    protected void doSetAllocNgFlg_NotInScope(Collection<String> allocNgFlgList) {
        regINS(CK_NINS, cTL(allocNgFlgList), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)} <br>
     * <pre>e.g. setAllocNgFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocNgFlg The value of allocNgFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocNgFlg_LikeSearch(String allocNgFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocNgFlg), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocNgFlg_NotLikeSearch(String allocNgFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocNgFlg), xgetCValueAllocNgFlg(), "ALLOC_NG_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     * @param allocNgFlg The value of allocNgFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocNgFlg_PrefixSearch(String allocNgFlg) {
        setAllocNgFlg_LikeSearch(allocNgFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     */
    public void setAllocNgFlg_IsNull() { regAllocNgFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     */
    public void setAllocNgFlg_IsNullOrEmpty() { regAllocNgFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_NG_FLG: {varchar(255)}
     */
    public void setAllocNgFlg_IsNotNull() { regAllocNgFlg(CK_ISNN, DOBJ); }

    protected void regAllocNgFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocNgFlg(), "ALLOC_NG_FLG"); }
    protected abstract ConditionValue xgetCValueAllocNgFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_Equal(String restockProductCd) {
        doSetRestockProductCd_Equal(fRES(restockProductCd));
    }

    protected void doSetRestockProductCd_Equal(String restockProductCd) {
        regRestockProductCd(CK_EQ, restockProductCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_NotEqual(String restockProductCd) {
        doSetRestockProductCd_NotEqual(fRES(restockProductCd));
    }

    protected void doSetRestockProductCd_NotEqual(String restockProductCd) {
        regRestockProductCd(CK_NES, restockProductCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_GreaterThan(String restockProductCd) {
        regRestockProductCd(CK_GT, fRES(restockProductCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_LessThan(String restockProductCd) {
        regRestockProductCd(CK_LT, fRES(restockProductCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_GreaterEqual(String restockProductCd) {
        regRestockProductCd(CK_GE, fRES(restockProductCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_LessEqual(String restockProductCd) {
        regRestockProductCd(CK_LE, fRES(restockProductCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCdList The collection of restockProductCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_InScope(Collection<String> restockProductCdList) {
        doSetRestockProductCd_InScope(restockProductCdList);
    }

    protected void doSetRestockProductCd_InScope(Collection<String> restockProductCdList) {
        regINS(CK_INS, cTL(restockProductCdList), xgetCValueRestockProductCd(), "RESTOCK_PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCdList The collection of restockProductCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_NotInScope(Collection<String> restockProductCdList) {
        doSetRestockProductCd_NotInScope(restockProductCdList);
    }

    protected void doSetRestockProductCd_NotInScope(Collection<String> restockProductCdList) {
        regINS(CK_NINS, cTL(restockProductCdList), xgetCValueRestockProductCd(), "RESTOCK_PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)} <br>
     * <pre>e.g. setRestockProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockProductCd The value of restockProductCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockProductCd_LikeSearch(String restockProductCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockProductCd), xgetCValueRestockProductCd(), "RESTOCK_PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockProductCd_NotLikeSearch(String restockProductCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockProductCd), xgetCValueRestockProductCd(), "RESTOCK_PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     * @param restockProductCd The value of restockProductCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockProductCd_PrefixSearch(String restockProductCd) {
        setRestockProductCd_LikeSearch(restockProductCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     */
    public void setRestockProductCd_IsNull() { regRestockProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     */
    public void setRestockProductCd_IsNullOrEmpty() { regRestockProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_PRODUCT_CD: {varchar(255)}
     */
    public void setRestockProductCd_IsNotNull() { regRestockProductCd(CK_ISNN, DOBJ); }

    protected void regRestockProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockProductCd(), "RESTOCK_PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueRestockProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_Equal(String restockStockTypeCd) {
        doSetRestockStockTypeCd_Equal(fRES(restockStockTypeCd));
    }

    protected void doSetRestockStockTypeCd_Equal(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_EQ, restockStockTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_NotEqual(String restockStockTypeCd) {
        doSetRestockStockTypeCd_NotEqual(fRES(restockStockTypeCd));
    }

    protected void doSetRestockStockTypeCd_NotEqual(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_NES, restockStockTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_GreaterThan(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_GT, fRES(restockStockTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_LessThan(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_LT, fRES(restockStockTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_GreaterEqual(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_GE, fRES(restockStockTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_LessEqual(String restockStockTypeCd) {
        regRestockStockTypeCd(CK_LE, fRES(restockStockTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCdList The collection of restockStockTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_InScope(Collection<String> restockStockTypeCdList) {
        doSetRestockStockTypeCd_InScope(restockStockTypeCdList);
    }

    protected void doSetRestockStockTypeCd_InScope(Collection<String> restockStockTypeCdList) {
        regINS(CK_INS, cTL(restockStockTypeCdList), xgetCValueRestockStockTypeCd(), "RESTOCK_STOCK_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCdList The collection of restockStockTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_NotInScope(Collection<String> restockStockTypeCdList) {
        doSetRestockStockTypeCd_NotInScope(restockStockTypeCdList);
    }

    protected void doSetRestockStockTypeCd_NotInScope(Collection<String> restockStockTypeCdList) {
        regINS(CK_NINS, cTL(restockStockTypeCdList), xgetCValueRestockStockTypeCd(), "RESTOCK_STOCK_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)} <br>
     * <pre>e.g. setRestockStockTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockStockTypeCd The value of restockStockTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockStockTypeCd_LikeSearch(String restockStockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockStockTypeCd), xgetCValueRestockStockTypeCd(), "RESTOCK_STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockStockTypeCd_NotLikeSearch(String restockStockTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockStockTypeCd), xgetCValueRestockStockTypeCd(), "RESTOCK_STOCK_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     * @param restockStockTypeCd The value of restockStockTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockStockTypeCd_PrefixSearch(String restockStockTypeCd) {
        setRestockStockTypeCd_LikeSearch(restockStockTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setRestockStockTypeCd_IsNull() { regRestockStockTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setRestockStockTypeCd_IsNullOrEmpty() { regRestockStockTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_STOCK_TYPE_CD: {varchar(255)}
     */
    public void setRestockStockTypeCd_IsNotNull() { regRestockStockTypeCd(CK_ISNN, DOBJ); }

    protected void regRestockStockTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockStockTypeCd(), "RESTOCK_STOCK_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueRestockStockTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_Equal(String restockDepositCd) {
        doSetRestockDepositCd_Equal(fRES(restockDepositCd));
    }

    protected void doSetRestockDepositCd_Equal(String restockDepositCd) {
        regRestockDepositCd(CK_EQ, restockDepositCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_NotEqual(String restockDepositCd) {
        doSetRestockDepositCd_NotEqual(fRES(restockDepositCd));
    }

    protected void doSetRestockDepositCd_NotEqual(String restockDepositCd) {
        regRestockDepositCd(CK_NES, restockDepositCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_GreaterThan(String restockDepositCd) {
        regRestockDepositCd(CK_GT, fRES(restockDepositCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_LessThan(String restockDepositCd) {
        regRestockDepositCd(CK_LT, fRES(restockDepositCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_GreaterEqual(String restockDepositCd) {
        regRestockDepositCd(CK_GE, fRES(restockDepositCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_LessEqual(String restockDepositCd) {
        regRestockDepositCd(CK_LE, fRES(restockDepositCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCdList The collection of restockDepositCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_InScope(Collection<String> restockDepositCdList) {
        doSetRestockDepositCd_InScope(restockDepositCdList);
    }

    protected void doSetRestockDepositCd_InScope(Collection<String> restockDepositCdList) {
        regINS(CK_INS, cTL(restockDepositCdList), xgetCValueRestockDepositCd(), "RESTOCK_DEPOSIT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCdList The collection of restockDepositCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_NotInScope(Collection<String> restockDepositCdList) {
        doSetRestockDepositCd_NotInScope(restockDepositCdList);
    }

    protected void doSetRestockDepositCd_NotInScope(Collection<String> restockDepositCdList) {
        regINS(CK_NINS, cTL(restockDepositCdList), xgetCValueRestockDepositCd(), "RESTOCK_DEPOSIT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)} <br>
     * <pre>e.g. setRestockDepositCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockDepositCd The value of restockDepositCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockDepositCd_LikeSearch(String restockDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockDepositCd), xgetCValueRestockDepositCd(), "RESTOCK_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockDepositCd_NotLikeSearch(String restockDepositCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockDepositCd), xgetCValueRestockDepositCd(), "RESTOCK_DEPOSIT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     * @param restockDepositCd The value of restockDepositCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockDepositCd_PrefixSearch(String restockDepositCd) {
        setRestockDepositCd_LikeSearch(restockDepositCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     */
    public void setRestockDepositCd_IsNull() { regRestockDepositCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     */
    public void setRestockDepositCd_IsNullOrEmpty() { regRestockDepositCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_DEPOSIT_CD: {varchar(255)}
     */
    public void setRestockDepositCd_IsNotNull() { regRestockDepositCd(CK_ISNN, DOBJ); }

    protected void regRestockDepositCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockDepositCd(), "RESTOCK_DEPOSIT_CD"); }
    protected abstract ConditionValue xgetCValueRestockDepositCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_Equal(String restockShapeCd) {
        doSetRestockShapeCd_Equal(fRES(restockShapeCd));
    }

    protected void doSetRestockShapeCd_Equal(String restockShapeCd) {
        regRestockShapeCd(CK_EQ, restockShapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_NotEqual(String restockShapeCd) {
        doSetRestockShapeCd_NotEqual(fRES(restockShapeCd));
    }

    protected void doSetRestockShapeCd_NotEqual(String restockShapeCd) {
        regRestockShapeCd(CK_NES, restockShapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_GreaterThan(String restockShapeCd) {
        regRestockShapeCd(CK_GT, fRES(restockShapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_LessThan(String restockShapeCd) {
        regRestockShapeCd(CK_LT, fRES(restockShapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_GreaterEqual(String restockShapeCd) {
        regRestockShapeCd(CK_GE, fRES(restockShapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_LessEqual(String restockShapeCd) {
        regRestockShapeCd(CK_LE, fRES(restockShapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCdList The collection of restockShapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_InScope(Collection<String> restockShapeCdList) {
        doSetRestockShapeCd_InScope(restockShapeCdList);
    }

    protected void doSetRestockShapeCd_InScope(Collection<String> restockShapeCdList) {
        regINS(CK_INS, cTL(restockShapeCdList), xgetCValueRestockShapeCd(), "RESTOCK_SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCdList The collection of restockShapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_NotInScope(Collection<String> restockShapeCdList) {
        doSetRestockShapeCd_NotInScope(restockShapeCdList);
    }

    protected void doSetRestockShapeCd_NotInScope(Collection<String> restockShapeCdList) {
        regINS(CK_NINS, cTL(restockShapeCdList), xgetCValueRestockShapeCd(), "RESTOCK_SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)} <br>
     * <pre>e.g. setRestockShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockShapeCd The value of restockShapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockShapeCd_LikeSearch(String restockShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockShapeCd), xgetCValueRestockShapeCd(), "RESTOCK_SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockShapeCd_NotLikeSearch(String restockShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockShapeCd), xgetCValueRestockShapeCd(), "RESTOCK_SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     * @param restockShapeCd The value of restockShapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockShapeCd_PrefixSearch(String restockShapeCd) {
        setRestockShapeCd_LikeSearch(restockShapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     */
    public void setRestockShapeCd_IsNull() { regRestockShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     */
    public void setRestockShapeCd_IsNullOrEmpty() { regRestockShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_SHAPE_CD: {varchar(255)}
     */
    public void setRestockShapeCd_IsNotNull() { regRestockShapeCd(CK_ISNN, DOBJ); }

    protected void regRestockShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockShapeCd(), "RESTOCK_SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueRestockShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_Equal(String restockPointNum) {
        doSetRestockPointNum_Equal(fRES(restockPointNum));
    }

    protected void doSetRestockPointNum_Equal(String restockPointNum) {
        regRestockPointNum(CK_EQ, restockPointNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_NotEqual(String restockPointNum) {
        doSetRestockPointNum_NotEqual(fRES(restockPointNum));
    }

    protected void doSetRestockPointNum_NotEqual(String restockPointNum) {
        regRestockPointNum(CK_NES, restockPointNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_GreaterThan(String restockPointNum) {
        regRestockPointNum(CK_GT, fRES(restockPointNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_LessThan(String restockPointNum) {
        regRestockPointNum(CK_LT, fRES(restockPointNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_GreaterEqual(String restockPointNum) {
        regRestockPointNum(CK_GE, fRES(restockPointNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_LessEqual(String restockPointNum) {
        regRestockPointNum(CK_LE, fRES(restockPointNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNumList The collection of restockPointNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_InScope(Collection<String> restockPointNumList) {
        doSetRestockPointNum_InScope(restockPointNumList);
    }

    protected void doSetRestockPointNum_InScope(Collection<String> restockPointNumList) {
        regINS(CK_INS, cTL(restockPointNumList), xgetCValueRestockPointNum(), "RESTOCK_POINT_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNumList The collection of restockPointNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_NotInScope(Collection<String> restockPointNumList) {
        doSetRestockPointNum_NotInScope(restockPointNumList);
    }

    protected void doSetRestockPointNum_NotInScope(Collection<String> restockPointNumList) {
        regINS(CK_NINS, cTL(restockPointNumList), xgetCValueRestockPointNum(), "RESTOCK_POINT_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)} <br>
     * <pre>e.g. setRestockPointNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param restockPointNum The value of restockPointNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRestockPointNum_LikeSearch(String restockPointNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(restockPointNum), xgetCValueRestockPointNum(), "RESTOCK_POINT_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRestockPointNum_NotLikeSearch(String restockPointNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(restockPointNum), xgetCValueRestockPointNum(), "RESTOCK_POINT_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     * @param restockPointNum The value of restockPointNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRestockPointNum_PrefixSearch(String restockPointNum) {
        setRestockPointNum_LikeSearch(restockPointNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     */
    public void setRestockPointNum_IsNull() { regRestockPointNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     */
    public void setRestockPointNum_IsNullOrEmpty() { regRestockPointNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RESTOCK_POINT_NUM: {varchar(255)}
     */
    public void setRestockPointNum_IsNotNull() { regRestockPointNum(CK_ISNN, DOBJ); }

    protected void regRestockPointNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRestockPointNum(), "RESTOCK_POINT_NUM"); }
    protected abstract ConditionValue xgetCValueRestockPointNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_Equal(String maxStoreShapeCd) {
        doSetMaxStoreShapeCd_Equal(fRES(maxStoreShapeCd));
    }

    protected void doSetMaxStoreShapeCd_Equal(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_EQ, maxStoreShapeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_NotEqual(String maxStoreShapeCd) {
        doSetMaxStoreShapeCd_NotEqual(fRES(maxStoreShapeCd));
    }

    protected void doSetMaxStoreShapeCd_NotEqual(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_NES, maxStoreShapeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_GreaterThan(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_GT, fRES(maxStoreShapeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_LessThan(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_LT, fRES(maxStoreShapeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_GreaterEqual(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_GE, fRES(maxStoreShapeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_LessEqual(String maxStoreShapeCd) {
        regMaxStoreShapeCd(CK_LE, fRES(maxStoreShapeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCdList The collection of maxStoreShapeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_InScope(Collection<String> maxStoreShapeCdList) {
        doSetMaxStoreShapeCd_InScope(maxStoreShapeCdList);
    }

    protected void doSetMaxStoreShapeCd_InScope(Collection<String> maxStoreShapeCdList) {
        regINS(CK_INS, cTL(maxStoreShapeCdList), xgetCValueMaxStoreShapeCd(), "MAX_STORE_SHAPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCdList The collection of maxStoreShapeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_NotInScope(Collection<String> maxStoreShapeCdList) {
        doSetMaxStoreShapeCd_NotInScope(maxStoreShapeCdList);
    }

    protected void doSetMaxStoreShapeCd_NotInScope(Collection<String> maxStoreShapeCdList) {
        regINS(CK_NINS, cTL(maxStoreShapeCdList), xgetCValueMaxStoreShapeCd(), "MAX_STORE_SHAPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)} <br>
     * <pre>e.g. setMaxStoreShapeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param maxStoreShapeCd The value of maxStoreShapeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMaxStoreShapeCd_LikeSearch(String maxStoreShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(maxStoreShapeCd), xgetCValueMaxStoreShapeCd(), "MAX_STORE_SHAPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMaxStoreShapeCd_NotLikeSearch(String maxStoreShapeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(maxStoreShapeCd), xgetCValueMaxStoreShapeCd(), "MAX_STORE_SHAPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     * @param maxStoreShapeCd The value of maxStoreShapeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreShapeCd_PrefixSearch(String maxStoreShapeCd) {
        setMaxStoreShapeCd_LikeSearch(maxStoreShapeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreShapeCd_IsNull() { regMaxStoreShapeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreShapeCd_IsNullOrEmpty() { regMaxStoreShapeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_SHAPE_CD: {varchar(255)}
     */
    public void setMaxStoreShapeCd_IsNotNull() { regMaxStoreShapeCd(CK_ISNN, DOBJ); }

    protected void regMaxStoreShapeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreShapeCd(), "MAX_STORE_SHAPE_CD"); }
    protected abstract ConditionValue xgetCValueMaxStoreShapeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_Equal(String maxStoreNum) {
        doSetMaxStoreNum_Equal(fRES(maxStoreNum));
    }

    protected void doSetMaxStoreNum_Equal(String maxStoreNum) {
        regMaxStoreNum(CK_EQ, maxStoreNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotEqual(String maxStoreNum) {
        doSetMaxStoreNum_NotEqual(fRES(maxStoreNum));
    }

    protected void doSetMaxStoreNum_NotEqual(String maxStoreNum) {
        regMaxStoreNum(CK_NES, maxStoreNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterThan(String maxStoreNum) {
        regMaxStoreNum(CK_GT, fRES(maxStoreNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessThan(String maxStoreNum) {
        regMaxStoreNum(CK_LT, fRES(maxStoreNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterEqual(String maxStoreNum) {
        regMaxStoreNum(CK_GE, fRES(maxStoreNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessEqual(String maxStoreNum) {
        regMaxStoreNum(CK_LE, fRES(maxStoreNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNumList The collection of maxStoreNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_InScope(Collection<String> maxStoreNumList) {
        doSetMaxStoreNum_InScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_InScope(Collection<String> maxStoreNumList) {
        regINS(CK_INS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNumList The collection of maxStoreNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotInScope(Collection<String> maxStoreNumList) {
        doSetMaxStoreNum_NotInScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_NotInScope(Collection<String> maxStoreNumList) {
        regINS(CK_NINS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)} <br>
     * <pre>e.g. setMaxStoreNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param maxStoreNum The value of maxStoreNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMaxStoreNum_LikeSearch(String maxStoreNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(maxStoreNum), xgetCValueMaxStoreNum(), "MAX_STORE_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMaxStoreNum_NotLikeSearch(String maxStoreNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(maxStoreNum), xgetCValueMaxStoreNum(), "MAX_STORE_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     * @param maxStoreNum The value of maxStoreNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_PrefixSearch(String maxStoreNum) {
        setMaxStoreNum_LikeSearch(maxStoreNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNull() { regMaxStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNullOrEmpty() { regMaxStoreNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {varchar(255)}
     */
    public void setMaxStoreNum_IsNotNull() { regMaxStoreNum(CK_ISNN, DOBJ); }

    protected void regMaxStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreNum(), "MAX_STORE_NUM"); }
    protected abstract ConditionValue xgetCValueMaxStoreNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_Equal(Long lineNo) {
        doSetLineNo_Equal(lineNo);
    }

    protected void doSetLineNo_Equal(Long lineNo) {
        regLineNo(CK_EQ, lineNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_NotEqual(Long lineNo) {
        doSetLineNo_NotEqual(lineNo);
    }

    protected void doSetLineNo_NotEqual(Long lineNo) {
        regLineNo(CK_NES, lineNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterThan(Long lineNo) {
        regLineNo(CK_GT, lineNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessThan(Long lineNo) {
        regLineNo(CK_LT, lineNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_GreaterEqual(Long lineNo) {
        regLineNo(CK_GE, lineNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNo The value of lineNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLineNo_LessEqual(Long lineNo) {
        regLineNo(CK_LE, lineNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param minNumber The min number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lineNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLineNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLineNo(), "LINE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_InScope(Collection<Long> lineNoList) {
        doSetLineNo_InScope(lineNoList);
    }

    protected void doSetLineNo_InScope(Collection<Long> lineNoList) {
        regINS(CK_INS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LINE_NO: {NotNull, bigint(19)}
     * @param lineNoList The collection of lineNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineNo_NotInScope(Collection<Long> lineNoList) {
        doSetLineNo_NotInScope(lineNoList);
    }

    protected void doSetLineNo_NotInScope(Collection<Long> lineNoList) {
        regINS(CK_NINS, cTL(lineNoList), xgetCValueLineNo(), "LINE_NO");
    }

    protected void regLineNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineNo(), "LINE_NO"); }
    protected abstract ConditionValue xgetCValueLineNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_Equal(String workFlg) {
        doSetWorkFlg_Equal(fRES(workFlg));
    }

    protected void doSetWorkFlg_Equal(String workFlg) {
        regWorkFlg(CK_EQ, workFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotEqual(String workFlg) {
        doSetWorkFlg_NotEqual(fRES(workFlg));
    }

    protected void doSetWorkFlg_NotEqual(String workFlg) {
        regWorkFlg(CK_NES, workFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterThan(String workFlg) {
        regWorkFlg(CK_GT, fRES(workFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessThan(String workFlg) {
        regWorkFlg(CK_LT, fRES(workFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_GreaterEqual(String workFlg) {
        regWorkFlg(CK_GE, fRES(workFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_LessEqual(String workFlg) {
        regWorkFlg(CK_LE, fRES(workFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlgList The collection of workFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_InScope(Collection<String> workFlgList) {
        doSetWorkFlg_InScope(workFlgList);
    }

    protected void doSetWorkFlg_InScope(Collection<String> workFlgList) {
        regINS(CK_INS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlgList The collection of workFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_NotInScope(Collection<String> workFlgList) {
        doSetWorkFlg_NotInScope(workFlgList);
    }

    protected void doSetWorkFlg_NotInScope(Collection<String> workFlgList) {
        regINS(CK_NINS, cTL(workFlgList), xgetCValueWorkFlg(), "WORK_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setWorkFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workFlg The value of workFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkFlg_LikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkFlg_NotLikeSearch(String workFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workFlg), xgetCValueWorkFlg(), "WORK_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     * @param workFlg The value of workFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkFlg_PrefixSearch(String workFlg) {
        setWorkFlg_LikeSearch(workFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     */
    public void setWorkFlg_IsNull() { regWorkFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_FLG: {char(1), default=[(0)]}
     */
    public void setWorkFlg_IsNotNull() { regWorkFlg(CK_ISNN, DOBJ); }

    protected void regWorkFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkFlg(), "WORK_FLG"); }
    protected abstract ConditionValue xgetCValueWorkFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {char(1), default=[(0)]}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_Equal(String errorMsg) {
        doSetErrorMsg_Equal(fRES(errorMsg));
    }

    protected void doSetErrorMsg_Equal(String errorMsg) {
        regErrorMsg(CK_EQ, errorMsg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_NotEqual(String errorMsg) {
        doSetErrorMsg_NotEqual(fRES(errorMsg));
    }

    protected void doSetErrorMsg_NotEqual(String errorMsg) {
        regErrorMsg(CK_NES, errorMsg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_GreaterThan(String errorMsg) {
        regErrorMsg(CK_GT, fRES(errorMsg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_LessThan(String errorMsg) {
        regErrorMsg(CK_LT, fRES(errorMsg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_GreaterEqual(String errorMsg) {
        regErrorMsg(CK_GE, fRES(errorMsg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_LessEqual(String errorMsg) {
        regErrorMsg(CK_LE, fRES(errorMsg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsgList The collection of errorMsg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_InScope(Collection<String> errorMsgList) {
        doSetErrorMsg_InScope(errorMsgList);
    }

    protected void doSetErrorMsg_InScope(Collection<String> errorMsgList) {
        regINS(CK_INS, cTL(errorMsgList), xgetCValueErrorMsg(), "ERROR_MSG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsgList The collection of errorMsg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_NotInScope(Collection<String> errorMsgList) {
        doSetErrorMsg_NotInScope(errorMsgList);
    }

    protected void doSetErrorMsg_NotInScope(Collection<String> errorMsgList) {
        regINS(CK_NINS, cTL(errorMsgList), xgetCValueErrorMsg(), "ERROR_MSG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)} <br>
     * <pre>e.g. setErrorMsg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMsg The value of errorMsg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMsg_LikeSearch(String errorMsg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMsg), xgetCValueErrorMsg(), "ERROR_MSG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMsg_NotLikeSearch(String errorMsg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMsg), xgetCValueErrorMsg(), "ERROR_MSG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     * @param errorMsg The value of errorMsg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMsg_PrefixSearch(String errorMsg) {
        setErrorMsg_LikeSearch(errorMsg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNull() { regErrorMsg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNullOrEmpty() { regErrorMsg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MSG: {varchar(2147483647)}
     */
    public void setErrorMsg_IsNotNull() { regErrorMsg(CK_ISNN, DOBJ); }

    protected void regErrorMsg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMsg(), "ERROR_MSG"); }
    protected abstract ConditionValue xgetCValueErrorMsg();

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
    public HpSLCFunction<WLocationInputCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WLocationInputCB.class);
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
    public HpSLCFunction<WLocationInputCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WLocationInputCB.class);
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
    public HpSLCFunction<WLocationInputCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WLocationInputCB.class);
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
    public HpSLCFunction<WLocationInputCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WLocationInputCB.class);
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
    public HpSLCFunction<WLocationInputCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WLocationInputCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WLocationInputCB&gt;() {
     *     public void query(WLocationInputCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WLocationInputCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WLocationInputCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WLocationInputCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WLocationInputCQ sq);

    protected WLocationInputCB xcreateScalarConditionCB() {
        WLocationInputCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WLocationInputCB xcreateScalarConditionPartitionByCB() {
        WLocationInputCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WLocationInputCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WLocationInputCB cb = new WLocationInputCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOCATION_INPUT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WLocationInputCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WLocationInputCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WLocationInputCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WLocationInputCB cb = new WLocationInputCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOCATION_INPUT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WLocationInputCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WLocationInputCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WLocationInputCB cb = new WLocationInputCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WLocationInputCQ sq);

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
    protected WLocationInputCB newMyCB() {
        return new WLocationInputCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WLocationInputCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
