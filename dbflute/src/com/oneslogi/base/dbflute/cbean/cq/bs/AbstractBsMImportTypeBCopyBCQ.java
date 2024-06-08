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
 * The abstract condition-query of M_IMPORT_TYPE_B_COPY_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMImportTypeBCopyBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMImportTypeBCopyBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_IMPORT_TYPE_B_COPY_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_Equal(Long importTypeBCopyBId) {
        doSetImportTypeBCopyBId_Equal(importTypeBCopyBId);
    }

    protected void doSetImportTypeBCopyBId_Equal(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_EQ, importTypeBCopyBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_NotEqual(Long importTypeBCopyBId) {
        doSetImportTypeBCopyBId_NotEqual(importTypeBCopyBId);
    }

    protected void doSetImportTypeBCopyBId_NotEqual(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_NES, importTypeBCopyBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_GreaterThan(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_GT, importTypeBCopyBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_LessThan(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_LT, importTypeBCopyBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_GreaterEqual(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_GE, importTypeBCopyBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBId The value of importTypeBCopyBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_LessEqual(Long importTypeBCopyBId) {
        regImportTypeBCopyBId(CK_LE, importTypeBCopyBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of importTypeBCopyBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeBCopyBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeBCopyBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeBCopyBId(), "IMPORT_TYPE_B_COPY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBIdList The collection of importTypeBCopyBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_InScope(Collection<Long> importTypeBCopyBIdList) {
        doSetImportTypeBCopyBId_InScope(importTypeBCopyBIdList);
    }

    protected void doSetImportTypeBCopyBId_InScope(Collection<Long> importTypeBCopyBIdList) {
        regINS(CK_INS, cTL(importTypeBCopyBIdList), xgetCValueImportTypeBCopyBId(), "IMPORT_TYPE_B_COPY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param importTypeBCopyBIdList The collection of importTypeBCopyBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBCopyBId_NotInScope(Collection<Long> importTypeBCopyBIdList) {
        doSetImportTypeBCopyBId_NotInScope(importTypeBCopyBIdList);
    }

    protected void doSetImportTypeBCopyBId_NotInScope(Collection<Long> importTypeBCopyBIdList) {
        regINS(CK_NINS, cTL(importTypeBCopyBIdList), xgetCValueImportTypeBCopyBId(), "IMPORT_TYPE_B_COPY_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeBCopyBId_IsNull() { regImportTypeBCopyBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_COPY_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setImportTypeBCopyBId_IsNotNull() { regImportTypeBCopyBId(CK_ISNN, DOBJ); }

    protected void regImportTypeBCopyBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeBCopyBId(), "IMPORT_TYPE_B_COPY_B_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeBCopyBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_Equal(Long importTypeBId) {
        doSetImportTypeBId_Equal(importTypeBId);
    }

    protected void doSetImportTypeBId_Equal(Long importTypeBId) {
        regImportTypeBId(CK_EQ, importTypeBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_NotEqual(Long importTypeBId) {
        doSetImportTypeBId_NotEqual(importTypeBId);
    }

    protected void doSetImportTypeBId_NotEqual(Long importTypeBId) {
        regImportTypeBId(CK_NES, importTypeBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_GreaterThan(Long importTypeBId) {
        regImportTypeBId(CK_GT, importTypeBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_LessThan(Long importTypeBId) {
        regImportTypeBId(CK_LT, importTypeBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_GreaterEqual(Long importTypeBId) {
        regImportTypeBId(CK_GE, importTypeBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBId The value of importTypeBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setImportTypeBId_LessEqual(Long importTypeBId) {
        regImportTypeBId(CK_LE, importTypeBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param minNumber The min number of importTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of importTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setImportTypeBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBIdList The collection of importTypeBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBId_InScope(Collection<Long> importTypeBIdList) {
        doSetImportTypeBId_InScope(importTypeBIdList);
    }

    protected void doSetImportTypeBId_InScope(Collection<Long> importTypeBIdList) {
        regINS(CK_INS, cTL(importTypeBIdList), xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     * @param importTypeBIdList The collection of importTypeBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportTypeBId_NotInScope(Collection<Long> importTypeBIdList) {
        doSetImportTypeBId_NotInScope(importTypeBIdList);
    }

    protected void doSetImportTypeBId_NotInScope(Collection<Long> importTypeBIdList) {
        regINS(CK_NINS, cTL(importTypeBIdList), xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B where ...)} <br />
     * M_IMPORT_TYPE_B by my IMPORT_TYPE_B_ID, named 'MImportTypeB'.
     * @param subCBLambda The callback for sub-query of MImportTypeB for 'in-scope'. (NotNull)
     */
    public void inScopeMImportTypeB(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeBId_InScopeRelation_MImportTypeB(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeB", false);
    }
    public abstract String keepImportTypeBId_InScopeRelation_MImportTypeB(MImportTypeBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select IMPORT_TYPE_B_ID from M_IMPORT_TYPE_B where ...)} <br />
     * M_IMPORT_TYPE_B by my IMPORT_TYPE_B_ID, named 'MImportTypeB'.
     * @param subCBLambda The callback for sub-query of MImportTypeB for 'not in-scope'. (NotNull)
     */
    public void notInScopeMImportTypeB(SubQuery<MImportTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCB cb = new MImportTypeBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepImportTypeBId_NotInScopeRelation_MImportTypeB(cb.query());
        registerInScopeRelation(cb.query(), "IMPORT_TYPE_B_ID", "IMPORT_TYPE_B_ID", pp, "mImportTypeB", true);
    }
    public abstract String keepImportTypeBId_NotInScopeRelation_MImportTypeB(MImportTypeBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     */
    public void setImportTypeBId_IsNull() { regImportTypeBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * IMPORT_TYPE_B_ID: {IX, bigint(19), FK to M_IMPORT_TYPE_B}
     */
    public void setImportTypeBId_IsNotNull() { regImportTypeBId(CK_ISNN, DOBJ); }

    protected void regImportTypeBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportTypeBId(), "IMPORT_TYPE_B_ID"); }
    protected abstract ConditionValue xgetCValueImportTypeBId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_Equal(String copyBColumnNm) {
        doSetCopyBColumnNm_Equal(fRES(copyBColumnNm));
    }

    protected void doSetCopyBColumnNm_Equal(String copyBColumnNm) {
        regCopyBColumnNm(CK_EQ, copyBColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_NotEqual(String copyBColumnNm) {
        doSetCopyBColumnNm_NotEqual(fRES(copyBColumnNm));
    }

    protected void doSetCopyBColumnNm_NotEqual(String copyBColumnNm) {
        regCopyBColumnNm(CK_NES, copyBColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_GreaterThan(String copyBColumnNm) {
        regCopyBColumnNm(CK_GT, fRES(copyBColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_LessThan(String copyBColumnNm) {
        regCopyBColumnNm(CK_LT, fRES(copyBColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_GreaterEqual(String copyBColumnNm) {
        regCopyBColumnNm(CK_GE, fRES(copyBColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_LessEqual(String copyBColumnNm) {
        regCopyBColumnNm(CK_LE, fRES(copyBColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNmList The collection of copyBColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_InScope(Collection<String> copyBColumnNmList) {
        doSetCopyBColumnNm_InScope(copyBColumnNmList);
    }

    protected void doSetCopyBColumnNm_InScope(Collection<String> copyBColumnNmList) {
        regINS(CK_INS, cTL(copyBColumnNmList), xgetCValueCopyBColumnNm(), "COPY_B_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNmList The collection of copyBColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_NotInScope(Collection<String> copyBColumnNmList) {
        doSetCopyBColumnNm_NotInScope(copyBColumnNmList);
    }

    protected void doSetCopyBColumnNm_NotInScope(Collection<String> copyBColumnNmList) {
        regINS(CK_NINS, cTL(copyBColumnNmList), xgetCValueCopyBColumnNm(), "COPY_B_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)} <br>
     * <pre>e.g. setCopyBColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param copyBColumnNm The value of copyBColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCopyBColumnNm_LikeSearch(String copyBColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(copyBColumnNm), xgetCValueCopyBColumnNm(), "COPY_B_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCopyBColumnNm_NotLikeSearch(String copyBColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(copyBColumnNm), xgetCValueCopyBColumnNm(), "COPY_B_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     * @param copyBColumnNm The value of copyBColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCopyBColumnNm_PrefixSearch(String copyBColumnNm) {
        setCopyBColumnNm_LikeSearch(copyBColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     */
    public void setCopyBColumnNm_IsNull() { regCopyBColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     */
    public void setCopyBColumnNm_IsNullOrEmpty() { regCopyBColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COPY_B_COLUMN_NM: {varchar(100)}
     */
    public void setCopyBColumnNm_IsNotNull() { regCopyBColumnNm(CK_ISNN, DOBJ); }

    protected void regCopyBColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCopyBColumnNm(), "COPY_B_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueCopyBColumnNm();

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
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MImportTypeBCopyBCB.class);
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
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MImportTypeBCopyBCB.class);
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
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MImportTypeBCopyBCB.class);
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
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MImportTypeBCopyBCB.class);
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
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MImportTypeBCopyBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MImportTypeBCopyBCB&gt;() {
     *     public void query(MImportTypeBCopyBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MImportTypeBCopyBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MImportTypeBCopyBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MImportTypeBCopyBCQ sq);

    protected MImportTypeBCopyBCB xcreateScalarConditionCB() {
        MImportTypeBCopyBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MImportTypeBCopyBCB xcreateScalarConditionPartitionByCB() {
        MImportTypeBCopyBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MImportTypeBCopyBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "IMPORT_TYPE_B_COPY_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MImportTypeBCopyBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MImportTypeBCopyBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MImportTypeBCopyBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "IMPORT_TYPE_B_COPY_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MImportTypeBCopyBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MImportTypeBCopyBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MImportTypeBCopyBCB cb = new MImportTypeBCopyBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MImportTypeBCopyBCQ sq);

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
    protected MImportTypeBCopyBCB newMyCB() {
        return new MImportTypeBCopyBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MImportTypeBCopyBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
