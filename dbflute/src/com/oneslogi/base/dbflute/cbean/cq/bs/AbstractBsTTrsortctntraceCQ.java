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
 * The abstract condition-query of T_TRSORTCTNTRACE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTrsortctntraceCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTrsortctntraceCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_TRSORTCTNTRACE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_Equal(Long sortPlaceCartonAssortLogManageId) {
        doSetSortPlaceCartonAssortLogManageId_Equal(sortPlaceCartonAssortLogManageId);
    }

    protected void doSetSortPlaceCartonAssortLogManageId_Equal(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_EQ, sortPlaceCartonAssortLogManageId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_NotEqual(Long sortPlaceCartonAssortLogManageId) {
        doSetSortPlaceCartonAssortLogManageId_NotEqual(sortPlaceCartonAssortLogManageId);
    }

    protected void doSetSortPlaceCartonAssortLogManageId_NotEqual(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_NES, sortPlaceCartonAssortLogManageId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_GreaterThan(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_GT, sortPlaceCartonAssortLogManageId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_LessThan(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_LT, sortPlaceCartonAssortLogManageId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_GreaterEqual(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_GE, sortPlaceCartonAssortLogManageId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageId The value of sortPlaceCartonAssortLogManageId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_LessEqual(Long sortPlaceCartonAssortLogManageId) {
        regSortPlaceCartonAssortLogManageId(CK_LE, sortPlaceCartonAssortLogManageId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of sortPlaceCartonAssortLogManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortPlaceCartonAssortLogManageId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortPlaceCartonAssortLogManageId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortPlaceCartonAssortLogManageId(), "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageIdList The collection of sortPlaceCartonAssortLogManageId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_InScope(Collection<Long> sortPlaceCartonAssortLogManageIdList) {
        doSetSortPlaceCartonAssortLogManageId_InScope(sortPlaceCartonAssortLogManageIdList);
    }

    protected void doSetSortPlaceCartonAssortLogManageId_InScope(Collection<Long> sortPlaceCartonAssortLogManageIdList) {
        regINS(CK_INS, cTL(sortPlaceCartonAssortLogManageIdList), xgetCValueSortPlaceCartonAssortLogManageId(), "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param sortPlaceCartonAssortLogManageIdList The collection of sortPlaceCartonAssortLogManageId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortPlaceCartonAssortLogManageId_NotInScope(Collection<Long> sortPlaceCartonAssortLogManageIdList) {
        doSetSortPlaceCartonAssortLogManageId_NotInScope(sortPlaceCartonAssortLogManageIdList);
    }

    protected void doSetSortPlaceCartonAssortLogManageId_NotInScope(Collection<Long> sortPlaceCartonAssortLogManageIdList) {
        regINS(CK_NINS, cTL(sortPlaceCartonAssortLogManageIdList), xgetCValueSortPlaceCartonAssortLogManageId(), "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortPlaceCartonAssortLogManageId_IsNull() { regSortPlaceCartonAssortLogManageId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setSortPlaceCartonAssortLogManageId_IsNotNull() { regSortPlaceCartonAssortLogManageId(CK_ISNN, DOBJ); }

    protected void regSortPlaceCartonAssortLogManageId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortPlaceCartonAssortLogManageId(), "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID"); }
    protected abstract ConditionValue xgetCValueSortPlaceCartonAssortLogManageId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_Equal(Long seqno) {
        doSetSeqno_Equal(seqno);
    }

    protected void doSetSeqno_Equal(Long seqno) {
        regSeqno(CK_EQ, seqno);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_NotEqual(Long seqno) {
        doSetSeqno_NotEqual(seqno);
    }

    protected void doSetSeqno_NotEqual(Long seqno) {
        regSeqno(CK_NES, seqno);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterThan(Long seqno) {
        regSeqno(CK_GT, seqno);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessThan(Long seqno) {
        regSeqno(CK_LT, seqno);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_GreaterEqual(Long seqno) {
        regSeqno(CK_GE, seqno);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqno The value of seqno as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSeqno_LessEqual(Long seqno) {
        regSeqno(CK_LE, seqno);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param minNumber The min number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of seqno. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSeqno_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSeqno(), "SEQNO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqnoList The collection of seqno as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_InScope(Collection<Long> seqnoList) {
        doSetSeqno_InScope(seqnoList);
    }

    protected void doSetSeqno_InScope(Collection<Long> seqnoList) {
        regINS(CK_INS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SEQNO: {NotNull, bigint(19)}
     * @param seqnoList The collection of seqno as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeqno_NotInScope(Collection<Long> seqnoList) {
        doSetSeqno_NotInScope(seqnoList);
    }

    protected void doSetSeqno_NotInScope(Collection<Long> seqnoList) {
        regINS(CK_NINS, cTL(seqnoList), xgetCValueSeqno(), "SEQNO");
    }

    protected void regSeqno(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeqno(), "SEQNO"); }
    protected abstract ConditionValue xgetCValueSeqno();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
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
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
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
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterThan(Long centerSymbolId) {
        regCenterSymbolId(CK_GT, centerSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessThan(Long centerSymbolId) {
        regCenterSymbolId(CK_LT, centerSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_GreaterEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_GE, centerSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param centerSymbolId The value of centerSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterSymbolId_LessEqual(Long centerSymbolId) {
        regCenterSymbolId(CK_LE, centerSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param minNumber The min number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterSymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
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
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     * @param centerSymbolIdList The collection of centerSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        doSetCenterSymbolId_NotInScope(centerSymbolIdList);
    }

    protected void doSetCenterSymbolId_NotInScope(Collection<Long> centerSymbolIdList) {
        regINS(CK_NINS, cTL(centerSymbolIdList), xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     */
    public void setCenterSymbolId_IsNull() { regCenterSymbolId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_SYMBOL_ID: {IX, bigint(19)}
     */
    public void setCenterSymbolId_IsNotNull() { regCenterSymbolId(CK_ISNN, DOBJ); }

    protected void regCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterSymbolId(), "CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueCenterSymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_Equal(Long fromCenterSymbolId) {
        doSetFromCenterSymbolId_Equal(fromCenterSymbolId);
    }

    protected void doSetFromCenterSymbolId_Equal(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_EQ, fromCenterSymbolId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_NotEqual(Long fromCenterSymbolId) {
        doSetFromCenterSymbolId_NotEqual(fromCenterSymbolId);
    }

    protected void doSetFromCenterSymbolId_NotEqual(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_NES, fromCenterSymbolId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_GreaterThan(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_GT, fromCenterSymbolId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_LessThan(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_LT, fromCenterSymbolId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_GreaterEqual(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_GE, fromCenterSymbolId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolId The value of fromCenterSymbolId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_LessEqual(Long fromCenterSymbolId) {
        regFromCenterSymbolId(CK_LE, fromCenterSymbolId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param minNumber The min number of fromCenterSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of fromCenterSymbolId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setFromCenterSymbolId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueFromCenterSymbolId(), "FROM_CENTER_SYMBOL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolIdList The collection of fromCenterSymbolId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_InScope(Collection<Long> fromCenterSymbolIdList) {
        doSetFromCenterSymbolId_InScope(fromCenterSymbolIdList);
    }

    protected void doSetFromCenterSymbolId_InScope(Collection<Long> fromCenterSymbolIdList) {
        regINS(CK_INS, cTL(fromCenterSymbolIdList), xgetCValueFromCenterSymbolId(), "FROM_CENTER_SYMBOL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * FROM_CENTER_SYMBOL_ID: {IX, NotNull, bigint(19)}
     * @param fromCenterSymbolIdList The collection of fromCenterSymbolId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFromCenterSymbolId_NotInScope(Collection<Long> fromCenterSymbolIdList) {
        doSetFromCenterSymbolId_NotInScope(fromCenterSymbolIdList);
    }

    protected void doSetFromCenterSymbolId_NotInScope(Collection<Long> fromCenterSymbolIdList) {
        regINS(CK_NINS, cTL(fromCenterSymbolIdList), xgetCValueFromCenterSymbolId(), "FROM_CENTER_SYMBOL_ID");
    }

    protected void regFromCenterSymbolId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFromCenterSymbolId(), "FROM_CENTER_SYMBOL_ID"); }
    protected abstract ConditionValue xgetCValueFromCenterSymbolId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_Equal(Long moveqtybowl) {
        doSetMoveqtybowl_Equal(moveqtybowl);
    }

    protected void doSetMoveqtybowl_Equal(Long moveqtybowl) {
        regMoveqtybowl(CK_EQ, moveqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_NotEqual(Long moveqtybowl) {
        doSetMoveqtybowl_NotEqual(moveqtybowl);
    }

    protected void doSetMoveqtybowl_NotEqual(Long moveqtybowl) {
        regMoveqtybowl(CK_NES, moveqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_GreaterThan(Long moveqtybowl) {
        regMoveqtybowl(CK_GT, moveqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_LessThan(Long moveqtybowl) {
        regMoveqtybowl(CK_LT, moveqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_GreaterEqual(Long moveqtybowl) {
        regMoveqtybowl(CK_GE, moveqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowl The value of moveqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMoveqtybowl_LessEqual(Long moveqtybowl) {
        regMoveqtybowl(CK_LE, moveqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param minNumber The min number of moveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of moveqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMoveqtybowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMoveqtybowl(), "MOVEQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowlList The collection of moveqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqtybowl_InScope(Collection<Long> moveqtybowlList) {
        doSetMoveqtybowl_InScope(moveqtybowlList);
    }

    protected void doSetMoveqtybowl_InScope(Collection<Long> moveqtybowlList) {
        regINS(CK_INS, cTL(moveqtybowlList), xgetCValueMoveqtybowl(), "MOVEQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MOVEQTYBOWL: {NotNull, bigint(19)}
     * @param moveqtybowlList The collection of moveqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMoveqtybowl_NotInScope(Collection<Long> moveqtybowlList) {
        doSetMoveqtybowl_NotInScope(moveqtybowlList);
    }

    protected void doSetMoveqtybowl_NotInScope(Collection<Long> moveqtybowlList) {
        regINS(CK_NINS, cTL(moveqtybowlList), xgetCValueMoveqtybowl(), "MOVEQTYBOWL");
    }

    protected void regMoveqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMoveqtybowl(), "MOVEQTYBOWL"); }
    protected abstract ConditionValue xgetCValueMoveqtybowl();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_Equal(Long sortedqtybowl) {
        doSetSortedqtybowl_Equal(sortedqtybowl);
    }

    protected void doSetSortedqtybowl_Equal(Long sortedqtybowl) {
        regSortedqtybowl(CK_EQ, sortedqtybowl);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_NotEqual(Long sortedqtybowl) {
        doSetSortedqtybowl_NotEqual(sortedqtybowl);
    }

    protected void doSetSortedqtybowl_NotEqual(Long sortedqtybowl) {
        regSortedqtybowl(CK_NES, sortedqtybowl);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_GreaterThan(Long sortedqtybowl) {
        regSortedqtybowl(CK_GT, sortedqtybowl);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_LessThan(Long sortedqtybowl) {
        regSortedqtybowl(CK_LT, sortedqtybowl);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_GreaterEqual(Long sortedqtybowl) {
        regSortedqtybowl(CK_GE, sortedqtybowl);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowl The value of sortedqtybowl as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSortedqtybowl_LessEqual(Long sortedqtybowl) {
        regSortedqtybowl(CK_LE, sortedqtybowl);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param minNumber The min number of sortedqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of sortedqtybowl. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSortedqtybowl_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSortedqtybowl(), "SORTEDQTYBOWL", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowlList The collection of sortedqtybowl as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqtybowl_InScope(Collection<Long> sortedqtybowlList) {
        doSetSortedqtybowl_InScope(sortedqtybowlList);
    }

    protected void doSetSortedqtybowl_InScope(Collection<Long> sortedqtybowlList) {
        regINS(CK_INS, cTL(sortedqtybowlList), xgetCValueSortedqtybowl(), "SORTEDQTYBOWL");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SORTEDQTYBOWL: {NotNull, bigint(19)}
     * @param sortedqtybowlList The collection of sortedqtybowl as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSortedqtybowl_NotInScope(Collection<Long> sortedqtybowlList) {
        doSetSortedqtybowl_NotInScope(sortedqtybowlList);
    }

    protected void doSetSortedqtybowl_NotInScope(Collection<Long> sortedqtybowlList) {
        regINS(CK_NINS, cTL(sortedqtybowlList), xgetCValueSortedqtybowl(), "SORTEDQTYBOWL");
    }

    protected void regSortedqtybowl(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSortedqtybowl(), "SORTEDQTYBOWL"); }
    protected abstract ConditionValue xgetCValueSortedqtybowl();

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
    public HpSLCFunction<TTrsortctntraceCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTrsortctntraceCB.class);
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
    public HpSLCFunction<TTrsortctntraceCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTrsortctntraceCB.class);
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
    public HpSLCFunction<TTrsortctntraceCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTrsortctntraceCB.class);
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
    public HpSLCFunction<TTrsortctntraceCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTrsortctntraceCB.class);
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
    public HpSLCFunction<TTrsortctntraceCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTrsortctntraceCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTrsortctntraceCB&gt;() {
     *     public void query(TTrsortctntraceCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTrsortctntraceCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTrsortctntraceCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsortctntraceCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTrsortctntraceCQ sq);

    protected TTrsortctntraceCB xcreateScalarConditionCB() {
        TTrsortctntraceCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTrsortctntraceCB xcreateScalarConditionPartitionByCB() {
        TTrsortctntraceCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTrsortctntraceCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsortctntraceCB cb = new TTrsortctntraceCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTrsortctntraceCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTrsortctntraceCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTrsortctntraceCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTrsortctntraceCB cb = new TTrsortctntraceCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SORT_PLACE_CARTON_ASSORT_LOG_MANAGE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTrsortctntraceCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTrsortctntraceCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTrsortctntraceCB cb = new TTrsortctntraceCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTrsortctntraceCQ sq);

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
    protected TTrsortctntraceCB newMyCB() {
        return new TTrsortctntraceCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTrsortctntraceCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
