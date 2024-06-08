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
 * The abstract condition-query of T_PICKING_R.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPickingRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPickingRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_PICKING_R";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_Equal(Long pickingHId) {
        doSetPickingHId_Equal(pickingHId);
    }

    protected void doSetPickingHId_Equal(Long pickingHId) {
        regPickingHId(CK_EQ, pickingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_NotEqual(Long pickingHId) {
        doSetPickingHId_NotEqual(pickingHId);
    }

    protected void doSetPickingHId_NotEqual(Long pickingHId) {
        regPickingHId(CK_NES, pickingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterThan(Long pickingHId) {
        regPickingHId(CK_GT, pickingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessThan(Long pickingHId) {
        regPickingHId(CK_LT, pickingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_GreaterEqual(Long pickingHId) {
        regPickingHId(CK_GE, pickingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHId The value of pickingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPickingHId_LessEqual(Long pickingHId) {
        regPickingHId(CK_LE, pickingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param minNumber The min number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pickingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPickingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePickingHId(), "PICKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_InScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_InScope(pickingHIdList);
    }

    protected void doSetPickingHId_InScope(Collection<Long> pickingHIdList) {
        regINS(CK_INS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     * @param pickingHIdList The collection of pickingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        doSetPickingHId_NotInScope(pickingHIdList);
    }

    protected void doSetPickingHId_NotInScope(Collection<Long> pickingHIdList) {
        regINS(CK_NINS, cTL(pickingHIdList), xgetCValuePickingHId(), "PICKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_InScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", false);
    }
    public abstract String keepPickingHId_InScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PICKING_H_ID from T_PICKING_H where ...)} <br />
     * T_PICKING_H by my PICKING_H_ID, named 'TPickingH'.
     * @param subCBLambda The callback for sub-query of TPickingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPickingH(SubQuery<TPickingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingHCB cb = new TPickingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPickingHId_NotInScopeRelation_TPickingH(cb.query());
        registerInScopeRelation(cb.query(), "PICKING_H_ID", "PICKING_H_ID", pp, "tPickingH", true);
    }
    public abstract String keepPickingHId_NotInScopeRelation_TPickingH(TPickingHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     */
    public void setPickingHId_IsNull() { regPickingHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_H_ID: {PK, ID, NotNull, bigint identity(19), FK to T_PICKING_H}
     */
    public void setPickingHId_IsNotNull() { regPickingHId(CK_ISNN, DOBJ); }

    protected void regPickingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingHId(), "PICKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePickingHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlg The value of oplOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_Equal(String oplOutFlg) {
        doSetOplOutFlg_Equal(fRES(oplOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetOplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setOplOutFlg_Equal_$0() {
        setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setOplOutFlg_Equal_$1() {
        setOplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetOplOutFlg_Equal(String oplOutFlg) {
        regOplOutFlg(CK_EQ, oplOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlg The value of oplOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotEqual(String oplOutFlg) {
        doSetOplOutFlg_NotEqual(fRES(oplOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetOplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setOplOutFlg_NotEqual_$0() {
        setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setOplOutFlg_NotEqual_$1() {
        setOplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetOplOutFlg_NotEqual(String oplOutFlg) {
        regOplOutFlg(CK_NES, oplOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlgList The collection of oplOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_InScope(Collection<String> oplOutFlgList) {
        doSetOplOutFlg_InScope(oplOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetOplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOplOutFlg_InScope(Collection<String> oplOutFlgList) {
        regINS(CK_INS, cTL(oplOutFlgList), xgetCValueOplOutFlg(), "OPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param oplOutFlgList The collection of oplOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotInScope(Collection<String> oplOutFlgList) {
        doSetOplOutFlg_NotInScope(oplOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetOplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOplOutFlg_NotInScope(Collection<String> oplOutFlgList) {
        regINS(CK_NINS, cTL(oplOutFlgList), xgetCValueOplOutFlg(), "OPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setOplOutFlg_IsNull() { regOplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setOplOutFlg_IsNotNull() { regOplOutFlg(CK_ISNN, DOBJ); }

    protected void regOplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOplOutFlg(), "OPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueOplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlg The value of tplOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_Equal(String tplOutFlg) {
        doSetTplOutFlg_Equal(fRES(tplOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTplOutFlg_Equal_$0() {
        setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTplOutFlg_Equal_$1() {
        setTplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTplOutFlg_Equal(String tplOutFlg) {
        regTplOutFlg(CK_EQ, tplOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlg The value of tplOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotEqual(String tplOutFlg) {
        doSetTplOutFlg_NotEqual(fRES(tplOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTplOutFlg_NotEqual_$0() {
        setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTplOutFlg_NotEqual_$1() {
        setTplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTplOutFlg_NotEqual(String tplOutFlg) {
        regTplOutFlg(CK_NES, tplOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlgList The collection of tplOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_InScope(Collection<String> tplOutFlgList) {
        doSetTplOutFlg_InScope(tplOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTplOutFlg_InScope(Collection<String> tplOutFlgList) {
        regINS(CK_INS, cTL(tplOutFlgList), xgetCValueTplOutFlg(), "TPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param tplOutFlgList The collection of tplOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotInScope(Collection<String> tplOutFlgList) {
        doSetTplOutFlg_NotInScope(tplOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTplOutFlg_NotInScope(Collection<String> tplOutFlgList) {
        regINS(CK_NINS, cTL(tplOutFlgList), xgetCValueTplOutFlg(), "TPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTplOutFlg_IsNull() { regTplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTplOutFlg_IsNotNull() { regTplOutFlg(CK_ISNN, DOBJ); }

    protected void regTplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTplOutFlg(), "TPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlg The value of mltOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_Equal(String mltOutFlg) {
        doSetMltOutFlg_Equal(fRES(mltOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetMltOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setMltOutFlg_Equal_$0() {
        setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setMltOutFlg_Equal_$1() {
        setMltOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetMltOutFlg_Equal(String mltOutFlg) {
        regMltOutFlg(CK_EQ, mltOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlg The value of mltOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotEqual(String mltOutFlg) {
        doSetMltOutFlg_NotEqual(fRES(mltOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetMltOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setMltOutFlg_NotEqual_$0() {
        setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setMltOutFlg_NotEqual_$1() {
        setMltOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetMltOutFlg_NotEqual(String mltOutFlg) {
        regMltOutFlg(CK_NES, mltOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlgList The collection of mltOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_InScope(Collection<String> mltOutFlgList) {
        doSetMltOutFlg_InScope(mltOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetMltOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetMltOutFlg_InScope(Collection<String> mltOutFlgList) {
        regINS(CK_INS, cTL(mltOutFlgList), xgetCValueMltOutFlg(), "MLT_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param mltOutFlgList The collection of mltOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotInScope(Collection<String> mltOutFlgList) {
        doSetMltOutFlg_NotInScope(mltOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMltOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetMltOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetMltOutFlg_NotInScope(Collection<String> mltOutFlgList) {
        regINS(CK_NINS, cTL(mltOutFlgList), xgetCValueMltOutFlg(), "MLT_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setMltOutFlg_IsNull() { regMltOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MLT_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setMltOutFlg_IsNotNull() { regMltOutFlg(CK_ISNN, DOBJ); }

    protected void regMltOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMltOutFlg(), "MLT_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueMltOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlg The value of splOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_Equal(String splOutFlg) {
        doSetSplOutFlg_Equal(fRES(splOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSplOutFlg_Equal_$0() {
        setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSplOutFlg_Equal_$1() {
        setSplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSplOutFlg_Equal(String splOutFlg) {
        regSplOutFlg(CK_EQ, splOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlg The value of splOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotEqual(String splOutFlg) {
        doSetSplOutFlg_NotEqual(fRES(splOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSplOutFlg_NotEqual_$0() {
        setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSplOutFlg_NotEqual_$1() {
        setSplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSplOutFlg_NotEqual(String splOutFlg) {
        regSplOutFlg(CK_NES, splOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlgList The collection of splOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_InScope(Collection<String> splOutFlgList) {
        doSetSplOutFlg_InScope(splOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSplOutFlg_InScope(Collection<String> splOutFlgList) {
        regINS(CK_INS, cTL(splOutFlgList), xgetCValueSplOutFlg(), "SPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param splOutFlgList The collection of splOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotInScope(Collection<String> splOutFlgList) {
        doSetSplOutFlg_NotInScope(splOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSplOutFlg_NotInScope(Collection<String> splOutFlgList) {
        regINS(CK_NINS, cTL(splOutFlgList), xgetCValueSplOutFlg(), "SPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSplOutFlg_IsNull() { regSplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSplOutFlg_IsNotNull() { regSplOutFlg(CK_ISNN, DOBJ); }

    protected void regSplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplOutFlg(), "SPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSplOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlg The value of pl1OutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_Equal(String pl1OutFlg) {
        doSetPl1OutFlg_Equal(fRES(pl1OutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl1OutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl1OutFlg_Equal_$0() {
        setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl1OutFlg_Equal_$1() {
        setPl1OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl1OutFlg_Equal(String pl1OutFlg) {
        regPl1OutFlg(CK_EQ, pl1OutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlg The value of pl1OutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotEqual(String pl1OutFlg) {
        doSetPl1OutFlg_NotEqual(fRES(pl1OutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl1OutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl1OutFlg_NotEqual_$0() {
        setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl1OutFlg_NotEqual_$1() {
        setPl1OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl1OutFlg_NotEqual(String pl1OutFlg) {
        regPl1OutFlg(CK_NES, pl1OutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlgList The collection of pl1OutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_InScope(Collection<String> pl1OutFlgList) {
        doSetPl1OutFlg_InScope(pl1OutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl1OutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPl1OutFlg_InScope(Collection<String> pl1OutFlgList) {
        regINS(CK_INS, cTL(pl1OutFlgList), xgetCValuePl1OutFlg(), "PL1_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl1OutFlgList The collection of pl1OutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotInScope(Collection<String> pl1OutFlgList) {
        doSetPl1OutFlg_NotInScope(pl1OutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl1OutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPl1OutFlg_NotInScope(Collection<String> pl1OutFlgList) {
        regINS(CK_NINS, cTL(pl1OutFlgList), xgetCValuePl1OutFlg(), "PL1_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl1OutFlg_IsNull() { regPl1OutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl1OutFlg_IsNotNull() { regPl1OutFlg(CK_ISNN, DOBJ); }

    protected void regPl1OutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutFlg(), "PL1_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePl1OutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_Equal(Long pl1OutUserId) {
        doSetPl1OutUserId_Equal(pl1OutUserId);
    }

    protected void doSetPl1OutUserId_Equal(Long pl1OutUserId) {
        regPl1OutUserId(CK_EQ, pl1OutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_NotEqual(Long pl1OutUserId) {
        doSetPl1OutUserId_NotEqual(pl1OutUserId);
    }

    protected void doSetPl1OutUserId_NotEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_NES, pl1OutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_GreaterThan(Long pl1OutUserId) {
        regPl1OutUserId(CK_GT, pl1OutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_LessThan(Long pl1OutUserId) {
        regPl1OutUserId(CK_LT, pl1OutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_GreaterEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_GE, pl1OutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserId The value of pl1OutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutUserId_LessEqual(Long pl1OutUserId) {
        regPl1OutUserId(CK_LE, pl1OutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of pl1OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pl1OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPl1OutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserIdList The collection of pl1OutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutUserId_InScope(Collection<Long> pl1OutUserIdList) {
        doSetPl1OutUserId_InScope(pl1OutUserIdList);
    }

    protected void doSetPl1OutUserId_InScope(Collection<Long> pl1OutUserIdList) {
        regINS(CK_INS, cTL(pl1OutUserIdList), xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl1OutUserIdList The collection of pl1OutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl1OutUserId_NotInScope(Collection<Long> pl1OutUserIdList) {
        doSetPl1OutUserId_NotInScope(pl1OutUserIdList);
    }

    protected void doSetPl1OutUserId_NotInScope(Collection<Long> pl1OutUserIdList) {
        regINS(CK_NINS, cTL(pl1OutUserIdList), xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PL1_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl1OutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPl1OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL1_OUT_USER_ID", "USER_ID", pp, "bUserByPl1OutUserId", false);
    }
    public abstract String keepPl1OutUserId_InScopeRelation_BUserByPl1OutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PL1_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl1OutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPl1OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL1_OUT_USER_ID", "USER_ID", pp, "bUserByPl1OutUserId", true);
    }
    public abstract String keepPl1OutUserId_NotInScopeRelation_BUserByPl1OutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPl1OutUserId_IsNull() { regPl1OutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPl1OutUserId_IsNotNull() { regPl1OutUserId(CK_ISNN, DOBJ); }

    protected void regPl1OutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutUserId(), "PL1_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePl1OutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @param pl1OutDt The value of pl1OutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_Equal(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_EQ,  pl1OutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @param pl1OutDt The value of pl1OutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_GreaterThan(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_GT,  pl1OutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @param pl1OutDt The value of pl1OutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_LessThan(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_LT,  pl1OutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @param pl1OutDt The value of pl1OutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_GreaterEqual(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_GE,  pl1OutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * @param pl1OutDt The value of pl1OutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl1OutDt_LessEqual(java.sql.Timestamp pl1OutDt) {
        regPl1OutDt(CK_LE, pl1OutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setPl1OutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPl1OutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePl1OutDt(), "PL1_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pl1OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPl1OutDt_DateFromTo(Date fromDate, Date toDate) {
        setPl1OutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     */
    public void setPl1OutDt_IsNull() { regPl1OutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL1_OUT_DT: {datetime2(26, 6)}
     */
    public void setPl1OutDt_IsNotNull() { regPl1OutDt(CK_ISNN, DOBJ); }

    protected void regPl1OutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl1OutDt(), "PL1_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePl1OutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlg The value of plOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_Equal(String plOutFlg) {
        doSetPlOutFlg_Equal(fRES(plOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPlOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPlOutFlg_Equal_$0() {
        setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPlOutFlg_Equal_$1() {
        setPlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPlOutFlg_Equal(String plOutFlg) {
        regPlOutFlg(CK_EQ, plOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlg The value of plOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotEqual(String plOutFlg) {
        doSetPlOutFlg_NotEqual(fRES(plOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPlOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPlOutFlg_NotEqual_$0() {
        setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPlOutFlg_NotEqual_$1() {
        setPlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPlOutFlg_NotEqual(String plOutFlg) {
        regPlOutFlg(CK_NES, plOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlgList The collection of plOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_InScope(Collection<String> plOutFlgList) {
        doSetPlOutFlg_InScope(plOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPlOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPlOutFlg_InScope(Collection<String> plOutFlgList) {
        regINS(CK_INS, cTL(plOutFlgList), xgetCValuePlOutFlg(), "PL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param plOutFlgList The collection of plOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotInScope(Collection<String> plOutFlgList) {
        doSetPlOutFlg_NotInScope(plOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPlOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPlOutFlg_NotInScope(Collection<String> plOutFlgList) {
        regINS(CK_NINS, cTL(plOutFlgList), xgetCValuePlOutFlg(), "PL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPlOutFlg_IsNull() { regPlOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPlOutFlg_IsNotNull() { regPlOutFlg(CK_ISNN, DOBJ); }

    protected void regPlOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlOutFlg(), "PL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePlOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlg The value of slOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_Equal(String slOutFlg) {
        doSetSlOutFlg_Equal(fRES(slOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlOutFlg_Equal_$0() {
        setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlOutFlg_Equal_$1() {
        setSlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlOutFlg_Equal(String slOutFlg) {
        regSlOutFlg(CK_EQ, slOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlg The value of slOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotEqual(String slOutFlg) {
        doSetSlOutFlg_NotEqual(fRES(slOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlOutFlg_NotEqual_$0() {
        setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlOutFlg_NotEqual_$1() {
        setSlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlOutFlg_NotEqual(String slOutFlg) {
        regSlOutFlg(CK_NES, slOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlgList The collection of slOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_InScope(Collection<String> slOutFlgList) {
        doSetSlOutFlg_InScope(slOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSlOutFlg_InScope(Collection<String> slOutFlgList) {
        regINS(CK_INS, cTL(slOutFlgList), xgetCValueSlOutFlg(), "SL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slOutFlgList The collection of slOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotInScope(Collection<String> slOutFlgList) {
        doSetSlOutFlg_NotInScope(slOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlOutFlg_NotInScope(Collection<String> slOutFlgList) {
        regINS(CK_NINS, cTL(slOutFlgList), xgetCValueSlOutFlg(), "SL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlOutFlg_IsNull() { regSlOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlOutFlg_IsNotNull() { regSlOutFlg(CK_ISNN, DOBJ); }

    protected void regSlOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlOutFlg(), "SL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSlOutFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlg The value of pl2OutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_Equal(String pl2OutFlg) {
        doSetPl2OutFlg_Equal(fRES(pl2OutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl2OutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl2OutFlg_Equal_$0() {
        setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl2OutFlg_Equal_$1() {
        setPl2OutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl2OutFlg_Equal(String pl2OutFlg) {
        regPl2OutFlg(CK_EQ, pl2OutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlg The value of pl2OutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotEqual(String pl2OutFlg) {
        doSetPl2OutFlg_NotEqual(fRES(pl2OutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPl2OutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPl2OutFlg_NotEqual_$0() {
        setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPl2OutFlg_NotEqual_$1() {
        setPl2OutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPl2OutFlg_NotEqual(String pl2OutFlg) {
        regPl2OutFlg(CK_NES, pl2OutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlgList The collection of pl2OutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_InScope(Collection<String> pl2OutFlgList) {
        doSetPl2OutFlg_InScope(pl2OutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl2OutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPl2OutFlg_InScope(Collection<String> pl2OutFlgList) {
        regINS(CK_INS, cTL(pl2OutFlgList), xgetCValuePl2OutFlg(), "PL2_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param pl2OutFlgList The collection of pl2OutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotInScope(Collection<String> pl2OutFlgList) {
        doSetPl2OutFlg_NotInScope(pl2OutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPl2OutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPl2OutFlg_NotInScope(Collection<String> pl2OutFlgList) {
        regINS(CK_NINS, cTL(pl2OutFlgList), xgetCValuePl2OutFlg(), "PL2_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl2OutFlg_IsNull() { regPl2OutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPl2OutFlg_IsNotNull() { regPl2OutFlg(CK_ISNN, DOBJ); }

    protected void regPl2OutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutFlg(), "PL2_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePl2OutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_Equal(Long pl2OutUserId) {
        doSetPl2OutUserId_Equal(pl2OutUserId);
    }

    protected void doSetPl2OutUserId_Equal(Long pl2OutUserId) {
        regPl2OutUserId(CK_EQ, pl2OutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_NotEqual(Long pl2OutUserId) {
        doSetPl2OutUserId_NotEqual(pl2OutUserId);
    }

    protected void doSetPl2OutUserId_NotEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_NES, pl2OutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_GreaterThan(Long pl2OutUserId) {
        regPl2OutUserId(CK_GT, pl2OutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_LessThan(Long pl2OutUserId) {
        regPl2OutUserId(CK_LT, pl2OutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_GreaterEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_GE, pl2OutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserId The value of pl2OutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutUserId_LessEqual(Long pl2OutUserId) {
        regPl2OutUserId(CK_LE, pl2OutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of pl2OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pl2OutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPl2OutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserIdList The collection of pl2OutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutUserId_InScope(Collection<Long> pl2OutUserIdList) {
        doSetPl2OutUserId_InScope(pl2OutUserIdList);
    }

    protected void doSetPl2OutUserId_InScope(Collection<Long> pl2OutUserIdList) {
        regINS(CK_INS, cTL(pl2OutUserIdList), xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param pl2OutUserIdList The collection of pl2OutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPl2OutUserId_NotInScope(Collection<Long> pl2OutUserIdList) {
        doSetPl2OutUserId_NotInScope(pl2OutUserIdList);
    }

    protected void doSetPl2OutUserId_NotInScope(Collection<Long> pl2OutUserIdList) {
        regINS(CK_NINS, cTL(pl2OutUserIdList), xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PL2_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl2OutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPl2OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL2_OUT_USER_ID", "USER_ID", pp, "bUserByPl2OutUserId", false);
    }
    public abstract String keepPl2OutUserId_InScopeRelation_BUserByPl2OutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PL2_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPl2OutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPl2OutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PL2_OUT_USER_ID", "USER_ID", pp, "bUserByPl2OutUserId", true);
    }
    public abstract String keepPl2OutUserId_NotInScopeRelation_BUserByPl2OutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPl2OutUserId_IsNull() { regPl2OutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPl2OutUserId_IsNotNull() { regPl2OutUserId(CK_ISNN, DOBJ); }

    protected void regPl2OutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutUserId(), "PL2_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePl2OutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @param pl2OutDt The value of pl2OutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_Equal(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_EQ,  pl2OutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @param pl2OutDt The value of pl2OutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_GreaterThan(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_GT,  pl2OutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @param pl2OutDt The value of pl2OutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_LessThan(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_LT,  pl2OutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @param pl2OutDt The value of pl2OutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_GreaterEqual(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_GE,  pl2OutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * @param pl2OutDt The value of pl2OutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPl2OutDt_LessEqual(java.sql.Timestamp pl2OutDt) {
        regPl2OutDt(CK_LE, pl2OutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setPl2OutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPl2OutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePl2OutDt(), "PL2_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of pl2OutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPl2OutDt_DateFromTo(Date fromDate, Date toDate) {
        setPl2OutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     */
    public void setPl2OutDt_IsNull() { regPl2OutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PL2_OUT_DT: {datetime2(26, 6)}
     */
    public void setPl2OutDt_IsNotNull() { regPl2OutDt(CK_ISNN, DOBJ); }

    protected void regPl2OutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePl2OutDt(), "PL2_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePl2OutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlg The value of caseOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_Equal(String caseOutFlg) {
        doSetCaseOutFlg_Equal(fRES(caseOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetCaseOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setCaseOutFlg_Equal_$0() {
        setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setCaseOutFlg_Equal_$1() {
        setCaseOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetCaseOutFlg_Equal(String caseOutFlg) {
        regCaseOutFlg(CK_EQ, caseOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlg The value of caseOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotEqual(String caseOutFlg) {
        doSetCaseOutFlg_NotEqual(fRES(caseOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetCaseOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setCaseOutFlg_NotEqual_$0() {
        setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setCaseOutFlg_NotEqual_$1() {
        setCaseOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetCaseOutFlg_NotEqual(String caseOutFlg) {
        regCaseOutFlg(CK_NES, caseOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlgList The collection of caseOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_InScope(Collection<String> caseOutFlgList) {
        doSetCaseOutFlg_InScope(caseOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetCaseOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetCaseOutFlg_InScope(Collection<String> caseOutFlgList) {
        regINS(CK_INS, cTL(caseOutFlgList), xgetCValueCaseOutFlg(), "CASE_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param caseOutFlgList The collection of caseOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotInScope(Collection<String> caseOutFlgList) {
        doSetCaseOutFlg_NotInScope(caseOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetCaseOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetCaseOutFlg_NotInScope(Collection<String> caseOutFlgList) {
        regINS(CK_NINS, cTL(caseOutFlgList), xgetCValueCaseOutFlg(), "CASE_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setCaseOutFlg_IsNull() { regCaseOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setCaseOutFlg_IsNotNull() { regCaseOutFlg(CK_ISNN, DOBJ); }

    protected void regCaseOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutFlg(), "CASE_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueCaseOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_Equal(Long caseOutUserId) {
        doSetCaseOutUserId_Equal(caseOutUserId);
    }

    protected void doSetCaseOutUserId_Equal(Long caseOutUserId) {
        regCaseOutUserId(CK_EQ, caseOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_NotEqual(Long caseOutUserId) {
        doSetCaseOutUserId_NotEqual(caseOutUserId);
    }

    protected void doSetCaseOutUserId_NotEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_NES, caseOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_GreaterThan(Long caseOutUserId) {
        regCaseOutUserId(CK_GT, caseOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_LessThan(Long caseOutUserId) {
        regCaseOutUserId(CK_LT, caseOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_GreaterEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_GE, caseOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserId The value of caseOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutUserId_LessEqual(Long caseOutUserId) {
        regCaseOutUserId(CK_LE, caseOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param minNumber The min number of caseOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of caseOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCaseOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserIdList The collection of caseOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutUserId_InScope(Collection<Long> caseOutUserIdList) {
        doSetCaseOutUserId_InScope(caseOutUserIdList);
    }

    protected void doSetCaseOutUserId_InScope(Collection<Long> caseOutUserIdList) {
        regINS(CK_INS, cTL(caseOutUserIdList), xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     * @param caseOutUserIdList The collection of caseOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCaseOutUserId_NotInScope(Collection<Long> caseOutUserIdList) {
        doSetCaseOutUserId_NotInScope(caseOutUserIdList);
    }

    protected void doSetCaseOutUserId_NotInScope(Collection<Long> caseOutUserIdList) {
        regINS(CK_NINS, cTL(caseOutUserIdList), xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CASE_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByCaseOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByCaseOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "CASE_OUT_USER_ID", "USER_ID", pp, "bUserByCaseOutUserId", false);
    }
    public abstract String keepCaseOutUserId_InScopeRelation_BUserByCaseOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CASE_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByCaseOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByCaseOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "CASE_OUT_USER_ID", "USER_ID", pp, "bUserByCaseOutUserId", true);
    }
    public abstract String keepCaseOutUserId_NotInScopeRelation_BUserByCaseOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     */
    public void setCaseOutUserId_IsNull() { regCaseOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_USER_ID: {bigint(19), FK to B_USER}
     */
    public void setCaseOutUserId_IsNotNull() { regCaseOutUserId(CK_ISNN, DOBJ); }

    protected void regCaseOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutUserId(), "CASE_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueCaseOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @param caseOutDt The value of caseOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_Equal(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_EQ,  caseOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @param caseOutDt The value of caseOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_GreaterThan(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_GT,  caseOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @param caseOutDt The value of caseOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_LessThan(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_LT,  caseOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @param caseOutDt The value of caseOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_GreaterEqual(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_GE,  caseOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * @param caseOutDt The value of caseOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCaseOutDt_LessEqual(java.sql.Timestamp caseOutDt) {
        regCaseOutDt(CK_LE, caseOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setCaseOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setCaseOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueCaseOutDt(), "CASE_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of caseOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setCaseOutDt_DateFromTo(Date fromDate, Date toDate) {
        setCaseOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     */
    public void setCaseOutDt_IsNull() { regCaseOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CASE_OUT_DT: {datetime2(26, 6)}
     */
    public void setCaseOutDt_IsNotNull() { regCaseOutDt(CK_ISNN, DOBJ); }

    protected void regCaseOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCaseOutDt(), "CASE_OUT_DT"); }
    protected abstract ConditionValue xgetCValueCaseOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlg The value of packingOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_Equal(String packingOutFlg) {
        doSetPackingOutFlg_Equal(fRES(packingOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPackingOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_Equal_$0() {
        setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_Equal_$1() {
        setPackingOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPackingOutFlg_Equal(String packingOutFlg) {
        regPackingOutFlg(CK_EQ, packingOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlg The value of packingOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotEqual(String packingOutFlg) {
        doSetPackingOutFlg_NotEqual(fRES(packingOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetPackingOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setPackingOutFlg_NotEqual_$0() {
        setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setPackingOutFlg_NotEqual_$1() {
        setPackingOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetPackingOutFlg_NotEqual(String packingOutFlg) {
        regPackingOutFlg(CK_NES, packingOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlgList The collection of packingOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_InScope(Collection<String> packingOutFlgList) {
        doSetPackingOutFlg_InScope(packingOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPackingOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetPackingOutFlg_InScope(Collection<String> packingOutFlgList) {
        regINS(CK_INS, cTL(packingOutFlgList), xgetCValuePackingOutFlg(), "PACKING_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param packingOutFlgList The collection of packingOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotInScope(Collection<String> packingOutFlgList) {
        doSetPackingOutFlg_NotInScope(packingOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetPackingOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetPackingOutFlg_NotInScope(Collection<String> packingOutFlgList) {
        regINS(CK_NINS, cTL(packingOutFlgList), xgetCValuePackingOutFlg(), "PACKING_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPackingOutFlg_IsNull() { regPackingOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setPackingOutFlg_IsNotNull() { regPackingOutFlg(CK_ISNN, DOBJ); }

    protected void regPackingOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutFlg(), "PACKING_OUT_FLG"); }
    protected abstract ConditionValue xgetCValuePackingOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_Equal(Long packingOutUserId) {
        doSetPackingOutUserId_Equal(packingOutUserId);
    }

    protected void doSetPackingOutUserId_Equal(Long packingOutUserId) {
        regPackingOutUserId(CK_EQ, packingOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_NotEqual(Long packingOutUserId) {
        doSetPackingOutUserId_NotEqual(packingOutUserId);
    }

    protected void doSetPackingOutUserId_NotEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_NES, packingOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_GreaterThan(Long packingOutUserId) {
        regPackingOutUserId(CK_GT, packingOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_LessThan(Long packingOutUserId) {
        regPackingOutUserId(CK_LT, packingOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_GreaterEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_GE, packingOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserId The value of packingOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutUserId_LessEqual(Long packingOutUserId) {
        regPackingOutUserId(CK_LE, packingOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of packingOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserIdList The collection of packingOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutUserId_InScope(Collection<Long> packingOutUserIdList) {
        doSetPackingOutUserId_InScope(packingOutUserIdList);
    }

    protected void doSetPackingOutUserId_InScope(Collection<Long> packingOutUserIdList) {
        regINS(CK_INS, cTL(packingOutUserIdList), xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param packingOutUserIdList The collection of packingOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingOutUserId_NotInScope(Collection<Long> packingOutUserIdList) {
        doSetPackingOutUserId_NotInScope(packingOutUserIdList);
    }

    protected void doSetPackingOutUserId_NotInScope(Collection<Long> packingOutUserIdList) {
        regINS(CK_NINS, cTL(packingOutUserIdList), xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPackingOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByPackingOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_OUT_USER_ID", "USER_ID", pp, "bUserByPackingOutUserId", false);
    }
    public abstract String keepPackingOutUserId_InScopeRelation_BUserByPackingOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByPackingOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByPackingOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_OUT_USER_ID", "USER_ID", pp, "bUserByPackingOutUserId", true);
    }
    public abstract String keepPackingOutUserId_NotInScopeRelation_BUserByPackingOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPackingOutUserId_IsNull() { regPackingOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setPackingOutUserId_IsNotNull() { regPackingOutUserId(CK_ISNN, DOBJ); }

    protected void regPackingOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutUserId(), "PACKING_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValuePackingOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @param packingOutDt The value of packingOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_Equal(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_EQ,  packingOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @param packingOutDt The value of packingOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_GreaterThan(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_GT,  packingOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @param packingOutDt The value of packingOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_LessThan(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_LT,  packingOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @param packingOutDt The value of packingOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_GreaterEqual(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_GE,  packingOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * @param packingOutDt The value of packingOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingOutDt_LessEqual(java.sql.Timestamp packingOutDt) {
        regPackingOutDt(CK_LE, packingOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setPackingOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setPackingOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValuePackingOutDt(), "PACKING_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of packingOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setPackingOutDt_DateFromTo(Date fromDate, Date toDate) {
        setPackingOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     */
    public void setPackingOutDt_IsNull() { regPackingOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_OUT_DT: {datetime2(26, 6)}
     */
    public void setPackingOutDt_IsNotNull() { regPackingOutDt(CK_ISNN, DOBJ); }

    protected void regPackingOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingOutDt(), "PACKING_OUT_DT"); }
    protected abstract ConditionValue xgetCValuePackingOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlg The value of slipOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_Equal(String slipOutFlg) {
        doSetSlipOutFlg_Equal(fRES(slipOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlipOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlipOutFlg_Equal_$0() {
        setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlipOutFlg_Equal_$1() {
        setSlipOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlipOutFlg_Equal(String slipOutFlg) {
        regSlipOutFlg(CK_EQ, slipOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlg The value of slipOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotEqual(String slipOutFlg) {
        doSetSlipOutFlg_NotEqual(fRES(slipOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetSlipOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setSlipOutFlg_NotEqual_$0() {
        setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setSlipOutFlg_NotEqual_$1() {
        setSlipOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetSlipOutFlg_NotEqual(String slipOutFlg) {
        regSlipOutFlg(CK_NES, slipOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlgList The collection of slipOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_InScope(Collection<String> slipOutFlgList) {
        doSetSlipOutFlg_InScope(slipOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlipOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetSlipOutFlg_InScope(Collection<String> slipOutFlgList) {
        regINS(CK_INS, cTL(slipOutFlgList), xgetCValueSlipOutFlg(), "SLIP_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param slipOutFlgList The collection of slipOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotInScope(Collection<String> slipOutFlgList) {
        doSetSlipOutFlg_NotInScope(slipOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetSlipOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetSlipOutFlg_NotInScope(Collection<String> slipOutFlgList) {
        regINS(CK_NINS, cTL(slipOutFlgList), xgetCValueSlipOutFlg(), "SLIP_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlipOutFlg_IsNull() { regSlipOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setSlipOutFlg_IsNotNull() { regSlipOutFlg(CK_ISNN, DOBJ); }

    protected void regSlipOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutFlg(), "SLIP_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueSlipOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_Equal(Long slipOutUserId) {
        doSetSlipOutUserId_Equal(slipOutUserId);
    }

    protected void doSetSlipOutUserId_Equal(Long slipOutUserId) {
        regSlipOutUserId(CK_EQ, slipOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_NotEqual(Long slipOutUserId) {
        doSetSlipOutUserId_NotEqual(slipOutUserId);
    }

    protected void doSetSlipOutUserId_NotEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_NES, slipOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_GreaterThan(Long slipOutUserId) {
        regSlipOutUserId(CK_GT, slipOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_LessThan(Long slipOutUserId) {
        regSlipOutUserId(CK_LT, slipOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_GreaterEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_GE, slipOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserId The value of slipOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutUserId_LessEqual(Long slipOutUserId) {
        regSlipOutUserId(CK_LE, slipOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of slipOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of slipOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSlipOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserIdList The collection of slipOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutUserId_InScope(Collection<Long> slipOutUserIdList) {
        doSetSlipOutUserId_InScope(slipOutUserIdList);
    }

    protected void doSetSlipOutUserId_InScope(Collection<Long> slipOutUserIdList) {
        regINS(CK_INS, cTL(slipOutUserIdList), xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param slipOutUserIdList The collection of slipOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipOutUserId_NotInScope(Collection<Long> slipOutUserIdList) {
        doSetSlipOutUserId_NotInScope(slipOutUserIdList);
    }

    protected void doSetSlipOutUserId_NotInScope(Collection<Long> slipOutUserIdList) {
        regINS(CK_NINS, cTL(slipOutUserIdList), xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SLIP_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserBySlipOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserBySlipOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SLIP_OUT_USER_ID", "USER_ID", pp, "bUserBySlipOutUserId", false);
    }
    public abstract String keepSlipOutUserId_InScopeRelation_BUserBySlipOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SLIP_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserBySlipOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserBySlipOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SLIP_OUT_USER_ID", "USER_ID", pp, "bUserBySlipOutUserId", true);
    }
    public abstract String keepSlipOutUserId_NotInScopeRelation_BUserBySlipOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setSlipOutUserId_IsNull() { regSlipOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setSlipOutUserId_IsNotNull() { regSlipOutUserId(CK_ISNN, DOBJ); }

    protected void regSlipOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutUserId(), "SLIP_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueSlipOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @param slipOutDt The value of slipOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_Equal(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_EQ,  slipOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @param slipOutDt The value of slipOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_GreaterThan(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_GT,  slipOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @param slipOutDt The value of slipOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_LessThan(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_LT,  slipOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @param slipOutDt The value of slipOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_GreaterEqual(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_GE,  slipOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * @param slipOutDt The value of slipOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSlipOutDt_LessEqual(java.sql.Timestamp slipOutDt) {
        regSlipOutDt(CK_LE, slipOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setSlipOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setSlipOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueSlipOutDt(), "SLIP_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of slipOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setSlipOutDt_DateFromTo(Date fromDate, Date toDate) {
        setSlipOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     */
    public void setSlipOutDt_IsNull() { regSlipOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_OUT_DT: {datetime2(26, 6)}
     */
    public void setSlipOutDt_IsNotNull() { regSlipOutDt(CK_ISNN, DOBJ); }

    protected void regSlipOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipOutDt(), "SLIP_OUT_DT"); }
    protected abstract ConditionValue xgetCValueSlipOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_Equal(fRES(invoiceCreateFlg));
    }

    /**
     * Equal(=). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_Equal_$0() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_Equal_$1() {
        setInvoiceCreateFlg_Equal_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_Equal(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_EQ, invoiceCreateFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlg The value of invoiceCreateFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        doSetInvoiceCreateFlg_NotEqual(fRES(invoiceCreateFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As InvoiceCreateFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg cdef) {
        doSetInvoiceCreateFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未出力
     */
    public void setInvoiceCreateFlg_NotEqual_$0() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出力済
     */
    public void setInvoiceCreateFlg_NotEqual_$1() {
        setInvoiceCreateFlg_NotEqual_AsInvoiceCreateFlg(CDef.InvoiceCreateFlg.$1);
    }

    protected void doSetInvoiceCreateFlg_NotEqual(String invoiceCreateFlg) {
        regInvoiceCreateFlg(CK_NES, invoiceCreateFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_InScope(invoiceCreateFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_InScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_InScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_INS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     * @param invoiceCreateFlgList The collection of invoiceCreateFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        doSetInvoiceCreateFlg_NotInScope(invoiceCreateFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As InvoiceCreateFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceCreateFlg_NotInScope_AsInvoiceCreateFlg(Collection<CDef.InvoiceCreateFlg> cdefList) {
        doSetInvoiceCreateFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetInvoiceCreateFlg_NotInScope(Collection<String> invoiceCreateFlgList) {
        regINS(CK_NINS, cTL(invoiceCreateFlgList), xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNull() { regInvoiceCreateFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_FLG: {char(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg}
     */
    public void setInvoiceCreateFlg_IsNotNull() { regInvoiceCreateFlg(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateFlg(), "INVOICE_CREATE_FLG"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_Equal(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_EQ,  invoiceCreateDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GT,  invoiceCreateDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessThan(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LT,  invoiceCreateDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_GreaterEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_GE,  invoiceCreateDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * @param invoiceCreateDt The value of invoiceCreateDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceCreateDt_LessEqual(java.sql.Timestamp invoiceCreateDt) {
        regInvoiceCreateDt(CK_LE, invoiceCreateDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * <pre>e.g. setInvoiceCreateDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInvoiceCreateDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of invoiceCreateDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInvoiceCreateDt_DateFromTo(Date fromDate, Date toDate) {
        setInvoiceCreateDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     */
    public void setInvoiceCreateDt_IsNull() { regInvoiceCreateDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_CREATE_DT: {datetime2(26, 6)}
     */
    public void setInvoiceCreateDt_IsNotNull() { regInvoiceCreateDt(CK_ISNN, DOBJ); }

    protected void regInvoiceCreateDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceCreateDt(), "INVOICE_CREATE_DT"); }
    protected abstract ConditionValue xgetCValueInvoiceCreateDt();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_Equal(Long invoiceIssueNum) {
        doSetInvoiceIssueNum_Equal(invoiceIssueNum);
    }

    protected void doSetInvoiceIssueNum_Equal(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_EQ, invoiceIssueNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_NotEqual(Long invoiceIssueNum) {
        doSetInvoiceIssueNum_NotEqual(invoiceIssueNum);
    }

    protected void doSetInvoiceIssueNum_NotEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_NES, invoiceIssueNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_GreaterThan(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_GT, invoiceIssueNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_LessThan(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_LT, invoiceIssueNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_GreaterEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_GE, invoiceIssueNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNum The value of invoiceIssueNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_LessEqual(Long invoiceIssueNum) {
        regInvoiceIssueNum(CK_LE, invoiceIssueNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param minNumber The min number of invoiceIssueNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of invoiceIssueNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInvoiceIssueNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNumList The collection of invoiceIssueNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_InScope(Collection<Long> invoiceIssueNumList) {
        doSetInvoiceIssueNum_InScope(invoiceIssueNumList);
    }

    protected void doSetInvoiceIssueNum_InScope(Collection<Long> invoiceIssueNumList) {
        regINS(CK_INS, cTL(invoiceIssueNumList), xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     * @param invoiceIssueNumList The collection of invoiceIssueNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceIssueNum_NotInScope(Collection<Long> invoiceIssueNumList) {
        doSetInvoiceIssueNum_NotInScope(invoiceIssueNumList);
    }

    protected void doSetInvoiceIssueNum_NotInScope(Collection<Long> invoiceIssueNumList) {
        regINS(CK_NINS, cTL(invoiceIssueNumList), xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     */
    public void setInvoiceIssueNum_IsNull() { regInvoiceIssueNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_ISSUE_NUM: {bigint(19)}
     */
    public void setInvoiceIssueNum_IsNotNull() { regInvoiceIssueNum(CK_ISNN, DOBJ); }

    protected void regInvoiceIssueNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceIssueNum(), "INVOICE_ISSUE_NUM"); }
    protected abstract ConditionValue xgetCValueInvoiceIssueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlg The value of shippingRecordOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_Equal(String shippingRecordOutFlg) {
        doSetShippingRecordOutFlg_Equal(fRES(shippingRecordOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetShippingRecordOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setShippingRecordOutFlg_Equal_$0() {
        setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setShippingRecordOutFlg_Equal_$1() {
        setShippingRecordOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetShippingRecordOutFlg_Equal(String shippingRecordOutFlg) {
        regShippingRecordOutFlg(CK_EQ, shippingRecordOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlg The value of shippingRecordOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotEqual(String shippingRecordOutFlg) {
        doSetShippingRecordOutFlg_NotEqual(fRES(shippingRecordOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetShippingRecordOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setShippingRecordOutFlg_NotEqual_$0() {
        setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setShippingRecordOutFlg_NotEqual_$1() {
        setShippingRecordOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetShippingRecordOutFlg_NotEqual(String shippingRecordOutFlg) {
        regShippingRecordOutFlg(CK_NES, shippingRecordOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlgList The collection of shippingRecordOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_InScope(Collection<String> shippingRecordOutFlgList) {
        doSetShippingRecordOutFlg_InScope(shippingRecordOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetShippingRecordOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingRecordOutFlg_InScope(Collection<String> shippingRecordOutFlgList) {
        regINS(CK_INS, cTL(shippingRecordOutFlgList), xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param shippingRecordOutFlgList The collection of shippingRecordOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotInScope(Collection<String> shippingRecordOutFlgList) {
        doSetShippingRecordOutFlg_NotInScope(shippingRecordOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetShippingRecordOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingRecordOutFlg_NotInScope(Collection<String> shippingRecordOutFlgList) {
        regINS(CK_NINS, cTL(shippingRecordOutFlgList), xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setShippingRecordOutFlg_IsNull() { regShippingRecordOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setShippingRecordOutFlg_IsNotNull() { regShippingRecordOutFlg(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutFlg(), "SHIPPING_RECORD_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_Equal(Long shippingRecordOutUserId) {
        doSetShippingRecordOutUserId_Equal(shippingRecordOutUserId);
    }

    protected void doSetShippingRecordOutUserId_Equal(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_EQ, shippingRecordOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_NotEqual(Long shippingRecordOutUserId) {
        doSetShippingRecordOutUserId_NotEqual(shippingRecordOutUserId);
    }

    protected void doSetShippingRecordOutUserId_NotEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_NES, shippingRecordOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_GreaterThan(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_GT, shippingRecordOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_LessThan(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_LT, shippingRecordOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_GreaterEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_GE, shippingRecordOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserId The value of shippingRecordOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_LessEqual(Long shippingRecordOutUserId) {
        regShippingRecordOutUserId(CK_LE, shippingRecordOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param minNumber The min number of shippingRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserIdList The collection of shippingRecordOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_InScope(Collection<Long> shippingRecordOutUserIdList) {
        doSetShippingRecordOutUserId_InScope(shippingRecordOutUserIdList);
    }

    protected void doSetShippingRecordOutUserId_InScope(Collection<Long> shippingRecordOutUserIdList) {
        regINS(CK_INS, cTL(shippingRecordOutUserIdList), xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     * @param shippingRecordOutUserIdList The collection of shippingRecordOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordOutUserId_NotInScope(Collection<Long> shippingRecordOutUserIdList) {
        doSetShippingRecordOutUserId_NotInScope(shippingRecordOutUserIdList);
    }

    protected void doSetShippingRecordOutUserId_NotInScope(Collection<Long> shippingRecordOutUserIdList) {
        regINS(CK_NINS, cTL(shippingRecordOutUserIdList), xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_RECORD_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByShippingRecordOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByShippingRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByShippingRecordOutUserId", false);
    }
    public abstract String keepShippingRecordOutUserId_InScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_RECORD_OUT_USER_ID from B_USER where ...)} <br />
     * B_USER by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByShippingRecordOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByShippingRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByShippingRecordOutUserId", true);
    }
    public abstract String keepShippingRecordOutUserId_NotInScopeRelation_BUserByShippingRecordOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setShippingRecordOutUserId_IsNull() { regShippingRecordOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_USER_ID: {IX, bigint(19), FK to B_USER}
     */
    public void setShippingRecordOutUserId_IsNotNull() { regShippingRecordOutUserId(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutUserId(), "SHIPPING_RECORD_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_Equal(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_EQ,  shippingRecordOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_GreaterThan(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_GT,  shippingRecordOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_LessThan(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_LT,  shippingRecordOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_GreaterEqual(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_GE,  shippingRecordOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * @param shippingRecordOutDt The value of shippingRecordOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordOutDt_LessEqual(java.sql.Timestamp shippingRecordOutDt) {
        regShippingRecordOutDt(CK_LE, shippingRecordOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setShippingRecordOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setShippingRecordOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueShippingRecordOutDt(), "SHIPPING_RECORD_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of shippingRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setShippingRecordOutDt_DateFromTo(Date fromDate, Date toDate) {
        setShippingRecordOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     */
    public void setShippingRecordOutDt_IsNull() { regShippingRecordOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_OUT_DT: {datetime2(26, 6)}
     */
    public void setShippingRecordOutDt_IsNotNull() { regShippingRecordOutDt(CK_ISNN, DOBJ); }

    protected void regShippingRecordOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordOutDt(), "SHIPPING_RECORD_OUT_DT"); }
    protected abstract ConditionValue xgetCValueShippingRecordOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlg The value of bolOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_Equal(String bolOutFlg) {
        doSetBolOutFlg_Equal(fRES(bolOutFlg));
    }

    /**
     * Equal(=). As BolOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg cdef) {
        doSetBolOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setBolOutFlg_Equal_$0() {
        setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setBolOutFlg_Equal_$1() {
        setBolOutFlg_Equal_AsBolOutFlg(CDef.BolOutFlg.$1);
    }

    protected void doSetBolOutFlg_Equal(String bolOutFlg) {
        regBolOutFlg(CK_EQ, bolOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlg The value of bolOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotEqual(String bolOutFlg) {
        doSetBolOutFlg_NotEqual(fRES(bolOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As BolOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg cdef) {
        doSetBolOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setBolOutFlg_NotEqual_$0() {
        setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setBolOutFlg_NotEqual_$1() {
        setBolOutFlg_NotEqual_AsBolOutFlg(CDef.BolOutFlg.$1);
    }

    protected void doSetBolOutFlg_NotEqual(String bolOutFlg) {
        regBolOutFlg(CK_NES, bolOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlgList The collection of bolOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_InScope(Collection<String> bolOutFlgList) {
        doSetBolOutFlg_InScope(bolOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As BolOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_InScope_AsBolOutFlg(Collection<CDef.BolOutFlg> cdefList) {
        doSetBolOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetBolOutFlg_InScope(Collection<String> bolOutFlgList) {
        regINS(CK_INS, cTL(bolOutFlgList), xgetCValueBolOutFlg(), "BOL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     * @param bolOutFlgList The collection of bolOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotInScope(Collection<String> bolOutFlgList) {
        doSetBolOutFlg_NotInScope(bolOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As BolOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutFlg_NotInScope_AsBolOutFlg(Collection<CDef.BolOutFlg> cdefList) {
        doSetBolOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetBolOutFlg_NotInScope(Collection<String> bolOutFlgList) {
        regINS(CK_NINS, cTL(bolOutFlgList), xgetCValueBolOutFlg(), "BOL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     */
    public void setBolOutFlg_IsNull() { regBolOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_FLG: {char(1), FK to B_CLASS_DTL, classification=BolOutFlg}
     */
    public void setBolOutFlg_IsNotNull() { regBolOutFlg(CK_ISNN, DOBJ); }

    protected void regBolOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutFlg(), "BOL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueBolOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_Equal(Long bolOutUserId) {
        doSetBolOutUserId_Equal(bolOutUserId);
    }

    protected void doSetBolOutUserId_Equal(Long bolOutUserId) {
        regBolOutUserId(CK_EQ, bolOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_NotEqual(Long bolOutUserId) {
        doSetBolOutUserId_NotEqual(bolOutUserId);
    }

    protected void doSetBolOutUserId_NotEqual(Long bolOutUserId) {
        regBolOutUserId(CK_NES, bolOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_GreaterThan(Long bolOutUserId) {
        regBolOutUserId(CK_GT, bolOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_LessThan(Long bolOutUserId) {
        regBolOutUserId(CK_LT, bolOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_GreaterEqual(Long bolOutUserId) {
        regBolOutUserId(CK_GE, bolOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserId The value of bolOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutUserId_LessEqual(Long bolOutUserId) {
        regBolOutUserId(CK_LE, bolOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param minNumber The min number of bolOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of bolOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBolOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBolOutUserId(), "BOL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserIdList The collection of bolOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutUserId_InScope(Collection<Long> bolOutUserIdList) {
        doSetBolOutUserId_InScope(bolOutUserIdList);
    }

    protected void doSetBolOutUserId_InScope(Collection<Long> bolOutUserIdList) {
        regINS(CK_INS, cTL(bolOutUserIdList), xgetCValueBolOutUserId(), "BOL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     * @param bolOutUserIdList The collection of bolOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBolOutUserId_NotInScope(Collection<Long> bolOutUserIdList) {
        doSetBolOutUserId_NotInScope(bolOutUserIdList);
    }

    protected void doSetBolOutUserId_NotInScope(Collection<Long> bolOutUserIdList) {
        regINS(CK_NINS, cTL(bolOutUserIdList), xgetCValueBolOutUserId(), "BOL_OUT_USER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     */
    public void setBolOutUserId_IsNull() { regBolOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_USER_ID: {bigint(19)}
     */
    public void setBolOutUserId_IsNotNull() { regBolOutUserId(CK_ISNN, DOBJ); }

    protected void regBolOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutUserId(), "BOL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueBolOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @param bolOutDt The value of bolOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_Equal(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_EQ,  bolOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @param bolOutDt The value of bolOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_GreaterThan(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_GT,  bolOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @param bolOutDt The value of bolOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_LessThan(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_LT,  bolOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @param bolOutDt The value of bolOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_GreaterEqual(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_GE,  bolOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * @param bolOutDt The value of bolOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBolOutDt_LessEqual(java.sql.Timestamp bolOutDt) {
        regBolOutDt(CK_LE, bolOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * <pre>e.g. setBolOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setBolOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueBolOutDt(), "BOL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of bolOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setBolOutDt_DateFromTo(Date fromDate, Date toDate) {
        setBolOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     */
    public void setBolOutDt_IsNull() { regBolOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOL_OUT_DT: {datetime2(26, 6)}
     */
    public void setBolOutDt_IsNotNull() { regBolOutDt(CK_ISNN, DOBJ); }

    protected void regBolOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBolOutDt(), "BOL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueBolOutDt();

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
    public HpSLCFunction<TPickingRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPickingRCB.class);
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
    public HpSLCFunction<TPickingRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPickingRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPickingRCB&gt;() {
     *     public void query(TPickingRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPickingRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPickingRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPickingRCQ sq);

    protected TPickingRCB xcreateScalarConditionCB() {
        TPickingRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPickingRCB xcreateScalarConditionPartitionByCB() {
        TPickingRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPickingRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PICKING_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPickingRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPickingRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPickingRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PICKING_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPickingRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPickingRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPickingRCB cb = new TPickingRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPickingRCQ sq);

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
    protected TPickingRCB newMyCB() {
        return new TPickingRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPickingRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
