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
 * The abstract condition-query of T_BTRPICK.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTBtrpickCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTBtrpickCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_BTRPICK";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstId The value of pickingInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterThan(Long pickingInstId) {
        regPickingInstId(CK_GT, pickingInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstId The value of pickingInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessThan(Long pickingInstId) {
        regPickingInstId(CK_LT, pickingInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstId The value of pickingInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_GreaterEqual(Long pickingInstId) {
        regPickingInstId(CK_GE, pickingInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param pickingInstId The value of pickingInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingInstId_LessEqual(Long pickingInstId) {
        regPickingInstId(CK_LE, pickingInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingInstId(), "PICKING_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstId_IsNull() { regPickingInstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_INST_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPickingInstId_IsNotNull() { regPickingInstId(CK_ISNN, DOBJ); }

    protected void regPickingInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingInstId(), "PICKING_INST_ID"); }
    protected abstract ConditionValue xgetCValuePickingInstId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_Equal(Long pickbatchkey) {
        doSetPickbatchkey_Equal(pickbatchkey);
    }

    protected void doSetPickbatchkey_Equal(Long pickbatchkey) {
        regPickbatchkey(CK_EQ, pickbatchkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_NotEqual(Long pickbatchkey) {
        doSetPickbatchkey_NotEqual(pickbatchkey);
    }

    protected void doSetPickbatchkey_NotEqual(Long pickbatchkey) {
        regPickbatchkey(CK_NES, pickbatchkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_GreaterThan(Long pickbatchkey) {
        regPickbatchkey(CK_GT, pickbatchkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_LessThan(Long pickbatchkey) {
        regPickbatchkey(CK_LT, pickbatchkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_GreaterEqual(Long pickbatchkey) {
        regPickbatchkey(CK_GE, pickbatchkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkey The value of pickbatchkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickbatchkey_LessEqual(Long pickbatchkey) {
        regPickbatchkey(CK_LE, pickbatchkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param minNumber The min number of pickbatchkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickbatchkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickbatchkey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickbatchkey(), "PICKBATCHKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkeyList The collection of pickbatchkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchkey_InScope(Collection<Long> pickbatchkeyList) {
        doSetPickbatchkey_InScope(pickbatchkeyList);
    }

    protected void doSetPickbatchkey_InScope(Collection<Long> pickbatchkeyList) {
        regINS(CK_INS, cTL(pickbatchkeyList), xgetCValuePickbatchkey(), "PICKBATCHKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKBATCHKEY: {NotNull, bigint(19)}
     * @param pickbatchkeyList The collection of pickbatchkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchkey_NotInScope(Collection<Long> pickbatchkeyList) {
        doSetPickbatchkey_NotInScope(pickbatchkeyList);
    }

    protected void doSetPickbatchkey_NotInScope(Collection<Long> pickbatchkeyList) {
        regINS(CK_NINS, cTL(pickbatchkeyList), xgetCValuePickbatchkey(), "PICKBATCHKEY");
    }

    protected void regPickbatchkey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickbatchkey(), "PICKBATCHKEY"); }
    protected abstract ConditionValue xgetCValuePickbatchkey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_Equal(String pickbatchtype) {
        doSetPickbatchtype_Equal(fRES(pickbatchtype));
    }

    protected void doSetPickbatchtype_Equal(String pickbatchtype) {
        regPickbatchtype(CK_EQ, pickbatchtype);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_NotEqual(String pickbatchtype) {
        doSetPickbatchtype_NotEqual(fRES(pickbatchtype));
    }

    protected void doSetPickbatchtype_NotEqual(String pickbatchtype) {
        regPickbatchtype(CK_NES, pickbatchtype);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_GreaterThan(String pickbatchtype) {
        regPickbatchtype(CK_GT, fRES(pickbatchtype));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_LessThan(String pickbatchtype) {
        regPickbatchtype(CK_LT, fRES(pickbatchtype));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_GreaterEqual(String pickbatchtype) {
        regPickbatchtype(CK_GE, fRES(pickbatchtype));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_LessEqual(String pickbatchtype) {
        regPickbatchtype(CK_LE, fRES(pickbatchtype));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtypeList The collection of pickbatchtype as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_InScope(Collection<String> pickbatchtypeList) {
        doSetPickbatchtype_InScope(pickbatchtypeList);
    }

    protected void doSetPickbatchtype_InScope(Collection<String> pickbatchtypeList) {
        regINS(CK_INS, cTL(pickbatchtypeList), xgetCValuePickbatchtype(), "PICKBATCHTYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtypeList The collection of pickbatchtype as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_NotInScope(Collection<String> pickbatchtypeList) {
        doSetPickbatchtype_NotInScope(pickbatchtypeList);
    }

    protected void doSetPickbatchtype_NotInScope(Collection<String> pickbatchtypeList) {
        regINS(CK_NINS, cTL(pickbatchtypeList), xgetCValuePickbatchtype(), "PICKBATCHTYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)} <br>
     * <pre>e.g. setPickbatchtype_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickbatchtype The value of pickbatchtype as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickbatchtype_LikeSearch(String pickbatchtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickbatchtype), xgetCValuePickbatchtype(), "PICKBATCHTYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickbatchtype_NotLikeSearch(String pickbatchtype, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickbatchtype), xgetCValuePickbatchtype(), "PICKBATCHTYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     * @param pickbatchtype The value of pickbatchtype as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchtype_PrefixSearch(String pickbatchtype) {
        setPickbatchtype_LikeSearch(pickbatchtype, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     */
    public void setPickbatchtype_IsNull() { regPickbatchtype(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     */
    public void setPickbatchtype_IsNullOrEmpty() { regPickbatchtype(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKBATCHTYPE: {IX+, varchar(30)}
     */
    public void setPickbatchtype_IsNotNull() { regPickbatchtype(CK_ISNN, DOBJ); }

    protected void regPickbatchtype(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickbatchtype(), "PICKBATCHTYPE"); }
    protected abstract ConditionValue xgetCValuePickbatchtype();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_Equal(String pickbatchgroup) {
        doSetPickbatchgroup_Equal(fRES(pickbatchgroup));
    }

    protected void doSetPickbatchgroup_Equal(String pickbatchgroup) {
        regPickbatchgroup(CK_EQ, pickbatchgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_NotEqual(String pickbatchgroup) {
        doSetPickbatchgroup_NotEqual(fRES(pickbatchgroup));
    }

    protected void doSetPickbatchgroup_NotEqual(String pickbatchgroup) {
        regPickbatchgroup(CK_NES, pickbatchgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_GreaterThan(String pickbatchgroup) {
        regPickbatchgroup(CK_GT, fRES(pickbatchgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_LessThan(String pickbatchgroup) {
        regPickbatchgroup(CK_LT, fRES(pickbatchgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_GreaterEqual(String pickbatchgroup) {
        regPickbatchgroup(CK_GE, fRES(pickbatchgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_LessEqual(String pickbatchgroup) {
        regPickbatchgroup(CK_LE, fRES(pickbatchgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroupList The collection of pickbatchgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_InScope(Collection<String> pickbatchgroupList) {
        doSetPickbatchgroup_InScope(pickbatchgroupList);
    }

    protected void doSetPickbatchgroup_InScope(Collection<String> pickbatchgroupList) {
        regINS(CK_INS, cTL(pickbatchgroupList), xgetCValuePickbatchgroup(), "PICKBATCHGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroupList The collection of pickbatchgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_NotInScope(Collection<String> pickbatchgroupList) {
        doSetPickbatchgroup_NotInScope(pickbatchgroupList);
    }

    protected void doSetPickbatchgroup_NotInScope(Collection<String> pickbatchgroupList) {
        regINS(CK_NINS, cTL(pickbatchgroupList), xgetCValuePickbatchgroup(), "PICKBATCHGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)} <br>
     * <pre>e.g. setPickbatchgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickbatchgroup The value of pickbatchgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickbatchgroup_LikeSearch(String pickbatchgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickbatchgroup), xgetCValuePickbatchgroup(), "PICKBATCHGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickbatchgroup_NotLikeSearch(String pickbatchgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickbatchgroup), xgetCValuePickbatchgroup(), "PICKBATCHGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     * @param pickbatchgroup The value of pickbatchgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickbatchgroup_PrefixSearch(String pickbatchgroup) {
        setPickbatchgroup_LikeSearch(pickbatchgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     */
    public void setPickbatchgroup_IsNull() { regPickbatchgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     */
    public void setPickbatchgroup_IsNullOrEmpty() { regPickbatchgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKBATCHGROUP: {varchar(60)}
     */
    public void setPickbatchgroup_IsNotNull() { regPickbatchgroup(CK_ISNN, DOBJ); }

    protected void regPickbatchgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickbatchgroup(), "PICKBATCHGROUP"); }
    protected abstract ConditionValue xgetCValuePickbatchgroup();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @param pickdate The value of pickdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickdate_Equal(java.sql.Timestamp pickdate) {
        regPickdate(CK_EQ,  pickdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @param pickdate The value of pickdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickdate_GreaterThan(java.sql.Timestamp pickdate) {
        regPickdate(CK_GT,  pickdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @param pickdate The value of pickdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickdate_LessThan(java.sql.Timestamp pickdate) {
        regPickdate(CK_LT,  pickdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @param pickdate The value of pickdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickdate_GreaterEqual(java.sql.Timestamp pickdate) {
        regPickdate(CK_GE,  pickdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * @param pickdate The value of pickdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickdate_LessEqual(java.sql.Timestamp pickdate) {
        regPickdate(CK_LE, pickdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * <pre>e.g. setPickdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pickdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pickdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPickdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePickdate(), "PICKDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKDATE: {IX, NotNull, datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pickdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pickdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPickdate_DateFromTo(Date fromDate, Date toDate) {
        setPickdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    protected void regPickdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickdate(), "PICKDATE"); }
    protected abstract ConditionValue xgetCValuePickdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @param pickstartdate The value of pickstartdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickstartdate_Equal(java.sql.Timestamp pickstartdate) {
        regPickstartdate(CK_EQ,  pickstartdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @param pickstartdate The value of pickstartdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickstartdate_GreaterThan(java.sql.Timestamp pickstartdate) {
        regPickstartdate(CK_GT,  pickstartdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @param pickstartdate The value of pickstartdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickstartdate_LessThan(java.sql.Timestamp pickstartdate) {
        regPickstartdate(CK_LT,  pickstartdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @param pickstartdate The value of pickstartdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickstartdate_GreaterEqual(java.sql.Timestamp pickstartdate) {
        regPickstartdate(CK_GE,  pickstartdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * @param pickstartdate The value of pickstartdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickstartdate_LessEqual(java.sql.Timestamp pickstartdate) {
        regPickstartdate(CK_LE, pickstartdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * <pre>e.g. setPickstartdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pickstartdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pickstartdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPickstartdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePickstartdate(), "PICKSTARTDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pickstartdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pickstartdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPickstartdate_DateFromTo(Date fromDate, Date toDate) {
        setPickstartdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     */
    public void setPickstartdate_IsNull() { regPickstartdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKSTARTDATE: {datetime2(26, 6)}
     */
    public void setPickstartdate_IsNotNull() { regPickstartdate(CK_ISNN, DOBJ); }

    protected void regPickstartdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickstartdate(), "PICKSTARTDATE"); }
    protected abstract ConditionValue xgetCValuePickstartdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_Equal(String notes) {
        doSetNotes_Equal(fRES(notes));
    }

    protected void doSetNotes_Equal(String notes) {
        regNotes(CK_EQ, notes);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotEqual(String notes) {
        doSetNotes_NotEqual(fRES(notes));
    }

    protected void doSetNotes_NotEqual(String notes) {
        regNotes(CK_NES, notes);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterThan(String notes) {
        regNotes(CK_GT, fRES(notes));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessThan(String notes) {
        regNotes(CK_LT, fRES(notes));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_GreaterEqual(String notes) {
        regNotes(CK_GE, fRES(notes));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_LessEqual(String notes) {
        regNotes(CK_LE, fRES(notes));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_InScope(Collection<String> notesList) {
        doSetNotes_InScope(notesList);
    }

    protected void doSetNotes_InScope(Collection<String> notesList) {
        regINS(CK_INS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notesList The collection of notes as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_NotInScope(Collection<String> notesList) {
        doSetNotes_NotInScope(notesList);
    }

    protected void doSetNotes_NotInScope(Collection<String> notesList) {
        regINS(CK_NINS, cTL(notesList), xgetCValueNotes(), "NOTES");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)} <br>
     * <pre>e.g. setNotes_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param notes The value of notes as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNotes_LikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNotes_NotLikeSearch(String notes, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(notes), xgetCValueNotes(), "NOTES", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NOTES: {varchar(4000)}
     * @param notes The value of notes as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNotes_PrefixSearch(String notes) {
        setNotes_LikeSearch(notes, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNull() { regNotes(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNullOrEmpty() { regNotes(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NOTES: {varchar(4000)}
     */
    public void setNotes_IsNotNull() { regNotes(CK_ISNN, DOBJ); }

    protected void regNotes(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNotes(), "NOTES"); }
    protected abstract ConditionValue xgetCValueNotes();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
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
     * SHIPDATE: {IX, varchar(8)}
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
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterThan(String shipdate) {
        regShipdate(CK_GT, fRES(shipdate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessThan(String shipdate) {
        regShipdate(CK_LT, fRES(shipdate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_GreaterEqual(String shipdate) {
        regShipdate(CK_GE, fRES(shipdate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_LessEqual(String shipdate) {
        regShipdate(CK_LE, fRES(shipdate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
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
     * SHIPDATE: {IX, varchar(8)}
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
     * SHIPDATE: {IX, varchar(8)} <br>
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
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShipdate_NotLikeSearch(String shipdate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shipdate), xgetCValueShipdate(), "SHIPDATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     * @param shipdate The value of shipdate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShipdate_PrefixSearch(String shipdate) {
        setShipdate_LikeSearch(shipdate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNull() { regShipdate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNullOrEmpty() { regShipdate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPDATE: {IX, varchar(8)}
     */
    public void setShipdate_IsNotNull() { regShipdate(CK_ISNN, DOBJ); }

    protected void regShipdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShipdate(), "SHIPDATE"); }
    protected abstract ConditionValue xgetCValueShipdate();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivschdate_Equal(java.sql.Timestamp delivschdate) {
        regDelivschdate(CK_EQ,  delivschdate);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivschdate_GreaterThan(java.sql.Timestamp delivschdate) {
        regDelivschdate(CK_GT,  delivschdate);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivschdate_LessThan(java.sql.Timestamp delivschdate) {
        regDelivschdate(CK_LT,  delivschdate);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivschdate_GreaterEqual(java.sql.Timestamp delivschdate) {
        regDelivschdate(CK_GE,  delivschdate);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * @param delivschdate The value of delivschdate as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivschdate_LessEqual(java.sql.Timestamp delivschdate) {
        regDelivschdate(CK_LE, delivschdate);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * <pre>e.g. setDelivschdate_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of delivschdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of delivschdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setDelivschdate_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueDelivschdate(), "DELIVSCHDATE", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of delivschdate. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of delivschdate. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setDelivschdate_DateFromTo(Date fromDate, Date toDate) {
        setDelivschdate_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     */
    public void setDelivschdate_IsNull() { regDelivschdate(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVSCHDATE: {datetime2(26, 6), default=[sysdatetime()]}
     */
    public void setDelivschdate_IsNotNull() { regDelivschdate(CK_ISNN, DOBJ); }

    protected void regDelivschdate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivschdate(), "DELIVSCHDATE"); }
    protected abstract ConditionValue xgetCValueDelivschdate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_Equal(String allocgroup) {
        doSetAllocgroup_Equal(fRES(allocgroup));
    }

    protected void doSetAllocgroup_Equal(String allocgroup) {
        regAllocgroup(CK_EQ, allocgroup);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_NotEqual(String allocgroup) {
        doSetAllocgroup_NotEqual(fRES(allocgroup));
    }

    protected void doSetAllocgroup_NotEqual(String allocgroup) {
        regAllocgroup(CK_NES, allocgroup);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_GreaterThan(String allocgroup) {
        regAllocgroup(CK_GT, fRES(allocgroup));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_LessThan(String allocgroup) {
        regAllocgroup(CK_LT, fRES(allocgroup));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_GreaterEqual(String allocgroup) {
        regAllocgroup(CK_GE, fRES(allocgroup));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_LessEqual(String allocgroup) {
        regAllocgroup(CK_LE, fRES(allocgroup));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroupList The collection of allocgroup as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_InScope(Collection<String> allocgroupList) {
        doSetAllocgroup_InScope(allocgroupList);
    }

    protected void doSetAllocgroup_InScope(Collection<String> allocgroupList) {
        regINS(CK_INS, cTL(allocgroupList), xgetCValueAllocgroup(), "ALLOCGROUP");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroupList The collection of allocgroup as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_NotInScope(Collection<String> allocgroupList) {
        doSetAllocgroup_NotInScope(allocgroupList);
    }

    protected void doSetAllocgroup_NotInScope(Collection<String> allocgroupList) {
        regINS(CK_NINS, cTL(allocgroupList), xgetCValueAllocgroup(), "ALLOCGROUP");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)} <br>
     * <pre>e.g. setAllocgroup_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param allocgroup The value of allocgroup as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAllocgroup_LikeSearch(String allocgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(allocgroup), xgetCValueAllocgroup(), "ALLOCGROUP", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAllocgroup_NotLikeSearch(String allocgroup, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(allocgroup), xgetCValueAllocgroup(), "ALLOCGROUP", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     * @param allocgroup The value of allocgroup as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocgroup_PrefixSearch(String allocgroup) {
        setAllocgroup_LikeSearch(allocgroup, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNull() { regAllocgroup(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNullOrEmpty() { regAllocgroup(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOCGROUP: {varchar(60)}
     */
    public void setAllocgroup_IsNotNull() { regAllocgroup(CK_ISNN, DOBJ); }

    protected void regAllocgroup(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocgroup(), "ALLOCGROUP"); }
    protected abstract ConditionValue xgetCValueAllocgroup();

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
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_Equal(Long picklinetotal) {
        doSetPicklinetotal_Equal(picklinetotal);
    }

    protected void doSetPicklinetotal_Equal(Long picklinetotal) {
        regPicklinetotal(CK_EQ, picklinetotal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_NotEqual(Long picklinetotal) {
        doSetPicklinetotal_NotEqual(picklinetotal);
    }

    protected void doSetPicklinetotal_NotEqual(Long picklinetotal) {
        regPicklinetotal(CK_NES, picklinetotal);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_GreaterThan(Long picklinetotal) {
        regPicklinetotal(CK_GT, picklinetotal);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_LessThan(Long picklinetotal) {
        regPicklinetotal(CK_LT, picklinetotal);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_GreaterEqual(Long picklinetotal) {
        regPicklinetotal(CK_GE, picklinetotal);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotal The value of picklinetotal as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicklinetotal_LessEqual(Long picklinetotal) {
        regPicklinetotal(CK_LE, picklinetotal);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param minNumber The min number of picklinetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picklinetotal. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicklinetotal_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicklinetotal(), "PICKLINETOTAL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotalList The collection of picklinetotal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklinetotal_InScope(Collection<Long> picklinetotalList) {
        doSetPicklinetotal_InScope(picklinetotalList);
    }

    protected void doSetPicklinetotal_InScope(Collection<Long> picklinetotalList) {
        regINS(CK_INS, cTL(picklinetotalList), xgetCValuePicklinetotal(), "PICKLINETOTAL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     * @param picklinetotalList The collection of picklinetotal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicklinetotal_NotInScope(Collection<Long> picklinetotalList) {
        doSetPicklinetotal_NotInScope(picklinetotalList);
    }

    protected void doSetPicklinetotal_NotInScope(Collection<Long> picklinetotalList) {
        regINS(CK_NINS, cTL(picklinetotalList), xgetCValuePicklinetotal(), "PICKLINETOTAL");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     */
    public void setPicklinetotal_IsNull() { regPicklinetotal(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKLINETOTAL: {bigint(19), default=[(0)]}
     */
    public void setPicklinetotal_IsNotNull() { regPicklinetotal(CK_ISNN, DOBJ); }

    protected void regPicklinetotal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicklinetotal(), "PICKLINETOTAL"); }
    protected abstract ConditionValue xgetCValuePicklinetotal();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_Equal(Long pickingway) {
        doSetPickingway_Equal(pickingway);
    }

    protected void doSetPickingway_Equal(Long pickingway) {
        regPickingway(CK_EQ, pickingway);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_NotEqual(Long pickingway) {
        doSetPickingway_NotEqual(pickingway);
    }

    protected void doSetPickingway_NotEqual(Long pickingway) {
        regPickingway(CK_NES, pickingway);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_GreaterThan(Long pickingway) {
        regPickingway(CK_GT, pickingway);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_LessThan(Long pickingway) {
        regPickingway(CK_LT, pickingway);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_GreaterEqual(Long pickingway) {
        regPickingway(CK_GE, pickingway);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingway The value of pickingway as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingway_LessEqual(Long pickingway) {
        regPickingway(CK_LE, pickingway);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param minNumber The min number of pickingway. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingway. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingway_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingway(), "PICKINGWAY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingwayList The collection of pickingway as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingway_InScope(Collection<Long> pickingwayList) {
        doSetPickingway_InScope(pickingwayList);
    }

    protected void doSetPickingway_InScope(Collection<Long> pickingwayList) {
        regINS(CK_INS, cTL(pickingwayList), xgetCValuePickingway(), "PICKINGWAY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     * @param pickingwayList The collection of pickingway as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingway_NotInScope(Collection<Long> pickingwayList) {
        doSetPickingway_NotInScope(pickingwayList);
    }

    protected void doSetPickingway_NotInScope(Collection<Long> pickingwayList) {
        regINS(CK_NINS, cTL(pickingwayList), xgetCValuePickingway(), "PICKINGWAY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     */
    public void setPickingway_IsNull() { regPickingway(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKINGWAY: {bigint(19), default=[(0)]}
     */
    public void setPickingway_IsNotNull() { regPickingway(CK_ISNN, DOBJ); }

    protected void regPickingway(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingway(), "PICKINGWAY"); }
    protected abstract ConditionValue xgetCValuePickingway();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_Equal(Long execkey) {
        doSetExeckey_Equal(execkey);
    }

    protected void doSetExeckey_Equal(Long execkey) {
        regExeckey(CK_EQ, execkey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_NotEqual(Long execkey) {
        doSetExeckey_NotEqual(execkey);
    }

    protected void doSetExeckey_NotEqual(Long execkey) {
        regExeckey(CK_NES, execkey);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_GreaterThan(Long execkey) {
        regExeckey(CK_GT, execkey);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_LessThan(Long execkey) {
        regExeckey(CK_LT, execkey);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_GreaterEqual(Long execkey) {
        regExeckey(CK_GE, execkey);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkey The value of execkey as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setExeckey_LessEqual(Long execkey) {
        regExeckey(CK_LE, execkey);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param minNumber The min number of execkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of execkey. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setExeckey_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueExeckey(), "EXECKEY", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkeyList The collection of execkey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExeckey_InScope(Collection<Long> execkeyList) {
        doSetExeckey_InScope(execkeyList);
    }

    protected void doSetExeckey_InScope(Collection<Long> execkeyList) {
        regINS(CK_INS, cTL(execkeyList), xgetCValueExeckey(), "EXECKEY");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     * @param execkeyList The collection of execkey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExeckey_NotInScope(Collection<Long> execkeyList) {
        doSetExeckey_NotInScope(execkeyList);
    }

    protected void doSetExeckey_NotInScope(Collection<Long> execkeyList) {
        regINS(CK_NINS, cTL(execkeyList), xgetCValueExeckey(), "EXECKEY");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     */
    public void setExeckey_IsNull() { regExeckey(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXECKEY: {IX, bigint(19)}
     */
    public void setExeckey_IsNotNull() { regExeckey(CK_ISNN, DOBJ); }

    protected void regExeckey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExeckey(), "EXECKEY"); }
    protected abstract ConditionValue xgetCValueExeckey();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, bigint(19)}
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
     * CENTER_ID: {NotNull, bigint(19)}
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
    public HpSLCFunction<TBtrpickCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TBtrpickCB.class);
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
    public HpSLCFunction<TBtrpickCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TBtrpickCB.class);
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
    public HpSLCFunction<TBtrpickCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TBtrpickCB.class);
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
    public HpSLCFunction<TBtrpickCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TBtrpickCB.class);
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
    public HpSLCFunction<TBtrpickCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TBtrpickCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TBtrpickCB&gt;() {
     *     public void query(TBtrpickCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TBtrpickCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TBtrpickCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TBtrpickCQ sq);

    protected TBtrpickCB xcreateScalarConditionCB() {
        TBtrpickCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TBtrpickCB xcreateScalarConditionPartitionByCB() {
        TBtrpickCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TBtrpickCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickCB cb = new TBtrpickCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_INST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TBtrpickCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TBtrpickCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TBtrpickCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TBtrpickCB cb = new TBtrpickCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_INST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TBtrpickCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TBtrpickCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TBtrpickCB cb = new TBtrpickCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TBtrpickCQ sq);

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
    protected TBtrpickCB newMyCB() {
        return new TBtrpickCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TBtrpickCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
