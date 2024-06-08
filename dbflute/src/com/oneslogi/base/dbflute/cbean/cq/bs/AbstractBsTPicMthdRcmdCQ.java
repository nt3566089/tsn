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
 * The abstract condition-query of T_PIC_MTHD_RCMD.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPicMthdRcmdCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPicMthdRcmdCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "T_PIC_MTHD_RCMD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GT, picMthdRcmdId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessThan(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LT, picMthdRcmdId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdId The value of picMthdRcmdId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_GreaterEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_GE, picMthdRcmdId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdId The value of picMthdRcmdId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_LessEqual(Long picMthdRcmdId) {
        regPicMthdRcmdId(CK_LE, picMthdRcmdId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of picMthdRcmdId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPicMthdRcmdId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param picMthdRcmdIdList The collection of picMthdRcmdId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        doSetPicMthdRcmdId_NotInScope(picMthdRcmdIdList);
    }

    protected void doSetPicMthdRcmdId_NotInScope(Collection<Long> picMthdRcmdIdList) {
        regINS(CK_NINS, cTL(picMthdRcmdIdList), xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdCartList</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdCartList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdCartList(SubQuery<TPicMthdRcmdCartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList(cb.query());
        registerExistsReferrer(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdCartList");
    }
    public abstract String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD_DATA where ...)} <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTPicMthdRcmdDataList</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TPicMthdRcmdDataList for 'exists'. (NotNull)
     */
    public void existsTPicMthdRcmdDataList(SubQuery<TPicMthdRcmdDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList(cb.query());
        registerExistsReferrer(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdDataList");
    }
    public abstract String keepPicMthdRcmdId_ExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdCartList</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdCartList(SubQuery<TPicMthdRcmdCartCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList(cb.query());
        registerNotExistsReferrer(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdCartList");
    }
    public abstract String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PIC_MTHD_RCMD_ID from T_PIC_MTHD_RCMD_DATA where ...)} <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTPicMthdRcmdDataList</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of PicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList for 'not exists'. (NotNull)
     */
    public void notExistsTPicMthdRcmdDataList(SubQuery<TPicMthdRcmdDataCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList(cb.query());
        registerNotExistsReferrer(cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdDataList");
    }
    public abstract String keepPicMthdRcmdId_NotExistsReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    public void xsderiveTPicMthdRcmdCartList(String fn, SubQuery<TPicMthdRcmdCartCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdCartList", al, op);
    }
    public abstract String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);

    public void xsderiveTPicMthdRcmdDataList(String fn, SubQuery<TPicMthdRcmdDataCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", pp, "tPicMthdRcmdDataList", al, op);
    }
    public abstract String keepPicMthdRcmdId_SpecifyDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PIC_MTHD_RCMD_CART where ...)} <br>
     * T_PIC_MTHD_RCMD_CART by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdCartAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdCartList()</span>.<span style="color: #CC4747">max</span>(cartCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cartCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     cartCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCartCB> derivedTPicMthdRcmdCartList() {
        return xcreateQDRFunctionTPicMthdRcmdCartList();
    }
    protected HpQDRFunction<TPicMthdRcmdCartCB> xcreateQDRFunctionTPicMthdRcmdCartList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdCartList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdCartList(String fn, SubQuery<TPicMthdRcmdCartCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCartCB cb = new TPicMthdRcmdCartCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList(cb.query()); String prpp = keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", sqpp, "tPicMthdRcmdCartList", rd, vl, prpp, op);
    }
    public abstract String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartList(TPicMthdRcmdCartCQ sq);
    public abstract String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdCartListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from T_PIC_MTHD_RCMD_DATA where ...)} <br>
     * T_PIC_MTHD_RCMD_DATA by PIC_MTHD_RCMD_ID, named 'TPicMthdRcmdDataAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTPicMthdRcmdDataList()</span>.<span style="color: #CC4747">max</span>(dataCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     dataCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     dataCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdDataCB> derivedTPicMthdRcmdDataList() {
        return xcreateQDRFunctionTPicMthdRcmdDataList();
    }
    protected HpQDRFunction<TPicMthdRcmdDataCB> xcreateQDRFunctionTPicMthdRcmdDataList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTPicMthdRcmdDataList(fn, sq, rd, vl, op));
    }
    public void xqderiveTPicMthdRcmdDataList(String fn, SubQuery<TPicMthdRcmdDataCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdDataCB cb = new TPicMthdRcmdDataCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList(cb.query()); String prpp = keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "PIC_MTHD_RCMD_ID", "PIC_MTHD_RCMD_ID", sqpp, "tPicMthdRcmdDataList", rd, vl, prpp, op);
    }
    public abstract String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataList(TPicMthdRcmdDataCQ sq);
    public abstract String keepPicMthdRcmdId_QueryDerivedReferrer_TPicMthdRcmdDataListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPicMthdRcmdId_IsNull() { regPicMthdRcmdId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIC_MTHD_RCMD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setPicMthdRcmdId_IsNotNull() { regPicMthdRcmdId(CK_ISNN, DOBJ); }

    protected void regPicMthdRcmdId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePicMthdRcmdId(), "PIC_MTHD_RCMD_ID"); }
    protected abstract ConditionValue xgetCValuePicMthdRcmdId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_Equal(String pickingBatchNo) {
        doSetPickingBatchNo_Equal(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_Equal(String pickingBatchNo) {
        regPickingBatchNo(CK_EQ, pickingBatchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotEqual(String pickingBatchNo) {
        doSetPickingBatchNo_NotEqual(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_NotEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_NES, pickingBatchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterThan(String pickingBatchNo) {
        regPickingBatchNo(CK_GT, fRES(pickingBatchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessThan(String pickingBatchNo) {
        regPickingBatchNo(CK_LT, fRES(pickingBatchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_GE, fRES(pickingBatchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_LE, fRES(pickingBatchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_InScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        regINS(CK_INS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_NotInScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        regINS(CK_NINS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)} <br>
     * <pre>e.g. setPickingBatchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingBatchNo The value of pickingBatchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingBatchNo_LikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingBatchNo_NotLikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     * @param pickingBatchNo The value of pickingBatchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_PrefixSearch(String pickingBatchNo) {
        setPickingBatchNo_LikeSearch(pickingBatchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     */
    public void setPickingBatchNo_IsNull() { regPickingBatchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     */
    public void setPickingBatchNo_IsNullOrEmpty() { regPickingBatchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {varchar(30)}
     */
    public void setPickingBatchNo_IsNotNull() { regPickingBatchNo(CK_ISNN, DOBJ); }

    protected void regPickingBatchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBatchNo(), "PICKING_BATCH_NO"); }
    protected abstract ConditionValue xgetCValuePickingBatchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @param rcmdPickingCls The value of rcmdPickingCls as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_Equal(String rcmdPickingCls) {
        doSetRcmdPickingCls_Equal(fRES(rcmdPickingCls));
    }

    /**
     * Equal(=). As RcmdPickingCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls cdef) {
        doSetRcmdPickingCls_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: オーダーピッキング
     */
    public void setRcmdPickingCls_Equal_$1() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$1);
    }

    /**
     * Equal(=). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: トータルピッキング＋摘み取り
     */
    public void setRcmdPickingCls_Equal_$2() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$2);
    }

    /**
     * Equal(=). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: トータルピッキング＋種蒔き
     */
    public void setRcmdPickingCls_Equal_$3() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$3);
    }

    /**
     * Equal(=). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: マルチピッキング
     */
    public void setRcmdPickingCls_Equal_$4() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$4);
    }

    /**
     * Equal(=). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: 単行ピッキング
     */
    public void setRcmdPickingCls_Equal_$5() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$5);
    }

    /**
     * Equal(=). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ケースピッキング
     */
    public void setRcmdPickingCls_Equal_$6() {
        setRcmdPickingCls_Equal_AsRcmdPickingCls(CDef.RcmdPickingCls.$6);
    }

    protected void doSetRcmdPickingCls_Equal(String rcmdPickingCls) {
        regRcmdPickingCls(CK_EQ, rcmdPickingCls);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @param rcmdPickingCls The value of rcmdPickingCls as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_NotEqual(String rcmdPickingCls) {
        doSetRcmdPickingCls_NotEqual(fRES(rcmdPickingCls));
    }

    /**
     * NotEqual(&lt;&gt;). As RcmdPickingCls. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls cdef) {
        doSetRcmdPickingCls_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: オーダーピッキング
     */
    public void setRcmdPickingCls_NotEqual_$1() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $2 (2). And OnlyOnceRegistered. <br>
     * $2: トータルピッキング＋摘み取り
     */
    public void setRcmdPickingCls_NotEqual_$2() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$2);
    }

    /**
     * NotEqual(&lt;&gt;). As $3 (3). And OnlyOnceRegistered. <br>
     * $3: トータルピッキング＋種蒔き
     */
    public void setRcmdPickingCls_NotEqual_$3() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$3);
    }

    /**
     * NotEqual(&lt;&gt;). As $4 (4). And OnlyOnceRegistered. <br>
     * $4: マルチピッキング
     */
    public void setRcmdPickingCls_NotEqual_$4() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$4);
    }

    /**
     * NotEqual(&lt;&gt;). As $5 (5). And OnlyOnceRegistered. <br>
     * $5: 単行ピッキング
     */
    public void setRcmdPickingCls_NotEqual_$5() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$5);
    }

    /**
     * NotEqual(&lt;&gt;). As $6 (6). And OnlyOnceRegistered. <br>
     * $6: ケースピッキング
     */
    public void setRcmdPickingCls_NotEqual_$6() {
        setRcmdPickingCls_NotEqual_AsRcmdPickingCls(CDef.RcmdPickingCls.$6);
    }

    protected void doSetRcmdPickingCls_NotEqual(String rcmdPickingCls) {
        regRcmdPickingCls(CK_NES, rcmdPickingCls);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @param rcmdPickingClsList The collection of rcmdPickingCls as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_InScope(Collection<String> rcmdPickingClsList) {
        doSetRcmdPickingCls_InScope(rcmdPickingClsList);
    }

    /**
     * InScope {in ('a', 'b')}. As RcmdPickingCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_InScope_AsRcmdPickingCls(Collection<CDef.RcmdPickingCls> cdefList) {
        doSetRcmdPickingCls_InScope(cTStrL(cdefList));
    }

    protected void doSetRcmdPickingCls_InScope(Collection<String> rcmdPickingClsList) {
        regINS(CK_INS, cTL(rcmdPickingClsList), xgetCValueRcmdPickingCls(), "RCMD_PICKING_CLS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     * @param rcmdPickingClsList The collection of rcmdPickingCls as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_NotInScope(Collection<String> rcmdPickingClsList) {
        doSetRcmdPickingCls_NotInScope(rcmdPickingClsList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As RcmdPickingCls. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls} <br>
     * 提案ピッキング方法
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcmdPickingCls_NotInScope_AsRcmdPickingCls(Collection<CDef.RcmdPickingCls> cdefList) {
        doSetRcmdPickingCls_NotInScope(cTStrL(cdefList));
    }

    protected void doSetRcmdPickingCls_NotInScope(Collection<String> rcmdPickingClsList) {
        regINS(CK_NINS, cTL(rcmdPickingClsList), xgetCValueRcmdPickingCls(), "RCMD_PICKING_CLS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     */
    public void setRcmdPickingCls_IsNull() { regRcmdPickingCls(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     */
    public void setRcmdPickingCls_IsNullOrEmpty() { regRcmdPickingCls(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCMD_PICKING_CLS: {varchar(30), FK to B_CLASS_DTL, classification=RcmdPickingCls}
     */
    public void setRcmdPickingCls_IsNotNull() { regRcmdPickingCls(CK_ISNN, DOBJ); }

    protected void regRcmdPickingCls(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcmdPickingCls(), "RCMD_PICKING_CLS"); }
    protected abstract ConditionValue xgetCValueRcmdPickingCls();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_Equal(Long packingNum) {
        doSetPackingNum_Equal(packingNum);
    }

    protected void doSetPackingNum_Equal(Long packingNum) {
        regPackingNum(CK_EQ, packingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_NotEqual(Long packingNum) {
        doSetPackingNum_NotEqual(packingNum);
    }

    protected void doSetPackingNum_NotEqual(Long packingNum) {
        regPackingNum(CK_NES, packingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterThan(Long packingNum) {
        regPackingNum(CK_GT, packingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessThan(Long packingNum) {
        regPackingNum(CK_LT, packingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_GreaterEqual(Long packingNum) {
        regPackingNum(CK_GE, packingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNum The value of packingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingNum_LessEqual(Long packingNum) {
        regPackingNum(CK_LE, packingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param minNumber The min number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingNum(), "PACKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNumList The collection of packingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_InScope(Collection<Long> packingNumList) {
        doSetPackingNum_InScope(packingNumList);
    }

    protected void doSetPackingNum_InScope(Collection<Long> packingNumList) {
        regINS(CK_INS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     * @param packingNumList The collection of packingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNum_NotInScope(Collection<Long> packingNumList) {
        doSetPackingNum_NotInScope(packingNumList);
    }

    protected void doSetPackingNum_NotInScope(Collection<Long> packingNumList) {
        regINS(CK_NINS, cTL(packingNumList), xgetCValuePackingNum(), "PACKING_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     */
    public void setPackingNum_IsNull() { regPackingNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_NUM: {bigint(19)}
     */
    public void setPackingNum_IsNotNull() { regPackingNum(CK_ISNN, DOBJ); }

    protected void regPackingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingNum(), "PACKING_NUM"); }
    protected abstract ConditionValue xgetCValuePackingNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_Equal(java.math.BigDecimal workVolume) {
        doSetWorkVolume_Equal(workVolume);
    }

    protected void doSetWorkVolume_Equal(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_EQ, workVolume);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_NotEqual(java.math.BigDecimal workVolume) {
        doSetWorkVolume_NotEqual(workVolume);
    }

    protected void doSetWorkVolume_NotEqual(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_NES, workVolume);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_GreaterThan(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_GT, workVolume);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_LessThan(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_LT, workVolume);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_GreaterEqual(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_GE, workVolume);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolume The value of workVolume as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setWorkVolume_LessEqual(java.math.BigDecimal workVolume) {
        regWorkVolume(CK_LE, workVolume);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param minNumber The min number of workVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of workVolume. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setWorkVolume_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueWorkVolume(), "WORK_VOLUME", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolumeList The collection of workVolume as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkVolume_InScope(Collection<java.math.BigDecimal> workVolumeList) {
        doSetWorkVolume_InScope(workVolumeList);
    }

    protected void doSetWorkVolume_InScope(Collection<java.math.BigDecimal> workVolumeList) {
        regINS(CK_INS, cTL(workVolumeList), xgetCValueWorkVolume(), "WORK_VOLUME");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     * @param workVolumeList The collection of workVolume as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkVolume_NotInScope(Collection<java.math.BigDecimal> workVolumeList) {
        doSetWorkVolume_NotInScope(workVolumeList);
    }

    protected void doSetWorkVolume_NotInScope(Collection<java.math.BigDecimal> workVolumeList) {
        regINS(CK_NINS, cTL(workVolumeList), xgetCValueWorkVolume(), "WORK_VOLUME");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     */
    public void setWorkVolume_IsNull() { regWorkVolume(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_VOLUME: {decimal(16, 6)}
     */
    public void setWorkVolume_IsNotNull() { regWorkVolume(CK_ISNN, DOBJ); }

    protected void regWorkVolume(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkVolume(), "WORK_VOLUME"); }
    protected abstract ConditionValue xgetCValueWorkVolume();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_Equal(String deliveryCourseCd) {
        doSetDeliveryCourseCd_Equal(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_Equal(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_EQ, deliveryCourseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        doSetDeliveryCourseCd_NotEqual(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_NES, deliveryCourseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GT, fRES(deliveryCourseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LT, fRES(deliveryCourseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GE, fRES(deliveryCourseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LE, fRES(deliveryCourseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_InScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_INS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_NotInScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_NINS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)} <br>
     * <pre>e.g. setDeliveryCourseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseCd The value of deliveryCourseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseCd_LikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseCd_NotLikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     * @param deliveryCourseCd The value of deliveryCourseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        setDeliveryCourseCd_LikeSearch(deliveryCourseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     */
    public void setDeliveryCourseCd_IsNull() { regDeliveryCourseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     */
    public void setDeliveryCourseCd_IsNullOrEmpty() { regDeliveryCourseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {varchar(100)}
     */
    public void setDeliveryCourseCd_IsNotNull() { regDeliveryCourseCd(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_Equal(String deliveryCourseNm) {
        doSetDeliveryCourseNm_Equal(fRES(deliveryCourseNm));
    }

    protected void doSetDeliveryCourseNm_Equal(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_EQ, deliveryCourseNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_NotEqual(String deliveryCourseNm) {
        doSetDeliveryCourseNm_NotEqual(fRES(deliveryCourseNm));
    }

    protected void doSetDeliveryCourseNm_NotEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_NES, deliveryCourseNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GT, fRES(deliveryCourseNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessThan(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LT, fRES(deliveryCourseNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_GreaterEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_GE, fRES(deliveryCourseNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_LessEqual(String deliveryCourseNm) {
        regDeliveryCourseNm(CK_LE, fRES(deliveryCourseNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNmList The collection of deliveryCourseNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_InScope(Collection<String> deliveryCourseNmList) {
        doSetDeliveryCourseNm_InScope(deliveryCourseNmList);
    }

    protected void doSetDeliveryCourseNm_InScope(Collection<String> deliveryCourseNmList) {
        regINS(CK_INS, cTL(deliveryCourseNmList), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNmList The collection of deliveryCourseNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_NotInScope(Collection<String> deliveryCourseNmList) {
        doSetDeliveryCourseNm_NotInScope(deliveryCourseNmList);
    }

    protected void doSetDeliveryCourseNm_NotInScope(Collection<String> deliveryCourseNmList) {
        regINS(CK_NINS, cTL(deliveryCourseNmList), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)} <br>
     * <pre>e.g. setDeliveryCourseNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseNm The value of deliveryCourseNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseNm_LikeSearch(String deliveryCourseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseNm), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseNm_NotLikeSearch(String deliveryCourseNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseNm), xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     * @param deliveryCourseNm The value of deliveryCourseNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseNm_PrefixSearch(String deliveryCourseNm) {
        setDeliveryCourseNm_LikeSearch(deliveryCourseNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     */
    public void setDeliveryCourseNm_IsNull() { regDeliveryCourseNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     */
    public void setDeliveryCourseNm_IsNullOrEmpty() { regDeliveryCourseNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_NM: {varchar(255)}
     */
    public void setDeliveryCourseNm_IsNotNull() { regDeliveryCourseNm(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseNm(), "DELIVERY_COURSE_NM"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_Equal(String carrierCd) {
        doSetCarrierCd_Equal(fRES(carrierCd));
    }

    protected void doSetCarrierCd_Equal(String carrierCd) {
        regCarrierCd(CK_EQ, carrierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotEqual(String carrierCd) {
        doSetCarrierCd_NotEqual(fRES(carrierCd));
    }

    protected void doSetCarrierCd_NotEqual(String carrierCd) {
        regCarrierCd(CK_NES, carrierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterThan(String carrierCd) {
        regCarrierCd(CK_GT, fRES(carrierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessThan(String carrierCd) {
        regCarrierCd(CK_LT, fRES(carrierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_GreaterEqual(String carrierCd) {
        regCarrierCd(CK_GE, fRES(carrierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_LessEqual(String carrierCd) {
        regCarrierCd(CK_LE, fRES(carrierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCdList The collection of carrierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_InScope(Collection<String> carrierCdList) {
        doSetCarrierCd_InScope(carrierCdList);
    }

    protected void doSetCarrierCd_InScope(Collection<String> carrierCdList) {
        regINS(CK_INS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCdList The collection of carrierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_NotInScope(Collection<String> carrierCdList) {
        doSetCarrierCd_NotInScope(carrierCdList);
    }

    protected void doSetCarrierCd_NotInScope(Collection<String> carrierCdList) {
        regINS(CK_NINS, cTL(carrierCdList), xgetCValueCarrierCd(), "CARRIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(100)} <br>
     * <pre>e.g. setCarrierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierCd The value of carrierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierCd_LikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierCd_NotLikeSearch(String carrierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierCd), xgetCValueCarrierCd(), "CARRIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     * @param carrierCd The value of carrierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierCd_PrefixSearch(String carrierCd) {
        setCarrierCd_LikeSearch(carrierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     */
    public void setCarrierCd_IsNull() { regCarrierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     */
    public void setCarrierCd_IsNullOrEmpty() { regCarrierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_CD: {varchar(100)}
     */
    public void setCarrierCd_IsNotNull() { regCarrierCd(CK_ISNN, DOBJ); }

    protected void regCarrierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierCd(), "CARRIER_CD"); }
    protected abstract ConditionValue xgetCValueCarrierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_Equal(String carrierNm) {
        doSetCarrierNm_Equal(fRES(carrierNm));
    }

    protected void doSetCarrierNm_Equal(String carrierNm) {
        regCarrierNm(CK_EQ, carrierNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotEqual(String carrierNm) {
        doSetCarrierNm_NotEqual(fRES(carrierNm));
    }

    protected void doSetCarrierNm_NotEqual(String carrierNm) {
        regCarrierNm(CK_NES, carrierNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterThan(String carrierNm) {
        regCarrierNm(CK_GT, fRES(carrierNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessThan(String carrierNm) {
        regCarrierNm(CK_LT, fRES(carrierNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_GreaterEqual(String carrierNm) {
        regCarrierNm(CK_GE, fRES(carrierNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_LessEqual(String carrierNm) {
        regCarrierNm(CK_LE, fRES(carrierNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNmList The collection of carrierNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_InScope(Collection<String> carrierNmList) {
        doSetCarrierNm_InScope(carrierNmList);
    }

    protected void doSetCarrierNm_InScope(Collection<String> carrierNmList) {
        regINS(CK_INS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNmList The collection of carrierNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_NotInScope(Collection<String> carrierNmList) {
        doSetCarrierNm_NotInScope(carrierNmList);
    }

    protected void doSetCarrierNm_NotInScope(Collection<String> carrierNmList) {
        regINS(CK_NINS, cTL(carrierNmList), xgetCValueCarrierNm(), "CARRIER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(255)} <br>
     * <pre>e.g. setCarrierNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierNm The value of carrierNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierNm_LikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierNm_NotLikeSearch(String carrierNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierNm), xgetCValueCarrierNm(), "CARRIER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     * @param carrierNm The value of carrierNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierNm_PrefixSearch(String carrierNm) {
        setCarrierNm_LikeSearch(carrierNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     */
    public void setCarrierNm_IsNull() { regCarrierNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     */
    public void setCarrierNm_IsNullOrEmpty() { regCarrierNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_NM: {varchar(255)}
     */
    public void setCarrierNm_IsNotNull() { regCarrierNm(CK_ISNN, DOBJ); }

    protected void regCarrierNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierNm(), "CARRIER_NM"); }
    protected abstract ConditionValue xgetCValueCarrierNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal(String emergencyFlg) {
        doSetEmergencyFlg_Equal(fRES(emergencyFlg));
    }

    /**
     * Equal(=). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_Equal_$0() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_Equal_$1() {
        setEmergencyFlg_Equal_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_Equal(String emergencyFlg) {
        regEmergencyFlg(CK_EQ, emergencyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlg The value of emergencyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual(String emergencyFlg) {
        doSetEmergencyFlg_NotEqual(fRES(emergencyFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As EmergencyFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg cdef) {
        doSetEmergencyFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 通常
     */
    public void setEmergencyFlg_NotEqual_$0() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 緊急
     */
    public void setEmergencyFlg_NotEqual_$1() {
        setEmergencyFlg_NotEqual_AsEmergencyFlg(CDef.EmergencyFlg.$1);
    }

    protected void doSetEmergencyFlg_NotEqual(String emergencyFlg) {
        regEmergencyFlg(CK_NES, emergencyFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_InScope(emergencyFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        regINS(CK_INS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     * @param emergencyFlgList The collection of emergencyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_NotInScope(emergencyFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As EmergencyFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg} <br>
     * 緊急フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope_AsEmergencyFlg(Collection<CDef.EmergencyFlg> cdefList) {
        doSetEmergencyFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        regINS(CK_NINS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNull() { regEmergencyFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {char(1), FK to B_CLASS_DTL, classification=EmergencyFlg}
     */
    public void setEmergencyFlg_IsNotNull() { regEmergencyFlg(CK_ISNN, DOBJ); }

    protected void regEmergencyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmergencyFlg(), "EMERGENCY_FLG"); }
    protected abstract ConditionValue xgetCValueEmergencyFlg();

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
    public HpSLCFunction<TPicMthdRcmdCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPicMthdRcmdCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPicMthdRcmdCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPicMthdRcmdCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPicMthdRcmdCB.class);
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
    public HpSLCFunction<TPicMthdRcmdCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPicMthdRcmdCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPicMthdRcmdCB&gt;() {
     *     public void query(TPicMthdRcmdCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPicMthdRcmdCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPicMthdRcmdCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPicMthdRcmdCQ sq);

    protected TPicMthdRcmdCB xcreateScalarConditionCB() {
        TPicMthdRcmdCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPicMthdRcmdCB xcreateScalarConditionPartitionByCB() {
        TPicMthdRcmdCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPicMthdRcmdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PIC_MTHD_RCMD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPicMthdRcmdCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPicMthdRcmdCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPicMthdRcmdCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PIC_MTHD_RCMD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPicMthdRcmdCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPicMthdRcmdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPicMthdRcmdCB cb = new TPicMthdRcmdCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPicMthdRcmdCQ sq);

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
    protected TPicMthdRcmdCB newMyCB() {
        return new TPicMthdRcmdCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPicMthdRcmdCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
