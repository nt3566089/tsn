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
 * The abstract condition-query of T_PIC_MTHD_RCMD_CART.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPicMthdRcmdCartCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPicMthdRcmdCartCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_PIC_MTHD_RCMD_CART";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_Equal(Long picMthdRcmdCartId) {
        doSetPicMthdRcmdCartId_Equal(picMthdRcmdCartId);
    }

    protected void doSetPicMthdRcmdCartId_Equal(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_EQ, picMthdRcmdCartId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_NotEqual(Long picMthdRcmdCartId) {
        doSetPicMthdRcmdCartId_NotEqual(picMthdRcmdCartId);
    }

    protected void doSetPicMthdRcmdCartId_NotEqual(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_NES, picMthdRcmdCartId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_GreaterThan(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_GT, picMthdRcmdCartId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_LessThan(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_LT, picMthdRcmdCartId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_GreaterEqual(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_GE, picMthdRcmdCartId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartId The value of picMthdRcmdCartId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_LessEqual(Long picMthdRcmdCartId) {
        regPicMthdRcmdCartId(CK_LE, picMthdRcmdCartId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of picMthdRcmdCartId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picMthdRcmdCartId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicMthdRcmdCartId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicMthdRcmdCartId(), "PIC_MTHD_RCMD_CART_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartIdList The collection of picMthdRcmdCartId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_InScope(Collection<Long> picMthdRcmdCartIdList) {
        doSetPicMthdRcmdCartId_InScope(picMthdRcmdCartIdList);
    }

    protected void doSetPicMthdRcmdCartId_InScope(Collection<Long> picMthdRcmdCartIdList) {
        regINS(CK_INS, cTL(picMthdRcmdCartIdList), xgetCValuePicMthdRcmdCartId(), "PIC_MTHD_RCMD_CART_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdCartIdList The collection of picMthdRcmdCartId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdCartId_NotInScope(Collection<Long> picMthdRcmdCartIdList) {
        doSetPicMthdRcmdCartId_NotInScope(picMthdRcmdCartIdList);
    }

    protected void doSetPicMthdRcmdCartId_NotInScope(Collection<Long> picMthdRcmdCartIdList) {
        regINS(CK_NINS, cTL(picMthdRcmdCartIdList), xgetCValuePicMthdRcmdCartId(), "PIC_MTHD_RCMD_CART_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPicMthdRcmdCartId_IsNull() { regPicMthdRcmdCartId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_CART_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPicMthdRcmdCartId_IsNotNull() { regPicMthdRcmdCartId(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdCartId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdCartId(), "PIC_MTHD_RCMD_CART_ID"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdCartId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_Equal(Long packingHId) {
        doSetPackingHId_Equal(packingHId);
    }

    protected void doSetPackingHId_Equal(Long packingHId) {
        regPackingHId(CK_EQ, packingHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_NotEqual(Long packingHId) {
        doSetPackingHId_NotEqual(packingHId);
    }

    protected void doSetPackingHId_NotEqual(Long packingHId) {
        regPackingHId(CK_NES, packingHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterThan(Long packingHId) {
        regPackingHId(CK_GT, packingHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessThan(Long packingHId) {
        regPackingHId(CK_LT, packingHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_GreaterEqual(Long packingHId) {
        regPackingHId(CK_GE, packingHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHId The value of packingHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingHId_LessEqual(Long packingHId) {
        regPackingHId(CK_LE, packingHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param minNumber The min number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingHId(), "PACKING_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHIdList The collection of packingHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_InScope(Collection<Long> packingHIdList) {
        doSetPackingHId_InScope(packingHIdList);
    }

    protected void doSetPackingHId_InScope(Collection<Long> packingHIdList) {
        regINS(CK_INS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_H_ID: {IX, NotNull, bigint(19), FK to T_PACKING_H}
     * @param packingHIdList The collection of packingHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingHId_NotInScope(Collection<Long> packingHIdList) {
        doSetPackingHId_NotInScope(packingHIdList);
    }

    protected void doSetPackingHId_NotInScope(Collection<Long> packingHIdList) {
        regINS(CK_NINS, cTL(packingHIdList), xgetCValuePackingHId(), "PACKING_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PACKING_H_ID from T_PACKING_H where ...)} <br />
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'in-scope'. (NotNull)
     */
    public void inScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_InScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", false);
    }
    public abstract String keepPackingHId_InScopeRelation_TPackingH(TPackingHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PACKING_H_ID from T_PACKING_H where ...)} <br />
     * T_PACKING_H by my PACKING_H_ID, named 'TPackingH'.
     * @param subCBLambda The callback for sub-query of TPackingH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPackingH(SubQuery<TPackingHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingHCB cb = new TPackingHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPackingHId_NotInScopeRelation_TPackingH(cb.query());
        registerInScopeRelation(cb.query(), "PACKING_H_ID", "PACKING_H_ID", pp, "tPackingH", true);
    }
    public abstract String keepPackingHId_NotInScopeRelation_TPackingH(TPackingHCQ sq);

    protected void regPackingHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingHId(), "PACKING_H_ID"); }
    protected abstract ConditionValue xgetCValuePackingHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_Equal(Long cartNo) {
        doSetCartNo_Equal(cartNo);
    }

    protected void doSetCartNo_Equal(Long cartNo) {
        regCartNo(CK_EQ, cartNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_NotEqual(Long cartNo) {
        doSetCartNo_NotEqual(cartNo);
    }

    protected void doSetCartNo_NotEqual(Long cartNo) {
        regCartNo(CK_NES, cartNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_GreaterThan(Long cartNo) {
        regCartNo(CK_GT, cartNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_LessThan(Long cartNo) {
        regCartNo(CK_LT, cartNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_GreaterEqual(Long cartNo) {
        regCartNo(CK_GE, cartNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNo The value of cartNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCartNo_LessEqual(Long cartNo) {
        regCartNo(CK_LE, cartNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param minNumber The min number of cartNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cartNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCartNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCartNo(), "CART_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNoList The collection of cartNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartNo_InScope(Collection<Long> cartNoList) {
        doSetCartNo_InScope(cartNoList);
    }

    protected void doSetCartNo_InScope(Collection<Long> cartNoList) {
        regINS(CK_INS, cTL(cartNoList), xgetCValueCartNo(), "CART_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CART_NO: {bigint(19)}
     * @param cartNoList The collection of cartNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCartNo_NotInScope(Collection<Long> cartNoList) {
        doSetCartNo_NotInScope(cartNoList);
    }

    protected void doSetCartNo_NotInScope(Collection<Long> cartNoList) {
        regINS(CK_NINS, cTL(cartNoList), xgetCValueCartNo(), "CART_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     */
    public void setCartNo_IsNull() { regCartNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CART_NO: {bigint(19)}
     */
    public void setCartNo_IsNotNull() { regCartNo(CK_ISNN, DOBJ); }

    protected void regCartNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCartNo(), "CART_NO"); }
    protected abstract ConditionValue xgetCValueCartNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_Equal(Long picMthdRcmdId) {
        doSetPicMthdRcmdId_Equal(picMthdRcmdId);
    }

    protected void doSetPicMthdRcmdId_Equal(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_EQ, picMthdRcmdId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_NotEqual(Long picMthdRcmdId) {
        doSetPicMthdRcmdId_NotEqual(picMthdRcmdId);
    }

    protected void doSetPicMthdRcmdId_NotEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_NES, picMthdRcmdId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GT, picMthdRcmdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LT, picMthdRcmdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GE, picMthdRcmdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LE, picMthdRcmdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param minNumber The min number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicMthdRcmdId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdIdList The collection of picMthdRcmdId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_InScope(Collection<Long> picMthdRcmdIdList) {
        doSetPicMthdRcmdId_InScope(picMthdRcmdIdList);
    }

    protected void doSetPicMthdRcmdId_InScope(Collection<Long> picMthdRcmdIdList) {
        regINS(CK_INS, cTL(picMthdRcmdIdList), xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     * @param picMthdRcmdIdList The collection of picMthdRcmdId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        doSetPicMthdRcmdId_NotInScope(picMthdRcmdIdList);
    }

    protected void doSetPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        regINS(CK_NINS, cTL(picMthdRcmdIdList), xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD where ...)} <br />
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @param subCBLambda The callback for sub-query of TPicMthdRcmd for 'in-scope'. (NotNull)
     */
    public void inScopeTPicMthdRcmd(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(cb.query());
        registerInScopeRelation(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmd", false);
    }
    public abstract String keepPicMthdRcmdId_InScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD where ...)} <br />
     * T_PIC_MTHD_RCMD by my PIC_MTHD_RCMD_ID, named 'TPicMthdRcmd'.
     * @param subCBLambda The callback for sub-query of TPicMthdRcmd for 'not in-scope'. (NotNull)
     */
    public void notInScopeTPicMthdRcmd(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(cb.query());
        registerInScopeRelation(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmd", true);
    }
    public abstract String keepPicMthdRcmdId_NotInScopeRelation_TPicMthdRcmd(TPicMthdRcmdCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     */
    public void setPicMthdRcmdId_IsNull() { regPicMthdRcmdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {IX, bigint(19), FK to T_PIC_MTHD_RCMD}
     */
    public void setPicMthdRcmdId_IsNotNull() { regPicMthdRcmdId(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdId();

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
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPicMthdRcmdCartCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPicMthdRcmdCartCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPicMthdRcmdCartCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPicMthdRcmdCartCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPicMthdRcmdCartCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPicMthdRcmdCartCB&gt;() {
     *     public void query(TPicMthdRcmdCartCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPicMthdRcmdCartCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPicMthdRcmdCartCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPicMthdRcmdCartCQ sq);

    protected TPicMthdRcmdCartCB xcreateScalarConditionCB() {
        TPicMthdRcmdCartCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPicMthdRcmdCartCB xcreateScalarConditionPartitionByCB() {
        TPicMthdRcmdCartCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPicMthdRcmdCartCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PIC_MTHD_RCMD_CART_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPicMthdRcmdCartCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCartCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPicMthdRcmdCartCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PIC_MTHD_RCMD_CART_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPicMthdRcmdCartCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPicMthdRcmdCartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPicMthdRcmdCartCQ sq);

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
    protected TPicMthdRcmdCartCB newMyCB() {
        return new TPicMthdRcmdCartCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPicMthdRcmdCartCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
