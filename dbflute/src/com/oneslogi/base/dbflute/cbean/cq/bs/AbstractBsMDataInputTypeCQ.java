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
 * The abstract condition-query of M_DATA_INPUT_TYPE.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMDataInputTypeCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMDataInputTypeCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "M_DATA_INPUT_TYPE";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeId The value of dataInputTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_GreaterThan(Long dataInputTypeId) {
        regDataInputTypeId(CK_GT, dataInputTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeId The value of dataInputTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_LessThan(Long dataInputTypeId) {
        regDataInputTypeId(CK_LT, dataInputTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeId The value of dataInputTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_GreaterEqual(Long dataInputTypeId) {
        regDataInputTypeId(CK_GE, dataInputTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeId The value of dataInputTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeId_LessEqual(Long dataInputTypeId) {
        regDataInputTypeId(CK_LE, dataInputTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of dataInputTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of dataInputTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDataInputTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
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
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param dataInputTypeIdList The collection of dataInputTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeId_NotInScope(Collection<Long> dataInputTypeIdList) {
        doSetDataInputTypeId_NotInScope(dataInputTypeIdList);
    }

    protected void doSetDataInputTypeId_NotInScope(Collection<Long> dataInputTypeIdList) {
        regINS(CK_NINS, cTL(dataInputTypeIdList), xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DATA_INPUT_TYPE_ID from M_DATA_INPUT_TYPE_B where ...)} <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDataInputTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDataInputTypeBList for 'exists'. (NotNull)
     */
    public void existsMDataInputTypeBList(SubQuery<MDataInputTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDataInputTypeId_ExistsReferrer_MDataInputTypeBList(cb.query());
        registerExistsReferrer(cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", pp, "mDataInputTypeBList");
    }
    public abstract String keepDataInputTypeId_ExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DATA_INPUT_TYPE_ID from M_DATA_INPUT_TYPE_B where ...)} <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDataInputTypeBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of DataInputTypeId_NotExistsReferrer_MDataInputTypeBList for 'not exists'. (NotNull)
     */
    public void notExistsMDataInputTypeBList(SubQuery<MDataInputTypeBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepDataInputTypeId_NotExistsReferrer_MDataInputTypeBList(cb.query());
        registerNotExistsReferrer(cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", pp, "mDataInputTypeBList");
    }
    public abstract String keepDataInputTypeId_NotExistsReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq);

    public void xsderiveMDataInputTypeBList(String fn, SubQuery<MDataInputTypeBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepDataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", pp, "mDataInputTypeBList", al, op);
    }
    public abstract String keepDataInputTypeId_SpecifyDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from M_DATA_INPUT_TYPE_B where ...)} <br>
     * M_DATA_INPUT_TYPE_B by DATA_INPUT_TYPE_ID, named 'MDataInputTypeBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDataInputTypeBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDataInputTypeBCB> derivedMDataInputTypeBList() {
        return xcreateQDRFunctionMDataInputTypeBList();
    }
    protected HpQDRFunction<MDataInputTypeBCB> xcreateQDRFunctionMDataInputTypeBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDataInputTypeBList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDataInputTypeBList(String fn, SubQuery<MDataInputTypeBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeBCB cb = new MDataInputTypeBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList(cb.query()); String prpp = keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "DATA_INPUT_TYPE_ID", "DATA_INPUT_TYPE_ID", sqpp, "mDataInputTypeBList", rd, vl, prpp, op);
    }
    public abstract String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBList(MDataInputTypeBCQ sq);
    public abstract String keepDataInputTypeId_QueryDerivedReferrer_MDataInputTypeBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDataInputTypeId_IsNull() { regDataInputTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setDataInputTypeId_IsNotNull() { regDataInputTypeId(CK_ISNN, DOBJ); }

    protected void regDataInputTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataInputTypeId(), "DATA_INPUT_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueDataInputTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @param dataInputTypeCd The value of dataInputTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_Equal(String dataInputTypeCd) {
        doSetDataInputTypeCd_Equal(fRES(dataInputTypeCd));
    }

    /**
     * Equal(=). As DataInputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType cdef) {
        doSetDataInputTypeCd_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 商品マスタ取込
     */
    public void setDataInputTypeCd_Equal_$01() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$01);
    }

    /**
     * Equal(=). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 商品荷姿マスタ取込
     */
    public void setDataInputTypeCd_Equal_$02() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$02);
    }

    /**
     * Equal(=). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 取引先マスタ取込
     */
    public void setDataInputTypeCd_Equal_$03() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$03);
    }

    /**
     * Equal(=). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: ロケーションマスタ取込
     */
    public void setDataInputTypeCd_Equal_$04() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$04);
    }

    /**
     * Equal(=). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 在庫データ取込
     */
    public void setDataInputTypeCd_Equal_$05() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$05);
    }

    /**
     * Equal(=). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 着店マスタ取込(ヤマト運輸)
     */
    public void setDataInputTypeCd_Equal_$06() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$06);
    }

    /**
     * Equal(=). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 着店マスタ取込(日本郵政)
     */
    public void setDataInputTypeCd_Equal_$07() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$07);
    }

    /**
     * Equal(=). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 郵便番号マスタ取込
     */
    public void setDataInputTypeCd_Equal_$08() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$08);
    }

    /**
     * Equal(=). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 郵便番号マスタ(大口事業所)取込
     */
    public void setDataInputTypeCd_Equal_$09() {
        setDataInputTypeCd_Equal_AsDataInputType(CDef.DataInputType.$09);
    }

    protected void doSetDataInputTypeCd_Equal(String dataInputTypeCd) {
        regDataInputTypeCd(CK_EQ, dataInputTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @param dataInputTypeCd The value of dataInputTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_NotEqual(String dataInputTypeCd) {
        doSetDataInputTypeCd_NotEqual(fRES(dataInputTypeCd));
    }

    /**
     * NotEqual(&lt;&gt;). As DataInputType. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType cdef) {
        doSetDataInputTypeCd_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $01 (01). And OnlyOnceRegistered. <br>
     * $01: 商品マスタ取込
     */
    public void setDataInputTypeCd_NotEqual_$01() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$01);
    }

    /**
     * NotEqual(&lt;&gt;). As $02 (02). And OnlyOnceRegistered. <br>
     * $02: 商品荷姿マスタ取込
     */
    public void setDataInputTypeCd_NotEqual_$02() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$02);
    }

    /**
     * NotEqual(&lt;&gt;). As $03 (03). And OnlyOnceRegistered. <br>
     * $03: 取引先マスタ取込
     */
    public void setDataInputTypeCd_NotEqual_$03() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$03);
    }

    /**
     * NotEqual(&lt;&gt;). As $04 (04). And OnlyOnceRegistered. <br>
     * $04: ロケーションマスタ取込
     */
    public void setDataInputTypeCd_NotEqual_$04() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$04);
    }

    /**
     * NotEqual(&lt;&gt;). As $05 (05). And OnlyOnceRegistered. <br>
     * $05: 在庫データ取込
     */
    public void setDataInputTypeCd_NotEqual_$05() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$05);
    }

    /**
     * NotEqual(&lt;&gt;). As $06 (06). And OnlyOnceRegistered. <br>
     * $06: 着店マスタ取込(ヤマト運輸)
     */
    public void setDataInputTypeCd_NotEqual_$06() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$06);
    }

    /**
     * NotEqual(&lt;&gt;). As $07 (07). And OnlyOnceRegistered. <br>
     * $07: 着店マスタ取込(日本郵政)
     */
    public void setDataInputTypeCd_NotEqual_$07() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$07);
    }

    /**
     * NotEqual(&lt;&gt;). As $08 (08). And OnlyOnceRegistered. <br>
     * $08: 郵便番号マスタ取込
     */
    public void setDataInputTypeCd_NotEqual_$08() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$08);
    }

    /**
     * NotEqual(&lt;&gt;). As $09 (09). And OnlyOnceRegistered. <br>
     * $09: 郵便番号マスタ(大口事業所)取込
     */
    public void setDataInputTypeCd_NotEqual_$09() {
        setDataInputTypeCd_NotEqual_AsDataInputType(CDef.DataInputType.$09);
    }

    protected void doSetDataInputTypeCd_NotEqual(String dataInputTypeCd) {
        regDataInputTypeCd(CK_NES, dataInputTypeCd);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @param dataInputTypeCdList The collection of dataInputTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_InScope(Collection<String> dataInputTypeCdList) {
        doSetDataInputTypeCd_InScope(dataInputTypeCdList);
    }

    /**
     * InScope {in ('a', 'b')}. As DataInputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_InScope_AsDataInputType(Collection<CDef.DataInputType> cdefList) {
        doSetDataInputTypeCd_InScope(cTStrL(cdefList));
    }

    protected void doSetDataInputTypeCd_InScope(Collection<String> dataInputTypeCdList) {
        regINS(CK_INS, cTL(dataInputTypeCdList), xgetCValueDataInputTypeCd(), "DATA_INPUT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType}
     * @param dataInputTypeCdList The collection of dataInputTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_NotInScope(Collection<String> dataInputTypeCdList) {
        doSetDataInputTypeCd_NotInScope(dataInputTypeCdList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DataInputType. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_CD: {IX, NotNull, varchar(30), FK to B_CLASS_DTL, classification=DataInputType} <br>
     * 取込種類
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeCd_NotInScope_AsDataInputType(Collection<CDef.DataInputType> cdefList) {
        doSetDataInputTypeCd_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDataInputTypeCd_NotInScope(Collection<String> dataInputTypeCdList) {
        regINS(CK_NINS, cTL(dataInputTypeCdList), xgetCValueDataInputTypeCd(), "DATA_INPUT_TYPE_CD");
    }

    protected void regDataInputTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataInputTypeCd(), "DATA_INPUT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDataInputTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_Equal(String dataInputTypeNm) {
        doSetDataInputTypeNm_Equal(fRES(dataInputTypeNm));
    }

    protected void doSetDataInputTypeNm_Equal(String dataInputTypeNm) {
        regDataInputTypeNm(CK_EQ, dataInputTypeNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_NotEqual(String dataInputTypeNm) {
        doSetDataInputTypeNm_NotEqual(fRES(dataInputTypeNm));
    }

    protected void doSetDataInputTypeNm_NotEqual(String dataInputTypeNm) {
        regDataInputTypeNm(CK_NES, dataInputTypeNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_GreaterThan(String dataInputTypeNm) {
        regDataInputTypeNm(CK_GT, fRES(dataInputTypeNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_LessThan(String dataInputTypeNm) {
        regDataInputTypeNm(CK_LT, fRES(dataInputTypeNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_GreaterEqual(String dataInputTypeNm) {
        regDataInputTypeNm(CK_GE, fRES(dataInputTypeNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_LessEqual(String dataInputTypeNm) {
        regDataInputTypeNm(CK_LE, fRES(dataInputTypeNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNmList The collection of dataInputTypeNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_InScope(Collection<String> dataInputTypeNmList) {
        doSetDataInputTypeNm_InScope(dataInputTypeNmList);
    }

    protected void doSetDataInputTypeNm_InScope(Collection<String> dataInputTypeNmList) {
        regINS(CK_INS, cTL(dataInputTypeNmList), xgetCValueDataInputTypeNm(), "DATA_INPUT_TYPE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNmList The collection of dataInputTypeNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_NotInScope(Collection<String> dataInputTypeNmList) {
        doSetDataInputTypeNm_NotInScope(dataInputTypeNmList);
    }

    protected void doSetDataInputTypeNm_NotInScope(Collection<String> dataInputTypeNmList) {
        regINS(CK_NINS, cTL(dataInputTypeNmList), xgetCValueDataInputTypeNm(), "DATA_INPUT_TYPE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)} <br>
     * <pre>e.g. setDataInputTypeNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataInputTypeNm The value of dataInputTypeNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataInputTypeNm_LikeSearch(String dataInputTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataInputTypeNm), xgetCValueDataInputTypeNm(), "DATA_INPUT_TYPE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataInputTypeNm_NotLikeSearch(String dataInputTypeNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataInputTypeNm), xgetCValueDataInputTypeNm(), "DATA_INPUT_TYPE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_INPUT_TYPE_NM: {NotNull, varchar(60)}
     * @param dataInputTypeNm The value of dataInputTypeNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataInputTypeNm_PrefixSearch(String dataInputTypeNm) {
        setDataInputTypeNm_LikeSearch(dataInputTypeNm, xcLSOPPre());
    }

    protected void regDataInputTypeNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataInputTypeNm(), "DATA_INPUT_TYPE_NM"); }
    protected abstract ConditionValue xgetCValueDataInputTypeNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_Equal(String characterCd) {
        doSetCharacterCd_Equal(fRES(characterCd));
    }

    protected void doSetCharacterCd_Equal(String characterCd) {
        regCharacterCd(CK_EQ, characterCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotEqual(String characterCd) {
        doSetCharacterCd_NotEqual(fRES(characterCd));
    }

    protected void doSetCharacterCd_NotEqual(String characterCd) {
        regCharacterCd(CK_NES, characterCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_GreaterThan(String characterCd) {
        regCharacterCd(CK_GT, fRES(characterCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_LessThan(String characterCd) {
        regCharacterCd(CK_LT, fRES(characterCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_GreaterEqual(String characterCd) {
        regCharacterCd(CK_GE, fRES(characterCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_LessEqual(String characterCd) {
        regCharacterCd(CK_LE, fRES(characterCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCdList The collection of characterCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_InScope(Collection<String> characterCdList) {
        doSetCharacterCd_InScope(characterCdList);
    }

    protected void doSetCharacterCd_InScope(Collection<String> characterCdList) {
        regINS(CK_INS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCdList The collection of characterCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_NotInScope(Collection<String> characterCdList) {
        doSetCharacterCd_NotInScope(characterCdList);
    }

    protected void doSetCharacterCd_NotInScope(Collection<String> characterCdList) {
        regINS(CK_NINS, cTL(characterCdList), xgetCValueCharacterCd(), "CHARACTER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)} <br>
     * <pre>e.g. setCharacterCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param characterCd The value of characterCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCharacterCd_LikeSearch(String characterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(characterCd), xgetCValueCharacterCd(), "CHARACTER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCharacterCd_NotLikeSearch(String characterCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(characterCd), xgetCValueCharacterCd(), "CHARACTER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     * @param characterCd The value of characterCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCharacterCd_PrefixSearch(String characterCd) {
        setCharacterCd_LikeSearch(characterCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNull() { regCharacterCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNullOrEmpty() { regCharacterCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CHARACTER_CD: {varchar(30)}
     */
    public void setCharacterCd_IsNotNull() { regCharacterCd(CK_ISNN, DOBJ); }

    protected void regCharacterCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCharacterCd(), "CHARACTER_CD"); }
    protected abstract ConditionValue xgetCValueCharacterCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_Equal(String lineFeedCd) {
        doSetLineFeedCd_Equal(fRES(lineFeedCd));
    }

    protected void doSetLineFeedCd_Equal(String lineFeedCd) {
        regLineFeedCd(CK_EQ, lineFeedCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotEqual(String lineFeedCd) {
        doSetLineFeedCd_NotEqual(fRES(lineFeedCd));
    }

    protected void doSetLineFeedCd_NotEqual(String lineFeedCd) {
        regLineFeedCd(CK_NES, lineFeedCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_GreaterThan(String lineFeedCd) {
        regLineFeedCd(CK_GT, fRES(lineFeedCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_LessThan(String lineFeedCd) {
        regLineFeedCd(CK_LT, fRES(lineFeedCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_GreaterEqual(String lineFeedCd) {
        regLineFeedCd(CK_GE, fRES(lineFeedCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_LessEqual(String lineFeedCd) {
        regLineFeedCd(CK_LE, fRES(lineFeedCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCdList The collection of lineFeedCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_InScope(Collection<String> lineFeedCdList) {
        doSetLineFeedCd_InScope(lineFeedCdList);
    }

    protected void doSetLineFeedCd_InScope(Collection<String> lineFeedCdList) {
        regINS(CK_INS, cTL(lineFeedCdList), xgetCValueLineFeedCd(), "LINE_FEED_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCdList The collection of lineFeedCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_NotInScope(Collection<String> lineFeedCdList) {
        doSetLineFeedCd_NotInScope(lineFeedCdList);
    }

    protected void doSetLineFeedCd_NotInScope(Collection<String> lineFeedCdList) {
        regINS(CK_NINS, cTL(lineFeedCdList), xgetCValueLineFeedCd(), "LINE_FEED_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30)} <br>
     * <pre>e.g. setLineFeedCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lineFeedCd The value of lineFeedCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLineFeedCd_LikeSearch(String lineFeedCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lineFeedCd), xgetCValueLineFeedCd(), "LINE_FEED_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLineFeedCd_NotLikeSearch(String lineFeedCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lineFeedCd), xgetCValueLineFeedCd(), "LINE_FEED_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     * @param lineFeedCd The value of lineFeedCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLineFeedCd_PrefixSearch(String lineFeedCd) {
        setLineFeedCd_LikeSearch(lineFeedCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     */
    public void setLineFeedCd_IsNull() { regLineFeedCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     */
    public void setLineFeedCd_IsNullOrEmpty() { regLineFeedCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LINE_FEED_CD: {varchar(30)}
     */
    public void setLineFeedCd_IsNotNull() { regLineFeedCd(CK_ISNN, DOBJ); }

    protected void regLineFeedCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLineFeedCd(), "LINE_FEED_CD"); }
    protected abstract ConditionValue xgetCValueLineFeedCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_Equal(String delimiter) {
        doSetDelimiter_Equal(fRES(delimiter));
    }

    protected void doSetDelimiter_Equal(String delimiter) {
        regDelimiter(CK_EQ, delimiter);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_NotEqual(String delimiter) {
        doSetDelimiter_NotEqual(fRES(delimiter));
    }

    protected void doSetDelimiter_NotEqual(String delimiter) {
        regDelimiter(CK_NES, delimiter);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_GreaterThan(String delimiter) {
        regDelimiter(CK_GT, fRES(delimiter));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_LessThan(String delimiter) {
        regDelimiter(CK_LT, fRES(delimiter));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_GreaterEqual(String delimiter) {
        regDelimiter(CK_GE, fRES(delimiter));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_LessEqual(String delimiter) {
        regDelimiter(CK_LE, fRES(delimiter));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiterList The collection of delimiter as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_InScope(Collection<String> delimiterList) {
        doSetDelimiter_InScope(delimiterList);
    }

    protected void doSetDelimiter_InScope(Collection<String> delimiterList) {
        regINS(CK_INS, cTL(delimiterList), xgetCValueDelimiter(), "DELIMITER");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiterList The collection of delimiter as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_NotInScope(Collection<String> delimiterList) {
        doSetDelimiter_NotInScope(delimiterList);
    }

    protected void doSetDelimiter_NotInScope(Collection<String> delimiterList) {
        regINS(CK_NINS, cTL(delimiterList), xgetCValueDelimiter(), "DELIMITER");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)} <br>
     * <pre>e.g. setDelimiter_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delimiter The value of delimiter as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelimiter_LikeSearch(String delimiter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delimiter), xgetCValueDelimiter(), "DELIMITER", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelimiter_NotLikeSearch(String delimiter, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delimiter), xgetCValueDelimiter(), "DELIMITER", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIMITER: {varchar(30)}
     * @param delimiter The value of delimiter as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelimiter_PrefixSearch(String delimiter) {
        setDelimiter_LikeSearch(delimiter, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNull() { regDelimiter(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNullOrEmpty() { regDelimiter(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIMITER: {varchar(30)}
     */
    public void setDelimiter_IsNotNull() { regDelimiter(CK_ISNN, DOBJ); }

    protected void regDelimiter(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelimiter(), "DELIMITER"); }
    protected abstract ConditionValue xgetCValueDelimiter();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_Equal(Long skippingRows) {
        doSetSkippingRows_Equal(skippingRows);
    }

    protected void doSetSkippingRows_Equal(Long skippingRows) {
        regSkippingRows(CK_EQ, skippingRows);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_NotEqual(Long skippingRows) {
        doSetSkippingRows_NotEqual(skippingRows);
    }

    protected void doSetSkippingRows_NotEqual(Long skippingRows) {
        regSkippingRows(CK_NES, skippingRows);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_GreaterThan(Long skippingRows) {
        regSkippingRows(CK_GT, skippingRows);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_LessThan(Long skippingRows) {
        regSkippingRows(CK_LT, skippingRows);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_GreaterEqual(Long skippingRows) {
        regSkippingRows(CK_GE, skippingRows);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRows The value of skippingRows as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSkippingRows_LessEqual(Long skippingRows) {
        regSkippingRows(CK_LE, skippingRows);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param minNumber The min number of skippingRows. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of skippingRows. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSkippingRows_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSkippingRows(), "SKIPPING_ROWS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRowsList The collection of skippingRows as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkippingRows_InScope(Collection<Long> skippingRowsList) {
        doSetSkippingRows_InScope(skippingRowsList);
    }

    protected void doSetSkippingRows_InScope(Collection<Long> skippingRowsList) {
        regINS(CK_INS, cTL(skippingRowsList), xgetCValueSkippingRows(), "SKIPPING_ROWS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     * @param skippingRowsList The collection of skippingRows as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSkippingRows_NotInScope(Collection<Long> skippingRowsList) {
        doSetSkippingRows_NotInScope(skippingRowsList);
    }

    protected void doSetSkippingRows_NotInScope(Collection<Long> skippingRowsList) {
        regINS(CK_NINS, cTL(skippingRowsList), xgetCValueSkippingRows(), "SKIPPING_ROWS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     */
    public void setSkippingRows_IsNull() { regSkippingRows(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SKIPPING_ROWS: {bigint(19)}
     */
    public void setSkippingRows_IsNotNull() { regSkippingRows(CK_ISNN, DOBJ); }

    protected void regSkippingRows(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSkippingRows(), "SKIPPING_ROWS"); }
    protected abstract ConditionValue xgetCValueSkippingRows();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_Equal(String uploadTableNm) {
        doSetUploadTableNm_Equal(fRES(uploadTableNm));
    }

    protected void doSetUploadTableNm_Equal(String uploadTableNm) {
        regUploadTableNm(CK_EQ, uploadTableNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotEqual(String uploadTableNm) {
        doSetUploadTableNm_NotEqual(fRES(uploadTableNm));
    }

    protected void doSetUploadTableNm_NotEqual(String uploadTableNm) {
        regUploadTableNm(CK_NES, uploadTableNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_GreaterThan(String uploadTableNm) {
        regUploadTableNm(CK_GT, fRES(uploadTableNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_LessThan(String uploadTableNm) {
        regUploadTableNm(CK_LT, fRES(uploadTableNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_GreaterEqual(String uploadTableNm) {
        regUploadTableNm(CK_GE, fRES(uploadTableNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_LessEqual(String uploadTableNm) {
        regUploadTableNm(CK_LE, fRES(uploadTableNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNmList The collection of uploadTableNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_InScope(Collection<String> uploadTableNmList) {
        doSetUploadTableNm_InScope(uploadTableNmList);
    }

    protected void doSetUploadTableNm_InScope(Collection<String> uploadTableNmList) {
        regINS(CK_INS, cTL(uploadTableNmList), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNmList The collection of uploadTableNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_NotInScope(Collection<String> uploadTableNmList) {
        doSetUploadTableNm_NotInScope(uploadTableNmList);
    }

    protected void doSetUploadTableNm_NotInScope(Collection<String> uploadTableNmList) {
        regINS(CK_NINS, cTL(uploadTableNmList), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)} <br>
     * <pre>e.g. setUploadTableNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uploadTableNm The value of uploadTableNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUploadTableNm_LikeSearch(String uploadTableNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uploadTableNm), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUploadTableNm_NotLikeSearch(String uploadTableNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uploadTableNm), xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UPLOAD_TABLE_NM: {NotNull, varchar(100)}
     * @param uploadTableNm The value of uploadTableNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUploadTableNm_PrefixSearch(String uploadTableNm) {
        setUploadTableNm_LikeSearch(uploadTableNm, xcLSOPPre());
    }

    protected void regUploadTableNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUploadTableNm(), "UPLOAD_TABLE_NM"); }
    protected abstract ConditionValue xgetCValueUploadTableNm();

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
    public HpSLCFunction<MDataInputTypeCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MDataInputTypeCB.class);
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
    public HpSLCFunction<MDataInputTypeCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MDataInputTypeCB.class);
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
    public HpSLCFunction<MDataInputTypeCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MDataInputTypeCB.class);
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
    public HpSLCFunction<MDataInputTypeCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MDataInputTypeCB.class);
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
    public HpSLCFunction<MDataInputTypeCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MDataInputTypeCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MDataInputTypeCB&gt;() {
     *     public void query(MDataInputTypeCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MDataInputTypeCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MDataInputTypeCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MDataInputTypeCQ sq);

    protected MDataInputTypeCB xcreateScalarConditionCB() {
        MDataInputTypeCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MDataInputTypeCB xcreateScalarConditionPartitionByCB() {
        MDataInputTypeCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MDataInputTypeCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeCB cb = new MDataInputTypeCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "DATA_INPUT_TYPE_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MDataInputTypeCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MDataInputTypeCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MDataInputTypeCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDataInputTypeCB cb = new MDataInputTypeCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "DATA_INPUT_TYPE_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MDataInputTypeCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MDataInputTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDataInputTypeCB cb = new MDataInputTypeCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MDataInputTypeCQ sq);

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
    protected MDataInputTypeCB newMyCB() {
        return new MDataInputTypeCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MDataInputTypeCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
