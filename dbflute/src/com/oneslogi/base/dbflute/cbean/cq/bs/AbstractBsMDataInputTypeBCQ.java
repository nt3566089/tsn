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
 * The abstract condition-query of M_DATA_INPUT_TYPE_B.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMDataInputTypeBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMDataInputTypeBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_DATA_INPUT_TYPE_B";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_Equal(Long dataInputTypeBId) {
        doSetDataInputTypeBId_Equal(dataInputTypeBId);
    }

    protected void doSetDataInputTypeBId_Equal(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_EQ, dataInputTypeBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_NotEqual(Long dataInputTypeBId) {
        doSetDataInputTypeBId_NotEqual(dataInputTypeBId);
    }

    protected void doSetDataInputTypeBId_NotEqual(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_NES, dataInputTypeBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_GreaterThan(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_GT, dataInputTypeBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_LessThan(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_LT, dataInputTypeBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_GreaterEqual(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_GE, dataInputTypeBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBId The value of dataInputTypeBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_LessEqual(Long dataInputTypeBId) {
        regDataInputTypeBId(CK_LE, dataInputTypeBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of dataInputTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dataInputTypeBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataInputTypeBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDataInputTypeBId(), "DATA_INPUT_TYPE_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBIdList The collection of dataInputTypeBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_InScope(Collection<Long> dataInputTypeBIdList) {
        doSetDataInputTypeBId_InScope(dataInputTypeBIdList);
    }

    protected void doSetDataInputTypeBId_InScope(Collection<Long> dataInputTypeBIdList) {
        regINS(CK_INS, cTL(dataInputTypeBIdList), xgetCValueDataInputTypeBId(), "DATA_INPUT_TYPE_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeBIdList The collection of dataInputTypeBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeBId_NotInScope(Collection<Long> dataInputTypeBIdList) {
        doSetDataInputTypeBId_NotInScope(dataInputTypeBIdList);
    }

    protected void doSetDataInputTypeBId_NotInScope(Collection<Long> dataInputTypeBIdList) {
        regINS(CK_NINS, cTL(dataInputTypeBIdList), xgetCValueDataInputTypeBId(), "DATA_INPUT_TYPE_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDataInputTypeBId_IsNull() { regDataInputTypeBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_B_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDataInputTypeBId_IsNotNull() { regDataInputTypeBId(CK_ISNN, DOBJ); }

    protected void regDataInputTypeBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataInputTypeBId(), "DATA_INPUT_TYPE_B_ID"); }
    protected abstract ConditionValue xgetCValueDataInputTypeBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_Equal(Long dataInputTypeId) {
        doSetDataInputTypeId_Equal(dataInputTypeId);
    }

    protected void doSetDataInputTypeId_Equal(Long dataInputTypeId) {
        regDataInputTypeId(CK_EQ, dataInputTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_NotEqual(Long dataInputTypeId) {
        doSetDataInputTypeId_NotEqual(dataInputTypeId);
    }

    protected void doSetDataInputTypeId_NotEqual(Long dataInputTypeId) {
        regDataInputTypeId(CK_NES, dataInputTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_GreaterThan(Long dataInputTypeId) {
        regDataInputTypeId(CK_GT, dataInputTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_LessThan(Long dataInputTypeId) {
        regDataInputTypeId(CK_LT, dataInputTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_GreaterEqual(Long dataInputTypeId) {
        regDataInputTypeId(CK_GE, dataInputTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeId The value of dataInputTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_LessEqual(Long dataInputTypeId) {
        regDataInputTypeId(CK_LE, dataInputTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param minNumber The min number of dataInputTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dataInputTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataInputTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeIdList The collection of dataInputTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeId_InScope(Collection<Long> dataInputTypeIdList) {
        doSetDataInputTypeId_InScope(dataInputTypeIdList);
    }

    protected void doSetDataInputTypeId_InScope(Collection<Long> dataInputTypeIdList) {
        regINS(CK_INS, cTL(dataInputTypeIdList), xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_ID: {IX, NotNull, bigint(19), FK to M_DATA_INPUT_TYPE}
     * @param dataInputTypeIdList The collection of dataInputTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeId_NotInScope(Collection<Long> dataInputTypeIdList) {
        doSetDataInputTypeId_NotInScope(dataInputTypeIdList);
    }

    protected void doSetDataInputTypeId_NotInScope(Collection<Long> dataInputTypeIdList) {
        regINS(CK_NINS, cTL(dataInputTypeIdList), xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DATA_INPUT_TYPE_ID from M_DATA_INPUT_TYPE where ...)} <br />
     * M_DATA_INPUT_TYPE by my DATA_INPUT_TYPE_ID, named 'MDataInputType'.
     * @param subCBLambda The callback for sub-query of MDataInputType for 'in-scope'. (NotNull)
     */
    public void inScopeMDataInputType(SubQuery<MDataInputTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeCB cb = new MDataInputTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDataInputTypeId_InScopeRelation_MDataInputType(cb.query());
        registerInScopeRelation(cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", pp, "mDataInputType", false);
    }
    public abstract String keepDataInputTypeId_InScopeRelation_MDataInputType(MDataInputTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DATA_INPUT_TYPE_ID from M_DATA_INPUT_TYPE where ...)} <br />
     * M_DATA_INPUT_TYPE by my DATA_INPUT_TYPE_ID, named 'MDataInputType'.
     * @param subCBLambda The callback for sub-query of MDataInputType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMDataInputType(SubQuery<MDataInputTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeCB cb = new MDataInputTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDataInputTypeId_NotInScopeRelation_MDataInputType(cb.query());
        registerInScopeRelation(cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", pp, "mDataInputType", true);
    }
    public abstract String keepDataInputTypeId_NotInScopeRelation_MDataInputType(MDataInputTypeCQ sq);

    protected void regDataInputTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueDataInputTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_Equal(Long colNo) {
        doSetColNo_Equal(colNo);
    }

    protected void doSetColNo_Equal(Long colNo) {
        regColNo(CK_EQ, colNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_NotEqual(Long colNo) {
        doSetColNo_NotEqual(colNo);
    }

    protected void doSetColNo_NotEqual(Long colNo) {
        regColNo(CK_NES, colNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_GreaterThan(Long colNo) {
        regColNo(CK_GT, colNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_LessThan(Long colNo) {
        regColNo(CK_LT, colNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_GreaterEqual(Long colNo) {
        regColNo(CK_GE, colNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNo The value of colNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setColNo_LessEqual(Long colNo) {
        regColNo(CK_LE, colNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param minNumber The min number of colNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of colNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setColNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueColNo(), "COL_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNoList The collection of colNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNo_InScope(Collection<Long> colNoList) {
        doSetColNo_InScope(colNoList);
    }

    protected void doSetColNo_InScope(Collection<Long> colNoList) {
        regINS(CK_INS, cTL(colNoList), xgetCValueColNo(), "COL_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COL_NO: {bigint(19)}
     * @param colNoList The collection of colNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNo_NotInScope(Collection<Long> colNoList) {
        doSetColNo_NotInScope(colNoList);
    }

    protected void doSetColNo_NotInScope(Collection<Long> colNoList) {
        regINS(CK_NINS, cTL(colNoList), xgetCValueColNo(), "COL_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     */
    public void setColNo_IsNull() { regColNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_NO: {bigint(19)}
     */
    public void setColNo_IsNotNull() { regColNo(CK_ISNN, DOBJ); }

    protected void regColNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColNo(), "COL_NO"); }
    protected abstract ConditionValue xgetCValueColNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_Equal(String colNm) {
        doSetColNm_Equal(fRES(colNm));
    }

    protected void doSetColNm_Equal(String colNm) {
        regColNm(CK_EQ, colNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_NotEqual(String colNm) {
        doSetColNm_NotEqual(fRES(colNm));
    }

    protected void doSetColNm_NotEqual(String colNm) {
        regColNm(CK_NES, colNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_GreaterThan(String colNm) {
        regColNm(CK_GT, fRES(colNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_LessThan(String colNm) {
        regColNm(CK_LT, fRES(colNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_GreaterEqual(String colNm) {
        regColNm(CK_GE, fRES(colNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_LessEqual(String colNm) {
        regColNm(CK_LE, fRES(colNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNmList The collection of colNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_InScope(Collection<String> colNmList) {
        doSetColNm_InScope(colNmList);
    }

    protected void doSetColNm_InScope(Collection<String> colNmList) {
        regINS(CK_INS, cTL(colNmList), xgetCValueColNm(), "COL_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNmList The collection of colNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_NotInScope(Collection<String> colNmList) {
        doSetColNm_NotInScope(colNmList);
    }

    protected void doSetColNm_NotInScope(Collection<String> colNmList) {
        regINS(CK_NINS, cTL(colNmList), xgetCValueColNm(), "COL_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_NM: {varchar(60)} <br>
     * <pre>e.g. setColNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param colNm The value of colNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setColNm_LikeSearch(String colNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(colNm), xgetCValueColNm(), "COL_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setColNm_NotLikeSearch(String colNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(colNm), xgetCValueColNm(), "COL_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COL_NM: {varchar(60)}
     * @param colNm The value of colNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setColNm_PrefixSearch(String colNm) {
        setColNm_LikeSearch(colNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     */
    public void setColNm_IsNull() { regColNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     */
    public void setColNm_IsNullOrEmpty() { regColNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COL_NM: {varchar(60)}
     */
    public void setColNm_IsNotNull() { regColNm(CK_ISNN, DOBJ); }

    protected void regColNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueColNm(), "COL_NM"); }
    protected abstract ConditionValue xgetCValueColNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_Equal(String uploadColumnNm) {
        doSetUploadColumnNm_Equal(fRES(uploadColumnNm));
    }

    protected void doSetUploadColumnNm_Equal(String uploadColumnNm) {
        regUploadColumnNm(CK_EQ, uploadColumnNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_NotEqual(String uploadColumnNm) {
        doSetUploadColumnNm_NotEqual(fRES(uploadColumnNm));
    }

    protected void doSetUploadColumnNm_NotEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_NES, uploadColumnNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_GreaterThan(String uploadColumnNm) {
        regUploadColumnNm(CK_GT, fRES(uploadColumnNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_LessThan(String uploadColumnNm) {
        regUploadColumnNm(CK_LT, fRES(uploadColumnNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_GreaterEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_GE, fRES(uploadColumnNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_LessEqual(String uploadColumnNm) {
        regUploadColumnNm(CK_LE, fRES(uploadColumnNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNmList The collection of uploadColumnNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_InScope(Collection<String> uploadColumnNmList) {
        doSetUploadColumnNm_InScope(uploadColumnNmList);
    }

    protected void doSetUploadColumnNm_InScope(Collection<String> uploadColumnNmList) {
        regINS(CK_INS, cTL(uploadColumnNmList), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNmList The collection of uploadColumnNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_NotInScope(Collection<String> uploadColumnNmList) {
        doSetUploadColumnNm_NotInScope(uploadColumnNmList);
    }

    protected void doSetUploadColumnNm_NotInScope(Collection<String> uploadColumnNmList) {
        regINS(CK_NINS, cTL(uploadColumnNmList), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)} <br>
     * <pre>e.g. setUploadColumnNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uploadColumnNm The value of uploadColumnNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUploadColumnNm_LikeSearch(String uploadColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uploadColumnNm), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUploadColumnNm_NotLikeSearch(String uploadColumnNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uploadColumnNm), xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     * @param uploadColumnNm The value of uploadColumnNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadColumnNm_PrefixSearch(String uploadColumnNm) {
        setUploadColumnNm_LikeSearch(uploadColumnNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNull() { regUploadColumnNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNullOrEmpty() { regUploadColumnNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UPLOAD_COLUMN_NM: {varchar(100)}
     */
    public void setUploadColumnNm_IsNotNull() { regUploadColumnNm(CK_ISNN, DOBJ); }

    protected void regUploadColumnNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUploadColumnNm(), "UPLOAD_COLUMN_NM"); }
    protected abstract ConditionValue xgetCValueUploadColumnNm();

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
    public HpSLCFunction<MDataInputTypeBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MDataInputTypeBCB.class);
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
    public HpSLCFunction<MDataInputTypeBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MDataInputTypeBCB.class);
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
    public HpSLCFunction<MDataInputTypeBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MDataInputTypeBCB.class);
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
    public HpSLCFunction<MDataInputTypeBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MDataInputTypeBCB.class);
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
    public HpSLCFunction<MDataInputTypeBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MDataInputTypeBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MDataInputTypeBCB&gt;() {
     *     public void query(MDataInputTypeBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MDataInputTypeBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MDataInputTypeBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MDataInputTypeBCQ sq);

    protected MDataInputTypeBCB xcreateScalarConditionCB() {
        MDataInputTypeBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MDataInputTypeBCB xcreateScalarConditionPartitionByCB() {
        MDataInputTypeBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MDataInputTypeBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DATA_INPUT_TYPE_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MDataInputTypeBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MDataInputTypeBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MDataInputTypeBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATA_INPUT_TYPE_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MDataInputTypeBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MDataInputTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MDataInputTypeBCQ sq);

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
    protected MDataInputTypeBCB newMyCB() {
        return new MDataInputTypeBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MDataInputTypeBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
