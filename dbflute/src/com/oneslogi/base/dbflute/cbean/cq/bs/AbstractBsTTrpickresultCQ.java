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
 * The abstract condition-query of T_TRPICKRESULT.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrpickresultCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrpickresultCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRPICKRESULT";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_Equal(Long pickingDetailId) {
        doSetPickingDetailId_Equal(pickingDetailId);
    }

    protected void doSetPickingDetailId_Equal(Long pickingDetailId) {
        regPickingDetailId(CK_EQ, pickingDetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_NotEqual(Long pickingDetailId) {
        doSetPickingDetailId_NotEqual(pickingDetailId);
    }

    protected void doSetPickingDetailId_NotEqual(Long pickingDetailId) {
        regPickingDetailId(CK_NES, pickingDetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_GreaterThan(Long pickingDetailId) {
        regPickingDetailId(CK_GT, pickingDetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_LessThan(Long pickingDetailId) {
        regPickingDetailId(CK_LT, pickingDetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_GreaterEqual(Long pickingDetailId) {
        regPickingDetailId(CK_GE, pickingDetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailId The value of pickingDetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingDetailId_LessEqual(Long pickingDetailId) {
        regPickingDetailId(CK_LE, pickingDetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of pickingDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingDetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingDetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingDetailId(), "PICKING_DETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailIdList The collection of pickingDetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDetailId_InScope(Collection<Long> pickingDetailIdList) {
        doSetPickingDetailId_InScope(pickingDetailIdList);
    }

    protected void doSetPickingDetailId_InScope(Collection<Long> pickingDetailIdList) {
        regINS(CK_INS, cTL(pickingDetailIdList), xgetCValuePickingDetailId(), "PICKING_DETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingDetailIdList The collection of pickingDetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingDetailId_NotInScope(Collection<Long> pickingDetailIdList) {
        doSetPickingDetailId_NotInScope(pickingDetailIdList);
    }

    protected void doSetPickingDetailId_NotInScope(Collection<Long> pickingDetailIdList) {
        regINS(CK_NINS, cTL(pickingDetailIdList), xgetCValuePickingDetailId(), "PICKING_DETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingDetailId_IsNull() { regPickingDetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_DETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingDetailId_IsNotNull() { regPickingDetailId(CK_ISNN, DOBJ); }

    protected void regPickingDetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingDetailId(), "PICKING_DETAIL_ID"); }
    protected abstract ConditionValue xgetCValuePickingDetailId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
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
     * WORKALLOCATEID: {NotNull, bigint(19)}
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
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param workallocateid The value of workallocateid as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterThan(Long workallocateid) {
        regWorkallocateid(CK_GT, workallocateid);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param workallocateid The value of workallocateid as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessThan(Long workallocateid) {
        regWorkallocateid(CK_LT, workallocateid);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param workallocateid The value of workallocateid as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_GreaterEqual(Long workallocateid) {
        regWorkallocateid(CK_GE, workallocateid);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param workallocateid The value of workallocateid as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkallocateid_LessEqual(Long workallocateid) {
        regWorkallocateid(CK_LE, workallocateid);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param minNumber The min number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workallocateid. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkallocateid_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkallocateid(), "WORKALLOCATEID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORKALLOCATEID: {NotNull, bigint(19)}
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
     * WORKALLOCATEID: {NotNull, bigint(19)}
     * @param workallocateidList The collection of workallocateid as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        doSetWorkallocateid_NotInScope(workallocateidList);
    }

    protected void doSetWorkallocateid_NotInScope(Collection<Long> workallocateidList) {
        regINS(CK_NINS, cTL(workallocateidList), xgetCValueWorkallocateid(), "WORKALLOCATEID");
    }

    protected void regWorkallocateid(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkallocateid(), "WORKALLOCATEID"); }
    protected abstract ConditionValue xgetCValueWorkallocateid();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
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
     * FLOOR: {NotNull, varchar(30)}
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
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterThan(String floor) {
        regFloor(CK_GT, fRES(floor));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessThan(String floor) {
        regFloor(CK_LT, fRES(floor));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_GreaterEqual(String floor) {
        regFloor(CK_GE, fRES(floor));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_LessEqual(String floor) {
        regFloor(CK_LE, fRES(floor));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
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
     * FLOOR: {NotNull, varchar(30)}
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
     * FLOOR: {NotNull, varchar(30)} <br>
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
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloor_NotLikeSearch(String floor, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floor), xgetCValueFloor(), "FLOOR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR: {NotNull, varchar(30)}
     * @param floor The value of floor as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloor_PrefixSearch(String floor) {
        setFloor_LikeSearch(floor, xcLSOPPre());
    }

    protected void regFloor(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloor(), "FLOOR"); }
    protected abstract ConditionValue xgetCValueFloor();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_Equal(Long listkbn) {
        doSetListkbn_Equal(listkbn);
    }

    protected void doSetListkbn_Equal(Long listkbn) {
        regListkbn(CK_EQ, listkbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_NotEqual(Long listkbn) {
        doSetListkbn_NotEqual(listkbn);
    }

    protected void doSetListkbn_NotEqual(Long listkbn) {
        regListkbn(CK_NES, listkbn);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_GreaterThan(Long listkbn) {
        regListkbn(CK_GT, listkbn);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_LessThan(Long listkbn) {
        regListkbn(CK_LT, listkbn);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_GreaterEqual(Long listkbn) {
        regListkbn(CK_GE, listkbn);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbn The value of listkbn as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setListkbn_LessEqual(Long listkbn) {
        regListkbn(CK_LE, listkbn);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param minNumber The min number of listkbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of listkbn. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setListkbn_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueListkbn(), "LISTKBN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbnList The collection of listkbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_InScope(Collection<Long> listkbnList) {
        doSetListkbn_InScope(listkbnList);
    }

    protected void doSetListkbn_InScope(Collection<Long> listkbnList) {
        regINS(CK_INS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LISTKBN: {NotNull, bigint(19)}
     * @param listkbnList The collection of listkbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setListkbn_NotInScope(Collection<Long> listkbnList) {
        doSetListkbn_NotInScope(listkbnList);
    }

    protected void doSetListkbn_NotInScope(Collection<Long> listkbnList) {
        regINS(CK_NINS, cTL(listkbnList), xgetCValueListkbn(), "LISTKBN");
    }

    protected void regListkbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueListkbn(), "LISTKBN"); }
    protected abstract ConditionValue xgetCValueListkbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_Equal(String locationId) {
        doSetLocationId_Equal(fRES(locationId));
    }

    protected void doSetLocationId_Equal(String locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(String locationId) {
        doSetLocationId_NotEqual(fRES(locationId));
    }

    protected void doSetLocationId_NotEqual(String locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(String locationId) {
        regLocationId(CK_GT, fRES(locationId));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(String locationId) {
        regLocationId(CK_LT, fRES(locationId));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(String locationId) {
        regLocationId(CK_GE, fRES(locationId));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(String locationId) {
        regLocationId(CK_LE, fRES(locationId));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<String> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<String> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<String> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<String> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLocationId_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationId The value of locationId as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationId_LikeSearch(String locationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationId), xgetCValueLocationId(), "LOCATION_ID", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationId_NotLikeSearch(String locationId, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationId), xgetCValueLocationId(), "LOCATION_ID", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {NotNull, varchar(30)}
     * @param locationId The value of locationId as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_PrefixSearch(String locationId) {
        setLocationId_LikeSearch(locationId, xcLSOPPre());
    }

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_Equal(Long lotId) {
        doSetLotId_Equal(lotId);
    }

    protected void doSetLotId_Equal(Long lotId) {
        regLotId(CK_EQ, lotId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_NotEqual(Long lotId) {
        doSetLotId_NotEqual(lotId);
    }

    protected void doSetLotId_NotEqual(Long lotId) {
        regLotId(CK_NES, lotId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterThan(Long lotId) {
        regLotId(CK_GT, lotId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessThan(Long lotId) {
        regLotId(CK_LT, lotId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_GreaterEqual(Long lotId) {
        regLotId(CK_GE, lotId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotId The value of lotId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLotId_LessEqual(Long lotId) {
        regLotId(CK_LE, lotId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of lotId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLotId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLotId(), "LOT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_InScope(Collection<Long> lotIdList) {
        doSetLotId_InScope(lotIdList);
    }

    protected void doSetLotId_InScope(Collection<Long> lotIdList) {
        regINS(CK_INS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOT_ID: {NotNull, bigint(19)}
     * @param lotIdList The collection of lotId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotId_NotInScope(Collection<Long> lotIdList) {
        doSetLotId_NotInScope(lotIdList);
    }

    protected void doSetLotId_NotInScope(Collection<Long> lotIdList) {
        regINS(CK_NINS, cTL(lotIdList), xgetCValueLotId(), "LOT_ID");
    }

    protected void regLotId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotId(), "LOT_ID"); }
    protected abstract ConditionValue xgetCValueLotId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_Equal(Long palletId) {
        doSetPalletId_Equal(palletId);
    }

    protected void doSetPalletId_Equal(Long palletId) {
        regPalletId(CK_EQ, palletId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_NotEqual(Long palletId) {
        doSetPalletId_NotEqual(palletId);
    }

    protected void doSetPalletId_NotEqual(Long palletId) {
        regPalletId(CK_NES, palletId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterThan(Long palletId) {
        regPalletId(CK_GT, palletId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessThan(Long palletId) {
        regPalletId(CK_LT, palletId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_GreaterEqual(Long palletId) {
        regPalletId(CK_GE, palletId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletId The value of palletId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPalletId_LessEqual(Long palletId) {
        regPalletId(CK_LE, palletId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of palletId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPalletId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePalletId(), "PALLET_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletIdList The collection of palletId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_InScope(Collection<Long> palletIdList) {
        doSetPalletId_InScope(palletIdList);
    }

    protected void doSetPalletId_InScope(Collection<Long> palletIdList) {
        regINS(CK_INS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PALLET_ID: {IX, NotNull, bigint(19)}
     * @param palletIdList The collection of palletId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPalletId_NotInScope(Collection<Long> palletIdList) {
        doSetPalletId_NotInScope(palletIdList);
    }

    protected void doSetPalletId_NotInScope(Collection<Long> palletIdList) {
        regINS(CK_NINS, cTL(palletIdList), xgetCValuePalletId(), "PALLET_ID");
    }

    protected void regPalletId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePalletId(), "PALLET_ID"); }
    protected abstract ConditionValue xgetCValuePalletId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_Equal(Long centerSymbolId) {
        doSetCenterSymbolId_Equal(centerSymbolId);
    }

    protected void doSetCenterSymbolId_Equal(Long centerSymbolId) {
        regCenterSymbolId(CK_EQ, centerSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotEqual(Long centerSymbolId) {
        doSetCenterSymbolId_NotEqual(centerSymbolId);
    }

    protected void doSetCenterSymbolId_NotEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_NES, centerSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterThan(Long centerSymbolId) {
        regCenterSymbolId(CK_GT, centerSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessThan(Long centerSymbolId) {
        regCenterSymbolId(CK_LT, centerSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_GE, centerSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_LE, centerSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterSymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolIdList The collection of centerSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_InScope(Collection<Long> centerSymbolIdList) {
        doSetCenterSymbolId_InScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_InScope(Collection<Long> centerSymbolIdList) {
        regINS(CK_INS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param centerSymbolIdList The collection of centerSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        doSetCenterSymbolId_NotInScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        regINS(CK_NINS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    protected void regCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueCenterSymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_Equal(Long pickedqty1) {
        doSetPickedqty1_Equal(pickedqty1);
    }

    protected void doSetPickedqty1_Equal(Long pickedqty1) {
        regPickedqty1(CK_EQ, pickedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_NotEqual(Long pickedqty1) {
        doSetPickedqty1_NotEqual(pickedqty1);
    }

    protected void doSetPickedqty1_NotEqual(Long pickedqty1) {
        regPickedqty1(CK_NES, pickedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterThan(Long pickedqty1) {
        regPickedqty1(CK_GT, pickedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessThan(Long pickedqty1) {
        regPickedqty1(CK_LT, pickedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_GreaterEqual(Long pickedqty1) {
        regPickedqty1(CK_GE, pickedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1 The value of pickedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickedqty1_LessEqual(Long pickedqty1) {
        regPickedqty1(CK_LE, pickedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param minNumber The min number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickedqty1(), "PICKEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1List The collection of pickedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_InScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_InScope(pickedqty1List);
    }

    protected void doSetPickedqty1_InScope(Collection<Long> pickedqty1List) {
        regINS(CK_INS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     * @param pickedqty1List The collection of pickedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        doSetPickedqty1_NotInScope(pickedqty1List);
    }

    protected void doSetPickedqty1_NotInScope(Collection<Long> pickedqty1List) {
        regINS(CK_NINS, cTL(pickedqty1List), xgetCValuePickedqty1(), "PICKEDQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     */
    public void setPickedqty1_IsNull() { regPickedqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKEDQTY1: {bigint(19)}
     */
    public void setPickedqty1_IsNotNull() { regPickedqty1(CK_ISNN, DOBJ); }

    protected void regPickedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickedqty1(), "PICKEDQTY1"); }
    protected abstract ConditionValue xgetCValuePickedqty1();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_Equal(Long sortedqty1) {
        doSetSortedqty1_Equal(sortedqty1);
    }

    protected void doSetSortedqty1_Equal(Long sortedqty1) {
        regSortedqty1(CK_EQ, sortedqty1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_NotEqual(Long sortedqty1) {
        doSetSortedqty1_NotEqual(sortedqty1);
    }

    protected void doSetSortedqty1_NotEqual(Long sortedqty1) {
        regSortedqty1(CK_NES, sortedqty1);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterThan(Long sortedqty1) {
        regSortedqty1(CK_GT, sortedqty1);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessThan(Long sortedqty1) {
        regSortedqty1(CK_LT, sortedqty1);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_GreaterEqual(Long sortedqty1) {
        regSortedqty1(CK_GE, sortedqty1);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1 The value of sortedqty1 as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqty1_LessEqual(Long sortedqty1) {
        regSortedqty1(CK_LE, sortedqty1);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param minNumber The min number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqty1. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqty1_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqty1(), "SORTEDQTY1", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1List The collection of sortedqty1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_InScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_InScope(sortedqty1List);
    }

    protected void doSetSortedqty1_InScope(Collection<Long> sortedqty1List) {
        regINS(CK_INS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     * @param sortedqty1List The collection of sortedqty1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        doSetSortedqty1_NotInScope(sortedqty1List);
    }

    protected void doSetSortedqty1_NotInScope(Collection<Long> sortedqty1List) {
        regINS(CK_NINS, cTL(sortedqty1List), xgetCValueSortedqty1(), "SORTEDQTY1");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     */
    public void setSortedqty1_IsNull() { regSortedqty1(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORTEDQTY1: {bigint(19)}
     */
    public void setSortedqty1_IsNotNull() { regSortedqty1(CK_ISNN, DOBJ); }

    protected void regSortedqty1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqty1(), "SORTEDQTY1"); }
    protected abstract ConditionValue xgetCValueSortedqty1();

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
    public HpSLCFunction<TTrpickresultCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrpickresultCB.class);
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
    public HpSLCFunction<TTrpickresultCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrpickresultCB.class);
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
    public HpSLCFunction<TTrpickresultCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrpickresultCB.class);
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
    public HpSLCFunction<TTrpickresultCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrpickresultCB.class);
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
    public HpSLCFunction<TTrpickresultCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrpickresultCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrpickresultCB&gt;() {
     *     public void query(TTrpickresultCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrpickresultCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrpickresultCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickresultCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrpickresultCQ sq);

    protected TTrpickresultCB xcreateScalarConditionCB() {
        TTrpickresultCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrpickresultCB xcreateScalarConditionPartitionByCB() {
        TTrpickresultCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrpickresultCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickresultCB cb = new TTrpickresultCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_DETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrpickresultCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrpickresultCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrpickresultCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrpickresultCB cb = new TTrpickresultCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_DETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrpickresultCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrpickresultCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrpickresultCB cb = new TTrpickresultCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrpickresultCQ sq);

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
    protected TTrpickresultCB newMyCB() {
        return new TTrpickresultCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrpickresultCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
