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
 * The abstract condition-query of M_CENTER_CLASS_DTL_SUB.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCenterClassDtlSubCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCenterClassDtlSubCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_CENTER_CLASS_DTL_SUB";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_Equal(Long centerClassDtlId) {
        doSetCenterClassDtlId_Equal(centerClassDtlId);
    }

    protected void doSetCenterClassDtlId_Equal(Long centerClassDtlId) {
        regCenterClassDtlId(CK_EQ, centerClassDtlId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_NotEqual(Long centerClassDtlId) {
        doSetCenterClassDtlId_NotEqual(centerClassDtlId);
    }

    protected void doSetCenterClassDtlId_NotEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_NES, centerClassDtlId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_GreaterThan(Long centerClassDtlId) {
        regCenterClassDtlId(CK_GT, centerClassDtlId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_LessThan(Long centerClassDtlId) {
        regCenterClassDtlId(CK_LT, centerClassDtlId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_GreaterEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_GE, centerClassDtlId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlId The value of centerClassDtlId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_LessEqual(Long centerClassDtlId) {
        regCenterClassDtlId(CK_LE, centerClassDtlId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param minNumber The min number of centerClassDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerClassDtlId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterClassDtlId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlIdList The collection of centerClassDtlId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_InScope(Collection<Long> centerClassDtlIdList) {
        doSetCenterClassDtlId_InScope(centerClassDtlIdList);
    }

    protected void doSetCenterClassDtlId_InScope(Collection<Long> centerClassDtlIdList) {
        regINS(CK_INS, cTL(centerClassDtlIdList), xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     * @param centerClassDtlIdList The collection of centerClassDtlId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterClassDtlId_NotInScope(Collection<Long> centerClassDtlIdList) {
        doSetCenterClassDtlId_NotInScope(centerClassDtlIdList);
    }

    protected void doSetCenterClassDtlId_NotInScope(Collection<Long> centerClassDtlIdList) {
        regINS(CK_NINS, cTL(centerClassDtlIdList), xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_DTL where ...)} <br />
     * M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @param subCBLambda The callback for sub-query of MCenterClassDtl for 'in-scope'. (NotNull)
     */
    public void inScopeMCenterClassDtl(SubQuery<MCenterClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlCB cb = new MCenterClassDtlCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassDtlId_InScopeRelation_MCenterClassDtl(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassDtl", false);
    }
    public abstract String keepCenterClassDtlId_InScopeRelation_MCenterClassDtl(MCenterClassDtlCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_CLASS_DTL_ID from M_CENTER_CLASS_DTL where ...)} <br />
     * M_CENTER_CLASS_DTL by my CENTER_CLASS_DTL_ID, named 'MCenterClassDtl'.
     * @param subCBLambda The callback for sub-query of MCenterClassDtl for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenterClassDtl(SubQuery<MCenterClassDtlCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlCB cb = new MCenterClassDtlCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterClassDtlId_NotInScopeRelation_MCenterClassDtl(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_CLASS_DTL_ID", "CENTER_CLASS_DTL_ID", pp, "mCenterClassDtl", true);
    }
    public abstract String keepCenterClassDtlId_NotInScopeRelation_MCenterClassDtl(MCenterClassDtlCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     */
    public void setCenterClassDtlId_IsNull() { regCenterClassDtlId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_CLASS_DTL_ID: {PK, NotNull, bigint(19), FK to M_CENTER_CLASS_DTL}
     */
    public void setCenterClassDtlId_IsNotNull() { regCenterClassDtlId(CK_ISNN, DOBJ); }

    protected void regCenterClassDtlId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterClassDtlId(), "CENTER_CLASS_DTL_ID"); }
    protected abstract ConditionValue xgetCValueCenterClassDtlId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
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
     * OTHERCD1: {varchar(30)}
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
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_GreaterThan(String othercd1) {
        regOthercd1(CK_GT, fRES(othercd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_LessThan(String othercd1) {
        regOthercd1(CK_LT, fRES(othercd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_GreaterEqual(String othercd1) {
        regOthercd1(CK_GE, fRES(othercd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_LessEqual(String othercd1) {
        regOthercd1(CK_LE, fRES(othercd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(30)}
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
     * OTHERCD1: {varchar(30)}
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
     * OTHERCD1: {varchar(30)} <br>
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
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd1_NotLikeSearch(String othercd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd1), xgetCValueOthercd1(), "OTHERCD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD1: {varchar(30)}
     * @param othercd1 The value of othercd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd1_PrefixSearch(String othercd1) {
        setOthercd1_LikeSearch(othercd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     */
    public void setOthercd1_IsNull() { regOthercd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     */
    public void setOthercd1_IsNullOrEmpty() { regOthercd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD1: {varchar(30)}
     */
    public void setOthercd1_IsNotNull() { regOthercd1(CK_ISNN, DOBJ); }

    protected void regOthercd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd1(), "OTHERCD1"); }
    protected abstract ConditionValue xgetCValueOthercd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_Equal(String othercd2) {
        doSetOthercd2_Equal(fRES(othercd2));
    }

    protected void doSetOthercd2_Equal(String othercd2) {
        regOthercd2(CK_EQ, othercd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_NotEqual(String othercd2) {
        doSetOthercd2_NotEqual(fRES(othercd2));
    }

    protected void doSetOthercd2_NotEqual(String othercd2) {
        regOthercd2(CK_NES, othercd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_GreaterThan(String othercd2) {
        regOthercd2(CK_GT, fRES(othercd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_LessThan(String othercd2) {
        regOthercd2(CK_LT, fRES(othercd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_GreaterEqual(String othercd2) {
        regOthercd2(CK_GE, fRES(othercd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_LessEqual(String othercd2) {
        regOthercd2(CK_LE, fRES(othercd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2List The collection of othercd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_InScope(Collection<String> othercd2List) {
        doSetOthercd2_InScope(othercd2List);
    }

    protected void doSetOthercd2_InScope(Collection<String> othercd2List) {
        regINS(CK_INS, cTL(othercd2List), xgetCValueOthercd2(), "OTHERCD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2List The collection of othercd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_NotInScope(Collection<String> othercd2List) {
        doSetOthercd2_NotInScope(othercd2List);
    }

    protected void doSetOthercd2_NotInScope(Collection<String> othercd2List) {
        regINS(CK_NINS, cTL(othercd2List), xgetCValueOthercd2(), "OTHERCD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD2: {varchar(30)} <br>
     * <pre>e.g. setOthercd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercd2 The value of othercd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercd2_LikeSearch(String othercd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercd2), xgetCValueOthercd2(), "OTHERCD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd2_NotLikeSearch(String othercd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd2), xgetCValueOthercd2(), "OTHERCD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD2: {varchar(30)}
     * @param othercd2 The value of othercd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd2_PrefixSearch(String othercd2) {
        setOthercd2_LikeSearch(othercd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     */
    public void setOthercd2_IsNull() { regOthercd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     */
    public void setOthercd2_IsNullOrEmpty() { regOthercd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD2: {varchar(30)}
     */
    public void setOthercd2_IsNotNull() { regOthercd2(CK_ISNN, DOBJ); }

    protected void regOthercd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd2(), "OTHERCD2"); }
    protected abstract ConditionValue xgetCValueOthercd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_Equal(String othercd3) {
        doSetOthercd3_Equal(fRES(othercd3));
    }

    protected void doSetOthercd3_Equal(String othercd3) {
        regOthercd3(CK_EQ, othercd3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_NotEqual(String othercd3) {
        doSetOthercd3_NotEqual(fRES(othercd3));
    }

    protected void doSetOthercd3_NotEqual(String othercd3) {
        regOthercd3(CK_NES, othercd3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_GreaterThan(String othercd3) {
        regOthercd3(CK_GT, fRES(othercd3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_LessThan(String othercd3) {
        regOthercd3(CK_LT, fRES(othercd3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_GreaterEqual(String othercd3) {
        regOthercd3(CK_GE, fRES(othercd3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_LessEqual(String othercd3) {
        regOthercd3(CK_LE, fRES(othercd3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3List The collection of othercd3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_InScope(Collection<String> othercd3List) {
        doSetOthercd3_InScope(othercd3List);
    }

    protected void doSetOthercd3_InScope(Collection<String> othercd3List) {
        regINS(CK_INS, cTL(othercd3List), xgetCValueOthercd3(), "OTHERCD3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3List The collection of othercd3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_NotInScope(Collection<String> othercd3List) {
        doSetOthercd3_NotInScope(othercd3List);
    }

    protected void doSetOthercd3_NotInScope(Collection<String> othercd3List) {
        regINS(CK_NINS, cTL(othercd3List), xgetCValueOthercd3(), "OTHERCD3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD3: {varchar(30)} <br>
     * <pre>e.g. setOthercd3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercd3 The value of othercd3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercd3_LikeSearch(String othercd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercd3), xgetCValueOthercd3(), "OTHERCD3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd3_NotLikeSearch(String othercd3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd3), xgetCValueOthercd3(), "OTHERCD3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD3: {varchar(30)}
     * @param othercd3 The value of othercd3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd3_PrefixSearch(String othercd3) {
        setOthercd3_LikeSearch(othercd3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     */
    public void setOthercd3_IsNull() { regOthercd3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     */
    public void setOthercd3_IsNullOrEmpty() { regOthercd3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD3: {varchar(30)}
     */
    public void setOthercd3_IsNotNull() { regOthercd3(CK_ISNN, DOBJ); }

    protected void regOthercd3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd3(), "OTHERCD3"); }
    protected abstract ConditionValue xgetCValueOthercd3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_Equal(String othercd4) {
        doSetOthercd4_Equal(fRES(othercd4));
    }

    protected void doSetOthercd4_Equal(String othercd4) {
        regOthercd4(CK_EQ, othercd4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_NotEqual(String othercd4) {
        doSetOthercd4_NotEqual(fRES(othercd4));
    }

    protected void doSetOthercd4_NotEqual(String othercd4) {
        regOthercd4(CK_NES, othercd4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_GreaterThan(String othercd4) {
        regOthercd4(CK_GT, fRES(othercd4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_LessThan(String othercd4) {
        regOthercd4(CK_LT, fRES(othercd4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_GreaterEqual(String othercd4) {
        regOthercd4(CK_GE, fRES(othercd4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_LessEqual(String othercd4) {
        regOthercd4(CK_LE, fRES(othercd4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4List The collection of othercd4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_InScope(Collection<String> othercd4List) {
        doSetOthercd4_InScope(othercd4List);
    }

    protected void doSetOthercd4_InScope(Collection<String> othercd4List) {
        regINS(CK_INS, cTL(othercd4List), xgetCValueOthercd4(), "OTHERCD4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4List The collection of othercd4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_NotInScope(Collection<String> othercd4List) {
        doSetOthercd4_NotInScope(othercd4List);
    }

    protected void doSetOthercd4_NotInScope(Collection<String> othercd4List) {
        regINS(CK_NINS, cTL(othercd4List), xgetCValueOthercd4(), "OTHERCD4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD4: {varchar(30)} <br>
     * <pre>e.g. setOthercd4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercd4 The value of othercd4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercd4_LikeSearch(String othercd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercd4), xgetCValueOthercd4(), "OTHERCD4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd4_NotLikeSearch(String othercd4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd4), xgetCValueOthercd4(), "OTHERCD4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD4: {varchar(30)}
     * @param othercd4 The value of othercd4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd4_PrefixSearch(String othercd4) {
        setOthercd4_LikeSearch(othercd4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     */
    public void setOthercd4_IsNull() { regOthercd4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     */
    public void setOthercd4_IsNullOrEmpty() { regOthercd4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD4: {varchar(30)}
     */
    public void setOthercd4_IsNotNull() { regOthercd4(CK_ISNN, DOBJ); }

    protected void regOthercd4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd4(), "OTHERCD4"); }
    protected abstract ConditionValue xgetCValueOthercd4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_Equal(String othercd5) {
        doSetOthercd5_Equal(fRES(othercd5));
    }

    protected void doSetOthercd5_Equal(String othercd5) {
        regOthercd5(CK_EQ, othercd5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_NotEqual(String othercd5) {
        doSetOthercd5_NotEqual(fRES(othercd5));
    }

    protected void doSetOthercd5_NotEqual(String othercd5) {
        regOthercd5(CK_NES, othercd5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_GreaterThan(String othercd5) {
        regOthercd5(CK_GT, fRES(othercd5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_LessThan(String othercd5) {
        regOthercd5(CK_LT, fRES(othercd5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_GreaterEqual(String othercd5) {
        regOthercd5(CK_GE, fRES(othercd5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_LessEqual(String othercd5) {
        regOthercd5(CK_LE, fRES(othercd5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5List The collection of othercd5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_InScope(Collection<String> othercd5List) {
        doSetOthercd5_InScope(othercd5List);
    }

    protected void doSetOthercd5_InScope(Collection<String> othercd5List) {
        regINS(CK_INS, cTL(othercd5List), xgetCValueOthercd5(), "OTHERCD5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5List The collection of othercd5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_NotInScope(Collection<String> othercd5List) {
        doSetOthercd5_NotInScope(othercd5List);
    }

    protected void doSetOthercd5_NotInScope(Collection<String> othercd5List) {
        regINS(CK_NINS, cTL(othercd5List), xgetCValueOthercd5(), "OTHERCD5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD5: {varchar(30)} <br>
     * <pre>e.g. setOthercd5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param othercd5 The value of othercd5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOthercd5_LikeSearch(String othercd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(othercd5), xgetCValueOthercd5(), "OTHERCD5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOthercd5_NotLikeSearch(String othercd5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(othercd5), xgetCValueOthercd5(), "OTHERCD5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHERCD5: {varchar(30)}
     * @param othercd5 The value of othercd5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOthercd5_PrefixSearch(String othercd5) {
        setOthercd5_LikeSearch(othercd5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     */
    public void setOthercd5_IsNull() { regOthercd5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     */
    public void setOthercd5_IsNullOrEmpty() { regOthercd5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHERCD5: {varchar(30)}
     */
    public void setOthercd5_IsNotNull() { regOthercd5(CK_ISNN, DOBJ); }

    protected void regOthercd5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOthercd5(), "OTHERCD5"); }
    protected abstract ConditionValue xgetCValueOthercd5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_Equal(String other1Comment) {
        doSetOther1Comment_Equal(fRES(other1Comment));
    }

    protected void doSetOther1Comment_Equal(String other1Comment) {
        regOther1Comment(CK_EQ, other1Comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_NotEqual(String other1Comment) {
        doSetOther1Comment_NotEqual(fRES(other1Comment));
    }

    protected void doSetOther1Comment_NotEqual(String other1Comment) {
        regOther1Comment(CK_NES, other1Comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_GreaterThan(String other1Comment) {
        regOther1Comment(CK_GT, fRES(other1Comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_LessThan(String other1Comment) {
        regOther1Comment(CK_LT, fRES(other1Comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_GreaterEqual(String other1Comment) {
        regOther1Comment(CK_GE, fRES(other1Comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_LessEqual(String other1Comment) {
        regOther1Comment(CK_LE, fRES(other1Comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1CommentList The collection of other1Comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_InScope(Collection<String> other1CommentList) {
        doSetOther1Comment_InScope(other1CommentList);
    }

    protected void doSetOther1Comment_InScope(Collection<String> other1CommentList) {
        regINS(CK_INS, cTL(other1CommentList), xgetCValueOther1Comment(), "OTHER1_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1CommentList The collection of other1Comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_NotInScope(Collection<String> other1CommentList) {
        doSetOther1Comment_NotInScope(other1CommentList);
    }

    protected void doSetOther1Comment_NotInScope(Collection<String> other1CommentList) {
        regINS(CK_NINS, cTL(other1CommentList), xgetCValueOther1Comment(), "OTHER1_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setOther1Comment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param other1Comment The value of other1Comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOther1Comment_LikeSearch(String other1Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(other1Comment), xgetCValueOther1Comment(), "OTHER1_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOther1Comment_NotLikeSearch(String other1Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(other1Comment), xgetCValueOther1Comment(), "OTHER1_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     * @param other1Comment The value of other1Comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther1Comment_PrefixSearch(String other1Comment) {
        setOther1Comment_LikeSearch(other1Comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     */
    public void setOther1Comment_IsNull() { regOther1Comment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     */
    public void setOther1Comment_IsNullOrEmpty() { regOther1Comment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER1_COMMENT: {varchar(60)}
     */
    public void setOther1Comment_IsNotNull() { regOther1Comment(CK_ISNN, DOBJ); }

    protected void regOther1Comment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOther1Comment(), "OTHER1_COMMENT"); }
    protected abstract ConditionValue xgetCValueOther1Comment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_Equal(String other2Comment) {
        doSetOther2Comment_Equal(fRES(other2Comment));
    }

    protected void doSetOther2Comment_Equal(String other2Comment) {
        regOther2Comment(CK_EQ, other2Comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_NotEqual(String other2Comment) {
        doSetOther2Comment_NotEqual(fRES(other2Comment));
    }

    protected void doSetOther2Comment_NotEqual(String other2Comment) {
        regOther2Comment(CK_NES, other2Comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_GreaterThan(String other2Comment) {
        regOther2Comment(CK_GT, fRES(other2Comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_LessThan(String other2Comment) {
        regOther2Comment(CK_LT, fRES(other2Comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_GreaterEqual(String other2Comment) {
        regOther2Comment(CK_GE, fRES(other2Comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_LessEqual(String other2Comment) {
        regOther2Comment(CK_LE, fRES(other2Comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2CommentList The collection of other2Comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_InScope(Collection<String> other2CommentList) {
        doSetOther2Comment_InScope(other2CommentList);
    }

    protected void doSetOther2Comment_InScope(Collection<String> other2CommentList) {
        regINS(CK_INS, cTL(other2CommentList), xgetCValueOther2Comment(), "OTHER2_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2CommentList The collection of other2Comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_NotInScope(Collection<String> other2CommentList) {
        doSetOther2Comment_NotInScope(other2CommentList);
    }

    protected void doSetOther2Comment_NotInScope(Collection<String> other2CommentList) {
        regINS(CK_NINS, cTL(other2CommentList), xgetCValueOther2Comment(), "OTHER2_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setOther2Comment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param other2Comment The value of other2Comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOther2Comment_LikeSearch(String other2Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(other2Comment), xgetCValueOther2Comment(), "OTHER2_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOther2Comment_NotLikeSearch(String other2Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(other2Comment), xgetCValueOther2Comment(), "OTHER2_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     * @param other2Comment The value of other2Comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther2Comment_PrefixSearch(String other2Comment) {
        setOther2Comment_LikeSearch(other2Comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     */
    public void setOther2Comment_IsNull() { regOther2Comment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     */
    public void setOther2Comment_IsNullOrEmpty() { regOther2Comment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER2_COMMENT: {varchar(60)}
     */
    public void setOther2Comment_IsNotNull() { regOther2Comment(CK_ISNN, DOBJ); }

    protected void regOther2Comment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOther2Comment(), "OTHER2_COMMENT"); }
    protected abstract ConditionValue xgetCValueOther2Comment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_Equal(String other3Comment) {
        doSetOther3Comment_Equal(fRES(other3Comment));
    }

    protected void doSetOther3Comment_Equal(String other3Comment) {
        regOther3Comment(CK_EQ, other3Comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_NotEqual(String other3Comment) {
        doSetOther3Comment_NotEqual(fRES(other3Comment));
    }

    protected void doSetOther3Comment_NotEqual(String other3Comment) {
        regOther3Comment(CK_NES, other3Comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_GreaterThan(String other3Comment) {
        regOther3Comment(CK_GT, fRES(other3Comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_LessThan(String other3Comment) {
        regOther3Comment(CK_LT, fRES(other3Comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_GreaterEqual(String other3Comment) {
        regOther3Comment(CK_GE, fRES(other3Comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_LessEqual(String other3Comment) {
        regOther3Comment(CK_LE, fRES(other3Comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3CommentList The collection of other3Comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_InScope(Collection<String> other3CommentList) {
        doSetOther3Comment_InScope(other3CommentList);
    }

    protected void doSetOther3Comment_InScope(Collection<String> other3CommentList) {
        regINS(CK_INS, cTL(other3CommentList), xgetCValueOther3Comment(), "OTHER3_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3CommentList The collection of other3Comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_NotInScope(Collection<String> other3CommentList) {
        doSetOther3Comment_NotInScope(other3CommentList);
    }

    protected void doSetOther3Comment_NotInScope(Collection<String> other3CommentList) {
        regINS(CK_NINS, cTL(other3CommentList), xgetCValueOther3Comment(), "OTHER3_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setOther3Comment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param other3Comment The value of other3Comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOther3Comment_LikeSearch(String other3Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(other3Comment), xgetCValueOther3Comment(), "OTHER3_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOther3Comment_NotLikeSearch(String other3Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(other3Comment), xgetCValueOther3Comment(), "OTHER3_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     * @param other3Comment The value of other3Comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther3Comment_PrefixSearch(String other3Comment) {
        setOther3Comment_LikeSearch(other3Comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     */
    public void setOther3Comment_IsNull() { regOther3Comment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     */
    public void setOther3Comment_IsNullOrEmpty() { regOther3Comment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER3_COMMENT: {varchar(60)}
     */
    public void setOther3Comment_IsNotNull() { regOther3Comment(CK_ISNN, DOBJ); }

    protected void regOther3Comment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOther3Comment(), "OTHER3_COMMENT"); }
    protected abstract ConditionValue xgetCValueOther3Comment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_Equal(String other4Comment) {
        doSetOther4Comment_Equal(fRES(other4Comment));
    }

    protected void doSetOther4Comment_Equal(String other4Comment) {
        regOther4Comment(CK_EQ, other4Comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_NotEqual(String other4Comment) {
        doSetOther4Comment_NotEqual(fRES(other4Comment));
    }

    protected void doSetOther4Comment_NotEqual(String other4Comment) {
        regOther4Comment(CK_NES, other4Comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_GreaterThan(String other4Comment) {
        regOther4Comment(CK_GT, fRES(other4Comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_LessThan(String other4Comment) {
        regOther4Comment(CK_LT, fRES(other4Comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_GreaterEqual(String other4Comment) {
        regOther4Comment(CK_GE, fRES(other4Comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_LessEqual(String other4Comment) {
        regOther4Comment(CK_LE, fRES(other4Comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4CommentList The collection of other4Comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_InScope(Collection<String> other4CommentList) {
        doSetOther4Comment_InScope(other4CommentList);
    }

    protected void doSetOther4Comment_InScope(Collection<String> other4CommentList) {
        regINS(CK_INS, cTL(other4CommentList), xgetCValueOther4Comment(), "OTHER4_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4CommentList The collection of other4Comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_NotInScope(Collection<String> other4CommentList) {
        doSetOther4Comment_NotInScope(other4CommentList);
    }

    protected void doSetOther4Comment_NotInScope(Collection<String> other4CommentList) {
        regINS(CK_NINS, cTL(other4CommentList), xgetCValueOther4Comment(), "OTHER4_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setOther4Comment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param other4Comment The value of other4Comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOther4Comment_LikeSearch(String other4Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(other4Comment), xgetCValueOther4Comment(), "OTHER4_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOther4Comment_NotLikeSearch(String other4Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(other4Comment), xgetCValueOther4Comment(), "OTHER4_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     * @param other4Comment The value of other4Comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther4Comment_PrefixSearch(String other4Comment) {
        setOther4Comment_LikeSearch(other4Comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     */
    public void setOther4Comment_IsNull() { regOther4Comment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     */
    public void setOther4Comment_IsNullOrEmpty() { regOther4Comment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER4_COMMENT: {varchar(60)}
     */
    public void setOther4Comment_IsNotNull() { regOther4Comment(CK_ISNN, DOBJ); }

    protected void regOther4Comment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOther4Comment(), "OTHER4_COMMENT"); }
    protected abstract ConditionValue xgetCValueOther4Comment();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_Equal(String other5Comment) {
        doSetOther5Comment_Equal(fRES(other5Comment));
    }

    protected void doSetOther5Comment_Equal(String other5Comment) {
        regOther5Comment(CK_EQ, other5Comment);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_NotEqual(String other5Comment) {
        doSetOther5Comment_NotEqual(fRES(other5Comment));
    }

    protected void doSetOther5Comment_NotEqual(String other5Comment) {
        regOther5Comment(CK_NES, other5Comment);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_GreaterThan(String other5Comment) {
        regOther5Comment(CK_GT, fRES(other5Comment));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_LessThan(String other5Comment) {
        regOther5Comment(CK_LT, fRES(other5Comment));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_GreaterEqual(String other5Comment) {
        regOther5Comment(CK_GE, fRES(other5Comment));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_LessEqual(String other5Comment) {
        regOther5Comment(CK_LE, fRES(other5Comment));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5CommentList The collection of other5Comment as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_InScope(Collection<String> other5CommentList) {
        doSetOther5Comment_InScope(other5CommentList);
    }

    protected void doSetOther5Comment_InScope(Collection<String> other5CommentList) {
        regINS(CK_INS, cTL(other5CommentList), xgetCValueOther5Comment(), "OTHER5_COMMENT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5CommentList The collection of other5Comment as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_NotInScope(Collection<String> other5CommentList) {
        doSetOther5Comment_NotInScope(other5CommentList);
    }

    protected void doSetOther5Comment_NotInScope(Collection<String> other5CommentList) {
        regINS(CK_NINS, cTL(other5CommentList), xgetCValueOther5Comment(), "OTHER5_COMMENT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)} <br>
     * <pre>e.g. setOther5Comment_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param other5Comment The value of other5Comment as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOther5Comment_LikeSearch(String other5Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(other5Comment), xgetCValueOther5Comment(), "OTHER5_COMMENT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOther5Comment_NotLikeSearch(String other5Comment, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(other5Comment), xgetCValueOther5Comment(), "OTHER5_COMMENT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     * @param other5Comment The value of other5Comment as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOther5Comment_PrefixSearch(String other5Comment) {
        setOther5Comment_LikeSearch(other5Comment, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     */
    public void setOther5Comment_IsNull() { regOther5Comment(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     */
    public void setOther5Comment_IsNullOrEmpty() { regOther5Comment(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OTHER5_COMMENT: {varchar(60)}
     */
    public void setOther5Comment_IsNotNull() { regOther5Comment(CK_ISNN, DOBJ); }

    protected void regOther5Comment(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOther5Comment(), "OTHER5_COMMENT"); }
    protected abstract ConditionValue xgetCValueOther5Comment();

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
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCenterClassDtlSubCB.class);
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
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCenterClassDtlSubCB.class);
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
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCenterClassDtlSubCB.class);
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
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCenterClassDtlSubCB.class);
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
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCenterClassDtlSubCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCenterClassDtlSubCB&gt;() {
     *     public void query(MCenterClassDtlSubCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCenterClassDtlSubCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCenterClassDtlSubCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlSubCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCenterClassDtlSubCQ sq);

    protected MCenterClassDtlSubCB xcreateScalarConditionCB() {
        MCenterClassDtlSubCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCenterClassDtlSubCB xcreateScalarConditionPartitionByCB() {
        MCenterClassDtlSubCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCenterClassDtlSubCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlSubCB cb = new MCenterClassDtlSubCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CENTER_CLASS_DTL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCenterClassDtlSubCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCenterClassDtlSubCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCenterClassDtlSubCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterClassDtlSubCB cb = new MCenterClassDtlSubCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CENTER_CLASS_DTL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCenterClassDtlSubCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCenterClassDtlSubCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterClassDtlSubCB cb = new MCenterClassDtlSubCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCenterClassDtlSubCQ sq);

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
    protected MCenterClassDtlSubCB newMyCB() {
        return new MCenterClassDtlSubCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCenterClassDtlSubCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
