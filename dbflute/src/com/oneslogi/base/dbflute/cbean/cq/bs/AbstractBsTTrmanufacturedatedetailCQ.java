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
 * The abstract condition-query of T_TRMANUFACTUREDATEDETAIL.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrmanufacturedatedetailCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrmanufacturedatedetailCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRMANUFACTUREDATEDETAIL";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_Equal(Long trmanufacturedatedetailId) {
        doSetTrmanufacturedatedetailId_Equal(trmanufacturedatedetailId);
    }

    protected void doSetTrmanufacturedatedetailId_Equal(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_EQ, trmanufacturedatedetailId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_NotEqual(Long trmanufacturedatedetailId) {
        doSetTrmanufacturedatedetailId_NotEqual(trmanufacturedatedetailId);
    }

    protected void doSetTrmanufacturedatedetailId_NotEqual(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_NES, trmanufacturedatedetailId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_GreaterThan(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_GT, trmanufacturedatedetailId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_LessThan(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_LT, trmanufacturedatedetailId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_GreaterEqual(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_GE, trmanufacturedatedetailId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailId The value of trmanufacturedatedetailId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_LessEqual(Long trmanufacturedatedetailId) {
        regTrmanufacturedatedetailId(CK_LE, trmanufacturedatedetailId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of trmanufacturedatedetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of trmanufacturedatedetailId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTrmanufacturedatedetailId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTrmanufacturedatedetailId(), "TRMANUFACTUREDATEDETAIL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailIdList The collection of trmanufacturedatedetailId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_InScope(Collection<Long> trmanufacturedatedetailIdList) {
        doSetTrmanufacturedatedetailId_InScope(trmanufacturedatedetailIdList);
    }

    protected void doSetTrmanufacturedatedetailId_InScope(Collection<Long> trmanufacturedatedetailIdList) {
        regINS(CK_INS, cTL(trmanufacturedatedetailIdList), xgetCValueTrmanufacturedatedetailId(), "TRMANUFACTUREDATEDETAIL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param trmanufacturedatedetailIdList The collection of trmanufacturedatedetailId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTrmanufacturedatedetailId_NotInScope(Collection<Long> trmanufacturedatedetailIdList) {
        doSetTrmanufacturedatedetailId_NotInScope(trmanufacturedatedetailIdList);
    }

    protected void doSetTrmanufacturedatedetailId_NotInScope(Collection<Long> trmanufacturedatedetailIdList) {
        regINS(CK_NINS, cTL(trmanufacturedatedetailIdList), xgetCValueTrmanufacturedatedetailId(), "TRMANUFACTUREDATEDETAIL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrmanufacturedatedetailId_IsNull() { regTrmanufacturedatedetailId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRMANUFACTUREDATEDETAIL_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setTrmanufacturedatedetailId_IsNotNull() { regTrmanufacturedatedetailId(CK_ISNN, DOBJ); }

    protected void regTrmanufacturedatedetailId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTrmanufacturedatedetailId(), "TRMANUFACTUREDATEDETAIL_ID"); }
    protected abstract ConditionValue xgetCValueTrmanufacturedatedetailId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterThan(String centerCd) {
        regCenterCd(CK_GT, fRES(centerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessThan(String centerCd) {
        regCenterCd(CK_LT, fRES(centerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_GreaterEqual(String centerCd) {
        regCenterCd(CK_GE, fRES(centerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_LessEqual(String centerCd) {
        regCenterCd(CK_LE, fRES(centerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)}
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
     * CENTER_CD: {NotNull, varchar(30)} <br>
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
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCenterCd_NotLikeSearch(String centerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(centerCd), xgetCValueCenterCd(), "CENTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CENTER_CD: {NotNull, varchar(30)}
     * @param centerCd The value of centerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterCd_PrefixSearch(String centerCd) {
        setCenterCd_LikeSearch(centerCd, xcLSOPPre());
    }

    protected void regCenterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterCd(), "CENTER_CD"); }
    protected abstract ConditionValue xgetCValueCenterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_Equal(String ownerCd) {
        doSetOwnerCd_Equal(fRES(ownerCd));
    }

    protected void doSetOwnerCd_Equal(String ownerCd) {
        regOwnerCd(CK_EQ, ownerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotEqual(String ownerCd) {
        doSetOwnerCd_NotEqual(fRES(ownerCd));
    }

    protected void doSetOwnerCd_NotEqual(String ownerCd) {
        regOwnerCd(CK_NES, ownerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterThan(String ownerCd) {
        regOwnerCd(CK_GT, fRES(ownerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessThan(String ownerCd) {
        regOwnerCd(CK_LT, fRES(ownerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterEqual(String ownerCd) {
        regOwnerCd(CK_GE, fRES(ownerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessEqual(String ownerCd) {
        regOwnerCd(CK_LE, fRES(ownerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCdList The collection of ownerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_InScope(Collection<String> ownerCdList) {
        doSetOwnerCd_InScope(ownerCdList);
    }

    protected void doSetOwnerCd_InScope(Collection<String> ownerCdList) {
        regINS(CK_INS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCdList The collection of ownerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotInScope(Collection<String> ownerCdList) {
        doSetOwnerCd_NotInScope(ownerCdList);
    }

    protected void doSetOwnerCd_NotInScope(Collection<String> ownerCdList) {
        regINS(CK_NINS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setOwnerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerCd The value of ownerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerCd_LikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerCd_NotLikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {NotNull, varchar(30)}
     * @param ownerCd The value of ownerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_PrefixSearch(String ownerCd) {
        setOwnerCd_LikeSearch(ownerCd, xcLSOPPre());
    }

    protected void regOwnerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerCd(), "OWNER_CD"); }
    protected abstract ConditionValue xgetCValueOwnerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_Equal(String inventoryKbn) {
        doSetInventoryKbn_Equal(fRES(inventoryKbn));
    }

    protected void doSetInventoryKbn_Equal(String inventoryKbn) {
        regInventoryKbn(CK_EQ, inventoryKbn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_NotEqual(String inventoryKbn) {
        doSetInventoryKbn_NotEqual(fRES(inventoryKbn));
    }

    protected void doSetInventoryKbn_NotEqual(String inventoryKbn) {
        regInventoryKbn(CK_NES, inventoryKbn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_GreaterThan(String inventoryKbn) {
        regInventoryKbn(CK_GT, fRES(inventoryKbn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_LessThan(String inventoryKbn) {
        regInventoryKbn(CK_LT, fRES(inventoryKbn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_GreaterEqual(String inventoryKbn) {
        regInventoryKbn(CK_GE, fRES(inventoryKbn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_LessEqual(String inventoryKbn) {
        regInventoryKbn(CK_LE, fRES(inventoryKbn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbnList The collection of inventoryKbn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_InScope(Collection<String> inventoryKbnList) {
        doSetInventoryKbn_InScope(inventoryKbnList);
    }

    protected void doSetInventoryKbn_InScope(Collection<String> inventoryKbnList) {
        regINS(CK_INS, cTL(inventoryKbnList), xgetCValueInventoryKbn(), "INVENTORY_KBN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbnList The collection of inventoryKbn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_NotInScope(Collection<String> inventoryKbnList) {
        doSetInventoryKbn_NotInScope(inventoryKbnList);
    }

    protected void doSetInventoryKbn_NotInScope(Collection<String> inventoryKbnList) {
        regINS(CK_NINS, cTL(inventoryKbnList), xgetCValueInventoryKbn(), "INVENTORY_KBN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)} <br>
     * <pre>e.g. setInventoryKbn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryKbn The value of inventoryKbn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryKbn_LikeSearch(String inventoryKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryKbn), xgetCValueInventoryKbn(), "INVENTORY_KBN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryKbn_NotLikeSearch(String inventoryKbn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryKbn), xgetCValueInventoryKbn(), "INVENTORY_KBN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KBN: {NotNull, varchar(30)}
     * @param inventoryKbn The value of inventoryKbn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKbn_PrefixSearch(String inventoryKbn) {
        setInventoryKbn_LikeSearch(inventoryKbn, xcLSOPPre());
    }

    protected void regInventoryKbn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryKbn(), "INVENTORY_KBN"); }
    protected abstract ConditionValue xgetCValueInventoryKbn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_Equal(String lineBlock) {
        doSetLineBlock_Equal(fRES(lineBlock));
    }

    protected void doSetLineBlock_Equal(String lineBlock) {
        regLineBlock(CK_EQ, lineBlock);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotEqual(String lineBlock) {
        doSetLineBlock_NotEqual(fRES(lineBlock));
    }

    protected void doSetLineBlock_NotEqual(String lineBlock) {
        regLineBlock(CK_NES, lineBlock);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterThan(String lineBlock) {
        regLineBlock(CK_GT, fRES(lineBlock));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessThan(String lineBlock) {
        regLineBlock(CK_LT, fRES(lineBlock));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_GreaterEqual(String lineBlock) {
        regLineBlock(CK_GE, fRES(lineBlock));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_LessEqual(String lineBlock) {
        regLineBlock(CK_LE, fRES(lineBlock));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlockList The collection of lineBlock as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_InScope(Collection<String> lineBlockList) {
        doSetLineBlock_InScope(lineBlockList);
    }

    protected void doSetLineBlock_InScope(Collection<String> lineBlockList) {
        regINS(CK_INS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlockList The collection of lineBlock as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_NotInScope(Collection<String> lineBlockList) {
        doSetLineBlock_NotInScope(lineBlockList);
    }

    protected void doSetLineBlock_NotInScope(Collection<String> lineBlockList) {
        regINS(CK_NINS, cTL(lineBlockList), xgetCValueLineBlock(), "LINE_BLOCK");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)} <br>
     * <pre>e.g. setLineBlock_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineBlock The value of lineBlock as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineBlock_LikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineBlock_NotLikeSearch(String lineBlock, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineBlock), xgetCValueLineBlock(), "LINE_BLOCK", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_BLOCK: {NotNull, varchar(30)}
     * @param lineBlock The value of lineBlock as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineBlock_PrefixSearch(String lineBlock) {
        setLineBlock_LikeSearch(lineBlock, xcLSOPPre());
    }

    protected void regLineBlock(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineBlock(), "LINE_BLOCK"); }
    protected abstract ConditionValue xgetCValueLineBlock();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
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
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
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
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
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
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
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
     * PRODUCT_CD: {IX+, NotNull, varchar(30)} <br>
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
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {IX+, NotNull, varchar(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_Equal(String inventoryKey) {
        doSetInventoryKey_Equal(fRES(inventoryKey));
    }

    protected void doSetInventoryKey_Equal(String inventoryKey) {
        regInventoryKey(CK_EQ, inventoryKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_NotEqual(String inventoryKey) {
        doSetInventoryKey_NotEqual(fRES(inventoryKey));
    }

    protected void doSetInventoryKey_NotEqual(String inventoryKey) {
        regInventoryKey(CK_NES, inventoryKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_GreaterThan(String inventoryKey) {
        regInventoryKey(CK_GT, fRES(inventoryKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_LessThan(String inventoryKey) {
        regInventoryKey(CK_LT, fRES(inventoryKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_GreaterEqual(String inventoryKey) {
        regInventoryKey(CK_GE, fRES(inventoryKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_LessEqual(String inventoryKey) {
        regInventoryKey(CK_LE, fRES(inventoryKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKeyList The collection of inventoryKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_InScope(Collection<String> inventoryKeyList) {
        doSetInventoryKey_InScope(inventoryKeyList);
    }

    protected void doSetInventoryKey_InScope(Collection<String> inventoryKeyList) {
        regINS(CK_INS, cTL(inventoryKeyList), xgetCValueInventoryKey(), "INVENTORY_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKeyList The collection of inventoryKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_NotInScope(Collection<String> inventoryKeyList) {
        doSetInventoryKey_NotInScope(inventoryKeyList);
    }

    protected void doSetInventoryKey_NotInScope(Collection<String> inventoryKeyList) {
        regINS(CK_NINS, cTL(inventoryKeyList), xgetCValueInventoryKey(), "INVENTORY_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)} <br>
     * <pre>e.g. setInventoryKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryKey The value of inventoryKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryKey_LikeSearch(String inventoryKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryKey), xgetCValueInventoryKey(), "INVENTORY_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryKey_NotLikeSearch(String inventoryKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryKey), xgetCValueInventoryKey(), "INVENTORY_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_KEY: {IX+, NotNull, varchar(30)}
     * @param inventoryKey The value of inventoryKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryKey_PrefixSearch(String inventoryKey) {
        setInventoryKey_LikeSearch(inventoryKey, xcLSOPPre());
    }

    protected void regInventoryKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryKey(), "INVENTORY_KEY"); }
    protected abstract ConditionValue xgetCValueInventoryKey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {NotNull, bigint(19)}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_Equal(String inventoryDate) {
        doSetInventoryDate_Equal(fRES(inventoryDate));
    }

    protected void doSetInventoryDate_Equal(String inventoryDate) {
        regInventoryDate(CK_EQ, inventoryDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_NotEqual(String inventoryDate) {
        doSetInventoryDate_NotEqual(fRES(inventoryDate));
    }

    protected void doSetInventoryDate_NotEqual(String inventoryDate) {
        regInventoryDate(CK_NES, inventoryDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_GreaterThan(String inventoryDate) {
        regInventoryDate(CK_GT, fRES(inventoryDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_LessThan(String inventoryDate) {
        regInventoryDate(CK_LT, fRES(inventoryDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_GreaterEqual(String inventoryDate) {
        regInventoryDate(CK_GE, fRES(inventoryDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_LessEqual(String inventoryDate) {
        regInventoryDate(CK_LE, fRES(inventoryDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDateList The collection of inventoryDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_InScope(Collection<String> inventoryDateList) {
        doSetInventoryDate_InScope(inventoryDateList);
    }

    protected void doSetInventoryDate_InScope(Collection<String> inventoryDateList) {
        regINS(CK_INS, cTL(inventoryDateList), xgetCValueInventoryDate(), "INVENTORY_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDateList The collection of inventoryDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_NotInScope(Collection<String> inventoryDateList) {
        doSetInventoryDate_NotInScope(inventoryDateList);
    }

    protected void doSetInventoryDate_NotInScope(Collection<String> inventoryDateList) {
        regINS(CK_NINS, cTL(inventoryDateList), xgetCValueInventoryDate(), "INVENTORY_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)} <br>
     * <pre>e.g. setInventoryDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDate The value of inventoryDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDate_LikeSearch(String inventoryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDate), xgetCValueInventoryDate(), "INVENTORY_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDate_NotLikeSearch(String inventoryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDate), xgetCValueInventoryDate(), "INVENTORY_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATE: {IX+, NotNull, varchar(8)}
     * @param inventoryDate The value of inventoryDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDate_PrefixSearch(String inventoryDate) {
        setInventoryDate_LikeSearch(inventoryDate, xcLSOPPre());
    }

    protected void regInventoryDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDate(), "INVENTORY_DATE"); }
    protected abstract ConditionValue xgetCValueInventoryDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_Equal(String bfManufactureDate) {
        doSetBfManufactureDate_Equal(fRES(bfManufactureDate));
    }

    protected void doSetBfManufactureDate_Equal(String bfManufactureDate) {
        regBfManufactureDate(CK_EQ, bfManufactureDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_NotEqual(String bfManufactureDate) {
        doSetBfManufactureDate_NotEqual(fRES(bfManufactureDate));
    }

    protected void doSetBfManufactureDate_NotEqual(String bfManufactureDate) {
        regBfManufactureDate(CK_NES, bfManufactureDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_GreaterThan(String bfManufactureDate) {
        regBfManufactureDate(CK_GT, fRES(bfManufactureDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_LessThan(String bfManufactureDate) {
        regBfManufactureDate(CK_LT, fRES(bfManufactureDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_GreaterEqual(String bfManufactureDate) {
        regBfManufactureDate(CK_GE, fRES(bfManufactureDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_LessEqual(String bfManufactureDate) {
        regBfManufactureDate(CK_LE, fRES(bfManufactureDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDateList The collection of bfManufactureDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_InScope(Collection<String> bfManufactureDateList) {
        doSetBfManufactureDate_InScope(bfManufactureDateList);
    }

    protected void doSetBfManufactureDate_InScope(Collection<String> bfManufactureDateList) {
        regINS(CK_INS, cTL(bfManufactureDateList), xgetCValueBfManufactureDate(), "BF_MANUFACTURE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDateList The collection of bfManufactureDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_NotInScope(Collection<String> bfManufactureDateList) {
        doSetBfManufactureDate_NotInScope(bfManufactureDateList);
    }

    protected void doSetBfManufactureDate_NotInScope(Collection<String> bfManufactureDateList) {
        regINS(CK_NINS, cTL(bfManufactureDateList), xgetCValueBfManufactureDate(), "BF_MANUFACTURE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)} <br>
     * <pre>e.g. setBfManufactureDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param bfManufactureDate The value of bfManufactureDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setBfManufactureDate_LikeSearch(String bfManufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(bfManufactureDate), xgetCValueBfManufactureDate(), "BF_MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setBfManufactureDate_NotLikeSearch(String bfManufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(bfManufactureDate), xgetCValueBfManufactureDate(), "BF_MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     * @param bfManufactureDate The value of bfManufactureDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBfManufactureDate_PrefixSearch(String bfManufactureDate) {
        setBfManufactureDate_LikeSearch(bfManufactureDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setBfManufactureDate_IsNull() { regBfManufactureDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setBfManufactureDate_IsNullOrEmpty() { regBfManufactureDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setBfManufactureDate_IsNotNull() { regBfManufactureDate(CK_ISNN, DOBJ); }

    protected void regBfManufactureDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBfManufactureDate(), "BF_MANUFACTURE_DATE"); }
    protected abstract ConditionValue xgetCValueBfManufactureDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_Equal(String afManufactureDate) {
        doSetAfManufactureDate_Equal(fRES(afManufactureDate));
    }

    protected void doSetAfManufactureDate_Equal(String afManufactureDate) {
        regAfManufactureDate(CK_EQ, afManufactureDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_NotEqual(String afManufactureDate) {
        doSetAfManufactureDate_NotEqual(fRES(afManufactureDate));
    }

    protected void doSetAfManufactureDate_NotEqual(String afManufactureDate) {
        regAfManufactureDate(CK_NES, afManufactureDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_GreaterThan(String afManufactureDate) {
        regAfManufactureDate(CK_GT, fRES(afManufactureDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_LessThan(String afManufactureDate) {
        regAfManufactureDate(CK_LT, fRES(afManufactureDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_GreaterEqual(String afManufactureDate) {
        regAfManufactureDate(CK_GE, fRES(afManufactureDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_LessEqual(String afManufactureDate) {
        regAfManufactureDate(CK_LE, fRES(afManufactureDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDateList The collection of afManufactureDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_InScope(Collection<String> afManufactureDateList) {
        doSetAfManufactureDate_InScope(afManufactureDateList);
    }

    protected void doSetAfManufactureDate_InScope(Collection<String> afManufactureDateList) {
        regINS(CK_INS, cTL(afManufactureDateList), xgetCValueAfManufactureDate(), "AF_MANUFACTURE_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDateList The collection of afManufactureDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_NotInScope(Collection<String> afManufactureDateList) {
        doSetAfManufactureDate_NotInScope(afManufactureDateList);
    }

    protected void doSetAfManufactureDate_NotInScope(Collection<String> afManufactureDateList) {
        regINS(CK_NINS, cTL(afManufactureDateList), xgetCValueAfManufactureDate(), "AF_MANUFACTURE_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)} <br>
     * <pre>e.g. setAfManufactureDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param afManufactureDate The value of afManufactureDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAfManufactureDate_LikeSearch(String afManufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(afManufactureDate), xgetCValueAfManufactureDate(), "AF_MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAfManufactureDate_NotLikeSearch(String afManufactureDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(afManufactureDate), xgetCValueAfManufactureDate(), "AF_MANUFACTURE_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     * @param afManufactureDate The value of afManufactureDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAfManufactureDate_PrefixSearch(String afManufactureDate) {
        setAfManufactureDate_LikeSearch(afManufactureDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setAfManufactureDate_IsNull() { regAfManufactureDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setAfManufactureDate_IsNullOrEmpty() { regAfManufactureDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * AF_MANUFACTURE_DATE: {varchar(8)}
     */
    public void setAfManufactureDate_IsNotNull() { regAfManufactureDate(CK_ISNN, DOBJ); }

    protected void regAfManufactureDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAfManufactureDate(), "AF_MANUFACTURE_DATE"); }
    protected abstract ConditionValue xgetCValueAfManufactureDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_Equal(String designFlg) {
        doSetDesignFlg_Equal(fRES(designFlg));
    }

    protected void doSetDesignFlg_Equal(String designFlg) {
        regDesignFlg(CK_EQ, designFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotEqual(String designFlg) {
        doSetDesignFlg_NotEqual(fRES(designFlg));
    }

    protected void doSetDesignFlg_NotEqual(String designFlg) {
        regDesignFlg(CK_NES, designFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterThan(String designFlg) {
        regDesignFlg(CK_GT, fRES(designFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessThan(String designFlg) {
        regDesignFlg(CK_LT, fRES(designFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_GreaterEqual(String designFlg) {
        regDesignFlg(CK_GE, fRES(designFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_LessEqual(String designFlg) {
        regDesignFlg(CK_LE, fRES(designFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlgList The collection of designFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_InScope(Collection<String> designFlgList) {
        doSetDesignFlg_InScope(designFlgList);
    }

    protected void doSetDesignFlg_InScope(Collection<String> designFlgList) {
        regINS(CK_INS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlgList The collection of designFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_NotInScope(Collection<String> designFlgList) {
        doSetDesignFlg_NotInScope(designFlgList);
    }

    protected void doSetDesignFlg_NotInScope(Collection<String> designFlgList) {
        regINS(CK_NINS, cTL(designFlgList), xgetCValueDesignFlg(), "DESIGN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)} <br>
     * <pre>e.g. setDesignFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designFlg The value of designFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignFlg_LikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignFlg_NotLikeSearch(String designFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designFlg), xgetCValueDesignFlg(), "DESIGN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     * @param designFlg The value of designFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignFlg_PrefixSearch(String designFlg) {
        setDesignFlg_LikeSearch(designFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNull() { regDesignFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNullOrEmpty() { regDesignFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_FLG: {varchar(30)}
     */
    public void setDesignFlg_IsNotNull() { regDesignFlg(CK_ISNN, DOBJ); }

    protected void regDesignFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignFlg(), "DESIGN_FLG"); }
    protected abstract ConditionValue xgetCValueDesignFlg();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
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
     * RMANO: {varchar(30)}
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
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterThan(String rmano) {
        regRmano(CK_GT, fRES(rmano));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessThan(String rmano) {
        regRmano(CK_LT, fRES(rmano));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_GreaterEqual(String rmano) {
        regRmano(CK_GE, fRES(rmano));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_LessEqual(String rmano) {
        regRmano(CK_LE, fRES(rmano));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(30)}
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
     * RMANO: {varchar(30)}
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
     * RMANO: {varchar(30)} <br>
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
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRmano_NotLikeSearch(String rmano, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rmano), xgetCValueRmano(), "RMANO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RMANO: {varchar(30)}
     * @param rmano The value of rmano as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRmano_PrefixSearch(String rmano) {
        setRmano_LikeSearch(rmano, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     */
    public void setRmano_IsNull() { regRmano(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     */
    public void setRmano_IsNullOrEmpty() { regRmano(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RMANO: {varchar(30)}
     */
    public void setRmano_IsNotNull() { regRmano(CK_ISNN, DOBJ); }

    protected void regRmano(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRmano(), "RMANO"); }
    protected abstract ConditionValue xgetCValueRmano();

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
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrmanufacturedatedetailCB.class);
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
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrmanufacturedatedetailCB.class);
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
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrmanufacturedatedetailCB.class);
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
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrmanufacturedatedetailCB.class);
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
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrmanufacturedatedetailCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrmanufacturedatedetailCB&gt;() {
     *     public void query(TTrmanufacturedatedetailCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrmanufacturedatedetailCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrmanufacturedatedetailCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrmanufacturedatedetailCQ sq);

    protected TTrmanufacturedatedetailCB xcreateScalarConditionCB() {
        TTrmanufacturedatedetailCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrmanufacturedatedetailCB xcreateScalarConditionPartitionByCB() {
        TTrmanufacturedatedetailCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrmanufacturedatedetailCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRMANUFACTUREDATEDETAIL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrmanufacturedatedetailCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrmanufacturedatedetailCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrmanufacturedatedetailCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRMANUFACTUREDATEDETAIL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrmanufacturedatedetailCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrmanufacturedatedetailCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrmanufacturedatedetailCB cb = new TTrmanufacturedatedetailCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrmanufacturedatedetailCQ sq);

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
    protected TTrmanufacturedatedetailCB newMyCB() {
        return new TTrmanufacturedatedetailCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrmanufacturedatedetailCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
