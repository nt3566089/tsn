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
 * The abstract condition-query of E_SYMBOL_PASTE_RECORD.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsESymbolPasteRecordCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsESymbolPasteRecordCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "E_SYMBOL_PASTE_RECORD";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_Equal(Long eSymbolPasteRecordId) {
        doSetESymbolPasteRecordId_Equal(eSymbolPasteRecordId);
    }

    protected void doSetESymbolPasteRecordId_Equal(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_EQ, eSymbolPasteRecordId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_NotEqual(Long eSymbolPasteRecordId) {
        doSetESymbolPasteRecordId_NotEqual(eSymbolPasteRecordId);
    }

    protected void doSetESymbolPasteRecordId_NotEqual(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_NES, eSymbolPasteRecordId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_GreaterThan(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_GT, eSymbolPasteRecordId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_LessThan(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_LT, eSymbolPasteRecordId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_GreaterEqual(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_GE, eSymbolPasteRecordId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordId The value of eSymbolPasteRecordId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_LessEqual(Long eSymbolPasteRecordId) {
        regESymbolPasteRecordId(CK_LE, eSymbolPasteRecordId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param minNumber The min number of eSymbolPasteRecordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of eSymbolPasteRecordId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setESymbolPasteRecordId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueESymbolPasteRecordId(), "E_SYMBOL_PASTE_RECORD_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordIdList The collection of eSymbolPasteRecordId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_InScope(Collection<Long> eSymbolPasteRecordIdList) {
        doSetESymbolPasteRecordId_InScope(eSymbolPasteRecordIdList);
    }

    protected void doSetESymbolPasteRecordId_InScope(Collection<Long> eSymbolPasteRecordIdList) {
        regINS(CK_INS, cTL(eSymbolPasteRecordIdList), xgetCValueESymbolPasteRecordId(), "E_SYMBOL_PASTE_RECORD_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     * @param eSymbolPasteRecordIdList The collection of eSymbolPasteRecordId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setESymbolPasteRecordId_NotInScope(Collection<Long> eSymbolPasteRecordIdList) {
        doSetESymbolPasteRecordId_NotInScope(eSymbolPasteRecordIdList);
    }

    protected void doSetESymbolPasteRecordId_NotInScope(Collection<Long> eSymbolPasteRecordIdList) {
        regINS(CK_NINS, cTL(eSymbolPasteRecordIdList), xgetCValueESymbolPasteRecordId(), "E_SYMBOL_PASTE_RECORD_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setESymbolPasteRecordId_IsNull() { regESymbolPasteRecordId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * E_SYMBOL_PASTE_RECORD_ID: {PK, ID, NotNull, bigint identity(19)}
     */
    public void setESymbolPasteRecordId_IsNotNull() { regESymbolPasteRecordId(CK_ISNN, DOBJ); }

    protected void regESymbolPasteRecordId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueESymbolPasteRecordId(), "E_SYMBOL_PASTE_RECORD_ID"); }
    protected abstract ConditionValue xgetCValueESymbolPasteRecordId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_Equal(String receiveCd) {
        doSetReceiveCd_Equal(fRES(receiveCd));
    }

    protected void doSetReceiveCd_Equal(String receiveCd) {
        regReceiveCd(CK_EQ, receiveCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotEqual(String receiveCd) {
        doSetReceiveCd_NotEqual(fRES(receiveCd));
    }

    protected void doSetReceiveCd_NotEqual(String receiveCd) {
        regReceiveCd(CK_NES, receiveCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterThan(String receiveCd) {
        regReceiveCd(CK_GT, fRES(receiveCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessThan(String receiveCd) {
        regReceiveCd(CK_LT, fRES(receiveCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_GreaterEqual(String receiveCd) {
        regReceiveCd(CK_GE, fRES(receiveCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_LessEqual(String receiveCd) {
        regReceiveCd(CK_LE, fRES(receiveCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_InScope(Collection<String> receiveCdList) {
        doSetReceiveCd_InScope(receiveCdList);
    }

    protected void doSetReceiveCd_InScope(Collection<String> receiveCdList) {
        regINS(CK_INS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCdList The collection of receiveCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_NotInScope(Collection<String> receiveCdList) {
        doSetReceiveCd_NotInScope(receiveCdList);
    }

    protected void doSetReceiveCd_NotInScope(Collection<String> receiveCdList) {
        regINS(CK_NINS, cTL(receiveCdList), xgetCValueReceiveCd(), "RECEIVE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)} <br>
     * <pre>e.g. setReceiveCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveCd The value of receiveCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveCd_LikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveCd_NotLikeSearch(String receiveCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveCd), xgetCValueReceiveCd(), "RECEIVE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_CD: {NotNull, varchar(30)}
     * @param receiveCd The value of receiveCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveCd_PrefixSearch(String receiveCd) {
        setReceiveCd_LikeSearch(receiveCd, xcLSOPPre());
    }

    protected void regReceiveCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveCd(), "RECEIVE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_Equal(Long receiveRowId) {
        doSetReceiveRowId_Equal(receiveRowId);
    }

    protected void doSetReceiveRowId_Equal(Long receiveRowId) {
        regReceiveRowId(CK_EQ, receiveRowId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotEqual(Long receiveRowId) {
        doSetReceiveRowId_NotEqual(receiveRowId);
    }

    protected void doSetReceiveRowId_NotEqual(Long receiveRowId) {
        regReceiveRowId(CK_NES, receiveRowId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterThan(Long receiveRowId) {
        regReceiveRowId(CK_GT, receiveRowId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessThan(Long receiveRowId) {
        regReceiveRowId(CK_LT, receiveRowId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_GreaterEqual(Long receiveRowId) {
        regReceiveRowId(CK_GE, receiveRowId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowId The value of receiveRowId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveRowId_LessEqual(Long receiveRowId) {
        regReceiveRowId(CK_LE, receiveRowId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param minNumber The min number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveRowId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveRowId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_InScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_InScope(Collection<Long> receiveRowIdList) {
        regINS(CK_INS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_ROW_ID: {NotNull, bigint(19)}
     * @param receiveRowIdList The collection of receiveRowId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        doSetReceiveRowId_NotInScope(receiveRowIdList);
    }

    protected void doSetReceiveRowId_NotInScope(Collection<Long> receiveRowIdList) {
        regINS(CK_NINS, cTL(receiveRowIdList), xgetCValueReceiveRowId(), "RECEIVE_ROW_ID");
    }

    protected void regReceiveRowId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRowId(), "RECEIVE_ROW_ID"); }
    protected abstract ConditionValue xgetCValueReceiveRowId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_Equal(String importFlg) {
        doSetImportFlg_Equal(fRES(importFlg));
    }

    protected void doSetImportFlg_Equal(String importFlg) {
        regImportFlg(CK_EQ, importFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotEqual(String importFlg) {
        doSetImportFlg_NotEqual(fRES(importFlg));
    }

    protected void doSetImportFlg_NotEqual(String importFlg) {
        regImportFlg(CK_NES, importFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterThan(String importFlg) {
        regImportFlg(CK_GT, fRES(importFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessThan(String importFlg) {
        regImportFlg(CK_LT, fRES(importFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_GreaterEqual(String importFlg) {
        regImportFlg(CK_GE, fRES(importFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_LessEqual(String importFlg) {
        regImportFlg(CK_LE, fRES(importFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_InScope(Collection<String> importFlgList) {
        doSetImportFlg_InScope(importFlgList);
    }

    protected void doSetImportFlg_InScope(Collection<String> importFlgList) {
        regINS(CK_INS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlgList The collection of importFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_NotInScope(Collection<String> importFlgList) {
        doSetImportFlg_NotInScope(importFlgList);
    }

    protected void doSetImportFlg_NotInScope(Collection<String> importFlgList) {
        regINS(CK_NINS, cTL(importFlgList), xgetCValueImportFlg(), "IMPORT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setImportFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param importFlg The value of importFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setImportFlg_LikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setImportFlg_NotLikeSearch(String importFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(importFlg), xgetCValueImportFlg(), "IMPORT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * IMPORT_FLG: {NotNull, char(1), default=[0]}
     * @param importFlg The value of importFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setImportFlg_PrefixSearch(String importFlg) {
        setImportFlg_LikeSearch(importFlg, xcLSOPPre());
    }

    protected void regImportFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueImportFlg(), "IMPORT_FLG"); }
    protected abstract ConditionValue xgetCValueImportFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {NotNull, char(1), default=[0]}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {varchar(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_Equal(String rcvKey) {
        doSetRcvKey_Equal(fRES(rcvKey));
    }

    protected void doSetRcvKey_Equal(String rcvKey) {
        regRcvKey(CK_EQ, rcvKey);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_NotEqual(String rcvKey) {
        doSetRcvKey_NotEqual(fRES(rcvKey));
    }

    protected void doSetRcvKey_NotEqual(String rcvKey) {
        regRcvKey(CK_NES, rcvKey);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_GreaterThan(String rcvKey) {
        regRcvKey(CK_GT, fRES(rcvKey));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_LessThan(String rcvKey) {
        regRcvKey(CK_LT, fRES(rcvKey));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_GreaterEqual(String rcvKey) {
        regRcvKey(CK_GE, fRES(rcvKey));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_LessEqual(String rcvKey) {
        regRcvKey(CK_LE, fRES(rcvKey));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKeyList The collection of rcvKey as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_InScope(Collection<String> rcvKeyList) {
        doSetRcvKey_InScope(rcvKeyList);
    }

    protected void doSetRcvKey_InScope(Collection<String> rcvKeyList) {
        regINS(CK_INS, cTL(rcvKeyList), xgetCValueRcvKey(), "RCV_KEY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKeyList The collection of rcvKey as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_NotInScope(Collection<String> rcvKeyList) {
        doSetRcvKey_NotInScope(rcvKeyList);
    }

    protected void doSetRcvKey_NotInScope(Collection<String> rcvKeyList) {
        regINS(CK_NINS, cTL(rcvKeyList), xgetCValueRcvKey(), "RCV_KEY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_KEY: {varchar(255)} <br>
     * <pre>e.g. setRcvKey_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param rcvKey The value of rcvKey as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRcvKey_LikeSearch(String rcvKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(rcvKey), xgetCValueRcvKey(), "RCV_KEY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRcvKey_NotLikeSearch(String rcvKey, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(rcvKey), xgetCValueRcvKey(), "RCV_KEY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RCV_KEY: {varchar(255)}
     * @param rcvKey The value of rcvKey as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvKey_PrefixSearch(String rcvKey) {
        setRcvKey_LikeSearch(rcvKey, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     */
    public void setRcvKey_IsNull() { regRcvKey(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     */
    public void setRcvKey_IsNullOrEmpty() { regRcvKey(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCV_KEY: {varchar(255)}
     */
    public void setRcvKey_IsNotNull() { regRcvKey(CK_ISNN, DOBJ); }

    protected void regRcvKey(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvKey(), "RCV_KEY"); }
    protected abstract ConditionValue xgetCValueRcvKey();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)}
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
     * PRODUCT_CD: {varchar(255)} <br>
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
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {varchar(255)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_Equal(String firmtransportNo) {
        doSetFirmtransportNo_Equal(fRES(firmtransportNo));
    }

    protected void doSetFirmtransportNo_Equal(String firmtransportNo) {
        regFirmtransportNo(CK_EQ, firmtransportNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_NotEqual(String firmtransportNo) {
        doSetFirmtransportNo_NotEqual(fRES(firmtransportNo));
    }

    protected void doSetFirmtransportNo_NotEqual(String firmtransportNo) {
        regFirmtransportNo(CK_NES, firmtransportNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_GreaterThan(String firmtransportNo) {
        regFirmtransportNo(CK_GT, fRES(firmtransportNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_LessThan(String firmtransportNo) {
        regFirmtransportNo(CK_LT, fRES(firmtransportNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_GreaterEqual(String firmtransportNo) {
        regFirmtransportNo(CK_GE, fRES(firmtransportNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_LessEqual(String firmtransportNo) {
        regFirmtransportNo(CK_LE, fRES(firmtransportNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNoList The collection of firmtransportNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_InScope(Collection<String> firmtransportNoList) {
        doSetFirmtransportNo_InScope(firmtransportNoList);
    }

    protected void doSetFirmtransportNo_InScope(Collection<String> firmtransportNoList) {
        regINS(CK_INS, cTL(firmtransportNoList), xgetCValueFirmtransportNo(), "FIRMTRANSPORT_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNoList The collection of firmtransportNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_NotInScope(Collection<String> firmtransportNoList) {
        doSetFirmtransportNo_NotInScope(firmtransportNoList);
    }

    protected void doSetFirmtransportNo_NotInScope(Collection<String> firmtransportNoList) {
        regINS(CK_NINS, cTL(firmtransportNoList), xgetCValueFirmtransportNo(), "FIRMTRANSPORT_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)} <br>
     * <pre>e.g. setFirmtransportNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param firmtransportNo The value of firmtransportNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFirmtransportNo_LikeSearch(String firmtransportNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(firmtransportNo), xgetCValueFirmtransportNo(), "FIRMTRANSPORT_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFirmtransportNo_NotLikeSearch(String firmtransportNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(firmtransportNo), xgetCValueFirmtransportNo(), "FIRMTRANSPORT_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     * @param firmtransportNo The value of firmtransportNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFirmtransportNo_PrefixSearch(String firmtransportNo) {
        setFirmtransportNo_LikeSearch(firmtransportNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     */
    public void setFirmtransportNo_IsNull() { regFirmtransportNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     */
    public void setFirmtransportNo_IsNullOrEmpty() { regFirmtransportNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FIRMTRANSPORT_NO: {varchar(255)}
     */
    public void setFirmtransportNo_IsNotNull() { regFirmtransportNo(CK_ISNN, DOBJ); }

    protected void regFirmtransportNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFirmtransportNo(), "FIRMTRANSPORT_NO"); }
    protected abstract ConditionValue xgetCValueFirmtransportNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_Equal(String manufacturDate) {
        doSetManufacturDate_Equal(fRES(manufacturDate));
    }

    protected void doSetManufacturDate_Equal(String manufacturDate) {
        regManufacturDate(CK_EQ, manufacturDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_NotEqual(String manufacturDate) {
        doSetManufacturDate_NotEqual(fRES(manufacturDate));
    }

    protected void doSetManufacturDate_NotEqual(String manufacturDate) {
        regManufacturDate(CK_NES, manufacturDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_GreaterThan(String manufacturDate) {
        regManufacturDate(CK_GT, fRES(manufacturDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_LessThan(String manufacturDate) {
        regManufacturDate(CK_LT, fRES(manufacturDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_GreaterEqual(String manufacturDate) {
        regManufacturDate(CK_GE, fRES(manufacturDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_LessEqual(String manufacturDate) {
        regManufacturDate(CK_LE, fRES(manufacturDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDateList The collection of manufacturDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_InScope(Collection<String> manufacturDateList) {
        doSetManufacturDate_InScope(manufacturDateList);
    }

    protected void doSetManufacturDate_InScope(Collection<String> manufacturDateList) {
        regINS(CK_INS, cTL(manufacturDateList), xgetCValueManufacturDate(), "MANUFACTUR_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDateList The collection of manufacturDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_NotInScope(Collection<String> manufacturDateList) {
        doSetManufacturDate_NotInScope(manufacturDateList);
    }

    protected void doSetManufacturDate_NotInScope(Collection<String> manufacturDateList) {
        regINS(CK_NINS, cTL(manufacturDateList), xgetCValueManufacturDate(), "MANUFACTUR_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)} <br>
     * <pre>e.g. setManufacturDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param manufacturDate The value of manufacturDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setManufacturDate_LikeSearch(String manufacturDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(manufacturDate), xgetCValueManufacturDate(), "MANUFACTUR_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setManufacturDate_NotLikeSearch(String manufacturDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(manufacturDate), xgetCValueManufacturDate(), "MANUFACTUR_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     * @param manufacturDate The value of manufacturDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setManufacturDate_PrefixSearch(String manufacturDate) {
        setManufacturDate_LikeSearch(manufacturDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     */
    public void setManufacturDate_IsNull() { regManufacturDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     */
    public void setManufacturDate_IsNullOrEmpty() { regManufacturDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MANUFACTUR_DATE: {varchar(255)}
     */
    public void setManufacturDate_IsNotNull() { regManufacturDate(CK_ISNN, DOBJ); }

    protected void regManufacturDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueManufacturDate(), "MANUFACTUR_DATE"); }
    protected abstract ConditionValue xgetCValueManufacturDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_Equal(String printerNo) {
        doSetPrinterNo_Equal(fRES(printerNo));
    }

    protected void doSetPrinterNo_Equal(String printerNo) {
        regPrinterNo(CK_EQ, printerNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_NotEqual(String printerNo) {
        doSetPrinterNo_NotEqual(fRES(printerNo));
    }

    protected void doSetPrinterNo_NotEqual(String printerNo) {
        regPrinterNo(CK_NES, printerNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_GreaterThan(String printerNo) {
        regPrinterNo(CK_GT, fRES(printerNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_LessThan(String printerNo) {
        regPrinterNo(CK_LT, fRES(printerNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_GreaterEqual(String printerNo) {
        regPrinterNo(CK_GE, fRES(printerNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_LessEqual(String printerNo) {
        regPrinterNo(CK_LE, fRES(printerNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNoList The collection of printerNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_InScope(Collection<String> printerNoList) {
        doSetPrinterNo_InScope(printerNoList);
    }

    protected void doSetPrinterNo_InScope(Collection<String> printerNoList) {
        regINS(CK_INS, cTL(printerNoList), xgetCValuePrinterNo(), "PRINTER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNoList The collection of printerNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_NotInScope(Collection<String> printerNoList) {
        doSetPrinterNo_NotInScope(printerNoList);
    }

    protected void doSetPrinterNo_NotInScope(Collection<String> printerNoList) {
        regINS(CK_NINS, cTL(printerNoList), xgetCValuePrinterNo(), "PRINTER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NO: {varchar(255)} <br>
     * <pre>e.g. setPrinterNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param printerNo The value of printerNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPrinterNo_LikeSearch(String printerNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(printerNo), xgetCValuePrinterNo(), "PRINTER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPrinterNo_NotLikeSearch(String printerNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(printerNo), xgetCValuePrinterNo(), "PRINTER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     * @param printerNo The value of printerNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPrinterNo_PrefixSearch(String printerNo) {
        setPrinterNo_LikeSearch(printerNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     */
    public void setPrinterNo_IsNull() { regPrinterNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     */
    public void setPrinterNo_IsNullOrEmpty() { regPrinterNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRINTER_NO: {varchar(255)}
     */
    public void setPrinterNo_IsNotNull() { regPrinterNo(CK_ISNN, DOBJ); }

    protected void regPrinterNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePrinterNo(), "PRINTER_NO"); }
    protected abstract ConditionValue xgetCValuePrinterNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_Equal(String makeNo) {
        doSetMakeNo_Equal(fRES(makeNo));
    }

    protected void doSetMakeNo_Equal(String makeNo) {
        regMakeNo(CK_EQ, makeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_NotEqual(String makeNo) {
        doSetMakeNo_NotEqual(fRES(makeNo));
    }

    protected void doSetMakeNo_NotEqual(String makeNo) {
        regMakeNo(CK_NES, makeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_GreaterThan(String makeNo) {
        regMakeNo(CK_GT, fRES(makeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_LessThan(String makeNo) {
        regMakeNo(CK_LT, fRES(makeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_GreaterEqual(String makeNo) {
        regMakeNo(CK_GE, fRES(makeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_LessEqual(String makeNo) {
        regMakeNo(CK_LE, fRES(makeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNoList The collection of makeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_InScope(Collection<String> makeNoList) {
        doSetMakeNo_InScope(makeNoList);
    }

    protected void doSetMakeNo_InScope(Collection<String> makeNoList) {
        regINS(CK_INS, cTL(makeNoList), xgetCValueMakeNo(), "MAKE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNoList The collection of makeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_NotInScope(Collection<String> makeNoList) {
        doSetMakeNo_NotInScope(makeNoList);
    }

    protected void doSetMakeNo_NotInScope(Collection<String> makeNoList) {
        regINS(CK_NINS, cTL(makeNoList), xgetCValueMakeNo(), "MAKE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKE_NO: {varchar(255)} <br>
     * <pre>e.g. setMakeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makeNo The value of makeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakeNo_LikeSearch(String makeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makeNo), xgetCValueMakeNo(), "MAKE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakeNo_NotLikeSearch(String makeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makeNo), xgetCValueMakeNo(), "MAKE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKE_NO: {varchar(255)}
     * @param makeNo The value of makeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakeNo_PrefixSearch(String makeNo) {
        setMakeNo_LikeSearch(makeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     */
    public void setMakeNo_IsNull() { regMakeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     */
    public void setMakeNo_IsNullOrEmpty() { regMakeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKE_NO: {varchar(255)}
     */
    public void setMakeNo_IsNotNull() { regMakeNo(CK_ISNN, DOBJ); }

    protected void regMakeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakeNo(), "MAKE_NO"); }
    protected abstract ConditionValue xgetCValueMakeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_Equal(String designCd) {
        doSetDesignCd_Equal(fRES(designCd));
    }

    protected void doSetDesignCd_Equal(String designCd) {
        regDesignCd(CK_EQ, designCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_NotEqual(String designCd) {
        doSetDesignCd_NotEqual(fRES(designCd));
    }

    protected void doSetDesignCd_NotEqual(String designCd) {
        regDesignCd(CK_NES, designCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterThan(String designCd) {
        regDesignCd(CK_GT, fRES(designCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessThan(String designCd) {
        regDesignCd(CK_LT, fRES(designCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_GreaterEqual(String designCd) {
        regDesignCd(CK_GE, fRES(designCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_LessEqual(String designCd) {
        regDesignCd(CK_LE, fRES(designCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCdList The collection of designCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_InScope(Collection<String> designCdList) {
        doSetDesignCd_InScope(designCdList);
    }

    protected void doSetDesignCd_InScope(Collection<String> designCdList) {
        regINS(CK_INS, cTL(designCdList), xgetCValueDesignCd(), "DESIGN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCdList The collection of designCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_NotInScope(Collection<String> designCdList) {
        doSetDesignCd_NotInScope(designCdList);
    }

    protected void doSetDesignCd_NotInScope(Collection<String> designCdList) {
        regINS(CK_NINS, cTL(designCdList), xgetCValueDesignCd(), "DESIGN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)} <br>
     * <pre>e.g. setDesignCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param designCd The value of designCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDesignCd_LikeSearch(String designCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(designCd), xgetCValueDesignCd(), "DESIGN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDesignCd_NotLikeSearch(String designCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(designCd), xgetCValueDesignCd(), "DESIGN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     * @param designCd The value of designCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDesignCd_PrefixSearch(String designCd) {
        setDesignCd_LikeSearch(designCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNull() { regDesignCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNullOrEmpty() { regDesignCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESIGN_CD: {varchar(255)}
     */
    public void setDesignCd_IsNotNull() { regDesignCd(CK_ISNN, DOBJ); }

    protected void regDesignCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDesignCd(), "DESIGN_CD"); }
    protected abstract ConditionValue xgetCValueDesignCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_Equal(String stockType) {
        doSetStockType_Equal(fRES(stockType));
    }

    protected void doSetStockType_Equal(String stockType) {
        regStockType(CK_EQ, stockType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_NotEqual(String stockType) {
        doSetStockType_NotEqual(fRES(stockType));
    }

    protected void doSetStockType_NotEqual(String stockType) {
        regStockType(CK_NES, stockType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_GreaterThan(String stockType) {
        regStockType(CK_GT, fRES(stockType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_LessThan(String stockType) {
        regStockType(CK_LT, fRES(stockType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_GreaterEqual(String stockType) {
        regStockType(CK_GE, fRES(stockType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_LessEqual(String stockType) {
        regStockType(CK_LE, fRES(stockType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockTypeList The collection of stockType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_InScope(Collection<String> stockTypeList) {
        doSetStockType_InScope(stockTypeList);
    }

    protected void doSetStockType_InScope(Collection<String> stockTypeList) {
        regINS(CK_INS, cTL(stockTypeList), xgetCValueStockType(), "STOCK_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockTypeList The collection of stockType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_NotInScope(Collection<String> stockTypeList) {
        doSetStockType_NotInScope(stockTypeList);
    }

    protected void doSetStockType_NotInScope(Collection<String> stockTypeList) {
        regINS(CK_NINS, cTL(stockTypeList), xgetCValueStockType(), "STOCK_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(255)} <br>
     * <pre>e.g. setStockType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockType The value of stockType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockType_LikeSearch(String stockType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockType), xgetCValueStockType(), "STOCK_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockType_NotLikeSearch(String stockType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockType), xgetCValueStockType(), "STOCK_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     * @param stockType The value of stockType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockType_PrefixSearch(String stockType) {
        setStockType_LikeSearch(stockType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     */
    public void setStockType_IsNull() { regStockType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     */
    public void setStockType_IsNullOrEmpty() { regStockType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TYPE: {varchar(255)}
     */
    public void setStockType_IsNotNull() { regStockType(CK_ISNN, DOBJ); }

    protected void regStockType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockType(), "STOCK_TYPE"); }
    protected abstract ConditionValue xgetCValueStockType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_Equal(String makerCaseNo) {
        doSetMakerCaseNo_Equal(fRES(makerCaseNo));
    }

    protected void doSetMakerCaseNo_Equal(String makerCaseNo) {
        regMakerCaseNo(CK_EQ, makerCaseNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_NotEqual(String makerCaseNo) {
        doSetMakerCaseNo_NotEqual(fRES(makerCaseNo));
    }

    protected void doSetMakerCaseNo_NotEqual(String makerCaseNo) {
        regMakerCaseNo(CK_NES, makerCaseNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_GreaterThan(String makerCaseNo) {
        regMakerCaseNo(CK_GT, fRES(makerCaseNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_LessThan(String makerCaseNo) {
        regMakerCaseNo(CK_LT, fRES(makerCaseNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_GreaterEqual(String makerCaseNo) {
        regMakerCaseNo(CK_GE, fRES(makerCaseNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_LessEqual(String makerCaseNo) {
        regMakerCaseNo(CK_LE, fRES(makerCaseNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNoList The collection of makerCaseNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_InScope(Collection<String> makerCaseNoList) {
        doSetMakerCaseNo_InScope(makerCaseNoList);
    }

    protected void doSetMakerCaseNo_InScope(Collection<String> makerCaseNoList) {
        regINS(CK_INS, cTL(makerCaseNoList), xgetCValueMakerCaseNo(), "MAKER_CASE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNoList The collection of makerCaseNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_NotInScope(Collection<String> makerCaseNoList) {
        doSetMakerCaseNo_NotInScope(makerCaseNoList);
    }

    protected void doSetMakerCaseNo_NotInScope(Collection<String> makerCaseNoList) {
        regINS(CK_NINS, cTL(makerCaseNoList), xgetCValueMakerCaseNo(), "MAKER_CASE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)} <br>
     * <pre>e.g. setMakerCaseNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param makerCaseNo The value of makerCaseNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setMakerCaseNo_LikeSearch(String makerCaseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(makerCaseNo), xgetCValueMakerCaseNo(), "MAKER_CASE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setMakerCaseNo_NotLikeSearch(String makerCaseNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(makerCaseNo), xgetCValueMakerCaseNo(), "MAKER_CASE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     * @param makerCaseNo The value of makerCaseNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMakerCaseNo_PrefixSearch(String makerCaseNo) {
        setMakerCaseNo_LikeSearch(makerCaseNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     */
    public void setMakerCaseNo_IsNull() { regMakerCaseNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     */
    public void setMakerCaseNo_IsNullOrEmpty() { regMakerCaseNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAKER_CASE_NO: {varchar(255)}
     */
    public void setMakerCaseNo_IsNotNull() { regMakerCaseNo(CK_ISNN, DOBJ); }

    protected void regMakerCaseNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMakerCaseNo(), "MAKER_CASE_NO"); }
    protected abstract ConditionValue xgetCValueMakerCaseNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg} <br>
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

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     */
    public void setDelFlg_IsNull() { regDelFlg(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEL_FLG: {char(1), default=[0], classification=DelFlg}
     */
    public void setDelFlg_IsNotNull() { regDelFlg(CK_ISNN, DOBJ); }

    protected void regDelFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelFlg(), "DEL_FLG"); }
    protected abstract ConditionValue xgetCValueDelFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
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
     * VERSION_NO: {bigint(19), default=[(0)]}
     * @param minNumber The min number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of versionNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setVersionNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueVersionNo(), "VERSION_NO", rangeOfOption);
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     */
    public void setVersionNo_IsNull() { regVersionNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VERSION_NO: {bigint(19), default=[(0)]}
     */
    public void setVersionNo_IsNotNull() { regVersionNo(CK_ISNN, DOBJ); }

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
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, ESymbolPasteRecordCB.class);
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
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, ESymbolPasteRecordCB.class);
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
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, ESymbolPasteRecordCB.class);
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
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, ESymbolPasteRecordCB.class);
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
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, ESymbolPasteRecordCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;ESymbolPasteRecordCB&gt;() {
     *     public void query(ESymbolPasteRecordCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<ESymbolPasteRecordCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, ESymbolPasteRecordCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        ESymbolPasteRecordCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(ESymbolPasteRecordCQ sq);

    protected ESymbolPasteRecordCB xcreateScalarConditionCB() {
        ESymbolPasteRecordCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected ESymbolPasteRecordCB xcreateScalarConditionPartitionByCB() {
        ESymbolPasteRecordCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<ESymbolPasteRecordCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ESymbolPasteRecordCB cb = new ESymbolPasteRecordCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "E_SYMBOL_PASTE_RECORD_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(ESymbolPasteRecordCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<ESymbolPasteRecordCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(ESymbolPasteRecordCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        ESymbolPasteRecordCB cb = new ESymbolPasteRecordCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "E_SYMBOL_PASTE_RECORD_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(ESymbolPasteRecordCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<ESymbolPasteRecordCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        ESymbolPasteRecordCB cb = new ESymbolPasteRecordCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(ESymbolPasteRecordCQ sq);

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
    protected ESymbolPasteRecordCB newMyCB() {
        return new ESymbolPasteRecordCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return ESymbolPasteRecordCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
